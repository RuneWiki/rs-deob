package org.bouncycastle.crypto.modes;

import java.util.Vector;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class OCBBlockCipher implements AEADBlockCipher {

    public byte[] KtopInput = null;

    public byte[] Stretch = new byte[24];

    public byte[] OffsetMAIN_0 = new byte[16];

    public byte[] OffsetMAIN = new byte[16];

    public BlockCipher hashCipher;

    public BlockCipher mainCipher;

    public static final int BLOCK_SIZE = 16;

    public int hashBlockPos;

    public int macSize;

    public int mainBlockPos;

    public long hashBlockCount;

    public long mainBlockCount;

    public Vector L;

    public boolean forEncryption;

    public byte[] Checksum;

    public byte[] L_Asterisk;

    public byte[] L_Dollar;

    public byte[] OffsetHASH;

    public byte[] Sum;

    public byte[] hashBlock;

    public byte[] initialAssociatedText;

    public byte[] macBlock;

    public byte[] mainBlock;

    public void updateHASH(byte[] arg0) {
        xor(this.OffsetHASH, arg0);
        xor(this.hashBlock, this.OffsetHASH);
        this.hashCipher.processBlock(this.hashBlock, 0, this.hashBlock, 0);
        xor(this.Sum, this.hashBlock);
    }

    public int getUpdateOutputSize(int arg0) {
        int var2 = this.mainBlockPos + arg0;
        if (!this.forEncryption) {
            if (var2 < this.macSize) {
                return 0;
            }
            var2 -= this.macSize;
        }
        return var2 - var2 % 16;
    }

    public void processMainBlock(byte[] arg0, int arg1) {
        if (arg0.length < arg1 + 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.forEncryption) {
            xor(this.Checksum, this.mainBlock);
            this.mainBlockPos = 0;
        }
        xor(this.OffsetMAIN, this.getLSub(OCB_ntz(++this.mainBlockCount)));
        xor(this.mainBlock, this.OffsetMAIN);
        this.mainCipher.processBlock(this.mainBlock, 0, this.mainBlock, 0);
        xor(this.mainBlock, this.OffsetMAIN);
        System.arraycopy(this.mainBlock, 0, arg0, arg1, 16);
        if (!this.forEncryption) {
            xor(this.Checksum, this.mainBlock);
            System.arraycopy(this.mainBlock, 16, this.mainBlock, 0, this.macSize);
            this.mainBlockPos = this.macSize;
        }
    }

    public void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException {
        boolean var3 = this.forEncryption;
        this.forEncryption = arg0;
        this.macBlock = null;
        byte[] var5;
        KeyParameter var7;
        if (arg1 instanceof AEADParameters) {
            AEADParameters var4 = (AEADParameters) arg1;
            var5 = var4.getNonce();
            this.initialAssociatedText = var4.getAssociatedText();
            int var6 = var4.getMacSize();
            if (var6 < 64 || var6 > 128 || var6 % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + var6);
            }
            this.macSize = var6 / 8;
            var7 = var4.getKey();
        } else if ((arg1 instanceof ParametersWithIV)) {
            ParametersWithIV var8 = (ParametersWithIV) arg1;
            var5 = var8.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            var7 = (KeyParameter) var8.getParameters();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to OCB");
        }
        this.hashBlock = new byte[16];
        this.mainBlock = new byte[arg0 ? 16 : this.macSize + 16];
        if (var5 == null) {
            var5 = new byte[0];
        }
        if (var5.length > 15) {
            throw new IllegalArgumentException("IV must be no more than 15 bytes");
        }
        if (var7 != null) {
            this.hashCipher.init(true, var7);
            this.mainCipher.init(arg0, var7);
            this.KtopInput = null;
        } else if (arg0 != var3) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
        this.L_Asterisk = new byte[16];
        this.hashCipher.processBlock(this.L_Asterisk, 0, this.L_Asterisk, 0);
        this.L_Dollar = OCB_double(this.L_Asterisk);
        this.L = new Vector();
        this.L.addElement(OCB_double(this.L_Dollar));
        int var9 = this.processNonce(var5);
        int var10 = var9 % 8;
        int var11 = var9 / 8;
        if (var10 == 0) {
            System.arraycopy(this.Stretch, var11, this.OffsetMAIN_0, 0, 16);
        } else {
            for (int var12 = 0; var12 < 16; var12++) {
                int var13 = this.Stretch[var11] & 0xFF;
                var11++;
                int var14 = this.Stretch[var11] & 0xFF;
                this.OffsetMAIN_0[var12] = (byte) (var13 << var10 | var14 >>> 8 - var10);
            }
        }
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        this.OffsetHASH = new byte[16];
        this.Sum = new byte[16];
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        this.Checksum = new byte[16];
        if (this.initialAssociatedText != null) {
            this.processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length);
        }
    }

    public int processNonce(byte[] arg0) {
        byte[] var2 = new byte[16];
        System.arraycopy(arg0, 0, var2, var2.length - arg0.length, arg0.length);
        var2[0] = (byte) (this.macSize << 4);
        var2[15 - arg0.length] = (byte) (var2[15 - arg0.length] | 0x1);
        int var3 = var2[15] & 0x3F;
        var2[15] = (byte) (var2[15] & 0xC0);
        if (this.KtopInput == null || !Arrays.areEqual(var2, this.KtopInput)) {
            byte[] var4 = new byte[16];
            this.KtopInput = var2;
            this.hashCipher.processBlock(this.KtopInput, 0, var4, 0);
            System.arraycopy(var4, 0, this.Stretch, 0, 16);
            for (int var5 = 0; var5 < 8; var5++) {
                this.Stretch[var5 + 16] = (byte) (var4[var5] ^ var4[var5 + 1]);
            }
        }
        return var3;
    }

    public byte[] getMac() {
        return this.macBlock == null ? new byte[this.macSize] : Arrays.clone(this.macBlock);
    }

    public int getOutputSize(int arg0) {
        int var2 = this.mainBlockPos + arg0;
        if (this.forEncryption) {
            return this.macSize + var2;
        } else if (var2 < this.macSize) {
            return 0;
        } else {
            return var2 - this.macSize;
        }
    }

    public static void xor(byte[] arg0, byte[] arg1) {
        for (int var2 = 15; var2 >= 0; var2--) {
            arg0[var2] ^= arg1[var2];
        }
    }

    public void processAADByte(byte arg0) {
        this.hashBlock[this.hashBlockPos] = arg0;
        if (++this.hashBlockPos == this.hashBlock.length) {
            this.processHashBlock();
        }
    }

    public void processAADBytes(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            this.hashBlock[this.hashBlockPos] = arg0[arg1 + var4];
            if (++this.hashBlockPos == this.hashBlock.length) {
                this.processHashBlock();
            }
        }
    }

    public void reset() {
        this.reset(true);
    }

    public int processBytes(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws DataLengthException {
        if (arg0.length < arg1 + arg2) {
            throw new DataLengthException("Input buffer too short");
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg2; var7++) {
            this.mainBlock[this.mainBlockPos] = arg0[arg1 + var7];
            if (++this.mainBlockPos == this.mainBlock.length) {
                this.processMainBlock(arg3, arg4 + var6);
                var6 += 16;
            }
        }
        return var6;
    }

    public int doFinal(byte[] arg0, int arg1) throws IllegalStateException, InvalidCipherTextException {
        byte[] var3 = null;
        if (!this.forEncryption) {
            if (this.mainBlockPos < this.macSize) {
                throw new InvalidCipherTextException("data too short");
            }
            this.mainBlockPos -= this.macSize;
            var3 = new byte[this.macSize];
            System.arraycopy(this.mainBlock, this.mainBlockPos, var3, 0, this.macSize);
        }
        if (this.hashBlockPos > 0) {
            OCB_extend(this.hashBlock, this.hashBlockPos);
            this.updateHASH(this.L_Asterisk);
        }
        if (this.mainBlockPos > 0) {
            if (this.forEncryption) {
                OCB_extend(this.mainBlock, this.mainBlockPos);
                xor(this.Checksum, this.mainBlock);
            }
            xor(this.OffsetMAIN, this.L_Asterisk);
            byte[] var4 = new byte[16];
            this.hashCipher.processBlock(this.OffsetMAIN, 0, var4, 0);
            xor(this.mainBlock, var4);
            if (arg0.length < this.mainBlockPos + arg1) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.mainBlock, 0, arg0, arg1, this.mainBlockPos);
            if (!this.forEncryption) {
                OCB_extend(this.mainBlock, this.mainBlockPos);
                xor(this.Checksum, this.mainBlock);
            }
        }
        xor(this.Checksum, this.OffsetMAIN);
        xor(this.Checksum, this.L_Dollar);
        this.hashCipher.processBlock(this.Checksum, 0, this.Checksum, 0);
        xor(this.Checksum, this.Sum);
        this.macBlock = new byte[this.macSize];
        System.arraycopy(this.Checksum, 0, this.macBlock, 0, this.macSize);
        int var5 = this.mainBlockPos;
        if (this.forEncryption) {
            if (arg0.length < arg1 + var5 + this.macSize) {
                throw new OutputLengthException("Output buffer too short");
            }
            System.arraycopy(this.macBlock, 0, arg0, arg1 + var5, this.macSize);
            var5 += this.macSize;
        } else if (!Arrays.constantTimeAreEqual(this.macBlock, var3)) {
            throw new InvalidCipherTextException("mac check in OCB failed");
        }
        this.reset(false);
        return var5;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.mainCipher;
    }

    public void clear(byte[] arg0) {
        if (arg0 != null) {
            Arrays.fill((byte[]) arg0, (byte) 0);
        }
    }

    public byte[] getLSub(int arg0) {
        while (arg0 >= this.L.size()) {
            this.L.addElement(OCB_double((byte[]) ((byte[]) this.L.lastElement())));
        }
        return (byte[]) ((byte[]) this.L.elementAt(arg0));
    }

    public void processHashBlock() {
        this.updateHASH(this.getLSub(OCB_ntz(++this.hashBlockCount)));
        this.hashBlockPos = 0;
    }

    public OCBBlockCipher(BlockCipher arg0, BlockCipher arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'hashCipher' cannot be null");
        } else if (arg0.getBlockSize() != 16) {
            throw new IllegalArgumentException("'hashCipher' must have a block size of 16");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("'mainCipher' cannot be null");
        } else if (arg1.getBlockSize() != 16) {
            throw new IllegalArgumentException("'mainCipher' must have a block size of 16");
        } else if (arg0.getAlgorithmName().equals(arg1.getAlgorithmName())) {
            this.hashCipher = arg0;
            this.mainCipher = arg1;
        } else {
            throw new IllegalArgumentException("'hashCipher' and 'mainCipher' must be the same algorithm");
        }
    }

    public void reset(boolean arg0) {
        this.hashCipher.reset();
        this.mainCipher.reset();
        this.clear(this.hashBlock);
        this.clear(this.mainBlock);
        this.hashBlockPos = 0;
        this.mainBlockPos = 0;
        this.hashBlockCount = 0L;
        this.mainBlockCount = 0L;
        this.clear(this.OffsetHASH);
        this.clear(this.Sum);
        System.arraycopy(this.OffsetMAIN_0, 0, this.OffsetMAIN, 0, 16);
        this.clear(this.Checksum);
        if (arg0) {
            this.macBlock = null;
        }
        if (this.initialAssociatedText != null) {
            this.processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length);
        }
    }

    public static int OCB_ntz(long arg0) {
        if (arg0 == 0L) {
            return 64;
        }
        int var2 = 0;
        while ((arg0 & 0x1L) == 0L) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2;
    }

    public static byte[] OCB_double(byte[] arg0) {
        byte[] var1 = new byte[16];
        int var2 = shiftLeft(arg0, var1);
        var1[15] = (byte) (var1[15] ^ 0x87 >>> (1 - var2 << 3));
        return var1;
    }

    public static void OCB_extend(byte[] arg0, int arg1) {
        arg0[arg1] = -128;
        while (true) {
            arg1++;
            if (arg1 >= 16) {
                return;
            }
            arg0[arg1] = 0;
        }
    }

    public int processByte(byte arg0, byte[] arg1, int arg2) throws DataLengthException {
        this.mainBlock[this.mainBlockPos] = arg0;
        if (++this.mainBlockPos == this.mainBlock.length) {
            this.processMainBlock(arg1, arg2);
            return 16;
        } else {
            return 0;
        }
    }

    public static int shiftLeft(byte[] arg0, byte[] arg1) {
        int var2 = 16;
        int var3 = 0;
        while (true) {
            var2--;
            if (var2 < 0) {
                return var3;
            }
            int var4 = arg0[var2] & 0xFF;
            arg1[var2] = (byte) (var4 << 1 | var3);
            var3 = var4 >>> 7 & 0x1;
        }
    }

    public String getAlgorithmName() {
        return this.mainCipher.getAlgorithmName() + "/OCB";
    }
}

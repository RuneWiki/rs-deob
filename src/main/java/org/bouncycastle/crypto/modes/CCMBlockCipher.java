package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class CCMBlockCipher implements AEADBlockCipher {

    public CCMBlockCipher.EBAOutStream associatedText = new CCMBlockCipher.EBAOutStream();

    public CCMBlockCipher.EBAOutStream data = new CCMBlockCipher.EBAOutStream();

    public BlockCipher cipher;

    public int blockSize;

    public byte[] macBlock;

    public int macSize;

    public CipherParameters keyParam;

    public boolean forEncryption;

    public byte[] initialAssociatedText;

    public byte[] nonce;

    public int processPacket(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalStateException, InvalidCipherTextException, DataLengthException {
        if (this.keyParam == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        int var6 = this.nonce.length;
        int var7 = 15 - var6;
        if (var7 < 4) {
            int var8 = 0x1 << var7 * 8;
            if (arg2 >= var8) {
                throw new IllegalStateException("CCM packet too large for choice of q.");
            }
        }
        byte[] var9 = new byte[this.blockSize];
        var9[0] = (byte) (var7 - 1 & 0x7);
        System.arraycopy(this.nonce, 0, var9, 1, this.nonce.length);
        SICBlockCipher var10 = new SICBlockCipher(this.cipher);
        var10.init(this.forEncryption, new ParametersWithIV(this.keyParam, var9));
        int var11 = arg1;
        int var12 = arg4;
        int var13;
        if (this.forEncryption) {
            var13 = this.macSize + arg2;
            if (arg3.length < arg4 + var13) {
                throw new OutputLengthException("Output buffer too short.");
            }
            this.calculateMac(arg0, arg1, arg2, this.macBlock);
            byte[] var14 = new byte[this.blockSize];
            var10.processBlock(this.macBlock, 0, var14, 0);
            while (var11 < arg1 + arg2 - this.blockSize) {
                var10.processBlock(arg0, var11, arg3, var12);
                var12 += this.blockSize;
                var11 += this.blockSize;
            }
            byte[] var15 = new byte[this.blockSize];
            System.arraycopy(arg0, var11, var15, 0, arg1 + arg2 - var11);
            var10.processBlock(var15, 0, var15, 0);
            System.arraycopy(var15, 0, arg3, var12, arg1 + arg2 - var11);
            System.arraycopy(var14, 0, arg3, arg2 + arg4, this.macSize);
        } else if (arg2 >= this.macSize) {
            var13 = arg2 - this.macSize;
            if (arg3.length < arg4 + var13) {
                throw new OutputLengthException("Output buffer too short.");
            }
            System.arraycopy(arg0, arg1 + var13, this.macBlock, 0, this.macSize);
            var10.processBlock(this.macBlock, 0, this.macBlock, 0);
            for (int var16 = this.macSize; var16 != this.macBlock.length; var16++) {
                this.macBlock[var16] = 0;
            }
            while (var11 < arg1 + var13 - this.blockSize) {
                var10.processBlock(arg0, var11, arg3, var12);
                var12 += this.blockSize;
                var11 += this.blockSize;
            }
            byte[] var17 = new byte[this.blockSize];
            System.arraycopy(arg0, var11, var17, 0, var13 - (var11 - arg1));
            var10.processBlock(var17, 0, var17, 0);
            System.arraycopy(var17, 0, arg3, var12, var13 - (var11 - arg1));
            byte[] var18 = new byte[this.blockSize];
            this.calculateMac(arg3, arg4, var13, var18);
            if (!Arrays.constantTimeAreEqual(this.macBlock, var18)) {
                throw new InvalidCipherTextException("mac check in CCM failed");
            }
        } else {
            throw new InvalidCipherTextException("data too short");
        }
        return var13;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException {
        this.forEncryption = arg0;
        CipherParameters var4;
        if (arg1 instanceof AEADParameters) {
            AEADParameters var3 = (AEADParameters) arg1;
            this.nonce = var3.getNonce();
            this.initialAssociatedText = var3.getAssociatedText();
            this.macSize = var3.getMacSize() / 8;
            var4 = var3.getKey();
        } else if ((arg1 instanceof ParametersWithIV)) {
            ParametersWithIV var5 = (ParametersWithIV) arg1;
            this.nonce = var5.getIV();
            this.initialAssociatedText = null;
            this.macSize = this.macBlock.length / 2;
            var4 = var5.getParameters();
        } else {
            throw new IllegalArgumentException("invalid parameters passed to CCM: " + arg1.getClass().getName());
        }
        if (var4 != null) {
            this.keyParam = var4;
        }
        if (this.nonce == null || this.nonce.length < 7 || this.nonce.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        this.reset();
    }

    public int processBytes(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws DataLengthException, IllegalStateException {
        if (arg0.length < arg1 + arg2) {
            throw new DataLengthException("Input buffer too short");
        }
        this.data.write(arg0, arg1, arg2);
        return 0;
    }

    public void processAADByte(byte arg0) {
        this.associatedText.write(arg0);
    }

    public void processAADBytes(byte[] arg0, int arg1, int arg2) {
        this.associatedText.write(arg0, arg1, arg2);
    }

    public int processByte(byte arg0, byte[] arg1, int arg2) throws DataLengthException, IllegalStateException {
        this.data.write(arg0);
        return 0;
    }

    public CCMBlockCipher(BlockCipher arg0) {
        this.cipher = arg0;
        this.blockSize = arg0.getBlockSize();
        this.macBlock = new byte[this.blockSize];
        if (this.blockSize != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    public int doFinal(byte[] arg0, int arg1) throws IllegalStateException, InvalidCipherTextException {
        int var3 = this.processPacket(this.data.getBuffer(), 0, this.data.size(), arg0, arg1);
        this.reset();
        return var3;
    }

    public void reset() {
        this.cipher.reset();
        this.associatedText.reset();
        this.data.reset();
    }

    public byte[] getMac() {
        byte[] var1 = new byte[this.macSize];
        System.arraycopy(this.macBlock, 0, var1, 0, var1.length);
        return var1;
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CCM";
    }

    public int getOutputSize(int arg0) {
        int var2 = arg0 + this.data.size();
        if (this.forEncryption) {
            return this.macSize + var2;
        } else if (var2 < this.macSize) {
            return 0;
        } else {
            return var2 - this.macSize;
        }
    }

    public byte[] processPacket(byte[] arg0, int arg1, int arg2) throws IllegalStateException, InvalidCipherTextException {
        byte[] var4;
        if (this.forEncryption) {
            var4 = new byte[this.macSize + arg2];
        } else if (arg2 >= this.macSize) {
            var4 = new byte[arg2 - this.macSize];
        } else {
            throw new InvalidCipherTextException("data too short");
        }
        this.processPacket(arg0, arg1, arg2, var4, 0);
        return var4;
    }

    public int getUpdateOutputSize(int arg0) {
        return 0;
    }

    public int calculateMac(byte[] arg0, int arg1, int arg2, byte[] arg3) {
        CBCBlockCipherMac var5 = new CBCBlockCipherMac(this.cipher, this.macSize * 8);
        var5.init(this.keyParam);
        byte[] var6 = new byte[16];
        if (this.hasAssociatedText()) {
            var6[0] = (byte) (var6[0] | 0x40);
        }
        var6[0] = (byte) (var6[0] | ((var5.getMacSize() - 2) / 2 & 0x7) << 3);
        var6[0] = (byte) (var6[0] | 15 - this.nonce.length - 1 & 0x7);
        System.arraycopy(this.nonce, 0, var6, 1, this.nonce.length);
        int var7 = arg2;
        int var8 = 1;
        while (var7 > 0) {
            var6[var6.length - var8] = (byte) (var7 & 0xFF);
            var7 >>>= 0x8;
            var8++;
        }
        var5.update(var6, 0, var6.length);
        if (this.hasAssociatedText()) {
            int var9 = this.getAssociatedTextLength();
            byte var10;
            if (var9 < 65280) {
                var5.update((byte) (var9 >> 8));
                var5.update((byte) var9);
                var10 = 2;
            } else {
                var5.update((byte) -1);
                var5.update((byte) -2);
                var5.update((byte) (var9 >> 24));
                var5.update((byte) (var9 >> 16));
                var5.update((byte) (var9 >> 8));
                var5.update((byte) var9);
                var10 = 6;
            }
            if (this.initialAssociatedText != null) {
                var5.update(this.initialAssociatedText, 0, this.initialAssociatedText.length);
            }
            if (this.associatedText.size() > 0) {
                var5.update(this.associatedText.getBuffer(), 0, this.associatedText.size());
            }
            int var11 = (var9 + var10) % 16;
            if (var11 != 0) {
                for (int var12 = var11; var12 != 16; var12++) {
                    var5.update((byte) 0);
                }
            }
        }
        var5.update(arg0, arg1, arg2);
        return var5.doFinal(arg3, 0);
    }

    public int getAssociatedTextLength() {
        return this.associatedText.size() + (this.initialAssociatedText == null ? 0 : this.initialAssociatedText.length);
    }

    public boolean hasAssociatedText() {
        return this.getAssociatedTextLength() > 0;
    }

    class EBAOutStream extends ByteArrayOutputStream {

        public EBAOutStream() {
        }

        public byte[] getBuffer() {
            return this.buf;
        }
    }
}

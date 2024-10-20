package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.gcm.GCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.GCMUtil;
import org.bouncycastle.crypto.modes.gcm.Tables1kGCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class GCMBlockCipher implements AEADBlockCipher {

    public BlockCipher cipher;

    public GCMMultiplier multiplier;

    public static final int BLOCK_SIZE = 16;

    public int atBlockPos;

    public int blocksRemaining;

    public int bufOff;

    public int macSize;

    public long atLength;

    public long atLengthPre;

    public long totalLength;

    public GCMExponentiator exp;

    public boolean forEncryption;

    public byte[] H;

    public byte[] J0;

    public byte[] S;

    public byte[] S_at;

    public byte[] S_atPre;

    public byte[] atBlock;

    public byte[] bufBlock;

    public byte[] counter;

    public byte[] initialAssociatedText;

    public byte[] lastKey;

    public byte[] macBlock;

    public byte[] nonce;

    public byte[] getMac() {
        return this.macBlock == null ? new byte[this.macSize] : Arrays.clone(this.macBlock);
    }

    public GCMBlockCipher(BlockCipher arg0, GCMMultiplier arg1) {
        if (arg0.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        if (arg1 == null) {
            arg1 = new Tables8kGCMMultiplier();
        }
        this.cipher = arg0;
        this.multiplier = arg1;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCM";
    }

    public void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException {
        this.forEncryption = arg0;
        this.macBlock = null;
        Object var3 = null;
        byte[] var5;
        KeyParameter var7;
        if (arg1 instanceof AEADParameters) {
            AEADParameters var4 = (AEADParameters) arg1;
            var5 = var4.getNonce();
            this.initialAssociatedText = var4.getAssociatedText();
            int var6 = var4.getMacSize();
            if (var6 < 32 || var6 > 128 || var6 % 8 != 0) {
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
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        int var9 = arg0 ? 16 : this.macSize + 16;
        this.bufBlock = new byte[var9];
        if (var5 == null || var5.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (arg0 && this.nonce != null && Arrays.areEqual(this.nonce, var5)) {
            if (var7 == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            if (this.lastKey != null && Arrays.areEqual(this.lastKey, var7.getKey())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.nonce = var5;
        if (var7 != null) {
            this.lastKey = var7.getKey();
        }
        if (var7 != null) {
            this.cipher.init(true, var7);
            this.H = new byte[16];
            this.cipher.processBlock(this.H, 0, this.H, 0);
            this.multiplier.init(this.H);
            this.exp = null;
        } else if (this.H == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        this.J0 = new byte[16];
        if (this.nonce.length == 12) {
            System.arraycopy(this.nonce, 0, this.J0, 0, this.nonce.length);
            this.J0[15] = 1;
        } else {
            this.gHASH(this.J0, this.nonce, this.nonce.length);
            byte[] var10 = new byte[16];
            Pack.longToBigEndian((long) this.nonce.length * 8L, var10, 8);
            this.gHASHBlock(this.J0, var10);
        }
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        if (this.initialAssociatedText != null) {
            this.processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length);
        }
    }

    public GCMBlockCipher(BlockCipher arg0) {
        this(arg0, (GCMMultiplier) null);
    }

    public int getOutputSize(int arg0) {
        int var2 = this.bufOff + arg0;
        if (this.forEncryption) {
            return this.macSize + var2;
        } else if (var2 < this.macSize) {
            return 0;
        } else {
            return var2 - this.macSize;
        }
    }

    public int getUpdateOutputSize(int arg0) {
        int var2 = this.bufOff + arg0;
        if (!this.forEncryption) {
            if (var2 < this.macSize) {
                return 0;
            }
            var2 -= this.macSize;
        }
        return var2 - var2 % 16;
    }

    public void reset(boolean arg0) {
        this.cipher.reset();
        this.S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        if (this.bufBlock != null) {
            Arrays.fill((byte[]) this.bufBlock, (byte) 0);
        }
        if (arg0) {
            this.macBlock = null;
        }
        if (this.initialAssociatedText != null) {
            this.processAADBytes(this.initialAssociatedText, 0, this.initialAssociatedText.length);
        }
    }

    public void processAADBytes(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            this.atBlock[this.atBlockPos] = arg0[arg1 + var4];
            if (++this.atBlockPos == 16) {
                this.gHASHBlock(this.S_at, this.atBlock);
                this.atBlockPos = 0;
                this.atLength += 16L;
            }
        }
    }

    public void initCipher() {
        if (this.atLength > 0L) {
            System.arraycopy(this.S_at, 0, this.S_atPre, 0, 16);
            this.atLengthPre = this.atLength;
        }
        if (this.atBlockPos > 0) {
            this.gHASHPartial(this.S_atPre, this.atBlock, 0, this.atBlockPos);
            this.atLengthPre += (long) this.atBlockPos;
        }
        if (this.atLengthPre > 0L) {
            System.arraycopy(this.S_atPre, 0, this.S, 0, 16);
        }
    }

    public int processByte(byte arg0, byte[] arg1, int arg2) throws DataLengthException {
        this.bufBlock[this.bufOff] = arg0;
        if (++this.bufOff == this.bufBlock.length) {
            this.outputBlock(arg1, arg2);
            return 16;
        } else {
            return 0;
        }
    }

    public int processBytes(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws DataLengthException {
        if (arg0.length < arg1 + arg2) {
            throw new DataLengthException("Input buffer too short");
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg2; var7++) {
            this.bufBlock[this.bufOff] = arg0[arg1 + var7];
            if (++this.bufOff == this.bufBlock.length) {
                this.outputBlock(arg3, arg4 + var6);
                var6 += 16;
            }
        }
        return var6;
    }

    public void processAADByte(byte arg0) {
        this.atBlock[this.atBlockPos] = arg0;
        if (++this.atBlockPos == 16) {
            this.gHASHBlock(this.S_at, this.atBlock);
            this.atBlockPos = 0;
            this.atLength += 16L;
        }
    }

    public void outputBlock(byte[] arg0, int arg1) {
        if (arg0.length < arg1 + 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.totalLength == 0L) {
            this.initCipher();
        }
        this.gCTRBlock(this.bufBlock, arg0, arg1);
        if (this.forEncryption) {
            this.bufOff = 0;
        } else {
            System.arraycopy(this.bufBlock, 16, this.bufBlock, 0, this.macSize);
            this.bufOff = this.macSize;
        }
    }

    public void reset() {
        this.reset(true);
    }

    public void gCTRPartial(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        byte[] var6 = this.getNextCounterBlock();
        GCMUtil.xor(var6, arg0, arg1, arg2);
        System.arraycopy(var6, 0, arg3, arg4, arg2);
        this.gHASHPartial(this.S, this.forEncryption ? var6 : arg0, 0, arg2);
        this.totalLength += (long) arg2;
    }

    public void gCTRBlock(byte[] arg0, byte[] arg1, int arg2) {
        byte[] var4 = this.getNextCounterBlock();
        GCMUtil.xor(var4, arg0);
        System.arraycopy(var4, 0, arg1, arg2, 16);
        this.gHASHBlock(this.S, this.forEncryption ? var4 : arg0);
        this.totalLength += 16L;
    }

    public int doFinal(byte[] arg0, int arg1) throws IllegalStateException, InvalidCipherTextException {
        if (this.totalLength == 0L) {
            this.initCipher();
        }
        int var3 = this.bufOff;
        if (!this.forEncryption) {
            if (var3 < this.macSize) {
                throw new InvalidCipherTextException("data too short");
            }
            var3 -= this.macSize;
            if (arg0.length < arg1 + var3) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (arg0.length < arg1 + var3 + this.macSize) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (var3 > 0) {
            this.gCTRPartial(this.bufBlock, 0, var3, arg0, arg1);
        }
        this.atLength += (long) this.atBlockPos;
        if (this.atLength > this.atLengthPre) {
            if (this.atBlockPos > 0) {
                this.gHASHPartial(this.S_at, this.atBlock, 0, this.atBlockPos);
            }
            if (this.atLengthPre > 0L) {
                GCMUtil.xor(this.S_at, this.S_atPre);
            }
            long var4 = this.totalLength * 8L + 127L >>> 7;
            byte[] var6 = new byte[16];
            if (this.exp == null) {
                this.exp = new Tables1kGCMExponentiator();
                this.exp.init(this.H);
            }
            this.exp.exponentiateX(var4, var6);
            GCMUtil.multiply(this.S_at, var6);
            GCMUtil.xor(this.S, this.S_at);
        }
        byte[] var7 = new byte[16];
        Pack.longToBigEndian(this.atLength * 8L, var7, 0);
        Pack.longToBigEndian(this.totalLength * 8L, var7, 8);
        this.gHASHBlock(this.S, var7);
        byte[] var8 = new byte[16];
        this.cipher.processBlock(this.J0, 0, var8, 0);
        GCMUtil.xor(var8, this.S);
        int var9 = var3;
        this.macBlock = new byte[this.macSize];
        System.arraycopy(var8, 0, this.macBlock, 0, this.macSize);
        if (this.forEncryption) {
            System.arraycopy(this.macBlock, 0, arg0, this.bufOff + arg1, this.macSize);
            var9 = this.macSize + var3;
        } else {
            byte[] var10 = new byte[this.macSize];
            System.arraycopy(this.bufBlock, var3, var10, 0, this.macSize);
            if (!Arrays.constantTimeAreEqual(this.macBlock, var10)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        this.reset(false);
        return var9;
    }

    public void gHASH(byte[] arg0, byte[] arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4 += 16) {
            int var5 = Math.min(arg2 - var4, 16);
            this.gHASHPartial(arg0, arg1, var4, var5);
        }
    }

    public void gHASHBlock(byte[] arg0, byte[] arg1) {
        GCMUtil.xor(arg0, arg1);
        this.multiplier.multiplyH(arg0);
    }

    public void gHASHPartial(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        GCMUtil.xor(arg0, arg1, arg2, arg3);
        this.multiplier.multiplyH(arg0);
    }

    public byte[] getNextCounterBlock() {
        if (this.blocksRemaining == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.blocksRemaining--;
        byte var1 = 1;
        int var2 = (this.counter[15] & 0xFF) + var1;
        this.counter[15] = (byte) var2;
        int var3 = var2 >>> 8;
        int var4 = (this.counter[14] & 0xFF) + var3;
        this.counter[14] = (byte) var4;
        int var5 = var4 >>> 8;
        int var6 = (this.counter[13] & 0xFF) + var5;
        this.counter[13] = (byte) var6;
        int var7 = var6 >>> 8;
        int var8 = (this.counter[12] & 0xFF) + var7;
        this.counter[12] = (byte) var8;
        byte[] var9 = new byte[16];
        this.cipher.processBlock(this.counter, 0, var9, 0);
        return var9;
    }
}

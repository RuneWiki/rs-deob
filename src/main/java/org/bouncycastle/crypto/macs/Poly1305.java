package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

public class Poly1305 implements Mac {

    public final byte[] singleByte = new byte[1];

    public final byte[] currentBlock = new byte[16];

    public int currentBlockOffset = 0;

    public final BlockCipher cipher;

    public static final int BLOCK_SIZE = 16;

    public int h0;

    public int h1;

    public int h2;

    public int h3;

    public int h4;

    public int k0;

    public int k1;

    public int k2;

    public int k3;

    public int r0;

    public int r1;

    public int r2;

    public int r3;

    public int r4;

    public int s1;

    public int s2;

    public int s3;

    public int s4;

    public int getMacSize() {
        return 16;
    }

    public Poly1305(BlockCipher arg0) {
        if (arg0.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = arg0;
    }

    public void init(CipherParameters arg0) throws IllegalArgumentException {
        byte[] var2 = null;
        if (this.cipher != null) {
            if (!(arg0 instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV var3 = (ParametersWithIV) arg0;
            var2 = var3.getIV();
            arg0 = var3.getParameters();
        }
        if (!(arg0 instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        KeyParameter var4 = (KeyParameter) arg0;
        this.setKey(var4.getKey(), var2);
        this.reset();
    }

    public Poly1305() {
        this.cipher = null;
    }

    public String getAlgorithmName() {
        return this.cipher == null ? "Poly1305" : "Poly1305-" + this.cipher.getAlgorithmName();
    }

    public void update(byte arg0) throws IllegalStateException {
        this.singleByte[0] = arg0;
        this.update(this.singleByte, 0, 1);
    }

    public void update(byte[] arg0, int arg1, int arg2) throws DataLengthException, IllegalStateException {
        int var4 = 0;
        while (arg2 > var4) {
            if (this.currentBlockOffset == 16) {
                this.processBlock();
                this.currentBlockOffset = 0;
            }
            int var5 = Math.min(arg2 - var4, 16 - this.currentBlockOffset);
            System.arraycopy(arg0, arg1 + var4, this.currentBlock, this.currentBlockOffset, var5);
            var4 += var5;
            this.currentBlockOffset += var5;
        }
    }

    public void setKey(byte[] arg0, byte[] arg1) {
        if (arg0.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        } else if (this.cipher == null || arg1 != null && arg1.length == 16) {
            int var3 = Pack.littleEndianToInt(arg0, 0);
            int var4 = Pack.littleEndianToInt(arg0, 4);
            int var5 = Pack.littleEndianToInt(arg0, 8);
            int var6 = Pack.littleEndianToInt(arg0, 12);
            this.r0 = var3 & 0x3FFFFFF;
            this.r1 = (var3 >>> 26 | var4 << 6) & 0x3FFFF03;
            this.r2 = (var4 >>> 20 | var5 << 12) & 0x3FFC0FF;
            this.r3 = (var5 >>> 14 | var6 << 18) & 0x3F03FFF;
            this.r4 = var6 >>> 8 & 0xFFFFF;
            this.s1 = this.r1 * 5;
            this.s2 = this.r2 * 5;
            this.s3 = this.r3 * 5;
            this.s4 = this.r4 * 5;
            byte[] var7;
            byte var8;
            if (this.cipher == null) {
                var7 = arg0;
                var8 = 16;
            } else {
                var7 = new byte[16];
                var8 = 0;
                this.cipher.init(true, new KeyParameter(arg0, 16, 16));
                this.cipher.processBlock(arg1, 0, var7, 0);
            }
            this.k0 = Pack.littleEndianToInt(var7, var8);
            this.k1 = Pack.littleEndianToInt(var7, var8 + 4);
            this.k2 = Pack.littleEndianToInt(var7, var8 + 8);
            this.k3 = Pack.littleEndianToInt(var7, var8 + 12);
        } else {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
    }

    public void processBlock() {
        if (this.currentBlockOffset < 16) {
            this.currentBlock[this.currentBlockOffset] = 1;
            for (int var1 = this.currentBlockOffset + 1; var1 < 16; var1++) {
                this.currentBlock[var1] = 0;
            }
        }
        long var2 = 0xFFFFFFFFL & (long) Pack.littleEndianToInt(this.currentBlock, 0);
        long var4 = 0xFFFFFFFFL & (long) Pack.littleEndianToInt(this.currentBlock, 4);
        long var6 = 0xFFFFFFFFL & (long) Pack.littleEndianToInt(this.currentBlock, 8);
        long var8 = 0xFFFFFFFFL & (long) Pack.littleEndianToInt(this.currentBlock, 12);
        this.h0 = (int) ((long) this.h0 + (var2 & 0x3FFFFFFL));
        this.h1 = (int) ((long) this.h1 + ((var4 << 32 | var2) >>> 26 & 0x3FFFFFFL));
        this.h2 = (int) ((long) this.h2 + ((var6 << 32 | var4) >>> 20 & 0x3FFFFFFL));
        this.h3 = (int) ((long) this.h3 + ((var8 << 32 | var6) >>> 14 & 0x3FFFFFFL));
        this.h4 = (int) ((long) this.h4 + (var8 >>> 8));
        if (this.currentBlockOffset == 16) {
            this.h4 += 16777216;
        }
        long var10 = mul32x32_64(this.h0, this.r0) + mul32x32_64(this.h1, this.s4) + mul32x32_64(this.h2, this.s3) + mul32x32_64(this.h3, this.s2) + mul32x32_64(this.h4, this.s1);
        long var12 = mul32x32_64(this.h0, this.r1) + mul32x32_64(this.h1, this.r0) + mul32x32_64(this.h2, this.s4) + mul32x32_64(this.h3, this.s3) + mul32x32_64(this.h4, this.s2);
        long var14 = mul32x32_64(this.h0, this.r2) + mul32x32_64(this.h1, this.r1) + mul32x32_64(this.h2, this.r0) + mul32x32_64(this.h3, this.s4) + mul32x32_64(this.h4, this.s3);
        long var16 = mul32x32_64(this.h0, this.r3) + mul32x32_64(this.h1, this.r2) + mul32x32_64(this.h2, this.r1) + mul32x32_64(this.h3, this.r0) + mul32x32_64(this.h4, this.s4);
        long var18 = mul32x32_64(this.h0, this.r4) + mul32x32_64(this.h1, this.r3) + mul32x32_64(this.h2, this.r2) + mul32x32_64(this.h3, this.r1) + mul32x32_64(this.h4, this.r0);
        this.h0 = (int) var10 & 0x3FFFFFF;
        long var20 = (var10 >>> 26) + var12;
        this.h1 = (int) var20 & 0x3FFFFFF;
        long var22 = (var20 >>> 26) + var14;
        this.h2 = (int) var22 & 0x3FFFFFF;
        long var24 = (var22 >>> 26) + var16;
        this.h3 = (int) var24 & 0x3FFFFFF;
        long var26 = (var24 >>> 26) + var18;
        this.h4 = (int) var26 & 0x3FFFFFF;
        this.h0 += (int) (var26 >>> 26) * 5;
        this.h1 += this.h0 >>> 26;
        this.h0 &= 0x3FFFFFF;
    }

    public int doFinal(byte[] arg0, int arg1) throws DataLengthException, IllegalStateException {
        if (arg1 + 16 > arg0.length) {
            throw new DataLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            this.processBlock();
        }
        this.h1 += this.h0 >>> 26;
        this.h0 &= 0x3FFFFFF;
        this.h2 += this.h1 >>> 26;
        this.h1 &= 0x3FFFFFF;
        this.h3 += this.h2 >>> 26;
        this.h2 &= 0x3FFFFFF;
        this.h4 += this.h3 >>> 26;
        this.h3 &= 0x3FFFFFF;
        this.h0 += (this.h4 >>> 26) * 5;
        this.h4 &= 0x3FFFFFF;
        this.h1 += this.h0 >>> 26;
        this.h0 &= 0x3FFFFFF;
        int var3 = this.h0 + 5;
        int var4 = var3 >>> 26;
        int var5 = var3 & 0x3FFFFFF;
        int var6 = this.h1 + var4;
        int var7 = var6 >>> 26;
        int var8 = var6 & 0x3FFFFFF;
        int var9 = this.h2 + var7;
        int var10 = var9 >>> 26;
        int var11 = var9 & 0x3FFFFFF;
        int var12 = this.h3 + var10;
        int var13 = var12 >>> 26;
        int var14 = var12 & 0x3FFFFFF;
        int var15 = this.h4 + var13 - 67108864;
        int var16 = (var15 >>> 31) - 1;
        int var17 = ~var16;
        this.h0 = this.h0 & var17 | var5 & var16;
        this.h1 = this.h1 & var17 | var8 & var16;
        this.h2 = this.h2 & var17 | var11 & var16;
        this.h3 = this.h3 & var17 | var14 & var16;
        this.h4 = this.h4 & var17 | var15 & var16;
        long var18 = ((long) (this.h0 | this.h1 << 26) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long) this.k0);
        long var20 = ((long) (this.h1 >>> 6 | this.h2 << 20) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long) this.k1);
        long var22 = ((long) (this.h2 >>> 12 | this.h3 << 14) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long) this.k2);
        long var24 = ((long) (this.h3 >>> 18 | this.h4 << 8) & 0xFFFFFFFFL) + (0xFFFFFFFFL & (long) this.k3);
        Pack.intToLittleEndian((int) var18, arg0, arg1);
        long var26 = (var18 >>> 32) + var20;
        Pack.intToLittleEndian((int) var26, arg0, arg1 + 4);
        long var28 = (var26 >>> 32) + var22;
        Pack.intToLittleEndian((int) var28, arg0, arg1 + 8);
        long var30 = (var28 >>> 32) + var24;
        Pack.intToLittleEndian((int) var30, arg0, arg1 + 12);
        this.reset();
        return 16;
    }

    public void reset() {
        this.currentBlockOffset = 0;
        this.h0 = this.h1 = this.h2 = this.h3 = this.h4 = 0;
    }

    public static final long mul32x32_64(int arg0, int arg1) {
        return ((long) arg0 & 0xFFFFFFFFL) * (long) arg1;
    }
}

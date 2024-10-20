package org.bouncycastle.crypto.engines;

import org.bouncycastle.util.Pack;

public class ChaChaEngine extends Salsa20Engine {

    public void generateKeyStream(byte[] arg0) {
        chachaCore(this.rounds, this.engineState, this.x);
        Pack.intToLittleEndian(this.x, arg0, 0);
    }

    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    public void advanceCounter(long arg0) {
        int var3 = (int) (arg0 >>> 32);
        int var4 = (int) arg0;
        if (var3 > 0) {
            this.engineState[13] += var3;
        }
        int var5 = this.engineState[12];
        this.engineState[12] += var4;
        if (var5 != 0 && this.engineState[12] < var5) {
            int var10002 = this.engineState[13]++;
        }
    }

    public static void chachaCore(int arg0, int[] arg1, int[] arg2) {
        if (arg1.length != 16) {
            throw new IllegalArgumentException();
        } else if (arg2.length != 16) {
            throw new IllegalArgumentException();
        } else if (arg0 % 2 == 0) {
            int var3 = arg1[0];
            int var4 = arg1[1];
            int var5 = arg1[2];
            int var6 = arg1[3];
            int var7 = arg1[4];
            int var8 = arg1[5];
            int var9 = arg1[6];
            int var10 = arg1[7];
            int var11 = arg1[8];
            int var12 = arg1[9];
            int var13 = arg1[10];
            int var14 = arg1[11];
            int var15 = arg1[12];
            int var16 = arg1[13];
            int var17 = arg1[14];
            int var18 = arg1[15];
            for (int var19 = arg0; var19 > 0; var19 -= 2) {
                int var20 = var3 + var7;
                int var21 = rotl(var15 ^ var20, 16);
                int var22 = var11 + var21;
                int var23 = rotl(var7 ^ var22, 12);
                int var24 = var20 + var23;
                int var25 = rotl(var21 ^ var24, 8);
                int var26 = var22 + var25;
                int var27 = rotl(var23 ^ var26, 7);
                int var28 = var4 + var8;
                int var29 = rotl(var16 ^ var28, 16);
                int var30 = var12 + var29;
                int var31 = rotl(var8 ^ var30, 12);
                int var32 = var28 + var31;
                int var33 = rotl(var29 ^ var32, 8);
                int var34 = var30 + var33;
                int var35 = rotl(var31 ^ var34, 7);
                int var36 = var5 + var9;
                int var37 = rotl(var17 ^ var36, 16);
                int var38 = var13 + var37;
                int var39 = rotl(var9 ^ var38, 12);
                int var40 = var36 + var39;
                int var41 = rotl(var37 ^ var40, 8);
                int var42 = var38 + var41;
                int var43 = rotl(var39 ^ var42, 7);
                int var44 = var6 + var10;
                int var45 = rotl(var18 ^ var44, 16);
                int var46 = var14 + var45;
                int var47 = rotl(var10 ^ var46, 12);
                int var48 = var44 + var47;
                int var49 = rotl(var45 ^ var48, 8);
                int var50 = var46 + var49;
                int var51 = rotl(var47 ^ var50, 7);
                int var52 = var24 + var35;
                int var53 = rotl(var49 ^ var52, 16);
                int var54 = var42 + var53;
                int var55 = rotl(var35 ^ var54, 12);
                var3 = var52 + var55;
                var18 = rotl(var53 ^ var3, 8);
                var13 = var18 + var54;
                var8 = rotl(var55 ^ var13, 7);
                int var56 = var32 + var43;
                int var57 = rotl(var25 ^ var56, 16);
                int var58 = var50 + var57;
                int var59 = rotl(var43 ^ var58, 12);
                var4 = var56 + var59;
                var15 = rotl(var57 ^ var4, 8);
                var14 = var15 + var58;
                var9 = rotl(var59 ^ var14, 7);
                int var60 = var40 + var51;
                int var61 = rotl(var33 ^ var60, 16);
                int var62 = var26 + var61;
                int var63 = rotl(var51 ^ var62, 12);
                var5 = var60 + var63;
                var16 = rotl(var61 ^ var5, 8);
                var11 = var16 + var62;
                var10 = rotl(var63 ^ var11, 7);
                int var64 = var27 + var48;
                int var65 = rotl(var41 ^ var64, 16);
                int var66 = var34 + var65;
                int var67 = rotl(var27 ^ var66, 12);
                var6 = var64 + var67;
                var17 = rotl(var65 ^ var6, 8);
                var12 = var17 + var66;
                var7 = rotl(var67 ^ var12, 7);
            }
            arg2[0] = arg1[0] + var3;
            arg2[1] = arg1[1] + var4;
            arg2[2] = arg1[2] + var5;
            arg2[3] = arg1[3] + var6;
            arg2[4] = arg1[4] + var7;
            arg2[5] = arg1[5] + var8;
            arg2[6] = arg1[6] + var9;
            arg2[7] = arg1[7] + var10;
            arg2[8] = arg1[8] + var11;
            arg2[9] = arg1[9] + var12;
            arg2[10] = arg1[10] + var13;
            arg2[11] = arg1[11] + var14;
            arg2[12] = arg1[12] + var15;
            arg2[13] = arg1[13] + var16;
            arg2[14] = arg1[14] + var17;
            arg2[15] = arg1[15] + var18;
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }

    public void advanceCounter() {
        if (++this.engineState[12] == 0) {
            int var10002 = this.engineState[13]++;
        }
    }

    public void retreatCounter(long arg0) {
        int var3 = (int) (arg0 >>> 32);
        int var4 = (int) arg0;
        if (var3 != 0) {
            if (((long) this.engineState[13] & 0xFFFFFFFFL) < ((long) var3 & 0xFFFFFFFFL)) {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
            this.engineState[13] -= var3;
        }
        if (((long) this.engineState[12] & 0xFFFFFFFFL) >= ((long) var4 & 0xFFFFFFFFL)) {
            this.engineState[12] -= var4;
        } else if (this.engineState[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        } else {
            int var10002 = this.engineState[13]--;
            this.engineState[12] -= var4;
        }
    }

    public void retreatCounter() {
        if (this.engineState[12] == 0 && this.engineState[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        } else if (--this.engineState[12] == -1) {
            int var10002 = this.engineState[13]--;
        }
    }

    public long getCounter() {
        return (long) this.engineState[13] << 32 | (long) this.engineState[12] & 0xFFFFFFFFL;
    }

    public void resetCounter() {
        this.engineState[12] = this.engineState[13] = 0;
    }

    public void setKey(byte[] arg0, byte[] arg1) {
        if (arg0 != null) {
            if (arg0.length != 16 && arg0.length != 32) {
                throw new IllegalArgumentException(this.getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            this.packTauOrSigma(arg0.length, this.engineState, 0);
            Pack.littleEndianToInt(arg0, 0, this.engineState, 4, 4);
            Pack.littleEndianToInt(arg0, arg0.length - 16, this.engineState, 8, 4);
        }
        Pack.littleEndianToInt(arg1, 0, this.engineState, 14, 2);
    }

    public ChaChaEngine() {
    }

    public ChaChaEngine(int arg0) {
        super(arg0);
    }
}

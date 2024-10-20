package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class DESEngine implements BlockCipher {

    public int[] workingKey = null;

    public static final short[] bytebit = new short[] { 128, 64, 32, 16, 8, 4, 2, 1 };

    public static final int[] bigbyte = new int[] { 8388608, 4194304, 2097152, 1048576, 524288, 262144, 131072, 65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1 };

    public static final byte[] pc1 = new byte[] { 56, 48, 40, 32, 24, 16, 8, 0, 57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 60, 52, 44, 36, 28, 20, 12, 4, 27, 19, 11, 3 };

    public static final byte[] totrot = new byte[] { 1, 2, 4, 6, 8, 10, 12, 14, 15, 17, 19, 21, 23, 25, 27, 28 };

    public static final byte[] pc2 = new byte[] { 13, 16, 10, 23, 0, 4, 2, 27, 14, 5, 20, 9, 22, 18, 11, 3, 25, 7, 15, 6, 26, 19, 12, 1, 40, 51, 30, 36, 46, 54, 29, 39, 50, 44, 32, 47, 43, 48, 38, 55, 33, 52, 45, 41, 49, 35, 28, 31 };

    public static final int[] SP1 = new int[] { 16843776, 0, 65536, 16843780, 16842756, 66564, 4, 65536, 1024, 16843776, 16843780, 1024, 16778244, 16842756, 16777216, 4, 1028, 16778240, 16778240, 66560, 66560, 16842752, 16842752, 16778244, 65540, 16777220, 16777220, 65540, 0, 1028, 66564, 16777216, 65536, 16843780, 4, 16842752, 16843776, 16777216, 16777216, 1024, 16842756, 65536, 66560, 16777220, 1024, 4, 16778244, 66564, 16843780, 65540, 16842752, 16778244, 16777220, 1028, 66564, 16843776, 1028, 16778240, 16778240, 0, 65540, 66560, 0, 16842756 };

    public static final int[] SP2 = new int[] { -2146402272, -2147450880, 32768, 1081376, 1048576, 32, -2146435040, -2147450848, -2147483616, -2146402272, -2146402304, Integer.MIN_VALUE, -2147450880, 1048576, 32, -2146435040, 1081344, 1048608, -2147450848, 0, Integer.MIN_VALUE, 32768, 1081376, -2146435072, 1048608, -2147483616, 0, 1081344, 32800, -2146402304, -2146435072, 32800, 0, 1081376, -2146435040, 1048576, -2147450848, -2146435072, -2146402304, 32768, -2146435072, -2147450880, 32, -2146402272, 1081376, 32, 32768, Integer.MIN_VALUE, 32800, -2146402304, 1048576, -2147483616, 1048608, -2147450848, -2147483616, 1048608, 1081344, 0, -2147450880, 32800, Integer.MIN_VALUE, -2146435040, -2146402272, 1081344 };

    public static final int[] SP3 = new int[] { 520, 134349312, 0, 134348808, 134218240, 0, 131592, 134218240, 131080, 134217736, 134217736, 131072, 134349320, 131080, 134348800, 520, 134217728, 8, 134349312, 512, 131584, 134348800, 134348808, 131592, 134218248, 131584, 131072, 134218248, 8, 134349320, 512, 134217728, 134349312, 134217728, 131080, 520, 131072, 134349312, 134218240, 0, 512, 131080, 134349320, 134218240, 134217736, 512, 0, 134348808, 134218248, 131072, 134217728, 134349320, 8, 131592, 131584, 134217736, 134348800, 134218248, 520, 134348800, 131592, 8, 134348808, 131584 };

    public static final int[] SP4 = new int[] { 8396801, 8321, 8321, 128, 8396928, 8388737, 8388609, 8193, 0, 8396800, 8396800, 8396929, 129, 0, 8388736, 8388609, 1, 8192, 8388608, 8396801, 128, 8388608, 8193, 8320, 8388737, 1, 8320, 8388736, 8192, 8396928, 8396929, 129, 8388736, 8388609, 8396800, 8396929, 129, 0, 0, 8396800, 8320, 8388736, 8388737, 1, 8396801, 8321, 8321, 128, 8396929, 129, 1, 8192, 8388609, 8193, 8396928, 8388737, 8193, 8320, 8388608, 8396801, 128, 8388608, 8192, 8396928 };

    public static final int[] SP5 = new int[] { 256, 34078976, 34078720, 1107296512, 524288, 256, 1073741824, 34078720, 1074266368, 524288, 33554688, 1074266368, 1107296512, 1107820544, 524544, 1073741824, 33554432, 1074266112, 1074266112, 0, 1073742080, 1107820800, 1107820800, 33554688, 1107820544, 1073742080, 0, 1107296256, 34078976, 33554432, 1107296256, 524544, 524288, 1107296512, 256, 33554432, 1073741824, 34078720, 1107296512, 1074266368, 33554688, 1073741824, 1107820544, 34078976, 1074266368, 256, 33554432, 1107820544, 1107820800, 524544, 1107296256, 1107820800, 34078720, 0, 1074266112, 1107296256, 524544, 33554688, 1073742080, 524288, 0, 1074266112, 34078976, 1073742080 };

    public static final int[] SP6 = new int[] { 536870928, 541065216, 16384, 541081616, 541065216, 16, 541081616, 4194304, 536887296, 4210704, 4194304, 536870928, 4194320, 536887296, 536870912, 16400, 0, 4194320, 536887312, 16384, 4210688, 536887312, 16, 541065232, 541065232, 0, 4210704, 541081600, 16400, 4210688, 541081600, 536870912, 536887296, 16, 541065232, 4210688, 541081616, 4194304, 16400, 536870928, 4194304, 536887296, 536870912, 16400, 536870928, 541081616, 4210688, 541065216, 4210704, 541081600, 0, 541065232, 16, 16384, 541065216, 4210704, 16384, 4194320, 536887312, 0, 541081600, 536870912, 4194320, 536887312 };

    public static final int[] SP7 = new int[] { 2097152, 69206018, 67110914, 0, 2048, 67110914, 2099202, 69208064, 69208066, 2097152, 0, 67108866, 2, 67108864, 69206018, 2050, 67110912, 2099202, 2097154, 67110912, 67108866, 69206016, 69208064, 2097154, 69206016, 2048, 2050, 69208066, 2099200, 2, 67108864, 2099200, 67108864, 2099200, 2097152, 67110914, 67110914, 69206018, 69206018, 2, 2097154, 67108864, 67110912, 2097152, 69208064, 2050, 2099202, 69208064, 2050, 67108866, 69208066, 69206016, 2099200, 0, 2, 69208066, 0, 2099202, 69206016, 2048, 67108866, 67110912, 2048, 2097154 };

    public static final int[] SP8 = new int[] { 268439616, 4096, 262144, 268701760, 268435456, 268439616, 64, 268435456, 262208, 268697600, 268701760, 266240, 268701696, 266304, 4096, 64, 268697600, 268435520, 268439552, 4160, 266240, 262208, 268697664, 268701696, 4160, 0, 0, 268697664, 268435520, 268439552, 266304, 262144, 266304, 262144, 268701696, 4096, 64, 268697664, 4096, 266304, 268439552, 64, 268435520, 268697600, 268697664, 268435456, 262144, 268439616, 0, 268701760, 262208, 268435520, 268697600, 268439552, 268439616, 0, 268701760, 266240, 266240, 4160, 4160, 262208, 268435456, 268701696 };

    public static final int BLOCK_SIZE = 8;

    public void desFunc(int[] arg0, byte[] arg1, int arg2, byte[] arg3, int arg4) {
        int var6 = (arg1[arg2] & 0xFF) << 24;
        int var7 = var6 | (arg1[arg2 + 1] & 0xFF) << 16;
        int var8 = var7 | (arg1[arg2 + 2] & 0xFF) << 8;
        int var9 = var8 | arg1[arg2 + 3] & 0xFF;
        int var10 = (arg1[arg2 + 4] & 0xFF) << 24;
        int var11 = var10 | (arg1[arg2 + 5] & 0xFF) << 16;
        int var12 = var11 | (arg1[arg2 + 6] & 0xFF) << 8;
        int var13 = var12 | arg1[arg2 + 7] & 0xFF;
        int var14 = (var9 >>> 4 ^ var13) & 0xF0F0F0F;
        int var15 = var13 ^ var14;
        int var16 = var9 ^ var14 << 4;
        int var17 = (var16 >>> 16 ^ var15) & 0xFFFF;
        int var18 = var15 ^ var17;
        int var19 = var16 ^ var17 << 16;
        int var20 = (var18 >>> 2 ^ var19) & 0x33333333;
        int var21 = var19 ^ var20;
        int var22 = var18 ^ var20 << 2;
        int var23 = (var22 >>> 8 ^ var21) & 0xFF00FF;
        int var24 = var21 ^ var23;
        int var25 = var22 ^ var23 << 8;
        int var26 = (var25 << 1 | var25 >>> 31 & 0x1) & 0xFFFFFFFF;
        int var27 = (var24 ^ var26) & 0xAAAAAAAA;
        int var28 = var24 ^ var27;
        int var29 = var26 ^ var27;
        int var30 = (var28 << 1 | var28 >>> 31 & 0x1) & 0xFFFFFFFF;
        for (int var31 = 0; var31 < 8; var31++) {
            int var32 = var29 << 28 | var29 >>> 4;
            int var33 = var32 ^ arg0[var31 * 4];
            int var34 = SP7[var33 & 0x3F];
            int var35 = var34 | SP5[var33 >>> 8 & 0x3F];
            int var36 = var35 | SP3[var33 >>> 16 & 0x3F];
            int var37 = var36 | SP1[var33 >>> 24 & 0x3F];
            int var38 = var29 ^ arg0[var31 * 4 + 1];
            int var39 = var37 | SP8[var38 & 0x3F];
            int var40 = var39 | SP6[var38 >>> 8 & 0x3F];
            int var41 = var40 | SP4[var38 >>> 16 & 0x3F];
            int var42 = var41 | SP2[var38 >>> 24 & 0x3F];
            var30 ^= var42;
            int var43 = var30 << 28 | var30 >>> 4;
            int var44 = var43 ^ arg0[var31 * 4 + 2];
            int var45 = SP7[var44 & 0x3F];
            int var46 = var45 | SP5[var44 >>> 8 & 0x3F];
            int var47 = var46 | SP3[var44 >>> 16 & 0x3F];
            int var48 = var47 | SP1[var44 >>> 24 & 0x3F];
            int var49 = var30 ^ arg0[var31 * 4 + 3];
            int var50 = var48 | SP8[var49 & 0x3F];
            int var51 = var50 | SP6[var49 >>> 8 & 0x3F];
            int var52 = var51 | SP4[var49 >>> 16 & 0x3F];
            int var53 = var52 | SP2[var49 >>> 24 & 0x3F];
            var29 ^= var53;
        }
        int var54 = var29 << 31 | var29 >>> 1;
        int var55 = (var30 ^ var54) & 0xAAAAAAAA;
        int var56 = var30 ^ var55;
        int var57 = var54 ^ var55;
        int var58 = var56 << 31 | var56 >>> 1;
        int var59 = (var58 >>> 8 ^ var57) & 0xFF00FF;
        int var60 = var57 ^ var59;
        int var61 = var58 ^ var59 << 8;
        int var62 = (var61 >>> 2 ^ var60) & 0x33333333;
        int var63 = var60 ^ var62;
        int var64 = var61 ^ var62 << 2;
        int var65 = (var63 >>> 16 ^ var64) & 0xFFFF;
        int var66 = var64 ^ var65;
        int var67 = var63 ^ var65 << 16;
        int var68 = (var67 >>> 4 ^ var66) & 0xF0F0F0F;
        int var69 = var66 ^ var68;
        int var70 = var67 ^ var68 << 4;
        arg3[arg4] = (byte) (var70 >>> 24 & 0xFF);
        arg3[arg4 + 1] = (byte) (var70 >>> 16 & 0xFF);
        arg3[arg4 + 2] = (byte) (var70 >>> 8 & 0xFF);
        arg3[arg4 + 3] = (byte) (var70 & 0xFF);
        arg3[arg4 + 4] = (byte) (var69 >>> 24 & 0xFF);
        arg3[arg4 + 5] = (byte) (var69 >>> 16 & 0xFF);
        arg3[arg4 + 6] = (byte) (var69 >>> 8 & 0xFF);
        arg3[arg4 + 7] = (byte) (var69 & 0xFF);
    }

    public void init(boolean arg0, CipherParameters arg1) {
        if (!arg1 instanceof KeyParameter) {
            throw new IllegalArgumentException("invalid parameter passed to DES init - " + arg1.getClass().getName());
        } else if (((KeyParameter) arg1).getKey().length > 8) {
            throw new IllegalArgumentException("DES key too long - should be 8 bytes");
        } else {
            this.workingKey = this.generateWorkingKey(arg0, ((KeyParameter) arg1).getKey());
        }
    }

    public int[] generateWorkingKey(boolean arg0, byte[] arg1) {
        int[] var3 = new int[32];
        boolean[] var4 = new boolean[56];
        boolean[] var5 = new boolean[56];
        for (int var6 = 0; var6 < 56; var6++) {
            byte var7 = pc1[var6];
            var4[var6] = (arg1[var7 >>> 3] & bytebit[var7 & 0x7]) != 0;
        }
        for (int var8 = 0; var8 < 16; var8++) {
            int var9;
            if (arg0) {
                var9 = var8 << 1;
            } else {
                var9 = 15 - var8 << 1;
            }
            int var10 = var9 + 1;
            var3[var9] = var3[var10] = 0;
            for (int var11 = 0; var11 < 28; var11++) {
                int var12 = totrot[var8] + var11;
                if (var12 < 28) {
                    var5[var11] = var4[var12];
                } else {
                    var5[var11] = var4[var12 - 28];
                }
            }
            for (int var13 = 28; var13 < 56; var13++) {
                int var14 = totrot[var8] + var13;
                if (var14 < 56) {
                    var5[var13] = var4[var14];
                } else {
                    var5[var13] = var4[var14 - 28];
                }
            }
            for (int var15 = 0; var15 < 24; var15++) {
                if (var5[pc2[var15]]) {
                    var3[var9] |= bigbyte[var15];
                }
                if (var5[pc2[var15 + 24]]) {
                    var3[var10] |= bigbyte[var15];
                }
            }
        }
        for (int var16 = 0; var16 != 32; var16 += 2) {
            int var17 = var3[var16];
            int var18 = var3[var16 + 1];
            var3[var16] = (var17 & 0xFC0000) << 6 | (var17 & 0xFC0) << 10 | (var18 & 0xFC0000) >>> 10 | (var18 & 0xFC0) >>> 6;
            var3[var16 + 1] = (var17 & 0x3F000) << 12 | (var17 & 0x3F) << 16 | (var18 & 0x3F000) >>> 4 | var18 & 0x3F;
        }
        return var3;
    }

    public int getBlockSize() {
        return 8;
    }

    public int processBlock(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.workingKey == null) {
            throw new IllegalStateException("DES engine not initialised");
        } else if (arg1 + 8 > arg0.length) {
            throw new DataLengthException("input buffer too short");
        } else if (arg3 + 8 > arg2.length) {
            throw new OutputLengthException("output buffer too short");
        } else {
            this.desFunc(this.workingKey, arg0, arg1, arg2, arg3);
            return 8;
        }
    }

    public String getAlgorithmName() {
        return "DES";
    }

    public void reset() {
    }
}

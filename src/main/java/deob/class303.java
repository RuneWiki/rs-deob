package deob;

@ObfuscatedName("lg")
public class class303 {

    @ObfuscatedName("lg.at")
    public static int[] field3371;

    static {
        new Object();
        field3371 = new int[33];
        field3371[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3371[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.at(II)I")
    public static int method3045(int arg0) {
        return field3371[arg0];
    }

    @ObfuscatedName("hg.an(IS)I")
    public static int method3696(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("mk.av(IIII)I")
    public static int method5475(int arg0, int arg1, int arg2) {
        int var3 = method3045(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("bn.as(IIIB)I")
    public static int method635(int arg0, int arg1, int arg2) {
        int var3 = method3045(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("eg.ax(II)I")
    public static int method2820(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("ix.ap(II)I")
    public static int method4008(int arg0) {
        int var1 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var1 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var1 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var1 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var1 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var1++;
        }
        return arg0 + var1;
    }

    @ObfuscatedName("ou.ab(IIB)I")
    public static int method6569(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }

    @ObfuscatedName("is.ak(II)J")
    public static long method3898(int arg0) {
        if (arg0 > 63) {
            throw new class388("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[] { arg0 });
        }
        return (long) Math.pow(2.0D, (double) arg0) - 1L;
    }
}

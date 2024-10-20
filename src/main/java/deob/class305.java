package deob;

@ObfuscatedName("ly")
public class class305 {

    @ObfuscatedName("ly.aw")
    public static int[] field3379;

    static {
        new Object();
        field3379 = new int[33];
        field3379[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3379[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class305() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ij.aw(IIB)I")
    public static int method3855(int arg0, int arg1) {
        int var2 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var2 = arg0 * var2;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var2;
        } else {
            return var2;
        }
    }

    @ObfuscatedName("iv.ay(II)I")
    public static int method4137(int arg0) {
        return field3379[arg0];
    }

    @ObfuscatedName("de.ar(II)I")
    public static int method2197(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("bn.am(IIII)I")
    public static int method424(int arg0, int arg1, int arg2) {
        int var3 = method4137(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("if.as(IIII)I")
    public static int method4371(int arg0, int arg1, int arg2) {
        int var3 = method4137(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("ei.aj(IB)I")
    public static int method2707(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("jv.ag(II)I")
    public static int method4918(int arg0) {
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

    @ObfuscatedName("kl.az(III)I")
    public static int method5105(int arg0, int arg1) {
        int var2 = 0;
        while (arg1 > 0) {
            var2 = var2 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var2;
    }

    @ObfuscatedName("iv.av(III)I")
    public static int method4134(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }

    @ObfuscatedName("client.ap(IB)J")
    public static long method1714(int arg0) {
        if (arg0 > 63) {
            throw new class391("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[] { arg0 });
        }
        return (long) Math.pow(2.0D, (double) arg0) - 1L;
    }
}

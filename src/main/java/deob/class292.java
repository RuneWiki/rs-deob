package deob;

@ObfuscatedName("lq")
public class class292 {

    @ObfuscatedName("lq.aj")
    public static int[] field3312;

    static {
        new Object();
        field3312 = new int[33];
        field3312[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3312[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class292() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.aj(IIB)I")
    public static int method1686(int arg0, int arg1) {
        if (arg1 > arg0) {
            int var2 = arg0;
            arg0 = arg1;
            arg1 = var2;
        }
        while (arg1 != 0) {
            int var3 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var3;
        }
        return arg0;
    }

    @ObfuscatedName("hi.al(IB)I")
    public static int method3737(int arg0) {
        return field3312[arg0];
    }

    @ObfuscatedName("lk.ac(IB)I")
    public static int method4963(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("mq.an(IIIB)I")
    public static int method5784(int arg0, int arg1, int arg2) {
        int var3 = method3737(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("jd.ao(IS)I")
    public static int method4415(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("client.av(II)I")
    public static int method1682(int arg0) {
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

    @ObfuscatedName("js.aq(IB)J")
    public static long method4778(int arg0) {
        if (arg0 > 63) {
            throw new class371("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[] { arg0 });
        }
        return (long) Math.pow(2.0D, (double) arg0) - 1L;
    }
}

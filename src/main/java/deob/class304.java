package deob;

@ObfuscatedName("lt")
public class class304 {

    @ObfuscatedName("lt.au")
    public static int[] field3387;

    static {
        new Object();
        field3387 = new int[33];
        field3387[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3387[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class304() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.au(III)I")
    public static int method2523(int arg0, int arg1) {
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

    @ObfuscatedName("ck.ae(II)I")
    public static int method2059(int arg0) {
        return field3387[arg0];
    }

    @ObfuscatedName("hh.at(IIIB)I")
    public static int method3282(int arg0, int arg1, int arg2) {
        int var3 = method2059(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("mi.ac(IIII)I")
    public static int method5989(int arg0, int arg1, int arg2) {
        int var3 = method2059(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("jz.ai(IB)I")
    public static int method4709(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("ag.az(II)I")
    public static int method203(int arg0) {
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

    @ObfuscatedName("cc.ap(III)I")
    public static int method2064(int arg0, int arg1) {
        int var2 = arg0 >>> 31;
        return (arg0 + var2) / arg1 - var2;
    }
}

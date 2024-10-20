package deob;

@ObfuscatedName("hr")
public class class209 {

    @ObfuscatedName("hr.f")
    public static int[] field2467;

    static {
        new Object();
        field2467 = new int[33];
        field2467[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field2467[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class209() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fa.f(III)I")
    public static int method2995(int arg0, int arg1) {
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

    @ObfuscatedName("ja.o(III)I")
    public static int method4099(int arg0, int arg1) {
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

    @ObfuscatedName("jt.u(II)I")
    public static int method4067(int arg0) {
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
}

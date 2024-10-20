package deob;

@ObfuscatedName("ac")
public class class38 {

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.p(IIB)I")
    public static int method122(int arg0, int arg1) {
        class260 var2 = class260.method4016(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3596 >= 0) {
            return var2.field3596 | 0xFF000000;
        } else if (var2.field3602 >= 0) {
            int var3 = method214(Statics.field2029.method2109(var2.field3602), 96);
            return class137.field2035[var3] | 0xFF000000;
        } else if (var2.field3593 == 16711935) {
            return arg1;
        } else {
            int var4 = method175(var2.field3597, var2.field3591, var2.field3592);
            int var5 = method214(var4, 96);
            return class137.field2035[var5] | 0xFF000000;
        }
    }

    @ObfuscatedName("ax.m(IIB)I")
    public static int method214(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 / 128;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @ObfuscatedName("x.e(IIII)I")
    public static int method175(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @ObfuscatedName("c.g(IIII)I")
    public static final int method42(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}

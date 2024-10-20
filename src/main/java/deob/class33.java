package deob;

@ObfuscatedName("aw")
public class class33 {

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kh.u(IIB)I")
    public static int method4927(int arg0, int arg1) {
        class258 var2 = class258.method275(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3515 >= 0) {
            return var2.field3515 | 0xFF000000;
        } else if (var2.field3503 >= 0) {
            int var3 = method2839(Statics.field1770.method2516(var2.field3503), 96);
            return class131.field1759[var3] | 0xFF000000;
        } else if (var2.field3506 == 16711935) {
            return arg1;
        } else {
            int var4 = method3219(var2.field3509, var2.field3510, var2.field3514);
            byte var5 = 96;
            int var6;
            if (var4 == -2) {
                var6 = 12345678;
            } else if (var4 == -1) {
                if (var5 < 0) {
                    var5 = 0;
                } else if (var5 > 127) {
                    var5 = 127;
                }
                int var7 = 127 - var5;
                var6 = var7;
            } else {
                int var8 = (var4 & 0x7F) * var5 / 128;
                if (var8 < 2) {
                    var8 = 2;
                } else if (var8 > 126) {
                    var8 = 126;
                }
                var6 = (var4 & 0xFF80) + var8;
            }
            return class131.field1759[var6] | 0xFF000000;
        }
    }

    @ObfuscatedName("ey.f(IIB)I")
    public static int method2839(int arg0, int arg1) {
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

    @ObfuscatedName("fs.b(IIIB)I")
    public static int method3219(int arg0, int arg1, int arg2) {
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

package deob;

@ObfuscatedName("aa")
public class class39 {

    public class39() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fg.g(III)I")
    public static int method3027(int arg0, int arg1) {
        class287 var2 = class287.method3920(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3749 >= 0) {
            return var2.field3749 | 0xFF000000;
        } else if (var2.field3750 >= 0) {
            int var3 = method963(Statics.field1936.method2455(var2.field3750), 96);
            return class135.field1940[var3] | 0xFF000000;
        } else if (var2.field3746 == 16711935) {
            return arg1;
        } else {
            int var4 = method4519(var2.field3747, var2.field3751, var2.field3754);
            int var5 = method963(var4, 96);
            return class135.field1940[var5] | 0xFF000000;
        }
    }

    @ObfuscatedName("bl.e(III)I")
    public static int method963(int arg0, int arg1) {
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

    @ObfuscatedName("jn.b(IIII)I")
    public static int method4519(int arg0, int arg1, int arg2) {
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

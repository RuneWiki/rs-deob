package deob;

@ObfuscatedName("ah")
public class class33 {

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gs.f(III)I")
    public static int method3322(int arg0, int arg1) {
        class258 var2 = class258.method2052(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3475 >= 0) {
            return var2.field3475 | 0xFF000000;
        } else if (var2.field3471 >= 0) {
            int var3 = method1877(Statics.field1747.method2518(var2.field3471), 96);
            return class131.field1758[var3] | 0xFF000000;
        } else if (var2.field3468 == 16711935) {
            return arg1;
        } else {
            int var4 = method1981(var2.field3473, var2.field3466, var2.field3474);
            int var5 = method1877(var4, 96);
            return class131.field1758[var5] | 0xFF000000;
        }
    }

    @ObfuscatedName("cd.i(IIB)I")
    public static int method1877(int arg0, int arg1) {
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

    @ObfuscatedName("ck.y(IIIB)I")
    public static int method1981(int arg0, int arg1, int arg2) {
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

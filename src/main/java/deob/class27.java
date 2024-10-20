package deob;

@ObfuscatedName("at")
public class class27 {

    public class27() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dz.c(III)I")
    public static int method2549(int arg0, int arg1) {
        class275 var2 = class275.method3141(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3574 >= 0) {
            return var2.field3574 | 0xFF000000;
        } else if (var2.field3576 >= 0) {
            int var3 = method108(Statics.field1763.method2293(var2.field3576), 96);
            return class125.field1762[var3] | 0xFF000000;
        } else if (var2.field3571 == 16711935) {
            return arg1;
        } else {
            int var4 = method3162(var2.field3569, var2.field3572, var2.field3577);
            int var5 = method108(var4, 96);
            return class125.field1762[var5] | 0xFF000000;
        }
    }

    @ObfuscatedName("d.q(III)I")
    public static int method108(int arg0, int arg1) {
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

    @ObfuscatedName("ff.m(IIII)I")
    public static int method3162(int arg0, int arg1, int arg2) {
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

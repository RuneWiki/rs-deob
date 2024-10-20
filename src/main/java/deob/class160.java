package deob;

@ObfuscatedName("fe")
public class class160 {

    public class160() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.f(III)I")
    public static int method83(int arg0, int arg1) {
        class297 var2 = class297.method1709(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3701 >= 0) {
            return var2.field3701 | 0xFF000000;
        } else if (var2.field3699 >= 0) {
            int var3 = method1999(Statics.field1921.method3219(var2.field3699), 96);
            return class174.field1899[var3] | 0xFF000000;
        } else if (var2.field3705 == 16711935) {
            return arg1;
        } else {
            int var4 = method3345(var2.field3702, var2.field3703, var2.field3704);
            int var5 = method1999(var4, 96);
            return class174.field1899[var5] | 0xFF000000;
        }
    }

    @ObfuscatedName("dq.o(III)I")
    public static int method1999(int arg0, int arg1) {
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

    @ObfuscatedName("gh.u(IIII)I")
    public static int method3345(int arg0, int arg1, int arg2) {
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

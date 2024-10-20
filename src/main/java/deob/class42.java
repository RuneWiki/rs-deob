package deob;

@ObfuscatedName("ac")
public class class42 {

    public class42() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kx.m(III)I")
    public static int method4912(int arg0, int arg1) {
        class268 var2 = (class268) class268.field3533.method3127((long) arg0);
        class268 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3535.method3891(4, arg0);
            class268 var5 = new class268();
            if (var4 != null) {
                var5.method4501(new class310(var4), arg0);
            }
            var5.method4512();
            class268.field3533.method3137(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field3537 >= 0) {
            return var3.field3537 | 0xFF000000;
        } else if (var3.field3541 >= 0) {
            int var7 = Statics.field1804.method2588(var3.field3541);
            byte var8 = 96;
            int var9;
            if (var7 == -2) {
                var9 = 12345678;
            } else if (var7 == -1) {
                if (var8 < 0) {
                    var8 = 0;
                } else if (var8 > 127) {
                    var8 = 127;
                }
                int var10 = 127 - var8;
                var9 = var10;
            } else {
                int var11 = (var7 & 0x7F) * var8 / 128;
                if (var11 < 2) {
                    var11 = 2;
                } else if (var11 > 126) {
                    var11 = 126;
                }
                var9 = (var7 & 0xFF80) + var11;
            }
            return class140.field1789[var9] | 0xFF000000;
        } else if (var3.field3536 == 16711935) {
            return arg1;
        } else {
            int var13 = method2063(var3.field3538, var3.field3539, var3.field3540);
            byte var14 = 96;
            int var15;
            if (var13 == -2) {
                var15 = 12345678;
            } else if (var13 == -1) {
                if (var14 < 0) {
                    var14 = 0;
                } else if (var14 > 127) {
                    var14 = 127;
                }
                int var16 = 127 - var14;
                var15 = var16;
            } else {
                int var17 = (var13 & 0x7F) * var14 / 128;
                if (var17 < 2) {
                    var17 = 2;
                } else if (var17 > 126) {
                    var17 = 126;
                }
                var15 = (var13 & 0xFF80) + var17;
            }
            return class140.field1789[var15] | 0xFF000000;
        }
    }

    @ObfuscatedName("cd.o(IIII)I")
    public static int method2063(int arg0, int arg1, int arg2) {
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

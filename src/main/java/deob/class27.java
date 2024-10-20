package deob;

@ObfuscatedName("af")
public class class27 {

    public class27() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("k.z(III)I")
    public static int method70(int arg0, int arg1) {
        class273 var2 = class273.method16(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3529 >= 0) {
            return var2.field3529 | 0xFF000000;
        } else if (var2.field3527 >= 0) {
            int var3 = Statics.field1668.method2356(var2.field3527);
            byte var4 = 96;
            int var5;
            if (var3 == -2) {
                var5 = 12345678;
            } else if (var3 == -1) {
                if (var4 < 0) {
                    var4 = 0;
                } else if (var4 > 127) {
                    var4 = 127;
                }
                int var6 = 127 - var4;
                var5 = var6;
            } else {
                int var7 = (var3 & 0x7F) * var4 / 128;
                if (var7 < 2) {
                    var7 = 2;
                } else if (var7 > 126) {
                    var7 = 126;
                }
                var5 = (var3 & 0xFF80) + var7;
            }
            return class123.field1676[var5] | 0xFF000000;
        } else if (var2.field3534 == 16711935) {
            return arg1;
        } else {
            int var9 = method4517(var2.field3526, var2.field3531, var2.field3532);
            byte var10 = 96;
            int var11;
            if (var9 == -2) {
                var11 = 12345678;
            } else if (var9 == -1) {
                if (var10 < 0) {
                    var10 = 0;
                } else if (var10 > 127) {
                    var10 = 127;
                }
                int var12 = 127 - var10;
                var11 = var12;
            } else {
                int var13 = (var9 & 0x7F) * var10 / 128;
                if (var13 < 2) {
                    var13 = 2;
                } else if (var13 > 126) {
                    var13 = 126;
                }
                var11 = (var9 & 0xFF80) + var13;
            }
            return class123.field1676[var11] | 0xFF000000;
        }
    }

    @ObfuscatedName("jk.w(IIII)I")
    public static int method4517(int arg0, int arg1, int arg2) {
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

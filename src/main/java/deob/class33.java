package deob;

@ObfuscatedName("an")
public class class33 {

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bn.s(III)I")
    public static int method937(int arg0, int arg1) {
        class258 var2 = (class258) class258.field3481.method3065((long) arg0);
        class258 var3;
        if (var2 == null) {
            byte[] var4 = Statics.field3489.method3790(4, arg0);
            class258 var5 = new class258();
            if (var4 != null) {
                var5.method4348(new class300(var4), arg0);
            }
            var5.method4349();
            class258.field3481.method3067(var5, (long) arg0);
            var3 = var5;
        } else {
            var3 = var2;
        }
        if (var3 == null) {
            return arg1;
        } else if (var3.field3484 >= 0) {
            return var3.field3484 | 0xFF000000;
        } else if (var3.field3482 >= 0) {
            int var7 = Statics.field1764.method2501(var3.field3482);
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
            return class131.field1763[var9] | 0xFF000000;
        } else if (var3.field3488 == 16711935) {
            return arg1;
        } else {
            int var13 = method181(var3.field3485, var3.field3486, var3.field3480);
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
            return class131.field1763[var15] | 0xFF000000;
        }
    }

    @ObfuscatedName("z.j(IIII)I")
    public static int method181(int arg0, int arg1, int arg2) {
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

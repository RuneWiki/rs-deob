package deob;

@ObfuscatedName("av")
public class class38 {

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.d(III)I")
    public static int method88(int arg0, int arg1) {
        class260 var2 = class260.method548(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3596 >= 0) {
            return var2.field3596 | 0xFF000000;
        } else if (var2.field3594 >= 0) {
            int var3 = Statics.field2019.method2241(var2.field3594);
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
            return class135.field2003[var5] | 0xFF000000;
        } else if (var2.field3593 == 16711935) {
            return arg1;
        } else {
            int var9 = var2.field3603;
            int var10 = var2.field3597;
            int var11 = var2.field3599;
            if (var11 > 179) {
                var10 /= 2;
            }
            if (var11 > 192) {
                var10 /= 2;
            }
            if (var11 > 217) {
                var10 /= 2;
            }
            if (var11 > 243) {
                var10 /= 2;
            }
            int var12 = var11 / 2 + (var9 / 4 << 10) + (var10 / 32 << 7);
            byte var15 = 96;
            int var16;
            if (var12 == -2) {
                var16 = 12345678;
            } else if (var12 == -1) {
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 127) {
                    var15 = 127;
                }
                int var17 = 127 - var15;
                var16 = var17;
            } else {
                int var18 = (var12 & 0x7F) * var15 / 128;
                if (var18 < 2) {
                    var18 = 2;
                } else if (var18 > 126) {
                    var18 = 126;
                }
                var16 = (var12 & 0xFF80) + var18;
            }
            return class135.field2003[var16] | 0xFF000000;
        }
    }
}

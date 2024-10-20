package deob;

@ObfuscatedName("az")
public class class38 {

    public class38() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hu.w(III)I")
    public static int method3688(int arg0, int arg1) {
        class263 var2 = class263.method3829(arg0);
        if (var2 == null) {
            return arg1;
        } else if (var2.field3608 >= 0) {
            return var2.field3608 | 0xFF000000;
        } else if (var2.field3611 >= 0) {
            int var3 = Statics.field2040.method2136(var2.field3611);
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
            return class137.field2018[var5] | 0xFF000000;
        } else if (var2.field3605 == 16711935) {
            return arg1;
        } else {
            int var9 = Statics.method1006(var2.field3609, var2.field3610, var2.field3615);
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
            return class137.field2018[var11] | 0xFF000000;
        }
    }
}

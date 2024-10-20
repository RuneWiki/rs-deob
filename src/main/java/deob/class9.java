package deob;

import java.io.IOException;

@ObfuscatedName("w")
public class class9 {

    @ObfuscatedName("w.m")
    public static int field152 = 2;

    @ObfuscatedName("w.k")
    public boolean field145;

    @ObfuscatedName("w.y")
    public boolean field146;

    public class9() {
        this.method107(true);
    }

    public class9(class104 arg0) {
        if (arg0 == null || arg0.field1808 == null) {
            this.method107(true);
        } else {
            int var2 = arg0.method2190();
            if (var2 >= 0 && var2 <= field152) {
                if (arg0.method2190() == 1) {
                    this.field145 = true;
                }
                if (var2 > 1) {
                    this.field146 = arg0.method2190() == 1;
                }
            } else {
                this.method107(true);
            }
        }
    }

    @ObfuscatedName("w.m(ZB)V")
    public void method107(boolean arg0) {
    }

    @ObfuscatedName("w.k(I)Lcb;")
    public class104 method119() {
        class104 var1 = new class104(100);
        var1.method2133(field152);
        var1.method2133(this.field145 ? 1 : 0);
        var1.method2133(this.field146 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("dx.y(I)Lw;")
    public static class9 method2438() {
        class185 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class133.method965("", Statics.field253.field2100, false);
            byte[] var2 = new byte[(int) var0.method3355()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3353(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class104(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3351();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("v.g(I)V")
    public static void method165() {
        class185 var0 = null;
        try {
            var0 = class133.method965("", Statics.field253.field2100, true);
            class104 var1 = Statics.field1858.method119();
            var0.method3350(var1.field1808, 0, var1.field1806);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3351();
            }
        } catch (Exception var4) {
        }
    }
}

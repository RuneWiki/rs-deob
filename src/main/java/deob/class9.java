package deob;

import java.io.IOException;

@ObfuscatedName("r")
public class class9 {

    @ObfuscatedName("r.y")
    public static int field143 = 2;

    @ObfuscatedName("r.u")
    public boolean field141;

    @ObfuscatedName("r.k")
    public boolean field142;

    public class9() {
        this.method85(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1856 == null) {
            this.method85(true);
        } else {
            int var2 = arg0.method2109();
            if (var2 >= 0 && var2 <= field143) {
                if (arg0.method2109() == 1) {
                    this.field141 = true;
                }
                if (var2 > 1) {
                    this.field142 = arg0.method2109() == 1;
                }
            } else {
                this.method85(true);
            }
        }
    }

    @ObfuscatedName("r.y(ZB)V")
    public void method85(boolean arg0) {
    }

    @ObfuscatedName("r.u(B)Ldo;")
    public class107 method86() {
        class107 var1 = new class107(100);
        var1.method2278(field143);
        var1.method2278(this.field141 ? 1 : 0);
        var1.method2278(this.field142 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("m.k(B)Lr;")
    public static class9 method146() {
        class192 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = Statics.method1865("", Statics.field674.field2128, false);
            byte[] var2 = new byte[(int) var0.method3382()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3383(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class107(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3381();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("au.v(I)V")
    public static void method564() {
        class192 var0 = null;
        try {
            var0 = Statics.method1865("", Statics.field674.field2128, true);
            class107 var1 = Statics.field559.method86();
            var0.method3386(var1.field1856, 0, var1.field1854);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3381();
            }
        } catch (Exception var4) {
        }
    }
}

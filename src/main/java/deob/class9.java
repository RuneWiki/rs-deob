package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("g")
public class class9 {

    @ObfuscatedName("g.b")
    public static int field137 = 3;

    @ObfuscatedName("g.i")
    public boolean field135;

    @ObfuscatedName("g.k")
    public boolean field134;

    @ObfuscatedName("g.h")
    public LinkedHashMap field131 = new LinkedHashMap();

    public class9() {
        this.method87(true);
    }

    public class9(class110 arg0) {
        if (arg0 == null || arg0.field1862 == null) {
            this.method87(true);
        } else {
            int var2 = arg0.method2142();
            if (var2 >= 0 && var2 <= field137) {
                if (arg0.method2142() == 1) {
                    this.field135 = true;
                }
                if (var2 > 1) {
                    this.field134 = arg0.method2142() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2142();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2195();
                        int var6 = arg0.method2195();
                        this.field131.put(var5, var6);
                    }
                }
            } else {
                this.method87(true);
            }
        }
    }

    @ObfuscatedName("g.b(ZB)V")
    public void method87(boolean arg0) {
    }

    @ObfuscatedName("g.e(I)Ldc;")
    public class110 method88() {
        class110 var1 = new class110(100);
        var1.method2203(field137);
        var1.method2203(this.field135 ? 1 : 0);
        var1.method2203(this.field134 ? 1 : 0);
        var1.method2203(this.field131.size());
        Iterator var2 = this.field131.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2131((Integer) var3.getKey());
            var1.method2131((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("y.i(B)Lg;")
    public static class9 method125() {
        class209 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class140.method2063("", Statics.field240.field2148, false);
            byte[] var2 = new byte[(int) var0.method3581()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3578(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class110(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3587();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("da.k(I)V")
    public static void method2557() {
        class209 var0 = null;
        try {
            var0 = class140.method2063("", Statics.field240.field2148, true);
            class110 var1 = Statics.field1422.method88();
            var0.method3575(var1.field1862, 0, var1.field1855);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3587();
            }
        } catch (Exception var4) {
        }
    }
}

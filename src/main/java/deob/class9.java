package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("p")
public class class9 {

    @ObfuscatedName("p.b")
    public static int field151 = 3;

    @ObfuscatedName("p.x")
    public boolean field140;

    @ObfuscatedName("p.j")
    public boolean field142;

    @ObfuscatedName("p.o")
    public LinkedHashMap field143 = new LinkedHashMap();

    public class9() {
        this.method106(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1844 == null) {
            this.method106(true);
        } else {
            int var2 = arg0.method2134();
            if (var2 >= 0 && var2 <= field151) {
                if (arg0.method2134() == 1) {
                    this.field140 = true;
                }
                if (var2 > 1) {
                    this.field142 = arg0.method2134() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2134();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2139();
                        int var6 = arg0.method2139();
                        this.field143.put(var5, var6);
                    }
                }
            } else {
                this.method106(true);
            }
        }
    }

    @ObfuscatedName("p.b(ZI)V")
    public void method106(boolean arg0) {
    }

    @ObfuscatedName("p.u(I)Ldh;")
    public class107 method99() {
        class107 var1 = new class107(100);
        var1.method2242(field151);
        var1.method2242(this.field140 ? 1 : 0);
        var1.method2242(this.field142 ? 1 : 0);
        var1.method2242(this.field143.size());
        Iterator var2 = this.field143.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2124((Integer) var3.getKey());
            var1.method2124((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("q.x(B)Lp;")
    public static class9 method131() {
        class193 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class136.method125("", Statics.field262.field2122, false);
            byte[] var2 = new byte[(int) var0.method3394()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3395(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class107(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3399();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ep.j(I)V")
    public static void method2680() {
        class193 var0 = null;
        try {
            var0 = class136.method125("", Statics.field262.field2122, true);
            class107 var1 = Statics.field250.method99();
            var0.method3392(var1.field1844, 0, var1.field1845);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3399();
            }
        } catch (Exception var4) {
        }
    }
}

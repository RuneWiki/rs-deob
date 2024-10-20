package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("t")
public class class9 {

    @ObfuscatedName("t.j")
    public static int field147 = 4;

    @ObfuscatedName("t.f")
    public boolean field143;

    @ObfuscatedName("t.l")
    public boolean field136;

    @ObfuscatedName("t.u")
    public int field133 = 1;

    @ObfuscatedName("t.a")
    public LinkedHashMap field138 = new LinkedHashMap();

    public class9() {
        this.method124(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1981 == null) {
            this.method124(true);
        } else {
            int var2 = arg0.method2372();
            if (var2 >= 0 && var2 <= field147) {
                if (arg0.method2372() == 1) {
                    this.field143 = true;
                }
                if (var2 > 1) {
                    this.field136 = arg0.method2372() == 1;
                }
                if (var2 > 3) {
                    this.field133 = arg0.method2372();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2372();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2377();
                        int var6 = arg0.method2377();
                        this.field138.put(var5, var6);
                    }
                }
            } else {
                this.method124(true);
            }
        }
    }

    @ObfuscatedName("t.j(ZI)V")
    public void method124(boolean arg0) {
    }

    @ObfuscatedName("t.m(B)Ldc;")
    public class119 method133() {
        class119 var1 = new class119(100);
        var1.method2357(field147);
        var1.method2357(this.field143 ? 1 : 0);
        var1.method2357(this.field136 ? 1 : 0);
        var1.method2357(this.field133);
        var1.method2357(this.field138.size());
        Iterator var2 = this.field138.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2360((Integer) var3.getKey());
            var1.method2360((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ey.f(I)Lt;")
    public static class9 method2841() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method1554("", Statics.field2688.field2276, false);
            byte[] var2 = new byte[(int) var0.method3903()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3904(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3910();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("dy.l(I)V")
    public static void method2680() {
        class227 var0 = null;
        try {
            var0 = class149.method1554("", Statics.field2688.field2276, true);
            class119 var1 = Statics.field2278.method133();
            var0.method3912(var1.field1981, 0, var1.field1982);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3910();
            }
        } catch (Exception var4) {
        }
    }
}

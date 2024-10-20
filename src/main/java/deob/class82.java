package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cq")
public class class82 {

    @ObfuscatedName("cq.e")
    public static int field1314 = 4;

    @ObfuscatedName("cq.m")
    public boolean field1313;

    @ObfuscatedName("cq.g")
    public boolean field1319;

    @ObfuscatedName("cq.d")
    public int field1315 = 1;

    @ObfuscatedName("cq.b")
    public LinkedHashMap field1312 = new LinkedHashMap();

    public class82() {
        this.method1443(true);
    }

    public class82(class174 arg0) {
        if (arg0 == null || arg0.field2373 == null) {
            this.method1443(true);
        } else {
            int var2 = arg0.method2891();
            if (var2 >= 0 && var2 <= field1314) {
                if (arg0.method2891() == 1) {
                    this.field1313 = true;
                }
                if (var2 > 1) {
                    this.field1319 = arg0.method2891() == 1;
                }
                if (var2 > 3) {
                    this.field1315 = arg0.method2891();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2891();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2896();
                        int var6 = arg0.method2896();
                        this.field1312.put(var5, var6);
                    }
                }
            } else {
                this.method1443(true);
            }
        }
    }

    @ObfuscatedName("cq.e(ZI)V")
    public void method1443(boolean arg0) {
    }

    @ObfuscatedName("cq.o(B)Lfw;")
    public class174 method1444() {
        class174 var1 = new class174(100);
        var1.method2876(field1314);
        var1.method2876(this.field1313 ? 1 : 0);
        var1.method2876(this.field1319 ? 1 : 0);
        var1.method2876(this.field1315);
        var1.method2876(this.field1312.size());
        Iterator var2 = this.field1312.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3055((Integer) var3.getKey());
            var1.method3055((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ba.m(B)Lcq;")
    public static class82 method1010() {
        class125 var0 = null;
        class82 var1 = new class82();
        try {
            var0 = class156.method1853("", Statics.field1105.field3174, false);
            byte[] var2 = new byte[(int) var0.method2139()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2140(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class82(new class174(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2145();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("cy.g(S)V")
    public static void method1400() {
        class125 var0 = null;
        try {
            var0 = class156.method1853("", Statics.field1105.field3174, true);
            class174 var1 = Statics.field527.method1444();
            var0.method2135(var1.field2373, 0, var1.field2370);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2145();
            }
        } catch (Exception var4) {
        }
    }
}

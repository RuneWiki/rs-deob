package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ci")
public class class82 {

    @ObfuscatedName("ci.d")
    public static int field1279 = 4;

    @ObfuscatedName("ci.x")
    public boolean field1278;

    @ObfuscatedName("ci.y")
    public boolean field1277;

    @ObfuscatedName("ci.e")
    public int field1276 = 1;

    @ObfuscatedName("ci.f")
    public LinkedHashMap field1281 = new LinkedHashMap();

    public class82() {
        this.method1454(true);
    }

    public class82(class174 arg0) {
        if (arg0 == null || arg0.field2367 == null) {
            this.method1454(true);
        } else {
            int var2 = arg0.method2921();
            if (var2 >= 0 && var2 <= field1279) {
                if (arg0.method2921() == 1) {
                    this.field1278 = true;
                }
                if (var2 > 1) {
                    this.field1277 = arg0.method2921() == 1;
                }
                if (var2 > 3) {
                    this.field1276 = arg0.method2921();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2921();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2935();
                        int var6 = arg0.method2935();
                        this.field1281.put(var5, var6);
                    }
                }
            } else {
                this.method1454(true);
            }
        }
    }

    @ObfuscatedName("ci.d(ZI)V")
    public void method1454(boolean arg0) {
    }

    @ObfuscatedName("ci.q(B)Lfw;")
    public class174 method1455() {
        class174 var1 = new class174(100);
        var1.method2899(field1279);
        var1.method2899(this.field1278 ? 1 : 0);
        var1.method2899(this.field1277 ? 1 : 0);
        var1.method2899(this.field1276);
        var1.method2899(this.field1281.size());
        Iterator var2 = this.field1281.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2902((Integer) var3.getKey());
            var1.method2902((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("m.x(I)Lci;")
    public static class82 method141() {
        class104 var0 = null;
        class82 var1 = new class82();
        try {
            var0 = class156.method535("", Statics.field1111.field3178, false);
            byte[] var2 = new byte[(int) var0.method1758()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method1759(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class82(new class174(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method1762();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("co.y(B)V")
    public static void method1605() {
        class104 var0 = null;
        try {
            var0 = class156.method535("", Statics.field1111.field3178, true);
            class174 var1 = Statics.field2320.method1455();
            var0.method1760(var1.field2367, 0, var1.field2364);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1762();
            }
        } catch (Exception var4) {
        }
    }
}

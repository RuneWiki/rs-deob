package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cd")
public class class79 {

    @ObfuscatedName("cd.o")
    public static int field1250 = 6;

    @ObfuscatedName("cd.t")
    public boolean field1241;

    @ObfuscatedName("cd.d")
    public boolean field1247;

    @ObfuscatedName("cd.h")
    public int field1245 = 1;

    @ObfuscatedName("cd.m")
    public String field1246 = null;

    @ObfuscatedName("cd.z")
    public boolean field1243 = false;

    @ObfuscatedName("cd.i")
    public LinkedHashMap field1248 = new LinkedHashMap();

    public class79() {
        this.method1582(true);
    }

    public class79(class195 arg0) {
        if (arg0 == null || arg0.field2574 == null) {
            this.method1582(true);
        } else {
            int var2 = arg0.method3205();
            if (var2 >= 0 && var2 <= field1250) {
                if (arg0.method3205() == 1) {
                    this.field1241 = true;
                }
                if (var2 > 1) {
                    this.field1247 = arg0.method3205() == 1;
                }
                if (var2 > 3) {
                    this.field1245 = arg0.method3205();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3205();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3254();
                        int var6 = arg0.method3254();
                        this.field1248.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1246 = arg0.method3213();
                }
                if (var2 > 5) {
                    this.field1243 = arg0.method3212();
                }
            } else {
                this.method1582(true);
            }
        }
    }

    @ObfuscatedName("cd.o(ZI)V")
    public void method1582(boolean arg0) {
    }

    @ObfuscatedName("cd.k(I)Lgc;")
    public class195 method1584() {
        class195 var1 = new class195(100);
        var1.method3189(field1250);
        var1.method3189(this.field1241 ? 1 : 0);
        var1.method3189(this.field1247 ? 1 : 0);
        var1.method3189(this.field1245);
        var1.method3189(this.field1248.size());
        Iterator var2 = this.field1248.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3405((Integer) var3.getKey());
            var1.method3405((Integer) var3.getValue());
        }
        var1.method3214(this.field1246 == null ? "" : this.field1246);
        var1.method3330(this.field1243);
        return var1;
    }

    @ObfuscatedName("bk.t(I)V")
    public static void method949() {
        class123 var0 = null;
        try {
            var0 = class168.method1723("", Statics.field3436.field3366, true);
            class195 var1 = Statics.field1142.method1584();
            var0.method2319(var1.field2574, 0, var1.field2575);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2322(true);
            }
        } catch (Exception var4) {
        }
    }
}

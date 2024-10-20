package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cg")
public class class79 {

    @ObfuscatedName("cg.d")
    public static int field1229 = 6;

    @ObfuscatedName("cg.n")
    public boolean field1224;

    @ObfuscatedName("cg.r")
    public boolean field1223;

    @ObfuscatedName("cg.e")
    public int field1226 = 1;

    @ObfuscatedName("cg.y")
    public String field1227 = null;

    @ObfuscatedName("cg.k")
    public boolean field1228 = false;

    @ObfuscatedName("cg.s")
    public LinkedHashMap field1225 = new LinkedHashMap();

    public class79() {
        this.method1563(true);
    }

    public class79(class195 arg0) {
        if (arg0 == null || arg0.field2569 == null) {
            this.method1563(true);
        } else {
            int var2 = arg0.method3330();
            if (var2 >= 0 && var2 <= field1229) {
                if (arg0.method3330() == 1) {
                    this.field1224 = true;
                }
                if (var2 > 1) {
                    this.field1223 = arg0.method3330() == 1;
                }
                if (var2 > 3) {
                    this.field1226 = arg0.method3330();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3330();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3264();
                        int var6 = arg0.method3264();
                        this.field1225.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1227 = arg0.method3267();
                }
                if (var2 > 5) {
                    this.field1228 = arg0.method3266();
                }
            } else {
                this.method1563(true);
            }
        }
    }

    @ObfuscatedName("cg.d(ZI)V")
    public void method1563(boolean arg0) {
    }

    @ObfuscatedName("cg.z(B)Lgy;")
    public class195 method1561() {
        class195 var1 = new class195(100);
        var1.method3243(field1229);
        var1.method3243(this.field1224 ? 1 : 0);
        var1.method3243(this.field1223 ? 1 : 0);
        var1.method3243(this.field1226);
        var1.method3243(this.field1225.size());
        Iterator var2 = this.field1225.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3326((Integer) var3.getKey());
            var1.method3326((Integer) var3.getValue());
        }
        var1.method3250(this.field1227 == null ? "" : this.field1227);
        var1.method3249(this.field1228);
        return var1;
    }

    @ObfuscatedName("bv.n(S)V")
    public static void method1027() {
        class123 var0 = null;
        try {
            var0 = class168.method1806("", Statics.field2119.field3357, true);
            class195 var1 = Statics.field663.method1561();
            var0.method2384(var1.field2569, 0, var1.field2568);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2368(true);
            }
        } catch (Exception var4) {
        }
    }
}

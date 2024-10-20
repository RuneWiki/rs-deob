package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("p")
public class class9 {

    @ObfuscatedName("p.z")
    public static int field137 = 3;

    @ObfuscatedName("p.a")
    public boolean field138;

    @ObfuscatedName("p.y")
    public boolean field141;

    @ObfuscatedName("p.i")
    public LinkedHashMap field139 = new LinkedHashMap();

    public class9() {
        this.method88(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1823 == null) {
            this.method88(true);
        } else {
            int var2 = arg0.method2122();
            if (var2 >= 0 && var2 <= field137) {
                if (arg0.method2122() == 1) {
                    this.field138 = true;
                }
                if (var2 > 1) {
                    this.field141 = arg0.method2122() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2122();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2127();
                        int var6 = arg0.method2127();
                        this.field139.put(var5, var6);
                    }
                }
            } else {
                this.method88(true);
            }
        }
    }

    @ObfuscatedName("p.z(ZI)V")
    public void method88(boolean arg0) {
    }

    @ObfuscatedName("p.j(I)Ldq;")
    public class107 method89() {
        class107 var1 = new class107(100);
        var1.method2108(field137);
        var1.method2108(this.field138 ? 1 : 0);
        var1.method2108(this.field141 ? 1 : 0);
        var1.method2108(this.field139.size());
        Iterator var2 = this.field139.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2111((Integer) var3.getKey());
            var1.method2111((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("bl.a(B)V")
    public static void method1408() {
        class193 var0 = null;
        try {
            var0 = Statics.method1854("", Statics.field2394.field2112, true);
            class107 var1 = Statics.field57.method89();
            var0.method3436(var1.field1823, 0, var1.field1819);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3437();
            }
        } catch (Exception var4) {
        }
    }
}

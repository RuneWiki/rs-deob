package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ca")
public class class82 {

    @ObfuscatedName("ca.p")
    public static int field1298 = 4;

    @ObfuscatedName("ca.e")
    public boolean field1300;

    @ObfuscatedName("ca.t")
    public boolean field1301;

    @ObfuscatedName("ca.w")
    public int field1304 = 1;

    @ObfuscatedName("ca.z")
    public LinkedHashMap field1303 = new LinkedHashMap();

    public class82() {
        this.method1408(true);
    }

    public class82(class174 arg0) {
        if (arg0 == null || arg0.field2415 == null) {
            this.method1408(true);
        } else {
            int var2 = arg0.method2810();
            if (var2 >= 0 && var2 <= field1298) {
                if (arg0.method2810() == 1) {
                    this.field1300 = true;
                }
                if (var2 > 1) {
                    this.field1301 = arg0.method2810() == 1;
                }
                if (var2 > 3) {
                    this.field1304 = arg0.method2810();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2810();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2803();
                        int var6 = arg0.method2803();
                        this.field1303.put(var5, var6);
                    }
                }
            } else {
                this.method1408(true);
            }
        }
    }

    @ObfuscatedName("ca.p(ZB)V")
    public void method1408(boolean arg0) {
    }

    @ObfuscatedName("ca.m(I)Lfr;")
    public class174 method1409() {
        class174 var1 = new class174(100);
        var1.method2961(field1298);
        var1.method2961(this.field1300 ? 1 : 0);
        var1.method2961(this.field1301 ? 1 : 0);
        var1.method2961(this.field1304);
        var1.method2961(this.field1303.size());
        Iterator var2 = this.field1303.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2798((Integer) var3.getKey());
            var1.method2798((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("z.e(I)V")
    public static void method17() {
        class125 var0 = null;
        try {
            var0 = class156.method2132("", Statics.field1170.field3201, true);
            class174 var1 = Statics.field1482.method1409();
            var0.method2091(var1.field2415, 0, var1.field2408);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2101();
            }
        } catch (Exception var4) {
        }
    }
}

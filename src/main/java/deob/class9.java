package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("y")
public class class9 {

    @ObfuscatedName("y.g")
    public static int field128 = 3;

    @ObfuscatedName("y.h")
    public boolean field122;

    @ObfuscatedName("y.m")
    public boolean field123;

    @ObfuscatedName("y.u")
    public LinkedHashMap field124 = new LinkedHashMap();

    public class9() {
        this.method113(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1839 == null) {
            this.method113(true);
        } else {
            int var2 = arg0.method2101();
            if (var2 >= 0 && var2 <= field128) {
                if (arg0.method2101() == 1) {
                    this.field122 = true;
                }
                if (var2 > 1) {
                    this.field123 = arg0.method2101() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2101();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2286();
                        int var6 = arg0.method2286();
                        this.field124.put(var5, var6);
                    }
                }
            } else {
                this.method113(true);
            }
        }
    }

    @ObfuscatedName("y.g(ZI)V")
    public void method113(boolean arg0) {
    }

    @ObfuscatedName("y.s(I)Ldi;")
    public class107 method107() {
        class107 var1 = new class107(100);
        var1.method2087(field128);
        var1.method2087(this.field122 ? 1 : 0);
        var1.method2087(this.field123 ? 1 : 0);
        var1.method2087(this.field124.size());
        Iterator var2 = this.field124.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2253((Integer) var3.getKey());
            var1.method2253((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ca.h(I)V")
    public static void method1862() {
        class196 var0 = null;
        try {
            var0 = class136.method2652("", Statics.field244.field2123, true);
            class107 var1 = Statics.field1979.method107();
            var0.method3426(var1.field1839, 0, var1.field1835);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3422();
            }
        } catch (Exception var4) {
        }
    }
}

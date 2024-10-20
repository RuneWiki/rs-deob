package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("o")
public class class9 {

    @ObfuscatedName("o.g")
    public static int field145 = 3;

    @ObfuscatedName("o.k")
    public boolean field140;

    @ObfuscatedName("o.e")
    public boolean field141;

    @ObfuscatedName("o.w")
    public LinkedHashMap field142 = new LinkedHashMap();

    public class9() {
        this.method105(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1843 == null) {
            this.method105(true);
        } else {
            int var2 = arg0.method2092();
            if (var2 >= 0 && var2 <= field145) {
                if (arg0.method2092() == 1) {
                    this.field140 = true;
                }
                if (var2 > 1) {
                    this.field141 = arg0.method2092() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2092();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2112();
                        int var6 = arg0.method2112();
                        this.field142.put(var5, var6);
                    }
                }
            } else {
                this.method105(true);
            }
        }
    }

    @ObfuscatedName("o.g(ZI)V")
    public void method105(boolean arg0) {
    }

    @ObfuscatedName("o.i(B)Ldk;")
    public class107 method104() {
        class107 var1 = new class107(100);
        var1.method2079(field145);
        var1.method2079(this.field140 ? 1 : 0);
        var1.method2079(this.field141 ? 1 : 0);
        var1.method2079(this.field142.size());
        Iterator var2 = this.field142.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2247((Integer) var3.getKey());
            var1.method2247((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("i.e(I)V")
    public static void method8() {
        class196 var0 = null;
        try {
            var0 = class136.method1337("", Statics.field329.field2139, true);
            class107 var1 = Statics.field1459.method104();
            var0.method3421(var1.field1843, 0, var1.field1844);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3424();
            }
        } catch (Exception var4) {
        }
    }
}

package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("aj")
public class class31 {

    @ObfuscatedName("aj.p")
    public static int field687 = 4;

    @ObfuscatedName("aj.x")
    public boolean field686;

    @ObfuscatedName("aj.q")
    public boolean field694;

    @ObfuscatedName("aj.d")
    public int field688 = 1;

    @ObfuscatedName("aj.k")
    public LinkedHashMap field689 = new LinkedHashMap();

    public class31() {
        this.method658(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2092 == null) {
            this.method658(true);
        } else {
            int var2 = arg0.method2593();
            if (var2 >= 0 && var2 <= field687) {
                if (arg0.method2593() == 1) {
                    this.field686 = true;
                }
                if (var2 > 1) {
                    this.field694 = arg0.method2593() == 1;
                }
                if (var2 > 3) {
                    this.field688 = arg0.method2593();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2593();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2598();
                        int var6 = arg0.method2598();
                        this.field689.put(var5, var6);
                    }
                }
            } else {
                this.method658(true);
            }
        }
    }

    @ObfuscatedName("aj.p(ZI)V")
    public void method658(boolean arg0) {
    }

    @ObfuscatedName("aj.g(I)Lev;")
    public class154 method655() {
        class154 var1 = new class154(100);
        var1.method2578(field687);
        var1.method2578(this.field686 ? 1 : 0);
        var1.method2578(this.field694 ? 1 : 0);
        var1.method2578(this.field688);
        var1.method2578(this.field689.size());
        Iterator var2 = this.field689.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2581((Integer) var3.getKey());
            var1.method2581((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("cc.x(B)V")
    public static void method1596() {
        class74 var0 = null;
        try {
            var0 = class105.method715("", Statics.field2108.field2689, true);
            class154 var1 = Statics.field1734.method655();
            var0.method1304(var1.field2092, 0, var1.field2098);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1305();
            }
        } catch (Exception var4) {
        }
    }
}

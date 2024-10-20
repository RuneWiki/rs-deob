package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ax")
public class class31 {

    @ObfuscatedName("ax.x")
    public static int field715 = 4;

    @ObfuscatedName("ax.c")
    public boolean field718;

    @ObfuscatedName("ax.d")
    public boolean field713;

    @ObfuscatedName("ax.w")
    public int field716 = 1;

    @ObfuscatedName("ax.h")
    public LinkedHashMap field723 = new LinkedHashMap();

    public class31() {
        this.method680(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2091 == null) {
            this.method680(true);
        } else {
            int var2 = arg0.method2701();
            if (var2 >= 0 && var2 <= field715) {
                if (arg0.method2701() == 1) {
                    this.field718 = true;
                }
                if (var2 > 1) {
                    this.field713 = arg0.method2701() == 1;
                }
                if (var2 > 3) {
                    this.field716 = arg0.method2701();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2701();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2644();
                        int var6 = arg0.method2644();
                        this.field723.put(var5, var6);
                    }
                }
            } else {
                this.method680(true);
            }
        }
    }

    @ObfuscatedName("ax.x(ZI)V")
    public void method680(boolean arg0) {
    }

    @ObfuscatedName("ax.j(I)Lek;")
    public class154 method675() {
        class154 var1 = new class154(100);
        var1.method2651(field715);
        var1.method2651(this.field718 ? 1 : 0);
        var1.method2651(this.field713 ? 1 : 0);
        var1.method2651(this.field716);
        var1.method2651(this.field723.size());
        Iterator var2 = this.field723.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2627((Integer) var3.getKey());
            var1.method2627((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("x.c(I)V")
    public static void method11() {
        class74 var0 = null;
        try {
            var0 = class105.method34("", Statics.field219.field2678, true);
            class154 var1 = Statics.field85.method675();
            var0.method1396(var1.field2091, 0, var1.field2086);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1394();
            }
        } catch (Exception var4) {
        }
    }
}

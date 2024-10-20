package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ay")
public class class31 {

    @ObfuscatedName("ay.i")
    public static int field691 = 4;

    @ObfuscatedName("ay.f")
    public boolean field690;

    @ObfuscatedName("ay.k")
    public boolean field693;

    @ObfuscatedName("ay.g")
    public int field692 = 1;

    @ObfuscatedName("ay.n")
    public LinkedHashMap field688 = new LinkedHashMap();

    public class31() {
        this.method633(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2094 == null) {
            this.method633(true);
        } else {
            int var2 = arg0.method2573();
            if (var2 >= 0 && var2 <= field691) {
                if (arg0.method2573() == 1) {
                    this.field690 = true;
                }
                if (var2 > 1) {
                    this.field693 = arg0.method2573() == 1;
                }
                if (var2 > 3) {
                    this.field692 = arg0.method2573();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2573();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2658();
                        int var6 = arg0.method2658();
                        this.field688.put(var5, var6);
                    }
                }
            } else {
                this.method633(true);
            }
        }
    }

    @ObfuscatedName("ay.i(ZB)V")
    public void method633(boolean arg0) {
    }

    @ObfuscatedName("ay.e(I)Let;")
    public class154 method623() {
        class154 var1 = new class154(100);
        var1.method2746(field691);
        var1.method2746(this.field690 ? 1 : 0);
        var1.method2746(this.field693 ? 1 : 0);
        var1.method2746(this.field692);
        var1.method2746(this.field688.size());
        Iterator var2 = this.field688.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2562((Integer) var3.getKey());
            var1.method2562((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("al.f(I)V")
    public static void method748() {
        class74 var0 = null;
        try {
            var0 = class105.method677("", Statics.field227.field2688, true);
            class154 var1 = Statics.field2045.method623();
            var0.method1310(var1.field2094, 0, var1.field2091);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1311();
            }
        } catch (Exception var4) {
        }
    }
}

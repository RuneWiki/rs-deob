package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("u")
public class class9 {

    @ObfuscatedName("u.k")
    public static int field142 = 4;

    @ObfuscatedName("u.f")
    public boolean field139;

    @ObfuscatedName("u.c")
    public boolean field141;

    @ObfuscatedName("u.v")
    public int field137 = 1;

    @ObfuscatedName("u.j")
    public LinkedHashMap field140 = new LinkedHashMap();

    public class9() {
        this.method95(true);
    }

    public class9(class123 arg0) {
        if (arg0 == null || arg0.field2054 == null) {
            this.method95(true);
        } else {
            int var2 = arg0.method2427();
            if (var2 >= 0 && var2 <= field142) {
                if (arg0.method2427() == 1) {
                    this.field139 = true;
                }
                if (var2 > 1) {
                    this.field141 = arg0.method2427() == 1;
                }
                if (var2 > 3) {
                    this.field137 = arg0.method2427();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2427();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2432();
                        int var6 = arg0.method2432();
                        this.field140.put(var5, var6);
                    }
                }
            } else {
                this.method95(true);
            }
        }
    }

    @ObfuscatedName("u.k(ZB)V")
    public void method95(boolean arg0) {
    }

    @ObfuscatedName("u.q(I)Lde;")
    public class123 method96() {
        class123 var1 = new class123(100);
        var1.method2412(field142);
        var1.method2412(this.field139 ? 1 : 0);
        var1.method2412(this.field141 ? 1 : 0);
        var1.method2412(this.field137);
        var1.method2412(this.field140.size());
        Iterator var2 = this.field140.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2415((Integer) var3.getKey());
            var1.method2415((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("hl.f(I)V")
    public static void method3732() {
        class231 var0 = null;
        try {
            var0 = class153.method2363("", Statics.field281.field2329, true);
            class123 var1 = Statics.field2103.method96();
            var0.method3890(var1.field2054, 0, var1.field2060);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3891();
            }
        } catch (Exception var4) {
        }
    }
}

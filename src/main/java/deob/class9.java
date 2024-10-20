package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("k")
public class class9 {

    @ObfuscatedName("k.i")
    public static int field143 = 4;

    @ObfuscatedName("k.f")
    public boolean field150;

    @ObfuscatedName("k.h")
    public boolean field142;

    @ObfuscatedName("k.a")
    public int field146 = 1;

    @ObfuscatedName("k.s")
    public LinkedHashMap field144 = new LinkedHashMap();

    public class9() {
        this.method111(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1988 == null) {
            this.method111(true);
        } else {
            int var2 = arg0.method2310();
            if (var2 >= 0 && var2 <= field143) {
                if (arg0.method2310() == 1) {
                    this.field150 = true;
                }
                if (var2 > 1) {
                    this.field142 = arg0.method2310() == 1;
                }
                if (var2 > 3) {
                    this.field146 = arg0.method2310();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2310();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2315();
                        int var6 = arg0.method2315();
                        this.field144.put(var5, var6);
                    }
                }
            } else {
                this.method111(true);
            }
        }
    }

    @ObfuscatedName("k.i(ZB)V")
    public void method111(boolean arg0) {
    }

    @ObfuscatedName("k.v(B)Ldj;")
    public class119 method108() {
        class119 var1 = new class119(100);
        var1.method2296(field143);
        var1.method2296(this.field150 ? 1 : 0);
        var1.method2296(this.field142 ? 1 : 0);
        var1.method2296(this.field146);
        var1.method2296(this.field144.size());
        Iterator var2 = this.field144.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2299((Integer) var3.getKey());
            var1.method2299((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("cr.f(B)V")
    public static void method2088() {
        class227 var0 = null;
        try {
            var0 = class149.method2241("", Statics.field294.field2282, true);
            class119 var1 = Statics.field187.method108();
            var0.method3824(var1.field1988, 0, var1.field1984);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3813();
            }
        } catch (Exception var4) {
        }
    }
}

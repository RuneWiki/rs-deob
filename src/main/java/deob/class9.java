package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("q")
public class class9 {

    @ObfuscatedName("q.a")
    public static int field152 = 4;

    @ObfuscatedName("q.d")
    public boolean field148;

    @ObfuscatedName("q.c")
    public boolean field155;

    @ObfuscatedName("q.y")
    public int field146 = 1;

    @ObfuscatedName("q.k")
    public LinkedHashMap field151 = new LinkedHashMap();

    public class9() {
        this.method142(true);
    }

    public class9(class120 arg0) {
        if (arg0 == null || arg0.field1994 == null) {
            this.method142(true);
        } else {
            int var2 = arg0.method2462();
            if (var2 >= 0 && var2 <= field152) {
                if (arg0.method2462() == 1) {
                    this.field148 = true;
                }
                if (var2 > 1) {
                    this.field155 = arg0.method2462() == 1;
                }
                if (var2 > 3) {
                    this.field146 = arg0.method2462();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2462();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2467();
                        int var6 = arg0.method2467();
                        this.field151.put(var5, var6);
                    }
                }
            } else {
                this.method142(true);
            }
        }
    }

    @ObfuscatedName("q.a(ZI)V")
    public void method142(boolean arg0) {
    }

    @ObfuscatedName("q.w(S)Ldx;")
    public class120 method141() {
        class120 var1 = new class120(100);
        var1.method2452(field152);
        var1.method2452(this.field148 ? 1 : 0);
        var1.method2452(this.field155 ? 1 : 0);
        var1.method2452(this.field146);
        var1.method2452(this.field151.size());
        Iterator var2 = this.field151.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2635((Integer) var3.getKey());
            var1.method2635((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ho.d(B)V")
    public static void method3770() {
        class228 var0 = null;
        try {
            var0 = class150.method186("", Statics.field22.field2281, true);
            class120 var1 = Statics.field2079.method141();
            var0.method3933(var1.field1994, 0, var1.field1993);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3934();
            }
        } catch (Exception var4) {
        }
    }
}

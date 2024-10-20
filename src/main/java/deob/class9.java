package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("k")
public class class9 {

    @ObfuscatedName("k.s")
    public static int field146 = 4;

    @ObfuscatedName("k.p")
    public boolean field149;

    @ObfuscatedName("k.x")
    public boolean field144;

    @ObfuscatedName("k.d")
    public int field145 = 1;

    @ObfuscatedName("k.u")
    public LinkedHashMap field147 = new LinkedHashMap();

    public class9() {
        this.method111(true);
    }

    public class9(class120 arg0) {
        if (arg0 == null || arg0.field2008 == null) {
            this.method111(true);
        } else {
            int var2 = arg0.method2338();
            if (var2 >= 0 && var2 <= field146) {
                if (arg0.method2338() == 1) {
                    this.field149 = true;
                }
                if (var2 > 1) {
                    this.field144 = arg0.method2338() == 1;
                }
                if (var2 > 3) {
                    this.field145 = arg0.method2338();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2338();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2343();
                        int var6 = arg0.method2343();
                        this.field147.put(var5, var6);
                    }
                }
            } else {
                this.method111(true);
            }
        }
    }

    @ObfuscatedName("k.s(ZI)V")
    public void method111(boolean arg0) {
    }

    @ObfuscatedName("k.j(B)Lds;")
    public class120 method103() {
        class120 var1 = new class120(100);
        var1.method2323(field146);
        var1.method2323(this.field149 ? 1 : 0);
        var1.method2323(this.field144 ? 1 : 0);
        var1.method2323(this.field145);
        var1.method2323(this.field147.size());
        Iterator var2 = this.field147.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2326((Integer) var3.getKey());
            var1.method2326((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("b.p(I)V")
    public static void method99() {
        class228 var0 = null;
        try {
            var0 = class150.method609("", Statics.field460.field2293, true);
            class120 var1 = Statics.field1389.method103();
            var0.method3838(var1.field2008, 0, var1.field2006);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3853();
            }
        } catch (Exception var4) {
        }
    }
}

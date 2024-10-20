package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("n")
public class class9 {

    @ObfuscatedName("n.a")
    public static int field150 = 3;

    @ObfuscatedName("n.i")
    public boolean field142;

    @ObfuscatedName("n.b")
    public boolean field147;

    @ObfuscatedName("n.l")
    public LinkedHashMap field144 = new LinkedHashMap();

    public class9() {
        this.method101(true);
    }

    public class9(class110 arg0) {
        if (arg0 == null || arg0.field1865 == null) {
            this.method101(true);
        } else {
            int var2 = arg0.method2199();
            if (var2 >= 0 && var2 <= field150) {
                if (arg0.method2199() == 1) {
                    this.field142 = true;
                }
                if (var2 > 1) {
                    this.field147 = arg0.method2199() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2199();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2136();
                        int var6 = arg0.method2136();
                        this.field144.put(var5, var6);
                    }
                }
            } else {
                this.method101(true);
            }
        }
    }

    @ObfuscatedName("n.a(ZI)V")
    public void method101(boolean arg0) {
    }

    @ObfuscatedName("n.v(I)Ldi;")
    public class110 method103() {
        class110 var1 = new class110(100);
        var1.method2117(field150);
        var1.method2117(this.field142 ? 1 : 0);
        var1.method2117(this.field147 ? 1 : 0);
        var1.method2117(this.field144.size());
        Iterator var2 = this.field144.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2120((Integer) var3.getKey());
            var1.method2120((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("p.i(I)V")
    public static void method531() {
        class209 var0 = null;
        try {
            var0 = class140.method906("", Statics.field283.field2165, true);
            class110 var1 = Statics.field101.method103();
            var0.method3531(var1.field1865, 0, var1.field1861);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3530();
            }
        } catch (Exception var4) {
        }
    }
}

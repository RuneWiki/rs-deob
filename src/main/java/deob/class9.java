package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("o")
public class class9 {

    @ObfuscatedName("o.k")
    public static int field137 = 3;

    @ObfuscatedName("o.e")
    public boolean field136;

    @ObfuscatedName("o.i")
    public boolean field138;

    @ObfuscatedName("o.t")
    public LinkedHashMap field140 = new LinkedHashMap();

    public class9() {
        this.method95(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1857 == null) {
            this.method95(true);
        } else {
            int var2 = arg0.method2115();
            if (var2 >= 0 && var2 <= field137) {
                if (arg0.method2115() == 1) {
                    this.field136 = true;
                }
                if (var2 > 1) {
                    this.field138 = arg0.method2115() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2115();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2120();
                        int var6 = arg0.method2120();
                        this.field140.put(var5, var6);
                    }
                }
            } else {
                this.method95(true);
            }
        }
    }

    @ObfuscatedName("o.k(ZI)V")
    public void method95(boolean arg0) {
    }

    @ObfuscatedName("o.b(S)Ldi;")
    public class107 method96() {
        class107 var1 = new class107(100);
        var1.method2102(field137);
        var1.method2102(this.field136 ? 1 : 0);
        var1.method2102(this.field138 ? 1 : 0);
        var1.method2102(this.field140.size());
        Iterator var2 = this.field140.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2303((Integer) var3.getKey());
            var1.method2303((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("b.e(I)V")
    public static void method2() {
        class195 var0 = null;
        try {
            var0 = class136.method32("", Statics.field257.field2129, true);
            class107 var1 = Statics.field30.method96();
            var0.method3466(var1.field1857, 0, var1.field1862);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3451();
            }
        } catch (Exception var4) {
        }
    }
}

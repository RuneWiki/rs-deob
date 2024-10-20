package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("t")
public class class9 {

    @ObfuscatedName("t.n")
    public static int field150 = 4;

    @ObfuscatedName("t.a")
    public boolean field147;

    @ObfuscatedName("t.m")
    public boolean field148;

    @ObfuscatedName("t.s")
    public int field152 = 1;

    @ObfuscatedName("t.j")
    public LinkedHashMap field149 = new LinkedHashMap();

    public class9() {
        this.method102(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1904 == null) {
            this.method102(true);
        } else {
            int var2 = arg0.method2211();
            if (var2 >= 0 && var2 <= field150) {
                if (arg0.method2211() == 1) {
                    this.field147 = true;
                }
                if (var2 > 1) {
                    this.field148 = arg0.method2211() == 1;
                }
                if (var2 > 3) {
                    this.field152 = arg0.method2211();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2211();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2366();
                        int var6 = arg0.method2366();
                        this.field149.put(var5, var6);
                    }
                }
            } else {
                this.method102(true);
            }
        }
    }

    @ObfuscatedName("t.n(ZI)V")
    public void method102(boolean arg0) {
    }

    @ObfuscatedName("t.g(I)Ldp;")
    public class111 method103() {
        class111 var1 = new class111(100);
        var1.method2326(field150);
        var1.method2326(this.field147 ? 1 : 0);
        var1.method2326(this.field148 ? 1 : 0);
        var1.method2326(this.field152);
        var1.method2326(this.field149.size());
        Iterator var2 = this.field149.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2204((Integer) var3.getKey());
            var1.method2204((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("o.a(I)V")
    public static void method156() {
        class218 var0 = null;
        try {
            var0 = class141.method1076("", Statics.field136.field2177, true);
            class111 var1 = Statics.field134.method103();
            var0.method3768(var1.field1904, 0, var1.field1896);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3754();
            }
        } catch (Exception var4) {
        }
    }
}

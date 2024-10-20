package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("o")
public class class9 {

    @ObfuscatedName("o.q")
    public static int field139 = 3;

    @ObfuscatedName("o.h")
    public boolean field140;

    @ObfuscatedName("o.e")
    public boolean field136;

    @ObfuscatedName("o.n")
    public LinkedHashMap field132 = new LinkedHashMap();

    public class9() {
        this.method103(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1859 == null) {
            this.method103(true);
        } else {
            int var2 = arg0.method2231();
            if (var2 >= 0 && var2 <= field139) {
                if (arg0.method2231() == 1) {
                    this.field140 = true;
                }
                if (var2 > 1) {
                    this.field136 = arg0.method2231() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2231();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2153();
                        int var6 = arg0.method2153();
                        this.field132.put(var5, var6);
                    }
                }
            } else {
                this.method103(true);
            }
        }
    }

    @ObfuscatedName("o.q(ZI)V")
    public void method103(boolean arg0) {
    }

    @ObfuscatedName("o.s(B)Ldx;")
    public class111 method99() {
        class111 var1 = new class111(100);
        var1.method2133(field139);
        var1.method2133(this.field140 ? 1 : 0);
        var1.method2133(this.field136 ? 1 : 0);
        var1.method2133(this.field132.size());
        Iterator var2 = this.field132.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2136((Integer) var3.getKey());
            var1.method2136((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("m.h(I)V")
    public static void method91() {
        class217 var0 = null;
        try {
            var0 = class141.method546("", Statics.field1821.field2123, true);
            class111 var1 = Statics.field93.method99();
            var0.method3596(var1.field1859, 0, var1.field1852);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3584();
            }
        } catch (Exception var4) {
        }
    }
}

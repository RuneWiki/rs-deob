package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("m")
public class class9 {

    @ObfuscatedName("m.c")
    public static int field135 = 4;

    @ObfuscatedName("m.k")
    public boolean field133;

    @ObfuscatedName("m.t")
    public boolean field134;

    @ObfuscatedName("m.g")
    public int field140 = 1;

    @ObfuscatedName("m.o")
    public LinkedHashMap field136 = new LinkedHashMap();

    public class9() {
        this.method114(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1956 == null) {
            this.method114(true);
        } else {
            int var2 = arg0.method2291();
            if (var2 >= 0 && var2 <= field135) {
                if (arg0.method2291() == 1) {
                    this.field133 = true;
                }
                if (var2 > 1) {
                    this.field134 = arg0.method2291() == 1;
                }
                if (var2 > 3) {
                    this.field140 = arg0.method2291();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2291();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2296();
                        int var6 = arg0.method2296();
                        this.field136.put(var5, var6);
                    }
                }
            } else {
                this.method114(true);
            }
        }
    }

    @ObfuscatedName("m.c(ZI)V")
    public void method114(boolean arg0) {
    }

    @ObfuscatedName("m.h(B)Ldf;")
    public class119 method111() {
        class119 var1 = new class119(100);
        var1.method2276(field135);
        var1.method2276(this.field133 ? 1 : 0);
        var1.method2276(this.field134 ? 1 : 0);
        var1.method2276(this.field140);
        var1.method2276(this.field136.size());
        Iterator var2 = this.field136.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2484((Integer) var3.getKey());
            var1.method2484((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("cz.k(I)V")
    public static void method1993() {
        class227 var0 = null;
        try {
            var0 = class149.method1999("", Statics.field591.field2262, true);
            class119 var1 = Statics.field2046.method111();
            var0.method3832(var1.field1956, 0, var1.field1955);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3826();
            }
        } catch (Exception var4) {
        }
    }
}

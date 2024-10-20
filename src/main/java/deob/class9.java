package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("k")
public class class9 {

    @ObfuscatedName("k.o")
    public static int field134 = 4;

    @ObfuscatedName("k.g")
    public boolean field130;

    @ObfuscatedName("k.u")
    public boolean field133;

    @ObfuscatedName("k.q")
    public int field132 = 1;

    @ObfuscatedName("k.r")
    public LinkedHashMap field131 = new LinkedHashMap();

    public class9() {
        this.method99(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1860 == null) {
            this.method99(true);
        } else {
            int var2 = arg0.method2219();
            if (var2 >= 0 && var2 <= field134) {
                if (arg0.method2219() == 1) {
                    this.field130 = true;
                }
                if (var2 > 1) {
                    this.field133 = arg0.method2219() == 1;
                }
                if (var2 > 3) {
                    this.field132 = arg0.method2219();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2219();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2273();
                        int var6 = arg0.method2273();
                        this.field131.put(var5, var6);
                    }
                }
            } else {
                this.method99(true);
            }
        }
    }

    @ObfuscatedName("k.o(ZI)V")
    public void method99(boolean arg0) {
    }

    @ObfuscatedName("k.l(S)Ldk;")
    public class111 method104() {
        class111 var1 = new class111(100);
        var1.method2204(field134);
        var1.method2204(this.field130 ? 1 : 0);
        var1.method2204(this.field133 ? 1 : 0);
        var1.method2204(this.field132);
        var1.method2204(this.field131.size());
        Iterator var2 = this.field131.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2369((Integer) var3.getKey());
            var1.method2369((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("du.g(I)V")
    public static void method2588() {
        class218 var0 = null;
        try {
            var0 = class141.method2031("", Statics.field260.field2176, true);
            class111 var1 = Statics.field1877.method104();
            var0.method3740(var1.field1860, 0, var1.field1861);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3741();
            }
        } catch (Exception var4) {
        }
    }
}

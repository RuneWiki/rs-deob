package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("g")
public class class9 {

    @ObfuscatedName("g.m")
    public static int field135 = 4;

    @ObfuscatedName("g.y")
    public boolean field132;

    @ObfuscatedName("g.u")
    public boolean field133;

    @ObfuscatedName("g.k")
    public int field134 = 1;

    @ObfuscatedName("g.j")
    public LinkedHashMap field136 = new LinkedHashMap();

    public class9() {
        this.method102(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1959 == null) {
            this.method102(true);
        } else {
            int var2 = arg0.method2562();
            if (var2 >= 0 && var2 <= field135) {
                if (arg0.method2562() == 1) {
                    this.field132 = true;
                }
                if (var2 > 1) {
                    this.field133 = arg0.method2562() == 1;
                }
                if (var2 > 3) {
                    this.field134 = arg0.method2562();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2562();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2386();
                        int var6 = arg0.method2386();
                        this.field136.put(var5, var6);
                    }
                }
            } else {
                this.method102(true);
            }
        }
    }

    @ObfuscatedName("g.m(ZI)V")
    public void method102(boolean arg0) {
    }

    @ObfuscatedName("g.l(I)Ldx;")
    public class119 method105() {
        class119 var1 = new class119(100);
        var1.method2366(field135);
        var1.method2366(this.field132 ? 1 : 0);
        var1.method2366(this.field133 ? 1 : 0);
        var1.method2366(this.field134);
        var1.method2366(this.field136.size());
        Iterator var2 = this.field136.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2514((Integer) var3.getKey());
            var1.method2514((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("fo.y(I)V")
    public static void method3224() {
        class227 var0 = null;
        try {
            var0 = class149.method4("", Statics.field2560.field2256, true);
            class119 var1 = Statics.field2665.method105();
            var0.method3920(var1.field1959, 0, var1.field1955);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3921();
            }
        } catch (Exception var4) {
        }
    }
}

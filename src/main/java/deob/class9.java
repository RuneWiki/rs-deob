package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("w")
public class class9 {

    @ObfuscatedName("w.o")
    public static int field137 = 4;

    @ObfuscatedName("w.u")
    public boolean field133;

    @ObfuscatedName("w.b")
    public boolean field134;

    @ObfuscatedName("w.p")
    public int field135 = 1;

    @ObfuscatedName("w.s")
    public LinkedHashMap field136 = new LinkedHashMap();

    public class9() {
        this.method118(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1977 == null) {
            this.method118(true);
        } else {
            int var2 = arg0.method2427();
            if (var2 >= 0 && var2 <= field137) {
                if (arg0.method2427() == 1) {
                    this.field133 = true;
                }
                if (var2 > 1) {
                    this.field134 = arg0.method2427() == 1;
                }
                if (var2 > 3) {
                    this.field135 = arg0.method2427();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2427();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2342();
                        int var6 = arg0.method2342();
                        this.field136.put(var5, var6);
                    }
                }
            } else {
                this.method118(true);
            }
        }
    }

    @ObfuscatedName("w.o(ZB)V")
    public void method118(boolean arg0) {
    }

    @ObfuscatedName("w.e(I)Ldi;")
    public class119 method109() {
        class119 var1 = new class119(100);
        var1.method2322(field137);
        var1.method2322(this.field133 ? 1 : 0);
        var1.method2322(this.field134 ? 1 : 0);
        var1.method2322(this.field135);
        var1.method2322(this.field136.size());
        Iterator var2 = this.field136.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2327((Integer) var3.getKey());
            var1.method2327((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("y.u(I)V")
    public static void method96() {
        class227 var0 = null;
        try {
            var0 = class149.method2120("", Statics.field1946.field2285, true);
            class119 var1 = Statics.field2908.method109();
            var0.method3865(var1.field1977, 0, var1.field1974);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3866();
            }
        } catch (Exception var4) {
        }
    }
}

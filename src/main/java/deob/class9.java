package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("p")
public class class9 {

    @ObfuscatedName("p.o")
    public static int field149 = 4;

    @ObfuscatedName("p.i")
    public boolean field147;

    @ObfuscatedName("p.h")
    public boolean field154;

    @ObfuscatedName("p.q")
    public int field148 = 1;

    @ObfuscatedName("p.u")
    public LinkedHashMap field150 = new LinkedHashMap();

    public class9() {
        this.method88(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1989 == null) {
            this.method88(true);
        } else {
            int var2 = arg0.method2290();
            if (var2 >= 0 && var2 <= field149) {
                if (arg0.method2290() == 1) {
                    this.field147 = true;
                }
                if (var2 > 1) {
                    this.field154 = arg0.method2290() == 1;
                }
                if (var2 > 3) {
                    this.field148 = arg0.method2290();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2290();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2295();
                        int var6 = arg0.method2295();
                        this.field150.put(var5, var6);
                    }
                }
            } else {
                this.method88(true);
            }
        }
    }

    @ObfuscatedName("p.o(ZI)V")
    public void method88(boolean arg0) {
    }

    @ObfuscatedName("p.f(I)Ldc;")
    public class119 method89() {
        class119 var1 = new class119(100);
        var1.method2347(field149);
        var1.method2347(this.field147 ? 1 : 0);
        var1.method2347(this.field154 ? 1 : 0);
        var1.method2347(this.field148);
        var1.method2347(this.field150.size());
        Iterator var2 = this.field150.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2278((Integer) var3.getKey());
            var1.method2278((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("dq.i(B)V")
    public static void method2599() {
        class227 var0 = null;
        try {
            var0 = class149.method903("", Statics.field1957.field2273, true);
            class119 var1 = Statics.field1030.method89();
            var0.method3808(var1.field1989, 0, var1.field1984);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3809();
            }
        } catch (Exception var4) {
        }
    }
}

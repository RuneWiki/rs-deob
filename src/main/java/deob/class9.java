package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("o")
public class class9 {

    @ObfuscatedName("o.e")
    public static int field150 = 4;

    @ObfuscatedName("o.c")
    public boolean field154;

    @ObfuscatedName("o.h")
    public boolean field145;

    @ObfuscatedName("o.r")
    public int field149 = 1;

    @ObfuscatedName("o.a")
    public LinkedHashMap field148 = new LinkedHashMap();

    public class9() {
        this.method98(true);
    }

    public class9(class123 arg0) {
        if (arg0 == null || arg0.field2055 == null) {
            this.method98(true);
        } else {
            int var2 = arg0.method2464();
            if (var2 >= 0 && var2 <= field150) {
                if (arg0.method2464() == 1) {
                    this.field154 = true;
                }
                if (var2 > 1) {
                    this.field145 = arg0.method2464() == 1;
                }
                if (var2 > 3) {
                    this.field149 = arg0.method2464();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2464();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2468();
                        int var6 = arg0.method2468();
                        this.field148.put(var5, var6);
                    }
                }
            } else {
                this.method98(true);
            }
        }
    }

    @ObfuscatedName("o.e(ZI)V")
    public void method98(boolean arg0) {
    }

    @ObfuscatedName("o.l(I)Ldd;")
    public class123 method90() {
        class123 var1 = new class123(100);
        var1.method2649(field150);
        var1.method2649(this.field154 ? 1 : 0);
        var1.method2649(this.field145 ? 1 : 0);
        var1.method2649(this.field149);
        var1.method2649(this.field148.size());
        Iterator var2 = this.field148.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2452((Integer) var3.getKey());
            var1.method2452((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("az.c(B)V")
    public static void method1030() {
        class231 var0 = null;
        try {
            var0 = class153.method2327("", Statics.field373.field2336, true);
            class123 var1 = Statics.field572.method90();
            var0.method3961(var1.field2055, 0, var1.field2062);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3962();
            }
        } catch (Exception var4) {
        }
    }
}

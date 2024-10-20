package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("k")
public class class9 {

    @ObfuscatedName("k.p")
    public static int field125 = 3;

    @ObfuscatedName("k.d")
    public boolean field126;

    @ObfuscatedName("k.c")
    public boolean field127;

    @ObfuscatedName("k.r")
    public LinkedHashMap field128 = new LinkedHashMap();

    public class9() {
        this.method98(true);
    }

    public class9(class110 arg0) {
        if (arg0 == null || arg0.field1844 == null) {
            this.method98(true);
        } else {
            int var2 = arg0.method2309();
            if (var2 >= 0 && var2 <= field125) {
                if (arg0.method2309() == 1) {
                    this.field126 = true;
                }
                if (var2 > 1) {
                    this.field127 = arg0.method2309() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2309();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2164();
                        int var6 = arg0.method2164();
                        this.field128.put(var5, var6);
                    }
                }
            } else {
                this.method98(true);
            }
        }
    }

    @ObfuscatedName("k.p(ZI)V")
    public void method98(boolean arg0) {
    }

    @ObfuscatedName("k.y(I)Ldg;")
    public class110 method104() {
        class110 var1 = new class110(100);
        var1.method2110(field125);
        var1.method2110(this.field126 ? 1 : 0);
        var1.method2110(this.field127 ? 1 : 0);
        var1.method2110(this.field128.size());
        Iterator var2 = this.field128.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2113((Integer) var3.getKey());
            var1.method2113((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("gj.d(I)V")
    public static void method3364() {
        class209 var0 = null;
        try {
            var0 = class140.method561("", Statics.field330.field2136, true);
            class110 var1 = Statics.field1993.method104();
            var0.method3563(var1.field1844, 0, var1.field1842);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3564();
            }
        } catch (Exception var4) {
        }
    }
}

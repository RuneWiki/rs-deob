package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("y")
public class class9 {

    @ObfuscatedName("y.v")
    public static int field145 = 3;

    @ObfuscatedName("y.f")
    public boolean field144;

    @ObfuscatedName("y.j")
    public boolean field143;

    @ObfuscatedName("y.l")
    public LinkedHashMap field136 = new LinkedHashMap();

    public class9() {
        this.method92(true);
    }

    public class9(class110 arg0) {
        if (arg0 == null || arg0.field1853 == null) {
            this.method92(true);
        } else {
            int var2 = arg0.method2257();
            if (var2 >= 0 && var2 <= field145) {
                if (arg0.method2257() == 1) {
                    this.field144 = true;
                }
                if (var2 > 1) {
                    this.field143 = arg0.method2257() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2257();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2297();
                        int var6 = arg0.method2297();
                        this.field136.put(var5, var6);
                    }
                }
            } else {
                this.method92(true);
            }
        }
    }

    @ObfuscatedName("y.v(ZB)V")
    public void method92(boolean arg0) {
    }

    @ObfuscatedName("y.t(I)Ldp;")
    public class110 method85() {
        class110 var1 = new class110(100);
        var1.method2263(field145);
        var1.method2263(this.field144 ? 1 : 0);
        var1.method2263(this.field143 ? 1 : 0);
        var1.method2263(this.field136.size());
        Iterator var2 = this.field136.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2260((Integer) var3.getKey());
            var1.method2260((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("cj.f(B)V")
    public static void method1794() {
        class209 var0 = null;
        try {
            var0 = class140.method2484("", Statics.field1941.field2144, true);
            class110 var1 = Statics.field152.method85();
            var0.method3591(var1.field1853, 0, var1.field1847);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3579();
            }
        } catch (Exception var4) {
        }
    }
}

package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("r")
public class class9 {

    @ObfuscatedName("r.e")
    public static int field150 = 4;

    @ObfuscatedName("r.f")
    public boolean field147;

    @ObfuscatedName("r.s")
    public boolean field146;

    @ObfuscatedName("r.p")
    public int field149 = 1;

    @ObfuscatedName("r.h")
    public LinkedHashMap field145 = new LinkedHashMap();

    public class9() {
        this.method105(true);
    }

    public class9(class120 arg0) {
        if (arg0 == null || arg0.field1981 == null) {
            this.method105(true);
        } else {
            int var2 = arg0.method2355();
            if (var2 >= 0 && var2 <= field150) {
                if (arg0.method2355() == 1) {
                    this.field147 = true;
                }
                if (var2 > 1) {
                    this.field146 = arg0.method2355() == 1;
                }
                if (var2 > 3) {
                    this.field149 = arg0.method2355();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2355();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2360();
                        int var6 = arg0.method2360();
                        this.field145.put(var5, var6);
                    }
                }
            } else {
                this.method105(true);
            }
        }
    }

    @ObfuscatedName("r.e(ZI)V")
    public void method105(boolean arg0) {
    }

    @ObfuscatedName("r.w(I)Ldq;")
    public class120 method106() {
        class120 var1 = new class120(100);
        var1.method2397(field150);
        var1.method2397(this.field147 ? 1 : 0);
        var1.method2397(this.field146 ? 1 : 0);
        var1.method2397(this.field149);
        var1.method2397(this.field145.size());
        Iterator var2 = this.field145.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2449((Integer) var3.getKey());
            var1.method2449((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ac.f(I)V")
    public static void method890() {
        class228 var0 = null;
        try {
            var0 = class150.method2822("", Statics.field2658.field2279, true);
            class120 var1 = Statics.field866.method106();
            var0.method3826(var1.field1981, 0, var1.field1977);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3827();
            }
        } catch (Exception var4) {
        }
    }
}

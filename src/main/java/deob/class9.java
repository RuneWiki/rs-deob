package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("l")
public class class9 {

    @ObfuscatedName("l.n")
    public static int field146 = 4;

    @ObfuscatedName("l.a")
    public boolean field136;

    @ObfuscatedName("l.w")
    public boolean field137;

    @ObfuscatedName("l.m")
    public int field138 = 1;

    @ObfuscatedName("l.h")
    public LinkedHashMap field139 = new LinkedHashMap();

    public class9() {
        this.method100(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1889 == null) {
            this.method100(true);
        } else {
            int var2 = arg0.method2234();
            if (var2 >= 0 && var2 <= field146) {
                if (arg0.method2234() == 1) {
                    this.field136 = true;
                }
                if (var2 > 1) {
                    this.field137 = arg0.method2234() == 1;
                }
                if (var2 > 3) {
                    this.field138 = arg0.method2234();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2234();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2239();
                        int var6 = arg0.method2239();
                        this.field139.put(var5, var6);
                    }
                }
            } else {
                this.method100(true);
            }
        }
    }

    @ObfuscatedName("l.n(ZI)V")
    public void method100(boolean arg0) {
    }

    @ObfuscatedName("l.o(I)Ldl;")
    public class111 method94() {
        class111 var1 = new class111(100);
        var1.method2219(field146);
        var1.method2219(this.field136 ? 1 : 0);
        var1.method2219(this.field137 ? 1 : 0);
        var1.method2219(this.field138);
        var1.method2219(this.field139.size());
        Iterator var2 = this.field139.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2222((Integer) var3.getKey());
            var1.method2222((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ea.a(I)V")
    public static void method2700() {
        class218 var0 = null;
        try {
            var0 = class141.method1949("", Statics.field1324.field2184, true);
            class111 var1 = Statics.field1306.method94();
            var0.method3733(var1.field1889, 0, var1.field1890);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3724();
            }
        } catch (Exception var4) {
        }
    }
}

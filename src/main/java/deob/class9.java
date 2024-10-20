package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("g")
public class class9 {

    @ObfuscatedName("g.c")
    public static int field139 = 3;

    @ObfuscatedName("g.y")
    public boolean field138;

    @ObfuscatedName("g.r")
    public boolean field136;

    @ObfuscatedName("g.f")
    public LinkedHashMap field145 = new LinkedHashMap();

    public class9() {
        this.method96(true);
    }

    public class9(class108 arg0) {
        if (arg0 == null || arg0.field1830 == null) {
            this.method96(true);
        } else {
            int var2 = arg0.method2134();
            if (var2 >= 0 && var2 <= field139) {
                if (arg0.method2134() == 1) {
                    this.field138 = true;
                }
                if (var2 > 1) {
                    this.field136 = arg0.method2134() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2134();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2144();
                        int var6 = arg0.method2144();
                        this.field145.put(var5, var6);
                    }
                }
            } else {
                this.method96(true);
            }
        }
    }

    @ObfuscatedName("g.c(ZI)V")
    public void method96(boolean arg0) {
    }

    @ObfuscatedName("g.j(I)Ldx;")
    public class108 method87() {
        class108 var1 = new class108(100);
        var1.method2120(field139);
        var1.method2120(this.field138 ? 1 : 0);
        var1.method2120(this.field136 ? 1 : 0);
        var1.method2120(this.field145.size());
        Iterator var2 = this.field145.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2123((Integer) var3.getKey());
            var1.method2123((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("an.r(I)V")
    public static void method669() {
        class207 var0 = null;
        try {
            var0 = class138.method2724("", Statics.field415.field2125, true);
            class108 var1 = Statics.field2103.method87();
            var0.method3528(var1.field1830, 0, var1.field1826);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3529();
            }
        } catch (Exception var4) {
        }
    }
}

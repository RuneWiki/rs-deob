package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("c")
public class class9 {

    @ObfuscatedName("c.f")
    public static int field140 = 4;

    @ObfuscatedName("c.n")
    public boolean field150;

    @ObfuscatedName("c.t")
    public boolean field139;

    @ObfuscatedName("c.v")
    public int field137 = 1;

    @ObfuscatedName("c.b")
    public LinkedHashMap field141 = new LinkedHashMap();

    public class9() {
        this.method95(true);
    }

    public class9(class123 arg0) {
        if (arg0 == null || arg0.field2053 == null) {
            this.method95(true);
        } else {
            int var2 = arg0.method2522();
            if (var2 >= 0 && var2 <= field140) {
                if (arg0.method2522() == 1) {
                    this.field150 = true;
                }
                if (var2 > 1) {
                    this.field139 = arg0.method2522() == 1;
                }
                if (var2 > 3) {
                    this.field137 = arg0.method2522();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2522();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2404();
                        int var6 = arg0.method2404();
                        this.field141.put(var5, var6);
                    }
                }
            } else {
                this.method95(true);
            }
        }
    }

    @ObfuscatedName("c.f(ZI)V")
    public void method95(boolean arg0) {
    }

    @ObfuscatedName("c.e(I)Ldx;")
    public class123 method96() {
        class123 var1 = new class123(100);
        var1.method2384(field140);
        var1.method2384(this.field150 ? 1 : 0);
        var1.method2384(this.field139 ? 1 : 0);
        var1.method2384(this.field137);
        var1.method2384(this.field141.size());
        Iterator var2 = this.field141.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2387((Integer) var3.getKey());
            var1.method2387((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("q.n(I)V")
    public static void method188() {
        class231 var0 = null;
        try {
            var0 = class153.method767("", Statics.field2677.field2333, true);
            class123 var1 = Statics.field233.method96();
            var0.method3941(var1.field2053, 0, var1.field2052);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3942();
            }
        } catch (Exception var4) {
        }
    }
}

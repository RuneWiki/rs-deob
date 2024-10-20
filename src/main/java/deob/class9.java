package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("p")
public class class9 {

    @ObfuscatedName("p.x")
    public static int field145 = 4;

    @ObfuscatedName("p.j")
    public boolean field146;

    @ObfuscatedName("p.z")
    public boolean field137;

    @ObfuscatedName("p.i")
    public int field134 = 1;

    @ObfuscatedName("p.b")
    public LinkedHashMap field138 = new LinkedHashMap();

    public class9() {
        this.method115(true);
    }

    public class9(class123 arg0) {
        if (arg0 == null || arg0.field2056 == null) {
            this.method115(true);
        } else {
            int var2 = arg0.method2408();
            if (var2 >= 0 && var2 <= field145) {
                if (arg0.method2408() == 1) {
                    this.field146 = true;
                }
                if (var2 > 1) {
                    this.field137 = arg0.method2408() == 1;
                }
                if (var2 > 3) {
                    this.field134 = arg0.method2408();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2408();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2413();
                        int var6 = arg0.method2413();
                        this.field138.put(var5, var6);
                    }
                }
            } else {
                this.method115(true);
            }
        }
    }

    @ObfuscatedName("p.x(ZI)V")
    public void method115(boolean arg0) {
    }

    @ObfuscatedName("p.r(I)Ldp;")
    public class123 method111() {
        class123 var1 = new class123(100);
        var1.method2567(field145);
        var1.method2567(this.field146 ? 1 : 0);
        var1.method2567(this.field137 ? 1 : 0);
        var1.method2567(this.field134);
        var1.method2567(this.field138.size());
        Iterator var2 = this.field138.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2396((Integer) var3.getKey());
            var1.method2396((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("b.j(I)V")
    public static void method81() {
        class231 var0 = null;
        try {
            var0 = class153.method2099("", Statics.field776.field2340, true);
            class123 var1 = Statics.field2660.method111();
            var0.method3879(var1.field2056, 0, var1.field2057);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3880();
            }
        } catch (Exception var4) {
        }
    }
}

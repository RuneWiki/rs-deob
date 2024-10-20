package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("m")
public class class9 {

    @ObfuscatedName("m.e")
    public static int field144 = 3;

    @ObfuscatedName("m.i")
    public boolean field145;

    @ObfuscatedName("m.g")
    public boolean field146;

    @ObfuscatedName("m.x")
    public LinkedHashMap field147 = new LinkedHashMap();

    public class9() {
        this.method90(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1849 == null) {
            this.method90(true);
        } else {
            int var2 = arg0.method2226();
            if (var2 >= 0 && var2 <= field144) {
                if (arg0.method2226() == 1) {
                    this.field145 = true;
                }
                if (var2 > 1) {
                    this.field146 = arg0.method2226() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2226();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2121();
                        int var6 = arg0.method2121();
                        this.field147.put(var5, var6);
                    }
                }
            } else {
                this.method90(true);
            }
        }
    }

    @ObfuscatedName("m.e(ZB)V")
    public void method90(boolean arg0) {
    }

    @ObfuscatedName("m.v(I)Ldk;")
    public class107 method101() {
        class107 var1 = new class107(100);
        var1.method2102(field144);
        var1.method2102(this.field145 ? 1 : 0);
        var1.method2102(this.field146 ? 1 : 0);
        var1.method2102(this.field147.size());
        Iterator var2 = this.field147.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2137((Integer) var3.getKey());
            var1.method2137((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("cm.i(B)V")
    public static void method2044() {
        class195 var0 = null;
        try {
            var0 = class136.method555("", Statics.field72.field2109, true);
            class107 var1 = Statics.field75.method101();
            var0.method3391(var1.field1849, 0, var1.field1844);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3389();
            }
        } catch (Exception var4) {
        }
    }
}

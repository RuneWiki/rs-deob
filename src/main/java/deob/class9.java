package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("l")
public class class9 {

    @ObfuscatedName("l.g")
    public static int field149 = 3;

    @ObfuscatedName("l.v")
    public boolean field136;

    @ObfuscatedName("l.o")
    public boolean field137;

    @ObfuscatedName("l.k")
    public LinkedHashMap field138 = new LinkedHashMap();

    public class9() {
        this.method78(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1854 == null) {
            this.method78(true);
        } else {
            int var2 = arg0.method2116();
            if (var2 >= 0 && var2 <= field149) {
                if (arg0.method2116() == 1) {
                    this.field136 = true;
                }
                if (var2 > 1) {
                    this.field137 = arg0.method2116() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2116();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2097();
                        int var6 = arg0.method2097();
                        this.field138.put(var5, var6);
                    }
                }
            } else {
                this.method78(true);
            }
        }
    }

    @ObfuscatedName("l.g(ZI)V")
    public void method78(boolean arg0) {
    }

    @ObfuscatedName("l.s(I)Lde;")
    public class107 method87() {
        class107 var1 = new class107(100);
        var1.method2079(field149);
        var1.method2079(this.field136 ? 1 : 0);
        var1.method2079(this.field137 ? 1 : 0);
        var1.method2079(this.field138.size());
        Iterator var2 = this.field138.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2082((Integer) var3.getKey());
            var1.method2082((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("am.v(I)V")
    public static void method680() {
        class196 var0 = null;
        try {
            var0 = class136.method1840("", Statics.field265.field2142, true);
            class107 var1 = Statics.field939.method87();
            var0.method3401(var1.field1854, 0, var1.field1851);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3406();
            }
        } catch (Exception var4) {
        }
    }
}

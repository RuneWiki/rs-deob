package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("j")
public class class9 {

    @ObfuscatedName("j.t")
    public static int field132 = 3;

    @ObfuscatedName("j.f")
    public boolean field131;

    @ObfuscatedName("j.e")
    public boolean field137;

    @ObfuscatedName("j.d")
    public LinkedHashMap field133 = new LinkedHashMap();

    public class9() {
        this.method99(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1831 == null) {
            this.method99(true);
        } else {
            int var2 = arg0.method2101();
            if (var2 >= 0 && var2 <= field132) {
                if (arg0.method2101() == 1) {
                    this.field131 = true;
                }
                if (var2 > 1) {
                    this.field137 = arg0.method2101() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2101();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2106();
                        int var6 = arg0.method2106();
                        this.field133.put(var5, var6);
                    }
                }
            } else {
                this.method99(true);
            }
        }
    }

    @ObfuscatedName("j.t(ZB)V")
    public void method99(boolean arg0) {
    }

    @ObfuscatedName("j.s(B)Ldb;")
    public class107 method100() {
        class107 var1 = new class107(100);
        var1.method2214(field132);
        var1.method2214(this.field131 ? 1 : 0);
        var1.method2214(this.field137 ? 1 : 0);
        var1.method2214(this.field133.size());
        Iterator var2 = this.field133.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2090((Integer) var3.getKey());
            var1.method2090((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("en.f(I)V")
    public static void method2668() {
        class195 var0 = null;
        try {
            var0 = class136.method484("", Statics.field1896.field2111, true);
            class107 var1 = Statics.field1815.method100();
            var0.method3456(var1.field1831, 0, var1.field1830);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3435();
            }
        } catch (Exception var4) {
        }
    }
}

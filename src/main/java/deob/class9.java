package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("k")
public class class9 {

    @ObfuscatedName("k.h")
    public static int field158 = 4;

    @ObfuscatedName("k.v")
    public boolean field152;

    @ObfuscatedName("k.n")
    public boolean field154;

    @ObfuscatedName("k.f")
    public int field150 = 1;

    @ObfuscatedName("k.g")
    public LinkedHashMap field155 = new LinkedHashMap();

    public class9() {
        this.method120(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1978 == null) {
            this.method120(true);
        } else {
            int var2 = arg0.method2383();
            if (var2 >= 0 && var2 <= field158) {
                if (arg0.method2383() == 1) {
                    this.field152 = true;
                }
                if (var2 > 1) {
                    this.field154 = arg0.method2383() == 1;
                }
                if (var2 > 3) {
                    this.field150 = arg0.method2383();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2383();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2388();
                        int var6 = arg0.method2388();
                        this.field155.put(var5, var6);
                    }
                }
            } else {
                this.method120(true);
            }
        }
    }

    @ObfuscatedName("k.h(ZI)V")
    public void method120(boolean arg0) {
    }

    @ObfuscatedName("k.q(I)Ldm;")
    public class119 method113() {
        class119 var1 = new class119(100);
        var1.method2499(field158);
        var1.method2499(this.field152 ? 1 : 0);
        var1.method2499(this.field154 ? 1 : 0);
        var1.method2499(this.field150);
        var1.method2499(this.field155.size());
        Iterator var2 = this.field155.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2556((Integer) var3.getKey());
            var1.method2556((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("dm.v(I)V")
    public static void method2589() {
        class227 var0 = null;
        try {
            var0 = Statics.method3301("", Statics.field299.field2277, true);
            class119 var1 = Statics.field2871.method113();
            var0.method3917(var1.field1978, 0, var1.field1973);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3909();
            }
        } catch (Exception var4) {
        }
    }
}

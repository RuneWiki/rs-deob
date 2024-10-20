package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("n")
public class class9 {

    @ObfuscatedName("n.g")
    public static int field139 = 3;

    @ObfuscatedName("n.z")
    public boolean field140;

    @ObfuscatedName("n.h")
    public boolean field141;

    @ObfuscatedName("n.k")
    public LinkedHashMap field142 = new LinkedHashMap();

    public class9() {
        this.method93(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1840 == null) {
            this.method93(true);
        } else {
            int var2 = arg0.method2139();
            if (var2 >= 0 && var2 <= field139) {
                if (arg0.method2139() == 1) {
                    this.field140 = true;
                }
                if (var2 > 1) {
                    this.field141 = arg0.method2139() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2139();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2144();
                        int var6 = arg0.method2144();
                        this.field142.put(var5, var6);
                    }
                }
            } else {
                this.method93(true);
            }
        }
    }

    @ObfuscatedName("n.g(ZI)V")
    public void method93(boolean arg0) {
    }

    @ObfuscatedName("n.v(I)Ldm;")
    public class107 method96() {
        class107 var1 = new class107(100);
        var1.method2126(field139);
        var1.method2126(this.field140 ? 1 : 0);
        var1.method2126(this.field141 ? 1 : 0);
        var1.method2126(this.field142.size());
        Iterator var2 = this.field142.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2236((Integer) var3.getKey());
            var1.method2236((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("dc.z(I)V")
    public static void method2441() {
        class195 var0 = null;
        try {
            var0 = class136.method602("", Statics.field253.field2138, true);
            class107 var1 = Statics.field123.method96();
            var0.method3437(var1.field1840, 0, var1.field1839);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3430();
            }
        } catch (Exception var4) {
        }
    }
}

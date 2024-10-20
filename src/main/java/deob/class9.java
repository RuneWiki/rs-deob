package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("d")
public class class9 {

    @ObfuscatedName("d.t")
    public static int field140 = 4;

    @ObfuscatedName("d.g")
    public boolean field139;

    @ObfuscatedName("d.h")
    public boolean field146;

    @ObfuscatedName("d.z")
    public int field141 = 1;

    @ObfuscatedName("d.r")
    public LinkedHashMap field142 = new LinkedHashMap();

    public class9() {
        this.method88(true);
    }

    public class9(class120 arg0) {
        if (arg0 == null || arg0.field2002 == null) {
            this.method88(true);
        } else {
            int var2 = arg0.method2334();
            if (var2 >= 0 && var2 <= field140) {
                if (arg0.method2334() == 1) {
                    this.field139 = true;
                }
                if (var2 > 1) {
                    this.field146 = arg0.method2334() == 1;
                }
                if (var2 > 3) {
                    this.field141 = arg0.method2334();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2334();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2345();
                        int var6 = arg0.method2345();
                        this.field142.put(var5, var6);
                    }
                }
            } else {
                this.method88(true);
            }
        }
    }

    @ObfuscatedName("d.t(ZI)V")
    public void method88(boolean arg0) {
    }

    @ObfuscatedName("d.i(I)Ldr;")
    public class120 method89() {
        class120 var1 = new class120(100);
        var1.method2293(field140);
        var1.method2293(this.field139 ? 1 : 0);
        var1.method2293(this.field146 ? 1 : 0);
        var1.method2293(this.field141);
        var1.method2293(this.field142.size());
        Iterator var2 = this.field142.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2296((Integer) var3.getKey());
            var1.method2296((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("e.g(I)V")
    public static void method581() {
        class228 var0 = null;
        try {
            var0 = class150.method161("", Statics.field3159.field2317, true);
            class120 var1 = Statics.field1989.method89();
            var0.method3802(var1.field2002, 0, var1.field2001);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3803();
            }
        } catch (Exception var4) {
        }
    }
}

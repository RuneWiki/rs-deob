package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ca")
public class class79 {

    @ObfuscatedName("ca.c")
    public static int field1238 = 6;

    @ObfuscatedName("ca.o")
    public boolean field1237;

    @ObfuscatedName("ca.j")
    public boolean field1243;

    @ObfuscatedName("ca.k")
    public int field1240 = 1;

    @ObfuscatedName("ca.x")
    public String field1235 = null;

    @ObfuscatedName("ca.z")
    public boolean field1241 = false;

    @ObfuscatedName("ca.p")
    public LinkedHashMap field1242 = new LinkedHashMap();

    public class79() {
        this.method1510(true);
    }

    public class79(class195 arg0) {
        if (arg0 == null || arg0.field2567 == null) {
            this.method1510(true);
        } else {
            int var2 = arg0.method3429();
            if (var2 >= 0 && var2 <= field1238) {
                if (arg0.method3429() == 1) {
                    this.field1237 = true;
                }
                if (var2 > 1) {
                    this.field1243 = arg0.method3429() == 1;
                }
                if (var2 > 3) {
                    this.field1240 = arg0.method3429();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3429();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3230();
                        int var6 = arg0.method3230();
                        this.field1242.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1235 = arg0.method3419();
                }
                if (var2 > 5) {
                    this.field1241 = arg0.method3232();
                }
            } else {
                this.method1510(true);
            }
        }
    }

    @ObfuscatedName("ca.c(ZI)V")
    public void method1510(boolean arg0) {
    }

    @ObfuscatedName("ca.i(I)Lgp;")
    public class195 method1515() {
        class195 var1 = new class195(100);
        var1.method3209(field1238);
        var1.method3209(this.field1237 ? 1 : 0);
        var1.method3209(this.field1243 ? 1 : 0);
        var1.method3209(this.field1240);
        var1.method3209(this.field1242.size());
        Iterator var2 = this.field1242.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3212((Integer) var3.getKey());
            var1.method3212((Integer) var3.getValue());
        }
        var1.method3216(this.field1235 == null ? "" : this.field1235);
        var1.method3215(this.field1241);
        return var1;
    }

    @ObfuscatedName("av.o(I)V")
    public static void method612() {
        class123 var0 = null;
        try {
            var0 = class168.method2855("", Statics.field817.field3354, true);
            class195 var1 = Statics.field565.method1515();
            var0.method2322(var1.field2567, 0, var1.field2566);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2327(true);
            }
        } catch (Exception var4) {
        }
    }
}

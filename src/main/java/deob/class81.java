package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ca")
public class class81 {

    @ObfuscatedName("ca.d")
    public static int field1232 = 6;

    @ObfuscatedName("ca.k")
    public boolean field1234;

    @ObfuscatedName("ca.z")
    public boolean field1237;

    @ObfuscatedName("ca.v")
    public int field1236 = 1;

    @ObfuscatedName("ca.m")
    public String field1235 = null;

    @ObfuscatedName("ca.b")
    public boolean field1238 = false;

    @ObfuscatedName("ca.t")
    public LinkedHashMap field1239 = new LinkedHashMap();

    public class81() {
        this.method1510(true);
    }

    public class81(class181 arg0) {
        if (arg0 == null || arg0.field2496 == null) {
            this.method1510(true);
        } else {
            int var2 = arg0.method3204();
            if (var2 >= 0 && var2 <= field1232) {
                if (arg0.method3204() == 1) {
                    this.field1234 = true;
                }
                if (var2 > 1) {
                    this.field1237 = arg0.method3204() == 1;
                }
                if (var2 > 3) {
                    this.field1236 = arg0.method3204();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3204();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3041();
                        int var6 = arg0.method3041();
                        this.field1239.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1235 = arg0.method3224();
                }
                if (var2 > 5) {
                    this.field1238 = arg0.method3043();
                }
            } else {
                this.method1510(true);
            }
        }
    }

    @ObfuscatedName("ca.d(ZI)V")
    public void method1510(boolean arg0) {
    }

    @ObfuscatedName("ca.x(B)Lfr;")
    public class181 method1511() {
        class181 var1 = new class181(100);
        var1.method3020(field1232);
        var1.method3020(this.field1234 ? 1 : 0);
        var1.method3020(this.field1237 ? 1 : 0);
        var1.method3020(this.field1236);
        var1.method3020(this.field1239.size());
        Iterator var2 = this.field1239.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3149((Integer) var3.getKey());
            var1.method3149((Integer) var3.getValue());
        }
        var1.method3027(this.field1235 == null ? "" : this.field1235);
        var1.method3026(this.field1238);
        return var1;
    }

    @ObfuscatedName("bb.k(I)V")
    public static void method1010() {
        class124 var0 = null;
        try {
            var0 = class157.method609("", Statics.field484.field3277, true);
            class181 var1 = Statics.field632.method1511();
            var0.method2241(var1.field2496, 0, var1.field2498);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2251(true);
            }
        } catch (Exception var4) {
        }
    }
}

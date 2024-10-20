package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cf")
public class class82 {

    @ObfuscatedName("cf.w")
    public static int field1320 = 4;

    @ObfuscatedName("cf.x")
    public boolean field1318;

    @ObfuscatedName("cf.k")
    public boolean field1321;

    @ObfuscatedName("cf.f")
    public int field1322 = 1;

    @ObfuscatedName("cf.i")
    public LinkedHashMap field1323 = new LinkedHashMap();

    public class82() {
        this.method1447(true);
    }

    public class82(class177 arg0) {
        if (arg0 == null || arg0.field2419 == null) {
            this.method1447(true);
        } else {
            int var2 = arg0.method2931();
            if (var2 >= 0 && var2 <= field1320) {
                if (arg0.method2931() == 1) {
                    this.field1318 = true;
                }
                if (var2 > 1) {
                    this.field1321 = arg0.method2931() == 1;
                }
                if (var2 > 3) {
                    this.field1322 = arg0.method2931();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2931();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2904();
                        int var6 = arg0.method2904();
                        this.field1323.put(var5, var6);
                    }
                }
            } else {
                this.method1447(true);
            }
        }
    }

    @ObfuscatedName("cf.w(ZI)V")
    public void method1447(boolean arg0) {
    }

    @ObfuscatedName("cf.o(I)Lfi;")
    public class177 method1449() {
        class177 var1 = new class177(100);
        var1.method3075(field1320);
        var1.method3075(this.field1318 ? 1 : 0);
        var1.method3075(this.field1321 ? 1 : 0);
        var1.method3075(this.field1322);
        var1.method3075(this.field1323.size());
        Iterator var2 = this.field1323.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2872((Integer) var3.getKey());
            var1.method2872((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("bw.x(I)V")
    public static void method1005() {
        class125 var0 = null;
        try {
            var0 = class157.method909("", Statics.field3424.field3197, true);
            class177 var1 = Statics.field3187.method1449();
            var0.method2112(var1.field2419, 0, var1.field2412);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2113();
            }
        } catch (Exception var4) {
        }
    }
}

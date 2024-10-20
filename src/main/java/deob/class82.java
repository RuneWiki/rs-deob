package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cf")
public class class82 {

    @ObfuscatedName("cf.i")
    public static int field1339 = 4;

    @ObfuscatedName("cf.e")
    public boolean field1334;

    @ObfuscatedName("cf.v")
    public boolean field1333;

    @ObfuscatedName("cf.b")
    public int field1337 = 1;

    @ObfuscatedName("cf.y")
    public LinkedHashMap field1338 = new LinkedHashMap();

    public class82() {
        this.method1454(true);
    }

    public class82(class174 arg0) {
        if (arg0 == null || arg0.field2415 == null) {
            this.method1454(true);
        } else {
            int var2 = arg0.method2870();
            if (var2 >= 0 && var2 <= field1339) {
                if (arg0.method2870() == 1) {
                    this.field1334 = true;
                }
                if (var2 > 1) {
                    this.field1333 = arg0.method2870() == 1;
                }
                if (var2 > 3) {
                    this.field1337 = arg0.method2870();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2870();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2875();
                        int var6 = arg0.method2875();
                        this.field1338.put(var5, var6);
                    }
                }
            } else {
                this.method1454(true);
            }
        }
    }

    @ObfuscatedName("cf.i(ZB)V")
    public void method1454(boolean arg0) {
    }

    @ObfuscatedName("cf.c(B)Lfx;")
    public class174 method1456() {
        class174 var1 = new class174(100);
        var1.method2865(field1339);
        var1.method2865(this.field1334 ? 1 : 0);
        var1.method2865(this.field1333 ? 1 : 0);
        var1.method2865(this.field1337);
        var1.method2865(this.field1338.size());
        Iterator var2 = this.field1338.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2871((Integer) var3.getKey());
            var1.method2871((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("bq.e(I)V")
    public static void method943() {
        class125 var0 = null;
        try {
            var0 = class156.method2666("", Statics.field401.field3193, true);
            class174 var1 = Statics.field304.method1456();
            var0.method2145(var1.field2415, 0, var1.field2407);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2129();
            }
        } catch (Exception var4) {
        }
    }
}

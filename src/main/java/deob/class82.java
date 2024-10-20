package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ct")
public class class82 {

    @ObfuscatedName("ct.e")
    public static int field1295 = 4;

    @ObfuscatedName("ct.g")
    public boolean field1296;

    @ObfuscatedName("ct.y")
    public boolean field1299;

    @ObfuscatedName("ct.w")
    public int field1297 = 1;

    @ObfuscatedName("ct.k")
    public LinkedHashMap field1294 = new LinkedHashMap();

    public class82() {
        this.method1478(true);
    }

    public class82(class175 arg0) {
        if (arg0 == null || arg0.field2376 == null) {
            this.method1478(true);
        } else {
            int var2 = arg0.method2928();
            if (var2 >= 0 && var2 <= field1295) {
                if (arg0.method2928() == 1) {
                    this.field1296 = true;
                }
                if (var2 > 1) {
                    this.field1299 = arg0.method2928() == 1;
                }
                if (var2 > 3) {
                    this.field1297 = arg0.method2928();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2928();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2933();
                        int var6 = arg0.method2933();
                        this.field1294.put(var5, var6);
                    }
                }
            } else {
                this.method1478(true);
            }
        }
    }

    @ObfuscatedName("ct.e(ZI)V")
    public void method1478(boolean arg0) {
    }

    @ObfuscatedName("ct.n(I)Lfh;")
    public class175 method1482() {
        class175 var1 = new class175(100);
        var1.method2913(field1295);
        var1.method2913(this.field1296 ? 1 : 0);
        var1.method2913(this.field1299 ? 1 : 0);
        var1.method2913(this.field1297);
        var1.method2913(this.field1294.size());
        Iterator var2 = this.field1294.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2916((Integer) var3.getKey());
            var1.method2916((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ck.g(B)V")
    public static void method1649() {
        class126 var0 = null;
        try {
            var0 = Statics.method2219("", Statics.field425.field3176, true);
            class175 var1 = Statics.field2198.method1482();
            var0.method2175(var1.field2376, 0, var1.field2381);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2187();
            }
        } catch (Exception var4) {
        }
    }
}

package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("co")
public class class80 {

    @ObfuscatedName("co.d")
    public static int field1310 = 6;

    @ObfuscatedName("co.e")
    public boolean field1304;

    @ObfuscatedName("co.p")
    public boolean field1303;

    @ObfuscatedName("co.q")
    public int field1306 = 1;

    @ObfuscatedName("co.s")
    public String field1307 = null;

    @ObfuscatedName("co.r")
    public boolean field1305 = false;

    @ObfuscatedName("co.g")
    public LinkedHashMap field1309 = new LinkedHashMap();

    public class80() {
        this.method1514(true);
    }

    public class80(class174 arg0) {
        if (arg0 == null || arg0.field2409 == null) {
            this.method1514(true);
        } else {
            int var2 = arg0.method2955();
            if (var2 >= 0 && var2 <= field1310) {
                if (arg0.method2955() == 1) {
                    this.field1304 = true;
                }
                if (var2 > 1) {
                    this.field1303 = arg0.method2955() == 1;
                }
                if (var2 > 3) {
                    this.field1306 = arg0.method2955();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2955();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2960();
                        int var6 = arg0.method2960();
                        this.field1309.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1307 = arg0.method2963();
                }
                if (var2 > 5) {
                    this.field1305 = arg0.method2962();
                }
            } else {
                this.method1514(true);
            }
        }
    }

    @ObfuscatedName("co.d(ZI)V")
    public void method1514(boolean arg0) {
    }

    @ObfuscatedName("co.k(I)Lfg;")
    public class174 method1512() {
        class174 var1 = new class174(100);
        var1.method2970(field1310);
        var1.method2970(this.field1304 ? 1 : 0);
        var1.method2970(this.field1303 ? 1 : 0);
        var1.method2970(this.field1306);
        var1.method2970(this.field1309.size());
        Iterator var2 = this.field1309.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2942((Integer) var3.getKey());
            var1.method2942((Integer) var3.getValue());
        }
        var1.method3041(this.field1307 == null ? "" : this.field1307);
        var1.method3082(this.field1305);
        return var1;
    }

    @ObfuscatedName("y.p(I)V")
    public static void method51() {
        class123 var0 = null;
        try {
            var0 = class156.method1580("", Statics.field924.field3199, true);
            class174 var1 = Statics.field355.method1512();
            var0.method2213(var1.field2409, 0, var1.field2405);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2215(true);
            }
        } catch (Exception var4) {
        }
    }
}

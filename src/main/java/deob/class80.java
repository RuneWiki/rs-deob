package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cl")
public class class80 {

    @ObfuscatedName("cl.w")
    public static int field1302 = 6;

    @ObfuscatedName("cl.q")
    public boolean field1304;

    @ObfuscatedName("cl.o")
    public boolean field1303;

    @ObfuscatedName("cl.g")
    public int field1311 = 1;

    @ObfuscatedName("cl.v")
    public String field1300 = null;

    @ObfuscatedName("cl.p")
    public boolean field1306 = false;

    @ObfuscatedName("cl.e")
    public LinkedHashMap field1307 = new LinkedHashMap();

    public class80() {
        this.method1466(true);
    }

    public class80(class174 arg0) {
        if (arg0 == null || arg0.field2389 == null) {
            this.method1466(true);
        } else {
            int var2 = arg0.method2971();
            if (var2 >= 0 && var2 <= field1302) {
                if (arg0.method2971() == 1) {
                    this.field1304 = true;
                }
                if (var2 > 1) {
                    this.field1303 = arg0.method2971() == 1;
                }
                if (var2 > 3) {
                    this.field1311 = arg0.method2971();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2971();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3131();
                        int var6 = arg0.method3131();
                        this.field1307.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1300 = arg0.method2979();
                }
                if (var2 > 5) {
                    this.field1306 = arg0.method3029();
                }
            } else {
                this.method1466(true);
            }
        }
    }

    @ObfuscatedName("cl.w(ZI)V")
    public void method1466(boolean arg0) {
    }

    @ObfuscatedName("cl.s(I)Lfz;")
    public class174 method1472() {
        class174 var1 = new class174(100);
        var1.method2955(field1302);
        var1.method2955(this.field1304 ? 1 : 0);
        var1.method2955(this.field1303 ? 1 : 0);
        var1.method2955(this.field1311);
        var1.method2955(this.field1307.size());
        Iterator var2 = this.field1307.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3072((Integer) var3.getKey());
            var1.method3072((Integer) var3.getValue());
        }
        var1.method3117(this.field1300 == null ? "" : this.field1300);
        var1.method3118(this.field1306);
        return var1;
    }

    @ObfuscatedName("ap.q(I)V")
    public static void method204() {
        class123 var0 = null;
        try {
            var0 = class156.method2350("", Statics.field453.field3193, true);
            class174 var1 = Statics.field869.method1472();
            var0.method2204(var1.field2389, 0, var1.field2390);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2206(true);
            }
        } catch (Exception var4) {
        }
    }
}

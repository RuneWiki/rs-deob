package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cb")
public class class79 {

    @ObfuscatedName("cb.t")
    public static int field1227 = 6;

    @ObfuscatedName("cb.i")
    public boolean field1223;

    @ObfuscatedName("cb.a")
    public boolean field1224;

    @ObfuscatedName("cb.l")
    public int field1221 = 1;

    @ObfuscatedName("cb.b")
    public String field1226 = null;

    @ObfuscatedName("cb.e")
    public boolean field1225 = false;

    @ObfuscatedName("cb.x")
    public LinkedHashMap field1228 = new LinkedHashMap();

    public class79() {
        this.method1570(true);
    }

    public class79(class195 arg0) {
        if (arg0 == null || arg0.field2544 == null) {
            this.method1570(true);
        } else {
            int var2 = arg0.method3236();
            if (var2 >= 0 && var2 <= field1227) {
                if (arg0.method3236() == 1) {
                    this.field1223 = true;
                }
                if (var2 > 1) {
                    this.field1224 = arg0.method3236() == 1;
                }
                if (var2 > 3) {
                    this.field1221 = arg0.method3236();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3236();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3241();
                        int var6 = arg0.method3241();
                        this.field1228.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1226 = arg0.method3262();
                }
                if (var2 > 5) {
                    this.field1225 = arg0.method3243();
                }
            } else {
                this.method1570(true);
            }
        }
    }

    @ObfuscatedName("cb.t(ZI)V")
    public void method1570(boolean arg0) {
    }

    @ObfuscatedName("cb.q(I)Lgb;")
    public class195 method1571() {
        class195 var1 = new class195(100);
        var1.method3220(field1227);
        var1.method3220(this.field1223 ? 1 : 0);
        var1.method3220(this.field1224 ? 1 : 0);
        var1.method3220(this.field1221);
        var1.method3220(this.field1228.size());
        Iterator var2 = this.field1228.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3223((Integer) var3.getKey());
            var1.method3223((Integer) var3.getValue());
        }
        var1.method3232(this.field1226 == null ? "" : this.field1226);
        var1.method3226(this.field1225);
        return var1;
    }

    @ObfuscatedName("ar.i(B)V")
    public static void method499() {
        class123 var0 = null;
        try {
            var0 = class168.method4893("", Statics.field853.field3359, true);
            class195 var1 = Statics.field521.method1571();
            var0.method2314(var1.field2544, 0, var1.field2545);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2316(true);
            }
        } catch (Exception var4) {
        }
    }
}

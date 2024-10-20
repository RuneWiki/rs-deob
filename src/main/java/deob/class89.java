package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cc")
public class class89 {

    @ObfuscatedName("cc.c")
    public static int field1204 = 8;

    @ObfuscatedName("cc.p")
    public boolean field1194;

    @ObfuscatedName("cc.m")
    public boolean field1203;

    @ObfuscatedName("cc.t")
    public int field1192 = 1;

    @ObfuscatedName("cc.s")
    public String field1197 = null;

    @ObfuscatedName("cc.j")
    public boolean field1196 = false;

    @ObfuscatedName("cc.w")
    public double field1199 = 0.8D;

    @ObfuscatedName("cc.n")
    public int field1200 = 127;

    @ObfuscatedName("cc.r")
    public int field1201 = 127;

    @ObfuscatedName("cc.o")
    public int field1202 = 127;

    @ObfuscatedName("cc.v")
    public int field1198 = -1;

    @ObfuscatedName("cc.d")
    public LinkedHashMap field1195 = new LinkedHashMap();

    public class89() {
        this.method2177(true);
    }

    public class89(class419 arg0) {
        if (arg0 == null || arg0.field4477 == null) {
            this.method2177(true);
        } else {
            int var2 = arg0.method6781();
            if (var2 >= 0 && var2 <= field1204) {
                if (arg0.method6781() == 1) {
                    this.field1194 = true;
                }
                if (var2 > 1) {
                    this.field1203 = arg0.method6781() == 1;
                }
                if (var2 > 3) {
                    this.field1192 = arg0.method6781();
                }
                if (var2 > 2) {
                    int var3 = arg0.method6781();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method6675();
                        int var6 = arg0.method6675();
                        this.field1195.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1197 = arg0.method6679();
                }
                if (var2 > 5) {
                    this.field1196 = arg0.method6733();
                }
                if (var2 > 6) {
                    this.field1199 = (double) arg0.method6781() / 100.0D;
                    this.field1200 = arg0.method6781();
                    this.field1201 = arg0.method6781();
                    this.field1202 = arg0.method6781();
                }
                if (var2 > 7) {
                    this.field1198 = arg0.method6781();
                }
            } else {
                this.method2177(true);
            }
        }
    }

    @ObfuscatedName("cc.c(ZI)V")
    public void method2177(boolean arg0) {
    }

    @ObfuscatedName("cc.b(I)Lpi;")
    public class419 method2182() {
        class419 var1 = new class419(100);
        var1.method6841(field1204);
        var1.method6841(this.field1194 ? 1 : 0);
        var1.method6841(this.field1203 ? 1 : 0);
        var1.method6841(this.field1192);
        var1.method6841(this.field1195.size());
        Iterator var2 = this.field1195.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method6656((Integer) var3.getKey());
            var1.method6656((Integer) var3.getValue());
        }
        var1.method6660(this.field1197 == null ? "" : this.field1197);
        var1.method6659(this.field1196);
        var1.method6841((int) (this.field1199 * 100.0D));
        var1.method6841(this.field1200);
        var1.method6841(this.field1201);
        var1.method6841(this.field1202);
        var1.method6841(this.field1198);
        return var1;
    }

    @ObfuscatedName("di.p(I)V")
    public static void method2604() {
        class402 var0 = null;
        try {
            var0 = class154.method4394("", Statics.field4055.field3455, true);
            class419 var1 = Statics.field929.method2182();
            var0.method6486(var1.field4477, 0, var1.field4475);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6488(true);
            }
        } catch (Exception var4) {
        }
    }
}

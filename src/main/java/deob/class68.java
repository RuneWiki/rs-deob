package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bk")
public class class68 {

    @ObfuscatedName("bk.f")
    public static int field1018 = 6;

    @ObfuscatedName("bk.w")
    public boolean field1015;

    @ObfuscatedName("bk.s")
    public boolean field1016;

    @ObfuscatedName("bk.e")
    public int field1020 = 1;

    @ObfuscatedName("bk.a")
    public String field1019 = null;

    @ObfuscatedName("bk.c")
    public boolean field1022 = false;

    @ObfuscatedName("bk.p")
    public LinkedHashMap field1014 = new LinkedHashMap();

    public class68() {
        this.method1556(true);
    }

    public class68(class185 arg0) {
        if (arg0 == null || arg0.field2415 == null) {
            this.method1556(true);
        } else {
            int var2 = arg0.method3344();
            if (var2 >= 0 && var2 <= field1018) {
                if (arg0.method3344() == 1) {
                    this.field1015 = true;
                }
                if (var2 > 1) {
                    this.field1016 = arg0.method3344() == 1;
                }
                if (var2 > 3) {
                    this.field1020 = arg0.method3344();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3344();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3432();
                        int var6 = arg0.method3432();
                        this.field1014.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1019 = arg0.method3352();
                }
                if (var2 > 5) {
                    this.field1022 = arg0.method3527();
                }
            } else {
                this.method1556(true);
            }
        }
    }

    @ObfuscatedName("bk.f(ZI)V")
    public void method1556(boolean arg0) {
    }

    @ObfuscatedName("bk.l(I)Lgm;")
    public class185 method1557() {
        class185 var1 = new class185(100);
        var1.method3376(field1018);
        var1.method3376(this.field1015 ? 1 : 0);
        var1.method3376(this.field1016 ? 1 : 0);
        var1.method3376(this.field1020);
        var1.method3376(this.field1014.size());
        Iterator var2 = this.field1014.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3422((Integer) var3.getKey());
            var1.method3422((Integer) var3.getValue());
        }
        var1.method3446(this.field1019 == null ? "" : this.field1019);
        var1.method3335(this.field1022);
        return var1;
    }

    @ObfuscatedName("ad.w(I)V")
    public static void method614() {
        class113 var0 = null;
        try {
            var0 = class158.method942("", Statics.field334.field3211, true);
            class185 var1 = Statics.field141.method1557();
            var0.method2381(var1.field2415, 0, var1.field2414);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2383(true);
            }
        } catch (Exception var4) {
        }
    }
}

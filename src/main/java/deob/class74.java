package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bz")
public class class74 {

    @ObfuscatedName("bz.c")
    public static int field1023 = 6;

    @ObfuscatedName("bz.t")
    public boolean field1024;

    @ObfuscatedName("bz.g")
    public boolean field1025;

    @ObfuscatedName("bz.l")
    public int field1026 = 1;

    @ObfuscatedName("bz.u")
    public String field1027 = null;

    @ObfuscatedName("bz.j")
    public boolean field1022 = false;

    @ObfuscatedName("bz.v")
    public LinkedHashMap field1028 = new LinkedHashMap();

    public class74() {
        this.method1680(true);
    }

    public class74(class300 arg0) {
        if (arg0 == null || arg0.field3694 == null) {
            this.method1680(true);
        } else {
            int var2 = arg0.method5103();
            if (var2 >= 0 && var2 <= field1023) {
                if (arg0.method5103() == 1) {
                    this.field1024 = true;
                }
                if (var2 > 1) {
                    this.field1025 = arg0.method5103() == 1;
                }
                if (var2 > 3) {
                    this.field1026 = arg0.method5103();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5103();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5208();
                        int var6 = arg0.method5208();
                        this.field1028.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1027 = arg0.method5108();
                }
                if (var2 > 5) {
                    this.field1022 = arg0.method5110();
                }
            } else {
                this.method1680(true);
            }
        }
    }

    @ObfuscatedName("bz.c(ZB)V")
    public void method1680(boolean arg0) {
    }

    @ObfuscatedName("bz.x(I)Lkz;")
    public class300 method1673() {
        class300 var1 = new class300(100);
        var1.method5087(field1023);
        var1.method5087(this.field1024 ? 1 : 0);
        var1.method5087(this.field1025 ? 1 : 0);
        var1.method5087(this.field1026);
        var1.method5087(this.field1028.size());
        Iterator var2 = this.field1028.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5090((Integer) var3.getKey());
            var1.method5090((Integer) var3.getValue());
        }
        var1.method5094(this.field1027 == null ? "" : this.field1027);
        var1.method5274(this.field1022);
        return var1;
    }

    @ObfuscatedName("km.t(I)V")
    public static void method5046() {
        class343 var0 = null;
        try {
            var0 = class168.method96("", Statics.field360.field3084, true);
            class300 var1 = Statics.field928.method1673();
            var0.method6102(var1.field3694, 0, var1.field3696);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6095(true);
            }
        } catch (Exception var4) {
        }
    }
}

package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ao")
public class class31 {

    @ObfuscatedName("ao.d")
    public static int field690 = 4;

    @ObfuscatedName("ao.n")
    public boolean field691;

    @ObfuscatedName("ao.q")
    public boolean field692;

    @ObfuscatedName("ao.t")
    public int field693 = 1;

    @ObfuscatedName("ao.p")
    public LinkedHashMap field694 = new LinkedHashMap();

    public class31() {
        this.method642(true);
    }

    public class31(class130 arg0) {
        if (arg0 == null || arg0.field1955 == null) {
            this.method642(true);
        } else {
            int var2 = arg0.method2379();
            if (var2 >= 0 && var2 <= field690) {
                if (arg0.method2379() == 1) {
                    this.field691 = true;
                }
                if (var2 > 1) {
                    this.field692 = arg0.method2379() == 1;
                }
                if (var2 > 3) {
                    this.field693 = arg0.method2379();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2379();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2246();
                        int var6 = arg0.method2246();
                        this.field694.put(var5, var6);
                    }
                }
            } else {
                this.method642(true);
            }
        }
    }

    @ObfuscatedName("ao.d(ZI)V")
    public void method642(boolean arg0) {
    }

    @ObfuscatedName("ao.c(B)Ldu;")
    public class130 method650() {
        class130 var1 = new class130(100);
        var1.method2215(field690);
        var1.method2215(this.field691 ? 1 : 0);
        var1.method2215(this.field692 ? 1 : 0);
        var1.method2215(this.field693);
        var1.method2215(this.field694.size());
        Iterator var2 = this.field694.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2218((Integer) var3.getKey());
            var1.method2218((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("cy.n(I)V")
    public static void method1810() {
        class74 var0 = null;
        try {
            var0 = class105.method1111("", Statics.field2779.field2688, true);
            class130 var1 = Statics.field657.method650();
            var0.method1339(var1.field1955, 0, var1.field1956);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1340();
            }
        } catch (Exception var4) {
        }
    }
}

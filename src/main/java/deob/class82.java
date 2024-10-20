package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ct")
public class class82 {

    @ObfuscatedName("ct.n")
    public static int field1322 = 4;

    @ObfuscatedName("ct.i")
    public boolean field1319;

    @ObfuscatedName("ct.j")
    public boolean field1317;

    @ObfuscatedName("ct.f")
    public int field1318 = 1;

    @ObfuscatedName("ct.m")
    public LinkedHashMap field1314 = new LinkedHashMap();

    public class82() {
        this.method1455(true);
    }

    public class82(class174 arg0) {
        if (arg0 == null || arg0.field2401 == null) {
            this.method1455(true);
        } else {
            int var2 = arg0.method2925();
            if (var2 >= 0 && var2 <= field1322) {
                if (arg0.method2925() == 1) {
                    this.field1319 = true;
                }
                if (var2 > 1) {
                    this.field1317 = arg0.method2925() == 1;
                }
                if (var2 > 3) {
                    this.field1318 = arg0.method2925();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2925();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3058();
                        int var6 = arg0.method3058();
                        this.field1314.put(var5, var6);
                    }
                }
            } else {
                this.method1455(true);
            }
        }
    }

    @ObfuscatedName("ct.n(ZI)V")
    public void method1455(boolean arg0) {
    }

    @ObfuscatedName("ct.p(I)Lfl;")
    public class174 method1462() {
        class174 var1 = new class174(100);
        var1.method2906(field1322);
        var1.method2906(this.field1319 ? 1 : 0);
        var1.method2906(this.field1317 ? 1 : 0);
        var1.method2906(this.field1318);
        var1.method2906(this.field1314.size());
        Iterator var2 = this.field1314.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2909((Integer) var3.getKey());
            var1.method2909((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ae.i(B)V")
    public static void method220() {
        class125 var0 = null;
        try {
            var0 = class156.method2821("", Statics.field917.field3198, true);
            class174 var1 = Statics.field802.method1462();
            var0.method2175(var1.field2401, 0, var1.field2400);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2177();
            }
        } catch (Exception var4) {
        }
    }
}

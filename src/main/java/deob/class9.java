package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("w")
public class class9 {

    @ObfuscatedName("w.h")
    public static int field143 = 4;

    @ObfuscatedName("w.i")
    public boolean field141;

    @ObfuscatedName("w.q")
    public boolean field142;

    @ObfuscatedName("w.p")
    public int field147 = 1;

    @ObfuscatedName("w.c")
    public LinkedHashMap field144 = new LinkedHashMap();

    public class9() {
        this.method107(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1989 == null) {
            this.method107(true);
        } else {
            int var2 = arg0.method2320();
            if (var2 >= 0 && var2 <= field143) {
                if (arg0.method2320() == 1) {
                    this.field141 = true;
                }
                if (var2 > 1) {
                    this.field142 = arg0.method2320() == 1;
                }
                if (var2 > 3) {
                    this.field147 = arg0.method2320();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2320();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2324();
                        int var6 = arg0.method2324();
                        this.field144.put(var5, var6);
                    }
                }
            } else {
                this.method107(true);
            }
        }
    }

    @ObfuscatedName("w.h(ZS)V")
    public void method107(boolean arg0) {
    }

    @ObfuscatedName("w.m(B)Ldp;")
    public class119 method98() {
        class119 var1 = new class119(100);
        var1.method2305(field143);
        var1.method2305(this.field141 ? 1 : 0);
        var1.method2305(this.field142 ? 1 : 0);
        var1.method2305(this.field147);
        var1.method2305(this.field144.size());
        Iterator var2 = this.field144.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2308((Integer) var3.getKey());
            var1.method2308((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ex.i(B)V")
    public static void method2738() {
        class227 var0 = null;
        try {
            var0 = class149.method1169("", Statics.field628.field2272, true);
            class119 var1 = Statics.field1028.method98();
            var0.method3817(var1.field1989, 0, var1.field1988);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3822();
            }
        } catch (Exception var4) {
        }
    }
}

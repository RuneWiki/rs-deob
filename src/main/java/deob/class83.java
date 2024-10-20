package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cz")
public class class83 {

    @ObfuscatedName("cz.m")
    public static int field1087 = 6;

    @ObfuscatedName("cz.q")
    public boolean field1080;

    @ObfuscatedName("cz.j")
    public boolean field1078;

    @ObfuscatedName("cz.p")
    public int field1082 = 1;

    @ObfuscatedName("cz.g")
    public String field1083 = null;

    @ObfuscatedName("cz.n")
    public boolean field1084 = false;

    @ObfuscatedName("cz.u")
    public LinkedHashMap field1081 = new LinkedHashMap();

    public class83() {
        this.method1717(true);
    }

    public class83(class310 arg0) {
        if (arg0 == null || arg0.field3736 == null) {
            this.method1717(true);
        } else {
            int var2 = arg0.method5227();
            if (var2 >= 0 && var2 <= field1087) {
                if (arg0.method5227() == 1) {
                    this.field1080 = true;
                }
                if (var2 > 1) {
                    this.field1078 = arg0.method5227() == 1;
                }
                if (var2 > 3) {
                    this.field1082 = arg0.method5227();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5227();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5209();
                        int var6 = arg0.method5209();
                        this.field1081.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1083 = arg0.method5235();
                }
                if (var2 > 5) {
                    this.field1084 = arg0.method5234();
                }
            } else {
                this.method1717(true);
            }
        }
    }

    @ObfuscatedName("cz.m(ZI)V")
    public void method1717(boolean arg0) {
    }

    @ObfuscatedName("cz.o(S)Lkn;")
    public class310 method1718() {
        class310 var1 = new class310(100);
        var1.method5437(field1087);
        var1.method5437(this.field1080 ? 1 : 0);
        var1.method5437(this.field1078 ? 1 : 0);
        var1.method5437(this.field1082);
        var1.method5437(this.field1081.size());
        Iterator var2 = this.field1081.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5213((Integer) var3.getKey());
            var1.method5213((Integer) var3.getValue());
        }
        var1.method5217(this.field1083 == null ? "" : this.field1083);
        var1.method5216(this.field1084);
        return var1;
    }

    @ObfuscatedName("hh.q(I)V")
    public static void method3709() {
        class353 var0 = null;
        try {
            var0 = class177.method958("", Statics.field55.field3146, true);
            class310 var1 = Statics.field2108.method1718();
            var0.method6223(var1.field3736, 0, var1.field3734);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6226(true);
            }
        } catch (Exception var4) {
        }
    }
}

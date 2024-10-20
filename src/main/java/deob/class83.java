package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ce")
public class class83 {

    @ObfuscatedName("ce.z")
    public static int field1088 = 6;

    @ObfuscatedName("ce.s")
    public boolean field1083;

    @ObfuscatedName("ce.t")
    public boolean field1084;

    @ObfuscatedName("ce.i")
    public int field1085 = 1;

    @ObfuscatedName("ce.o")
    public String field1086 = null;

    @ObfuscatedName("ce.x")
    public boolean field1091 = false;

    @ObfuscatedName("ce.w")
    public LinkedHashMap field1092 = new LinkedHashMap();

    public class83() {
        this.method1738(true);
    }

    public class83(class310 arg0) {
        if (arg0 == null || arg0.field3731 == null) {
            this.method1738(true);
        } else {
            int var2 = arg0.method5193();
            if (var2 >= 0 && var2 <= field1088) {
                if (arg0.method5193() == 1) {
                    this.field1083 = true;
                }
                if (var2 > 1) {
                    this.field1084 = arg0.method5193() == 1;
                }
                if (var2 > 3) {
                    this.field1085 = arg0.method5193();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5193();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5270();
                        int var6 = arg0.method5270();
                        this.field1092.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1086 = arg0.method5201();
                }
                if (var2 > 5) {
                    this.field1091 = arg0.method5189();
                }
            } else {
                this.method1738(true);
            }
        }
    }

    @ObfuscatedName("ce.z(ZI)V")
    public void method1738(boolean arg0) {
    }

    @ObfuscatedName("ce.k(I)Lkf;")
    public class310 method1739() {
        class310 var1 = new class310(100);
        var1.method5177(field1088);
        var1.method5177(this.field1083 ? 1 : 0);
        var1.method5177(this.field1084 ? 1 : 0);
        var1.method5177(this.field1085);
        var1.method5177(this.field1092.size());
        Iterator var2 = this.field1092.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5295((Integer) var3.getKey());
            var1.method5295((Integer) var3.getValue());
        }
        var1.method5322(this.field1086 == null ? "" : this.field1086);
        var1.method5183(this.field1091);
        return var1;
    }

    @ObfuscatedName("aw.s(B)V")
    public static void method658() {
        class353 var0 = null;
        try {
            var0 = class177.method21("", Statics.field533.field3143, true);
            class310 var1 = Statics.field1694.method1739();
            var0.method6191(var1.field3731, 0, var1.field3734);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6202(true);
            }
        } catch (Exception var4) {
        }
    }
}

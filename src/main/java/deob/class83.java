package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cq")
public class class83 {

    @ObfuscatedName("cq.x")
    public static int field1086 = 6;

    @ObfuscatedName("cq.k")
    public boolean field1078;

    @ObfuscatedName("cq.d")
    public boolean field1079;

    @ObfuscatedName("cq.w")
    public int field1080 = 1;

    @ObfuscatedName("cq.v")
    public String field1081 = null;

    @ObfuscatedName("cq.q")
    public boolean field1076 = false;

    @ObfuscatedName("cq.z")
    public LinkedHashMap field1083 = new LinkedHashMap();

    public class83() {
        this.method1760(true);
    }

    public class83(class310 arg0) {
        if (arg0 == null || arg0.field3710 == null) {
            this.method1760(true);
        } else {
            int var2 = arg0.method5137();
            if (var2 >= 0 && var2 <= field1086) {
                if (arg0.method5137() == 1) {
                    this.field1078 = true;
                }
                if (var2 > 1) {
                    this.field1079 = arg0.method5137() == 1;
                }
                if (var2 > 3) {
                    this.field1080 = arg0.method5137();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5137();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5142();
                        int var6 = arg0.method5142();
                        this.field1083.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1081 = arg0.method5145();
                }
                if (var2 > 5) {
                    this.field1076 = arg0.method5272();
                }
            } else {
                this.method1760(true);
            }
        }
    }

    @ObfuscatedName("cq.x(ZI)V")
    public void method1760(boolean arg0) {
    }

    @ObfuscatedName("cq.m(I)Lkb;")
    public class310 method1761() {
        class310 var1 = new class310(100);
        var1.method5121(field1086);
        var1.method5121(this.field1078 ? 1 : 0);
        var1.method5121(this.field1079 ? 1 : 0);
        var1.method5121(this.field1080);
        var1.method5121(this.field1083.size());
        Iterator var2 = this.field1083.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5279((Integer) var3.getKey());
            var1.method5279((Integer) var3.getValue());
        }
        var1.method5217(this.field1081 == null ? "" : this.field1081);
        var1.method5280(this.field1076);
        return var1;
    }

    @ObfuscatedName("ac.k(B)Lcq;")
    public static class83 method680() {
        class353 var0 = null;
        class83 var1 = new class83();
        try {
            var0 = class177.method763("", Statics.field3966.field3110, false);
            byte[] var2 = new byte[(int) var0.method6194()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method6206(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class83(new class310(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method6192();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("as.d(I)V")
    public static void method437() {
        class353 var0 = null;
        try {
            var0 = class177.method763("", Statics.field3966.field3110, true);
            class310 var1 = Statics.field677.method1761();
            var0.method6197(var1.field3710, 0, var1.field3711);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6195(true);
            }
        } catch (Exception var4) {
        }
    }
}

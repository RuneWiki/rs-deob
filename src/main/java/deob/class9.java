package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("u")
public class class9 {

    @ObfuscatedName("u.g")
    public static int field150 = 4;

    @ObfuscatedName("u.w")
    public boolean field146;

    @ObfuscatedName("u.d")
    public boolean field147;

    @ObfuscatedName("u.z")
    public int field148 = 1;

    @ObfuscatedName("u.l")
    public LinkedHashMap field149 = new LinkedHashMap();

    public class9() {
        this.method113(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1986 == null) {
            this.method113(true);
        } else {
            int var2 = arg0.method2362();
            if (var2 >= 0 && var2 <= field150) {
                if (arg0.method2362() == 1) {
                    this.field146 = true;
                }
                if (var2 > 1) {
                    this.field147 = arg0.method2362() == 1;
                }
                if (var2 > 3) {
                    this.field148 = arg0.method2362();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2362();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2367();
                        int var6 = arg0.method2367();
                        this.field149.put(var5, var6);
                    }
                }
            } else {
                this.method113(true);
            }
        }
    }

    @ObfuscatedName("u.g(ZI)V")
    public void method113(boolean arg0) {
    }

    @ObfuscatedName("u.b(B)Ldm;")
    public class119 method114() {
        class119 var1 = new class119(100);
        var1.method2476(field150);
        var1.method2476(this.field146 ? 1 : 0);
        var1.method2476(this.field147 ? 1 : 0);
        var1.method2476(this.field148);
        var1.method2476(this.field149.size());
        Iterator var2 = this.field149.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2351((Integer) var3.getKey());
            var1.method2351((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("n.w(I)Lu;")
    public static class9 method154() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method736("", Statics.field144.field2283, false);
            byte[] var2 = new byte[(int) var0.method3908()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3902(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3900();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("dg.d(B)V")
    public static void method2298() {
        class227 var0 = null;
        try {
            var0 = class149.method736("", Statics.field144.field2283, true);
            class119 var1 = Statics.field783.method114();
            var0.method3918(var1.field1986, 0, var1.field1977);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3900();
            }
        } catch (Exception var4) {
        }
    }
}

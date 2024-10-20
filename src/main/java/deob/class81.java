package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ca")
public class class81 {

    @ObfuscatedName("ca.m")
    public static int field1237 = 6;

    @ObfuscatedName("ca.i")
    public boolean field1227;

    @ObfuscatedName("ca.j")
    public boolean field1229;

    @ObfuscatedName("ca.v")
    public int field1231 = 1;

    @ObfuscatedName("ca.x")
    public String field1232 = null;

    @ObfuscatedName("ca.e")
    public boolean field1233 = false;

    @ObfuscatedName("ca.l")
    public LinkedHashMap field1234 = new LinkedHashMap();

    public class81() {
        this.method1526(true);
    }

    public class81(class181 arg0) {
        if (arg0 == null || arg0.field2499 == null) {
            this.method1526(true);
        } else {
            int var2 = arg0.method3012();
            if (var2 >= 0 && var2 <= field1237) {
                if (arg0.method3012() == 1) {
                    this.field1227 = true;
                }
                if (var2 > 1) {
                    this.field1229 = arg0.method3012() == 1;
                }
                if (var2 > 3) {
                    this.field1231 = arg0.method3012();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3012();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3017();
                        int var6 = arg0.method3017();
                        this.field1234.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1232 = arg0.method3020();
                }
                if (var2 > 5) {
                    this.field1233 = arg0.method3047();
                }
            } else {
                this.method1526(true);
            }
        }
    }

    @ObfuscatedName("ca.m(ZB)V")
    public void method1526(boolean arg0) {
    }

    @ObfuscatedName("ca.p(I)Lfv;")
    public class181 method1531() {
        class181 var1 = new class181(100);
        var1.method2996(field1237);
        var1.method2996(this.field1227 ? 1 : 0);
        var1.method2996(this.field1229 ? 1 : 0);
        var1.method2996(this.field1231);
        var1.method2996(this.field1234.size());
        Iterator var2 = this.field1234.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2999((Integer) var3.getKey());
            var1.method2999((Integer) var3.getValue());
        }
        var1.method3003(this.field1232 == null ? "" : this.field1232);
        var1.method3002(this.field1233);
        return var1;
    }

    @ObfuscatedName("k.i(I)Lca;")
    public static class81 method75() {
        class124 var0 = null;
        class81 var1 = new class81();
        try {
            var0 = class157.method2895("", Statics.field529.field3262, false);
            byte[] var2 = new byte[(int) var0.method2260()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2246(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class81(new class181(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2243();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("fi.j(B)V")
    public static void method2914() {
        class124 var0 = null;
        try {
            var0 = class157.method2895("", Statics.field529.field3262, true);
            class181 var1 = Statics.field2494.method1531();
            var0.method2254(var1.field2499, 0, var1.field2498);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2244(true);
            }
        } catch (Exception var4) {
        }
    }
}

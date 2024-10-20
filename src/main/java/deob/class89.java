package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cx")
public class class89 {

    @ObfuscatedName("cx.n")
    public static int field1197 = 8;

    @ObfuscatedName("cx.m")
    public boolean field1189;

    @ObfuscatedName("cx.k")
    public boolean field1190;

    @ObfuscatedName("cx.o")
    public int field1191 = 1;

    @ObfuscatedName("cx.g")
    public String field1192 = null;

    @ObfuscatedName("cx.z")
    public boolean field1198 = false;

    @ObfuscatedName("cx.a")
    public double field1194 = 0.8D;

    @ObfuscatedName("cx.u")
    public int field1195 = 127;

    @ObfuscatedName("cx.e")
    public int field1196 = 127;

    @ObfuscatedName("cx.l")
    public int field1199 = 127;

    @ObfuscatedName("cx.y")
    public int field1193 = -1;

    @ObfuscatedName("cx.v")
    public LinkedHashMap field1188 = new LinkedHashMap();

    public class89() {
        this.method2074(true);
    }

    public class89(class400 arg0) {
        if (arg0 == null || arg0.field4271 == null) {
            this.method2074(true);
        } else {
            int var2 = arg0.method6217();
            if (var2 >= 0 && var2 <= field1197) {
                if (arg0.method6217() == 1) {
                    this.field1189 = true;
                }
                if (var2 > 1) {
                    this.field1190 = arg0.method6217() == 1;
                }
                if (var2 > 3) {
                    this.field1191 = arg0.method6217();
                }
                if (var2 > 2) {
                    int var3 = arg0.method6217();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method6222();
                        int var6 = arg0.method6222();
                        this.field1188.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1192 = arg0.method6198();
                }
                if (var2 > 5) {
                    this.field1198 = arg0.method6197();
                }
                if (var2 > 6) {
                    this.field1194 = (double) arg0.method6217() / 100.0D;
                    this.field1195 = arg0.method6217();
                    this.field1196 = arg0.method6217();
                    this.field1199 = arg0.method6217();
                }
                if (var2 > 7) {
                    this.field1193 = arg0.method6217();
                }
            } else {
                this.method2074(true);
            }
        }
    }

    @ObfuscatedName("cx.n(ZI)V")
    public void method2074(boolean arg0) {
    }

    @ObfuscatedName("cx.c(I)Lot;")
    public class400 method2076() {
        class400 var1 = new class400(100);
        var1.method6200(field1197);
        var1.method6200(this.field1189 ? 1 : 0);
        var1.method6200(this.field1190 ? 1 : 0);
        var1.method6200(this.field1191);
        var1.method6200(this.field1188.size());
        Iterator var2 = this.field1188.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method6203((Integer) var3.getKey());
            var1.method6203((Integer) var3.getValue());
        }
        var1.method6242(this.field1192 == null ? "" : this.field1192);
        var1.method6206(this.field1198);
        var1.method6200((int) (this.field1194 * 100.0D));
        var1.method6200(this.field1195);
        var1.method6200(this.field1196);
        var1.method6200(this.field1199);
        var1.method6200(this.field1193);
        return var1;
    }

    @ObfuscatedName("bq.m(B)Lcx;")
    public static class89 method1763() {
        class384 var0 = null;
        class89 var1 = new class89();
        try {
            var0 = class144.method18("", Statics.field84.field3301, false);
            byte[] var2 = new byte[(int) var0.method6058()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method6059(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class89(new class400(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method6070();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("w.k(I)V")
    public static void method362() {
        class384 var0 = null;
        try {
            var0 = class144.method18("", Statics.field84.field3301, true);
            class400 var1 = Statics.field1779.method2076();
            var0.method6055(var1.field4271, 0, var1.field4272);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6060(true);
            }
        } catch (Exception var4) {
        }
    }
}

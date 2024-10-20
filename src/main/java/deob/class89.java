package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cl")
public class class89 {

    @ObfuscatedName("cl.c")
    public static int field1224 = 8;

    @ObfuscatedName("cl.s")
    public boolean field1221;

    @ObfuscatedName("cl.e")
    public boolean field1222;

    @ObfuscatedName("cl.r")
    public int field1225 = 1;

    @ObfuscatedName("cl.o")
    public String field1226 = null;

    @ObfuscatedName("cl.i")
    public boolean field1227 = false;

    @ObfuscatedName("cl.w")
    public double field1228 = 0.8D;

    @ObfuscatedName("cl.v")
    public int field1229 = 127;

    @ObfuscatedName("cl.a")
    public int field1230 = 127;

    @ObfuscatedName("cl.y")
    public int field1231 = 127;

    @ObfuscatedName("cl.u")
    public int field1232 = -1;

    @ObfuscatedName("cl.h")
    public LinkedHashMap field1233 = new LinkedHashMap();

    public class89() {
        this.method2117(true);
    }

    public class89(class421 arg0) {
        if (arg0 == null || arg0.field4511 == null) {
            this.method2117(true);
        } else {
            int var2 = arg0.method6686();
            if (var2 >= 0 && var2 <= field1224) {
                if (arg0.method6686() == 1) {
                    this.field1221 = true;
                }
                if (var2 > 1) {
                    this.field1222 = arg0.method6686() == 1;
                }
                if (var2 > 3) {
                    this.field1225 = arg0.method6686();
                }
                if (var2 > 2) {
                    int var3 = arg0.method6686();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method6669();
                        int var6 = arg0.method6669();
                        this.field1233.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1226 = arg0.method6721();
                }
                if (var2 > 5) {
                    this.field1227 = arg0.method6672();
                }
                if (var2 > 6) {
                    this.field1228 = (double) arg0.method6686() / 100.0D;
                    this.field1229 = arg0.method6686();
                    this.field1230 = arg0.method6686();
                    this.field1231 = arg0.method6686();
                }
                if (var2 > 7) {
                    this.field1232 = arg0.method6686();
                }
            } else {
                this.method2117(true);
            }
        }
    }

    @ObfuscatedName("cl.c(ZI)V")
    public void method2117(boolean arg0) {
    }

    @ObfuscatedName("cl.l(I)Lpi;")
    public class421 method2118() {
        class421 var1 = new class421(100);
        var1.method6644(field1224);
        var1.method6644(this.field1221 ? 1 : 0);
        var1.method6644(this.field1222 ? 1 : 0);
        var1.method6644(this.field1225);
        var1.method6644(this.field1233.size());
        Iterator var2 = this.field1233.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method6650((Integer) var3.getKey());
            var1.method6650((Integer) var3.getValue());
        }
        var1.method6654(this.field1226 == null ? "" : this.field1226);
        var1.method6653(this.field1227);
        var1.method6644((int) (this.field1228 * 100.0D));
        var1.method6644(this.field1229);
        var1.method6644(this.field1230);
        var1.method6644(this.field1231);
        var1.method6644(this.field1232);
        return var1;
    }

    @ObfuscatedName("bs.s(B)Lcl;")
    public static class89 method1784() {
        class407 var0 = null;
        class89 var1 = new class89();
        try {
            var0 = class154.method3040("", Statics.field1847.field3497, false);
            byte[] var2 = new byte[(int) var0.method6485()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method6486(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class89(new class421(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method6483();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("al.e(I)V")
    public static void method450() {
        class407 var0 = null;
        try {
            var0 = class154.method3040("", Statics.field1847.field3497, true);
            class421 var1 = Statics.field4567.method2118();
            var0.method6480(var1.field4511, 0, var1.field4512);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6484(true);
            }
        } catch (Exception var4) {
        }
    }
}

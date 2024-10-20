package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cq")
public class class89 {

    @ObfuscatedName("cq.l")
    public static int field1206 = 8;

    @ObfuscatedName("cq.f")
    public boolean field1202;

    @ObfuscatedName("cq.j")
    public boolean field1208;

    @ObfuscatedName("cq.m")
    public int field1203 = 1;

    @ObfuscatedName("cq.k")
    public String field1199 = null;

    @ObfuscatedName("cq.t")
    public boolean field1204 = false;

    @ObfuscatedName("cq.a")
    public double field1213 = 0.8D;

    @ObfuscatedName("cq.e")
    public int field1207 = 127;

    @ObfuscatedName("cq.i")
    public int field1205 = 127;

    @ObfuscatedName("cq.y")
    public int field1201 = 127;

    @ObfuscatedName("cq.w")
    public int field1210 = -1;

    @ObfuscatedName("cq.g")
    public LinkedHashMap field1211 = new LinkedHashMap();

    public class89() {
        this.method2101(true);
    }

    public class89(class401 arg0) {
        if (arg0 == null || arg0.field4294 == null) {
            this.method2101(true);
        } else {
            int var2 = arg0.method6272();
            if (var2 >= 0 && var2 <= field1206) {
                if (arg0.method6272() == 1) {
                    this.field1202 = true;
                }
                if (var2 > 1) {
                    this.field1208 = arg0.method6272() == 1;
                }
                if (var2 > 3) {
                    this.field1203 = arg0.method6272();
                }
                if (var2 > 2) {
                    int var3 = arg0.method6272();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method6277();
                        int var6 = arg0.method6277();
                        this.field1211.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1199 = arg0.method6280();
                }
                if (var2 > 5) {
                    this.field1204 = arg0.method6483();
                }
                if (var2 > 6) {
                    this.field1213 = (double) arg0.method6272() / 100.0D;
                    this.field1207 = arg0.method6272();
                    this.field1205 = arg0.method6272();
                    this.field1201 = arg0.method6272();
                }
                if (var2 > 7) {
                    this.field1210 = arg0.method6272();
                }
            } else {
                this.method2101(true);
            }
        }
    }

    @ObfuscatedName("cq.l(ZS)V")
    public void method2101(boolean arg0) {
    }

    @ObfuscatedName("cq.q(B)Lot;")
    public class401 method2104() {
        class401 var1 = new class401(100);
        var1.method6269(field1206);
        var1.method6269(this.field1202 ? 1 : 0);
        var1.method6269(this.field1208 ? 1 : 0);
        var1.method6269(this.field1203);
        var1.method6269(this.field1211.size());
        Iterator var2 = this.field1211.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method6258((Integer) var3.getKey());
            var1.method6258((Integer) var3.getValue());
        }
        var1.method6489(this.field1199 == null ? "" : this.field1199);
        var1.method6343(this.field1204);
        var1.method6269((int) (this.field1213 * 100.0D));
        var1.method6269(this.field1207);
        var1.method6269(this.field1205);
        var1.method6269(this.field1201);
        var1.method6269(this.field1210);
        return var1;
    }

    @ObfuscatedName("bh.f(B)Lcq;")
    public static class89 method1800() {
        class385 var0 = null;
        class89 var1 = new class89();
        try {
            var0 = class144.method1543("", Statics.field4268.field3310, false);
            byte[] var2 = new byte[(int) var0.method6100()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method6096(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class89(new class401(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method6092();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("bj.j(B)V")
    public static void method1005() {
        class385 var0 = null;
        try {
            var0 = class144.method1543("", Statics.field4268.field3310, true);
            class401 var1 = Statics.field3227.method2104();
            var0.method6094(var1.field4294, 0, var1.field4292);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6095(true);
            }
        } catch (Exception var4) {
        }
    }
}

package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bp")
public class class76 {

    @ObfuscatedName("bp.s")
    public static int field1112 = 7;

    @ObfuscatedName("bp.v")
    public boolean field1113;

    @ObfuscatedName("bp.j")
    public boolean field1114;

    @ObfuscatedName("bp.l")
    public int field1122 = 1;

    @ObfuscatedName("bp.n")
    public String field1123 = null;

    @ObfuscatedName("bp.w")
    public boolean field1117 = false;

    @ObfuscatedName("bp.f")
    public double field1118 = 0.8D;

    @ObfuscatedName("bp.o")
    public int field1119 = 127;

    @ObfuscatedName("bp.x")
    public int field1121 = 127;

    @ObfuscatedName("bp.r")
    public int field1116 = 127;

    @ObfuscatedName("bp.p")
    public LinkedHashMap field1115 = new LinkedHashMap();

    public class76() {
        this.method1838(true);
    }

    public class76(class385 arg0) {
        if (arg0 == null || arg0.field4184 == null) {
            this.method1838(true);
        } else {
            int var2 = arg0.method5958();
            if (var2 >= 0 && var2 <= field1112) {
                if (arg0.method5958() == 1) {
                    this.field1113 = true;
                }
                if (var2 > 1) {
                    this.field1114 = arg0.method5958() == 1;
                }
                if (var2 > 3) {
                    this.field1122 = arg0.method5958();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5958();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method6182();
                        int var6 = arg0.method6182();
                        this.field1115.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1123 = arg0.method5966();
                }
                if (var2 > 5) {
                    this.field1117 = arg0.method6188();
                }
                if (var2 > 6) {
                    this.field1118 = (double) arg0.method5958() / 100.0D;
                    this.field1119 = arg0.method5958();
                    this.field1121 = arg0.method5958();
                    this.field1116 = arg0.method5958();
                }
            } else {
                this.method1838(true);
            }
        }
    }

    @ObfuscatedName("bp.s(ZI)V")
    public void method1838(boolean arg0) {
    }

    @ObfuscatedName("bp.t(I)Lnv;")
    public class385 method1844() {
        class385 var1 = new class385(100);
        var1.method5941(field1112);
        var1.method5941(this.field1113 ? 1 : 0);
        var1.method5941(this.field1114 ? 1 : 0);
        var1.method5941(this.field1122);
        var1.method5941(this.field1115.size());
        Iterator var2 = this.field1115.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5944((Integer) var3.getKey());
            var1.method5944((Integer) var3.getValue());
        }
        var1.method5948(this.field1123 == null ? "" : this.field1123);
        var1.method5947(this.field1117);
        var1.method5941((int) (this.field1118 * 100.0D));
        var1.method5941(this.field1119);
        var1.method5941(this.field1121);
        var1.method5941(this.field1116);
        return var1;
    }

    @ObfuscatedName("y.v(I)Lbp;")
    public static class76 method475() {
        class369 var0 = null;
        class76 var1 = new class76();
        try {
            var0 = class131.method1860("", Statics.field976.field3208, false);
            byte[] var2 = new byte[(int) var0.method5783()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method5789(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class76(new class385(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method5786();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ev.j(I)V")
    public static void method2370() {
        class369 var0 = null;
        try {
            var0 = class131.method1860("", Statics.field976.field3208, true);
            class385 var1 = Statics.field308.method1844();
            var0.method5790(var1.field4184, 0, var1.field4182);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method5798(true);
            }
        } catch (Exception var4) {
        }
    }
}

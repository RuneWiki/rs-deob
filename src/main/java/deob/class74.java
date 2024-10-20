package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bf")
public class class74 {

    @ObfuscatedName("bf.m")
    public static int field1028 = 6;

    @ObfuscatedName("bf.q")
    public boolean field1022;

    @ObfuscatedName("bf.w")
    public boolean field1029;

    @ObfuscatedName("bf.o")
    public int field1024 = 1;

    @ObfuscatedName("bf.u")
    public String field1026 = null;

    @ObfuscatedName("bf.g")
    public boolean field1020 = false;

    @ObfuscatedName("bf.l")
    public LinkedHashMap field1027 = new LinkedHashMap();

    public class74() {
        this.method1628(true);
    }

    public class74(class202 arg0) {
        if (arg0 == null || arg0.field2440 == null) {
            this.method1628(true);
        } else {
            int var2 = arg0.method3551();
            if (var2 >= 0 && var2 <= field1028) {
                if (arg0.method3551() == 1) {
                    this.field1022 = true;
                }
                if (var2 > 1) {
                    this.field1029 = arg0.method3551() == 1;
                }
                if (var2 > 3) {
                    this.field1024 = arg0.method3551();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3551();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3620();
                        int var6 = arg0.method3620();
                        this.field1027.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1026 = arg0.method3425();
                }
                if (var2 > 5) {
                    this.field1020 = arg0.method3424();
                }
            } else {
                this.method1628(true);
            }
        }
    }

    @ObfuscatedName("bf.m(ZI)V")
    public void method1628(boolean arg0) {
    }

    @ObfuscatedName("bf.f(I)Lgr;")
    public class202 method1630() {
        class202 var1 = new class202(100);
        var1.method3565(field1028);
        var1.method3565(this.field1022 ? 1 : 0);
        var1.method3565(this.field1029 ? 1 : 0);
        var1.method3565(this.field1024);
        var1.method3565(this.field1027.size());
        Iterator var2 = this.field1027.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3422((Integer) var3.getKey());
            var1.method3422((Integer) var3.getValue());
        }
        var1.method3591(this.field1026 == null ? "" : this.field1026);
        var1.method3407(this.field1020);
        return var1;
    }

    @ObfuscatedName("ku.q(B)Lbf;")
    public static class74 method5315() {
        class119 var0 = null;
        class74 var1 = new class74();
        try {
            var0 = class169.method3317("", Statics.field166.field3182, false);
            byte[] var2 = new byte[(int) var0.method2476()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2477(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class74(new class202(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2474();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("y.w(I)V")
    public static void method230() {
        class119 var0 = null;
        try {
            var0 = class169.method3317("", Statics.field166.field3182, true);
            class202 var1 = Statics.field3868.method1630();
            var0.method2473(var1.field2440, 0, var1.field2439);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2481(true);
            }
        } catch (Exception var4) {
        }
    }
}

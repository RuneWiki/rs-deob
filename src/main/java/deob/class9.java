package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("h")
public class class9 {

    @ObfuscatedName("h.z")
    public static int field143 = 4;

    @ObfuscatedName("h.k")
    public boolean field138;

    @ObfuscatedName("h.f")
    public boolean field141;

    @ObfuscatedName("h.d")
    public int field142 = 1;

    @ObfuscatedName("h.l")
    public LinkedHashMap field145 = new LinkedHashMap();

    public class9() {
        this.method109(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1987 == null) {
            this.method109(true);
        } else {
            int var2 = arg0.method2457();
            if (var2 >= 0 && var2 <= field143) {
                if (arg0.method2457() == 1) {
                    this.field138 = true;
                }
                if (var2 > 1) {
                    this.field141 = arg0.method2457() == 1;
                }
                if (var2 > 3) {
                    this.field142 = arg0.method2457();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2457();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2306();
                        int var6 = arg0.method2306();
                        this.field145.put(var5, var6);
                    }
                }
            } else {
                this.method109(true);
            }
        }
    }

    @ObfuscatedName("h.z(ZI)V")
    public void method109(boolean arg0) {
    }

    @ObfuscatedName("h.q(I)Lda;")
    public class119 method110() {
        class119 var1 = new class119(100);
        var1.method2285(field143);
        var1.method2285(this.field138 ? 1 : 0);
        var1.method2285(this.field141 ? 1 : 0);
        var1.method2285(this.field142);
        var1.method2285(this.field145.size());
        Iterator var2 = this.field145.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2289((Integer) var3.getKey());
            var1.method2289((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("bo.k(B)Lh;")
    public static class9 method1042() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method2227("", Statics.field284.field2283, false);
            byte[] var2 = new byte[(int) var0.method3770()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3771(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3769();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("hj.f(I)V")
    public static void method3591() {
        class227 var0 = null;
        try {
            var0 = class149.method2227("", Statics.field284.field2283, true);
            class119 var1 = Statics.field2026.method110();
            var0.method3767(var1.field1987, 0, var1.field1986);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3769();
            }
        } catch (Exception var4) {
        }
    }
}

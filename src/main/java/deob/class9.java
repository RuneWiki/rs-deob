package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("d")
public class class9 {

    @ObfuscatedName("d.p")
    public static int field143 = 4;

    @ObfuscatedName("d.e")
    public boolean field134;

    @ObfuscatedName("d.f")
    public boolean field132;

    @ObfuscatedName("d.w")
    public int field136 = 1;

    @ObfuscatedName("d.t")
    public LinkedHashMap field137 = new LinkedHashMap();

    public class9() {
        this.method94(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1889 == null) {
            this.method94(true);
        } else {
            int var2 = arg0.method2314();
            if (var2 >= 0 && var2 <= field143) {
                if (arg0.method2314() == 1) {
                    this.field134 = true;
                }
                if (var2 > 1) {
                    this.field132 = arg0.method2314() == 1;
                }
                if (var2 > 3) {
                    this.field136 = arg0.method2314();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2314();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2350();
                        int var6 = arg0.method2350();
                        this.field137.put(var5, var6);
                    }
                }
            } else {
                this.method94(true);
            }
        }
    }

    @ObfuscatedName("d.p(ZI)V")
    public void method94(boolean arg0) {
    }

    @ObfuscatedName("d.k(I)Lde;")
    public class111 method81() {
        class111 var1 = new class111(100);
        var1.method2160(field143);
        var1.method2160(this.field134 ? 1 : 0);
        var1.method2160(this.field132 ? 1 : 0);
        var1.method2160(this.field136);
        var1.method2160(this.field137.size());
        Iterator var2 = this.field137.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2161((Integer) var3.getKey());
            var1.method2161((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ep.e(I)Ld;")
    public static class9 method2667() {
        class218 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class141.method2006("", Statics.field260.field2190, false);
            byte[] var2 = new byte[(int) var0.method3721()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3731(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class111(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3720();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ea.f(I)V")
    public static void method2816() {
        class218 var0 = null;
        try {
            var0 = class141.method2006("", Statics.field260.field2190, true);
            class111 var1 = Statics.field71.method81();
            var0.method3719(var1.field1889, 0, var1.field1885);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3720();
            }
        } catch (Exception var4) {
        }
    }
}

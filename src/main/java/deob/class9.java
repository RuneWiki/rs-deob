package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("g")
public class class9 {

    @ObfuscatedName("g.f")
    public static int field135 = 3;

    @ObfuscatedName("g.y")
    public boolean field132;

    @ObfuscatedName("g.e")
    public boolean field134;

    @ObfuscatedName("g.r")
    public LinkedHashMap field136 = new LinkedHashMap();

    public class9() {
        this.method103(true);
    }

    public class9(class108 arg0) {
        if (arg0 == null || arg0.field1854 == null) {
            this.method103(true);
        } else {
            int var2 = arg0.method2158();
            if (var2 >= 0 && var2 <= field135) {
                if (arg0.method2158() == 1) {
                    this.field132 = true;
                }
                if (var2 > 1) {
                    this.field134 = arg0.method2158() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2158();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2256();
                        int var6 = arg0.method2256();
                        this.field136.put(var5, var6);
                    }
                }
            } else {
                this.method103(true);
            }
        }
    }

    @ObfuscatedName("g.f(ZI)V")
    public void method103(boolean arg0) {
    }

    @ObfuscatedName("g.k(I)Ldu;")
    public class108 method102() {
        class108 var1 = new class108(100);
        var1.method2144(field135);
        var1.method2144(this.field132 ? 1 : 0);
        var1.method2144(this.field134 ? 1 : 0);
        var1.method2144(this.field136.size());
        Iterator var2 = this.field136.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2147((Integer) var3.getKey());
            var1.method2147((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("at.y(B)Lg;")
    public static class9 method743() {
        class207 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class138.method645("", Statics.field615.field2152, false);
            byte[] var2 = new byte[(int) var0.method3556()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3553(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class108(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3562();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ec.e(I)V")
    public static void method2715() {
        class207 var0 = null;
        try {
            var0 = class138.method645("", Statics.field615.field2152, true);
            class108 var1 = Statics.field184.method102();
            var0.method3555(var1.field1854, 0, var1.field1859);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3562();
            }
        } catch (Exception var4) {
        }
    }
}

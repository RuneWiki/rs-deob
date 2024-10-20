package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("v")
public class class9 {

    @ObfuscatedName("v.y")
    public static int field138 = 4;

    @ObfuscatedName("v.g")
    public boolean field135;

    @ObfuscatedName("v.n")
    public boolean field133;

    @ObfuscatedName("v.t")
    public int field137 = 1;

    @ObfuscatedName("v.e")
    public LinkedHashMap field141 = new LinkedHashMap();

    public class9() {
        this.method82(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1897 == null) {
            this.method82(true);
        } else {
            int var2 = arg0.method2205();
            if (var2 >= 0 && var2 <= field138) {
                if (arg0.method2205() == 1) {
                    this.field135 = true;
                }
                if (var2 > 1) {
                    this.field133 = arg0.method2205() == 1;
                }
                if (var2 > 3) {
                    this.field137 = arg0.method2205();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2205();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2165();
                        int var6 = arg0.method2165();
                        this.field141.put(var5, var6);
                    }
                }
            } else {
                this.method82(true);
            }
        }
    }

    @ObfuscatedName("v.y(ZS)V")
    public void method82(boolean arg0) {
    }

    @ObfuscatedName("v.k(B)Ldw;")
    public class111 method83() {
        class111 var1 = new class111(100);
        var1.method2145(field138);
        var1.method2145(this.field135 ? 1 : 0);
        var1.method2145(this.field133 ? 1 : 0);
        var1.method2145(this.field137);
        var1.method2145(this.field141.size());
        Iterator var2 = this.field141.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2148((Integer) var3.getKey());
            var1.method2148((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("dz.g(B)Lv;")
    public static class9 method2530() {
        class218 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class141.method94("", Statics.field2851.field2198, false);
            byte[] var2 = new byte[(int) var0.method3703()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3704(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class111(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3705();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("eq.n(I)V")
    public static void method2780() {
        class218 var0 = null;
        try {
            var0 = class141.method94("", Statics.field2851.field2198, true);
            class111 var1 = Statics.field2828.method83();
            var0.method3701(var1.field1897, 0, var1.field1902);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3705();
            }
        } catch (Exception var4) {
        }
    }
}

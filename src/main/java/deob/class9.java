package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("o")
public class class9 {

    @ObfuscatedName("o.k")
    public static int field142 = 3;

    @ObfuscatedName("o.y")
    public boolean field134;

    @ObfuscatedName("o.w")
    public boolean field137;

    @ObfuscatedName("o.m")
    public LinkedHashMap field139 = new LinkedHashMap();

    public class9() {
        this.method89(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1865 == null) {
            this.method89(true);
        } else {
            int var2 = arg0.method2111();
            if (var2 >= 0 && var2 <= field142) {
                if (arg0.method2111() == 1) {
                    this.field134 = true;
                }
                if (var2 > 1) {
                    this.field137 = arg0.method2111() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2111();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2116();
                        int var6 = arg0.method2116();
                        this.field139.put(var5, var6);
                    }
                }
            } else {
                this.method89(true);
            }
        }
    }

    @ObfuscatedName("o.k(ZI)V")
    public void method89(boolean arg0) {
    }

    @ObfuscatedName("o.r(I)Lde;")
    public class107 method90() {
        class107 var1 = new class107(100);
        var1.method2097(field142);
        var1.method2097(this.field134 ? 1 : 0);
        var1.method2097(this.field137 ? 1 : 0);
        var1.method2097(this.field139.size());
        Iterator var2 = this.field139.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2100((Integer) var3.getKey());
            var1.method2100((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("an.y(I)Lo;")
    public static class9 method593() {
        class195 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = Statics.method2372("", Statics.field705.field2116, false);
            byte[] var2 = new byte[(int) var0.method3415()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3412(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class107(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3422();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ed.w(B)V")
    public static void method2790() {
        class195 var0 = null;
        try {
            var0 = Statics.method2372("", Statics.field705.field2116, true);
            class107 var1 = Statics.field1087.method90();
            var0.method3409(var1.field1865, 0, var1.field1863);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3422();
            }
        } catch (Exception var4) {
        }
    }
}

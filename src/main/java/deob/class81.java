package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ck")
public class class81 {

    @ObfuscatedName("ck.n")
    public static int field1233 = 6;

    @ObfuscatedName("ck.y")
    public boolean field1240;

    @ObfuscatedName("ck.r")
    public boolean field1236;

    @ObfuscatedName("ck.h")
    public int field1237 = 1;

    @ObfuscatedName("ck.d")
    public String field1238 = null;

    @ObfuscatedName("ck.s")
    public boolean field1239 = false;

    @ObfuscatedName("ck.b")
    public LinkedHashMap field1234 = new LinkedHashMap();

    public class81() {
        this.method1492(true);
    }

    public class81(class185 arg0) {
        if (arg0 == null || arg0.field2528 == null) {
            this.method1492(true);
        } else {
            int var2 = arg0.method3021();
            if (var2 >= 0 && var2 <= field1233) {
                if (arg0.method3021() == 1) {
                    this.field1240 = true;
                }
                if (var2 > 1) {
                    this.field1236 = arg0.method3021() == 1;
                }
                if (var2 > 3) {
                    this.field1237 = arg0.method3021();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3021();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3026();
                        int var6 = arg0.method3026();
                        this.field1234.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1238 = arg0.method3029();
                }
                if (var2 > 5) {
                    this.field1239 = arg0.method3028();
                }
            } else {
                this.method1492(true);
            }
        }
    }

    @ObfuscatedName("ck.n(ZB)V")
    public void method1492(boolean arg0) {
    }

    @ObfuscatedName("ck.v(I)Lgv;")
    public class185 method1502() {
        class185 var1 = new class185(100);
        var1.method3157(field1233);
        var1.method3157(this.field1240 ? 1 : 0);
        var1.method3157(this.field1236 ? 1 : 0);
        var1.method3157(this.field1237);
        var1.method3157(this.field1234.size());
        Iterator var2 = this.field1234.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3005((Integer) var3.getKey());
            var1.method3005((Integer) var3.getValue());
        }
        var1.method3012(this.field1238 == null ? "" : this.field1238);
        var1.method3011(this.field1239);
        return var1;
    }

    @ObfuscatedName("fe.y(I)Lck;")
    public static class81 method2934() {
        class124 var0 = null;
        class81 var1 = new class81();
        try {
            var0 = class158.method44("", Statics.field19.field3296, false);
            byte[] var2 = new byte[(int) var0.method2208()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2203(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class81(new class185(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2195();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ch.r(B)V")
    public static void method1488() {
        class124 var0 = null;
        try {
            var0 = class158.method44("", Statics.field19.field3296, true);
            class185 var1 = Statics.field2727.method1502();
            var0.method2194(var1.field2528, 0, var1.field2529);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2196(true);
            }
        } catch (Exception var4) {
        }
    }
}

package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bg")
public class class78 {

    @ObfuscatedName("bg.s")
    public static int field1199 = 6;

    @ObfuscatedName("bg.m")
    public boolean field1203;

    @ObfuscatedName("bg.h")
    public boolean field1201;

    @ObfuscatedName("bg.i")
    public int field1202 = 1;

    @ObfuscatedName("bg.w")
    public String field1205 = null;

    @ObfuscatedName("bg.t")
    public boolean field1204 = false;

    @ObfuscatedName("bg.d")
    public LinkedHashMap field1198 = new LinkedHashMap();

    public class78() {
        this.method1563(true);
    }

    public class78(class185 arg0) {
        if (arg0 == null || arg0.field2512 == null) {
            this.method1563(true);
        } else {
            int var2 = arg0.method3239();
            if (var2 >= 0 && var2 <= field1199) {
                if (arg0.method3239() == 1) {
                    this.field1203 = true;
                }
                if (var2 > 1) {
                    this.field1201 = arg0.method3239() == 1;
                }
                if (var2 > 3) {
                    this.field1202 = arg0.method3239();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3239();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3292();
                        int var6 = arg0.method3292();
                        this.field1198.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1205 = arg0.method3274();
                }
                if (var2 > 5) {
                    this.field1204 = arg0.method3246();
                }
            } else {
                this.method1563(true);
            }
        }
    }

    @ObfuscatedName("bg.s(ZI)V")
    public void method1563(boolean arg0) {
    }

    @ObfuscatedName("bg.g(B)Lgy;")
    public class185 method1549() {
        class185 var1 = new class185(100);
        var1.method3223(field1199);
        var1.method3223(this.field1203 ? 1 : 0);
        var1.method3223(this.field1201 ? 1 : 0);
        var1.method3223(this.field1202);
        var1.method3223(this.field1198.size());
        Iterator var2 = this.field1198.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3242((Integer) var3.getKey());
            var1.method3242((Integer) var3.getValue());
        }
        var1.method3230(this.field1205 == null ? "" : this.field1205);
        var1.method3229(this.field1204);
        return var1;
    }

    @ObfuscatedName("at.m(I)Lbg;")
    public static class78 method640() {
        class101 var0 = null;
        class78 var1 = new class78();
        try {
            var0 = class158.method2623("", Statics.field1554.field3286, false);
            byte[] var2 = new byte[(int) var0.method1959()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method1966(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class78(new class185(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method1958();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("bb.h(B)V")
    public static void method1502() {
        class101 var0 = null;
        try {
            var0 = class158.method2623("", Statics.field1554.field3286, true);
            class185 var1 = Statics.field263.method1549();
            var0.method1957(var1.field2512, 0, var1.field2514);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1967(true);
            }
        } catch (Exception var4) {
        }
    }
}

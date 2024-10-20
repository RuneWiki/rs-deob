package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bv")
public class class68 {

    @ObfuscatedName("bv.y")
    public static int field1013 = 6;

    @ObfuscatedName("bv.n")
    public boolean field1011;

    @ObfuscatedName("bv.u")
    public boolean field1009;

    @ObfuscatedName("bv.i")
    public int field1010 = 1;

    @ObfuscatedName("bv.r")
    public String field1015 = null;

    @ObfuscatedName("bv.j")
    public boolean field1012 = false;

    @ObfuscatedName("bv.p")
    public LinkedHashMap field1014 = new LinkedHashMap();

    public class68() {
        this.method1507(true);
    }

    public class68(class185 arg0) {
        if (arg0 == null || arg0.field2373 == null) {
            this.method1507(true);
        } else {
            int var2 = arg0.method3299();
            if (var2 >= 0 && var2 <= field1013) {
                if (arg0.method3299() == 1) {
                    this.field1011 = true;
                }
                if (var2 > 1) {
                    this.field1009 = arg0.method3299() == 1;
                }
                if (var2 > 3) {
                    this.field1010 = arg0.method3299();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3299();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3374();
                        int var6 = arg0.method3374();
                        this.field1014.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1015 = arg0.method3276();
                }
                if (var2 > 5) {
                    this.field1012 = arg0.method3275();
                }
            } else {
                this.method1507(true);
            }
        }
    }

    @ObfuscatedName("bv.y(ZB)V")
    public void method1507(boolean arg0) {
    }

    @ObfuscatedName("bv.c(I)Lge;")
    public class185 method1512() {
        class185 var1 = new class185(100);
        var1.method3253(field1013);
        var1.method3253(this.field1011 ? 1 : 0);
        var1.method3253(this.field1009 ? 1 : 0);
        var1.method3253(this.field1010);
        var1.method3253(this.field1014.size());
        Iterator var2 = this.field1014.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3256((Integer) var3.getKey());
            var1.method3256((Integer) var3.getValue());
        }
        var1.method3260(this.field1015 == null ? "" : this.field1015);
        var1.method3259(this.field1012);
        return var1;
    }

    @ObfuscatedName("cb.n(B)Lbv;")
    public static class68 method1769() {
        class113 var0 = null;
        class68 var1 = new class68();
        try {
            var0 = class158.method3166("", Statics.field3664.field3185, false);
            byte[] var2 = new byte[(int) var0.method2327()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2328(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class68(new class185(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2331();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("fv.u(B)V")
    public static void method3057() {
        class113 var0 = null;
        try {
            var0 = class158.method3166("", Statics.field3664.field3185, true);
            class185 var1 = Statics.field257.method1512();
            var0.method2324(var1.field2373, 0, var1.field2374);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2338(true);
            }
        } catch (Exception var4) {
        }
    }
}

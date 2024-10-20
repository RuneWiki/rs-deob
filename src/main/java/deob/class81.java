package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cf")
public class class81 {

    @ObfuscatedName("cf.a")
    public static int field1213 = 6;

    @ObfuscatedName("cf.e")
    public boolean field1211;

    @ObfuscatedName("cf.k")
    public boolean field1212;

    @ObfuscatedName("cf.u")
    public int field1214 = 1;

    @ObfuscatedName("cf.z")
    public String field1219 = null;

    @ObfuscatedName("cf.t")
    public boolean field1215 = false;

    @ObfuscatedName("cf.f")
    public LinkedHashMap field1216 = new LinkedHashMap();

    public class81() {
        this.method1400(true);
    }

    public class81(class185 arg0) {
        if (arg0 == null || arg0.field2512 == null) {
            this.method1400(true);
        } else {
            int var2 = arg0.method2962();
            if (var2 >= 0 && var2 <= field1213) {
                if (arg0.method2962() == 1) {
                    this.field1211 = true;
                }
                if (var2 > 1) {
                    this.field1212 = arg0.method2962() == 1;
                }
                if (var2 > 3) {
                    this.field1214 = arg0.method2962();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2962();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2967();
                        int var6 = arg0.method2967();
                        this.field1216.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1219 = arg0.method3090();
                }
                if (var2 > 5) {
                    this.field1215 = arg0.method2969();
                }
            } else {
                this.method1400(true);
            }
        }
    }

    @ObfuscatedName("cf.a(ZB)V")
    public void method1400(boolean arg0) {
    }

    @ObfuscatedName("cf.w(B)Lgh;")
    public class185 method1399() {
        class185 var1 = new class185(100);
        var1.method2946(field1213);
        var1.method2946(this.field1211 ? 1 : 0);
        var1.method2946(this.field1212 ? 1 : 0);
        var1.method2946(this.field1214);
        var1.method2946(this.field1216.size());
        Iterator var2 = this.field1216.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2949((Integer) var3.getKey());
            var1.method2949((Integer) var3.getValue());
        }
        var1.method3106(this.field1219 == null ? "" : this.field1219);
        var1.method2952(this.field1215);
        return var1;
    }

    @ObfuscatedName("bt.e(I)Lcf;")
    public static class81 method946() {
        class124 var0 = null;
        class81 var1 = new class81();
        try {
            var0 = class158.method1693("", Statics.field722.field3296, false);
            byte[] var2 = new byte[(int) var0.method2149()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2169(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class81(new class185(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2147();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("s.k(I)V")
    public static void method52() {
        class124 var0 = null;
        try {
            var0 = class158.method1693("", Statics.field722.field3296, true);
            class185 var1 = Statics.field15.method1399();
            var0.method2146(var1.field2512, 0, var1.field2509);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2148(true);
            }
        } catch (Exception var4) {
        }
    }
}

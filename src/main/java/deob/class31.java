package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ah")
public class class31 {

    @ObfuscatedName("ah.k")
    public static int field687 = 4;

    @ObfuscatedName("ah.o")
    public boolean field686;

    @ObfuscatedName("ah.r")
    public boolean field684;

    @ObfuscatedName("ah.w")
    public int field685 = 1;

    @ObfuscatedName("ah.j")
    public LinkedHashMap field689 = new LinkedHashMap();

    public class31() {
        this.method685(true);
    }

    public class31(class161 arg0) {
        if (arg0 == null || arg0.field2258 == null) {
            this.method685(true);
        } else {
            int var2 = arg0.method2733();
            if (var2 >= 0 && var2 <= field687) {
                if (arg0.method2733() == 1) {
                    this.field686 = true;
                }
                if (var2 > 1) {
                    this.field684 = arg0.method2733() == 1;
                }
                if (var2 > 3) {
                    this.field685 = arg0.method2733();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2733();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2868();
                        int var6 = arg0.method2868();
                        this.field689.put(var5, var6);
                    }
                }
            } else {
                this.method685(true);
            }
        }
    }

    @ObfuscatedName("ah.k(ZI)V")
    public void method685(boolean arg0) {
    }

    @ObfuscatedName("ah.y(I)Lfm;")
    public class161 method681() {
        class161 var1 = new class161(100);
        var1.method2718(field687);
        var1.method2718(this.field686 ? 1 : 0);
        var1.method2718(this.field684 ? 1 : 0);
        var1.method2718(this.field685);
        var1.method2718(this.field689.size());
        Iterator var2 = this.field689.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2863((Integer) var3.getKey());
            var1.method2863((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("go.o(B)Lah;")
    public static class31 method3525() {
        class74 var0 = null;
        class31 var1 = new class31();
        try {
            var0 = class105.method611("", Statics.field230.field2676, false);
            byte[] var2 = new byte[(int) var0.method1334()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method1335(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class31(new class161(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method1333();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("r.r(B)V")
    public static void method40() {
        class74 var0 = null;
        try {
            var0 = class105.method611("", Statics.field230.field2676, true);
            class161 var1 = Statics.field1457.method681();
            var0.method1332(var1.field2258, 0, var1.field2267);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1333();
            }
        } catch (Exception var4) {
        }
    }
}

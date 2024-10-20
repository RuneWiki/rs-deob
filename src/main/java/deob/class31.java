package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ae")
public class class31 {

    @ObfuscatedName("ae.o")
    public static int field706 = 4;

    @ObfuscatedName("ae.b")
    public boolean field700;

    @ObfuscatedName("ae.g")
    public boolean field701;

    @ObfuscatedName("ae.h")
    public int field702 = 1;

    @ObfuscatedName("ae.v")
    public LinkedHashMap field707 = new LinkedHashMap();

    public class31() {
        this.method642(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2108 == null) {
            this.method642(true);
        } else {
            int var2 = arg0.method2552();
            if (var2 >= 0 && var2 <= field706) {
                if (arg0.method2552() == 1) {
                    this.field700 = true;
                }
                if (var2 > 1) {
                    this.field701 = arg0.method2552() == 1;
                }
                if (var2 > 3) {
                    this.field702 = arg0.method2552();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2552();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2557();
                        int var6 = arg0.method2557();
                        this.field707.put(var5, var6);
                    }
                }
            } else {
                this.method642(true);
            }
        }
    }

    @ObfuscatedName("ae.o(ZI)V")
    public void method642(boolean arg0) {
    }

    @ObfuscatedName("ae.m(B)Lez;")
    public class154 method632() {
        class154 var1 = new class154(100);
        var1.method2641(field706);
        var1.method2641(this.field700 ? 1 : 0);
        var1.method2641(this.field701 ? 1 : 0);
        var1.method2641(this.field702);
        var1.method2641(this.field707.size());
        Iterator var2 = this.field707.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2540((Integer) var3.getKey());
            var1.method2540((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("af.b(I)Lae;")
    public static class31 method719() {
        class74 var0 = null;
        class31 var1 = new class31();
        try {
            var0 = class105.method672("", Statics.field2025.field2701, false);
            byte[] var2 = new byte[(int) var0.method1313()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method1315(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class31(new class154(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method1324();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ds.g(I)V")
    public static void method2089() {
        class74 var0 = null;
        try {
            var0 = class105.method672("", Statics.field2025.field2701, true);
            class154 var1 = Statics.field36.method632();
            var0.method1311(var1.field2108, 0, var1.field2105);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1324();
            }
        } catch (Exception var4) {
        }
    }
}

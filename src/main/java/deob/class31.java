package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("am")
public class class31 {

    @ObfuscatedName("am.q")
    public static int field716 = 4;

    @ObfuscatedName("am.h")
    public boolean field715;

    @ObfuscatedName("am.p")
    public boolean field721;

    @ObfuscatedName("am.j")
    public int field717 = 1;

    @ObfuscatedName("am.n")
    public LinkedHashMap field718 = new LinkedHashMap();

    public class31() {
        this.method679(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2092 == null) {
            this.method679(true);
        } else {
            int var2 = arg0.method2666();
            if (var2 >= 0 && var2 <= field716) {
                if (arg0.method2666() == 1) {
                    this.field715 = true;
                }
                if (var2 > 1) {
                    this.field721 = arg0.method2666() == 1;
                }
                if (var2 > 3) {
                    this.field717 = arg0.method2666();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2666();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2798();
                        int var6 = arg0.method2798();
                        this.field718.put(var5, var6);
                    }
                }
            } else {
                this.method679(true);
            }
        }
    }

    @ObfuscatedName("am.q(ZI)V")
    public void method679(boolean arg0) {
    }

    @ObfuscatedName("am.d(I)Lel;")
    public class154 method681() {
        class154 var1 = new class154(100);
        var1.method2751(field716);
        var1.method2751(this.field715 ? 1 : 0);
        var1.method2751(this.field721 ? 1 : 0);
        var1.method2751(this.field717);
        var1.method2751(this.field718.size());
        Iterator var2 = this.field718.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2654((Integer) var3.getKey());
            var1.method2654((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("fm.h(B)Lam;")
    public static class31 method3023() {
        class74 var0 = null;
        class31 var1 = new class31();
        try {
            var0 = class105.method221("", Statics.field307.field2690, false);
            byte[] var2 = new byte[(int) var0.method1412()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method1407(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class31(new class154(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method1410();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("co.p(B)V")
    public static void method1906() {
        class74 var0 = null;
        try {
            var0 = class105.method221("", Statics.field307.field2690, true);
            class154 var1 = Statics.field2736.method681();
            var0.method1404(var1.field2092, 0, var1.field2091);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1410();
            }
        } catch (Exception var4) {
        }
    }
}

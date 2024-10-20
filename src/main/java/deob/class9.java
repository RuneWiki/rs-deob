package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("z")
public class class9 {

    @ObfuscatedName("z.e")
    public static int field141 = 3;

    @ObfuscatedName("z.k")
    public boolean field133;

    @ObfuscatedName("z.g")
    public boolean field136;

    @ObfuscatedName("z.q")
    public LinkedHashMap field135 = new LinkedHashMap();

    public class9() {
        this.method88(true);
    }

    public class9(class108 arg0) {
        if (arg0 == null || arg0.field1842 == null) {
            this.method88(true);
        } else {
            int var2 = arg0.method2122();
            if (var2 >= 0 && var2 <= field141) {
                if (arg0.method2122() == 1) {
                    this.field133 = true;
                }
                if (var2 > 1) {
                    this.field136 = arg0.method2122() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2122();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2127();
                        int var6 = arg0.method2127();
                        this.field135.put(var5, var6);
                    }
                }
            } else {
                this.method88(true);
            }
        }
    }

    @ObfuscatedName("z.e(ZB)V")
    public void method88(boolean arg0) {
    }

    @ObfuscatedName("z.v(I)Ldd;")
    public class108 method89() {
        class108 var1 = new class108(100);
        var1.method2123(field141);
        var1.method2123(this.field133 ? 1 : 0);
        var1.method2123(this.field136 ? 1 : 0);
        var1.method2123(this.field135.size());
        Iterator var2 = this.field135.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2134((Integer) var3.getKey());
            var1.method2134((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("l.k(I)Lz;")
    public static class9 method71() {
        class207 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class138.method2688("", Statics.field246.field2139, false);
            byte[] var2 = new byte[(int) var0.method3516()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3517(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class108(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3515();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("g.g(S)V")
    public static void method27() {
        class207 var0 = null;
        try {
            var0 = class138.method2688("", Statics.field246.field2139, true);
            class108 var1 = Statics.field1296.method89();
            var0.method3530(var1.field1842, 0, var1.field1841);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3515();
            }
        } catch (Exception var4) {
        }
    }
}

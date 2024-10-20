package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("t")
public class class9 {

    @ObfuscatedName("t.l")
    public static int field132 = 3;

    @ObfuscatedName("t.g")
    public boolean field136;

    @ObfuscatedName("t.j")
    public boolean field133;

    @ObfuscatedName("t.w")
    public LinkedHashMap field138 = new LinkedHashMap();

    public class9() {
        this.method111(true);
    }

    public class9(class108 arg0) {
        if (arg0 == null || arg0.field1828 == null) {
            this.method111(true);
        } else {
            int var2 = arg0.method2291();
            if (var2 >= 0 && var2 <= field132) {
                if (arg0.method2291() == 1) {
                    this.field136 = true;
                }
                if (var2 > 1) {
                    this.field133 = arg0.method2291() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2291();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2297();
                        int var6 = arg0.method2297();
                        this.field138.put(var5, var6);
                    }
                }
            } else {
                this.method111(true);
            }
        }
    }

    @ObfuscatedName("t.l(ZI)V")
    public void method111(boolean arg0) {
    }

    @ObfuscatedName("t.y(B)Ldk;")
    public class108 method118() {
        class108 var1 = new class108(100);
        var1.method2226(field132);
        var1.method2226(this.field136 ? 1 : 0);
        var1.method2226(this.field133 ? 1 : 0);
        var1.method2226(this.field138.size());
        Iterator var2 = this.field138.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2150((Integer) var3.getKey());
            var1.method2150((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("f.g(I)Lt;")
    public static class9 method110() {
        class207 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class138.method1984("", Statics.field2015.field2120, false);
            byte[] var2 = new byte[(int) var0.method3586()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3605(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class108(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3588();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("am.j(I)V")
    public static void method690() {
        class207 var0 = null;
        try {
            var0 = class138.method1984("", Statics.field2015.field2120, true);
            class108 var1 = Statics.field1773.method118();
            var0.method3606(var1.field1828, 0, var1.field1823);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3588();
            }
        } catch (Exception var4) {
        }
    }
}

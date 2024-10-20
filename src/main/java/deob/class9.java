package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("n")
public class class9 {

    @ObfuscatedName("n.l")
    public static int field146 = 4;

    @ObfuscatedName("n.r")
    public boolean field144;

    @ObfuscatedName("n.e")
    public boolean field149;

    @ObfuscatedName("n.h")
    public int field147 = 1;

    @ObfuscatedName("n.s")
    public LinkedHashMap field148 = new LinkedHashMap();

    public class9() {
        this.method112(true);
    }

    public class9(class123 arg0) {
        if (arg0 == null || arg0.field2052 == null) {
            this.method112(true);
        } else {
            int var2 = arg0.method2490();
            if (var2 >= 0 && var2 <= field146) {
                if (arg0.method2490() == 1) {
                    this.field144 = true;
                }
                if (var2 > 1) {
                    this.field149 = arg0.method2490() == 1;
                }
                if (var2 > 3) {
                    this.field147 = arg0.method2490();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2490();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2477();
                        int var6 = arg0.method2477();
                        this.field148.put(var5, var6);
                    }
                }
            } else {
                this.method112(true);
            }
        }
    }

    @ObfuscatedName("n.l(ZB)V")
    public void method112(boolean arg0) {
    }

    @ObfuscatedName("n.g(I)Ldc;")
    public class123 method113() {
        class123 var1 = new class123(100);
        var1.method2640(field146);
        var1.method2640(this.field144 ? 1 : 0);
        var1.method2640(this.field149 ? 1 : 0);
        var1.method2640(this.field147);
        var1.method2640(this.field148.size());
        Iterator var2 = this.field148.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2585((Integer) var3.getKey());
            var1.method2585((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("h.r(B)Ln;")
    public static class9 method46() {
        class231 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class153.method2401("", Statics.field299.field2347, false);
            byte[] var2 = new byte[(int) var0.method4014()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method4015(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class123(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method4024();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ae.e(B)V")
    public static void method861() {
        class231 var0 = null;
        try {
            var0 = class153.method2401("", Statics.field299.field2347, true);
            class123 var1 = Statics.field2124.method113();
            var0.method4016(var1.field2052, 0, var1.field2051);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method4024();
            }
        } catch (Exception var4) {
        }
    }
}

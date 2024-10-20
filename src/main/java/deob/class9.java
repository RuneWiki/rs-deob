package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("m")
public class class9 {

    @ObfuscatedName("m.i")
    public static int field157 = 4;

    @ObfuscatedName("m.e")
    public boolean field155;

    @ObfuscatedName("m.g")
    public boolean field158;

    @ObfuscatedName("m.n")
    public int field162 = 1;

    @ObfuscatedName("m.u")
    public LinkedHashMap field156 = new LinkedHashMap();

    public class9() {
        this.method102(true);
    }

    public class9(class123 arg0) {
        if (arg0 == null || arg0.field2049 == null) {
            this.method102(true);
        } else {
            int var2 = arg0.method2404();
            if (var2 >= 0 && var2 <= field157) {
                if (arg0.method2404() == 1) {
                    this.field155 = true;
                }
                if (var2 > 1) {
                    this.field158 = arg0.method2404() == 1;
                }
                if (var2 > 3) {
                    this.field162 = arg0.method2404();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2404();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2409();
                        int var6 = arg0.method2409();
                        this.field156.put(var5, var6);
                    }
                }
            } else {
                this.method102(true);
            }
        }
    }

    @ObfuscatedName("m.i(ZI)V")
    public void method102(boolean arg0) {
    }

    @ObfuscatedName("m.h(I)Ldn;")
    public class123 method103() {
        class123 var1 = new class123(100);
        var1.method2389(field157);
        var1.method2389(this.field155 ? 1 : 0);
        var1.method2389(this.field158 ? 1 : 0);
        var1.method2389(this.field162);
        var1.method2389(this.field156.size());
        Iterator var2 = this.field156.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2569((Integer) var3.getKey());
            var1.method2569((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("b.e(I)Lm;")
    public static class9 method552() {
        class231 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class153.method2958("", Statics.field2005.field2342, false);
            byte[] var2 = new byte[(int) var0.method3908()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3905(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class123(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3904();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("de.g(B)V")
    public static void method2679() {
        class231 var0 = null;
        try {
            var0 = class153.method2958("", Statics.field2005.field2342, true);
            class123 var1 = Statics.field43.method103();
            var0.method3901(var1.field2049, 0, var1.field2046);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3904();
            }
        } catch (Exception var4) {
        }
    }
}

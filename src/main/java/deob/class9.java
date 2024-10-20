package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("a")
public class class9 {

    @ObfuscatedName("a.v")
    public static int field148 = 4;

    @ObfuscatedName("a.i")
    public boolean field143;

    @ObfuscatedName("a.d")
    public boolean field151;

    @ObfuscatedName("a.o")
    public int field144 = 1;

    @ObfuscatedName("a.c")
    public LinkedHashMap field146 = new LinkedHashMap();

    public class9() {
        this.method101(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1988 == null) {
            this.method101(true);
        } else {
            int var2 = arg0.method2400();
            if (var2 >= 0 && var2 <= field148) {
                if (arg0.method2400() == 1) {
                    this.field143 = true;
                }
                if (var2 > 1) {
                    this.field151 = arg0.method2400() == 1;
                }
                if (var2 > 3) {
                    this.field144 = arg0.method2400();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2400();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2354();
                        int var6 = arg0.method2354();
                        this.field146.put(var5, var6);
                    }
                }
            } else {
                this.method101(true);
            }
        }
    }

    @ObfuscatedName("a.v(ZI)V")
    public void method101(boolean arg0) {
    }

    @ObfuscatedName("a.f(I)Ldx;")
    public class119 method110() {
        class119 var1 = new class119(100);
        var1.method2398(field148);
        var1.method2398(this.field143 ? 1 : 0);
        var1.method2398(this.field151 ? 1 : 0);
        var1.method2398(this.field144);
        var1.method2398(this.field146.size());
        Iterator var2 = this.field146.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2338((Integer) var3.getKey());
            var1.method2338((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("l.i(I)La;")
    public static class9 method164() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method3213("", Statics.field377.field2301, false);
            byte[] var2 = new byte[(int) var0.method3840()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3841(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3848();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("x.d(I)V")
    public static void method178() {
        class227 var0 = null;
        try {
            var0 = class149.method3213("", Statics.field377.field2301, true);
            class119 var1 = Statics.field666.method110();
            var0.method3839(var1.field1988, 0, var1.field1984);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3848();
            }
        } catch (Exception var4) {
        }
    }
}

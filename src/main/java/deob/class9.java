package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("h")
public class class9 {

    @ObfuscatedName("h.t")
    public static int field143 = 3;

    @ObfuscatedName("h.i")
    public boolean field137;

    @ObfuscatedName("h.p")
    public boolean field135;

    @ObfuscatedName("h.c")
    public LinkedHashMap field139 = new LinkedHashMap();

    public class9() {
        this.method89(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1826 == null) {
            this.method89(true);
        } else {
            int var2 = arg0.method2118();
            if (var2 >= 0 && var2 <= field143) {
                if (arg0.method2118() == 1) {
                    this.field137 = true;
                }
                if (var2 > 1) {
                    this.field135 = arg0.method2118() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2118();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2152();
                        int var6 = arg0.method2152();
                        this.field139.put(var5, var6);
                    }
                }
            } else {
                this.method89(true);
            }
        }
    }

    @ObfuscatedName("h.t(ZI)V")
    public void method89(boolean arg0) {
    }

    @ObfuscatedName("h.o(B)Ldg;")
    public class107 method90() {
        class107 var1 = new class107(100);
        var1.method2168(field143);
        var1.method2168(this.field137 ? 1 : 0);
        var1.method2168(this.field135 ? 1 : 0);
        var1.method2168(this.field139.size());
        Iterator var2 = this.field139.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2174((Integer) var3.getKey());
            var1.method2174((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("cs.i(I)Lh;")
    public static class9 method1876() {
        class195 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class136.method2057("", Statics.field255.field2093, false);
            byte[] var2 = new byte[(int) var0.method3384()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3388(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class107(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3383();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("l.p(I)V")
    public static void method84() {
        class195 var0 = null;
        try {
            var0 = class136.method2057("", Statics.field255.field2093, true);
            class107 var1 = Statics.field1998.method90();
            var0.method3382(var1.field1826, 0, var1.field1827);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3383();
            }
        } catch (Exception var4) {
        }
    }
}

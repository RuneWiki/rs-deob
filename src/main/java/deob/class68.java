package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bn")
public class class68 {

    @ObfuscatedName("bn.v")
    public static int field1003 = 6;

    @ObfuscatedName("bn.o")
    public boolean field997;

    @ObfuscatedName("bn.k")
    public boolean field998;

    @ObfuscatedName("bn.u")
    public int field999 = 1;

    @ObfuscatedName("bn.i")
    public String field1000 = null;

    @ObfuscatedName("bn.t")
    public boolean field995 = false;

    @ObfuscatedName("bn.p")
    public LinkedHashMap field1001 = new LinkedHashMap();

    public class68() {
        this.method1520(true);
    }

    public class68(class185 arg0) {
        if (arg0 == null || arg0.field2387 == null) {
            this.method1520(true);
        } else {
            int var2 = arg0.method3274();
            if (var2 >= 0 && var2 <= field1003) {
                if (arg0.method3274() == 1) {
                    this.field997 = true;
                }
                if (var2 > 1) {
                    this.field998 = arg0.method3274() == 1;
                }
                if (var2 > 3) {
                    this.field999 = arg0.method3274();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3274();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3279();
                        int var6 = arg0.method3279();
                        this.field1001.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1000 = arg0.method3282();
                }
                if (var2 > 5) {
                    this.field995 = arg0.method3281();
                }
            } else {
                this.method1520(true);
            }
        }
    }

    @ObfuscatedName("bn.v(ZI)V")
    public void method1520(boolean arg0) {
    }

    @ObfuscatedName("bn.s(I)Lgx;")
    public class185 method1521() {
        class185 var1 = new class185(100);
        var1.method3258(field1003);
        var1.method3258(this.field997 ? 1 : 0);
        var1.method3258(this.field998 ? 1 : 0);
        var1.method3258(this.field999);
        var1.method3258(this.field1001.size());
        Iterator var2 = this.field1001.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3261((Integer) var3.getKey());
            var1.method3261((Integer) var3.getValue());
        }
        var1.method3265(this.field1000 == null ? "" : this.field1000);
        var1.method3264(this.field995);
        return var1;
    }

    @ObfuscatedName("gv.o(I)Lbn;")
    public static class68 method3253() {
        class113 var0 = null;
        class68 var1 = new class68();
        try {
            var0 = class158.method372("", Statics.field3584.field3175, false);
            byte[] var2 = new byte[(int) var0.method2324()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2329(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class68(new class185(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2326();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("fu.k(I)V")
    public static void method3016() {
        class113 var0 = null;
        try {
            var0 = class158.method372("", Statics.field3584.field3175, true);
            class185 var1 = Statics.field580.method1521();
            var0.method2333(var1.field2387, 0, var1.field2386);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2327(true);
            }
        } catch (Exception var4) {
        }
    }
}

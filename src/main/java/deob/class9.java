package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("c")
public class class9 {

    @ObfuscatedName("c.i")
    public static int field140 = 4;

    @ObfuscatedName("c.r")
    public boolean field136;

    @ObfuscatedName("c.n")
    public boolean field137;

    @ObfuscatedName("c.x")
    public int field138 = 1;

    @ObfuscatedName("c.q")
    public LinkedHashMap field143 = new LinkedHashMap();

    public class9() {
        this.method103(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1982 == null) {
            this.method103(true);
        } else {
            int var2 = arg0.method2380();
            if (var2 >= 0 && var2 <= field140) {
                if (arg0.method2380() == 1) {
                    this.field136 = true;
                }
                if (var2 > 1) {
                    this.field137 = arg0.method2380() == 1;
                }
                if (var2 > 3) {
                    this.field138 = arg0.method2380();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2380();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2350();
                        int var6 = arg0.method2350();
                        this.field143.put(var5, var6);
                    }
                }
            } else {
                this.method103(true);
            }
        }
    }

    @ObfuscatedName("c.i(ZI)V")
    public void method103(boolean arg0) {
    }

    @ObfuscatedName("c.v(S)Ldx;")
    public class119 method110() {
        class119 var1 = new class119(100);
        var1.method2436(field140);
        var1.method2436(this.field136 ? 1 : 0);
        var1.method2436(this.field137 ? 1 : 0);
        var1.method2436(this.field138);
        var1.method2436(this.field143.size());
        Iterator var2 = this.field143.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2333((Integer) var3.getKey());
            var1.method2333((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("f.r(B)Lc;")
    public static class9 method165() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method681("", Statics.field1360.field2276, false);
            byte[] var2 = new byte[(int) var0.method3815()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3816(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3819();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("q.n(I)V")
    public static void method86() {
        class227 var0 = null;
        try {
            var0 = class149.method681("", Statics.field1360.field2276, true);
            class119 var1 = Statics.field1389.method110();
            var0.method3813(var1.field1982, 0, var1.field1980);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3819();
            }
        } catch (Exception var4) {
        }
    }
}

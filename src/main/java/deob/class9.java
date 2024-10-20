package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("p")
public class class9 {

    @ObfuscatedName("p.n")
    public static int field140 = 4;

    @ObfuscatedName("p.s")
    public boolean field139;

    @ObfuscatedName("p.q")
    public boolean field134;

    @ObfuscatedName("p.j")
    public int field135 = 1;

    @ObfuscatedName("p.k")
    public LinkedHashMap field136 = new LinkedHashMap();

    public class9() {
        this.method94(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1981 == null) {
            this.method94(true);
        } else {
            int var2 = arg0.method2338();
            if (var2 >= 0 && var2 <= field140) {
                if (arg0.method2338() == 1) {
                    this.field139 = true;
                }
                if (var2 > 1) {
                    this.field134 = arg0.method2338() == 1;
                }
                if (var2 > 3) {
                    this.field135 = arg0.method2338();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2338();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2343();
                        int var6 = arg0.method2343();
                        this.field136.put(var5, var6);
                    }
                }
            } else {
                this.method94(true);
            }
        }
    }

    @ObfuscatedName("p.n(ZI)V")
    public void method94(boolean arg0) {
    }

    @ObfuscatedName("p.d(I)Ldq;")
    public class119 method95() {
        class119 var1 = new class119(100);
        var1.method2323(field140);
        var1.method2323(this.field139 ? 1 : 0);
        var1.method2323(this.field134 ? 1 : 0);
        var1.method2323(this.field135);
        var1.method2323(this.field136.size());
        Iterator var2 = this.field136.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2326((Integer) var3.getKey());
            var1.method2326((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("al.s(B)Lp;")
    public static class9 method697() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method1921("", Statics.field276.field2270, false);
            byte[] var2 = new byte[(int) var0.method3833()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3835(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3832();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("aj.q(I)V")
    public static void method706() {
        class227 var0 = null;
        try {
            var0 = class149.method1921("", Statics.field276.field2270, true);
            class119 var1 = Statics.field2984.method95();
            var0.method3831(var1.field1981, 0, var1.field1977);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3832();
            }
        } catch (Exception var4) {
        }
    }
}

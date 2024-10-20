package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("e")
public class class9 {

    @ObfuscatedName("e.d")
    public static int field147 = 4;

    @ObfuscatedName("e.v")
    public boolean field143;

    @ObfuscatedName("e.l")
    public boolean field149;

    @ObfuscatedName("e.y")
    public int field145 = 1;

    @ObfuscatedName("e.w")
    public LinkedHashMap field146 = new LinkedHashMap();

    public class9() {
        this.method121(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1973 == null) {
            this.method121(true);
        } else {
            int var2 = arg0.method2357();
            if (var2 >= 0 && var2 <= field147) {
                if (arg0.method2357() == 1) {
                    this.field143 = true;
                }
                if (var2 > 1) {
                    this.field149 = arg0.method2357() == 1;
                }
                if (var2 > 3) {
                    this.field145 = arg0.method2357();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2357();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2362();
                        int var6 = arg0.method2362();
                        this.field146.put(var5, var6);
                    }
                }
            } else {
                this.method121(true);
            }
        }
    }

    @ObfuscatedName("e.d(ZB)V")
    public void method121(boolean arg0) {
    }

    @ObfuscatedName("e.p(I)Ldf;")
    public class119 method110() {
        class119 var1 = new class119(100);
        var1.method2388(field147);
        var1.method2388(this.field143 ? 1 : 0);
        var1.method2388(this.field149 ? 1 : 0);
        var1.method2388(this.field145);
        var1.method2388(this.field146.size());
        Iterator var2 = this.field146.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2345((Integer) var3.getKey());
            var1.method2345((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("at.v(I)Le;")
    public static class9 method1065() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method1954("", Statics.field395.field2251, false);
            byte[] var2 = new byte[(int) var0.method3912()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3910(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3927();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ev.l(B)V")
    public static void method2975() {
        class227 var0 = null;
        try {
            var0 = class149.method1954("", Statics.field395.field2251, true);
            class119 var1 = Statics.field1752.method110();
            var0.method3931(var1.field1973, 0, var1.field1966);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3927();
            }
        } catch (Exception var4) {
        }
    }
}

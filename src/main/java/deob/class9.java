package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("g")
public class class9 {

    @ObfuscatedName("g.f")
    public static int field150 = 4;

    @ObfuscatedName("g.x")
    public boolean field141;

    @ObfuscatedName("g.b")
    public boolean field142;

    @ObfuscatedName("g.l")
    public int field143 = 1;

    @ObfuscatedName("g.d")
    public LinkedHashMap field147 = new LinkedHashMap();

    public class9() {
        this.method112(true);
    }

    public class9(class120 arg0) {
        if (arg0 == null || arg0.field2001 == null) {
            this.method112(true);
        } else {
            int var2 = arg0.method2385();
            if (var2 >= 0 && var2 <= field150) {
                if (arg0.method2385() == 1) {
                    this.field141 = true;
                }
                if (var2 > 1) {
                    this.field142 = arg0.method2385() == 1;
                }
                if (var2 > 3) {
                    this.field143 = arg0.method2385();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2385();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2527();
                        int var6 = arg0.method2527();
                        this.field147.put(var5, var6);
                    }
                }
            } else {
                this.method112(true);
            }
        }
    }

    @ObfuscatedName("g.f(ZI)V")
    public void method112(boolean arg0) {
    }

    @ObfuscatedName("g.u(I)Ldj;")
    public class120 method113() {
        class120 var1 = new class120(100);
        var1.method2485(field150);
        var1.method2485(this.field141 ? 1 : 0);
        var1.method2485(this.field142 ? 1 : 0);
        var1.method2485(this.field143);
        var1.method2485(this.field147.size());
        Iterator var2 = this.field147.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2370((Integer) var3.getKey());
            var1.method2370((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("e.x(I)Lg;")
    public static class9 method191() {
        class228 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class150.method869("", Statics.field2131.field2281, false);
            byte[] var2 = new byte[(int) var0.method3875()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3871(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class120(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3874();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("c.b(I)V")
    public static void method606() {
        class228 var0 = null;
        try {
            var0 = class150.method869("", Statics.field2131.field2281, true);
            class120 var1 = Statics.field581.method113();
            var0.method3883(var1.field2001, 0, var1.field1999);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3874();
            }
        } catch (Exception var4) {
        }
    }
}

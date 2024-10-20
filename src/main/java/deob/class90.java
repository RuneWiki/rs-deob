package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cz")
public class class90 {

    @ObfuscatedName("cz.c")
    public static int field1241 = 10;

    @ObfuscatedName("cz.f")
    public boolean field1245;

    @ObfuscatedName("cz.n")
    public boolean field1236 = false;

    @ObfuscatedName("cz.k")
    public boolean field1237;

    @ObfuscatedName("cz.w")
    public boolean field1238 = false;

    @ObfuscatedName("cz.s")
    public int field1235;

    @ObfuscatedName("cz.q")
    public double field1240 = 0.8D;

    @ObfuscatedName("cz.m")
    public int field1249 = 127;

    @ObfuscatedName("cz.x")
    public int field1242 = 127;

    @ObfuscatedName("cz.j")
    public int field1250 = 127;

    @ObfuscatedName("cz.v")
    public int field1244 = -1;

    @ObfuscatedName("cz.h")
    public String field1233 = null;

    @ObfuscatedName("cz.t")
    public int field1246 = 1;

    @ObfuscatedName("cz.u")
    public LinkedHashMap field1247 = new LinkedHashMap();

    public class90() {
        this.method2278(true);
    }

    public class90(class445 arg0) {
        if (arg0 == null || arg0.field4733 == null) {
            this.method2278(true);
        } else {
            int var2 = arg0.method7196();
            if (var2 >= 0 && var2 <= field1241) {
                if (arg0.method7196() == 1) {
                    this.field1245 = true;
                }
                if (var2 > 1) {
                    this.field1237 = arg0.method7196() == 1;
                }
                if (var2 > 3) {
                    this.field1246 = arg0.method7196();
                }
                if (var2 > 2) {
                    int var3 = arg0.method7196();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method7201();
                        int var6 = arg0.method7201();
                        this.field1247.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1233 = arg0.method7205();
                }
                if (var2 > 5) {
                    this.field1236 = arg0.method7176();
                }
                if (var2 > 6) {
                    this.field1240 = (double) arg0.method7196() / 100.0D;
                    this.field1249 = arg0.method7196();
                    this.field1242 = arg0.method7196();
                    this.field1250 = arg0.method7196();
                }
                if (var2 > 7) {
                    this.field1244 = arg0.method7196();
                }
                if (var2 > 8) {
                    this.field1238 = arg0.method7196() == 1;
                }
                if (var2 > 9) {
                    this.field1235 = arg0.method7201();
                }
            } else {
                this.method2278(true);
            }
        }
    }

    @ObfuscatedName("cz.c(ZI)V")
    public void method2278(boolean arg0) {
    }

    @ObfuscatedName("cz.p(I)Lqq;")
    public class445 method2323() {
        class445 var1 = new class445(100);
        var1.method7179(field1241);
        var1.method7179(this.field1245 ? 1 : 0);
        var1.method7179(this.field1237 ? 1 : 0);
        var1.method7179(this.field1246);
        var1.method7179(this.field1247.size());
        Iterator var2 = this.field1247.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method7364((Integer) var3.getKey());
            var1.method7364((Integer) var3.getValue());
        }
        var1.method7186(this.field1233 == null ? "" : this.field1233);
        var1.method7178(this.field1236);
        var1.method7179((int) (this.field1240 * 100.0D));
        var1.method7179(this.field1249);
        var1.method7179(this.field1242);
        var1.method7179(this.field1250);
        var1.method7179(this.field1244);
        var1.method7179(this.field1238 ? 1 : 0);
        var1.method7364(this.field1235);
        return var1;
    }

    @ObfuscatedName("bg.f(S)Lcz;")
    public static class90 method1035() {
        class427 var0 = null;
        class90 var1 = new class90();
        try {
            var0 = class159.method4267("", Statics.field1730.field3639, false);
            byte[] var2 = new byte[(int) var0.method6976()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method6977(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class90(new class445(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method6991();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ls.n(I)V")
    public static void method5552() {
        class427 var0 = null;
        try {
            var0 = class159.method4267("", Statics.field1730.field3639, true);
            class445 var1 = Statics.field1108.method2323();
            var0.method6973(var1.field4733, 0, var1.field4735);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6975(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("cz.k(ZB)V")
    public void method2304(boolean arg0) {
        this.field1245 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.w(I)Z")
    public boolean method2344() {
        return this.field1245;
    }

    @ObfuscatedName("cz.s(ZB)V")
    public void method2282(boolean arg0) {
        this.field1236 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.q(I)Z")
    public boolean method2289() {
        return this.field1236;
    }

    @ObfuscatedName("cz.m(ZB)V")
    public void method2284(boolean arg0) {
        this.field1237 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.x(B)Z")
    public boolean method2285() {
        return this.field1237;
    }

    @ObfuscatedName("cz.j(ZB)V")
    public void method2286(boolean arg0) {
        this.field1238 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.v(B)V")
    public void method2287() {
        this.method2286(!this.field1238);
    }

    @ObfuscatedName("cz.h(I)Z")
    public boolean method2288() {
        return this.field1238;
    }

    @ObfuscatedName("cz.t(II)V")
    public void method2343(int arg0) {
        this.field1235 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.u(I)I")
    public int method2290() {
        return this.field1235;
    }

    @ObfuscatedName("cz.d(D)V")
    public void method2291(double arg0) {
        this.field1240 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.b(I)D")
    public double method2279() {
        return this.field1240;
    }

    @ObfuscatedName("cz.a(II)V")
    public void method2341(int arg0) {
        this.field1249 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.l(B)I")
    public int method2294() {
        return this.field1249;
    }

    @ObfuscatedName("cz.e(II)V")
    public void method2295(int arg0) {
        this.field1242 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.g(I)I")
    public int method2277() {
        return this.field1242;
    }

    @ObfuscatedName("cz.y(II)V")
    public void method2297(int arg0) {
        this.field1250 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.i(I)I")
    public int method2366() {
        return this.field1250;
    }

    @ObfuscatedName("cz.r(Ljava/lang/String;I)V")
    public void method2298(String arg0) {
        this.field1233 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.z(S)Ljava/lang/String;")
    public String method2299() {
        return this.field1233;
    }

    @ObfuscatedName("cz.o(IB)V")
    public void method2300(int arg0) {
        this.field1244 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.as(I)I")
    public int method2301() {
        return this.field1244;
    }

    @ObfuscatedName("cz.ac(IB)V")
    public void method2302(int arg0) {
        this.field1246 = arg0;
        method5552();
    }

    @ObfuscatedName("cz.ao(I)I")
    public int method2303() {
        return this.field1246;
    }
}

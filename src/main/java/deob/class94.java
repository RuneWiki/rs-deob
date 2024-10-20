package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ce")
public class class94 {

    @ObfuscatedName("ce.a")
    public static int field1243 = 10;

    @ObfuscatedName("ce.c")
    public boolean field1241;

    @ObfuscatedName("ce.x")
    public boolean field1244 = false;

    @ObfuscatedName("ce.h")
    public boolean field1252;

    @ObfuscatedName("ce.j")
    public boolean field1246 = false;

    @ObfuscatedName("ce.y")
    public int field1247;

    @ObfuscatedName("ce.d")
    public double field1248 = 0.8D;

    @ObfuscatedName("ce.n")
    public int field1242 = 127;

    @ObfuscatedName("ce.r")
    public int field1249 = 127;

    @ObfuscatedName("ce.l")
    public int field1251 = 127;

    @ObfuscatedName("ce.s")
    public int field1250 = -1;

    @ObfuscatedName("ce.p")
    public String field1253 = null;

    @ObfuscatedName("ce.b")
    public int field1254 = 1;

    @ObfuscatedName("ce.o")
    public LinkedHashMap field1255 = new LinkedHashMap();

    public class94() {
        this.method2277(true);
    }

    public class94(class464 arg0) {
        if (arg0 == null || arg0.field4867 == null) {
            this.method2277(true);
        } else {
            int var2 = arg0.method7735();
            if (var2 >= 0 && var2 <= field1243) {
                if (arg0.method7735() == 1) {
                    this.field1241 = true;
                }
                if (var2 > 1) {
                    this.field1252 = arg0.method7735() == 1;
                }
                if (var2 > 3) {
                    this.field1254 = arg0.method7735();
                }
                if (var2 > 2) {
                    int var3 = arg0.method7735();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method7720();
                        int var6 = arg0.method7720();
                        this.field1255.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1253 = arg0.method7899();
                }
                if (var2 > 5) {
                    this.field1244 = arg0.method7723();
                }
                if (var2 > 6) {
                    this.field1248 = (double) arg0.method7735() / 100.0D;
                    this.field1242 = arg0.method7735();
                    this.field1249 = arg0.method7735();
                    this.field1251 = arg0.method7735();
                }
                if (var2 > 7) {
                    this.field1250 = arg0.method7735();
                }
                if (var2 > 8) {
                    this.field1246 = arg0.method7735() == 1;
                }
                if (var2 > 9) {
                    this.field1247 = arg0.method7720();
                }
            } else {
                this.method2277(true);
            }
        }
    }

    @ObfuscatedName("ce.a(ZB)V")
    public void method2277(boolean arg0) {
    }

    @ObfuscatedName("ce.f(B)Lqr;")
    public class464 method2278() {
        class464 var1 = new class464(100);
        var1.method7698(field1243);
        var1.method7698(this.field1241 ? 1 : 0);
        var1.method7698(this.field1252 ? 1 : 0);
        var1.method7698(this.field1254);
        var1.method7698(this.field1255.size());
        Iterator var2 = this.field1255.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method7835((Integer) var3.getKey());
            var1.method7835((Integer) var3.getValue());
        }
        var1.method7705(this.field1253 == null ? "" : this.field1253);
        var1.method7704(this.field1244);
        var1.method7698((int) (this.field1248 * 100.0D));
        var1.method7698(this.field1242);
        var1.method7698(this.field1249);
        var1.method7698(this.field1251);
        var1.method7698(this.field1250);
        var1.method7698(this.field1246 ? 1 : 0);
        var1.method7835(this.field1247);
        return var1;
    }

    @ObfuscatedName("eu.c(I)V")
    public static void method2940() {
        class446 var0 = null;
        try {
            var0 = class165.method2975("", Statics.field4412.field3742, true);
            class464 var1 = Statics.field4526.method2278();
            var0.method7498(var1.field4867, 0, var1.field4864);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method7500(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("ce.x(ZB)V")
    public void method2279(boolean arg0) {
        this.field1241 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.h(I)Z")
    public boolean method2353() {
        return this.field1241;
    }

    @ObfuscatedName("ce.j(ZI)V")
    public void method2331(boolean arg0) {
        this.field1244 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.y(I)Z")
    public boolean method2282() {
        return this.field1244;
    }

    @ObfuscatedName("ce.d(ZI)V")
    public void method2283(boolean arg0) {
        this.field1252 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.n(I)Z")
    public boolean method2284() {
        return this.field1252;
    }

    @ObfuscatedName("ce.r(ZI)V")
    public void method2285(boolean arg0) {
        this.field1246 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.l(B)V")
    public void method2335() {
        this.method2285(!this.field1246);
    }

    @ObfuscatedName("ce.s(B)Z")
    public boolean method2287() {
        return this.field1246;
    }

    @ObfuscatedName("ce.p(II)V")
    public void method2288(int arg0) {
        this.field1247 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.b(B)I")
    public int method2342() {
        return this.field1247;
    }

    @ObfuscatedName("ce.o(D)V")
    public void method2290(double arg0) {
        this.field1248 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.u(I)D")
    public double method2293() {
        return this.field1248;
    }

    @ObfuscatedName("ce.z(II)V")
    public void method2291(int arg0) {
        this.field1242 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.t(B)I")
    public int method2292() {
        return this.field1242;
    }

    @ObfuscatedName("ce.w(II)V")
    public void method2280(int arg0) {
        this.field1249 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.m(I)I")
    public int method2328() {
        return this.field1249;
    }

    @ObfuscatedName("ce.q(II)V")
    public void method2295(int arg0) {
        this.field1251 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.i(B)I")
    public int method2312() {
        return this.field1251;
    }

    @ObfuscatedName("ce.e(Ljava/lang/String;I)V")
    public void method2286(String arg0) {
        this.field1253 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.g(S)Ljava/lang/String;")
    public String method2298() {
        return this.field1253;
    }

    @ObfuscatedName("ce.k(IB)V")
    public void method2299(int arg0) {
        this.field1250 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.v(B)I")
    public int method2373() {
        return this.field1250;
    }

    @ObfuscatedName("ce.aj(II)V")
    public void method2354(int arg0) {
        this.field1254 = arg0;
        method2940();
    }

    @ObfuscatedName("ce.an(I)I")
    public int method2302() {
        return this.field1254;
    }
}

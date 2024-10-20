package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cv")
public class class90 {

    @ObfuscatedName("cv.c")
    public static int field1241 = 10;

    @ObfuscatedName("cv.q")
    public boolean field1252;

    @ObfuscatedName("cv.f")
    public boolean field1240 = false;

    @ObfuscatedName("cv.j")
    public boolean field1243;

    @ObfuscatedName("cv.e")
    public boolean field1242 = false;

    @ObfuscatedName("cv.g")
    public int field1239;

    @ObfuscatedName("cv.w")
    public double field1244 = 0.8D;

    @ObfuscatedName("cv.y")
    public int field1245 = 127;

    @ObfuscatedName("cv.i")
    public int field1246 = 127;

    @ObfuscatedName("cv.s")
    public int field1247 = 127;

    @ObfuscatedName("cv.t")
    public int field1248 = -1;

    @ObfuscatedName("cv.z")
    public String field1249 = null;

    @ObfuscatedName("cv.r")
    public int field1250 = 1;

    @ObfuscatedName("cv.u")
    public LinkedHashMap field1237 = new LinkedHashMap();

    public class90() {
        this.method2134(true);
    }

    public class90(class443 arg0) {
        if (arg0 == null || arg0.field4701 == null) {
            this.method2134(true);
        } else {
            int var2 = arg0.method7047();
            if (var2 >= 0 && var2 <= field1241) {
                if (arg0.method7047() == 1) {
                    this.field1252 = true;
                }
                if (var2 > 1) {
                    this.field1243 = arg0.method7047() == 1;
                }
                if (var2 > 3) {
                    this.field1250 = arg0.method7047();
                }
                if (var2 > 2) {
                    int var3 = arg0.method7047();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method7052();
                        int var6 = arg0.method7052();
                        this.field1237.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1249 = arg0.method7056();
                }
                if (var2 > 5) {
                    this.field1240 = arg0.method7055();
                }
                if (var2 > 6) {
                    this.field1244 = (double) arg0.method7047() / 100.0D;
                    this.field1245 = arg0.method7047();
                    this.field1246 = arg0.method7047();
                    this.field1247 = arg0.method7047();
                }
                if (var2 > 7) {
                    this.field1248 = arg0.method7047();
                }
                if (var2 > 8) {
                    this.field1242 = arg0.method7047() == 1;
                }
                if (var2 > 9) {
                    this.field1239 = arg0.method7052();
                }
            } else {
                this.method2134(true);
            }
        }
    }

    @ObfuscatedName("cv.c(ZI)V")
    public void method2134(boolean arg0) {
    }

    @ObfuscatedName("cv.v(B)Lqt;")
    public class443 method2217() {
        class443 var1 = new class443(100);
        var1.method7031(field1241);
        var1.method7031(this.field1252 ? 1 : 0);
        var1.method7031(this.field1243 ? 1 : 0);
        var1.method7031(this.field1250);
        var1.method7031(this.field1237.size());
        Iterator var2 = this.field1237.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method7087((Integer) var3.getKey());
            var1.method7087((Integer) var3.getValue());
        }
        var1.method7037(this.field1249 == null ? "" : this.field1249);
        var1.method7036(this.field1240);
        var1.method7031((int) (this.field1244 * 100.0D));
        var1.method7031(this.field1245);
        var1.method7031(this.field1246);
        var1.method7031(this.field1247);
        var1.method7031(this.field1248);
        var1.method7031(this.field1242 ? 1 : 0);
        var1.method7087(this.field1239);
        return var1;
    }

    @ObfuscatedName("kq.q(I)Lcv;")
    public static class90 method5218() {
        class425 var0 = null;
        class90 var1 = new class90();
        try {
            var0 = class158.method1799("", Statics.field3314.field3596, false);
            byte[] var2 = new byte[(int) var0.method6808()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method6809(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class90(new class443(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method6806();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ha.f(I)V")
    public static void method4214() {
        class425 var0 = null;
        try {
            var0 = class158.method1799("", Statics.field3314.field3596, true);
            class443 var1 = Statics.field109.method2217();
            var0.method6812(var1.field4701, 0, var1.field4700);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6807(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("cv.j(ZI)V")
    public void method2231(boolean arg0) {
        this.field1252 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.e(I)Z")
    public boolean method2137() {
        return this.field1252;
    }

    @ObfuscatedName("cv.g(ZS)V")
    public void method2138(boolean arg0) {
        this.field1240 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.w(I)Z")
    public boolean method2139() {
        return this.field1240;
    }

    @ObfuscatedName("cv.y(ZI)V")
    public void method2140(boolean arg0) {
        this.field1243 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.i(I)Z")
    public boolean method2209() {
        return this.field1243;
    }

    @ObfuscatedName("cv.s(ZB)V")
    public void method2142(boolean arg0) {
        this.field1242 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.t(I)V")
    public void method2143() {
        this.method2142(!this.field1242);
    }

    @ObfuscatedName("cv.z(B)Z")
    public boolean method2144() {
        return this.field1242;
    }

    @ObfuscatedName("cv.r(IB)V")
    public void method2222(int arg0) {
        this.field1239 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.u(I)I")
    public int method2135() {
        return this.field1239;
    }

    @ObfuscatedName("cv.k(D)V")
    public void method2147(double arg0) {
        this.field1244 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.h(I)D")
    public double method2146() {
        return this.field1244;
    }

    @ObfuscatedName("cv.x(IS)V")
    public void method2189(int arg0) {
        this.field1245 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.l(I)I")
    public int method2150() {
        return this.field1245;
    }

    @ObfuscatedName("cv.a(II)V")
    public void method2188(int arg0) {
        this.field1246 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.p(I)I")
    public int method2133() {
        return this.field1246;
    }

    @ObfuscatedName("cv.b(II)V")
    public void method2233(int arg0) {
        this.field1247 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.n(B)I")
    public int method2154() {
        return this.field1247;
    }

    @ObfuscatedName("cv.o(Ljava/lang/String;B)V")
    public void method2152(String arg0) {
        this.field1249 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.m(I)Ljava/lang/String;")
    public String method2156() {
        return this.field1249;
    }

    @ObfuscatedName("cv.d(II)V")
    public void method2199(int arg0) {
        this.field1248 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.ad(B)I")
    public int method2158() {
        return this.field1248;
    }

    @ObfuscatedName("cv.ak(IB)V")
    public void method2172(int arg0) {
        this.field1250 = arg0;
        method4214();
    }

    @ObfuscatedName("cv.al(S)I")
    public int method2160() {
        return this.field1250;
    }
}

package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ca")
public class class90 {

    @ObfuscatedName("ca.v")
    public static int field1224 = 10;

    @ObfuscatedName("ca.i")
    public boolean field1227;

    @ObfuscatedName("ca.f")
    public boolean field1215 = false;

    @ObfuscatedName("ca.b")
    public boolean field1217;

    @ObfuscatedName("ca.n")
    public boolean field1218 = false;

    @ObfuscatedName("ca.s")
    public int field1219;

    @ObfuscatedName("ca.l")
    public double field1213 = 0.8D;

    @ObfuscatedName("ca.q")
    public int field1221 = 127;

    @ObfuscatedName("ca.o")
    public int field1222 = 127;

    @ObfuscatedName("ca.r")
    public int field1223 = 127;

    @ObfuscatedName("ca.p")
    public int field1216 = -1;

    @ObfuscatedName("ca.w")
    public String field1225 = null;

    @ObfuscatedName("ca.k")
    public int field1226 = 1;

    @ObfuscatedName("ca.d")
    public LinkedHashMap field1220 = new LinkedHashMap();

    public class90() {
        this.method2122(true);
    }

    public class90(class438 arg0) {
        if (arg0 == null || arg0.field4618 == null) {
            this.method2122(true);
        } else {
            int var2 = arg0.method6971();
            if (var2 >= 0 && var2 <= field1224) {
                if (arg0.method6971() == 1) {
                    this.field1227 = true;
                }
                if (var2 > 1) {
                    this.field1217 = arg0.method6971() == 1;
                }
                if (var2 > 3) {
                    this.field1226 = arg0.method6971();
                }
                if (var2 > 2) {
                    int var3 = arg0.method6971();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method6976();
                        int var6 = arg0.method6976();
                        this.field1220.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1225 = arg0.method6980();
                }
                if (var2 > 5) {
                    this.field1215 = arg0.method6979();
                }
                if (var2 > 6) {
                    this.field1213 = (double) arg0.method6971() / 100.0D;
                    this.field1221 = arg0.method6971();
                    this.field1222 = arg0.method6971();
                    this.field1223 = arg0.method6971();
                }
                if (var2 > 7) {
                    this.field1216 = arg0.method6971();
                }
                if (var2 > 8) {
                    this.field1218 = arg0.method6971() == 1;
                }
                if (var2 > 9) {
                    this.field1219 = arg0.method6976();
                }
            } else {
                this.method2122(true);
            }
        }
    }

    @ObfuscatedName("ca.v(ZB)V")
    public void method2122(boolean arg0) {
    }

    @ObfuscatedName("ca.c(I)Lpi;")
    public class438 method2215() {
        class438 var1 = new class438(100);
        var1.method6954(field1224);
        var1.method6954(this.field1227 ? 1 : 0);
        var1.method6954(this.field1217 ? 1 : 0);
        var1.method6954(this.field1226);
        var1.method6954(this.field1220.size());
        Iterator var2 = this.field1220.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method6957((Integer) var3.getKey());
            var1.method6957((Integer) var3.getValue());
        }
        var1.method7142(this.field1225 == null ? "" : this.field1225);
        var1.method7186(this.field1215);
        var1.method6954((int) (this.field1213 * 100.0D));
        var1.method6954(this.field1221);
        var1.method6954(this.field1222);
        var1.method6954(this.field1223);
        var1.method6954(this.field1216);
        var1.method6954(this.field1218 ? 1 : 0);
        var1.method6957(this.field1219);
        return var1;
    }

    @ObfuscatedName("hz.i(I)Lca;")
    public static class90 method3929() {
        class424 var0 = null;
        class90 var1 = new class90();
        try {
            var0 = class158.method5515("", Statics.field1306.field3564, false);
            byte[] var2 = new byte[(int) var0.method6813()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method6810(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class90(new class438(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method6814();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ao.f(I)V")
    public static void method562() {
        class424 var0 = null;
        try {
            var0 = class158.method5515("", Statics.field1306.field3564, true);
            class438 var1 = Statics.field1541.method2215();
            var0.method6822(var1.field4618, 0, var1.field4621);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6808(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("ca.b(ZI)V")
    public void method2142(boolean arg0) {
        this.field1227 = arg0;
        method562();
    }

    @ObfuscatedName("ca.n(I)Z")
    public boolean method2159() {
        return this.field1227;
    }

    @ObfuscatedName("ca.s(ZI)V")
    public void method2126(boolean arg0) {
        this.field1215 = arg0;
        method562();
    }

    @ObfuscatedName("ca.l(I)Z")
    public boolean method2213() {
        return this.field1215;
    }

    @ObfuscatedName("ca.q(ZI)V")
    public void method2133(boolean arg0) {
        this.field1217 = arg0;
        method562();
    }

    @ObfuscatedName("ca.o(B)Z")
    public boolean method2175() {
        return this.field1217;
    }

    @ObfuscatedName("ca.r(ZI)V")
    public void method2130(boolean arg0) {
        this.field1218 = arg0;
        method562();
    }

    @ObfuscatedName("ca.p(B)V")
    public void method2198() {
        this.method2130(!this.field1218);
    }

    @ObfuscatedName("ca.w(I)Z")
    public boolean method2132() {
        return this.field1218;
    }

    @ObfuscatedName("ca.k(II)V")
    public void method2156(int arg0) {
        this.field1219 = arg0;
        method562();
    }

    @ObfuscatedName("ca.d(B)I")
    public int method2134() {
        return this.field1219;
    }

    @ObfuscatedName("ca.m(D)V")
    public void method2135(double arg0) {
        this.field1213 = arg0;
        method562();
    }

    @ObfuscatedName("ca.u(B)D")
    public double method2136() {
        return this.field1213;
    }

    @ObfuscatedName("ca.t(IB)V")
    public void method2137(int arg0) {
        this.field1221 = arg0;
        method562();
    }

    @ObfuscatedName("ca.g(I)I")
    public int method2217() {
        return this.field1221;
    }

    @ObfuscatedName("ca.x(IB)V")
    public void method2157(int arg0) {
        this.field1222 = arg0;
        method562();
    }

    @ObfuscatedName("ca.a(B)I")
    public int method2139() {
        return this.field1222;
    }

    @ObfuscatedName("ca.y(II)V")
    public void method2140(int arg0) {
        this.field1223 = arg0;
        method562();
    }

    @ObfuscatedName("ca.j(I)I")
    public int method2166() {
        return this.field1223;
    }

    @ObfuscatedName("ca.e(Ljava/lang/String;I)V")
    public void method2182(String arg0) {
        this.field1225 = arg0;
        method562();
    }

    @ObfuscatedName("ca.z(S)Ljava/lang/String;")
    public String method2143() {
        return this.field1225;
    }

    @ObfuscatedName("ca.h(IB)V")
    public void method2144(int arg0) {
        this.field1216 = arg0;
        method562();
    }

    @ObfuscatedName("ca.ae(I)I")
    public int method2145() {
        return this.field1216;
    }

    @ObfuscatedName("ca.aq(II)V")
    public void method2146(int arg0) {
        this.field1226 = arg0;
        method562();
    }

    @ObfuscatedName("ca.aw(B)I")
    public int method2147() {
        return this.field1226;
    }
}

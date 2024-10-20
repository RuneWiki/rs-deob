package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cy")
public class class90 {

    @ObfuscatedName("cy.o")
    public static int field1241 = 10;

    @ObfuscatedName("cy.l")
    public boolean field1240;

    @ObfuscatedName("cy.k")
    public boolean field1242 = false;

    @ObfuscatedName("cy.a")
    public boolean field1243;

    @ObfuscatedName("cy.m")
    public boolean field1244 = false;

    @ObfuscatedName("cy.p")
    public int field1253;

    @ObfuscatedName("cy.s")
    public double field1252 = 0.8D;

    @ObfuscatedName("cy.r")
    public int field1247 = 127;

    @ObfuscatedName("cy.v")
    public int field1239 = 127;

    @ObfuscatedName("cy.y")
    public int field1249 = 127;

    @ObfuscatedName("cy.c")
    public int field1250 = -1;

    @ObfuscatedName("cy.w")
    public String field1251 = null;

    @ObfuscatedName("cy.b")
    public int field1245 = 1;

    @ObfuscatedName("cy.t")
    public LinkedHashMap field1246 = new LinkedHashMap();

    public class90() {
        this.method2199(true);
    }

    public class90(class440 arg0) {
        if (arg0 == null || arg0.field4679 == null) {
            this.method2199(true);
        } else {
            int var2 = arg0.method7071();
            if (var2 >= 0 && var2 <= field1241) {
                if (arg0.method7071() == 1) {
                    this.field1240 = true;
                }
                if (var2 > 1) {
                    this.field1243 = arg0.method7071() == 1;
                }
                if (var2 > 3) {
                    this.field1245 = arg0.method7071();
                }
                if (var2 > 2) {
                    int var3 = arg0.method7071();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method6898();
                        int var6 = arg0.method6898();
                        this.field1246.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1251 = arg0.method6902();
                }
                if (var2 > 5) {
                    this.field1242 = arg0.method6901();
                }
                if (var2 > 6) {
                    this.field1252 = (double) arg0.method7071() / 100.0D;
                    this.field1247 = arg0.method7071();
                    this.field1239 = arg0.method7071();
                    this.field1249 = arg0.method7071();
                }
                if (var2 > 7) {
                    this.field1250 = arg0.method7071();
                }
                if (var2 > 8) {
                    this.field1244 = arg0.method7071() == 1;
                }
                if (var2 > 9) {
                    this.field1253 = arg0.method6898();
                }
            } else {
                this.method2199(true);
            }
        }
    }

    @ObfuscatedName("cy.o(ZI)V")
    public void method2199(boolean arg0) {
    }

    @ObfuscatedName("cy.q(I)Lpx;")
    public class440 method2201() {
        class440 var1 = new class440(100);
        var1.method6876(field1241);
        var1.method6876(this.field1240 ? 1 : 0);
        var1.method6876(this.field1243 ? 1 : 0);
        var1.method6876(this.field1245);
        var1.method6876(this.field1246.size());
        Iterator var2 = this.field1246.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method6879((Integer) var3.getKey());
            var1.method6879((Integer) var3.getValue());
        }
        var1.method6883(this.field1251 == null ? "" : this.field1251);
        var1.method6882(this.field1242);
        var1.method6876((int) (this.field1252 * 100.0D));
        var1.method6876(this.field1247);
        var1.method6876(this.field1239);
        var1.method6876(this.field1249);
        var1.method6876(this.field1250);
        var1.method6876(this.field1244 ? 1 : 0);
        var1.method6879(this.field1253);
        return var1;
    }

    @ObfuscatedName("jr.l(I)V")
    public static void method4613() {
        class426 var0 = null;
        try {
            var0 = class158.method2457("", Statics.field474.field3628, true);
            class440 var1 = Statics.field65.method2201();
            var0.method6735(var1.field4679, 0, var1.field4678);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6723(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("cy.k(ZI)V")
    public void method2100(boolean arg0) {
        this.field1240 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.a(I)Z")
    public boolean method2103() {
        return this.field1240;
    }

    @ObfuscatedName("cy.m(ZI)V")
    public void method2104(boolean arg0) {
        this.field1242 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.p(I)Z")
    public boolean method2138() {
        return this.field1242;
    }

    @ObfuscatedName("cy.s(ZI)V")
    public void method2186(boolean arg0) {
        this.field1243 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.r(I)Z")
    public boolean method2107() {
        return this.field1243;
    }

    @ObfuscatedName("cy.v(ZI)V")
    public void method2108(boolean arg0) {
        this.field1244 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.y(B)V")
    public void method2109() {
        this.method2108(!this.field1244);
    }

    @ObfuscatedName("cy.c(B)Z")
    public boolean method2110() {
        return this.field1244;
    }

    @ObfuscatedName("cy.w(II)V")
    public void method2111(int arg0) {
        this.field1253 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.b(I)I")
    public int method2112() {
        return this.field1253;
    }

    @ObfuscatedName("cy.t(D)V")
    public void method2113(double arg0) {
        this.field1252 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.g(I)D")
    public double method2106() {
        return this.field1252;
    }

    @ObfuscatedName("cy.x(II)V")
    public void method2115(int arg0) {
        this.field1247 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.n(I)I")
    public int method2129() {
        return this.field1247;
    }

    @ObfuscatedName("cy.e(II)V")
    public void method2117(int arg0) {
        this.field1239 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.h(I)I")
    public int method2125() {
        return this.field1239;
    }

    @ObfuscatedName("cy.f(II)V")
    public void method2159(int arg0) {
        this.field1249 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.d(I)I")
    public int method2120() {
        return this.field1249;
    }

    @ObfuscatedName("cy.j(Ljava/lang/String;I)V")
    public void method2178(String arg0) {
        this.field1251 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.z(I)Ljava/lang/String;")
    public String method2122() {
        return this.field1251;
    }

    @ObfuscatedName("cy.i(II)V")
    public void method2187(int arg0) {
        this.field1250 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.u(S)I")
    public int method2124() {
        return this.field1250;
    }

    @ObfuscatedName("cy.ag(IB)V")
    public void method2126(int arg0) {
        this.field1245 = arg0;
        method4613();
    }

    @ObfuscatedName("cy.ar(B)I")
    public int method2155() {
        return this.field1245;
    }
}

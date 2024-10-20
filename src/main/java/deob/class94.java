package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cy")
public class class94 {

    @ObfuscatedName("cy.z")
    public boolean field1272;

    @ObfuscatedName("cy.j")
    public boolean field1268 = false;

    @ObfuscatedName("cy.i")
    public boolean field1269;

    @ObfuscatedName("cy.n")
    public boolean field1270 = false;

    @ObfuscatedName("cy.l")
    public int field1271;

    @ObfuscatedName("cy.k")
    public double field1266 = 0.8D;

    @ObfuscatedName("cy.c")
    public int field1273 = 127;

    @ObfuscatedName("cy.r")
    public int field1274 = 127;

    @ObfuscatedName("cy.b")
    public int field1275 = 127;

    @ObfuscatedName("cy.m")
    public int field1276 = -1;

    @ObfuscatedName("cy.t")
    public String field1277 = null;

    @ObfuscatedName("cy.h")
    public int field1267 = 1;

    @ObfuscatedName("cy.p")
    public final Map field1278 = new LinkedHashMap();

    public class94() {
        this.method2364(true);
    }

    public class94(class474 arg0) {
        if (arg0 == null || arg0.field4936 == null) {
            this.method2364(true);
        } else {
            int var2 = arg0.method7964();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method7964() == 1) {
                    this.field1272 = true;
                }
                if (var2 > 1) {
                    this.field1269 = arg0.method7964() == 1;
                }
                if (var2 > 3) {
                    this.field1267 = arg0.method7964();
                }
                if (var2 > 2) {
                    int var3 = arg0.method7964();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method7979();
                        int var6 = arg0.method7979();
                        this.field1278.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1277 = arg0.method7973();
                }
                if (var2 > 5) {
                    this.field1268 = arg0.method7972();
                }
                if (var2 > 6) {
                    this.field1266 = (double) arg0.method7964() / 100.0D;
                    this.field1273 = arg0.method7964();
                    this.field1274 = arg0.method7964();
                    this.field1275 = arg0.method7964();
                }
                if (var2 > 7) {
                    this.field1276 = arg0.method7964();
                }
                if (var2 > 8) {
                    this.field1270 = arg0.method7964() == 1;
                }
                if (var2 > 9) {
                    this.field1271 = arg0.method7979();
                }
            } else {
                this.method2364(true);
            }
        }
    }

    @ObfuscatedName("cy.f(ZB)V")
    public void method2364(boolean arg0) {
    }

    @ObfuscatedName("cy.w(I)Lrd;")
    public class474 method2427() {
        class474 var1 = new class474(417, true);
        var1.method7947(10);
        var1.method7947(this.field1272 ? 1 : 0);
        var1.method7947(this.field1269 ? 1 : 0);
        var1.method7947(this.field1267);
        var1.method7947(this.field1278.size());
        Iterator var2 = this.field1278.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8048((Integer) var3.getKey());
            var1.method8048((Integer) var3.getValue());
        }
        var1.method7954(this.field1277 == null ? "" : this.field1277);
        var1.method7953(this.field1268);
        var1.method7947((int) (this.field1266 * 100.0D));
        var1.method7947(this.field1273);
        var1.method7947(this.field1274);
        var1.method7947(this.field1275);
        var1.method7947(this.field1276);
        var1.method7947(this.field1270 ? 1 : 0);
        var1.method8048(this.field1271);
        return var1;
    }

    @ObfuscatedName("ew.v(S)Lcy;")
    public static class94 method2990() {
        class456 var0 = null;
        class94 var1 = new class94();
        try {
            var0 = class170.method2735("", Statics.field1607.field3816, false);
            byte[] var2 = new byte[(int) var0.method7739()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method7738(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class94(new class474(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method7735();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ae.s(I)V")
    public static void method827() {
        class456 var0 = null;
        try {
            var0 = class170.method2735("", Statics.field1607.field3816, true);
            class474 var1 = Statics.field1404.method2427();
            var0.method7734(var1.field4936, 0, var1.field4939);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method7736(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("cy.z(ZB)V")
    public void method2435(boolean arg0) {
        this.field1272 = arg0;
        method827();
    }

    @ObfuscatedName("cy.j(S)Z")
    public boolean method2456() {
        return this.field1272;
    }

    @ObfuscatedName("cy.i(ZB)V")
    public void method2367(boolean arg0) {
        this.field1268 = arg0;
        method827();
    }

    @ObfuscatedName("cy.n(S)Z")
    public boolean method2368() {
        return this.field1268;
    }

    @ObfuscatedName("cy.l(ZI)V")
    public void method2447(boolean arg0) {
        this.field1269 = arg0;
        method827();
    }

    @ObfuscatedName("cy.k(I)Z")
    public boolean method2454() {
        return this.field1269;
    }

    @ObfuscatedName("cy.c(ZI)V")
    public void method2369(boolean arg0) {
        this.field1270 = arg0;
        method827();
    }

    @ObfuscatedName("cy.r(I)V")
    public void method2372() {
        this.method2369(!this.field1270);
    }

    @ObfuscatedName("cy.b(B)Z")
    public boolean method2373() {
        return this.field1270;
    }

    @ObfuscatedName("cy.m(IB)V")
    public void method2374(int arg0) {
        this.field1271 = arg0;
        method827();
    }

    @ObfuscatedName("cy.t(I)I")
    public int method2375() {
        return this.field1271;
    }

    @ObfuscatedName("cy.h(D)V")
    public void method2467(double arg0) {
        this.field1266 = arg0;
        method827();
    }

    @ObfuscatedName("cy.p(B)D")
    public double method2441() {
        return this.field1266;
    }

    @ObfuscatedName("cy.o(IB)V")
    public void method2417(int arg0) {
        this.field1273 = arg0;
        method827();
    }

    @ObfuscatedName("cy.u(I)I")
    public int method2379() {
        return this.field1273;
    }

    @ObfuscatedName("cy.x(IB)V")
    public void method2461(int arg0) {
        this.field1274 = arg0;
        method827();
    }

    @ObfuscatedName("cy.a(I)I")
    public int method2381() {
        return this.field1274;
    }

    @ObfuscatedName("cy.q(II)V")
    public void method2365(int arg0) {
        this.field1275 = arg0;
        method827();
    }

    @ObfuscatedName("cy.d(I)I")
    public int method2383() {
        return this.field1275;
    }

    @ObfuscatedName("cy.e(Ljava/lang/String;I)V")
    public void method2384(String arg0) {
        this.field1277 = arg0;
        method827();
    }

    @ObfuscatedName("cy.g(I)Ljava/lang/String;")
    public String method2429() {
        return this.field1277;
    }

    @ObfuscatedName("cy.y(II)V")
    public void method2386(int arg0) {
        this.field1276 = arg0;
        method827();
    }

    @ObfuscatedName("cy.af(B)I")
    public int method2387() {
        return this.field1276;
    }

    @ObfuscatedName("cy.aa(II)V")
    public void method2388(int arg0) {
        this.field1267 = arg0;
        method827();
    }

    @ObfuscatedName("cy.ai(I)I")
    public int method2389() {
        return this.field1267;
    }

    @ObfuscatedName("cy.ag(Ljava/lang/String;II)V")
    public void method2473(String arg0, int arg1) {
        int var3 = this.method2393(arg0);
        if (this.field1278.size() >= 10 && !this.field1278.containsKey(var3)) {
            Iterator var4 = this.field1278.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1278.put(var3, arg1);
        method827();
    }

    @ObfuscatedName("cy.aw(Ljava/lang/String;I)Z")
    public boolean method2391(String arg0) {
        int var2 = this.method2393(arg0);
        return this.field1278.containsKey(var2);
    }

    @ObfuscatedName("cy.ar(Ljava/lang/String;I)I")
    public int method2392(String arg0) {
        int var2 = this.method2393(arg0);
        return this.field1278.containsKey(var2) ? (Integer) this.field1278.get(var2) : 0;
    }

    @ObfuscatedName("cy.al(Ljava/lang/String;B)I")
    public int method2393(String arg0) {
        return class365.method6125(arg0.toLowerCase());
    }
}

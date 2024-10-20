package deob;

@ObfuscatedName("bh")
public class class77 {

    @ObfuscatedName("bh.y")
    public final class366 field927;

    @ObfuscatedName("bh.j")
    public final class318 field924;

    @ObfuscatedName("bh.o")
    public final class316 field926;

    @ObfuscatedName("bh.m")
    public int field929 = 0;

    public class77(class366 arg0) {
        this.field927 = arg0;
        this.field924 = new class318(arg0);
        this.field926 = new class316(arg0);
    }

    @ObfuscatedName("bh.f(B)Z")
    public boolean method1547() {
        return this.field929 == 2;
    }

    @ObfuscatedName("bh.e(S)V")
    public final void method1560() {
        this.field929 = 1;
    }

    @ObfuscatedName("bh.v(Lnt;II)V")
    public final void method1617(class384 arg0, int arg1) {
        this.field924.method5112(arg0, arg1);
        this.field929 = 2;
        for (int var3 = 0; var3 < class110.field1359; var3++) {
            class98 var4 = client.field739[class110.field1365[var3]];
            var4.method1990();
        }
        class112.method2360();
        if (Statics.field3675 != null) {
            Statics.field3675.method5122();
        }
    }

    @ObfuscatedName("bh.y(I)V")
    public final void method1546() {
        for (class321 var1 = (class321) this.field924.field3814.method4829(); var1 != null; var1 = (class321) this.field924.field3814.method4831()) {
            if ((long) var1.field3830 < class381.method4000() / 1000L - 5L) {
                if (var1.field3828 > 0) {
                    class112.method2289(5, "", var1.field3829 + class269.field3381);
                }
                if (var1.field3828 == 0) {
                    class112.method2289(5, "", var1.field3829 + class269.field3276);
                }
                var1.method5400();
            }
        }
    }

    @ObfuscatedName("bh.j(B)V")
    public final void method1551() {
        this.field929 = 0;
        this.field924.method5198();
        this.field926.method5198();
    }

    @ObfuscatedName("bh.o(Llc;ZI)Z")
    public final boolean method1552(class329 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field3197.field1175)) {
            return true;
        } else {
            return this.field924.method5111(arg0, arg1);
        }
    }

    @ObfuscatedName("bh.m(Llc;I)Z")
    public final boolean method1553(class329 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field926.method5252(arg0);
        }
    }

    @ObfuscatedName("bh.r(Ljava/lang/String;I)V")
    public final void method1554(String arg0) {
        if (arg0 == null) {
            return;
        }
        class329 var2 = new class329(arg0, this.field927);
        if (!var2.method5265()) {
            return;
        }
        if (this.method1555()) {
            method4649();
        } else if (Statics.field3197.field1175.equals(var2)) {
            method2855();
        } else if (this.method1552(var2, false)) {
            method4046(arg0);
        } else if (this.method1553(var2)) {
            method4417(arg0);
        } else {
            method5819(arg0);
        }
    }

    @ObfuscatedName("jt.h(I)V")
    public static final void method4649() {
        class269 var10000 = (class269) null;
        String var0 = class269.field3419;
        class112.method2289(30, "", var0);
    }

    @ObfuscatedName("ho.d(Ljava/lang/String;I)V")
    public static final void method4046(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class269 var10001 = (class269) null;
        String var1 = var10000.append(class269.field3401).toString();
        class112.method2289(30, "", var1);
    }

    @ObfuscatedName("iu.z(Ljava/lang/String;B)V")
    public static final void method4417(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class269 var10001 = (class269) null;
        StringBuilder var2 = var10000.append(class269.field3341).append(arg0);
        class269 var3 = (class269) null;
        String var1 = var2.append(class269.field3407).toString();
        class112.method2289(30, "", var1);
    }

    @ObfuscatedName("fq.b(I)V")
    public static final void method2855() {
        class269 var10000 = (class269) null;
        String var0 = class269.field3404;
        class112.method2289(30, "", var0);
    }

    @ObfuscatedName("ne.i(Ljava/lang/String;I)V")
    public static final void method5819(String arg0) {
        class228 var1 = class228.method1927(class226.field2666, client.field669.field1410);
        var1.field2700.method5880(class384.method376(arg0));
        var1.field2700.method6068(arg0);
        client.field669.method2200(var1);
    }

    @ObfuscatedName("bh.k(B)Z")
    public final boolean method1555() {
        return this.field924.method5200() || this.field924.method5199() >= 200 && client.field741 != 1;
    }

    @ObfuscatedName("bh.g(Ljava/lang/String;B)V")
    public final void method1584(String arg0) {
        if (arg0 == null) {
            return;
        }
        class329 var2 = new class329(arg0, this.field927);
        if (!var2.method5265()) {
            return;
        }
        class269 var10000;
        if (this.method1557()) {
            var10000 = (class269) null;
            String var3 = class269.field3332;
            class112.method2289(30, "", var3);
        } else if (Statics.field3197.field1175.equals(var2)) {
            var10000 = (class269) null;
            String var4 = class269.field3504;
            class112.method2289(30, "", var4);
        } else if (this.method1553(var2)) {
            method5097(arg0);
        } else if (this.method1552(var2, false)) {
            method152(arg0);
        } else {
            method3831(arg0);
        }
    }

    @ObfuscatedName("le.t(Ljava/lang/String;I)V")
    public static final void method5097(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class269 var10001 = (class269) null;
        String var1 = var10000.append(class269.field3403).toString();
        class112.method2289(30, "", var1);
    }

    @ObfuscatedName("b.x(Ljava/lang/String;I)V")
    public static final void method152(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class269 var10001 = (class269) null;
        StringBuilder var2 = var10000.append(class269.field3434).append(arg0);
        class269 var3 = (class269) null;
        String var1 = var2.append(class269.field3409).toString();
        class112.method2289(30, "", var1);
    }

    @ObfuscatedName("gj.u(Ljava/lang/String;I)V")
    public static final void method3831(String arg0) {
        class228 var1 = class228.method1927(class226.field2644, client.field669.field1410);
        var1.field2700.method5880(class384.method376(arg0));
        var1.field2700.method6068(arg0);
        client.field669.method2200(var1);
    }

    @ObfuscatedName("bh.q(B)Z")
    public final boolean method1557() {
        return this.field926.method5200() || this.field926.method5199() >= 100 && client.field741 != 1;
    }

    @ObfuscatedName("bh.s(Ljava/lang/String;B)V")
    public final void method1572(String arg0) {
        if (arg0 == null) {
            return;
        }
        class329 var2 = new class329(arg0, this.field927);
        if (!var2.method5265()) {
            return;
        }
        if (this.field924.method5204(var2)) {
            client.method4270();
            class228 var3 = class228.method1927(class226.field2613, client.field669.field1410);
            var3.field2700.method5880(class384.method376(arg0));
            var3.field2700.method6068(arg0);
            client.field669.method2200(var3);
        }
        for (int var4 = 0; var4 < class110.field1359; var4++) {
            class98 var5 = client.field739[class110.field1365[var4]];
            var5.method1990();
        }
        class112.method2360();
        if (Statics.field3675 != null) {
            Statics.field3675.method5122();
        }
    }

    @ObfuscatedName("bh.p(Ljava/lang/String;B)V")
    public final void method1603(String arg0) {
        if (arg0 == null) {
            return;
        }
        class329 var2 = new class329(arg0, this.field927);
        if (!var2.method5265()) {
            return;
        }
        if (this.field926.method5204(var2)) {
            client.method4270();
            class228 var3 = class228.method1927(class226.field2588, client.field669.field1410);
            var3.field2700.method5880(class384.method376(arg0));
            var3.field2700.method6068(arg0);
            client.field669.method2200(var3);
        }
        client.method1543();
    }

    @ObfuscatedName("g.c(Ljava/lang/String;II)V")
    public static final void method157(String arg0, int arg1) {
        class228 var2 = class228.method1927(class226.field2654, client.field669.field1410);
        var2.field2700.method5880(class384.method376(arg0) + 1);
        var2.field2700.method6068(arg0);
        var2.field2700.method5924(arg1);
        client.field669.method2200(var2);
    }

    @ObfuscatedName("bh.n(Llc;I)Z")
    public final boolean method1616(class329 arg0) {
        class320 var2 = (class320) this.field924.method5247(arg0);
        return var2 != null && var2.method5262();
    }
}

package deob;

@ObfuscatedName("cp")
public class class84 {

    @ObfuscatedName("cp.c")
    public final class349 field1080;

    @ObfuscatedName("cp.y")
    public final class293 field1081;

    @ObfuscatedName("cp.h")
    public final class287 field1078;

    @ObfuscatedName("cp.z")
    public int field1085 = 0;

    public class84(class349 arg0) {
        this.field1080 = arg0;
        this.field1081 = new class293(arg0);
        this.field1078 = new class287(arg0);
    }

    @ObfuscatedName("cp.n(I)Z")
    public boolean method1812() {
        return this.field1085 == 2;
    }

    @ObfuscatedName("cp.v(I)V")
    public final void method1813() {
        this.field1085 = 1;
    }

    @ObfuscatedName("cp.d(Lkx;II)V")
    public final void method1814(class311 arg0, int arg1) {
        this.field1081.method4956(arg0, arg1);
        this.field1085 = 2;
        client.method2268();
    }

    @ObfuscatedName("cp.c(I)V")
    public final void method1815() {
        for (class297 var1 = (class297) this.field1081.field3657.method4733(); var1 != null; var1 = (class297) this.field1081.field3657.method4731()) {
            if ((long) var1.field3677 < class308.method1082() / 1000L - 5L) {
                if (var1.field3676 > 0) {
                    class101.method314(5, "", var1.field3675 + class234.field2938);
                }
                if (var1.field3676 == 0) {
                    class101.method314(5, "", var1.field3675 + class234.field2809);
                }
                var1.method3484();
            }
        }
    }

    @ObfuscatedName("cp.y(B)V")
    public final void method1825() {
        this.field1085 = 0;
        this.field1081.method4881();
        this.field1078.method4881();
    }

    @ObfuscatedName("cp.h(Lkk;ZB)Z")
    public final boolean method1844(class294 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1986.field630)) {
            return true;
        } else {
            return this.field1081.method4959(arg0, arg1);
        }
    }

    @ObfuscatedName("cp.z(Lkk;I)Z")
    public final boolean method1818(class294 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1078.method4884(arg0);
        }
    }

    @ObfuscatedName("cp.e(Ljava/lang/String;B)V")
    public final void method1811(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1080);
        if (!var2.method4966()) {
            return;
        }
        if (this.method1820()) {
            method5037(class234.field3024);
        } else if (Statics.field1986.field630.equals(var2)) {
            method5037(class234.field2961);
        } else if (this.method1844(var2, false)) {
            method5037(arg0 + class234.field2808);
        } else if (this.method1818(var2)) {
            method5037(class234.field2965 + arg0 + class234.field2915);
        } else {
            class197 var3 = class197.method434(class193.field2303, client.field751.field1333);
            var3.field2372.method5279(class311.method235(arg0));
            var3.field2372.method5257(arg0);
            client.field751.method2239(var3);
        }
    }

    @ObfuscatedName("kr.q(Ljava/lang/String;B)V")
    public static final void method5037(String arg0) {
        class101.method314(30, "", arg0);
    }

    @ObfuscatedName("cp.l(I)Z")
    public final boolean method1820() {
        return this.field1081.method4903() || this.field1081.method4882() >= 200 && client.field674 != 1;
    }

    @ObfuscatedName("cp.s(Ljava/lang/String;I)V")
    public final void method1821(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1080);
        if (!var2.method4966()) {
            return;
        }
        if (this.method1822()) {
            method666();
        } else if (Statics.field1986.field630.equals(var2)) {
            method3438();
        } else if (this.method1818(var2)) {
            method5037(arg0 + class234.field3089);
        } else if (this.method1844(var2, false)) {
            method1071(arg0);
        } else {
            class197 var3 = class197.method434(class193.field2322, client.field751.field1333);
            var3.field2372.method5279(class311.method235(arg0));
            var3.field2372.method5257(arg0);
            client.field751.method2239(var3);
        }
    }

    @ObfuscatedName("au.b(B)V")
    public static final void method666() {
        method5037(class234.field3017);
    }

    @ObfuscatedName("bh.a(Ljava/lang/String;I)V")
    public static final void method1071(String arg0) {
        method5037(class234.field2945 + arg0 + class234.field2907);
    }

    @ObfuscatedName("fr.w(S)V")
    public static final void method3438() {
        method5037(class234.field3025);
    }

    @ObfuscatedName("cp.k(I)Z")
    public final boolean method1822() {
        return this.field1078.method4903() || this.field1078.method4882() >= 100 && client.field674 != 1;
    }

    @ObfuscatedName("cp.i(Ljava/lang/String;B)V")
    public final void method1823(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1080);
        if (!var2.method4966()) {
            return;
        }
        if (this.field1081.method4887(var2)) {
            client.field858 = client.field850;
            class197 var3 = class197.method434(class193.field2238, client.field751.field1333);
            var3.field2372.method5279(class311.method235(arg0));
            var3.field2372.method5257(arg0);
            client.field751.method2239(var3);
        }
        client.method2268();
    }

    @ObfuscatedName("cp.x(Ljava/lang/String;I)V")
    public final void method1856(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1080);
        if (!var2.method4966()) {
            return;
        }
        if (this.field1078.method4887(var2)) {
            client.field858 = client.field850;
            class197 var3 = class197.method434(class193.field2330, client.field751.field1333);
            var3.field2372.method5279(class311.method235(arg0));
            var3.field2372.method5257(arg0);
            client.field751.method2239(var3);
        }
        client.method737();
    }

    @ObfuscatedName("f.g(Ljava/lang/String;II)V")
    public static final void method140(String arg0, int arg1) {
        class197 var2 = class197.method434(class193.field2253, client.field751.field1333);
        var2.field2372.method5279(class311.method235(arg0) + 1);
        var2.field2372.method5279(arg1);
        var2.field2372.method5257(arg0);
        client.field751.method2239(var2);
    }

    @ObfuscatedName("cp.u(Lkk;I)Z")
    public final boolean method1851(class294 arg0) {
        class295 var2 = (class295) this.field1081.method4885(arg0);
        return var2 != null && var2.method4949();
    }
}

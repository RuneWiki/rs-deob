package deob;

@ObfuscatedName("bz")
public class class75 {

    @ObfuscatedName("bz.g")
    public final class338 field1060;

    @ObfuscatedName("bz.z")
    public final class282 field1058;

    @ObfuscatedName("bz.p")
    public final class276 field1061;

    @ObfuscatedName("bz.h")
    public int field1062 = 0;

    public class75(class338 arg0) {
        this.field1060 = arg0;
        this.field1058 = new class282(arg0);
        this.field1061 = new class276(arg0);
    }

    @ObfuscatedName("bz.u(I)Z")
    public boolean method1690() {
        return this.field1062 == 2;
    }

    @ObfuscatedName("bz.f(B)V")
    public final void method1687() {
        this.field1062 = 1;
    }

    @ObfuscatedName("bz.b(Lkg;IB)V")
    public final void method1688(class300 arg0, int arg1) {
        this.field1058.method4828(arg0, arg1);
        this.field1062 = 2;
        client.method278();
    }

    @ObfuscatedName("bz.g(I)V")
    public final void method1689() {
        for (class286 var1 = (class286) this.field1058.field3620.method4599(); var1 != null; var1 = (class286) this.field1058.field3620.method4600()) {
            if ((long) var1.field3647 < class297.method3217() / 1000L - 5L) {
                if (var1.field3646 > 0) {
                    class92.method151(5, "", var1.field3643 + class225.field2920);
                }
                if (var1.field3646 == 0) {
                    class92.method151(5, "", var1.field3643 + class225.field2846);
                }
                var1.method3326();
            }
        }
    }

    @ObfuscatedName("bz.z(I)V")
    public final void method1696() {
        this.field1062 = 0;
        this.field1058.method4746();
        this.field1061.method4746();
    }

    @ObfuscatedName("bz.p(Ljb;ZI)Z")
    public final boolean method1691(class283 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2558.field607)) {
            return true;
        } else {
            return this.field1058.method4827(arg0, arg1);
        }
    }

    @ObfuscatedName("bz.h(Ljb;B)Z")
    public final boolean method1723(class283 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1061.method4749(arg0);
        }
    }

    @ObfuscatedName("bz.y(Ljava/lang/String;I)V")
    public final void method1725(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1060);
        if (!var2.method4835()) {
            return;
        }
        if (this.method1693()) {
            method3346();
        } else if (Statics.field2558.field607.equals(var2)) {
            method285(class225.field2967);
        } else if (this.method1691(var2, false)) {
            method1093(arg0);
        } else if (this.method1723(var2)) {
            method285(class225.field2945 + arg0 + class225.field2897);
        } else {
            class188 var3 = class188.method3035(class184.field2269, client.field690.field1311);
            var3.field2347.method5290(class300.method3313(arg0));
            var3.field2347.method5129(arg0);
            client.field690.method2071(var3);
        }
    }

    @ObfuscatedName("l.w(Ljava/lang/String;I)V")
    public static final void method285(String arg0) {
        class92.method151(30, "", arg0);
    }

    @ObfuscatedName("gx.i(I)V")
    public static final void method3346() {
        method285(class225.field2769);
    }

    @ObfuscatedName("bb.k(Ljava/lang/String;I)V")
    public static final void method1093(String arg0) {
        method285(arg0 + class225.field2940);
    }

    @ObfuscatedName("bz.x(I)Z")
    public final boolean method1693() {
        return this.field1058.method4779() || this.field1058.method4747() >= 200 && client.field790 != 1;
    }

    @ObfuscatedName("bz.o(Ljava/lang/String;B)V")
    public final void method1694(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1060);
        if (!var2.method4835()) {
            return;
        }
        if (this.method1695()) {
            method125();
        } else if (Statics.field2558.field607.equals(var2)) {
            method285(class225.field2958);
        } else if (this.method1723(var2)) {
            method285(arg0 + class225.field2956);
        } else if (this.method1691(var2, false)) {
            method244(arg0);
        } else {
            method3803(arg0);
        }
    }

    @ObfuscatedName("x.e(B)V")
    public static final void method125() {
        method285(class225.field2843);
    }

    @ObfuscatedName("t.n(Ljava/lang/String;I)V")
    public static final void method244(String arg0) {
        method285(class225.field2947 + arg0 + class225.field2948);
    }

    @ObfuscatedName("hj.c(Ljava/lang/String;I)V")
    public static final void method3803(String arg0) {
        class188 var1 = class188.method3035(class184.field2220, client.field690.field1311);
        var1.field2347.method5290(class300.method3313(arg0));
        var1.field2347.method5129(arg0);
        client.field690.method2071(var1);
    }

    @ObfuscatedName("bz.s(B)Z")
    public final boolean method1695() {
        return this.field1061.method4779() || this.field1061.method4747() >= 100 && client.field790 != 1;
    }

    @ObfuscatedName("bz.t(Ljava/lang/String;I)V")
    public final void method1720(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1060);
        if (!var2.method4835()) {
            return;
        }
        if (this.field1058.method4753(var2)) {
            client.field834 = client.field828;
            class188 var3 = class188.method3035(class184.field2290, client.field690.field1311);
            var3.field2347.method5290(class300.method3313(arg0));
            var3.field2347.method5129(arg0);
            client.field690.method2071(var3);
        }
        client.method278();
    }

    @ObfuscatedName("bz.m(Ljava/lang/String;I)V")
    public final void method1697(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1060);
        if (!var2.method4835()) {
            return;
        }
        if (this.field1061.method4753(var2)) {
            client.field834 = client.field828;
            class188 var3 = class188.method3035(class184.field2218, client.field690.field1311);
            var3.field2347.method5290(class300.method3313(arg0));
            var3.field2347.method5129(arg0);
            client.field690.method2071(var3);
        }
        client.method3389();
    }

    @ObfuscatedName("hv.v(Ljava/lang/String;II)V")
    public static final void method3742(String arg0, int arg1) {
        class188 var2 = class188.method3035(class184.field2320, client.field690.field1311);
        var2.field2347.method5290(class300.method3313(arg0) + 1);
        var2.field2347.method5129(arg0);
        var2.field2347.method5290(arg1);
        client.field690.method2071(var2);
    }

    @ObfuscatedName("bz.q(Ljb;B)Z")
    public final boolean method1713(class283 arg0) {
        class284 var2 = (class284) this.field1058.method4750(arg0);
        return var2 != null && var2.method4816();
    }
}

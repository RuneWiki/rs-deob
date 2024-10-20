package deob;

@ObfuscatedName("bl")
public class class62 {

    @ObfuscatedName("bl.m")
    public final class400 field781;

    @ObfuscatedName("bl.t")
    public final class345 field782;

    @ObfuscatedName("bl.s")
    public final class343 field783;

    @ObfuscatedName("bl.j")
    public int field779 = 0;

    public class62(class400 arg0) {
        this.field781 = arg0;
        this.field782 = new class345(arg0);
        this.field783 = new class343(arg0);
    }

    @ObfuscatedName("bl.c(I)Z")
    public boolean method1641() {
        return this.field779 == 2;
    }

    @ObfuscatedName("bl.b(I)V")
    public final void method1677() {
        this.field779 = 1;
    }

    @ObfuscatedName("bl.p(Lpi;II)V")
    public final void method1643(class419 arg0, int arg1) {
        this.field782.method5701(arg0, arg1);
        this.field779 = 2;
        client.method4405();
    }

    @ObfuscatedName("bl.m(B)V")
    public final void method1644() {
        for (class348 var1 = (class348) this.field782.field4083.method5411(); var1 != null; var1 = (class348) this.field782.field4083.method5415()) {
            if ((long) var1.field4098 < class416.method5860() / 1000L - 5L) {
                if (var1.field4100 > 0) {
                    class98.method3622(5, "", var1.field4099 + class295.field3616);
                }
                if (var1.field4100 == 0) {
                    class98.method3622(5, "", var1.field4099 + class295.field3630);
                }
                var1.method6154();
            }
        }
    }

    @ObfuscatedName("bl.t(B)V")
    public final void method1645() {
        this.field779 = 0;
        this.field782.method5793();
        this.field783.method5793();
    }

    @ObfuscatedName("bl.s(Lpo;ZB)Z")
    public final boolean method1646(class440 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field4070.field1071)) {
            return true;
        } else {
            return this.field782.method5700(arg0, arg1);
        }
    }

    @ObfuscatedName("bl.j(Lpo;B)Z")
    public final boolean method1647(class440 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field783.method5822(arg0);
        }
    }

    @ObfuscatedName("bl.w(Ljava/lang/String;I)V")
    public final void method1648(String arg0) {
        if (arg0 == null) {
            return;
        }
        class440 var2 = new class440(arg0, this.field781);
        if (!var2.method7189()) {
            return;
        }
        if (this.method1649()) {
            method2055();
        } else if (Statics.field4070.field1071.equals(var2)) {
            class295 var5 = (class295) null;
            String var3 = class295.field3660;
            class98.method3622(30, "", var3);
        } else if (this.method1646(var2, false)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class295 var10001 = (class295) null;
            String var4 = var10000.append(class295.field3649).toString();
            class98.method3622(30, "", var4);
        } else if (this.method1647(var2)) {
            method1576(arg0);
        } else {
            method115(arg0);
        }
    }

    @ObfuscatedName("cp.n(B)V")
    public static final void method2055() {
        class295 var10000 = (class295) null;
        String var0 = class295.field3536;
        class98.method3622(30, "", var0);
    }

    @ObfuscatedName("client.r(Ljava/lang/String;I)V")
    public static final void method1576(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class295 var10001 = (class295) null;
        StringBuilder var2 = var10000.append(class295.field3654).append(arg0);
        class295 var3 = (class295) null;
        String var1 = var2.append(class295.field3761).toString();
        class98.method3622(30, "", var1);
    }

    @ObfuscatedName("o.o(Ljava/lang/String;I)V")
    public static final void method115(String arg0) {
        class255 var1 = Statics.method3174(class253.field2896, client.field690.field1286);
        var1.field2930.method6841(class419.method2537(arg0));
        var1.field2930.method6660(arg0);
        client.field690.method2328(var1);
    }

    @ObfuscatedName("bl.v(I)Z")
    public final boolean method1649() {
        return this.field782.method5795() || this.field782.method5794() >= 200 && client.field595 != 1;
    }

    @ObfuscatedName("bl.d(Ljava/lang/String;I)V")
    public final void method1678(String arg0) {
        if (arg0 == null) {
            return;
        }
        class440 var2 = new class440(arg0, this.field781);
        if (!var2.method7189()) {
            return;
        }
        if (this.method1651()) {
            class295 var7 = (class295) null;
            String var3 = class295.field3650;
            class98.method3622(30, "", var3);
        } else if (Statics.field4070.field1071.equals(var2)) {
            method4963();
        } else {
            StringBuilder var10000;
            class295 var10001;
            if (this.method1647(var2)) {
                var10000 = (new StringBuilder()).append(arg0);
                var10001 = (class295) null;
                String var4 = var10000.append(class295.field3619).toString();
                class98.method3622(30, "", var4);
            } else if (this.method1646(var2, false)) {
                var10000 = new StringBuilder();
                var10001 = (class295) null;
                StringBuilder var6 = var10000.append(class295.field3656).append(arg0);
                class295 var8 = (class295) null;
                String var5 = var6.append(class295.field3711).toString();
                class98.method3622(30, "", var5);
            } else {
                method52(arg0);
            }
        }
    }

    @ObfuscatedName("ji.h(I)V")
    public static final void method4963() {
        class295 var10000 = (class295) null;
        String var0 = class295.field3735;
        class98.method3622(30, "", var0);
    }

    @ObfuscatedName("j.g(Ljava/lang/String;I)V")
    public static final void method52(String arg0) {
        class255 var1 = Statics.method3174(class253.field2906, client.field690.field1286);
        var1.field2930.method6841(class419.method2537(arg0));
        var1.field2930.method6660(arg0);
        client.field690.method2328(var1);
    }

    @ObfuscatedName("bl.e(I)Z")
    public final boolean method1651() {
        return this.field783.method5795() || this.field783.method5794() >= 100 && client.field595 != 1;
    }

    @ObfuscatedName("bl.a(Ljava/lang/String;B)V")
    public final void method1706(String arg0) {
        if (arg0 == null) {
            return;
        }
        class440 var2 = new class440(arg0, this.field781);
        if (!var2.method7189()) {
            return;
        }
        if (this.field782.method5800(var2)) {
            client.method6582();
            class255 var3 = Statics.method3174(class253.field2855, client.field690.field1286);
            var3.field2930.method6841(class419.method2537(arg0));
            var3.field2930.method6660(arg0);
            client.field690.method2328(var3);
        }
        client.method4405();
    }

    @ObfuscatedName("bl.u(Ljava/lang/String;I)V")
    public final void method1650(String arg0) {
        if (arg0 == null) {
            return;
        }
        class440 var2 = new class440(arg0, this.field781);
        if (!var2.method7189()) {
            return;
        }
        if (this.field783.method5800(var2)) {
            client.method6582();
            class255 var3 = Statics.method3174(class253.field2806, client.field690.field1286);
            var3.field2930.method6841(class419.method2537(arg0));
            var3.field2930.method6660(arg0);
            client.field690.method2328(var3);
        }
        client.method3630();
    }

    @ObfuscatedName("df.k(Ljava/lang/String;IB)V")
    public static final void method2495(String arg0, int arg1) {
        class255 var2 = Statics.method3174(class253.field2879, client.field690.field1286);
        var2.field2930.method6841(class419.method2537(arg0) + 1);
        var2.field2930.method6651(arg1);
        var2.field2930.method6660(arg0);
        client.field690.method2328(var2);
    }

    @ObfuscatedName("bl.f(Lpo;I)Z")
    public final boolean method1700(class440 arg0) {
        class346 var2 = (class346) this.field782.method5797(arg0);
        return var2 != null && var2.method5865();
    }
}

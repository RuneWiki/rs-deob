package deob;

@ObfuscatedName("bc")
public class class75 {

    @ObfuscatedName("bc.g")
    public final class338 field1032;

    @ObfuscatedName("bc.l")
    public final class282 field1039;

    @ObfuscatedName("bc.u")
    public final class276 field1034;

    @ObfuscatedName("bc.j")
    public int field1035 = 0;

    public class75(class338 arg0) {
        this.field1032 = arg0;
        this.field1039 = new class282(arg0);
        this.field1034 = new class276(arg0);
    }

    @ObfuscatedName("bc.c(I)Z")
    public boolean method1694() {
        return this.field1035 == 2;
    }

    @ObfuscatedName("bc.x(B)V")
    public final void method1725() {
        this.field1035 = 1;
    }

    @ObfuscatedName("bc.t(Lkz;IB)V")
    public final void method1699(class300 arg0, int arg1) {
        this.field1039.method4812(arg0, arg1);
        this.field1035 = 2;
        client.method3032();
    }

    @ObfuscatedName("bc.g(I)V")
    public final void method1685() {
        for (class286 var1 = (class286) this.field1039.field3593.method4584(); var1 != null; var1 = (class286) this.field1039.field3593.method4585()) {
            if ((long) var1.field3614 < Statics.method2303() / 1000L - 5L) {
                if (var1.field3615 > 0) {
                    class92.method500(5, "", var1.field3613 + class225.field2890);
                }
                if (var1.field3615 == 0) {
                    class92.method500(5, "", var1.field3613 + class225.field2891);
                }
                var1.method3322();
            }
        }
    }

    @ObfuscatedName("bc.l(I)V")
    public final void method1736() {
        this.field1035 = 0;
        this.field1039.method4723();
        this.field1034.method4723();
    }

    @ObfuscatedName("bc.u(Ljt;ZI)Z")
    public final boolean method1691(class283 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2495.field596)) {
            return true;
        } else {
            return this.field1039.method4810(arg0, arg1);
        }
    }

    @ObfuscatedName("bc.j(Ljt;I)Z")
    public final boolean method1688(class283 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1034.method4774(arg0);
        }
    }

    @ObfuscatedName("bc.v(Ljava/lang/String;I)V")
    public final void method1722(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1032);
        if (!var2.method4814()) {
            return;
        }
        if (this.method1690()) {
            method241(class225.field2957);
        } else if (Statics.field2495.field596.equals(var2)) {
            method7();
        } else if (this.method1691(var2, false)) {
            method3628(arg0);
        } else if (this.method1688(var2)) {
            method241(class225.field2915 + arg0 + class225.field2916);
        } else {
            method158(arg0);
        }
    }

    @ObfuscatedName("a.d(Ljava/lang/String;I)V")
    public static final void method241(String arg0) {
        class92.method500(30, "", arg0);
    }

    @ObfuscatedName("gm.z(Ljava/lang/String;B)V")
    public static final void method3628(String arg0) {
        method241(arg0 + class225.field2910);
    }

    @ObfuscatedName("x.s(B)V")
    public static final void method7() {
        method241(class225.field2913);
    }

    @ObfuscatedName("q.p(Ljava/lang/String;B)V")
    public static final void method158(String arg0) {
        class188 var1 = class188.method1894(class184.field2191, client.field669.field1279);
        var1.field2313.method5087(class300.method2018(arg0));
        var1.field2313.method5094(arg0);
        client.field669.method2075(var1);
    }

    @ObfuscatedName("bc.e(I)Z")
    public final boolean method1690() {
        return this.field1039.method4773() || this.field1039.method4784() >= 200 && client.field740 != 1;
    }

    @ObfuscatedName("bc.i(Ljava/lang/String;I)V")
    public final void method1697(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1032);
        if (!var2.method4814()) {
            return;
        }
        if (this.method1692()) {
            method241(class225.field2959);
        } else if (Statics.field2495.field596.equals(var2)) {
            method3638();
        } else if (this.method1688(var2)) {
            method241(arg0 + class225.field2912);
        } else if (this.method1691(var2, false)) {
            method241(class225.field2889 + arg0 + class225.field2918);
        } else {
            class188 var3 = class188.method1894(class184.field2275, client.field669.field1279);
            var3.field2313.method5087(class300.method2018(arg0));
            var3.field2313.method5094(arg0);
            client.field669.method2075(var3);
        }
    }

    @ObfuscatedName("hq.q(I)V")
    public static final void method3638() {
        method241(class225.field2914);
    }

    @ObfuscatedName("bc.r(B)Z")
    public final boolean method1692() {
        return this.field1034.method4773() || this.field1034.method4784() >= 100 && client.field740 != 1;
    }

    @ObfuscatedName("bc.k(Ljava/lang/String;B)V")
    public final void method1693(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1032);
        if (!var2.method4814()) {
            return;
        }
        if (this.field1039.method4730(var2)) {
            client.method52();
            class188 var3 = class188.method1894(class184.field2282, client.field669.field1279);
            var3.field2313.method5087(class300.method2018(arg0));
            var3.field2313.method5094(arg0);
            client.field669.method2075(var3);
        }
        client.method3032();
    }

    @ObfuscatedName("bc.w(Ljava/lang/String;S)V")
    public final void method1689(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1032);
        if (!var2.method4814()) {
            return;
        }
        if (this.field1034.method4730(var2)) {
            client.method52();
            class188 var3 = class188.method1894(class184.field2274, client.field669.field1279);
            var3.field2313.method5087(class300.method2018(arg0));
            var3.field2313.method5094(arg0);
            client.field669.method2075(var3);
        }
        client.method1579();
    }

    @ObfuscatedName("ky.m(Ljava/lang/String;II)V")
    public static final void method5388(String arg0, int arg1) {
        class188 var2 = class188.method1894(class184.field2194, client.field669.field1279);
        var2.field2313.method5087(class300.method2018(arg0) + 1);
        var2.field2313.method5094(arg0);
        var2.field2313.method5131(arg1);
        client.field669.method2075(var2);
    }

    @ObfuscatedName("bc.o(Ljt;I)Z")
    public final boolean method1695(class283 arg0) {
        class284 var2 = (class284) this.field1039.method4727(arg0);
        return var2 != null && var2.method4804();
    }
}

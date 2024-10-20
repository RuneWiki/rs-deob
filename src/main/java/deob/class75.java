package deob;

@ObfuscatedName("bu")
public class class75 {

    @ObfuscatedName("bu.e")
    public final class339 field1054;

    @ObfuscatedName("bu.i")
    public final class283 field1055;

    @ObfuscatedName("bu.g")
    public final class277 field1059;

    @ObfuscatedName("bu.d")
    public int field1064 = 0;

    public class75(class339 arg0) {
        this.field1054 = arg0;
        this.field1055 = new class283(arg0);
        this.field1059 = new class277(arg0);
    }

    @ObfuscatedName("bu.c(I)Z")
    public boolean method1687() {
        return this.field1064 == 2;
    }

    @ObfuscatedName("bu.t(I)V")
    public final void method1688() {
        this.field1064 = 1;
    }

    @ObfuscatedName("bu.o(Lkp;II)V")
    public final void method1723(class301 arg0, int arg1) {
        this.field1055.method4823(arg0, arg1);
        this.field1064 = 2;
        client.method509();
    }

    @ObfuscatedName("bu.e(I)V")
    public final void method1690() {
        for (class287 var1 = (class287) this.field1055.field3610.method4579(); var1 != null; var1 = (class287) this.field1055.field3610.method4581()) {
            if ((long) var1.field3633 < Statics.method184() / 1000L - 5L) {
                if (var1.field3635 > 0) {
                    class92.method1681(5, "", var1.field3634 + class225.field3043);
                }
                if (var1.field3635 == 0) {
                    class92.method1681(5, "", var1.field3634 + class225.field2919);
                }
                var1.method3345();
            }
        }
    }

    @ObfuscatedName("bu.i(I)V")
    public final void method1691() {
        this.field1064 = 0;
        this.field1055.method4732();
        this.field1059.method4732();
    }

    @ObfuscatedName("bu.g(Ljz;ZI)Z")
    public final boolean method1686(class284 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2392.field626)) {
            return true;
        } else {
            return this.field1055.method4820(arg0, arg1);
        }
    }

    @ObfuscatedName("bu.d(Ljz;I)Z")
    public final boolean method1693(class284 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1059.method4735(arg0);
        }
    }

    @ObfuscatedName("bu.l(Ljava/lang/String;I)V")
    public final void method1694(String arg0) {
        if (arg0 == null) {
            return;
        }
        class284 var2 = new class284(arg0, this.field1054);
        if (!var2.method4830()) {
            return;
        }
        if (this.method1695()) {
            method363();
        } else if (Statics.field2392.field626.equals(var2)) {
            method377();
        } else if (this.method1686(var2, false)) {
            method1667(arg0);
        } else if (this.method1693(var2)) {
            method3638(arg0);
        } else {
            class188 var3 = class188.method2887(class184.field2261, client.field693.field1298);
            var3.field2335.method5272(class301.method4819(arg0));
            var3.field2335.method5310(arg0);
            client.field693.method2109(var3);
        }
    }

    @ObfuscatedName("by.j(Ljava/lang/String;I)V")
    public static final void method1041(String arg0) {
        class92.method1681(30, "", arg0);
    }

    @ObfuscatedName("ae.m(B)V")
    public static final void method363() {
        method1041(class225.field3005);
    }

    @ObfuscatedName("bz.p(Ljava/lang/String;I)V")
    public static final void method1667(String arg0) {
        method1041(arg0 + class225.field3039);
    }

    @ObfuscatedName("gz.h(Ljava/lang/String;I)V")
    public static final void method3638(String arg0) {
        method1041(class225.field2960 + arg0 + class225.field2944);
    }

    @ObfuscatedName("az.v(B)V")
    public static final void method377() {
        method1041(class225.field3049);
    }

    @ObfuscatedName("bu.n(I)Z")
    public final boolean method1695() {
        return this.field1055.method4734() || this.field1055.method4787() >= 200 && client.field764 != 1;
    }

    @ObfuscatedName("bu.x(Ljava/lang/String;I)V")
    public final void method1696(String arg0) {
        if (arg0 == null) {
            return;
        }
        class284 var2 = new class284(arg0, this.field1054);
        if (!var2.method4830()) {
            return;
        }
        if (this.method1697()) {
            method1041(class225.field2939);
        } else if (Statics.field2392.field626.equals(var2)) {
            method1916();
        } else if (this.method1693(var2)) {
            method3059(arg0);
        } else if (this.method1686(var2, false)) {
            method2648(arg0);
        } else {
            method670(arg0);
        }
    }

    @ObfuscatedName("el.w(Ljava/lang/String;I)V")
    public static final void method3059(String arg0) {
        method1041(arg0 + class225.field2940);
    }

    @ObfuscatedName("du.q(Ljava/lang/String;I)V")
    public static final void method2648(String arg0) {
        method1041(class225.field2945 + arg0 + class225.field2946);
    }

    @ObfuscatedName("cr.z(I)V")
    public static final void method1916() {
        method1041(class225.field3020);
    }

    @ObfuscatedName("am.y(Ljava/lang/String;I)V")
    public static final void method670(String arg0) {
        class188 var1 = class188.method2887(class184.field2241, client.field693.field1298);
        var1.field2335.method5272(class301.method4819(arg0));
        var1.field2335.method5310(arg0);
        client.field693.method2109(var1);
    }

    @ObfuscatedName("bu.f(I)Z")
    public final boolean method1697() {
        return this.field1059.method4734() || this.field1059.method4787() >= 100 && client.field764 != 1;
    }

    @ObfuscatedName("bu.a(Ljava/lang/String;I)V")
    public final void method1698(String arg0) {
        if (arg0 == null) {
            return;
        }
        class284 var2 = new class284(arg0, this.field1054);
        if (!var2.method4830()) {
            return;
        }
        if (this.field1055.method4739(var2)) {
            client.field840 = client.field832;
            class188 var3 = class188.method2887(class184.field2214, client.field693.field1298);
            var3.field2335.method5272(class301.method4819(arg0));
            var3.field2335.method5310(arg0);
            client.field693.method2109(var3);
        }
        client.method509();
    }

    @ObfuscatedName("bu.u(Ljava/lang/String;I)V")
    public final void method1699(String arg0) {
        if (arg0 == null) {
            return;
        }
        class284 var2 = new class284(arg0, this.field1054);
        if (!var2.method4830()) {
            return;
        }
        if (this.field1059.method4739(var2)) {
            client.field840 = client.field832;
            class188 var3 = class188.method2887(class184.field2289, client.field693.field1298);
            var3.field2335.method5272(class301.method4819(arg0));
            var3.field2335.method5310(arg0);
            client.field693.method2109(var3);
        }
        client.method2151();
    }

    @ObfuscatedName("ki.ae(Ljava/lang/String;IB)V")
    public static final void method5386(String arg0, int arg1) {
        class188 var2 = class188.method2887(class184.field2266, client.field693.field1298);
        var2.field2335.method5272(class301.method4819(arg0) + 1);
        var2.field2335.method5310(arg0);
        var2.field2335.method5156(arg1);
        client.field693.method2109(var2);
    }

    @ObfuscatedName("bu.af(Ljz;I)Z")
    public final boolean method1739(class284 arg0) {
        class285 var2 = (class285) this.field1055.method4771(arg0);
        return var2 != null && var2.method4813();
    }
}

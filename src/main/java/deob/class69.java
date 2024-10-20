package deob;

@ObfuscatedName("bh")
public class class69 {

    @ObfuscatedName("bh.q")
    public final class331 field1044;

    @ObfuscatedName("bh.c")
    public final class293 field1041;

    @ObfuscatedName("bh.l")
    public final class287 field1042;

    @ObfuscatedName("bh.b")
    public int field1043 = 0;

    public class69(class331 arg0) {
        this.field1044 = arg0;
        this.field1041 = new class293(arg0);
        this.field1042 = new class287(arg0);
    }

    @ObfuscatedName("bh.g(I)Z")
    public boolean method1644() {
        return this.field1043 == 2;
    }

    @ObfuscatedName("bh.r(S)V")
    public final void method1697() {
        this.field1043 = 1;
    }

    @ObfuscatedName("bh.e(Lgl;IB)V")
    public final void method1646(class185 arg0, int arg1) {
        this.field1041.method5260(arg0, arg1);
        this.field1043 = 2;
        client.method4527();
    }

    @ObfuscatedName("bh.q(I)V")
    public final void method1716() {
        for (class297 var1 = (class297) this.field1041.field3718.method3993(); var1 != null; var1 = (class297) this.field1041.field3718.method3994()) {
            if ((long) var1.field3737 < class187.method2664() / 1000L - 5L) {
                if (var1.field3736 > 0) {
                    class86.method1084(5, "", var1.field3735 + class240.field3066);
                }
                if (var1.field3736 == 0) {
                    class86.method1084(5, "", var1.field3735 + class240.field3007);
                }
                var1.method3999();
            }
        }
    }

    @ObfuscatedName("bh.c(I)V")
    public final void method1648() {
        this.field1043 = 0;
        this.field1041.method5171();
        this.field1042.method5171();
    }

    @ObfuscatedName("bh.i(Lkg;ZB)Z")
    public final boolean method1669(class294 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1064.field626)) {
            return true;
        } else {
            return this.field1041.method5259(arg0, arg1);
        }
    }

    @ObfuscatedName("bh.p(Lkg;I)Z")
    public final boolean method1696(class294 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1042.method5192(arg0);
        }
    }

    @ObfuscatedName("bh.m(Ljava/lang/String;B)V")
    public final void method1651(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1044);
        if (!var2.method5270()) {
            return;
        }
        if (this.method1652()) {
            method4178();
        } else if (Statics.field1064.field626.equals(var2)) {
            method4244();
        } else if (this.method1669(var2, false)) {
            method219(arg0);
        } else if (this.method1696(var2)) {
            method584(class240.field3031 + arg0 + class240.field3108);
        } else {
            method4608(arg0);
        }
    }

    @ObfuscatedName("ag.d(Ljava/lang/String;I)V")
    public static final void method584(String arg0) {
        class86.method1084(30, "", arg0);
    }

    @ObfuscatedName("ho.j(I)V")
    public static final void method4178() {
        method584(class240.field3025);
    }

    @ObfuscatedName("a.x(Ljava/lang/String;I)V")
    public static final void method219(String arg0) {
        method584(arg0 + class240.field3058);
    }

    @ObfuscatedName("hv.v(S)V")
    public static final void method4244() {
        method584(class240.field2966);
    }

    @ObfuscatedName("ic.h(Ljava/lang/String;B)V")
    public static final void method4608(String arg0) {
        class175 var1 = class175.method3035(class172.field2279, client.field691.field1283);
        var1.field2333.method3501(class185.method2245(arg0));
        var1.field2333.method3585(arg0);
        client.field691.method2060(var1);
    }

    @ObfuscatedName("bh.f(I)Z")
    public final boolean method1652() {
        return this.field1041.method5173() || this.field1041.method5172() >= 200 && client.field762 != 1;
    }

    @ObfuscatedName("bh.a(Ljava/lang/String;I)V")
    public final void method1653(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1044);
        if (!var2.method5270()) {
            return;
        }
        if (this.method1654()) {
            method584(class240.field3069);
        } else if (Statics.field1064.field626.equals(var2)) {
            method584(class240.field3030);
        } else if (this.method1696(var2)) {
            method3360(arg0);
        } else if (this.method1669(var2, false)) {
            method299(arg0);
        } else {
            class175 var3 = class175.method3035(class172.field2298, client.field691.field1283);
            var3.field2333.method3501(class185.method2245(arg0));
            var3.field2333.method3585(arg0);
            client.field691.method2060(var3);
        }
    }

    @ObfuscatedName("fs.t(Ljava/lang/String;I)V")
    public static final void method3360(String arg0) {
        method584(arg0 + class240.field3016);
    }

    @ObfuscatedName("k.k(Ljava/lang/String;B)V")
    public static final void method299(String arg0) {
        method584(class240.field3033 + arg0 + class240.field3006);
    }

    @ObfuscatedName("bh.s(B)Z")
    public final boolean method1654() {
        return this.field1042.method5173() || this.field1042.method5172() >= 100 && client.field762 != 1;
    }

    @ObfuscatedName("bh.y(Ljava/lang/String;I)V")
    public final void method1655(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1044);
        if (!var2.method5270()) {
            return;
        }
        if (this.field1041.method5178(var2)) {
            client.field837 = client.field829;
            class175 var3 = class175.method3035(class172.field2232, client.field691.field1283);
            var3.field2333.method3501(class185.method2245(arg0));
            var3.field2333.method3585(arg0);
            client.field691.method2060(var3);
        }
        client.method4527();
    }

    @ObfuscatedName("bh.u(Ljava/lang/String;B)V")
    public final void method1673(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1044);
        if (!var2.method5270()) {
            return;
        }
        if (this.field1042.method5178(var2)) {
            client.field837 = client.field829;
            class175 var3 = class175.method3035(class172.field2236, client.field691.field1283);
            var3.field2333.method3501(class185.method2245(arg0));
            var3.field2333.method3585(arg0);
            client.field691.method2060(var3);
        }
        client.method21();
    }

    @ObfuscatedName("er.o(Ljava/lang/String;II)V")
    public static final void method3132(String arg0, int arg1) {
        class175 var2 = class175.method3035(class172.field2285, client.field691.field1283);
        var2.field2333.method3501(class185.method2245(arg0) + 1);
        var2.field2333.method3585(arg0);
        var2.field2333.method3501(arg1);
        client.field691.method2060(var2);
    }

    @ObfuscatedName("bh.af(Lkg;B)Z")
    public final boolean method1657(class294 arg0) {
        class295 var2 = (class295) this.field1041.method5175(arg0);
        return var2 != null && var2.method5254();
    }
}

package deob;

@ObfuscatedName("bi")
public class class75 {

    @ObfuscatedName("bi.w")
    public final class338 field1048;

    @ObfuscatedName("bi.p")
    public final class282 field1044;

    @ObfuscatedName("bi.b")
    public final class276 field1042;

    @ObfuscatedName("bi.e")
    public int field1046 = 0;

    public class75(class338 arg0) {
        this.field1048 = arg0;
        this.field1044 = new class282(arg0);
        this.field1042 = new class276(arg0);
    }

    @ObfuscatedName("bi.f(I)Z")
    public boolean method1676() {
        return this.field1046 == 2;
    }

    @ObfuscatedName("bi.i(B)V")
    public final void method1677() {
        this.field1046 = 1;
    }

    @ObfuscatedName("bi.y(Lkq;II)V")
    public final void method1700(class300 arg0, int arg1) {
        this.field1044.method4816(arg0, arg1);
        this.field1046 = 2;
        client.method4870();
    }

    @ObfuscatedName("bi.w(B)V")
    public final void method1679() {
        for (class286 var1 = (class286) this.field1044.field3600.method4560(); var1 != null; var1 = (class286) this.field1044.field3600.method4561()) {
            if ((long) var1.field3624 < class297.method481() / 1000L - 5L) {
                if (var1.field3622 > 0) {
                    class92.method1894(5, "", var1.field3625 + class225.field2895);
                }
                if (var1.field3622 == 0) {
                    class92.method1894(5, "", var1.field3625 + class225.field2997);
                }
                var1.method3288();
            }
        }
    }

    @ObfuscatedName("bi.p(B)V")
    public final void method1681() {
        this.field1046 = 0;
        this.field1044.method4717();
        this.field1042.method4717();
    }

    @ObfuscatedName("bi.b(Ljc;ZI)Z")
    public final boolean method1694(class283 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field585.field605)) {
            return true;
        } else {
            return this.field1044.method4815(arg0, arg1);
        }
    }

    @ObfuscatedName("bi.e(Ljc;I)Z")
    public final boolean method1682(class283 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1042.method4720(arg0);
        }
    }

    @ObfuscatedName("bi.x(Ljava/lang/String;B)V")
    public final void method1718(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1048);
        if (!var2.method4823()) {
            return;
        }
        if (this.method1675()) {
            method383();
        } else if (Statics.field585.field605.equals(var2)) {
            method1002(class225.field2918);
        } else if (this.method1694(var2, false)) {
            method4907(arg0);
        } else if (this.method1682(var2)) {
            method1002(class225.field2920 + arg0 + class225.field2818);
        } else {
            class182 var3 = class182.method19(class178.field2237, client.field668.field1294);
            var3.field2303.method5094(class300.method2738(arg0));
            var3.field2303.method5101(arg0);
            client.field668.method2084(var3);
        }
    }

    @ObfuscatedName("bl.a(Ljava/lang/String;I)V")
    public static final void method1002(String arg0) {
        class92.method1894(30, "", arg0);
    }

    @ObfuscatedName("as.d(B)V")
    public static final void method383() {
        method1002(class225.field2914);
    }

    @ObfuscatedName("ke.c(Ljava/lang/String;B)V")
    public static final void method4907(String arg0) {
        method1002(arg0 + class225.field2915);
    }

    @ObfuscatedName("bi.o(I)Z")
    public final boolean method1675() {
        return this.field1044.method4719() || this.field1044.method4765() >= 200 && client.field747 != 1;
    }

    @ObfuscatedName("bi.l(Ljava/lang/String;I)V")
    public final void method1685(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1048);
        if (!var2.method4823()) {
            return;
        }
        if (this.method1686()) {
            method2740();
        } else if (Statics.field585.field605.equals(var2)) {
            method522();
        } else if (this.method1682(var2)) {
            method1002(arg0 + class225.field2947);
        } else if (this.method1694(var2, false)) {
            method3331(arg0);
        } else {
            class182 var3 = class182.method19(class178.field2207, client.field668.field1294);
            var3.field2303.method5094(class300.method2738(arg0));
            var3.field2303.method5101(arg0);
            client.field668.method2084(var3);
        }
    }

    @ObfuscatedName("dm.t(I)V")
    public static final void method2740() {
        method1002(class225.field3035);
    }

    @ObfuscatedName("gd.j(Ljava/lang/String;B)V")
    public static final void method3331(String arg0) {
        method1002(class225.field2948 + arg0 + class225.field3026);
    }

    @ObfuscatedName("an.n(I)V")
    public static final void method522() {
        method1002(class225.field2790);
    }

    @ObfuscatedName("bi.u(I)Z")
    public final boolean method1686() {
        return this.field1042.method4719() || this.field1042.method4765() >= 100 && client.field747 != 1;
    }

    @ObfuscatedName("bi.z(Ljava/lang/String;I)V")
    public final void method1717(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1048);
        if (!var2.method4823()) {
            return;
        }
        if (this.field1044.method4724(var2)) {
            client.method2739();
            class182 var3 = class182.method19(class178.field2239, client.field668.field1294);
            var3.field2303.method5094(class300.method2738(arg0));
            var3.field2303.method5101(arg0);
            client.field668.method2084(var3);
        }
        client.method4870();
    }

    @ObfuscatedName("bi.h(Ljava/lang/String;I)V")
    public final void method1688(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1048);
        if (!var2.method4823()) {
            return;
        }
        if (this.field1042.method4724(var2)) {
            client.method2739();
            class182 var3 = class182.method19(class178.field2261, client.field668.field1294);
            var3.field2303.method5094(class300.method2738(arg0));
            var3.field2303.method5101(arg0);
            client.field668.method2084(var3);
        }
        client.method925();
    }

    @ObfuscatedName("er.m(Ljava/lang/String;II)V")
    public static final void method3014(String arg0, int arg1) {
        class182 var2 = class182.method19(class178.field2220, client.field668.field1294);
        var2.field2303.method5094(class300.method2738(arg0) + 1);
        var2.field2303.method5101(arg0);
        var2.field2303.method5263(arg1);
        client.field668.method2084(var2);
    }

    @ObfuscatedName("bi.aa(Ljc;I)Z")
    public final boolean method1680(class283 arg0) {
        class285 var2 = (class285) this.field1044.method4721(arg0);
        return var2 != null && var2.method4811();
    }
}

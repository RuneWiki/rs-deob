package deob;

@ObfuscatedName("bw")
public class class62 {

    @ObfuscatedName("bw.f")
    public final class422 field805;

    @ObfuscatedName("bw.b")
    public final class366 field802;

    @ObfuscatedName("bw.n")
    public final class364 field807;

    @ObfuscatedName("bw.s")
    public int field806 = 0;

    public class62(class422 arg0) {
        this.field805 = arg0;
        this.field802 = new class366(arg0);
        this.field807 = new class364(arg0);
    }

    @ObfuscatedName("bw.v(I)Z")
    public boolean method1597() {
        return this.field806 == 2;
    }

    @ObfuscatedName("bw.c(B)V")
    public final void method1642() {
        this.field806 = 1;
    }

    @ObfuscatedName("bw.i(Lpi;II)V")
    public final void method1599(class438 arg0, int arg1) {
        this.field802.method6041(arg0, arg1);
        this.field806 = 2;
        client.method5182();
    }

    @ObfuscatedName("bw.f(S)V")
    public final void method1600() {
        for (class369 var1 = (class369) this.field802.field4235.method5644(); var1 != null; var1 = (class369) this.field802.field4235.method5647()) {
            if ((long) var1.field4247 < class270.method2724() / 1000L - 5L) {
                if (var1.field4249 > 0) {
                    class99.method2077(5, "", var1.field4248 + class309.field3804);
                }
                if (var1.field4249 == 0) {
                    class99.method2077(5, "", var1.field4248 + class309.field3752);
                }
                var1.method6495();
            }
        }
    }

    @ObfuscatedName("bw.b(I)V")
    public final void method1601() {
        this.field806 = 0;
        this.field802.method6142();
        this.field807.method6142();
    }

    @ObfuscatedName("bw.n(Lqb;ZS)Z")
    public final boolean method1602(class459 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field4004.field1073)) {
            return true;
        } else {
            return this.field802.method6040(arg0, arg1);
        }
    }

    @ObfuscatedName("bw.s(Lqb;B)Z")
    public final boolean method1603(class459 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field807.method6131(arg0);
        }
    }

    @ObfuscatedName("bw.l(Ljava/lang/String;B)V")
    public final void method1604(String arg0) {
        if (arg0 == null) {
            return;
        }
        class459 var2 = new class459(arg0, this.field805);
        if (!var2.method7524()) {
            return;
        }
        if (this.method1617()) {
            method2856(class309.field3858);
        } else if (Statics.field4004.field1073.equals(var2)) {
            method2806();
        } else if (this.method1602(var2, false)) {
            method2856(arg0 + class309.field3771);
        } else if (this.method1603(var2)) {
            method354(arg0);
        } else {
            method4250(arg0);
        }
    }

    @ObfuscatedName("eu.q(Ljava/lang/String;I)V")
    public static final void method2856(String arg0) {
        class99.method2077(30, "", arg0);
    }

    @ObfuscatedName("h.o(Ljava/lang/String;I)V")
    public static final void method354(String arg0) {
        method2856(class309.field3776 + arg0 + class309.field3777);
    }

    @ObfuscatedName("ex.r(I)V")
    public static final void method2806() {
        method2856(class309.field3774);
    }

    @ObfuscatedName("ha.p(Ljava/lang/String;B)V")
    public static final void method4250(String arg0) {
        class265 var1 = class265.method3935(class263.field2962, client.field685.field1328);
        var1.field3019.method6954(class438.method6861(arg0));
        var1.field3019.method7142(arg0);
        client.field685.method2395(var1);
    }

    @ObfuscatedName("bw.w(I)Z")
    public final boolean method1617() {
        return this.field802.method6182() || this.field802.method6129() >= 200 && client.field545 != 1;
    }

    @ObfuscatedName("bw.k(Ljava/lang/String;I)V")
    public final void method1606(String arg0) {
        if (arg0 == null) {
            return;
        }
        class459 var2 = new class459(arg0, this.field805);
        if (!var2.method7524()) {
            return;
        }
        if (this.method1607()) {
            method5509();
        } else if (Statics.field4004.field1073.equals(var2)) {
            method2856(class309.field3775);
        } else if (this.method1603(var2)) {
            method2856(arg0 + class309.field3735);
        } else if (this.method1602(var2, false)) {
            method343(arg0);
        } else {
            method564(arg0);
        }
    }

    @ObfuscatedName("lv.d(I)V")
    public static final void method5509() {
        method2856(class309.field3772);
    }

    @ObfuscatedName("e.m(Ljava/lang/String;I)V")
    public static final void method343(String arg0) {
        method2856(class309.field3778 + arg0 + class309.field3779);
    }

    @ObfuscatedName("ao.u(Ljava/lang/String;I)V")
    public static final void method564(String arg0) {
        class265 var1 = class265.method3935(class263.field2913, client.field685.field1328);
        var1.field3019.method6954(class438.method6861(arg0));
        var1.field3019.method7142(arg0);
        client.field685.method2395(var1);
    }

    @ObfuscatedName("bw.t(I)Z")
    public final boolean method1607() {
        return this.field807.method6182() || this.field807.method6129() >= 100 && client.field545 != 1;
    }

    @ObfuscatedName("bw.g(Ljava/lang/String;B)V")
    public final void method1608(String arg0) {
        if (arg0 == null) {
            return;
        }
        class459 var2 = new class459(arg0, this.field805);
        if (!var2.method7524()) {
            return;
        }
        if (this.field802.method6135(var2)) {
            client.field702 = client.field692;
            class265 var3 = class265.method3935(class263.field2971, client.field685.field1328);
            var3.field3019.method6954(class438.method6861(arg0));
            var3.field3019.method7142(arg0);
            client.field685.method2395(var3);
        }
        client.method5182();
    }

    @ObfuscatedName("bw.x(Ljava/lang/String;I)V")
    public final void method1640(String arg0) {
        if (arg0 == null) {
            return;
        }
        class459 var2 = new class459(arg0, this.field805);
        if (!var2.method7524()) {
            return;
        }
        if (this.field807.method6135(var2)) {
            client.field702 = client.field692;
            class265 var3 = class265.method3935(class263.field2992, client.field685.field1328);
            var3.field3019.method6954(class438.method6861(arg0));
            var3.field3019.method7142(arg0);
            client.field685.method2395(var3);
        }
        client.method3095();
    }

    @ObfuscatedName("gp.a(Ljava/lang/String;II)V")
    public static final void method3558(String arg0, int arg1) {
        class265 var2 = class265.method3935(class263.field2899, client.field685.field1328);
        var2.field3019.method6954(class438.method6861(arg0) + 1);
        var2.field3019.method7142(arg0);
        var2.field3019.method7101(arg1);
        client.field685.method2395(var2);
    }

    @ObfuscatedName("bw.y(Lqb;I)Z")
    public final boolean method1610(class459 arg0) {
        class367 var2 = (class367) this.field802.method6132(arg0);
        return var2 != null && var2.method6216();
    }
}

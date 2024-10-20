package deob;

@ObfuscatedName("ai")
public class class49 {

    @ObfuscatedName("ai.j")
    public final class367 field711;

    @ObfuscatedName("ai.l")
    public final class319 field712;

    @ObfuscatedName("ai.n")
    public final class317 field713;

    @ObfuscatedName("ai.w")
    public int field714 = 0;

    public class49(class367 arg0) {
        this.field711 = arg0;
        this.field712 = new class319(arg0);
        this.field713 = new class317(arg0);
    }

    @ObfuscatedName("ai.s(I)Z")
    public boolean method1384() {
        return this.field714 == 2;
    }

    @ObfuscatedName("ai.t(I)V")
    public final void method1351() {
        this.field714 = 1;
    }

    @ObfuscatedName("ai.v(Lnv;II)V")
    public final void method1341(class385 arg0, int arg1) {
        this.field712.method5127(arg0, arg1);
        this.field714 = 2;
        client.method2131();
    }

    @ObfuscatedName("ai.j(I)V")
    public final void method1344() {
        for (class322 var1 = (class322) this.field712.field3830.method4830(); var1 != null; var1 = (class322) this.field712.field3830.method4831()) {
            if ((long) var1.field3847 < class382.method2013() / 1000L - 5L) {
                if (var1.field3846 > 0) {
                    class85.method2228(5, "", var1.field3844 + class270.field3372);
                }
                if (var1.field3846 == 0) {
                    class85.method2228(5, "", var1.field3844 + class270.field3378);
                }
                var1.method5442();
            }
        }
    }

    @ObfuscatedName("ai.l(I)V")
    public final void method1345() {
        this.field714 = 0;
        this.field712.method5221();
        this.field713.method5221();
    }

    @ObfuscatedName("ai.n(Loh;ZI)Z")
    public final boolean method1346(class406 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field140.field980)) {
            return true;
        } else {
            return this.field712.method5130(arg0, arg1);
        }
    }

    @ObfuscatedName("ai.w(Loh;I)Z")
    public final boolean method1347(class406 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field713.method5243(arg0);
        }
    }

    @ObfuscatedName("ai.f(Ljava/lang/String;I)V")
    public final void method1348(String arg0) {
        if (arg0 == null) {
            return;
        }
        class406 var2 = new class406(arg0, this.field711);
        if (!var2.method6522()) {
            return;
        }
        if (this.method1359()) {
            method2848();
        } else if (Statics.field140.field980.equals(var2)) {
            method365(class270.field3400);
        } else if (this.method1346(var2, false)) {
            method365(arg0 + class270.field3397);
        } else if (this.method1347(var2)) {
            method365(class270.field3402 + arg0 + class270.field3403);
        } else {
            class229 var3 = class229.method2538(class227.field2565, client.field453.field1205);
            var3.field2691.method5941(class385.method4571(arg0));
            var3.field2691.method5948(arg0);
            client.field453.method1987(var3);
        }
    }

    @ObfuscatedName("i.o(Ljava/lang/String;B)V")
    public static final void method365(String arg0) {
        class85.method2228(30, "", arg0);
    }

    @ObfuscatedName("fz.x(I)V")
    public static final void method2848() {
        method365(class270.field3272);
    }

    @ObfuscatedName("ai.r(I)Z")
    public final boolean method1359() {
        return this.field712.method5282() || this.field712.method5235() >= 200 && client.field526 != 1;
    }

    @ObfuscatedName("ai.p(Ljava/lang/String;I)V")
    public final void method1406(String arg0) {
        if (arg0 == null) {
            return;
        }
        class406 var2 = new class406(arg0, this.field711);
        if (!var2.method6522()) {
            return;
        }
        if (this.method1350()) {
            method5112();
        } else if (Statics.field140.field980.equals(var2)) {
            method4399();
        } else if (this.method1347(var2)) {
            method365(arg0 + class270.field3399);
        } else if (this.method1346(var2, false)) {
            method365(class270.field3404 + arg0 + class270.field3509);
        } else {
            method5870(arg0);
        }
    }

    @ObfuscatedName("lj.h(B)V")
    public static final void method5112() {
        method365(class270.field3522);
    }

    @ObfuscatedName("jo.k(I)V")
    public static final void method4399() {
        method365(class270.field3401);
    }

    @ObfuscatedName("ni.a(Ljava/lang/String;B)V")
    public static final void method5870(String arg0) {
        class229 var1 = class229.method2538(class227.field2604, client.field453.field1205);
        var1.field2691.method5941(class385.method4571(arg0));
        var1.field2691.method5948(arg0);
        client.field453.method1987(var1);
    }

    @ObfuscatedName("ai.q(B)Z")
    public final boolean method1350() {
        return this.field713.method5282() || this.field713.method5235() >= 100 && client.field526 != 1;
    }

    @ObfuscatedName("ai.u(Ljava/lang/String;B)V")
    public final void method1352(String arg0) {
        if (arg0 == null) {
            return;
        }
        class406 var2 = new class406(arg0, this.field711);
        if (!var2.method6522()) {
            return;
        }
        if (this.field712.method5227(var2)) {
            client.field610 = client.field593;
            class229 var3 = class229.method2538(class227.field2637, client.field453.field1205);
            var3.field2691.method5941(class385.method4571(arg0));
            var3.field2691.method5948(arg0);
            client.field453.method1987(var3);
        }
        client.method2131();
    }

    @ObfuscatedName("ai.e(Ljava/lang/String;I)V")
    public final void method1392(String arg0) {
        if (arg0 == null) {
            return;
        }
        class406 var2 = new class406(arg0, this.field711);
        if (!var2.method6522()) {
            return;
        }
        if (this.field713.method5227(var2)) {
            client.method2273();
            class229 var3 = class229.method2538(class227.field2579, client.field453.field1205);
            var3.field2691.method5941(class385.method4571(arg0));
            var3.field2691.method5948(arg0);
            client.field453.method1987(var3);
        }
        client.method4341();
    }

    @ObfuscatedName("lc.c(Ljava/lang/String;II)V")
    public static final void method5176(String arg0, int arg1) {
        class229 var2 = class229.method2538(class227.field2588, client.field453.field1205);
        var2.field2691.method5941(class385.method4571(arg0) + 1);
        var2.field2691.method5948(arg0);
        var2.field2691.method5941(arg1);
        client.field453.method1987(var2);
    }

    @ObfuscatedName("ai.i(Loh;I)Z")
    public final boolean method1340(class406 arg0) {
        class321 var2 = (class321) this.field712.method5224(arg0);
        return var2 != null && var2.method5305();
    }
}

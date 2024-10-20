package deob;

@ObfuscatedName("ba")
public class class62 {

    @ObfuscatedName("ba.j")
    public final class383 field797;

    @ObfuscatedName("ba.m")
    public final class333 field796;

    @ObfuscatedName("ba.k")
    public final class331 field794;

    @ObfuscatedName("ba.t")
    public int field799 = 0;

    public class62(class383 arg0) {
        this.field797 = arg0;
        this.field796 = new class333(arg0);
        this.field794 = new class331(arg0);
    }

    @ObfuscatedName("ba.l(I)Z")
    public boolean method1563() {
        return this.field799 == 2;
    }

    @ObfuscatedName("ba.q(I)V")
    public final void method1564() {
        this.field799 = 1;
    }

    @ObfuscatedName("ba.f(Lot;II)V")
    public final void method1615(class401 arg0, int arg1) {
        this.field796.method5453(arg0, arg1);
        this.field799 = 2;
        client.method3647();
    }

    @ObfuscatedName("ba.j(S)V")
    public final void method1566() {
        for (class336 var1 = (class336) this.field796.field3939.method5143(); var1 != null; var1 = (class336) this.field796.field3939.method5146()) {
            if ((long) var1.field3953 < class398.method2299() / 1000L - 5L) {
                if (var1.field3951 > 0) {
                    class98.method5671(5, "", var1.field3952 + class283.field3486);
                }
                if (var1.field3951 == 0) {
                    class98.method5671(5, "", var1.field3952 + class283.field3487);
                }
                var1.method5769();
            }
        }
    }

    @ObfuscatedName("ba.m(I)V")
    public final void method1600() {
        this.field799 = 0;
        this.field796.method5583();
        this.field794.method5583();
    }

    @ObfuscatedName("ba.k(Lpm;ZI)Z")
    public final boolean method1568(class422 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field868.field1067)) {
            return true;
        } else {
            return this.field796.method5455(arg0, arg1);
        }
    }

    @ObfuscatedName("ba.t(Lpm;I)Z")
    public final boolean method1569(class422 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field794.method5539(arg0);
        }
    }

    @ObfuscatedName("ba.a(Ljava/lang/String;I)V")
    public final void method1570(String arg0) {
        if (arg0 == null) {
            return;
        }
        class422 var2 = new class422(arg0, this.field797);
        if (!var2.method6817()) {
            return;
        }
        if (this.method1571()) {
            method3559();
        } else if (Statics.field868.field1067.equals(var2)) {
            method4477();
        } else if (this.method1568(var2, false)) {
            method2839(arg0);
        } else if (this.method1569(var2)) {
            StringBuilder var10000 = new StringBuilder();
            class283 var10001 = (class283) null;
            StringBuilder var4 = var10000.append(class283.field3596).append(arg0);
            class283 var5 = (class283) null;
            String var3 = var4.append(class283.field3512).toString();
            class98.method5671(30, "", var3);
        } else {
            method3511(arg0);
        }
    }

    @ObfuscatedName("gq.e(B)V")
    public static final void method3559() {
        class283 var10000 = (class283) null;
        String var0 = class283.field3479;
        class98.method5671(30, "", var0);
    }

    @ObfuscatedName("fk.i(Ljava/lang/String;I)V")
    public static final void method2839(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class283 var10001 = (class283) null;
        String var1 = var10000.append(class283.field3506).toString();
        class98.method5671(30, "", var1);
    }

    @ObfuscatedName("ib.y(I)V")
    public static final void method4477() {
        class283 var10000 = (class283) null;
        String var0 = class283.field3335;
        class98.method5671(30, "", var0);
    }

    @ObfuscatedName("gs.w(Ljava/lang/String;I)V")
    public static final void method3511(String arg0) {
        class242 var1 = class242.method2075(class240.field2677, client.field639.field1287);
        var1.field2780.method6269(class401.method2370(arg0));
        var1.field2780.method6489(arg0);
        client.field639.method2246(var1);
    }

    @ObfuscatedName("ba.g(I)Z")
    public final boolean method1571() {
        return this.field796.method5582() || this.field796.method5564() >= 200 && client.field631 != 1;
    }

    @ObfuscatedName("ba.v(Ljava/lang/String;I)V")
    public final void method1572(String arg0) {
        if (arg0 == null) {
            return;
        }
        class422 var2 = new class422(arg0, this.field797);
        if (!var2.method6817()) {
            return;
        }
        if (this.method1602()) {
            method275();
        } else if (Statics.field868.field1067.equals(var2)) {
            class283 var7 = (class283) null;
            String var3 = class283.field3510;
            class98.method5671(30, "", var3);
        } else {
            StringBuilder var10000;
            class283 var10001;
            if (this.method1569(var2)) {
                var10000 = (new StringBuilder()).append(arg0);
                var10001 = (class283) null;
                String var4 = var10000.append(class283.field3508).toString();
                class98.method5671(30, "", var4);
            } else if (this.method1568(var2, false)) {
                var10000 = new StringBuilder();
                var10001 = (class283) null;
                StringBuilder var6 = var10000.append(class283.field3513).append(arg0);
                class283 var8 = (class283) null;
                String var5 = var6.append(class283.field3559).toString();
                class98.method5671(30, "", var5);
            } else {
                method2056(arg0);
            }
        }
    }

    @ObfuscatedName("p.s(I)V")
    public static final void method275() {
        class283 var10000 = (class283) null;
        String var0 = class283.field3507;
        class98.method5671(30, "", var0);
    }

    @ObfuscatedName("cd.c(Ljava/lang/String;I)V")
    public static final void method2056(String arg0) {
        class242 var1 = class242.method2075(class240.field2726, client.field639.field1287);
        var1.field2780.method6269(class401.method2370(arg0));
        var1.field2780.method6489(arg0);
        client.field639.method2246(var1);
    }

    @ObfuscatedName("ba.b(I)Z")
    public final boolean method1602() {
        return this.field794.method5582() || this.field794.method5564() >= 100 && client.field631 != 1;
    }

    @ObfuscatedName("ba.x(Ljava/lang/String;I)V")
    public final void method1574(String arg0) {
        if (arg0 == null) {
            return;
        }
        class422 var2 = new class422(arg0, this.field797);
        if (!var2.method6817()) {
            return;
        }
        if (this.field796.method5543(var2)) {
            client.method2733();
            class242 var3 = class242.method2075(class240.field2688, client.field639.field1287);
            var3.field2780.method6269(class401.method2370(arg0));
            var3.field2780.method6489(arg0);
            client.field639.method2246(var3);
        }
        client.method3647();
    }

    @ObfuscatedName("ba.p(Ljava/lang/String;B)V")
    public final void method1575(String arg0) {
        if (arg0 == null) {
            return;
        }
        class422 var2 = new class422(arg0, this.field797);
        if (!var2.method6817()) {
            return;
        }
        if (this.field794.method5543(var2)) {
            client.method2733();
            class242 var3 = class242.method2075(class240.field2747, client.field639.field1287);
            var3.field2780.method6269(class401.method2370(arg0));
            var3.field2780.method6489(arg0);
            client.field639.method2246(var3);
        }
        client.method4182();
    }

    @ObfuscatedName("b.z(Ljava/lang/String;II)V")
    public static final void method200(String arg0, int arg1) {
        class242 var2 = class242.method2075(class240.field2666, client.field639.field1287);
        var2.field2780.method6269(class401.method2370(arg0) + 1);
        var2.field2780.method6489(arg0);
        var2.field2780.method6442(arg1);
        client.field639.method2246(var2);
    }

    @ObfuscatedName("ba.h(Lpm;I)Z")
    public final boolean method1618(class422 arg0) {
        class335 var2 = (class335) this.field796.method5540(arg0);
        return var2 != null && var2.method5612();
    }
}

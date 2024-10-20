package deob;

@ObfuscatedName("bj")
public class class62 {

    @ObfuscatedName("bj.k")
    public final class382 field788;

    @ObfuscatedName("bj.o")
    public final class332 field792;

    @ObfuscatedName("bj.g")
    public final class330 field791;

    @ObfuscatedName("bj.z")
    public int field794 = 0;

    public class62(class382 arg0) {
        this.field788 = arg0;
        this.field792 = new class332(arg0);
        this.field791 = new class330(arg0);
    }

    @ObfuscatedName("bj.n(I)Z")
    public boolean method1584() {
        return this.field794 == 2;
    }

    @ObfuscatedName("bj.c(B)V")
    public final void method1566() {
        this.field794 = 1;
    }

    @ObfuscatedName("bj.m(Lot;II)V")
    public final void method1578(class400 arg0, int arg1) {
        this.field792.method5385(arg0, arg1);
        this.field794 = 2;
        for (int var3 = 0; var3 < class96.field1257; var3++) {
            class83 var4 = client.field605[class96.field1249[var3]];
            var4.method1960();
        }
        class98.method270();
        if (Statics.field1010 != null) {
            Statics.field1010.method5395();
        }
    }

    @ObfuscatedName("bj.k(B)V")
    public final void method1568() {
        for (class335 var1 = (class335) this.field792.field3921.method5076(); var1 != null; var1 = (class335) this.field792.field3921.method5081()) {
            if ((long) var1.field3944 < class397.method3986() / 1000L - 5L) {
                if (var1.field3942 > 0) {
                    class98.method1908(5, "", var1.field3941 + class283.field3386);
                }
                if (var1.field3942 == 0) {
                    class98.method1908(5, "", var1.field3941 + class283.field3492);
                }
                var1.method5725();
            }
        }
    }

    @ObfuscatedName("bj.o(B)V")
    public final void method1569() {
        this.field794 = 0;
        this.field792.method5486();
        this.field791.method5486();
    }

    @ObfuscatedName("bj.g(Lpp;ZI)Z")
    public final boolean method1570(class421 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1485.field1070)) {
            return true;
        } else {
            return this.field792.method5386(arg0, arg1);
        }
    }

    @ObfuscatedName("bj.z(Lpp;B)Z")
    public final boolean method1571(class421 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field791.method5489(arg0);
        }
    }

    @ObfuscatedName("bj.a(Ljava/lang/String;B)V")
    public final void method1577(String arg0) {
        if (arg0 == null) {
            return;
        }
        class421 var2 = new class421(arg0, this.field788);
        if (!var2.method6781()) {
            return;
        }
        if (this.method1573()) {
            method4633(class283.field3510);
        } else if (Statics.field1485.field1070.equals(var2)) {
            method4633(class283.field3565);
        } else if (this.method1570(var2, false)) {
            method4633(arg0 + class283.field3404);
        } else if (this.method1571(var2)) {
            method4633(class283.field3349 + arg0 + class283.field3517);
        } else {
            method4196(arg0);
        }
    }

    @ObfuscatedName("jn.u(Ljava/lang/String;I)V")
    public static final void method4633(String arg0) {
        class98.method1908(30, "", arg0);
    }

    @ObfuscatedName("ie.e(Ljava/lang/String;B)V")
    public static final void method4196(String arg0) {
        class242 var1 = Statics.method1576(class240.field2693, client.field535.field1282);
        var1.field2767.method6200(class400.method5614(arg0));
        var1.field2767.method6242(arg0);
        client.field535.method2211(var1);
    }

    @ObfuscatedName("bj.l(I)Z")
    public final boolean method1573() {
        return this.field792.method5488() || this.field792.method5504() >= 200 && client.field609 != 1;
    }

    @ObfuscatedName("bj.y(Ljava/lang/String;I)V")
    public final void method1565(String arg0) {
        if (arg0 == null) {
            return;
        }
        class421 var2 = new class421(arg0, this.field788);
        if (!var2.method6781()) {
            return;
        }
        if (this.method1567()) {
            method5699();
        } else if (Statics.field1485.field1070.equals(var2)) {
            method4633(class283.field3475);
        } else if (this.method1571(var2)) {
            method4633(arg0 + class283.field3431);
        } else if (this.method1570(var2, false)) {
            method4633(class283.field3456 + arg0 + class283.field3519);
        } else {
            method4012(arg0);
        }
    }

    @ObfuscatedName("mf.v(B)V")
    public static final void method5699() {
        method4633(class283.field3512);
    }

    @ObfuscatedName("hp.f(Ljava/lang/String;I)V")
    public static final void method4012(String arg0) {
        class242 var1 = Statics.method1576(class240.field2646, client.field535.field1282);
        var1.field2767.method6200(class400.method5614(arg0));
        var1.field2767.method6242(arg0);
        client.field535.method2211(var1);
    }

    @ObfuscatedName("bj.s(I)Z")
    public final boolean method1567() {
        return this.field791.method5488() || this.field791.method5504() >= 100 && client.field609 != 1;
    }

    @ObfuscatedName("bj.h(Ljava/lang/String;I)V")
    public final void method1588(String arg0) {
        if (arg0 == null) {
            return;
        }
        class421 var2 = new class421(arg0, this.field788);
        if (!var2.method6781()) {
            return;
        }
        if (this.field792.method5528(var2)) {
            client.method979();
            class242 var3 = Statics.method1576(class240.field2696, client.field535.field1282);
            var3.field2767.method6200(class400.method5614(arg0));
            var3.field2767.method6242(arg0);
            client.field535.method2211(var3);
        }
        for (int var4 = 0; var4 < class96.field1257; var4++) {
            class83 var5 = client.field605[class96.field1249[var4]];
            var5.method1960();
        }
        class98.method270();
        if (Statics.field1010 != null) {
            Statics.field1010.method5395();
        }
    }

    @ObfuscatedName("bj.d(Ljava/lang/String;I)V")
    public final void method1620(String arg0) {
        if (arg0 == null) {
            return;
        }
        class421 var2 = new class421(arg0, this.field788);
        if (!var2.method6781()) {
            return;
        }
        if (this.field791.method5528(var2)) {
            client.method979();
            class242 var3 = Statics.method1576(class240.field2668, client.field535.field1282);
            var3.field2767.method6200(class400.method5614(arg0));
            var3.field2767.method6242(arg0);
            client.field535.method2211(var3);
        }
        client.method3546();
    }

    @ObfuscatedName("hw.q(Ljava/lang/String;IB)V")
    public static final void method4125(String arg0, int arg1) {
        class242 var2 = Statics.method1576(class240.field2698, client.field535.field1282);
        var2.field2767.method6200(class400.method5614(arg0) + 1);
        var2.field2767.method6242(arg0);
        var2.field2767.method6221(arg1);
        client.field535.method2211(var2);
    }

    @ObfuscatedName("bj.j(Lpp;I)Z")
    public final boolean method1579(class421 arg0) {
        class334 var2 = (class334) this.field792.method5548(arg0);
        return var2 != null && var2.method5561();
    }
}

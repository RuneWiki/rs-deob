package deob;

import java.util.Iterator;

@ObfuscatedName("ba")
public class class66 {

    @ObfuscatedName("ba.x")
    public final class444 field813;

    @ObfuscatedName("ba.h")
    public final class386 field818;

    @ObfuscatedName("ba.j")
    public final class384 field814;

    @ObfuscatedName("ba.y")
    public int field815 = 0;

    public class66(class444 arg0) {
        this.field813 = arg0;
        this.field818 = new class386(arg0);
        this.field814 = new class384(arg0);
    }

    @ObfuscatedName("ba.a(I)Z")
    public boolean method1735() {
        return this.field815 == 2;
    }

    @ObfuscatedName("ba.f(I)V")
    public final void method1759() {
        this.field815 = 1;
    }

    @ObfuscatedName("ba.c(Lqr;II)V")
    public final void method1696(class464 arg0, int arg1) {
        this.field818.method6661(arg0, arg1);
        this.field815 = 2;
        for (int var3 = 0; var3 < class103.field1317; var3++) {
            class89 var4 = client.field621[class103.field1318[var3]];
            var4.method2168();
        }
        Iterator var5 = class106.field1361.iterator();
        while (var5.hasNext()) {
            class62 var6 = (class62) var5.next();
            var6.method1079();
        }
        if (Statics.field889 != null) {
            Statics.field889.method6671();
        }
    }

    @ObfuscatedName("ba.x(B)V")
    public final void method1697() {
        for (class389 var1 = (class389) this.field818.field4462.method6156(); var1 != null; var1 = (class389) this.field818.field4462.method6153()) {
            if ((long) var1.field4478 < class280.method2629() / 1000L - 5L) {
                if (var1.field4477 > 0) {
                    Statics.method666(5, "", var1.field4476 + class323.field3817);
                }
                if (var1.field4477 == 0) {
                    Statics.method666(5, "", var1.field4476 + class323.field3927);
                }
                var1.method7165();
            }
        }
    }

    @ObfuscatedName("ba.h(B)V")
    public final void method1698() {
        this.field815 = 0;
        this.field818.method6756();
        this.field814.method6756();
    }

    @ObfuscatedName("ba.j(Lrg;ZI)Z")
    public final boolean method1721(class486 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field3404.field1108)) {
            return true;
        } else {
            return this.field818.method6660(arg0, arg1);
        }
    }

    @ObfuscatedName("ba.y(Lrg;I)Z")
    public final boolean method1699(class486 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field814.method6823(arg0);
        }
    }

    @ObfuscatedName("ba.d(Ljava/lang/String;S)V")
    public final void method1700(String arg0) {
        if (arg0 == null) {
            return;
        }
        class486 var2 = new class486(arg0, this.field813);
        if (!var2.method8296()) {
            return;
        }
        if (this.method1748()) {
            method2613();
        } else if (Statics.field3404.field1108.equals(var2)) {
            method96(class323.field3799);
        } else if (this.method1721(var2, false)) {
            method2620(arg0);
        } else if (this.method1699(var2)) {
            method4924(arg0);
        } else {
            method833(arg0);
        }
    }

    @ObfuscatedName("s.n(Ljava/lang/String;I)V")
    public static final void method96(String arg0) {
        Statics.method666(30, "", arg0);
    }

    @ObfuscatedName("dt.r(I)V")
    public static final void method2613() {
        method96(class323.field3910);
    }

    @ObfuscatedName("dt.l(Ljava/lang/String;I)V")
    public static final void method2620(String arg0) {
        method96(arg0 + class323.field3946);
    }

    @ObfuscatedName("jz.s(Ljava/lang/String;I)V")
    public static final void method4924(String arg0) {
        method96(class323.field3951 + arg0 + class323.field3952);
    }

    @ObfuscatedName("au.p(Ljava/lang/String;I)V")
    public static final void method833(String arg0) {
        class275 var1 = class275.method3314(class273.field3032, client.field636.field1373);
        var1.field3123.method7698(class464.method2236(arg0));
        var1.field3123.method7705(arg0);
        client.field636.method2540(var1);
    }

    @ObfuscatedName("ba.b(B)Z")
    public final boolean method1748() {
        return this.field818.method6793() || this.field818.method6803() >= 200 && client.field779 != 1;
    }

    @ObfuscatedName("ba.o(Ljava/lang/String;I)V")
    public final void method1702(String arg0) {
        if (arg0 == null) {
            return;
        }
        class486 var2 = new class486(arg0, this.field813);
        if (!var2.method8296()) {
            return;
        }
        if (this.method1703()) {
            method96(class323.field3947);
        } else if (Statics.field3404.field1108.equals(var2)) {
            method96(class323.field4052);
        } else if (this.method1699(var2)) {
            method6925(arg0);
        } else if (this.method1721(var2, false)) {
            method2251(arg0);
        } else {
            class275 var3 = class275.method3314(class273.field3086, client.field636.field1373);
            var3.field3123.method7698(class464.method2236(arg0));
            var3.field3123.method7705(arg0);
            client.field636.method2540(var3);
        }
    }

    @ObfuscatedName("om.u(Ljava/lang/String;I)V")
    public static final void method6925(String arg0) {
        method96(arg0 + class323.field3955);
    }

    @ObfuscatedName("ch.z(Ljava/lang/String;I)V")
    public static final void method2251(String arg0) {
        method96(class323.field3953 + arg0 + class323.field3954);
    }

    @ObfuscatedName("ba.t(I)Z")
    public final boolean method1703() {
        return this.field814.method6793() || this.field814.method6803() >= 100 && client.field779 != 1;
    }

    @ObfuscatedName("ba.w(Ljava/lang/String;I)V")
    public final void method1719(String arg0) {
        if (arg0 == null) {
            return;
        }
        class486 var2 = new class486(arg0, this.field813);
        if (!var2.method8296()) {
            return;
        }
        if (this.field818.method6763(var2)) {
            client.field702 = client.field736;
            class275 var3 = class275.method3314(class273.field3087, client.field636.field1373);
            var3.field3123.method7698(class464.method2236(arg0));
            var3.field3123.method7705(arg0);
            client.field636.method2540(var3);
        }
        for (int var4 = 0; var4 < class103.field1317; var4++) {
            class89 var5 = client.field621[class103.field1318[var4]];
            var5.method2168();
        }
        Iterator var6 = class106.field1361.iterator();
        while (var6.hasNext()) {
            class62 var7 = (class62) var6.next();
            var7.method1079();
        }
        if (Statics.field889 != null) {
            Statics.field889.method6671();
        }
    }

    @ObfuscatedName("ba.m(Ljava/lang/String;I)V")
    public final void method1705(String arg0) {
        if (arg0 == null) {
            return;
        }
        class486 var2 = new class486(arg0, this.field813);
        if (!var2.method8296()) {
            return;
        }
        if (this.field814.method6763(var2)) {
            client.field702 = client.field736;
            class275 var3 = class275.method3314(class273.field3060, client.field636.field1373);
            var3.field3123.method7698(class464.method2236(arg0));
            var3.field3123.method7705(arg0);
            client.field636.method2540(var3);
        }
        client.method7424();
    }

    @ObfuscatedName("fz.q(Ljava/lang/String;IB)V")
    public static final void method3169(String arg0, int arg1) {
        class275 var2 = class275.method3314(class273.field3075, client.field636.field1373);
        var2.field3123.method7698(class464.method2236(arg0) + 1);
        var2.field3123.method7858(arg1);
        var2.field3123.method7705(arg0);
        client.field636.method2540(var2);
    }

    @ObfuscatedName("ba.i(Lrg;I)Z")
    public final boolean method1706(class486 arg0) {
        class388 var2 = (class388) this.field818.method6760(arg0);
        return var2 != null && var2.method6835();
    }
}

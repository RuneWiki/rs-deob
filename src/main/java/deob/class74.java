package deob;

import java.util.Iterator;

@ObfuscatedName("bc")
public class class74 {

    @ObfuscatedName("bc.x")
    public final class335 field1044;

    @ObfuscatedName("bc.h")
    public final class297 field1045;

    @ObfuscatedName("bc.f")
    public final class291 field1046;

    @ObfuscatedName("bc.p")
    public int field1041 = 0;

    public class74(class335 arg0) {
        this.field1044 = arg0;
        this.field1045 = new class297(arg0);
        this.field1046 = new class291(arg0);
    }

    @ObfuscatedName("bc.a(I)Z")
    public boolean method1683() {
        return this.field1041 == 2;
    }

    @ObfuscatedName("bc.s(B)V")
    public final void method1684() {
        this.field1041 = 1;
    }

    @ObfuscatedName("bc.g(Lgx;IB)V")
    public final void method1685(class190 arg0, int arg1) {
        this.field1045.method5230(arg0, arg1);
        this.field1041 = 2;
        for (int var3 = 0; var3 < class89.field1247; var3++) {
            class67 var4 = client.field766[class89.field1244[var3]];
            var4.method1134();
        }
        Iterator var5 = class91.field1261.iterator();
        while (var5.hasNext()) {
            class65 var6 = (class65) var5.next();
            var6.method1075();
        }
        if (Statics.field366 != null) {
            Statics.field366.method5275();
        }
    }

    @ObfuscatedName("bc.x(I)V")
    public final void method1686() {
        for (class301 var1 = (class301) this.field1045.field3726.method4004(); var1 != null; var1 = (class301) this.field1045.field3726.method4000()) {
            if ((long) var1.field3744 < class192.method183() / 1000L - 5L) {
                if (var1.field3743 > 0) {
                    class91.method696(5, "", var1.field3742 + class246.field3028);
                }
                if (var1.field3743 == 0) {
                    class91.method696(5, "", var1.field3742 + class246.field3029);
                }
                var1.method4010();
            }
        }
    }

    @ObfuscatedName("bc.h(B)V")
    public final void method1730() {
        this.field1041 = 0;
        this.field1045.method5200();
        this.field1046.method5200();
    }

    @ObfuscatedName("bc.f(Lkx;ZB)Z")
    public final boolean method1688(class298 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field187.field619)) {
            return true;
        } else {
            return this.field1045.method5235(arg0, arg1);
        }
    }

    @ObfuscatedName("bc.p(Lkx;I)Z")
    public final boolean method1689(class298 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1046.method5151(arg0);
        }
    }

    @ObfuscatedName("bc.m(Ljava/lang/String;B)V")
    public final void method1690(String arg0) {
        if (arg0 == null) {
            return;
        }
        class298 var2 = new class298(arg0, this.field1044);
        if (!var2.method5238()) {
            return;
        }
        if (this.method1682()) {
            method4176();
        } else if (Statics.field187.field619.equals(var2)) {
            method144();
        } else if (this.method1688(var2, false)) {
            method1172(arg0);
        } else if (this.method1689(var2)) {
            method278(arg0);
        } else {
            method1676(arg0);
        }
    }

    @ObfuscatedName("r.q(Ljava/lang/String;I)V")
    public static final void method147(String arg0) {
        class91.method696(30, "", arg0);
    }

    @ObfuscatedName("hn.b(I)V")
    public static final void method4176() {
        method147(class246.field3161);
    }

    @ObfuscatedName("bh.n(Ljava/lang/String;I)V")
    public static final void method1172(String arg0) {
        method147(arg0 + class246.field3151);
    }

    @ObfuscatedName("i.e(Ljava/lang/String;I)V")
    public static final void method278(String arg0) {
        method147(class246.field3067 + arg0 + class246.field3054);
    }

    @ObfuscatedName("e.r(B)V")
    public static final void method144() {
        method147(class246.field3110);
    }

    @ObfuscatedName("bt.t(Ljava/lang/String;I)V")
    public static final void method1676(String arg0) {
        class180 var1 = class180.method625(class177.field2229, client.field695.field1308);
        var1.field2350.method3439(class190.method1171(arg0));
        var1.field2350.method3446(arg0);
        client.field695.method2097(var1);
    }

    @ObfuscatedName("bc.l(B)Z")
    public final boolean method1682() {
        return this.field1045.method5141() || this.field1045.method5140() >= 200 && client.field768 != 1;
    }

    @ObfuscatedName("bc.o(Ljava/lang/String;I)V")
    public final void method1726(String arg0) {
        if (arg0 == null) {
            return;
        }
        class298 var2 = new class298(arg0, this.field1044);
        if (!var2.method5238()) {
            return;
        }
        if (this.method1692()) {
            Statics.method258();
        } else if (Statics.field187.field619.equals(var2)) {
            method4418();
        } else if (this.method1689(var2)) {
            method147(arg0 + class246.field3050);
        } else if (this.method1688(var2, false)) {
            method513(arg0);
        } else {
            class180 var3 = class180.method625(class177.field2310, client.field695.field1308);
            var3.field2350.method3439(class190.method1171(arg0));
            var3.field2350.method3446(arg0);
            client.field695.method2097(var3);
        }
    }

    @ObfuscatedName("ah.y(Ljava/lang/String;I)V")
    public static final void method513(String arg0) {
        method147(class246.field3055 + arg0 + class246.field3056);
    }

    @ObfuscatedName("ig.k(I)V")
    public static final void method4418() {
        method147(class246.field2929);
    }

    @ObfuscatedName("bc.v(I)Z")
    public final boolean method1692() {
        return this.field1046.method5141() || this.field1046.method5140() >= 100 && client.field768 != 1;
    }

    @ObfuscatedName("bc.c(Ljava/lang/String;I)V")
    public final void method1716(String arg0) {
        if (arg0 == null) {
            return;
        }
        class298 var2 = new class298(arg0, this.field1044);
        if (!var2.method5238()) {
            return;
        }
        if (this.field1045.method5146(var2)) {
            client.method520();
            class180 var3 = class180.method625(class177.field2274, client.field695.field1308);
            var3.field2350.method3439(class190.method1171(arg0));
            var3.field2350.method3446(arg0);
            client.field695.method2097(var3);
        }
        for (int var4 = 0; var4 < class89.field1247; var4++) {
            class67 var5 = client.field766[class89.field1244[var4]];
            var5.method1134();
        }
        Iterator var6 = class91.field1261.iterator();
        while (var6.hasNext()) {
            class65 var7 = (class65) var6.next();
            var7.method1075();
        }
        if (Statics.field366 != null) {
            Statics.field366.method5275();
        }
    }

    @ObfuscatedName("bc.aa(Ljava/lang/String;S)V")
    public final void method1694(String arg0) {
        if (arg0 == null) {
            return;
        }
        class298 var2 = new class298(arg0, this.field1044);
        if (!var2.method5238()) {
            return;
        }
        if (this.field1046.method5146(var2)) {
            client.method520();
            class180 var3 = class180.method625(class177.field2248, client.field695.field1308);
            var3.field2350.method3439(class190.method1171(arg0));
            var3.field2350.method3446(arg0);
            client.field695.method2097(var3);
        }
        client.method26();
    }

    @ObfuscatedName("ek.ab(Ljava/lang/String;IS)V")
    public static final void method3059(String arg0, int arg1) {
        class180 var2 = class180.method625(class177.field2297, client.field695.field1308);
        var2.field2350.method3439(class190.method1171(arg0) + 1);
        var2.field2350.method3446(arg0);
        var2.field2350.method3439(arg1);
        client.field695.method2097(var2);
    }

    @ObfuscatedName("bc.ah(Lkx;B)Z")
    public final boolean method1696(class298 arg0) {
        class299 var2 = (class299) this.field1045.method5143(arg0);
        return var2 != null && var2.method5227();
    }
}

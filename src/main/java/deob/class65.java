package deob;

import java.util.Iterator;

@ObfuscatedName("bt")
public class class65 {

    @ObfuscatedName("bt.s")
    public final class454 field828;

    @ObfuscatedName("bt.z")
    public final class396 field829;

    @ObfuscatedName("bt.j")
    public final class394 field826;

    @ObfuscatedName("bt.i")
    public int field825 = 0;

    public class65(class454 arg0) {
        this.field828 = arg0;
        this.field829 = new class396(arg0);
        this.field826 = new class394(arg0);
    }

    @ObfuscatedName("bt.f(S)Z")
    public boolean method1817() {
        return this.field825 == 2;
    }

    @ObfuscatedName("bt.w(S)V")
    public final void method1766() {
        this.field825 = 1;
    }

    @ObfuscatedName("bt.v(Lrd;IB)V")
    public final void method1746(class474 arg0, int arg1) {
        this.field829.method6956(arg0, arg1);
        this.field825 = 2;
        for (int var3 = 0; var3 < class103.field1343; var3++) {
            class88 var4 = client.field621[class103.field1350[var3]];
            var4.method2289();
        }
        Iterator var5 = class106.field1381.iterator();
        while (var5.hasNext()) {
            class61 var6 = (class61) var5.next();
            var6.method1092();
        }
        if (Statics.field4903 != null) {
            Statics.field4903.method6980();
        }
    }

    @ObfuscatedName("bt.s(B)V")
    public final void method1753() {
        for (class399 var1 = (class399) this.field829.field4540.method6358(); var1 != null; var1 = (class399) this.field829.field4540.method6354()) {
            if ((long) var1.field4557 < class287.method3099() / 1000L - 5L) {
                if (var1.field4555 > 0) {
                    class106.method5047(5, "", var1.field4556 + class330.field3999);
                }
                if (var1.field4555 == 0) {
                    class106.method5047(5, "", var1.field4556 + class330.field4047);
                }
                var1.method7428();
            }
        }
    }

    @ObfuscatedName("bt.z(S)V")
    public final void method1748() {
        this.field825 = 0;
        this.field829.method7050();
        this.field826.method7050();
    }

    @ObfuscatedName("bt.j(Lsi;ZI)Z")
    public final boolean method1749(class497 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field4508.field1115)) {
            return true;
        } else {
            return this.field829.method6955(arg0, arg1);
        }
    }

    @ObfuscatedName("bt.i(Lsi;B)Z")
    public final boolean method1750(class497 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field826.method7053(arg0);
        }
    }

    @ObfuscatedName("bt.n(Ljava/lang/String;I)V")
    public final void method1751(String arg0) {
        if (arg0 == null) {
            return;
        }
        class497 var2 = new class497(arg0, this.field828);
        if (!var2.method8558()) {
            return;
        }
        if (this.method1795()) {
            method1813();
        } else if (Statics.field4508.field1115.equals(var2)) {
            method2833();
        } else if (this.method1749(var2, false)) {
            method1048(arg0 + class330.field4019);
        } else if (this.method1750(var2)) {
            method47(arg0);
        } else {
            method3334(arg0);
        }
    }

    @ObfuscatedName("br.l(Ljava/lang/String;I)V")
    public static final void method1048(String arg0) {
        class106.method5047(30, "", arg0);
    }

    @ObfuscatedName("bt.k(I)V")
    public static final void method1813() {
        method1048(class330.field4018);
    }

    @ObfuscatedName("i.c(Ljava/lang/String;B)V")
    public static final void method47(String arg0) {
        method1048(class330.field4024 + arg0 + class330.field4025);
    }

    @ObfuscatedName("dh.r(I)V")
    public static final void method2833() {
        method1048(class330.field4022);
    }

    @ObfuscatedName("gk.b(Ljava/lang/String;I)V")
    public static final void method3334(String arg0) {
        class282 var1 = class282.method4287(class280.field3134, client.field689.field1390);
        var1.field3187.method7947(class474.method2557(arg0));
        var1.field3187.method7954(arg0);
        client.field689.method2694(var1);
    }

    @ObfuscatedName("bt.m(I)Z")
    public final boolean method1795() {
        return this.field829.method7101() || this.field829.method7052() >= 200 && client.field631 != 1;
    }

    @ObfuscatedName("bt.t(Ljava/lang/String;I)V")
    public final void method1811(String arg0) {
        if (arg0 == null) {
            return;
        }
        class497 var2 = new class497(arg0, this.field828);
        if (!var2.method8558()) {
            return;
        }
        if (this.method1754()) {
            method3876();
        } else if (Statics.field4508.field1115.equals(var2)) {
            method2111();
        } else if (this.method1750(var2)) {
            method464(arg0);
        } else if (this.method1749(var2, false)) {
            method2803(arg0);
        } else {
            method6804(arg0);
        }
    }

    @ObfuscatedName("gt.h(I)V")
    public static final void method3876() {
        method1048(class330.field4020);
    }

    @ObfuscatedName("ar.p(Ljava/lang/String;I)V")
    public static final void method464(String arg0) {
        method1048(arg0 + class330.field3848);
    }

    @ObfuscatedName("do.o(Ljava/lang/String;I)V")
    public static final void method2803(String arg0) {
        method1048(class330.field4026 + arg0 + class330.field4027);
    }

    @ObfuscatedName("bx.u(B)V")
    public static final void method2111() {
        method1048(class330.field4023);
    }

    @ObfuscatedName("ny.x(Ljava/lang/String;I)V")
    public static final void method6804(String arg0) {
        class282 var1 = class282.method4287(class280.field3068, client.field689.field1390);
        var1.field3187.method7947(class474.method2557(arg0));
        var1.field3187.method7954(arg0);
        client.field689.method2694(var1);
    }

    @ObfuscatedName("bt.a(I)Z")
    public final boolean method1754() {
        return this.field826.method7101() || this.field826.method7052() >= 100 && client.field631 != 1;
    }

    @ObfuscatedName("bt.q(Ljava/lang/String;I)V")
    public final void method1755(String arg0) {
        if (arg0 == null) {
            return;
        }
        class497 var2 = new class497(arg0, this.field828);
        if (!var2.method8558()) {
            return;
        }
        if (this.field829.method7057(var2)) {
            client.method2786();
            class282 var3 = class282.method4287(class280.field3152, client.field689.field1390);
            var3.field3187.method7947(class474.method2557(arg0));
            var3.field3187.method7954(arg0);
            client.field689.method2694(var3);
        }
        for (int var4 = 0; var4 < class103.field1343; var4++) {
            class88 var5 = client.field621[class103.field1350[var4]];
            var5.method2289();
        }
        Iterator var6 = class106.field1381.iterator();
        while (var6.hasNext()) {
            class61 var7 = (class61) var6.next();
            var7.method1092();
        }
        if (Statics.field4903 != null) {
            Statics.field4903.method6980();
        }
    }

    @ObfuscatedName("bt.d(Ljava/lang/String;I)V")
    public final void method1756(String arg0) {
        if (arg0 == null) {
            return;
        }
        class497 var2 = new class497(arg0, this.field828);
        if (!var2.method8558()) {
            return;
        }
        if (this.field826.method7057(var2)) {
            client.method2786();
            class282 var3 = class282.method4287(class280.field3123, client.field689.field1390);
            var3.field3187.method7947(class474.method2557(arg0));
            var3.field3187.method7954(arg0);
            client.field689.method2694(var3);
        }
        client.method7668();
    }

    @ObfuscatedName("nz.e(Ljava/lang/String;II)V")
    public static final void method6836(String arg0, int arg1) {
        class282 var2 = class282.method4287(class280.field3115, client.field689.field1390);
        var2.field3187.method7947(class474.method2557(arg0) + 1);
        var2.field3187.method8085(arg1);
        var2.field3187.method7954(arg0);
        client.field689.method2694(var2);
    }

    @ObfuscatedName("bt.g(Lsi;B)Z")
    public final boolean method1744(class497 arg0) {
        class398 var2 = (class398) this.field829.method7054(arg0);
        return var2 != null && var2.method7142();
    }
}

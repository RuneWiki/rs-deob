package deob;

@ObfuscatedName("br")
public class class62 {

    @ObfuscatedName("br.n")
    public final class425 field812;

    @ObfuscatedName("br.k")
    public final class368 field813;

    @ObfuscatedName("br.w")
    public final class366 field811;

    @ObfuscatedName("br.s")
    public int field815 = 0;

    public class62(class425 arg0) {
        this.field812 = arg0;
        this.field813 = new class368(arg0);
        this.field811 = new class366(arg0);
    }

    @ObfuscatedName("br.c(I)Z")
    public boolean method1695() {
        return this.field815 == 2;
    }

    @ObfuscatedName("br.p(B)V")
    public final void method1696() {
        this.field815 = 1;
    }

    @ObfuscatedName("br.f(Lqq;II)V")
    public final void method1697(class445 arg0, int arg1) {
        this.field813.method6164(arg0, arg1);
        this.field815 = 2;
        client.method1922();
    }

    @ObfuscatedName("br.n(B)V")
    public final void method1701() {
        for (class371 var1 = (class371) this.field813.field4331.method5774(); var1 != null; var1 = (class371) this.field813.field4331.method5781()) {
            if ((long) var1.field4347 < class271.method5624() / 1000L - 5L) {
                if (var1.field4348 > 0) {
                    class100.method1932(5, "", var1.field4346 + class310.field3846);
                }
                if (var1.field4348 == 0) {
                    class100.method1932(5, "", var1.field4346 + class310.field3816);
                }
                var1.method6649();
            }
        }
    }

    @ObfuscatedName("br.k(I)V")
    public final void method1699() {
        this.field815 = 0;
        this.field813.method6265();
        this.field811.method6265();
    }

    @ObfuscatedName("br.w(Lqo;ZI)Z")
    public final boolean method1746(class466 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field890.field1109)) {
            return true;
        } else {
            return this.field813.method6165(arg0, arg1);
        }
    }

    @ObfuscatedName("br.s(Lqo;I)Z")
    public final boolean method1711(class466 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field811.method6248(arg0);
        }
    }

    @ObfuscatedName("br.q(Ljava/lang/String;I)V")
    public final void method1702(String arg0) {
        if (arg0 == null) {
            return;
        }
        class466 var2 = new class466(arg0, this.field812);
        if (!var2.method7784()) {
            return;
        }
        if (this.method1703()) {
            class310 var6 = (class310) null;
            String var3 = class310.field3834;
            class100.method1932(30, "", var3);
        } else if (Statics.field890.field1109.equals(var2)) {
            method2733();
        } else if (this.method1746(var2, false)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class310 var10001 = (class310) null;
            String var4 = var10000.append(class310.field3835).toString();
            class100.method1932(30, "", var4);
        } else if (this.method1711(var2)) {
            Statics.method2292(arg0);
        } else {
            class266 var5 = Statics.method2786(class264.field3031, client.field552.field1342);
            var5.field3064.method7179(class445.method6110(arg0));
            var5.field3064.method7186(arg0);
            client.field552.method2534(var5);
        }
    }

    @ObfuscatedName("dj.x(I)V")
    public static final void method2733() {
        class310 var10000 = (class310) null;
        String var0 = class310.field3838;
        class100.method1932(30, "", var0);
    }

    @ObfuscatedName("br.j(B)Z")
    public final boolean method1703() {
        return this.field813.method6247() || this.field813.method6246() >= 200 && client.field622 != 1;
    }

    @ObfuscatedName("br.v(Ljava/lang/String;I)V")
    public final void method1704(String arg0) {
        if (arg0 == null) {
            return;
        }
        class466 var2 = new class466(arg0, this.field812);
        if (!var2.method7784()) {
            return;
        }
        if (this.method1743()) {
            method4619();
        } else if (Statics.field890.field1109.equals(var2)) {
            method2619();
        } else if (this.method1711(var2)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class310 var10001 = (class310) null;
            String var3 = var10000.append(class310.field3837).toString();
            class100.method1932(30, "", var3);
        } else if (this.method1746(var2, false)) {
            method2949(arg0);
        } else {
            class266 var4 = Statics.method2786(class264.field3038, client.field552.field1342);
            var4.field3064.method7179(class445.method6110(arg0));
            var4.field3064.method7186(arg0);
            client.field552.method2534(var4);
        }
    }

    @ObfuscatedName("ho.h(I)V")
    public static final void method4619() {
        class310 var10000 = (class310) null;
        String var0 = class310.field3722;
        class100.method1932(30, "", var0);
    }

    @ObfuscatedName("ej.t(Ljava/lang/String;I)V")
    public static final void method2949(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class310 var10001 = (class310) null;
        StringBuilder var2 = var10000.append(class310.field3842).append(arg0);
        class310 var3 = (class310) null;
        String var1 = var2.append(class310.field3843).toString();
        class100.method1932(30, "", var1);
    }

    @ObfuscatedName("du.u(B)V")
    public static final void method2619() {
        class310 var10000 = (class310) null;
        String var0 = class310.field3839;
        class100.method1932(30, "", var0);
    }

    @ObfuscatedName("br.d(I)Z")
    public final boolean method1743() {
        return this.field811.method6247() || this.field811.method6246() >= 100 && client.field622 != 1;
    }

    @ObfuscatedName("br.b(Ljava/lang/String;I)V")
    public final void method1706(String arg0) {
        if (arg0 == null) {
            return;
        }
        class466 var2 = new class466(arg0, this.field812);
        if (!var2.method7784()) {
            return;
        }
        if (this.field813.method6286(var2)) {
            client.method4656();
            class266 var3 = Statics.method2786(class264.field3037, client.field552.field1342);
            var3.field3064.method7179(class445.method6110(arg0));
            var3.field3064.method7186(arg0);
            client.field552.method2534(var3);
        }
        client.method1922();
    }

    @ObfuscatedName("br.a(Ljava/lang/String;B)V")
    public final void method1736(String arg0) {
        if (arg0 == null) {
            return;
        }
        class466 var2 = new class466(arg0, this.field812);
        if (!var2.method7784()) {
            return;
        }
        if (this.field811.method6286(var2)) {
            client.method4656();
            class266 var3 = Statics.method2786(class264.field2939, client.field552.field1342);
            var3.field3064.method7179(class445.method6110(arg0));
            var3.field3064.method7186(arg0);
            client.field552.method2534(var3);
        }
        client.method6152();
    }

    @ObfuscatedName("ez.l(Ljava/lang/String;II)V")
    public static final void method2873(String arg0, int arg1) {
        class266 var2 = Statics.method2786(class264.field2990, client.field552.field1342);
        var2.field3064.method7179(class445.method6110(arg0) + 1);
        var2.field3064.method7186(arg0);
        var2.field3064.method7409(arg1);
        client.field552.method2534(var2);
    }

    @ObfuscatedName("br.e(Lqo;B)Z")
    public final boolean method1705(class466 arg0) {
        class370 var2 = (class370) this.field813.method6264(arg0);
        return var2 != null && var2.method6332();
    }
}

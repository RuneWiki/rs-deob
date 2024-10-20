package deob;

import java.util.Iterator;

@ObfuscatedName("bx")
public class class69 {

    @ObfuscatedName("bx.b")
    public final class331 field1004;

    @ObfuscatedName("bx.l")
    public final class293 field1000;

    @ObfuscatedName("bx.w")
    public final class287 field1001;

    @ObfuscatedName("bx.d")
    public int field998 = 0;

    public class69(class331 arg0) {
        this.field1004 = arg0;
        this.field1000 = new class293(arg0);
        this.field1001 = new class287(arg0);
    }

    @ObfuscatedName("bx.f(I)Z")
    public boolean method1570() {
        return this.field998 == 2;
    }

    @ObfuscatedName("bx.h(I)V")
    public final void method1556() {
        this.field998 = 1;
    }

    @ObfuscatedName("bx.e(Lgx;IB)V")
    public final void method1547(class185 arg0, int arg1) {
        this.field1000.method5055(arg0, arg1);
        this.field998 = 2;
        client.method927();
    }

    @ObfuscatedName("bx.b(I)V")
    public final void method1548() {
        for (class297 var1 = (class297) this.field1000.field3707.method3849(); var1 != null; var1 = (class297) this.field1000.field3707.method3850()) {
            if ((long) var1.field3727 < class187.method2864() / 1000L - 5L) {
                if (var1.field3729 > 0) {
                    class86.method1011(5, "", var1.field3728 + class240.field2993);
                }
                if (var1.field3729 == 0) {
                    class86.method1011(5, "", var1.field3728 + class240.field2994);
                }
                var1.method3858();
            }
        }
    }

    @ObfuscatedName("bx.l(B)V")
    public final void method1549() {
        this.field998 = 0;
        this.field1000.method4965();
        this.field1001.method4965();
    }

    @ObfuscatedName("bx.w(Lkh;ZI)Z")
    public final boolean method1550(class294 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field502.field573)) {
            return true;
        } else {
            return this.field1000.method5056(arg0, arg1);
        }
    }

    @ObfuscatedName("bx.d(Lkh;I)Z")
    public final boolean method1551(class294 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1001.method4968(arg0);
        }
    }

    @ObfuscatedName("bx.n(Ljava/lang/String;I)V")
    public final void method1590(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1004);
        if (!var2.method5060()) {
            return;
        }
        if (this.method1553()) {
            method1541(class240.field3012);
        } else if (Statics.field502.field573.equals(var2)) {
            method1541(class240.field3016);
        } else if (this.method1550(var2, false)) {
            method1541(arg0 + class240.field3013);
        } else if (this.method1551(var2)) {
            method3108(arg0);
        } else {
            method498(arg0);
        }
    }

    @ObfuscatedName("bc.s(Ljava/lang/String;B)V")
    public static final void method1541(String arg0) {
        class86.method1011(30, "", arg0);
    }

    @ObfuscatedName("fx.g(Ljava/lang/String;I)V")
    public static final void method3108(String arg0) {
        method1541(class240.field3018 + arg0 + class240.field3019);
    }

    @ObfuscatedName("ay.k(Ljava/lang/String;I)V")
    public static final void method498(String arg0) {
        class175 var1 = class175.method3561(class172.field2217, client.field798.field1265);
        var1.field2323.method3531(class185.method459(arg0));
        var1.field2323.method3314(arg0);
        client.field798.method1884(var1);
    }

    @ObfuscatedName("bx.m(I)Z")
    public final boolean method1553() {
        return this.field1000.method4990() || this.field1000.method4966() >= 200 && client.field729 != 1;
    }

    @ObfuscatedName("bx.q(Ljava/lang/String;I)V")
    public final void method1554(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1004);
        if (!var2.method5060()) {
            return;
        }
        if (this.method1555()) {
            method1541(class240.field3014);
        } else if (Statics.field502.field573.equals(var2)) {
            method4245();
        } else if (this.method1551(var2)) {
            method4219(arg0);
        } else if (this.method1550(var2, false)) {
            method127(arg0);
        } else {
            class175 var3 = class175.method3561(class172.field2261, client.field798.field1265);
            var3.field2323.method3531(class185.method459(arg0));
            var3.field2323.method3314(arg0);
            client.field798.method1884(var3);
        }
    }

    @ObfuscatedName("hk.x(Ljava/lang/String;S)V")
    public static final void method4219(String arg0) {
        method1541(arg0 + class240.field3015);
    }

    @ObfuscatedName("a.u(Ljava/lang/String;I)V")
    public static final void method127(String arg0) {
        method1541(class240.field3072 + arg0 + class240.field3021);
    }

    @ObfuscatedName("ik.o(I)V")
    public static final void method4245() {
        method1541(class240.field3017);
    }

    @ObfuscatedName("bx.t(I)Z")
    public final boolean method1555() {
        return this.field1001.method4990() || this.field1001.method4966() >= 100 && client.field729 != 1;
    }

    @ObfuscatedName("bx.v(Ljava/lang/String;B)V")
    public final void method1580(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1004);
        if (!var2.method5060()) {
            return;
        }
        if (this.field1000.method4972(var2)) {
            client.method4173();
            class175 var3 = class175.method3561(class172.field2198, client.field798.field1265);
            var3.field2323.method3531(class185.method459(arg0));
            var3.field2323.method3314(arg0);
            client.field798.method1884(var3);
        }
        client.method927();
    }

    @ObfuscatedName("bx.p(Ljava/lang/String;I)V")
    public final void method1566(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1004);
        if (!var2.method5060()) {
            return;
        }
        if (this.field1001.method4972(var2)) {
            client.method4173();
            class175 var3 = class175.method3561(class172.field2203, client.field798.field1265);
            var3.field2323.method3531(class185.method459(arg0));
            var3.field2323.method3314(arg0);
            client.field798.method1884(var3);
        }
        Iterator var4 = class86.field1226.iterator();
        while (var4.hasNext()) {
            class60 var5 = (class60) var4.next();
            var5.method975();
        }
        if (Statics.field1960 != null) {
            Statics.field1960.method5098();
        }
    }

    @ObfuscatedName("bx.z(Lkh;B)Z")
    public final boolean method1558(class294 arg0) {
        class295 var2 = (class295) this.field1000.method4986(arg0);
        return var2 != null && var2.method5051();
    }
}

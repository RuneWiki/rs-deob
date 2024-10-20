package deob;

@ObfuscatedName("co")
public class class84 {

    @ObfuscatedName("co.d")
    public final class348 field1092;

    @ObfuscatedName("co.w")
    public final class292 field1091;

    @ObfuscatedName("co.v")
    public final class286 field1094;

    @ObfuscatedName("co.q")
    public int field1093 = 0;

    public class84(class348 arg0) {
        this.field1092 = arg0;
        this.field1091 = new class292(arg0);
        this.field1094 = new class286(arg0);
    }

    @ObfuscatedName("co.x(I)Z")
    public boolean method1770() {
        return this.field1093 == 2;
    }

    @ObfuscatedName("co.m(B)V")
    public final void method1771() {
        this.field1093 = 1;
    }

    @ObfuscatedName("co.k(Lkb;II)V")
    public final void method1781(class310 arg0, int arg1) {
        this.field1091.method4840(arg0, arg1);
        this.field1093 = 2;
        client.method3853();
    }

    @ObfuscatedName("co.d(I)V")
    public final void method1773() {
        for (class296 var1 = (class296) this.field1091.field3616.method4593(); var1 != null; var1 = (class296) this.field1091.field3616.method4589()) {
            if ((long) var1.field3637 < Statics.method3668() / 1000L - 5L) {
                if (var1.field3638 > 0) {
                    class101.method2911(5, "", var1.field3639 + class234.field2818);
                }
                if (var1.field3638 == 0) {
                    class101.method2911(5, "", var1.field3639 + class234.field2909);
                }
                var1.method3352();
            }
        }
    }

    @ObfuscatedName("co.w(I)V")
    public final void method1828() {
        this.field1093 = 0;
        this.field1091.method4784();
        this.field1094.method4784();
    }

    @ObfuscatedName("co.v(Lku;ZI)Z")
    public final boolean method1809(class293 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field3718.field653)) {
            return true;
        } else {
            return this.field1091.method4843(arg0, arg1);
        }
    }

    @ObfuscatedName("co.q(Lku;B)Z")
    public final boolean method1776(class293 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1094.method4745(arg0);
        }
    }

    @ObfuscatedName("co.z(Ljava/lang/String;B)V")
    public final void method1777(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1092);
        if (!var2.method4846()) {
            return;
        }
        if (this.method1778()) {
            method3372();
        } else if (Statics.field3718.field653.equals(var2)) {
            method135(class234.field2931);
        } else if (this.method1809(var2, false)) {
            method790(arg0);
        } else if (this.method1776(var2)) {
            method1768(arg0);
        } else {
            class197 var3 = class197.method3105(class193.field2291, client.field762.field1341);
            var3.field2339.method5121(class310.method3851(arg0));
            var3.field2339.method5217(arg0);
            client.field762.method2171(var3);
        }
    }

    @ObfuscatedName("i.t(Ljava/lang/String;I)V")
    public static final void method135(String arg0) {
        class101.method2911(30, "", arg0);
    }

    @ObfuscatedName("gb.e(I)V")
    public static final void method3372() {
        method135(class234.field2927);
    }

    @ObfuscatedName("bd.s(Ljava/lang/String;I)V")
    public static final void method790(String arg0) {
        method135(arg0 + class234.field2928);
    }

    @ObfuscatedName("cq.p(Ljava/lang/String;B)V")
    public static final void method1768(String arg0) {
        method135(class234.field2862 + arg0 + class234.field3032);
    }

    @ObfuscatedName("co.n(I)Z")
    public final boolean method1778() {
        return this.field1091.method4796() || this.field1091.method4743() >= 200 && client.field799 != 1;
    }

    @ObfuscatedName("co.u(Ljava/lang/String;B)V")
    public final void method1779(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1092);
        if (!var2.method4846()) {
            return;
        }
        if (this.method1780()) {
            method135(class234.field2974);
        } else if (Statics.field3718.field653.equals(var2)) {
            method2147();
        } else if (this.method1776(var2)) {
            method135(arg0 + class234.field2930);
        } else if (this.method1809(var2, false)) {
            method3376(arg0);
        } else {
            class197 var3 = class197.method3105(class193.field2217, client.field762.field1341);
            var3.field2339.method5121(class310.method3851(arg0));
            var3.field2339.method5217(arg0);
            client.field762.method2171(var3);
        }
    }

    @ObfuscatedName("gm.h(Ljava/lang/String;I)V")
    public static final void method3376(String arg0) {
        method135(class234.field2947 + arg0 + class234.field2811);
    }

    @ObfuscatedName("cl.g(I)V")
    public static final void method2147() {
        method135(class234.field2932);
    }

    @ObfuscatedName("co.i(B)Z")
    public final boolean method1780() {
        return this.field1094.method4796() || this.field1094.method4743() >= 100 && client.field799 != 1;
    }

    @ObfuscatedName("co.a(Ljava/lang/String;B)V")
    public final void method1813(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1092);
        if (!var2.method4846()) {
            return;
        }
        if (this.field1091.method4749(var2)) {
            client.method3283();
            class197 var3 = class197.method3105(class193.field2298, client.field762.field1341);
            var3.field2339.method5121(class310.method3851(arg0));
            var3.field2339.method5217(arg0);
            client.field762.method2171(var3);
        }
        client.method3853();
    }

    @ObfuscatedName("co.o(Ljava/lang/String;B)V")
    public final void method1782(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1092);
        if (!var2.method4846()) {
            return;
        }
        if (this.field1094.method4749(var2)) {
            client.method3283();
            class197 var3 = class197.method3105(class193.field2223, client.field762.field1341);
            var3.field2339.method5121(class310.method3851(arg0));
            var3.field2339.method5217(arg0);
            client.field762.method2171(var3);
        }
        client.method4957();
    }

    @ObfuscatedName("bf.c(Ljava/lang/String;IB)V")
    public static final void method746(String arg0, int arg1) {
        class197 var2 = class197.method3105(class193.field2260, client.field762.field1341);
        var2.field2339.method5121(class310.method3851(arg0) + 1);
        var2.field2339.method5217(arg0);
        var2.field2339.method5287(arg1);
        client.field762.method2171(var2);
    }

    @ObfuscatedName("co.f(Lku;I)Z")
    public final boolean method1783(class293 arg0) {
        class294 var2 = (class294) this.field1091.method4824(arg0);
        return var2 != null && var2.method4831();
    }
}

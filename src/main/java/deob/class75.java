package deob;

@ObfuscatedName("bf")
public class class75 {

    @ObfuscatedName("bf.p")
    public final class339 field1076;

    @ObfuscatedName("bf.k")
    public final class283 field1071;

    @ObfuscatedName("bf.l")
    public final class277 field1072;

    @ObfuscatedName("bf.b")
    public int field1077 = 0;

    public class75(class339 arg0) {
        this.field1076 = arg0;
        this.field1071 = new class283(arg0);
        this.field1072 = new class277(arg0);
    }

    @ObfuscatedName("bf.q(I)Z")
    public boolean method1626() {
        return this.field1077 == 2;
    }

    @ObfuscatedName("bf.w(I)V")
    public final void method1595() {
        this.field1077 = 1;
    }

    @ObfuscatedName("bf.e(Lkf;II)V")
    public final void method1640(class301 arg0, int arg1) {
        this.field1071.method4783(arg0, arg1);
        this.field1077 = 2;
        client.method2715();
    }

    @ObfuscatedName("bf.p(B)V")
    public final void method1597() {
        for (class287 var1 = (class287) this.field1071.field3643.method4537(); var1 != null; var1 = (class287) this.field1071.field3643.method4538()) {
            if ((long) var1.field3662 < class298.method3576() / 1000L - 5L) {
                if (var1.field3664 > 0) {
                    class92.method994(5, "", var1.field3663 + class225.field2854);
                }
                if (var1.field3664 == 0) {
                    class92.method994(5, "", var1.field3663 + class225.field2909);
                }
                var1.method3281();
            }
        }
    }

    @ObfuscatedName("bf.k(S)V")
    public final void method1615() {
        this.field1077 = 0;
        this.field1071.method4708();
        this.field1072.method4708();
    }

    @ObfuscatedName("bf.l(Ljv;ZI)Z")
    public final boolean method1599(class284 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field658.field622)) {
            return true;
        } else {
            return this.field1071.method4782(arg0, arg1);
        }
    }

    @ObfuscatedName("bf.b(Ljv;B)Z")
    public final boolean method1600(class284 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1072.method4695(arg0);
        }
    }

    @ObfuscatedName("bf.i(Ljava/lang/String;I)V")
    public final void method1645(String arg0) {
        if (arg0 == null) {
            return;
        }
        class284 var2 = new class284(arg0, this.field1076);
        if (!var2.method4798()) {
            return;
        }
        if (this.method1602()) {
            method1000();
        } else if (Statics.field658.field622.equals(var2)) {
            class225 var7 = (class225) null;
            String var3 = class225.field2931;
            class92.method994(30, "", var3);
        } else if (this.method1599(var2, false)) {
            method541(arg0);
        } else if (this.method1600(var2)) {
            StringBuilder var10000 = new StringBuilder();
            class225 var10001 = (class225) null;
            StringBuilder var6 = var10000.append(class225.field3048).append(arg0);
            class225 var8 = (class225) null;
            String var4 = var6.append(class225.field3046).toString();
            class92.method994(30, "", var4);
        } else {
            class188 var5 = class188.method3894(class184.field2292, client.field881.field1314);
            var5.field2334.method5228(class301.method3582(arg0));
            var5.field2334.method5058(arg0);
            client.field881.method2023(var5);
        }
    }

    @ObfuscatedName("bs.c(I)V")
    public static final void method1000() {
        class225 var10000 = (class225) null;
        String var0 = class225.field2927;
        class92.method994(30, "", var0);
    }

    @ObfuscatedName("ao.u(Ljava/lang/String;I)V")
    public static final void method541(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class225 var10001 = (class225) null;
        String var1 = var10000.append(class225.field2872).toString();
        class92.method994(30, "", var1);
    }

    @ObfuscatedName("bf.x(I)Z")
    public final boolean method1602() {
        return this.field1071.method4717() || this.field1071.method4694() >= 200 && client.field772 != 1;
    }

    @ObfuscatedName("bf.r(Ljava/lang/String;B)V")
    public final void method1603(String arg0) {
        if (arg0 == null) {
            return;
        }
        class284 var2 = new class284(arg0, this.field1076);
        if (!var2.method4798()) {
            return;
        }
        if (this.method1613()) {
            class225 var10000 = (class225) null;
            String var3 = class225.field2929;
            class92.method994(30, "", var3);
        } else if (Statics.field658.field622.equals(var2)) {
            method620();
        } else if (this.method1600(var2)) {
            method1489(arg0);
        } else if (this.method1599(var2, false)) {
            method485(arg0);
        } else {
            method3748(arg0);
        }
    }

    @ObfuscatedName("client.v(Ljava/lang/String;I)V")
    public static final void method1489(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class225 var10001 = (class225) null;
        String var1 = var10000.append(class225.field2930).toString();
        class92.method994(30, "", var1);
    }

    @ObfuscatedName("ag.y(Ljava/lang/String;B)V")
    public static final void method485(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class225 var10001 = (class225) null;
        StringBuilder var2 = var10000.append(class225.field3021).append(arg0);
        class225 var3 = (class225) null;
        String var1 = var2.append(class225.field2801).toString();
        class92.method994(30, "", var1);
    }

    @ObfuscatedName("aq.g(I)V")
    public static final void method620() {
        class225 var10000 = (class225) null;
        String var0 = class225.field2932;
        class92.method994(30, "", var0);
    }

    @ObfuscatedName("hm.a(Ljava/lang/String;I)V")
    public static final void method3748(String arg0) {
        class188 var1 = class188.method3894(class184.field2211, client.field881.field1314);
        var1.field2334.method5228(class301.method3582(arg0));
        var1.field2334.method5058(arg0);
        client.field881.method2023(var1);
    }

    @ObfuscatedName("bf.j(I)Z")
    public final boolean method1613() {
        return this.field1072.method4717() || this.field1072.method4694() >= 100 && client.field772 != 1;
    }

    @ObfuscatedName("bf.o(Ljava/lang/String;I)V")
    public final void method1605(String arg0) {
        if (arg0 == null) {
            return;
        }
        class284 var2 = new class284(arg0, this.field1076);
        if (!var2.method4798()) {
            return;
        }
        if (this.field1071.method4699(var2)) {
            client.field673 = client.field674;
            class188 var3 = class188.method3894(class184.field2225, client.field881.field1314);
            var3.field2334.method5228(class301.method3582(arg0));
            var3.field2334.method5058(arg0);
            client.field881.method2023(var3);
        }
        client.method2715();
    }

    @ObfuscatedName("bf.d(Ljava/lang/String;B)V")
    public final void method1606(String arg0) {
        if (arg0 == null) {
            return;
        }
        class284 var2 = new class284(arg0, this.field1076);
        if (!var2.method4798()) {
            return;
        }
        if (this.field1072.method4699(var2)) {
            client.field673 = client.field674;
            class188 var3 = class188.method3894(class184.field2232, client.field881.field1314);
            var3.field2334.method5228(class301.method3582(arg0));
            var3.field2334.method5058(arg0);
            client.field881.method2023(var3);
        }
        client.method19();
    }

    @ObfuscatedName("v.s(Ljava/lang/String;II)V")
    public static final void method145(String arg0, int arg1) {
        class188 var2 = class188.method3894(class184.field2281, client.field881.field1314);
        var2.field2334.method5228(class301.method3582(arg0) + 1);
        var2.field2334.method5058(arg0);
        var2.field2334.method5228(arg1);
        client.field881.method2023(var2);
    }

    @ObfuscatedName("bf.z(Ljv;I)Z")
    public final boolean method1616(class284 arg0) {
        class285 var2 = (class285) this.field1071.method4696(arg0);
        return var2 != null && var2.method4771();
    }
}

package deob;

@ObfuscatedName("cr")
public class class84 {

    @ObfuscatedName("cr.t")
    public final class348 field1095;

    @ObfuscatedName("cr.i")
    public final class292 field1097;

    @ObfuscatedName("cr.o")
    public final class286 field1099;

    @ObfuscatedName("cr.x")
    public int field1100 = 0;

    public class84(class348 arg0) {
        this.field1095 = arg0;
        this.field1097 = new class292(arg0);
        this.field1099 = new class286(arg0);
    }

    @ObfuscatedName("cr.z(I)Z")
    public boolean method1803() {
        return this.field1100 == 2;
    }

    @ObfuscatedName("cr.k(I)V")
    public final void method1750() {
        this.field1100 = 1;
    }

    @ObfuscatedName("cr.s(Lkf;IS)V")
    public final void method1752(class310 arg0, int arg1) {
        this.field1097.method4881(arg0, arg1);
        this.field1100 = 2;
        for (int var3 = 0; var3 < class99.field1279; var3++) {
            class76 var4 = client.field861[class99.field1282[var3]];
            var4.method1132();
        }
        class101.method1951();
        if (Statics.field1907 != null) {
            Statics.field1907.method4912();
        }
    }

    @ObfuscatedName("cr.t(I)V")
    public final void method1753() {
        for (class296 var1 = (class296) this.field1097.field3644.method4650(); var1 != null; var1 = (class296) this.field1097.field3644.method4657()) {
            if ((long) var1.field3665 < class307.method2184() / 1000L - 5L) {
                if (var1.field3666 > 0) {
                    class101.method317(5, "", var1.field3664 + class234.field2949);
                }
                if (var1.field3666 == 0) {
                    class101.method317(5, "", var1.field3664 + class234.field2950);
                }
                var1.method3397();
            }
        }
    }

    @ObfuscatedName("cr.i(I)V")
    public final void method1765() {
        this.field1100 = 0;
        this.field1097.method4806();
        this.field1099.method4806();
    }

    @ObfuscatedName("cr.o(Lku;ZB)Z")
    public final boolean method1755(class293 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field141.field649)) {
            return true;
        } else {
            return this.field1097.method4880(arg0, arg1);
        }
    }

    @ObfuscatedName("cr.x(Lku;B)Z")
    public final boolean method1756(class293 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1099.method4816(arg0);
        }
    }

    @ObfuscatedName("cr.w(Ljava/lang/String;I)V")
    public final void method1774(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1095);
        if (!var2.method4886()) {
            return;
        }
        if (this.method1758()) {
            class234 var10000 = (class234) null;
            String var3 = class234.field3078;
            class101.method317(30, "", var3);
        } else if (Statics.field141.field649.equals(var2)) {
            method557();
        } else if (this.method1755(var2, false)) {
            method3135(arg0);
        } else if (this.method1756(var2)) {
            Statics.method535(arg0);
        } else {
            method3221(arg0);
        }
    }

    @ObfuscatedName("ej.g(Ljava/lang/String;I)V")
    public static final void method3135(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class234 var10001 = (class234) null;
        String var1 = var10000.append(class234.field2869).toString();
        class101.method317(30, "", var1);
    }

    @ObfuscatedName("as.n(I)V")
    public static final void method557() {
        class234 var10000 = (class234) null;
        String var0 = class234.field2864;
        class101.method317(30, "", var0);
    }

    @ObfuscatedName("fv.d(Ljava/lang/String;I)V")
    public static final void method3221(String arg0) {
        class197 var1 = class197.method1625(class193.field2316, client.field723.field1341);
        var1.field2377.method5177(class310.method2409(arg0));
        var1.field2377.method5322(arg0);
        client.field723.method2159(var1);
    }

    @ObfuscatedName("cr.h(S)Z")
    public final boolean method1758() {
        return this.field1097.method4800() || this.field1097.method4801() >= 200 && client.field889 != 1;
    }

    @ObfuscatedName("cr.a(Ljava/lang/String;I)V")
    public final void method1759(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1095);
        if (!var2.method4886()) {
            return;
        }
        class234 var9;
        if (this.method1771()) {
            var9 = (class234) null;
            String var3 = class234.field2970;
            class101.method317(30, "", var3);
        } else if (Statics.field141.field649.equals(var2)) {
            var9 = (class234) null;
            String var4 = class234.field2973;
            class101.method317(30, "", var4);
        } else {
            StringBuilder var10000;
            class234 var10001;
            if (this.method1756(var2)) {
                var10000 = (new StringBuilder()).append(arg0);
                var10001 = (class234) null;
                String var5 = var10000.append(class234.field2971).toString();
                class101.method317(30, "", var5);
            } else if (this.method1755(var2, false)) {
                var10000 = new StringBuilder();
                var10001 = (class234) null;
                StringBuilder var8 = var10000.append(class234.field2976).append(arg0);
                class234 var10 = (class234) null;
                String var6 = var8.append(class234.field2860).toString();
                class101.method317(30, "", var6);
            } else {
                class197 var7 = class197.method1625(class193.field2289, client.field723.field1341);
                var7.field2377.method5177(class310.method2409(arg0));
                var7.field2377.method5322(arg0);
                client.field723.method2159(var7);
            }
        }
    }

    @ObfuscatedName("cr.q(B)Z")
    public final boolean method1771() {
        return this.field1099.method4800() || this.field1099.method4801() >= 100 && client.field889 != 1;
    }

    @ObfuscatedName("cr.c(Ljava/lang/String;I)V")
    public final void method1761(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1095);
        if (!var2.method4886()) {
            return;
        }
        if (this.field1097.method4807(var2)) {
            client.field871 = client.field863;
            class197 var3 = class197.method1625(class193.field2320, client.field723.field1341);
            var3.field2377.method5177(class310.method2409(arg0));
            var3.field2377.method5322(arg0);
            client.field723.method2159(var3);
        }
        for (int var4 = 0; var4 < class99.field1279; var4++) {
            class76 var5 = client.field861[class99.field1282[var4]];
            var5.method1132();
        }
        class101.method1951();
        if (Statics.field1907 != null) {
            Statics.field1907.method4912();
        }
    }

    @ObfuscatedName("cr.j(Ljava/lang/String;I)V")
    public final void method1762(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1095);
        if (!var2.method4886()) {
            return;
        }
        if (this.field1099.method4807(var2)) {
            client.field871 = client.field863;
            class197 var3 = class197.method1625(class193.field2323, client.field723.field1341);
            var3.field2377.method5177(class310.method2409(arg0));
            var3.field2377.method5322(arg0);
            client.field723.method2159(var3);
        }
        client.method4171();
    }

    @ObfuscatedName("jk.r(Ljava/lang/String;IB)V")
    public static final void method4702(String arg0, int arg1) {
        class197 var2 = class197.method1625(class193.field2346, client.field723.field1341);
        var2.field2377.method5177(class310.method2409(arg0) + 1);
        var2.field2377.method5177(arg1);
        var2.field2377.method5322(arg0);
        client.field723.method2159(var2);
    }

    @ObfuscatedName("cr.u(Lku;I)Z")
    public final boolean method1763(class293 arg0) {
        class294 var2 = (class294) this.field1097.method4804(arg0);
        return var2 != null && var2.method4871();
    }
}

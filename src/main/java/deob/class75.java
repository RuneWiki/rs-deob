package deob;

@ObfuscatedName("bh")
public class class75 {

    @ObfuscatedName("bh.w")
    public final class335 field1039;

    @ObfuscatedName("bh.o")
    public final class294 field1037;

    @ObfuscatedName("bh.u")
    public final class288 field1034;

    @ObfuscatedName("bh.g")
    public int field1036 = 0;

    public class75(class335 arg0) {
        this.field1039 = arg0;
        this.field1037 = new class294(arg0);
        this.field1034 = new class288(arg0);
    }

    @ObfuscatedName("bh.m(B)Z")
    public boolean method1646() {
        return this.field1036 == 2;
    }

    @ObfuscatedName("bh.f(I)V")
    public final void method1647() {
        this.field1036 = 1;
    }

    @ObfuscatedName("bh.q(Lgr;II)V")
    public final void method1675(class202 arg0, int arg1) {
        this.field1037.method5125(arg0, arg1);
        this.field1036 = 2;
        client.method104();
    }

    @ObfuscatedName("bh.w(I)V")
    public final void method1688() {
        for (class298 var1 = (class298) this.field1037.field3713.method4894(); var1 != null; var1 = (class298) this.field1037.field3713.method4895()) {
            if ((long) var1.field3732 < class204.method3658() / 1000L - 5L) {
                if (var1.field3731 > 0) {
                    class92.method202(5, "", var1.field3730 + class236.field2992);
                }
                if (var1.field3731 == 0) {
                    class92.method202(5, "", var1.field3730 + class236.field2954);
                }
                var1.method3299();
            }
        }
    }

    @ObfuscatedName("bh.o(I)V")
    public final void method1649() {
        this.field1036 = 0;
        this.field1037.method5035();
        this.field1034.method5035();
    }

    @ObfuscatedName("bh.u(Lkp;ZI)Z")
    public final boolean method1650(class295 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field389.field599)) {
            return true;
        } else {
            return this.field1037.method5126(arg0, arg1);
        }
    }

    @ObfuscatedName("bh.g(Lkp;I)Z")
    public final boolean method1684(class295 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1034.method5072(arg0);
        }
    }

    @ObfuscatedName("bh.l(Ljava/lang/String;I)V")
    public final void method1652(String arg0) {
        if (arg0 == null) {
            return;
        }
        class295 var2 = new class295(arg0, this.field1039);
        if (!var2.method5133()) {
            return;
        }
        class236 var9;
        if (this.method1653()) {
            var9 = (class236) null;
            String var3 = class236.field2933;
            class92.method202(30, "", var3);
        } else if (Statics.field389.field599.equals(var2)) {
            var9 = (class236) null;
            String var4 = class236.field3015;
            class92.method202(30, "", var4);
        } else {
            StringBuilder var10000;
            class236 var10001;
            if (this.method1650(var2, false)) {
                var10000 = (new StringBuilder()).append(arg0);
                var10001 = (class236) null;
                String var5 = var10000.append(class236.field3012).toString();
                class92.method202(30, "", var5);
            } else if (this.method1684(var2)) {
                var10000 = new StringBuilder();
                var10001 = (class236) null;
                StringBuilder var8 = var10000.append(class236.field3017).append(arg0);
                class236 var10 = (class236) null;
                String var6 = var8.append(class236.field2869).toString();
                class92.method202(30, "", var6);
            } else {
                class192 var7 = class192.method1750(class189.field2318, client.field669.field1284);
                var7.field2356.method3565(class202.method493(arg0));
                var7.field2356.method3591(arg0);
                client.field669.method2056(var7);
            }
        }
    }

    @ObfuscatedName("bh.e(B)Z")
    public final boolean method1653() {
        return this.field1037.method5034() || this.field1037.method5036() >= 200 && client.field740 != 1;
    }

    @ObfuscatedName("bh.x(Ljava/lang/String;B)V")
    public final void method1654(String arg0) {
        if (arg0 == null) {
            return;
        }
        class295 var2 = new class295(arg0, this.field1039);
        if (!var2.method5133()) {
            return;
        }
        class236 var8;
        if (this.method1655()) {
            var8 = (class236) null;
            String var3 = class236.field3047;
            class92.method202(30, "", var3);
        } else if (Statics.field389.field599.equals(var2)) {
            var8 = (class236) null;
            String var4 = class236.field3016;
            class92.method202(30, "", var4);
        } else if (this.method1684(var2)) {
            method271(arg0);
        } else if (this.method1650(var2, false)) {
            StringBuilder var10000 = new StringBuilder();
            class236 var10001 = (class236) null;
            StringBuilder var7 = var10000.append(class236.field3019).append(arg0);
            class236 var9 = (class236) null;
            String var5 = var7.append(class236.field3020).toString();
            class92.method202(30, "", var5);
        } else {
            class192 var6 = class192.method1750(class189.field2320, client.field669.field1284);
            var6.field2356.method3565(class202.method493(arg0));
            var6.field2356.method3591(arg0);
            client.field669.method2056(var6);
        }
    }

    @ObfuscatedName("c.d(Ljava/lang/String;B)V")
    public static final void method271(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class236 var10001 = (class236) null;
        String var1 = var10000.append(class236.field3014).toString();
        class92.method202(30, "", var1);
    }

    @ObfuscatedName("bh.a(B)Z")
    public final boolean method1655() {
        return this.field1034.method5034() || this.field1034.method5036() >= 100 && client.field740 != 1;
    }

    @ObfuscatedName("bh.z(Ljava/lang/String;I)V")
    public final void method1656(String arg0) {
        if (arg0 == null) {
            return;
        }
        class295 var2 = new class295(arg0, this.field1039);
        if (!var2.method5133()) {
            return;
        }
        if (this.field1037.method5042(var2)) {
            Statics.method577();
            class192 var3 = class192.method1750(class189.field2284, client.field669.field1284);
            var3.field2356.method3565(class202.method493(arg0));
            var3.field2356.method3591(arg0);
            client.field669.method2056(var3);
        }
        client.method104();
    }

    @ObfuscatedName("bh.j(Ljava/lang/String;I)V")
    public final void method1657(String arg0) {
        if (arg0 == null) {
            return;
        }
        class295 var2 = new class295(arg0, this.field1039);
        if (!var2.method5133()) {
            return;
        }
        if (this.field1034.method5042(var2)) {
            Statics.method577();
            class192 var3 = class192.method1750(class189.field2286, client.field669.field1284);
            var3.field2356.method3565(class202.method493(arg0));
            var3.field2356.method3591(arg0);
            client.field669.method2056(var3);
        }
        client.method4118();
    }

    @ObfuscatedName("kx.s(Ljava/lang/String;II)V")
    public static final void method5180(String arg0, int arg1) {
        class192 var2 = class192.method1750(class189.field2307, client.field669.field1284);
        var2.field2356.method3565(class202.method493(arg0) + 1);
        var2.field2356.method3591(arg0);
        var2.field2356.method3565(arg1);
        client.field669.method2056(var2);
    }

    @ObfuscatedName("bh.t(Lkp;S)Z")
    public final boolean method1696(class295 arg0) {
        class296 var2 = (class296) this.field1037.method5039(arg0);
        return var2 != null && var2.method5117();
    }
}

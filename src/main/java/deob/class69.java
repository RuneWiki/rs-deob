package deob;

@ObfuscatedName("bz")
public class class69 {

    @ObfuscatedName("bz.u")
    public final class331 field1028;

    @ObfuscatedName("bz.i")
    public final class293 field1024;

    @ObfuscatedName("bz.r")
    public final class287 field1025;

    @ObfuscatedName("bz.j")
    public int field1023 = 0;

    public class69(class331 arg0) {
        this.field1028 = arg0;
        this.field1024 = new class293(arg0);
        this.field1025 = new class287(arg0);
    }

    @ObfuscatedName("bz.y(I)Z")
    public boolean method1582() {
        return this.field1023 == 2;
    }

    @ObfuscatedName("bz.c(I)V")
    public final void method1524() {
        this.field1023 = 1;
    }

    @ObfuscatedName("bz.n(Lge;II)V")
    public final void method1568(class185 arg0, int arg1) {
        this.field1024.method5074(arg0, arg1);
        this.field1023 = 2;
        client.method14();
    }

    @ObfuscatedName("bz.u(I)V")
    public final void method1526() {
        for (class297 var1 = (class297) this.field1024.field3695.method3815(); var1 != null; var1 = (class297) this.field1024.field3695.method3818()) {
            if ((long) var1.field3710 < class187.method1700() / 1000L - 5L) {
                if (var1.field3709 > 0) {
                    class86.method876(5, "", var1.field3711 + class240.field2983);
                }
                if (var1.field3709 == 0) {
                    class86.method876(5, "", var1.field3711 + class240.field2984);
                }
                var1.method3821();
            }
        }
    }

    @ObfuscatedName("bz.i(I)V")
    public final void method1527() {
        this.field1023 = 0;
        this.field1024.method5001();
        this.field1025.method5001();
    }

    @ObfuscatedName("bz.p(Lkx;ZI)Z")
    public final boolean method1528(class294 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field476.field593)) {
            return true;
        } else {
            return this.field1024.method5071(arg0, arg1);
        }
    }

    @ObfuscatedName("bz.e(Lkx;S)Z")
    public final boolean method1523(class294 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1025.method5004(arg0);
        }
    }

    @ObfuscatedName("bz.s(Ljava/lang/String;I)V")
    public final void method1530(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1028);
        if (!var2.method5096()) {
            return;
        }
        if (this.method1574()) {
            method2669();
        } else if (Statics.field476.field593.equals(var2)) {
            class240 var5 = (class240) null;
            String var3 = class240.field2948;
            class86.method876(30, "", var3);
        } else if (this.method1528(var2, false)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class240 var10001 = (class240) null;
            String var4 = var10000.append(class240.field3003).toString();
            class86.method876(30, "", var4);
        } else if (this.method1523(var2)) {
            method2877(arg0);
        } else {
            method1499(arg0);
        }
    }

    @ObfuscatedName("ib.v(Ljava/lang/String;I)V")
    public static final void method4251(String arg0) {
        class86.method876(30, "", arg0);
    }

    @ObfuscatedName("ds.k(I)V")
    public static final void method2669() {
        class240 var10000 = (class240) null;
        String var0 = class240.field3004;
        class86.method876(30, "", var0);
    }

    @ObfuscatedName("em.o(Ljava/lang/String;B)V")
    public static final void method2877(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class240 var10001 = (class240) null;
        StringBuilder var2 = var10000.append(class240.field3008).append(arg0);
        class240 var3 = (class240) null;
        String var1 = var2.append(class240.field3009).toString();
        class86.method876(30, "", var1);
    }

    @ObfuscatedName("bl.q(Ljava/lang/String;I)V")
    public static final void method1499(String arg0) {
        class175 var1 = class175.method3207(class172.field2221, client.field672.field1273);
        var1.field2299.method3253(class185.method637(arg0));
        var1.field2299.method3260(arg0);
        client.field672.method1901(var1);
    }

    @ObfuscatedName("bz.l(S)Z")
    public final boolean method1574() {
        return this.field1024.method5038() || this.field1024.method5002() >= 200 && client.field743 != 1;
    }

    @ObfuscatedName("bz.f(Ljava/lang/String;B)V")
    public final void method1529(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1028);
        if (!var2.method5096()) {
            return;
        }
        if (this.method1533()) {
            class240 var6 = (class240) null;
            String var3 = class240.field3124;
            class86.method876(30, "", var3);
        } else if (Statics.field476.field593.equals(var2)) {
            method1008();
        } else if (this.method1523(var2)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class240 var10001 = (class240) null;
            String var4 = var10000.append(class240.field3005).toString();
            class86.method876(30, "", var4);
        } else if (this.method1528(var2, false)) {
            method4251(class240.field2846 + arg0 + class240.field3011);
        } else {
            class175 var5 = class175.method3207(class172.field2248, client.field672.field1273);
            var5.field2299.method3253(class185.method637(arg0));
            var5.field2299.method3260(arg0);
            client.field672.method1901(var5);
        }
    }

    @ObfuscatedName("bc.z(I)V")
    public static final void method1008() {
        class240 var10000 = (class240) null;
        String var0 = class240.field2978;
        class86.method876(30, "", var0);
    }

    @ObfuscatedName("bz.a(B)Z")
    public final boolean method1533() {
        return this.field1025.method5038() || this.field1025.method5002() >= 100 && client.field743 != 1;
    }

    @ObfuscatedName("bz.x(Ljava/lang/String;I)V")
    public final void method1534(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1028);
        if (!var2.method5096()) {
            return;
        }
        if (this.field1024.method5008(var2)) {
            client.field816 = client.field808;
            class175 var3 = class175.method3207(class172.field2199, client.field672.field1273);
            var3.field2299.method3253(class185.method637(arg0));
            var3.field2299.method3260(arg0);
            client.field672.method1901(var3);
        }
        client.method14();
    }

    @ObfuscatedName("bz.b(Ljava/lang/String;I)V")
    public final void method1535(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1028);
        if (!var2.method5096()) {
            return;
        }
        if (this.field1025.method5008(var2)) {
            client.field816 = client.field808;
            class175 var3 = class175.method3207(class172.field2234, client.field672.field1273);
            var3.field2299.method3253(class185.method637(arg0));
            var3.field2299.method3260(arg0);
            client.field672.method1901(var3);
        }
        client.method104();
    }

    @ObfuscatedName("h.w(Ljava/lang/String;II)V")
    public static final void method430(String arg0, int arg1) {
        class175 var2 = class175.method3207(class172.field2257, client.field672.field1273);
        var2.field2299.method3253(class185.method637(arg0) + 1);
        var2.field2299.method3260(arg0);
        var2.field2299.method3253(arg1);
        client.field672.method1901(var2);
    }

    @ObfuscatedName("bz.g(Lkx;I)Z")
    public final boolean method1536(class294 arg0) {
        class295 var2 = (class295) this.field1024.method5005(arg0);
        return var2 != null && var2.method5066();
    }
}

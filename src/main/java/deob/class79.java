package deob;

@ObfuscatedName("cq")
public class class79 {

    @ObfuscatedName("cq.p")
    public final class327 field1193;

    @ObfuscatedName("cq.a")
    public final class291 field1195;

    @ObfuscatedName("cq.h")
    public final class285 field1194;

    @ObfuscatedName("cq.l")
    public int field1196 = 0;

    public class79(class327 arg0) {
        this.field1193 = arg0;
        this.field1195 = new class291(arg0);
        this.field1194 = new class285(arg0);
    }

    @ObfuscatedName("cq.b(B)Z")
    public boolean method1574() {
        return this.field1196 == 2;
    }

    @ObfuscatedName("cq.q(I)V")
    public final void method1575() {
        this.field1196 = 1;
    }

    @ObfuscatedName("cq.o(Lgn;IB)V")
    public final void method1581(class194 arg0, int arg1) {
        this.field1195.method4921(arg0, arg1);
        this.field1196 = 2;
        client.method2388();
    }

    @ObfuscatedName("cq.p(I)V")
    public final void method1578() {
        for (class295 var1 = (class295) this.field1195.field3733.method3771(); var1 != null; var1 = (class295) this.field1195.field3733.method3772()) {
            if ((long) var1.field3749 < class196.method3211() / 1000L - 5L) {
                if (var1.field3750 > 0) {
                    class95.method2873(5, "", var1.field3748 + class246.field3119);
                }
                if (var1.field3750 == 0) {
                    class95.method2873(5, "", var1.field3748 + class246.field3171);
                }
                var1.method3780();
            }
        }
    }

    @ObfuscatedName("cq.a(I)V")
    public final void method1589() {
        this.field1196 = 0;
        this.field1195.method4826();
        this.field1194.method4826();
    }

    @ObfuscatedName("cq.h(Lkp;ZI)Z")
    public final boolean method1579(class292 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field818.field800)) {
            return true;
        } else {
            return this.field1195.method4920(arg0, arg1);
        }
    }

    @ObfuscatedName("cq.l(Lkp;B)Z")
    public final boolean method1580(class292 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1194.method4829(arg0);
        }
    }

    @ObfuscatedName("cq.y(Ljava/lang/String;I)V")
    public final void method1609(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field1193);
        if (!var2.method4927()) {
            return;
        }
        if (this.method1582()) {
            method3229();
        } else if (Statics.field818.field800.equals(var2)) {
            class246 var7 = (class246) null;
            String var3 = class246.field3001;
            class95.method2873(30, "", var3);
        } else if (this.method1579(var2, false)) {
            method1561(arg0);
        } else if (this.method1580(var2)) {
            StringBuilder var10000 = new StringBuilder();
            class246 var10001 = (class246) null;
            StringBuilder var6 = var10000.append(class246.field3144).append(arg0);
            class246 var8 = (class246) null;
            String var4 = var6.append(class246.field3145).toString();
            class95.method2873(30, "", var4);
        } else {
            class184 var5 = class184.method979(class181.field2352, client.field864.field1435);
            var5.field2468.method3232(class194.method564(arg0));
            var5.field2468.method3239(arg0);
            client.field864.method1893(var5);
        }
    }

    @ObfuscatedName("gl.g(B)V")
    public static final void method3229() {
        class246 var10000 = (class246) null;
        String var0 = class246.field3138;
        class95.method2873(30, "", var0);
    }

    @ObfuscatedName("bs.c(Ljava/lang/String;I)V")
    public static final void method1561(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class246 var10001 = (class246) null;
        String var1 = var10000.append(class246.field3139).toString();
        class95.method2873(30, "", var1);
    }

    @ObfuscatedName("cq.u(B)Z")
    public final boolean method1582() {
        return this.field1195.method4828() || this.field1195.method4827() >= 200 && client.field1029 != 1;
    }

    @ObfuscatedName("cq.t(Ljava/lang/String;I)V")
    public final void method1577(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field1193);
        if (!var2.method4927()) {
            return;
        }
        if (this.method1584()) {
            method2589();
        } else if (Statics.field818.field800.equals(var2)) {
            class246 var6 = (class246) null;
            String var3 = class246.field3053;
            class95.method2873(30, "", var3);
        } else if (this.method1580(var2)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class246 var10001 = (class246) null;
            String var4 = var10000.append(class246.field3141).toString();
            class95.method2873(30, "", var4);
        } else if (this.method1579(var2, false)) {
            method4144(arg0);
        } else {
            class184 var5 = class184.method979(class181.field2375, client.field864.field1435);
            var5.field2468.method3232(class194.method564(arg0));
            var5.field2468.method3239(arg0);
            client.field864.method1893(var5);
        }
    }

    @ObfuscatedName("ed.f(I)V")
    public static final void method2589() {
        class246 var10000 = (class246) null;
        String var0 = class246.field3140;
        class95.method2873(30, "", var0);
    }

    @ObfuscatedName("ix.m(Ljava/lang/String;I)V")
    public static final void method4144(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class246 var10001 = (class246) null;
        StringBuilder var2 = var10000.append(class246.field3146).append(arg0);
        class246 var3 = (class246) null;
        String var1 = var2.append(class246.field3147).toString();
        class95.method2873(30, "", var1);
    }

    @ObfuscatedName("cq.x(I)Z")
    public final boolean method1584() {
        return this.field1194.method4828() || this.field1194.method4827() >= 100 && client.field1029 != 1;
    }

    @ObfuscatedName("cq.w(Ljava/lang/String;B)V")
    public final void method1585(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field1193);
        if (!var2.method4927()) {
            return;
        }
        if (this.field1195.method4855(var2)) {
            Statics.method4();
            class184 var3 = class184.method979(class181.field2420, client.field864.field1435);
            var3.field2468.method3232(class194.method564(arg0));
            var3.field2468.method3239(arg0);
            client.field864.method1893(var3);
        }
        client.method2388();
    }

    @ObfuscatedName("cq.j(Ljava/lang/String;I)V")
    public final void method1601(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field1193);
        if (!var2.method4927()) {
            return;
        }
        if (this.field1194.method4855(var2)) {
            Statics.method4();
            class184 var3 = class184.method979(class181.field2419, client.field864.field1435);
            var3.field2468.method3232(class194.method564(arg0));
            var3.field2468.method3239(arg0);
            client.field864.method1893(var3);
        }
        class95.method1723();
        if (Statics.field14 != null) {
            Statics.field14.method4956();
        }
    }

    @ObfuscatedName("an.z(Ljava/lang/String;IB)V")
    public static final void method702(String arg0, int arg1) {
        class184 var2 = class184.method979(class181.field2354, client.field864.field1435);
        var2.field2468.method3232(class194.method564(arg0) + 1);
        var2.field2468.method3274(arg1);
        var2.field2468.method3239(arg0);
        client.field864.method1893(var2);
    }
}

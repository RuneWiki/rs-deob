package deob;

@ObfuscatedName("bb")
public class class75 {

    @ObfuscatedName("bb.q")
    public final class338 field1046;

    @ObfuscatedName("bb.v")
    public final class282 field1043;

    @ObfuscatedName("bb.l")
    public final class276 field1044;

    @ObfuscatedName("bb.c")
    public int field1045 = 0;

    public class75(class338 arg0) {
        this.field1046 = arg0;
        this.field1043 = new class282(arg0);
        this.field1044 = new class276(arg0);
    }

    @ObfuscatedName("bb.a(I)Z")
    public boolean method1765() {
        return this.field1045 == 2;
    }

    @ObfuscatedName("bb.t(I)V")
    public final void method1760() {
        this.field1045 = 1;
    }

    @ObfuscatedName("bb.n(Lkc;II)V")
    public final void method1761(class300 arg0, int arg1) {
        this.field1043.method4842(arg0, arg1);
        this.field1045 = 2;
        client.method5394();
    }

    @ObfuscatedName("bb.q(I)V")
    public final void method1778() {
        for (class286 var1 = (class286) this.field1043.field3607.method4605(); var1 != null; var1 = (class286) this.field1043.field3607.method4606()) {
            if ((long) var1.field3625 < class297.method3777() / 1000L - 5L) {
                if (var1.field3623 > 0) {
                    class92.method522(5, "", var1.field3624 + class225.field2894);
                }
                if (var1.field3623 == 0) {
                    class92.method522(5, "", var1.field3624 + class225.field2925);
                }
                var1.method3384();
            }
        }
    }

    @ObfuscatedName("bb.v(B)V")
    public final void method1763() {
        this.field1045 = 0;
        this.field1043.method4776();
        this.field1044.method4776();
    }

    @ObfuscatedName("bb.l(Lju;ZB)Z")
    public final boolean method1764(class283 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2530.field601)) {
            return true;
        } else {
            return this.field1043.method4843(arg0, arg1);
        }
    }

    @ObfuscatedName("bb.c(Lju;S)Z")
    public final boolean method1826(class283 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1044.method4796(arg0);
        }
    }

    @ObfuscatedName("bb.o(Ljava/lang/String;B)V")
    public final void method1809(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1046);
        if (!var2.method4854()) {
            return;
        }
        if (this.method1789()) {
            class225 var5 = (class225) null;
            String var3 = class225.field2913;
            class92.method522(30, "", var3);
        } else if (Statics.field2530.field601.equals(var2)) {
            method520();
        } else if (this.method1764(var2, false)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class225 var10001 = (class225) null;
            String var4 = var10000.append(class225.field2914).toString();
            class92.method522(30, "", var4);
        } else if (this.method1826(var2)) {
            method2081(arg0);
        } else {
            method1816(arg0);
        }
    }

    @ObfuscatedName("cu.i(Ljava/lang/String;I)V")
    public static final void method2081(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class225 var10001 = (class225) null;
        StringBuilder var2 = var10000.append(class225.field2919).append(arg0);
        class225 var3 = (class225) null;
        String var1 = var2.append(class225.field2920).toString();
        class92.method522(30, "", var1);
    }

    @ObfuscatedName("aq.d(B)V")
    public static final void method520() {
        class225 var10000 = (class225) null;
        String var0 = class225.field2814;
        class92.method522(30, "", var0);
    }

    @ObfuscatedName("bb.m(Ljava/lang/String;I)V")
    public static final void method1816(String arg0) {
        class188 var1 = class188.method2402(class184.field2248, client.field679.field1284);
        var1.field2308.method5253(Statics.method3242(arg0));
        var1.field2308.method5114(arg0);
        client.field679.method2177(var1);
    }

    @ObfuscatedName("bb.p(I)Z")
    public final boolean method1789() {
        return this.field1043.method4757() || this.field1043.method4756() >= 200 && client.field750 != 1;
    }

    @ObfuscatedName("bb.h(Ljava/lang/String;B)V")
    public final void method1769(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1046);
        if (!var2.method4854()) {
            return;
        }
        if (this.method1759()) {
            method3083();
        } else if (Statics.field2530.field601.equals(var2)) {
            method4197();
        } else if (this.method1826(var2)) {
            method4206(arg0);
        } else if (this.method1764(var2, false)) {
            method302(arg0);
        } else {
            class188 var3 = class188.method2402(class184.field2203, client.field679.field1284);
            var3.field2308.method5253(Statics.method3242(arg0));
            var3.field2308.method5114(arg0);
            client.field679.method2177(var3);
        }
    }

    @ObfuscatedName("ef.k(I)V")
    public static final void method3083() {
        class225 var10000 = (class225) null;
        String var0 = class225.field2915;
        class92.method522(30, "", var0);
    }

    @ObfuscatedName("ib.x(Ljava/lang/String;B)V")
    public static final void method4206(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class225 var10001 = (class225) null;
        String var1 = var10000.append(class225.field2974).toString();
        class92.method522(30, "", var1);
    }

    @ObfuscatedName("w.j(Ljava/lang/String;I)V")
    public static final void method302(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class225 var10001 = (class225) null;
        StringBuilder var2 = var10000.append(class225.field3021).append(arg0);
        class225 var3 = (class225) null;
        String var1 = var2.append(class225.field2860).toString();
        class92.method522(30, "", var1);
    }

    @ObfuscatedName("ic.r(I)V")
    public static final void method4197() {
        class225 var10000 = (class225) null;
        String var0 = class225.field3004;
        class92.method522(30, "", var0);
    }

    @ObfuscatedName("bb.e(B)Z")
    public final boolean method1759() {
        return this.field1044.method4757() || this.field1044.method4756() >= 100 && client.field750 != 1;
    }

    @ObfuscatedName("bb.s(Ljava/lang/String;I)V")
    public final void method1770(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1046);
        if (!var2.method4854()) {
            return;
        }
        if (this.field1043.method4762(var2)) {
            client.method3257();
            class188 var3 = class188.method2402(class184.field2228, client.field679.field1284);
            var3.field2308.method5253(Statics.method3242(arg0));
            var3.field2308.method5114(arg0);
            client.field679.method2177(var3);
        }
        client.method5394();
    }

    @ObfuscatedName("bb.b(Ljava/lang/String;I)V")
    public final void method1771(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1046);
        if (!var2.method4854()) {
            return;
        }
        if (this.field1044.method4762(var2)) {
            client.method3257();
            class188 var3 = class188.method2402(class184.field2198, client.field679.field1284);
            var3.field2308.method5253(Statics.method3242(arg0));
            var3.field2308.method5114(arg0);
            client.field679.method2177(var3);
        }
        client.method701();
    }

    @ObfuscatedName("bh.w(Ljava/lang/String;II)V")
    public static final void method1068(String arg0, int arg1) {
        class188 var2 = class188.method2402(class184.field2247, client.field679.field1284);
        var2.field2308.method5253(Statics.method3242(arg0) + 1);
        var2.field2308.method5114(arg0);
        var2.field2308.method5148(arg1);
        client.field679.method2177(var2);
    }

    @ObfuscatedName("bb.u(Lju;B)Z")
    public final boolean method1772(class283 arg0) {
        class284 var2 = (class284) this.field1043.method4759(arg0);
        return var2 != null && var2.method4833();
    }
}

package deob;

@ObfuscatedName("ba")
public class class75 {

    @ObfuscatedName("ba.k")
    public final class338 field1042;

    @ObfuscatedName("ba.u")
    public final class282 field1044;

    @ObfuscatedName("ba.n")
    public final class276 field1045;

    @ObfuscatedName("ba.t")
    public int field1046 = 0;

    public class75(class338 arg0) {
        this.field1042 = arg0;
        this.field1044 = new class282(arg0);
        this.field1045 = new class276(arg0);
    }

    @ObfuscatedName("ba.s(S)Z")
    public boolean method1668() {
        return this.field1046 == 2;
    }

    @ObfuscatedName("ba.j(B)V")
    public final void method1669() {
        this.field1046 = 1;
    }

    @ObfuscatedName("ba.i(Lky;II)V")
    public final void method1678(class300 arg0, int arg1) {
        this.field1044.method4759(arg0, arg1);
        this.field1046 = 2;
        client.method39();
    }

    @ObfuscatedName("ba.k(I)V")
    public final void method1671() {
        for (class286 var1 = (class286) this.field1044.field3602.method4515(); var1 != null; var1 = (class286) this.field1044.field3602.method4509()) {
            if ((long) var1.field3622 < class297.method4369() / 1000L - 5L) {
                if (var1.field3623 > 0) {
                    class92.method3602(5, "", var1.field3621 + class225.field2979);
                }
                if (var1.field3623 == 0) {
                    class92.method3602(5, "", var1.field3621 + class225.field2822);
                }
                var1.method3301();
            }
        }
    }

    @ObfuscatedName("ba.u(I)V")
    public final void method1672() {
        this.field1046 = 0;
        this.field1044.method4727();
        this.field1045.method4727();
    }

    @ObfuscatedName("ba.n(Ljx;ZI)Z")
    public final boolean method1673(class283 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field177.field591)) {
            return true;
        } else {
            return this.field1044.method4755(arg0, arg1);
        }
    }

    @ObfuscatedName("ba.t(Ljx;I)Z")
    public final boolean method1724(class283 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1045.method4673(arg0);
        }
    }

    @ObfuscatedName("ba.q(Ljava/lang/String;B)V")
    public final void method1674(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1042);
        if (!var2.method4768()) {
            return;
        }
        if (this.method1675()) {
            method38();
        } else if (Statics.field177.field591.equals(var2)) {
            class225 var7 = (class225) null;
            String var3 = class225.field2912;
            class92.method3602(30, "", var3);
        } else if (this.method1673(var2, false)) {
            method1862(arg0);
        } else if (this.method1724(var2)) {
            StringBuilder var10000 = new StringBuilder();
            class225 var10001 = (class225) null;
            StringBuilder var6 = var10000.append(class225.field2923).append(arg0);
            class225 var8 = (class225) null;
            String var4 = var6.append(class225.field2813).toString();
            class92.method3602(30, "", var4);
        } else {
            class188 var5 = class188.method1879(class184.field2202, client.field828.field1300);
            var5.field2321.method5083(class300.method4752(arg0));
            var5.field2321.method5043(arg0);
            client.field828.method2049(var5);
        }
    }

    @ObfuscatedName("k.x(B)V")
    public static final void method38() {
        class225 var10000 = (class225) null;
        String var0 = class225.field2908;
        class92.method3602(30, "", var0);
    }

    @ObfuscatedName("ci.d(Ljava/lang/String;I)V")
    public static final void method1862(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class225 var10001 = (class225) null;
        String var1 = var10000.append(class225.field2909).toString();
        class92.method3602(30, "", var1);
    }

    @ObfuscatedName("ba.f(B)Z")
    public final boolean method1675() {
        return this.field1044.method4694() || this.field1044.method4699() >= 200 && client.field742 != 1;
    }

    @ObfuscatedName("ba.c(Ljava/lang/String;I)V")
    public final void method1681(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1042);
        if (!var2.method4768()) {
            return;
        }
        class225 var7;
        if (this.method1705()) {
            var7 = (class225) null;
            String var3 = class225.field2845;
            class92.method3602(30, "", var3);
        } else if (Statics.field177.field591.equals(var2)) {
            var7 = (class225) null;
            String var4 = class225.field2913;
            class92.method3602(30, "", var4);
        } else if (this.method1724(var2)) {
            method505(arg0);
        } else if (this.method1673(var2, false)) {
            StringBuilder var10000 = new StringBuilder();
            class225 var10001 = (class225) null;
            StringBuilder var6 = var10000.append(class225.field2916).append(arg0);
            class225 var8 = (class225) null;
            String var5 = var6.append(class225.field2917).toString();
            class92.method3602(30, "", var5);
        } else {
            method3614(arg0);
        }
    }

    @ObfuscatedName("as.r(Ljava/lang/String;I)V")
    public static final void method505(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class225 var10001 = (class225) null;
        String var1 = var10000.append(class225.field2911).toString();
        class92.method3602(30, "", var1);
    }

    @ObfuscatedName("hr.y(Ljava/lang/String;I)V")
    public static final void method3614(String arg0) {
        class188 var1 = class188.method1879(class184.field2276, client.field828.field1300);
        var1.field2321.method5083(class300.method4752(arg0));
        var1.field2321.method5043(arg0);
        client.field828.method2049(var1);
    }

    @ObfuscatedName("ba.p(I)Z")
    public final boolean method1705() {
        return this.field1045.method4694() || this.field1045.method4699() >= 100 && client.field742 != 1;
    }

    @ObfuscatedName("ba.g(Ljava/lang/String;B)V")
    public final void method1686(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1042);
        if (!var2.method4768()) {
            return;
        }
        if (this.field1044.method4677(var2)) {
            client.method636();
            class188 var3 = class188.method1879(class184.field2226, client.field828.field1300);
            var3.field2321.method5083(class300.method4752(arg0));
            var3.field2321.method5043(arg0);
            client.field828.method2049(var3);
        }
        client.method39();
    }

    @ObfuscatedName("ba.e(Ljava/lang/String;B)V")
    public final void method1715(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1042);
        if (!var2.method4768()) {
            return;
        }
        if (this.field1045.method4677(var2)) {
            client.method636();
            class188 var3 = class188.method1879(class184.field2267, client.field828.field1300);
            var3.field2321.method5083(class300.method4752(arg0));
            var3.field2321.method5043(arg0);
            client.field828.method2049(var3);
        }
        client.method1001();
    }

    @ObfuscatedName("h.z(Ljava/lang/String;IB)V")
    public static final void method251(String arg0, int arg1) {
        class188 var2 = class188.method1879(class184.field2270, client.field828.field1300);
        var2.field2321.method5083(class300.method4752(arg0) + 1);
        var2.field2321.method5043(arg0);
        var2.field2321.method5083(arg1);
        client.field828.method2049(var2);
    }

    @ObfuscatedName("ba.w(Ljx;I)Z")
    public final boolean method1680(class283 arg0) {
        class284 var2 = (class284) this.field1044.method4674(arg0);
        return var2 != null && var2.method4747();
    }
}

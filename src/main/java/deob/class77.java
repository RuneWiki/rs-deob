package deob;

@ObfuscatedName("bl")
public class class77 {

    @ObfuscatedName("bl.p")
    public final class364 field903;

    @ObfuscatedName("bl.b")
    public final class316 field907;

    @ObfuscatedName("bl.e")
    public final class314 field908;

    @ObfuscatedName("bl.k")
    public int field909 = 0;

    public class77(class364 arg0) {
        this.field903 = arg0;
        this.field907 = new class316(arg0);
        this.field908 = new class314(arg0);
    }

    @ObfuscatedName("bl.f(B)Z")
    public boolean method1460() {
        return this.field909 == 2;
    }

    @ObfuscatedName("bl.o(B)V")
    public final void method1461() {
        this.field909 = 1;
    }

    @ObfuscatedName("bl.u(Lnu;II)V")
    public final void method1467(class382 arg0, int arg1) {
        this.field907.method5037(arg0, arg1);
        this.field909 = 2;
        for (int var3 = 0; var3 < class109.field1362; var3++) {
            class98 var4 = client.field849[class109.field1354[var3]];
            var4.method1848();
        }
        class111.method506();
        if (Statics.field1142 != null) {
            Statics.field1142.method5042();
        }
    }

    @ObfuscatedName("bl.p(I)V")
    public final void method1463() {
        for (class319 var1 = (class319) this.field907.field3818.method4274(); var1 != null; var1 = (class319) this.field907.field3818.method4275()) {
            if ((long) var1.field3834 < class379.method1540() / 1000L - 5L) {
                if (var1.field3832 > 0) {
                    class111.method930(5, "", var1.field3831 + class246.field3063);
                }
                if (var1.field3832 == 0) {
                    class111.method930(5, "", var1.field3831 + class246.field3064);
                }
                var1.method5345();
            }
        }
    }

    @ObfuscatedName("bl.b(B)V")
    public final void method1464() {
        this.field909 = 0;
        this.field907.method5158();
        this.field908.method5158();
    }

    @ObfuscatedName("bl.e(Llw;ZI)Z")
    public final boolean method1465(class327 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1374.field1183)) {
            return true;
        } else {
            return this.field907.method5036(arg0, arg1);
        }
    }

    @ObfuscatedName("bl.k(Llw;I)Z")
    public final boolean method1468(class327 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field908.method5168(arg0);
        }
    }

    @ObfuscatedName("bl.g(Ljava/lang/String;I)V")
    public final void method1476(String arg0) {
        if (arg0 == null) {
            return;
        }
        class327 var2 = new class327(arg0, this.field903);
        if (!var2.method5212()) {
            return;
        }
        if (this.method1486()) {
            method2202();
        } else if (Statics.field1374.field1183.equals(var2)) {
            class246 var10000 = (class246) null;
            String var3 = class246.field3086;
            class111.method930(30, "", var3);
        } else if (this.method1465(var2, false)) {
            method2677(arg0);
        } else if (this.method1468(var2)) {
            method1719(arg0);
        } else {
            class205 var4 = class205.method4631(class203.field2314, client.field649.field1385);
            var4.field2342.method5839(class382.method5070(arg0));
            var4.field2342.method6016(arg0);
            client.field649.method2099(var4);
        }
    }

    @ObfuscatedName("df.h(I)V")
    public static final void method2202() {
        class246 var10000 = (class246) null;
        String var0 = class246.field3101;
        class111.method930(30, "", var0);
    }

    @ObfuscatedName("ev.n(Ljava/lang/String;S)V")
    public static final void method2677(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class246 var10001 = (class246) null;
        String var1 = var10000.append(class246.field3083).toString();
        class111.method930(30, "", var1);
    }

    @ObfuscatedName("ce.l(Ljava/lang/String;I)V")
    public static final void method1719(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class246 var10001 = (class246) null;
        StringBuilder var2 = var10000.append(class246.field3088).append(arg0);
        class246 var3 = (class246) null;
        String var1 = var2.append(class246.field3089).toString();
        class111.method930(30, "", var1);
    }

    @ObfuscatedName("bl.m(I)Z")
    public final boolean method1486() {
        return this.field907.method5174() || this.field907.method5111() >= 200 && client.field721 != 1;
    }

    @ObfuscatedName("bl.d(Ljava/lang/String;B)V")
    public final void method1469(String arg0) {
        if (arg0 == null) {
            return;
        }
        class327 var2 = new class327(arg0, this.field903);
        if (!var2.method5212()) {
            return;
        }
        if (this.method1470()) {
            method2733();
        } else if (Statics.field1374.field1183.equals(var2)) {
            method259();
        } else if (this.method1468(var2)) {
            method1908(arg0);
        } else if (this.method1465(var2, false)) {
            method151(arg0);
        } else {
            class205 var3 = class205.method4631(class203.field2302, client.field649.field1385);
            var3.field2342.method5839(class382.method5070(arg0));
            var3.field2342.method6016(arg0);
            client.field649.method2099(var3);
        }
    }

    @ObfuscatedName("fy.c(B)V")
    public static final void method2733() {
        class246 var10000 = (class246) null;
        String var0 = class246.field2926;
        class111.method930(30, "", var0);
    }

    @ObfuscatedName("cl.j(Ljava/lang/String;I)V")
    public static final void method1908(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class246 var10001 = (class246) null;
        String var1 = var10000.append(class246.field3085).toString();
        class111.method930(30, "", var1);
    }

    @ObfuscatedName("m.r(Ljava/lang/String;B)V")
    public static final void method151(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class246 var10001 = (class246) null;
        StringBuilder var2 = var10000.append(class246.field3162).append(arg0);
        class246 var3 = (class246) null;
        String var1 = var2.append(class246.field3091).toString();
        class111.method930(30, "", var1);
    }

    @ObfuscatedName("ax.q(B)V")
    public static final void method259() {
        class246 var10000 = (class246) null;
        String var0 = class246.field3045;
        class111.method930(30, "", var0);
    }

    @ObfuscatedName("bl.t(B)Z")
    public final boolean method1470() {
        return this.field908.method5174() || this.field908.method5111() >= 100 && client.field721 != 1;
    }

    @ObfuscatedName("bl.v(Ljava/lang/String;B)V")
    public final void method1459(String arg0) {
        if (arg0 == null) {
            return;
        }
        class327 var2 = new class327(arg0, this.field903);
        if (!var2.method5212()) {
            return;
        }
        if (this.field907.method5117(var2)) {
            client.method531();
            class205 var3 = class205.method4631(class203.field2250, client.field649.field1385);
            var3.field2342.method5839(class382.method5070(arg0));
            var3.field2342.method6016(arg0);
            client.field649.method2099(var3);
        }
        for (int var4 = 0; var4 < class109.field1362; var4++) {
            class98 var5 = client.field849[class109.field1354[var4]];
            var5.method1848();
        }
        class111.method506();
        if (Statics.field1142 != null) {
            Statics.field1142.method5042();
        }
    }

    @ObfuscatedName("bl.x(Ljava/lang/String;I)V")
    public final void method1472(String arg0) {
        if (arg0 == null) {
            return;
        }
        class327 var2 = new class327(arg0, this.field903);
        if (!var2.method5212()) {
            return;
        }
        if (this.field908.method5117(var2)) {
            client.method531();
            class205 var3 = class205.method4631(class203.field2301, client.field649.field1385);
            var3.field2342.method5839(class382.method5070(arg0));
            var3.field2342.method6016(arg0);
            client.field649.method2099(var3);
        }
        client.method17();
    }

    @ObfuscatedName("af.z(Ljava/lang/String;II)V")
    public static final void method286(String arg0, int arg1) {
        class205 var2 = class205.method4631(class203.field2315, client.field649.field1385);
        var2.field2342.method5839(class382.method5070(arg0) + 1);
        var2.field2342.method6016(arg0);
        var2.field2342.method5882(arg1);
        client.field649.method2099(var2);
    }

    @ObfuscatedName("bl.i(Llw;I)Z")
    public final boolean method1473(class327 arg0) {
        class318 var2 = (class318) this.field907.method5114(arg0);
        return var2 != null && var2.method5194();
    }
}

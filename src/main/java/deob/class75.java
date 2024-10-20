package deob;

@ObfuscatedName("bf")
public class class75 {

    @ObfuscatedName("bf.u")
    public final class338 field1048;

    @ObfuscatedName("bf.r")
    public final class282 field1051;

    @ObfuscatedName("bf.p")
    public final class276 field1052;

    @ObfuscatedName("bf.q")
    public int field1053 = 0;

    public class75(class338 arg0) {
        this.field1048 = arg0;
        this.field1051 = new class282(arg0);
        this.field1052 = new class276(arg0);
    }

    @ObfuscatedName("bf.z(I)Z")
    public boolean method1678() {
        return this.field1053 == 2;
    }

    @ObfuscatedName("bf.n(I)V")
    public final void method1679() {
        this.field1053 = 1;
    }

    @ObfuscatedName("bf.v(Lkl;II)V")
    public final void method1705(class300 arg0, int arg1) {
        this.field1051.method4693(arg0, arg1);
        this.field1053 = 2;
        client.method3597();
    }

    @ObfuscatedName("bf.u(I)V")
    public final void method1681() {
        for (class286 var1 = (class286) this.field1051.field3609.method4468(); var1 != null; var1 = (class286) this.field1051.field3609.method4470()) {
            if ((long) var1.field3628 < class297.method502() / 1000L - 5L) {
                if (var1.field3626 > 0) {
                    class92.method3567(5, "", var1.field3625 + class225.field2890);
                }
                if (var1.field3626 == 0) {
                    class92.method3567(5, "", var1.field3625 + class225.field2891);
                }
                var1.method3243();
            }
        }
    }

    @ObfuscatedName("bf.r(I)V")
    public final void method1682() {
        this.field1053 = 0;
        this.field1051.method4609();
        this.field1052.method4609();
    }

    @ObfuscatedName("bf.p(Ljq;ZI)Z")
    public final boolean method1683(class283 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2737.field599)) {
            return true;
        } else {
            return this.field1051.method4694(arg0, arg1);
        }
    }

    @ObfuscatedName("bf.q(Ljq;I)Z")
    public final boolean method1684(class283 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1052.method4612(arg0);
        }
    }

    @ObfuscatedName("bf.m(Ljava/lang/String;I)V")
    public final void method1685(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1048);
        if (!var2.method4699()) {
            return;
        }
        class225 var9;
        if (this.method1711()) {
            var9 = (class225) null;
            String var3 = class225.field2875;
            class92.method3567(30, "", var3);
        } else if (Statics.field2737.field599.equals(var2)) {
            var9 = (class225) null;
            String var4 = class225.field2913;
            class92.method3567(30, "", var4);
        } else {
            StringBuilder var10000;
            class225 var10001;
            if (this.method1683(var2, false)) {
                var10000 = (new StringBuilder()).append(arg0);
                var10001 = (class225) null;
                String var5 = var10000.append(class225.field2910).toString();
                class92.method3567(30, "", var5);
            } else if (this.method1684(var2)) {
                var10000 = new StringBuilder();
                var10001 = (class225) null;
                StringBuilder var8 = var10000.append(class225.field2915).append(arg0);
                class225 var10 = (class225) null;
                String var6 = var8.append(class225.field2916).toString();
                class92.method3567(30, "", var6);
            } else {
                class188 var7 = class188.method1039(class184.field2265, client.field668.field1293);
                var7.field2315.method5065(class300.method4526(arg0));
                var7.field2315.method4981(arg0);
                client.field668.method2040(var7);
            }
        }
    }

    @ObfuscatedName("ia.y(Ljava/lang/String;B)V")
    public static final void method4104(String arg0) {
        class92.method3567(30, "", arg0);
    }

    @ObfuscatedName("bf.i(I)Z")
    public final boolean method1711() {
        return this.field1051.method4659() || this.field1051.method4637() >= 200 && client.field637 != 1;
    }

    @ObfuscatedName("bf.c(Ljava/lang/String;I)V")
    public final void method1687(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1048);
        if (!var2.method4699()) {
            return;
        }
        if (this.method1708()) {
            method539();
        } else if (Statics.field2737.field599.equals(var2)) {
            class225 var8 = (class225) null;
            String var3 = class225.field2914;
            class92.method3567(30, "", var3);
        } else {
            StringBuilder var10000;
            class225 var10001;
            if (this.method1684(var2)) {
                var10000 = (new StringBuilder()).append(arg0);
                var10001 = (class225) null;
                String var4 = var10000.append(class225.field2912).toString();
                class92.method3567(30, "", var4);
            } else if (this.method1683(var2, false)) {
                var10000 = new StringBuilder();
                var10001 = (class225) null;
                StringBuilder var7 = var10000.append(class225.field2917).append(arg0);
                class225 var9 = (class225) null;
                String var5 = var7.append(class225.field2774).toString();
                class92.method3567(30, "", var5);
            } else {
                class188 var6 = class188.method1039(class184.field2280, client.field668.field1293);
                var6.field2315.method5065(class300.method4526(arg0));
                var6.field2315.method4981(arg0);
                client.field668.method2040(var6);
            }
        }
    }

    @ObfuscatedName("ao.b(I)V")
    public static final void method539() {
        method4104(class225.field2911);
    }

    @ObfuscatedName("bf.o(S)Z")
    public final boolean method1708() {
        return this.field1052.method4659() || this.field1052.method4637() >= 100 && client.field637 != 1;
    }

    @ObfuscatedName("bf.a(Ljava/lang/String;I)V")
    public final void method1729(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1048);
        if (!var2.method4699()) {
            return;
        }
        if (this.field1051.method4639(var2)) {
            client.field745 = client.field727;
            class188 var3 = class188.method1039(class184.field2233, client.field668.field1293);
            var3.field2315.method5065(class300.method4526(arg0));
            var3.field2315.method4981(arg0);
            client.field668.method2040(var3);
        }
        client.method3597();
    }

    @ObfuscatedName("bf.e(Ljava/lang/String;I)V")
    public final void method1710(String arg0) {
        if (arg0 == null) {
            return;
        }
        class283 var2 = new class283(arg0, this.field1048);
        if (!var2.method4699()) {
            return;
        }
        if (this.field1052.method4639(var2)) {
            client.field745 = client.field727;
            class188 var3 = class188.method1039(class184.field2269, client.field668.field1293);
            var3.field2315.method5065(class300.method4526(arg0));
            var3.field2315.method4981(arg0);
            client.field668.method2040(var3);
        }
        client.method3321();
    }

    @ObfuscatedName("ck.x(Ljava/lang/String;II)V")
    public static final void method1857(String arg0, int arg1) {
        class188 var2 = class188.method1039(class184.field2255, client.field668.field1293);
        var2.field2315.method5065(class300.method4526(arg0) + 1);
        var2.field2315.method5065(arg1);
        var2.field2315.method4981(arg0);
        client.field668.method2040(var2);
    }

    @ObfuscatedName("bf.h(Ljq;I)Z")
    public final boolean method1690(class283 arg0) {
        class284 var2 = (class284) this.field1051.method4613(arg0);
        return var2 != null && var2.method4688();
    }
}

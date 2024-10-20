package deob;

import java.util.Iterator;

@ObfuscatedName("cj")
public class class80 {

    @ObfuscatedName("cj.z")
    public final class336 field1240;

    @ObfuscatedName("cj.n")
    public final class305 field1238;

    @ObfuscatedName("cj.l")
    public final class299 field1239;

    @ObfuscatedName("cj.s")
    public int field1235 = 0;

    public class80(class336 arg0) {
        this.field1240 = arg0;
        this.field1238 = new class305(arg0);
        this.field1239 = new class299(arg0);
    }

    @ObfuscatedName("cj.g(S)Z")
    public boolean method1722() {
        return this.field1235 == 2;
    }

    @ObfuscatedName("cj.e(I)V")
    public final void method1708() {
        this.field1235 = 1;
    }

    @ObfuscatedName("cj.b(Lgg;IB)V")
    public final void method1665(class195 arg0, int arg1) {
        this.field1238.method5056(arg0, arg1);
        this.field1235 = 2;
        for (int var3 = 0; var3 < class94.field1408; var3++) {
            class73 var4 = client.field1004[class94.field1406[var3]];
            var4.method1134();
        }
        Iterator var5 = class96.field1429.iterator();
        while (var5.hasNext()) {
            class71 var6 = (class71) var5.next();
            var6.method1078();
        }
        if (Statics.field2474 != null) {
            Statics.field2474.method5086();
        }
    }

    @ObfuscatedName("cj.z(I)V")
    public final void method1666() {
        for (class309 var1 = (class309) this.field1238.field3865.method3847(); var1 != null; var1 = (class309) this.field1238.field3865.method3845()) {
            if ((long) var1.field3878 < class197.method4873() / 1000L - 5L) {
                if (var1.field3880 > 0) {
                    class96.method5053(5, "", var1.field3879 + class252.field3168);
                }
                if (var1.field3880 == 0) {
                    class96.method5053(5, "", var1.field3879 + class252.field3169);
                }
                var1.method3858();
            }
        }
    }

    @ObfuscatedName("cj.n(B)V")
    public final void method1683() {
        this.field1235 = 0;
        this.field1238.method4969();
        this.field1239.method4969();
    }

    @ObfuscatedName("cj.l(Lkb;ZI)Z")
    public final boolean method1668(class306 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field3435.field829)) {
            return true;
        } else {
            return this.field1238.method5055(arg0, arg1);
        }
    }

    @ObfuscatedName("cj.s(Lkb;I)Z")
    public final boolean method1669(class306 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1239.method4972(arg0);
        }
    }

    @ObfuscatedName("cj.y(Ljava/lang/String;I)V")
    public final void method1670(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1240);
        if (!var2.method5061()) {
            return;
        }
        class252 var6;
        if (this.method1671()) {
            var6 = (class252) null;
            String var3 = class252.field3260;
            class96.method5053(30, "", var3);
        } else if (Statics.field3435.field829.equals(var2)) {
            var6 = (class252) null;
            String var4 = class252.field3191;
            class96.method5053(30, "", var4);
        } else if (this.method1668(var2, false)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class252 var10001 = (class252) null;
            String var5 = var10000.append(class252.field3188).toString();
            class96.method5053(30, "", var5);
        } else if (this.method1669(var2)) {
            method3531(arg0);
        } else {
            method955(arg0);
        }
    }

    @ObfuscatedName("gf.c(Ljava/lang/String;B)V")
    public static final void method3531(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class252 var10001 = (class252) null;
        StringBuilder var2 = var10000.append(class252.field3193).append(arg0);
        class252 var3 = (class252) null;
        String var1 = var2.append(class252.field3194).toString();
        class96.method5053(30, "", var1);
    }

    @ObfuscatedName("bz.o(Ljava/lang/String;B)V")
    public static final void method955(String arg0) {
        class185 var1 = class185.method2191(class182.field2458, client.field912.field1461);
        var1.field2489.method3363(class195.method1963(arg0));
        var1.field2489.method3300(arg0);
        client.field912.method1999(var1);
    }

    @ObfuscatedName("cj.d(B)Z")
    public final boolean method1671() {
        return this.field1238.method4971() || this.field1238.method4979() >= 200 && client.field970 != 1;
    }

    @ObfuscatedName("cj.r(Ljava/lang/String;I)V")
    public final void method1694(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1240);
        if (!var2.method5061()) {
            return;
        }
        class252 var7;
        if (this.method1672()) {
            var7 = (class252) null;
            String var3 = class252.field3189;
            class96.method5053(30, "", var3);
        } else if (Statics.field3435.field829.equals(var2)) {
            var7 = (class252) null;
            String var4 = class252.field3192;
            class96.method5053(30, "", var4);
        } else if (this.method1669(var2)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class252 var10001 = (class252) null;
            String var5 = var10000.append(class252.field3190).toString();
            class96.method5053(30, "", var5);
        } else if (this.method1668(var2, false)) {
            method4614(arg0);
        } else {
            class185 var6 = class185.method2191(class182.field2375, client.field912.field1461);
            var6.field2489.method3363(class195.method1963(arg0));
            var6.field2489.method3300(arg0);
            client.field912.method1999(var6);
        }
    }

    @ObfuscatedName("jh.p(Ljava/lang/String;B)V")
    public static final void method4614(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class252 var10001 = (class252) null;
        StringBuilder var2 = var10000.append(class252.field3195).append(arg0);
        class252 var3 = (class252) null;
        String var1 = var2.append(class252.field3273).toString();
        class96.method5053(30, "", var1);
    }

    @ObfuscatedName("cj.q(B)Z")
    public final boolean method1672() {
        return this.field1239.method4971() || this.field1239.method4979() >= 100 && client.field970 != 1;
    }

    @ObfuscatedName("cj.f(Ljava/lang/String;I)V")
    public final void method1673(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1240);
        if (!var2.method5061()) {
            return;
        }
        if (this.field1238.method4975(var2)) {
            client.field1046 = client.field1036;
            class185 var3 = class185.method2191(class182.field2372, client.field912.field1461);
            var3.field2489.method3363(class195.method1963(arg0));
            var3.field2489.method3300(arg0);
            client.field912.method1999(var3);
        }
        for (int var4 = 0; var4 < class94.field1408; var4++) {
            class73 var5 = client.field1004[class94.field1406[var4]];
            var5.method1134();
        }
        Iterator var6 = class96.field1429.iterator();
        while (var6.hasNext()) {
            class71 var7 = (class71) var6.next();
            var7.method1078();
        }
        if (Statics.field2474 != null) {
            Statics.field2474.method5086();
        }
    }

    @ObfuscatedName("cj.j(Ljava/lang/String;I)V")
    public final void method1687(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1240);
        if (!var2.method5061()) {
            return;
        }
        if (this.field1239.method4975(var2)) {
            client.field1046 = client.field1036;
            class185 var3 = class185.method2191(class182.field2366, client.field912.field1461);
            var3.field2489.method3363(class195.method1963(arg0));
            var3.field2489.method3300(arg0);
            client.field912.method1999(var3);
        }
        class96.method728();
        if (Statics.field2474 != null) {
            Statics.field2474.method5089();
        }
    }

    @ObfuscatedName("ax.v(Ljava/lang/String;IB)V")
    public static final void method195(String arg0, int arg1) {
        class185 var2 = class185.method2191(class182.field2416, client.field912.field1461);
        var2.field2489.method3363(class195.method1963(arg0) + 1);
        var2.field2489.method3380(arg1);
        var2.field2489.method3300(arg0);
        client.field912.method1999(var2);
    }

    @ObfuscatedName("cj.u(Lkb;B)Z")
    public final boolean method1675(class306 arg0) {
        class307 var2 = (class307) this.field1238.method4973(arg0);
        return var2 != null && var2.method5049();
    }
}

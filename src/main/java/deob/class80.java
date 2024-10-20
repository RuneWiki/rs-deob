package deob;

import java.util.Iterator;

@ObfuscatedName("ct")
public class class80 {

    @ObfuscatedName("ct.j")
    public final class336 field1248;

    @ObfuscatedName("ct.k")
    public final class305 field1251;

    @ObfuscatedName("ct.x")
    public final class299 field1250;

    @ObfuscatedName("ct.z")
    public int field1247 = 0;

    public class80(class336 arg0) {
        this.field1248 = arg0;
        this.field1251 = new class305(arg0);
        this.field1250 = new class299(arg0);
    }

    @ObfuscatedName("ct.c(I)Z")
    public boolean method1521() {
        return this.field1247 == 2;
    }

    @ObfuscatedName("ct.i(B)V")
    public final void method1522() {
        this.field1247 = 1;
    }

    @ObfuscatedName("ct.o(Lgp;II)V")
    public final void method1523(class195 arg0, int arg1) {
        this.field1251.method5023(arg0, arg1);
        this.field1247 = 2;
        for (int var3 = 0; var3 < class94.field1415; var3++) {
            class73 var4 = client.field972[class94.field1416[var3]];
            var4.method1061();
        }
        class96.method719();
        if (Statics.field444 != null) {
            Statics.field444.method5063();
        }
    }

    @ObfuscatedName("ct.j(I)V")
    public final void method1524() {
        for (class309 var1 = (class309) this.field1251.field3848.method3752(); var1 != null; var1 = (class309) this.field1251.field3848.method3753()) {
            if ((long) var1.field3869 < class197.method26() / 1000L - 5L) {
                if (var1.field3867 > 0) {
                    class96.method3189(5, "", var1.field3866 + class252.field3160);
                }
                if (var1.field3867 == 0) {
                    class96.method3189(5, "", var1.field3866 + class252.field3161);
                }
                var1.method3760();
            }
        }
    }

    @ObfuscatedName("ct.k(B)V")
    public final void method1525() {
        this.field1247 = 0;
        this.field1251.method4971();
        this.field1250.method4971();
    }

    @ObfuscatedName("ct.x(Lko;ZI)Z")
    public final boolean method1569(class306 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field260.field824)) {
            return true;
        } else {
            return this.field1251.method5021(arg0, arg1);
        }
    }

    @ObfuscatedName("ct.z(Lko;B)Z")
    public final boolean method1559(class306 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1250.method4940(arg0);
        }
    }

    @ObfuscatedName("ct.p(Ljava/lang/String;I)V")
    public final void method1528(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1248);
        if (!var2.method5052()) {
            return;
        }
        if (this.method1529()) {
            method661(class252.field3179);
        } else if (Statics.field260.field824.equals(var2)) {
            Statics.method4095();
        } else if (this.method1569(var2, false)) {
            method661(arg0 + class252.field3180);
        } else if (this.method1559(var2)) {
            method661(class252.field3083 + arg0 + class252.field3186);
        } else {
            method1446(arg0);
        }
    }

    @ObfuscatedName("az.w(Ljava/lang/String;I)V")
    public static final void method661(String arg0) {
        class96.method3189(30, "", arg0);
    }

    @ObfuscatedName("client.d(Ljava/lang/String;I)V")
    public static final void method1446(String arg0) {
        class185 var1 = class185.method2860(class182.field2414, client.field903.field1476);
        var1.field2501.method3209(class195.method1769(arg0));
        var1.field2501.method3216(arg0);
        client.field903.method1884(var1);
    }

    @ObfuscatedName("ct.a(I)Z")
    public final boolean method1529() {
        return this.field1251.method4939() || this.field1251.method4938() >= 200 && client.field974 != 1;
    }

    @ObfuscatedName("ct.b(Ljava/lang/String;B)V")
    public final void method1530(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1248);
        if (!var2.method5052()) {
            return;
        }
        if (this.method1531()) {
            method661(class252.field3181);
        } else if (Statics.field260.field824.equals(var2)) {
            method4324();
        } else if (this.method1559(var2)) {
            method673(arg0);
        } else if (this.method1569(var2, false)) {
            method77(arg0);
        } else {
            class185 var3 = class185.method2860(class182.field2440, client.field903.field1476);
            var3.field2501.method3209(class195.method1769(arg0));
            var3.field2501.method3216(arg0);
            client.field903.method1884(var3);
        }
    }

    @ObfuscatedName("ar.h(Ljava/lang/String;I)V")
    public static final void method673(String arg0) {
        method661(arg0 + class252.field3182);
    }

    @ObfuscatedName("l.n(Ljava/lang/String;B)V")
    public static final void method77(String arg0) {
        method661(class252.field3187 + arg0 + class252.field3188);
    }

    @ObfuscatedName("js.u(I)V")
    public static final void method4324() {
        method661(class252.field3184);
    }

    @ObfuscatedName("ct.q(I)Z")
    public final boolean method1531() {
        return this.field1250.method4939() || this.field1250.method4938() >= 100 && client.field974 != 1;
    }

    @ObfuscatedName("ct.g(Ljava/lang/String;I)V")
    public final void method1532(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1248);
        if (!var2.method5052()) {
            return;
        }
        if (this.field1251.method4965(var2)) {
            Statics.method2574();
            class185 var3 = class185.method2860(class182.field2380, client.field903.field1476);
            var3.field2501.method3209(class195.method1769(arg0));
            var3.field2501.method3216(arg0);
            client.field903.method1884(var3);
        }
        client.method3193();
    }

    @ObfuscatedName("ct.y(Ljava/lang/String;I)V")
    public final void method1554(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1248);
        if (!var2.method5052()) {
            return;
        }
        if (this.field1250.method4965(var2)) {
            Statics.method2574();
            class185 var3 = class185.method2860(class182.field2400, client.field903.field1476);
            var3.field2501.method3209(class195.method1769(arg0));
            var3.field2501.method3216(arg0);
            client.field903.method1884(var3);
        }
        Iterator var4 = class96.field1433.iterator();
        while (var4.hasNext()) {
            class71 var5 = (class71) var4.next();
            var5.method1002();
        }
        if (Statics.field444 != null) {
            Statics.field444.method5064();
        }
    }

    @ObfuscatedName("aw.s(Ljava/lang/String;II)V")
    public static final void method518(String arg0, int arg1) {
        class185 var2 = class185.method2860(class182.field2390, client.field903.field1476);
        var2.field2501.method3209(class195.method1769(arg0) + 1);
        var2.field2501.method3251(arg1);
        var2.field2501.method3216(arg0);
        client.field903.method1884(var2);
    }

    @ObfuscatedName("ct.ac(Lko;I)Z")
    public final boolean method1534(class306 arg0) {
        class307 var2 = (class307) this.field1251.method4941(arg0);
        return var2 != null && var2.method5009();
    }
}

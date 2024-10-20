package deob;

@ObfuscatedName("cd")
public class class80 {

    @ObfuscatedName("cd.r")
    public final class336 field1235;

    @ObfuscatedName("cd.e")
    public final class305 field1236;

    @ObfuscatedName("cd.y")
    public final class299 field1234;

    @ObfuscatedName("cd.k")
    public int field1239 = 0;

    public class80(class336 arg0) {
        this.field1235 = arg0;
        this.field1236 = new class305(arg0);
        this.field1234 = new class299(arg0);
    }

    @ObfuscatedName("cd.d(I)Z")
    public boolean method1572() {
        return this.field1239 == 2;
    }

    @ObfuscatedName("cd.z(I)V")
    public final void method1574() {
        this.field1239 = 1;
    }

    @ObfuscatedName("cd.n(Lgy;II)V")
    public final void method1582(class195 arg0, int arg1) {
        this.field1236.method5087(arg0, arg1);
        this.field1239 = 2;
        client.method53();
    }

    @ObfuscatedName("cd.r(I)V")
    public final void method1575() {
        for (class309 var1 = (class309) this.field1236.field3850.method3834(); var1 != null; var1 = (class309) this.field1236.field3850.method3840()) {
            if ((long) var1.field3866 < class197.method1501() / 1000L - 5L) {
                if (var1.field3865 > 0) {
                    class96.method140(5, "", var1.field3864 + class252.field3167);
                }
                if (var1.field3865 == 0) {
                    class96.method140(5, "", var1.field3864 + class252.field3066);
                }
                var1.method3843();
            }
        }
    }

    @ObfuscatedName("cd.e(B)V")
    public final void method1620() {
        this.field1239 = 0;
        this.field1236.method4999();
        this.field1234.method4999();
    }

    @ObfuscatedName("cd.y(Lko;ZI)Z")
    public final boolean method1630(class306 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field302.field848)) {
            return true;
        } else {
            return this.field1236.method5089(arg0, arg1);
        }
    }

    @ObfuscatedName("cd.k(Lko;B)Z")
    public final boolean method1578(class306 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1234.method5002(arg0);
        }
    }

    @ObfuscatedName("cd.s(Ljava/lang/String;I)V")
    public final void method1602(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1235);
        if (!var2.method5096()) {
            return;
        }
        if (this.method1586()) {
            method1008();
        } else if (Statics.field302.field848.equals(var2)) {
            method4();
        } else if (this.method1630(var2, false)) {
            method2507(arg0);
        } else if (this.method1578(var2)) {
            method4231(class252.field3280 + arg0 + class252.field3271);
        } else {
            Statics.method82(arg0);
        }
    }

    @ObfuscatedName("is.x(Ljava/lang/String;B)V")
    public static final void method4231(String arg0) {
        class96.method140(30, "", arg0);
    }

    @ObfuscatedName("bv.h(S)V")
    public static final void method1008() {
        method4231(class252.field3186);
    }

    @ObfuscatedName("dv.t(Ljava/lang/String;B)V")
    public static final void method2507(String arg0) {
        method4231(arg0 + class252.field3187);
    }

    @ObfuscatedName("z.i(I)V")
    public static final void method4() {
        method4231(class252.field3190);
    }

    @ObfuscatedName("cd.q(B)Z")
    public final boolean method1586() {
        return this.field1236.method5001() || this.field1236.method5000() >= 200 && client.field969 != 1;
    }

    @ObfuscatedName("cd.v(Ljava/lang/String;B)V")
    public final void method1581(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1235);
        if (!var2.method5096()) {
            return;
        }
        if (this.method1608()) {
            method4231(class252.field3165);
        } else if (Statics.field302.field848.equals(var2)) {
            method1903();
        } else if (this.method1578(var2)) {
            method2698(arg0);
        } else if (this.method1630(var2, false)) {
            method11(arg0);
        } else {
            class185 var3 = class185.method251(class182.field2412, client.field900.field1471);
            var3.field2497.method3243(class195.method240(arg0));
            var3.field2497.method3250(arg0);
            client.field900.method1921(var3);
        }
    }

    @ObfuscatedName("eu.f(Ljava/lang/String;I)V")
    public static final void method2698(String arg0) {
        method4231(arg0 + class252.field3189);
    }

    @ObfuscatedName("r.b(Ljava/lang/String;B)V")
    public static final void method11(String arg0) {
        method4231(class252.field3194 + arg0 + class252.field3195);
    }

    @ObfuscatedName("ca.c(I)V")
    public static final void method1903() {
        method4231(class252.field3191);
    }

    @ObfuscatedName("cd.w(I)Z")
    public final boolean method1608() {
        return this.field1234.method5001() || this.field1234.method5000() >= 100 && client.field969 != 1;
    }

    @ObfuscatedName("cd.o(Ljava/lang/String;I)V")
    public final void method1583(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1235);
        if (!var2.method5096()) {
            return;
        }
        if (this.field1236.method5005(var2)) {
            client.method178();
            class185 var3 = class185.method251(class182.field2378, client.field900.field1471);
            var3.field2497.method3243(class195.method240(arg0));
            var3.field2497.method3250(arg0);
            client.field900.method1921(var3);
        }
        client.method53();
    }

    @ObfuscatedName("cd.a(Ljava/lang/String;I)V")
    public final void method1584(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1235);
        if (!var2.method5096()) {
            return;
        }
        if (this.field1234.method5005(var2)) {
            client.method178();
            class185 var3 = class185.method251(class182.field2385, client.field900.field1471);
            var3.field2497.method3243(class195.method240(arg0));
            var3.field2497.method3250(arg0);
            client.field900.method1921(var3);
        }
        client.method468();
    }

    @ObfuscatedName("ao.ak(Ljava/lang/String;II)V")
    public static final void method502(String arg0, int arg1) {
        class185 var2 = class185.method251(class182.field2406, client.field900.field1471);
        var2.field2497.method3243(class195.method240(arg0) + 1);
        var2.field2497.method3250(arg0);
        var2.field2497.method3259(arg1);
        client.field900.method1921(var2);
    }

    @ObfuscatedName("cd.ap(Lko;B)Z")
    public final boolean method1588(class306 arg0) {
        class307 var2 = (class307) this.field1236.method5035(arg0);
        return var2 != null && var2.method5080();
    }
}

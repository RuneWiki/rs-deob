package deob;

@ObfuscatedName("cm")
public class class80 {

    @ObfuscatedName("cm.a")
    public final class336 field1232;

    @ObfuscatedName("cm.l")
    public final class305 field1230;

    @ObfuscatedName("cm.b")
    public final class299 field1234;

    @ObfuscatedName("cm.e")
    public int field1229 = 0;

    public class80(class336 arg0) {
        this.field1232 = arg0;
        this.field1230 = new class305(arg0);
        this.field1234 = new class299(arg0);
    }

    @ObfuscatedName("cm.t(I)Z")
    public boolean method1580() {
        return this.field1229 == 2;
    }

    @ObfuscatedName("cm.q(I)V")
    public final void method1611() {
        this.field1229 = 1;
    }

    @ObfuscatedName("cm.i(Lgb;IB)V")
    public final void method1582(class195 arg0, int arg1) {
        this.field1230.method5000(arg0, arg1);
        this.field1229 = 2;
        client.method1052();
    }

    @ObfuscatedName("cm.a(B)V")
    public final void method1610() {
        for (class309 var1 = (class309) this.field1230.field3853.method3766(); var1 != null; var1 = (class309) this.field1230.field3853.method3767()) {
            if ((long) var1.field3875 < Statics.method426() / 1000L - 5L) {
                if (var1.field3874 > 0) {
                    class96.method83(5, "", var1.field3873 + class252.field3072);
                }
                if (var1.field3874 == 0) {
                    class96.method83(5, "", var1.field3873 + class252.field3216);
                }
                var1.method3775();
            }
        }
    }

    @ObfuscatedName("cm.l(B)V")
    public final void method1584() {
        this.field1229 = 0;
        this.field1230.method4907();
        this.field1234.method4907();
    }

    @ObfuscatedName("cm.b(Lkb;ZI)Z")
    public final boolean method1585(class306 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field434.field820)) {
            return true;
        } else {
            return this.field1230.method5003(arg0, arg1);
        }
    }

    @ObfuscatedName("cm.e(Lkb;B)Z")
    public final boolean method1586(class306 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1234.method4973(arg0);
        }
    }

    @ObfuscatedName("cm.x(Ljava/lang/String;B)V")
    public final void method1641(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1232);
        if (!var2.method5005()) {
            return;
        }
        if (this.method1588()) {
            method600();
        } else if (Statics.field434.field820.equals(var2)) {
            method2336();
        } else if (this.method1585(var2, false)) {
            method670(arg0 + class252.field3175);
        } else if (this.method1586(var2)) {
            method5(arg0);
        } else {
            class185 var3 = class185.method343(class182.field2373, client.field1073.field1457);
            var3.field2478.method3220(class195.method126(arg0));
            var3.field2478.method3232(arg0);
            client.field1073.method1916(var3);
        }
    }

    @ObfuscatedName("ak.p(Ljava/lang/String;B)V")
    public static final void method670(String arg0) {
        class96.method83(30, "", arg0);
    }

    @ObfuscatedName("aq.o(I)V")
    public static final void method600() {
        method670(class252.field3190);
    }

    @ObfuscatedName("i.c(Ljava/lang/String;I)V")
    public static final void method5(String arg0) {
        method670(class252.field3194 + arg0 + class252.field3195);
    }

    @ObfuscatedName("de.u(I)V")
    public static final void method2336() {
        method670(class252.field3192);
    }

    @ObfuscatedName("cm.k(I)Z")
    public final boolean method1588() {
        return this.field1230.method4978() || this.field1230.method4908() >= 200 && client.field967 != 1;
    }

    @ObfuscatedName("cm.z(Ljava/lang/String;I)V")
    public final void method1628(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1232);
        if (!var2.method5005()) {
            return;
        }
        if (this.method1590()) {
            method38();
        } else if (Statics.field434.field820.equals(var2)) {
            method670(class252.field3193);
        } else if (this.method1586(var2)) {
            method4380(arg0);
        } else if (this.method1585(var2, false)) {
            method3838(arg0);
        } else {
            class185 var3 = class185.method343(class182.field2352, client.field1073.field1457);
            var3.field2478.method3220(class195.method126(arg0));
            var3.field2478.method3232(arg0);
            client.field1073.method1916(var3);
        }
    }

    @ObfuscatedName("p.w(B)V")
    public static final void method38() {
        method670(class252.field3125);
    }

    @ObfuscatedName("jj.s(Ljava/lang/String;I)V")
    public static final void method4380(String arg0) {
        method670(arg0 + class252.field3048);
    }

    @ObfuscatedName("hi.d(Ljava/lang/String;I)V")
    public static final void method3838(String arg0) {
        method670(class252.field3196 + arg0 + class252.field3055);
    }

    @ObfuscatedName("cm.f(I)Z")
    public final boolean method1590() {
        return this.field1234.method4978() || this.field1234.method4908() >= 100 && client.field967 != 1;
    }

    @ObfuscatedName("cm.r(Ljava/lang/String;I)V")
    public final void method1591(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1232);
        if (!var2.method5005()) {
            return;
        }
        if (this.field1230.method4914(var2)) {
            client.method673();
            class185 var3 = class185.method343(class182.field2440, client.field1073.field1457);
            var3.field2478.method3220(class195.method126(arg0));
            var3.field2478.method3232(arg0);
            client.field1073.method1916(var3);
        }
        client.method1052();
    }

    @ObfuscatedName("cm.y(Ljava/lang/String;B)V")
    public final void method1592(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1232);
        if (!var2.method5005()) {
            return;
        }
        if (this.field1234.method4914(var2)) {
            client.method673();
            class185 var3 = class185.method343(class182.field2413, client.field1073.field1457);
            var3.field2478.method3220(class195.method126(arg0));
            var3.field2478.method3232(arg0);
            client.field1073.method1916(var3);
        }
        class96.method182();
        if (Statics.field616 != null) {
            Statics.field616.method5043();
        }
    }

    @ObfuscatedName("cm.h(Lkb;S)Z")
    public final boolean method1593(class306 arg0) {
        class307 var2 = (class307) this.field1230.method4911(arg0);
        return var2 != null && var2.method4986();
    }
}

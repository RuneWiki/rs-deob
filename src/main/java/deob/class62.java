package deob;

@ObfuscatedName("bg")
public class class62 {

    @ObfuscatedName("bg.v")
    public final class424 field792;

    @ObfuscatedName("bg.c")
    public final class367 field793;

    @ObfuscatedName("bg.q")
    public final class365 field791;

    @ObfuscatedName("bg.i")
    public int field795 = 0;

    public class62(class424 arg0) {
        this.field792 = arg0;
        this.field793 = new class367(arg0);
        this.field791 = new class365(arg0);
    }

    @ObfuscatedName("bg.s(I)Z")
    public boolean method1529() {
        return this.field795 == 2;
    }

    @ObfuscatedName("bg.h(B)V")
    public final void method1604() {
        this.field795 = 1;
    }

    @ObfuscatedName("bg.w(Lqr;II)V")
    public final void method1531(class444 arg0, int arg1) {
        this.field793.method5933(arg0, arg1);
        this.field795 = 2;
        client.method4656();
    }

    @ObfuscatedName("bg.v(I)V")
    public final void method1555() {
        for (class370 var1 = (class370) this.field793.field4284.method5549(); var1 != null; var1 = (class370) this.field793.field4284.method5550()) {
            if ((long) var1.field4297 < class270.method3146() / 1000L - 5L) {
                if (var1.field4300 > 0) {
                    class99.method2996(5, "", var1.field4298 + class309.field3726);
                }
                if (var1.field4300 == 0) {
                    class99.method2996(5, "", var1.field4298 + class309.field3899);
                }
                var1.method6404();
            }
        }
    }

    @ObfuscatedName("bg.c(I)V")
    public final void method1533() {
        this.field795 = 0;
        this.field793.method6020();
        this.field791.method6020();
    }

    @ObfuscatedName("bg.q(Lqy;ZI)Z")
    public final boolean method1534(class465 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field454.field1110)) {
            return true;
        } else {
            return this.field793.method5932(arg0, arg1);
        }
    }

    @ObfuscatedName("bg.i(Lqy;I)Z")
    public final boolean method1550(class465 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field791.method6022(arg0);
        }
    }

    @ObfuscatedName("bg.k(Ljava/lang/String;I)V")
    public final void method1536(String arg0) {
        if (arg0 == null) {
            return;
        }
        class465 var2 = new class465(arg0, this.field792);
        if (!var2.method7489()) {
            return;
        }
        if (this.method1537()) {
            class309 var10000 = (class309) null;
            String var3 = class309.field3795;
            class99.method2996(30, "", var3);
        } else if (Statics.field454.field1110.equals(var2)) {
            method4640();
        } else if (this.method1534(var2, false)) {
            method4086(arg0);
        } else if (this.method1550(var2)) {
            method2635(arg0);
        } else {
            class265 var4 = class265.method349(class263.field3010, client.field536.field1339);
            var4.field3039.method6912(class444.method5118(arg0));
            var4.field3039.method6950(arg0);
            client.field536.method2330(var4);
        }
    }

    @ObfuscatedName("c.o(Ljava/lang/String;I)V")
    public static final void method18(String arg0) {
        class99.method2996(30, "", arg0);
    }

    @ObfuscatedName("hm.n(Ljava/lang/String;I)V")
    public static final void method4086(String arg0) {
        method18(arg0 + class309.field3796);
    }

    @ObfuscatedName("dh.d(Ljava/lang/String;B)V")
    public static final void method2635(String arg0) {
        method18(class309.field3902 + arg0 + class309.field3785);
    }

    @ObfuscatedName("jj.a(I)V")
    public static final void method4640() {
        method18(class309.field3799);
    }

    @ObfuscatedName("bg.m(I)Z")
    public final boolean method1537() {
        return this.field793.method6021() || this.field793.method6067() >= 200 && client.field593 != 1;
    }

    @ObfuscatedName("bg.u(Ljava/lang/String;B)V")
    public final void method1538(String arg0) {
        if (arg0 == null) {
            return;
        }
        class465 var2 = new class465(arg0, this.field792);
        if (!var2.method7489()) {
            return;
        }
        if (this.method1539()) {
            method18(class309.field3797);
        } else if (Statics.field454.field1110.equals(var2)) {
            method4623();
        } else if (this.method1550(var2)) {
            method4504(arg0);
        } else if (this.method1534(var2, false)) {
            method2417(arg0);
        } else {
            method2447(arg0);
        }
    }

    @ObfuscatedName("it.l(Ljava/lang/String;B)V")
    public static final void method4504(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class309 var10001 = (class309) null;
        String var1 = var10000.append(class309.field3819).toString();
        class99.method2996(30, "", var1);
    }

    @ObfuscatedName("du.z(Ljava/lang/String;I)V")
    public static final void method2417(String arg0) {
        method18(class309.field3803 + arg0 + class309.field3690);
    }

    @ObfuscatedName("jg.r(I)V")
    public static final void method4623() {
        method18(class309.field3694);
    }

    @ObfuscatedName("dy.y(Ljava/lang/String;B)V")
    public static final void method2447(String arg0) {
        class265 var1 = class265.method349(class263.field2947, client.field536.field1339);
        var1.field3039.method6912(class444.method5118(arg0));
        var1.field3039.method6950(arg0);
        client.field536.method2330(var1);
    }

    @ObfuscatedName("bg.p(B)Z")
    public final boolean method1539() {
        return this.field791.method6021() || this.field791.method6067() >= 100 && client.field593 != 1;
    }

    @ObfuscatedName("bg.e(Ljava/lang/String;I)V")
    public final void method1598(String arg0) {
        if (arg0 == null) {
            return;
        }
        class465 var2 = new class465(arg0, this.field792);
        if (!var2.method7489()) {
            return;
        }
        if (this.field793.method6039(var2)) {
            client.method3171();
            class265 var3 = class265.method349(class263.field2963, client.field536.field1339);
            var3.field3039.method6912(class444.method5118(arg0));
            var3.field3039.method6950(arg0);
            client.field536.method2330(var3);
        }
        client.method4656();
    }

    @ObfuscatedName("bg.b(Ljava/lang/String;I)V")
    public final void method1553(String arg0) {
        if (arg0 == null) {
            return;
        }
        class465 var2 = new class465(arg0, this.field792);
        if (!var2.method7489()) {
            return;
        }
        if (this.field791.method6039(var2)) {
            client.method3171();
            class265 var3 = class265.method349(class263.field2918, client.field536.field1339);
            var3.field3039.method6912(class444.method5118(arg0));
            var3.field3039.method6950(arg0);
            client.field536.method2330(var3);
        }
        client.method3188();
    }

    @ObfuscatedName("fk.x(Ljava/lang/String;II)V")
    public static final void method2905(String arg0, int arg1) {
        class265 var2 = class265.method349(class263.field2973, client.field536.field1339);
        var2.field3039.method6912(class444.method5118(arg0) + 1);
        var2.field3039.method7171(arg1);
        var2.field3039.method6950(arg0);
        client.field536.method2330(var2);
    }

    @ObfuscatedName("bg.f(Lqy;B)Z")
    public final boolean method1541(class465 arg0) {
        class369 var2 = (class369) this.field793.method6024(arg0);
        return var2 != null && var2.method6096();
    }
}

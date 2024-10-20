package deob;

@ObfuscatedName("bw")
public class class62 {

    @ObfuscatedName("bw.e")
    public final class405 field809;

    @ObfuscatedName("bw.r")
    public final class350 field807;

    @ObfuscatedName("bw.o")
    public final class348 field808;

    @ObfuscatedName("bw.i")
    public int field811 = 0;

    public class62(class405 arg0) {
        this.field809 = arg0;
        this.field807 = new class350(arg0);
        this.field808 = new class348(arg0);
    }

    @ObfuscatedName("bw.c(I)Z")
    public boolean method1582() {
        return this.field811 == 2;
    }

    @ObfuscatedName("bw.l(B)V")
    public final void method1611() {
        this.field811 = 1;
    }

    @ObfuscatedName("bw.s(Lpi;II)V")
    public final void method1584(class421 arg0, int arg1) {
        this.field807.method5691(arg0, arg1);
        this.field811 = 2;
        client.method4946();
    }

    @ObfuscatedName("bw.e(I)V")
    public final void method1612() {
        for (class353 var1 = (class353) this.field807.field4133.method5384(); var1 != null; var1 = (class353) this.field807.field4133.method5388()) {
            if ((long) var1.field4149 < class262.method4787() / 1000L - 5L) {
                if (var1.field4151 > 0) {
                    class98.method2081(5, "", var1.field4150 + class300.field3684);
                }
                if (var1.field4151 == 0) {
                    class98.method2081(5, "", var1.field4150 + class300.field3793);
                }
                var1.method6161();
            }
        }
    }

    @ObfuscatedName("bw.r(B)V")
    public final void method1586() {
        this.field811 = 0;
        this.field807.method5785();
        this.field808.method5785();
    }

    @ObfuscatedName("bw.o(Lpb;ZI)Z")
    public final boolean method1587(class442 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2754.field1073)) {
            return true;
        } else {
            return this.field807.method5690(arg0, arg1);
        }
    }

    @ObfuscatedName("bw.i(Lpb;B)Z")
    public final boolean method1588(class442 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field808.method5787(arg0);
        }
    }

    @ObfuscatedName("bw.w(Ljava/lang/String;I)V")
    public final void method1589(String arg0) {
        if (arg0 == null) {
            return;
        }
        class442 var2 = new class442(arg0, this.field809);
        if (!var2.method7230()) {
            return;
        }
        class300 var9;
        if (this.method1590()) {
            var9 = (class300) null;
            String var3 = class300.field3703;
            class98.method2081(30, "", var3);
        } else if (Statics.field2754.field1073.equals(var2)) {
            var9 = (class300) null;
            String var4 = class300.field3707;
            class98.method2081(30, "", var4);
        } else {
            StringBuilder var10000;
            class300 var10001;
            if (this.method1587(var2, false)) {
                var10000 = (new StringBuilder()).append(arg0);
                var10001 = (class300) null;
                String var5 = var10000.append(class300.field3704).toString();
                class98.method2081(30, "", var5);
            } else if (this.method1588(var2)) {
                var10000 = new StringBuilder();
                var10001 = (class300) null;
                StringBuilder var8 = var10000.append(class300.field3709).append(arg0);
                class300 var10 = (class300) null;
                String var6 = var8.append(class300.field3710).toString();
                class98.method2081(30, "", var6);
            } else {
                class257 var7 = class257.method2630(class255.field2918, client.field551.field1319);
                var7.field2960.method6644(class421.method5127(arg0));
                var7.field2960.method6654(arg0);
                client.field551.method2268(var7);
            }
        }
    }

    @ObfuscatedName("bw.v(I)Z")
    public final boolean method1590() {
        return this.field807.method5786() || this.field807.method5790() >= 200 && client.field773 != 1;
    }

    @ObfuscatedName("bw.a(Ljava/lang/String;B)V")
    public final void method1598(String arg0) {
        if (arg0 == null) {
            return;
        }
        class442 var2 = new class442(arg0, this.field809);
        if (!var2.method7230()) {
            return;
        }
        class300 var7;
        if (this.method1595()) {
            var7 = (class300) null;
            String var3 = class300.field3705;
            class98.method2081(30, "", var3);
        } else if (Statics.field2754.field1073.equals(var2)) {
            var7 = (class300) null;
            String var4 = class300.field3722;
            class98.method2081(30, "", var4);
        } else if (this.method1588(var2)) {
            method4098(arg0);
        } else if (this.method1587(var2, false)) {
            StringBuilder var10000 = new StringBuilder();
            class300 var10001 = (class300) null;
            StringBuilder var6 = var10000.append(class300.field3656).append(arg0);
            class300 var8 = (class300) null;
            String var5 = var6.append(class300.field3711).toString();
            class98.method2081(30, "", var5);
        } else {
            method6584(arg0);
        }
    }

    @ObfuscatedName("hm.y(Ljava/lang/String;I)V")
    public static final void method4098(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class300 var10001 = (class300) null;
        String var1 = var10000.append(class300.field3532).toString();
        class98.method2081(30, "", var1);
    }

    @ObfuscatedName("oi.u(Ljava/lang/String;I)V")
    public static final void method6584(String arg0) {
        class257 var1 = class257.method2630(class255.field2922, client.field551.field1319);
        var1.field2960.method6644(class421.method5127(arg0));
        var1.field2960.method6654(arg0);
        client.field551.method2268(var1);
    }

    @ObfuscatedName("bw.h(B)Z")
    public final boolean method1595() {
        return this.field808.method5786() || this.field808.method5790() >= 100 && client.field773 != 1;
    }

    @ObfuscatedName("bw.q(Ljava/lang/String;I)V")
    public final void method1593(String arg0) {
        if (arg0 == null) {
            return;
        }
        class442 var2 = new class442(arg0, this.field809);
        if (!var2.method7230()) {
            return;
        }
        if (this.field807.method5791(var2)) {
            client.method6557();
            class257 var3 = class257.method2630(class255.field2903, client.field551.field1319);
            var3.field2960.method6644(class421.method5127(arg0));
            var3.field2960.method6654(arg0);
            client.field551.method2268(var3);
        }
        client.method4946();
    }

    @ObfuscatedName("bw.x(Ljava/lang/String;B)V")
    public final void method1594(String arg0) {
        if (arg0 == null) {
            return;
        }
        class442 var2 = new class442(arg0, this.field809);
        if (!var2.method7230()) {
            return;
        }
        if (this.field808.method5791(var2)) {
            client.method6557();
            class257 var3 = class257.method2630(class255.field2917, client.field551.field1319);
            var3.field2960.method6644(class421.method5127(arg0));
            var3.field2960.method6654(arg0);
            client.field551.method2268(var3);
        }
        client.method1996();
    }

    @ObfuscatedName("h.p(Ljava/lang/String;IB)V")
    public static final void method154(String arg0, int arg1) {
        class257 var2 = class257.method2630(class255.field2908, client.field551.field1319);
        var2.field2960.method6644(class421.method5127(arg0) + 1);
        var2.field2960.method6654(arg0);
        var2.field2960.method6644(arg1);
        client.field551.method2268(var2);
    }

    @ObfuscatedName("bw.n(Lpb;I)Z")
    public final boolean method1583(class442 arg0) {
        class351 var2 = (class351) this.field807.method5784(arg0);
        return var2 != null && var2.method5868();
    }
}

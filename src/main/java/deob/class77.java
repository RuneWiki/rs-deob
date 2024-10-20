package deob;

@ObfuscatedName("by")
public class class77 {

    @ObfuscatedName("by.y")
    public final class365 field941;

    @ObfuscatedName("by.p")
    public final class317 field945;

    @ObfuscatedName("by.j")
    public final class315 field946;

    @ObfuscatedName("by.r")
    public int field942 = 0;

    public class77(class365 arg0) {
        this.field941 = arg0;
        this.field945 = new class317(arg0);
        this.field946 = new class315(arg0);
    }

    @ObfuscatedName("by.v(I)Z")
    public boolean method1506() {
        return this.field942 == 2;
    }

    @ObfuscatedName("by.n(B)V")
    public final void method1515() {
        this.field942 = 1;
    }

    @ObfuscatedName("by.f(Lnd;IB)V")
    public final void method1508(class383 arg0, int arg1) {
        this.field945.method5158(arg0, arg1);
        this.field942 = 2;
        client.method4221();
    }

    @ObfuscatedName("by.y(I)V")
    public final void method1509() {
        for (class320 var1 = (class320) this.field945.field3810.method4835(); var1 != null; var1 = (class320) this.field945.field3810.method4838()) {
            if ((long) var1.field3829 < class380.method2744() / 1000L - 5L) {
                if (var1.field3828 > 0) {
                    class111.method1459(5, "", var1.field3827 + class268.field3385);
                }
                if (var1.field3828 == 0) {
                    class111.method1459(5, "", var1.field3827 + class268.field3457);
                }
                var1.method5484();
            }
        }
    }

    @ObfuscatedName("by.p(B)V")
    public final void method1510() {
        this.field942 = 0;
        this.field945.method5284();
        this.field946.method5284();
    }

    @ObfuscatedName("by.j(Lly;ZI)Z")
    public final boolean method1511(class328 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1163.field1199)) {
            return true;
        } else {
            return this.field945.method5157(arg0, arg1);
        }
    }

    @ObfuscatedName("by.r(Lly;I)Z")
    public final boolean method1512(class328 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field946.method5248(arg0);
        }
    }

    @ObfuscatedName("by.b(Ljava/lang/String;I)V")
    public final void method1539(String arg0) {
        if (arg0 == null) {
            return;
        }
        class328 var2 = new class328(arg0, this.field941);
        if (!var2.method5339()) {
            return;
        }
        if (this.method1519()) {
            method1862();
        } else if (Statics.field1163.field1199.equals(var2)) {
            class268 var7 = (class268) null;
            String var3 = class268.field3408;
            class111.method1459(30, "", var3);
        } else if (this.method1511(var2, false)) {
            method3245(arg0);
        } else if (this.method1512(var2)) {
            StringBuilder var10000 = new StringBuilder();
            class268 var10001 = (class268) null;
            StringBuilder var6 = var10000.append(class268.field3463).append(arg0);
            class268 var8 = (class268) null;
            String var4 = var6.append(class268.field3429).toString();
            class111.method1459(30, "", var4);
        } else {
            class227 var5 = class227.method171(class225.field2665, client.field688.field1415);
            var5.field2693.method6043(class383.method1863(arg0));
            var5.field2693.method5955(arg0);
            client.field688.method2167(var5);
        }
    }

    @ObfuscatedName("cg.d(I)V")
    public static final void method1862() {
        class268 var10000 = (class268) null;
        String var0 = class268.field3404;
        class111.method1459(30, "", var0);
    }

    @ObfuscatedName("ff.s(Ljava/lang/String;B)V")
    public static final void method3245(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class268 var10001 = (class268) null;
        String var1 = var10000.append(class268.field3337).toString();
        class111.method1459(30, "", var1);
    }

    @ObfuscatedName("by.u(I)Z")
    public final boolean method1519() {
        return this.field945.method5312() || this.field945.method5246() >= 200 && client.field760 != 1;
    }

    @ObfuscatedName("by.l(Ljava/lang/String;B)V")
    public final void method1505(String arg0) {
        if (arg0 == null) {
            return;
        }
        class328 var2 = new class328(arg0, this.field941);
        if (!var2.method5339()) {
            return;
        }
        class268 var9;
        if (this.method1525()) {
            var9 = (class268) null;
            String var3 = class268.field3406;
            class111.method1459(30, "", var3);
        } else if (Statics.field1163.field1199.equals(var2)) {
            var9 = (class268) null;
            String var4 = class268.field3468;
            class111.method1459(30, "", var4);
        } else {
            StringBuilder var10000;
            class268 var10001;
            if (this.method1512(var2)) {
                var10000 = (new StringBuilder()).append(arg0);
                var10001 = (class268) null;
                String var5 = var10000.append(class268.field3407).toString();
                class111.method1459(30, "", var5);
            } else if (this.method1511(var2, false)) {
                var10000 = new StringBuilder();
                var10001 = (class268) null;
                StringBuilder var8 = var10000.append(class268.field3346).append(arg0);
                class268 var10 = (class268) null;
                String var6 = var8.append(class268.field3355).toString();
                class111.method1459(30, "", var6);
            } else {
                class227 var7 = class227.method171(class225.field2623, client.field688.field1415);
                var7.field2693.method6043(class383.method1863(arg0));
                var7.field2693.method5955(arg0);
                client.field688.method2167(var7);
            }
        }
    }

    @ObfuscatedName("by.o(I)Z")
    public final boolean method1525() {
        return this.field946.method5312() || this.field946.method5246() >= 100 && client.field760 != 1;
    }

    @ObfuscatedName("by.c(Ljava/lang/String;I)V")
    public final void method1517(String arg0) {
        if (arg0 == null) {
            return;
        }
        class328 var2 = new class328(arg0, this.field941);
        if (!var2.method5339()) {
            return;
        }
        if (this.field945.method5266(var2)) {
            client.method910();
            class227 var3 = class227.method171(class225.field2672, client.field688.field1415);
            var3.field2693.method6043(class383.method1863(arg0));
            var3.field2693.method5955(arg0);
            client.field688.method2167(var3);
        }
        client.method4221();
    }

    @ObfuscatedName("by.e(Ljava/lang/String;I)V")
    public final void method1518(String arg0) {
        if (arg0 == null) {
            return;
        }
        class328 var2 = new class328(arg0, this.field941);
        if (!var2.method5339()) {
            return;
        }
        if (this.field946.method5266(var2)) {
            client.method910();
            class227 var3 = class227.method171(class225.field2656, client.field688.field1415);
            var3.field2693.method6043(class383.method1863(arg0));
            var3.field2693.method5955(arg0);
            client.field688.method2167(var3);
        }
        client.method1909();
    }

    @ObfuscatedName("em.g(Ljava/lang/String;II)V")
    public static final void method2555(String arg0, int arg1) {
        class227 var2 = class227.method171(class225.field2622, client.field688.field1415);
        var2.field2693.method6043(class383.method1863(arg0) + 1);
        var2.field2693.method5955(arg0);
        var2.field2693.method5983(arg1);
        client.field688.method2167(var2);
    }

    @ObfuscatedName("by.a(Lly;B)Z")
    public final boolean method1561(class328 arg0) {
        class319 var2 = (class319) this.field945.method5249(arg0);
        return var2 != null && var2.method5331();
    }
}

package deob;

import java.util.Iterator;

@ObfuscatedName("bq")
public class class69 {

    @ObfuscatedName("bq.k")
    public final class326 field1008;

    @ObfuscatedName("bq.u")
    public final class293 field1014;

    @ObfuscatedName("bq.i")
    public final class287 field1010;

    @ObfuscatedName("bq.t")
    public int field1007 = 0;

    public class69(class326 arg0) {
        this.field1008 = arg0;
        this.field1014 = new class293(arg0);
        this.field1010 = new class287(arg0);
    }

    @ObfuscatedName("bq.v(B)Z")
    public boolean method1536() {
        return this.field1007 == 2;
    }

    @ObfuscatedName("bq.s(B)V")
    public final void method1537() {
        this.field1007 = 1;
    }

    @ObfuscatedName("bq.o(Lgx;IB)V")
    public final void method1538(class185 arg0, int arg1) {
        this.field1014.method5077(arg0, arg1);
        this.field1007 = 2;
        for (int var3 = 0; var3 < class84.field1199; var3++) {
            class62 var4 = client.field735[class84.field1205[var3]];
            var4.method1055();
        }
        class86.method1470();
        if (Statics.field65 != null) {
            Statics.field65.method5115();
        }
    }

    @ObfuscatedName("bq.k(I)V")
    public final void method1539() {
        for (class297 var1 = (class297) this.field1014.field3673.method3836(); var1 != null; var1 = (class297) this.field1014.field3673.method3833()) {
            if ((long) var1.field3697 < class187.method3154() / 1000L - 5L) {
                if (var1.field3694 > 0) {
                    class86.method1515(5, "", var1.field3693 + class240.field2971);
                }
                if (var1.field3694 == 0) {
                    class86.method1515(5, "", var1.field3693 + class240.field3112);
                }
                var1.method3839();
            }
        }
    }

    @ObfuscatedName("bq.u(I)V")
    public final void method1540() {
        this.field1007 = 0;
        this.field1014.method4990();
        this.field1010.method4990();
    }

    @ObfuscatedName("bq.i(Lkk;ZI)Z")
    public final boolean method1560(class294 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field341.field593)) {
            return true;
        } else {
            return this.field1014.method5076(arg0, arg1);
        }
    }

    @ObfuscatedName("bq.t(Lkk;B)Z")
    public final boolean method1588(class294 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1010.method4993(arg0);
        }
    }

    @ObfuscatedName("bq.c(Ljava/lang/String;S)V")
    public final void method1549(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1008);
        if (!var2.method5084()) {
            return;
        }
        if (this.method1541()) {
            method182();
        } else if (Statics.field341.field593.equals(var2)) {
            method199();
        } else if (this.method1560(var2, false)) {
            method543(arg0 + class240.field2991);
        } else if (this.method1588(var2)) {
            method543(class240.field2996 + arg0 + class240.field2997);
        } else {
            class175 var3 = class175.method107(class172.field2274, client.field830.field1266);
            var3.field2311.method3258(class185.method3230(arg0));
            var3.field2311.method3265(arg0);
            client.field830.method1875(var3);
        }
    }

    @ObfuscatedName("ar.w(Ljava/lang/String;B)V")
    public static final void method543(String arg0) {
        class86.method1515(30, "", arg0);
    }

    @ObfuscatedName("e.a(I)V")
    public static final void method182() {
        method543(class240.field2990);
    }

    @ObfuscatedName("q.z(B)V")
    public static final void method199() {
        method543(class240.field3007);
    }

    @ObfuscatedName("bq.e(B)Z")
    public final boolean method1541() {
        return this.field1014.method4992() || this.field1014.method4991() >= 200 && client.field673 != 1;
    }

    @ObfuscatedName("bq.q(Ljava/lang/String;S)V")
    public final void method1543(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1008);
        if (!var2.method5084()) {
            return;
        }
        if (this.method1587()) {
            method543(class240.field2976);
        } else if (Statics.field341.field593.equals(var2)) {
            method212();
        } else if (this.method1588(var2)) {
            method893(arg0);
        } else if (this.method1560(var2, false)) {
            method109(arg0);
        } else {
            method1891(arg0);
        }
    }

    @ObfuscatedName("ai.j(Ljava/lang/String;I)V")
    public static final void method893(String arg0) {
        method543(arg0 + class240.field2993);
    }

    @ObfuscatedName("b.y(Ljava/lang/String;I)V")
    public static final void method109(String arg0) {
        method543(class240.field2998 + arg0 + class240.field2862);
    }

    @ObfuscatedName("y.m(I)V")
    public static final void method212() {
        method543(class240.field2995);
    }

    @ObfuscatedName("cn.h(Ljava/lang/String;B)V")
    public static final void method1891(String arg0) {
        class175 var1 = class175.method107(class172.field2251, client.field830.field1266);
        var1.field2311.method3258(class185.method3230(arg0));
        var1.field2311.method3265(arg0);
        client.field830.method1875(var1);
    }

    @ObfuscatedName("bq.x(I)Z")
    public final boolean method1587() {
        return this.field1010.method4992() || this.field1010.method4991() >= 100 && client.field673 != 1;
    }

    @ObfuscatedName("bq.f(Ljava/lang/String;B)V")
    public final void method1546(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1008);
        if (!var2.method5084()) {
            return;
        }
        if (this.field1014.method4996(var2)) {
            client.field758 = client.field765;
            class175 var3 = class175.method107(class172.field2229, client.field830.field1266);
            var3.field2311.method3258(class185.method3230(arg0));
            var3.field2311.method3265(arg0);
            client.field830.method1875(var3);
        }
        for (int var4 = 0; var4 < class84.field1199; var4++) {
            class62 var5 = client.field735[class84.field1205[var4]];
            var5.method1055();
        }
        class86.method1470();
        if (Statics.field65 != null) {
            Statics.field65.method5115();
        }
    }

    @ObfuscatedName("bq.r(Ljava/lang/String;B)V")
    public final void method1565(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1008);
        if (!var2.method5084()) {
            return;
        }
        if (this.field1010.method4996(var2)) {
            client.field758 = client.field765;
            class175 var3 = class175.method107(class172.field2259, client.field830.field1266);
            var3.field2311.method3258(class185.method3230(arg0));
            var3.field2311.method3265(arg0);
            client.field830.method1875(var3);
        }
        Iterator var4 = class86.field1227.iterator();
        while (var4.hasNext()) {
            class60 var5 = (class60) var4.next();
            var5.method996();
        }
        if (Statics.field65 != null) {
            Statics.field65.method5116();
        }
    }

    @ObfuscatedName("bq.n(Lkk;I)Z")
    public final boolean method1548(class294 arg0) {
        class295 var2 = (class295) this.field1014.method5013(arg0);
        return var2 != null && var2.method5069();
    }
}

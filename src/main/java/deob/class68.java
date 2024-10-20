package deob;

import java.util.Iterator;

@ObfuscatedName("bm")
public class class68 {

    @ObfuscatedName("bm.b")
    public final class323 field989;

    @ObfuscatedName("bm.f")
    public final class291 field990;

    @ObfuscatedName("bm.n")
    public final class285 field994;

    @ObfuscatedName("bm.h")
    public int field995 = 0;

    public class68(class323 arg0) {
        this.field989 = arg0;
        this.field990 = new class291(arg0);
        this.field994 = new class285(arg0);
    }

    @ObfuscatedName("bm.w(I)Z")
    public boolean method1547() {
        return this.field995 == 2;
    }

    @ObfuscatedName("bm.m(I)V")
    public final void method1548() {
        this.field995 = 1;
    }

    @ObfuscatedName("bm.q(Lgy;II)V")
    public final void method1549(class183 arg0, int arg1) {
        this.field990.method5041(arg0, arg1);
        this.field995 = 2;
        for (int var3 = 0; var3 < class82.field1181; var3++) {
            class61 var4 = client.field807[class82.field1182[var3]];
            var4.method1067();
        }
        Iterator var5 = class84.field1204.iterator();
        while (var5.hasNext()) {
            class59 var6 = (class59) var5.next();
            var6.method1004();
        }
        if (Statics.field3 != null) {
            Statics.field3.method5091();
        }
    }

    @ObfuscatedName("bm.x(I)V")
    public final void method1582() {
        for (class295 var1 = (class295) this.field990.field3659.method3823(); var1 != null; var1 = (class295) this.field990.field3659.method3822()) {
            if ((long) var1.field3677 < class185.method3151() / 1000L - 5L) {
                if (var1.field3678 > 0) {
                    class84.method1098(5, "", var1.field3676 + class238.field2962);
                }
                if (var1.field3678 == 0) {
                    class84.method1098(5, "", var1.field3676 + class238.field2963);
                }
                var1.method3832();
            }
        }
    }

    @ObfuscatedName("bm.j(I)V")
    public final void method1551() {
        this.field995 = 0;
        this.field990.method4951();
        this.field994.method4951();
    }

    @ObfuscatedName("bm.a(Lkm;ZI)Z")
    public final boolean method1552(class292 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1949.field588)) {
            return true;
        } else {
            return this.field990.method5044(arg0, arg1);
        }
    }

    @ObfuscatedName("bm.l(Lkm;I)Z")
    public final boolean method1553(class292 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field994.method4954(arg0);
        }
    }

    @ObfuscatedName("bm.d(Ljava/lang/String;B)V")
    public final void method1556(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field989);
        if (!var2.method5049()) {
            return;
        }
        if (this.method1555()) {
            method3145(class238.field2981);
        } else if (Statics.field1949.field588.equals(var2)) {
            method3192();
        } else if (this.method1552(var2, false)) {
            method2874(arg0);
        } else if (this.method1553(var2)) {
            method113(arg0);
        } else {
            method2925(arg0);
        }
    }

    @ObfuscatedName("fm.s(Ljava/lang/String;I)V")
    public static final void method3145(String arg0) {
        class84.method1098(30, "", arg0);
    }

    @ObfuscatedName("ec.p(Ljava/lang/String;I)V")
    public static final void method2874(String arg0) {
        method3145(arg0 + class238.field2982);
    }

    @ObfuscatedName("d.g(Ljava/lang/String;S)V")
    public static final void method113(String arg0) {
        method3145(class238.field2987 + arg0 + class238.field2939);
    }

    @ObfuscatedName("fv.y(I)V")
    public static final void method3192() {
        method3145(class238.field2985);
    }

    @ObfuscatedName("ek.c(Ljava/lang/String;B)V")
    public static final void method2925(String arg0) {
        class173 var1 = class173.method2882(class170.field2238, client.field740.field1251);
        var1.field2280.method3246(class183.method124(arg0));
        var1.field2280.method3243(arg0);
        client.field740.method1873(var1);
    }

    @ObfuscatedName("bm.e(I)Z")
    public final boolean method1555() {
        return this.field990.method4953() || this.field990.method4952() >= 200 && client.field711 != 1;
    }

    @ObfuscatedName("bm.t(Ljava/lang/String;B)V")
    public final void method1554(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field989);
        if (!var2.method5049()) {
            return;
        }
        if (this.method1557()) {
            method629();
        } else if (Statics.field1949.field588.equals(var2)) {
            method3145(class238.field3099);
        } else if (this.method1553(var2)) {
            Statics.method116(arg0);
        } else if (this.method1552(var2, false)) {
            method3145(class238.field2855 + arg0 + class238.field2990);
        } else {
            method1716(arg0);
        }
    }

    @ObfuscatedName("ao.u(I)V")
    public static final void method629() {
        method3145(class238.field2983);
    }

    @ObfuscatedName("bh.r(Ljava/lang/String;I)V")
    public static final void method1716(String arg0) {
        class173 var1 = class173.method2882(class170.field2164, client.field740.field1251);
        var1.field2280.method3246(class183.method124(arg0));
        var1.field2280.method3243(arg0);
        client.field740.method1873(var1);
    }

    @ObfuscatedName("bm.v(B)Z")
    public final boolean method1557() {
        return this.field994.method4953() || this.field994.method4952() >= 100 && client.field711 != 1;
    }

    @ObfuscatedName("bm.o(Ljava/lang/String;B)V")
    public final void method1558(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field989);
        if (!var2.method5049()) {
            return;
        }
        if (this.field990.method5002(var2)) {
            client.field743 = client.field776;
            class173 var3 = class173.method2882(class170.field2251, client.field740.field1251);
            var3.field2280.method3246(class183.method124(arg0));
            var3.field2280.method3243(arg0);
            client.field740.method1873(var3);
        }
        for (int var4 = 0; var4 < class82.field1181; var4++) {
            class61 var5 = client.field807[class82.field1182[var4]];
            var5.method1067();
        }
        Iterator var6 = class84.field1204.iterator();
        while (var6.hasNext()) {
            class59 var7 = (class59) var6.next();
            var7.method1004();
        }
        if (Statics.field3 != null) {
            Statics.field3.method5091();
        }
    }

    @ObfuscatedName("bm.ai(Ljava/lang/String;I)V")
    public final void method1559(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field989);
        if (!var2.method5049()) {
            return;
        }
        if (this.field994.method5002(var2)) {
            client.field743 = client.field776;
            class173 var3 = class173.method2882(class170.field2215, client.field740.field1251);
            var3.field2280.method3246(class183.method124(arg0));
            var3.field2280.method3243(arg0);
            client.field740.method1873(var3);
        }
        class84.method3154();
        if (Statics.field3 != null) {
            Statics.field3.method5074();
        }
    }

    @ObfuscatedName("a.at(Ljava/lang/String;II)V")
    public static final void method96(String arg0, int arg1) {
        class173 var2 = class173.method2882(class170.field2208, client.field740.field1251);
        var2.field2280.method3246(class183.method124(arg0) + 1);
        var2.field2280.method3288(arg1);
        var2.field2280.method3243(arg0);
        client.field740.method1873(var2);
    }

    @ObfuscatedName("bm.ad(Lkm;B)Z")
    public final boolean method1577(class292 arg0) {
        class293 var2 = (class293) this.field990.method4955(arg0);
        return var2 != null && var2.method5036();
    }
}

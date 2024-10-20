package deob;

@ObfuscatedName("bc")
public class class68 {

    @ObfuscatedName("bc.l")
    public final class323 field975;

    @ObfuscatedName("bc.u")
    public final class291 field971;

    @ObfuscatedName("bc.q")
    public final class285 field976;

    @ObfuscatedName("bc.k")
    public int field977 = 0;

    public class68(class323 arg0) {
        this.field975 = arg0;
        this.field971 = new class291(arg0);
        this.field976 = new class285(arg0);
    }

    @ObfuscatedName("bc.z(I)Z")
    public boolean method1517() {
        return this.field977 == 2;
    }

    @ObfuscatedName("bc.w(I)V")
    public final void method1518() {
        this.field977 = 1;
    }

    @ObfuscatedName("bc.s(Lgk;II)V")
    public final void method1572(class183 arg0, int arg1) {
        this.field971.method5015(arg0, arg1);
        this.field977 = 2;
        client.method933();
    }

    @ObfuscatedName("bc.l(I)V")
    public final void method1520() {
        for (class295 var1 = (class295) this.field971.field3640.method3795(); var1 != null; var1 = (class295) this.field971.field3640.method3798()) {
            if ((long) var1.field3666 < class185.method3250() / 1000L - 5L) {
                if (var1.field3665 > 0) {
                    class84.method2942(5, "", var1.field3663 + class238.field2915);
                }
                if (var1.field3665 == 0) {
                    class84.method2942(5, "", var1.field3663 + class238.field2940);
                }
                var1.method3805();
            }
        }
    }

    @ObfuscatedName("bc.u(I)V")
    public final void method1521() {
        this.field977 = 0;
        this.field971.method4932();
        this.field976.method4932();
    }

    @ObfuscatedName("bc.q(Lkm;ZI)Z")
    public final boolean method1553(class292 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1877.field553)) {
            return true;
        } else {
            return this.field971.method5014(arg0, arg1);
        }
    }

    @ObfuscatedName("bc.i(Lkm;I)Z")
    public final boolean method1523(class292 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field976.method4935(arg0);
        }
    }

    @ObfuscatedName("bc.x(Ljava/lang/String;B)V")
    public final void method1524(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field975);
        if (!var2.method5027()) {
            return;
        }
        class238 var10000;
        if (this.method1525()) {
            var10000 = (class238) null;
            String var3 = class238.field2914;
            class84.method2942(30, "", var3);
        } else if (Statics.field1877.field553.equals(var2)) {
            var10000 = (class238) null;
            String var4 = class238.field2962;
            class84.method2942(30, "", var4);
        } else if (this.method1553(var2, false)) {
            method4219(arg0);
        } else if (this.method1523(var2)) {
            method916(arg0);
        } else {
            class173 var5 = Statics.method414(class170.field2195, client.field627.field1219);
            var5.field2258.method3235(class183.method5380(arg0));
            var5.field2258.method3402(arg0);
            client.field627.method1847(var5);
        }
    }

    @ObfuscatedName("hl.e(Ljava/lang/String;B)V")
    public static final void method4219(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class238 var10001 = (class238) null;
        String var1 = var10000.append(class238.field2959).toString();
        class84.method2942(30, "", var1);
    }

    @ObfuscatedName("ag.p(Ljava/lang/String;I)V")
    public static final void method916(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class238 var10001 = (class238) null;
        StringBuilder var2 = var10000.append(class238.field2964).append(arg0);
        class238 var3 = (class238) null;
        String var1 = var2.append(class238.field3015).toString();
        class84.method2942(30, "", var1);
    }

    @ObfuscatedName("bc.b(I)Z")
    public final boolean method1525() {
        return this.field971.method4934() || this.field971.method4933() >= 200 && client.field699 != 1;
    }

    @ObfuscatedName("bc.n(Ljava/lang/String;B)V")
    public final void method1526(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field975);
        if (!var2.method5027()) {
            return;
        }
        if (this.method1527()) {
            method436();
        } else if (Statics.field1877.field553.equals(var2)) {
            class238 var7 = (class238) null;
            String var3 = class238.field2827;
            class84.method2942(30, "", var3);
        } else if (this.method1523(var2)) {
            method252(arg0);
        } else if (this.method1553(var2, false)) {
            StringBuilder var10000 = new StringBuilder();
            class238 var10001 = (class238) null;
            StringBuilder var6 = var10000.append(class238.field2966).append(arg0);
            class238 var8 = (class238) null;
            String var4 = var6.append(class238.field2967).toString();
            class84.method2942(30, "", var4);
        } else {
            class173 var5 = Statics.method414(class170.field2222, client.field627.field1219);
            var5.field2258.method3235(class183.method5380(arg0));
            var5.field2258.method3402(arg0);
            client.field627.method1847(var5);
        }
    }

    @ObfuscatedName("ab.f(I)V")
    public static final void method436() {
        class238 var10000 = (class238) null;
        String var0 = class238.field2888;
        class84.method2942(30, "", var0);
    }

    @ObfuscatedName("j.g(Ljava/lang/String;I)V")
    public static final void method252(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class238 var10001 = (class238) null;
        String var1 = var10000.append(class238.field2961).toString();
        class84.method2942(30, "", var1);
    }

    @ObfuscatedName("bc.m(S)Z")
    public final boolean method1527() {
        return this.field976.method4934() || this.field976.method4933() >= 100 && client.field699 != 1;
    }

    @ObfuscatedName("bc.r(Ljava/lang/String;I)V")
    public final void method1558(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field975);
        if (!var2.method5027()) {
            return;
        }
        if (this.field971.method4992(var2)) {
            client.field648 = client.field802;
            class173 var3 = Statics.method414(class170.field2204, client.field627.field1219);
            var3.field2258.method3235(class183.method5380(arg0));
            var3.field2258.method3402(arg0);
            client.field627.method1847(var3);
        }
        client.method933();
    }

    @ObfuscatedName("bc.t(Ljava/lang/String;I)V")
    public final void method1529(String arg0) {
        if (arg0 == null) {
            return;
        }
        class292 var2 = new class292(arg0, this.field975);
        if (!var2.method5027()) {
            return;
        }
        if (this.field976.method4992(var2)) {
            client.field648 = client.field802;
            class173 var3 = Statics.method414(class170.field2158, client.field627.field1219);
            var3.field2258.method3235(class183.method5380(arg0));
            var3.field2258.method3402(arg0);
            client.field627.method1847(var3);
        }
        class84.method831();
        if (Statics.field95 != null) {
            Statics.field95.method5048();
        }
    }

    @ObfuscatedName("bc.o(Lkm;I)Z")
    public final boolean method1530(class292 arg0) {
        class293 var2 = (class293) this.field971.method4936(arg0);
        return var2 != null && var2.method5010();
    }
}

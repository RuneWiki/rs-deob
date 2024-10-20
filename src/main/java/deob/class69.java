package deob;

import java.util.Iterator;

@ObfuscatedName("bt")
public class class69 {

    @ObfuscatedName("bt.s")
    public final class331 field1027;

    @ObfuscatedName("bt.e")
    public final class293 field1023;

    @ObfuscatedName("bt.a")
    public final class287 field1025;

    @ObfuscatedName("bt.c")
    public int field1029 = 0;

    public class69(class331 arg0) {
        this.field1027 = arg0;
        this.field1023 = new class293(arg0);
        this.field1025 = new class287(arg0);
    }

    @ObfuscatedName("bt.f(I)Z")
    public boolean method1566() {
        return this.field1029 == 2;
    }

    @ObfuscatedName("bt.l(B)V")
    public final void method1567() {
        this.field1029 = 1;
    }

    @ObfuscatedName("bt.w(Lgm;IB)V")
    public final void method1568(class185 arg0, int arg1) {
        this.field1023.method5120(arg0, arg1);
        this.field1029 = 2;
        client.method943();
    }

    @ObfuscatedName("bt.s(B)V")
    public final void method1576() {
        for (class297 var1 = (class297) this.field1023.field3710.method3855(); var1 != null; var1 = (class297) this.field1023.field3710.method3858()) {
            if ((long) var1.field3730 < Statics.method1926() / 1000L - 5L) {
                if (var1.field3728 > 0) {
                    class86.method3230(5, "", var1.field3729 + class240.field3025);
                }
                if (var1.field3728 == 0) {
                    class86.method3230(5, "", var1.field3729 + class240.field3009);
                }
                var1.method3868();
            }
        }
    }

    @ObfuscatedName("bt.e(I)V")
    public final void method1570() {
        this.field1029 = 0;
        this.field1023.method5035();
        this.field1025.method5035();
    }

    @ObfuscatedName("bt.c(Lka;ZI)Z")
    public final boolean method1571(class294 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field138.field597)) {
            return true;
        } else {
            return this.field1023.method5123(arg0, arg1);
        }
    }

    @ObfuscatedName("bt.p(Lka;B)Z")
    public final boolean method1572(class294 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1025.method5038(arg0);
        }
    }

    @ObfuscatedName("bt.r(Ljava/lang/String;I)V")
    public final void method1590(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1027);
        if (!var2.method5131()) {
            return;
        }
        if (this.method1574()) {
            method50();
        } else if (Statics.field138.field597.equals(var2)) {
            method2911();
        } else if (this.method1571(var2, false)) {
            method212(arg0 + class240.field3028);
        } else if (this.method1572(var2)) {
            method3009(arg0);
        } else {
            class175 var3 = class175.method85(class172.field2249, client.field861.field1287);
            var3.field2335.method3376(class185.method3075(arg0));
            var3.field2335.method3446(arg0);
            client.field861.method1944(var3);
        }
    }

    @ObfuscatedName("h.m(Ljava/lang/String;I)V")
    public static final void method212(String arg0) {
        class86.method3230(30, "", arg0);
    }

    @ObfuscatedName("e.d(I)V")
    public static final void method50() {
        method212(class240.field3027);
    }

    @ObfuscatedName("eq.z(Ljava/lang/String;I)V")
    public static final void method3009(String arg0) {
        method212(class240.field2931 + arg0 + class240.field2971);
    }

    @ObfuscatedName("ey.x(B)V")
    public static final void method2911() {
        method212(class240.field2863);
    }

    @ObfuscatedName("bt.v(B)Z")
    public final boolean method1574() {
        return this.field1023.method5037() || this.field1023.method5049() >= 200 && client.field748 != 1;
    }

    @ObfuscatedName("bt.g(Ljava/lang/String;I)V")
    public final void method1603(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1027);
        if (!var2.method5131()) {
            return;
        }
        if (this.method1618()) {
            method676();
        } else if (Statics.field138.field597.equals(var2)) {
            method3306();
        } else if (this.method1572(var2)) {
            method212(arg0 + class240.field3030);
        } else if (this.method1571(var2, false)) {
            method3171(arg0);
        } else {
            Statics.method532(arg0);
        }
    }

    @ObfuscatedName("ab.u(I)V")
    public static final void method676() {
        method212(class240.field3029);
    }

    @ObfuscatedName("fi.o(Ljava/lang/String;I)V")
    public static final void method3171(String arg0) {
        method212(class240.field3035 + arg0 + class240.field2883);
    }

    @ObfuscatedName("fa.i(I)V")
    public static final void method3306() {
        method212(class240.field3032);
    }

    @ObfuscatedName("bt.q(I)Z")
    public final boolean method1618() {
        return this.field1025.method5037() || this.field1025.method5049() >= 100 && client.field748 != 1;
    }

    @ObfuscatedName("bt.y(Ljava/lang/String;I)V")
    public final void method1577(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1027);
        if (!var2.method5131()) {
            return;
        }
        if (this.field1023.method5042(var2)) {
            client.field881 = client.field815;
            class175 var3 = class175.method85(class172.field2262, client.field861.field1287);
            var3.field2335.method3376(class185.method3075(arg0));
            var3.field2335.method3446(arg0);
            client.field861.method1944(var3);
        }
        for (int var4 = 0; var4 < class84.field1216; var4++) {
            class62 var5 = client.field746[class84.field1217[var4]];
            var5.method1059();
        }
        Iterator var6 = class86.field1240.iterator();
        while (var6.hasNext()) {
            class60 var7 = (class60) var6.next();
            var7.method1028();
        }
        if (Statics.field2353 != null) {
            Statics.field2353.method5160();
        }
    }

    @ObfuscatedName("bt.av(Ljava/lang/String;B)V")
    public final void method1578(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1027);
        if (!var2.method5131()) {
            return;
        }
        if (this.field1025.method5042(var2)) {
            client.field881 = client.field815;
            class175 var3 = class175.method85(class172.field2280, client.field861.field1287);
            var3.field2335.method3376(class185.method3075(arg0));
            var3.field2335.method3446(arg0);
            client.field861.method1944(var3);
        }
        client.method2951();
    }

    @ObfuscatedName("ei.ag(Ljava/lang/String;IB)V")
    public static final void method3029(String arg0, int arg1) {
        class175 var2 = class175.method85(class172.field2245, client.field861.field1287);
        var2.field2335.method3376(class185.method3075(arg0) + 1);
        var2.field2335.method3446(arg0);
        var2.field2335.method3376(arg1);
        client.field861.method1944(var2);
    }

    @ObfuscatedName("bt.af(Lka;I)Z")
    public final boolean method1579(class294 arg0) {
        class295 var2 = (class295) this.field1023.method5039(arg0);
        return var2 != null && var2.method5114();
    }
}

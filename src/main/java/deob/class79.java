package deob;

import java.util.Iterator;

@ObfuscatedName("cw")
public class class79 {

    @ObfuscatedName("cw.h")
    public final class314 field1220;

    @ObfuscatedName("cw.i")
    public final class280 field1212;

    @ObfuscatedName("cw.w")
    public final class275 field1213;

    @ObfuscatedName("cw.t")
    public int field1214 = 0;

    public class79(class314 arg0) {
        this.field1220 = arg0;
        this.field1212 = new class280(arg0);
        this.field1213 = new class275(arg0);
    }

    @ObfuscatedName("cw.s(B)Z")
    public boolean method1622() {
        return this.field1214 == 2;
    }

    @ObfuscatedName("cw.g(I)V")
    public final void method1568() {
        this.field1214 = 1;
    }

    @ObfuscatedName("cw.m(Lgy;II)V")
    public final void method1607(class185 arg0, int arg1) {
        this.field1212.method4913(arg0, arg1);
        this.field1214 = 2;
        for (int var3 = 0; var3 < class93.field1388; var3++) {
            class72 var4 = client.field945[class93.field1394[var3]];
            var4.method1033();
        }
        Iterator var5 = class95.field1416.iterator();
        while (var5.hasNext()) {
            class70 var6 = (class70) var5.next();
            var6.method990();
        }
        if (Statics.field334 != null) {
            Statics.field334.method4954();
        }
    }

    @ObfuscatedName("cw.h(B)V")
    public final void method1570() {
        for (class284 var1 = (class284) this.field1212.field3720.method3790(); var1 != null; var1 = (class284) this.field1212.field3720.method3787()) {
            if ((long) var1.field3746 < class187.method2705() / 1000L - 5L) {
                if (var1.field3745 > 0) {
                    class95.method649(5, "", var1.field3747 + class237.field3050);
                }
                if (var1.field3745 == 0) {
                    class95.method649(5, "", var1.field3747 + class237.field3100);
                }
                var1.method3797();
            }
        }
    }

    @ObfuscatedName("cw.i(I)V")
    public final void method1626() {
        this.field1214 = 0;
        this.field1212.method4907();
        this.field1213.method4907();
    }

    @ObfuscatedName("cw.w(Lja;ZI)Z")
    public final boolean method1614(class281 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1754.field819)) {
            return true;
        } else {
            return this.field1212.method4914(arg0, arg1);
        }
    }

    @ObfuscatedName("cw.t(Lja;B)Z")
    public final boolean method1573(class281 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1213.method4863(arg0);
        }
    }

    @ObfuscatedName("cw.d(Ljava/lang/String;I)V")
    public final void method1574(String arg0) {
        if (arg0 == null) {
            return;
        }
        class281 var2 = new class281(arg0, this.field1220);
        if (!var2.method4923()) {
            return;
        }
        if (this.method1575()) {
            method1027();
        } else if (Statics.field1754.field819.equals(var2)) {
            method4855();
        } else if (this.method1614(var2, false)) {
            method46(arg0 + class237.field3119);
        } else if (this.method1573(var2)) {
            method46(class237.field3124 + arg0 + class237.field3125);
        } else {
            class175 var3 = class175.method1891(class172.field2370, client.field938.field1455);
            var3.field2440.method3223(class185.method2709(arg0));
            var3.field2440.method3230(arg0);
            client.field938.method1907(var3);
        }
    }

    @ObfuscatedName("c.z(Ljava/lang/String;B)V")
    public static final void method46(String arg0) {
        class95.method649(30, "", arg0);
    }

    @ObfuscatedName("bd.k(S)V")
    public static final void method1027() {
        method46(class237.field3169);
    }

    @ObfuscatedName("jj.c(I)V")
    public static final void method4855() {
        method46(class237.field3194);
    }

    @ObfuscatedName("cw.o(I)Z")
    public final boolean method1575() {
        return this.field1212.method4839() || this.field1212.method4838() >= 200 && client.field947 != 1;
    }

    @ObfuscatedName("cw.l(Ljava/lang/String;I)V")
    public final void method1633(String arg0) {
        if (arg0 == null) {
            return;
        }
        class281 var2 = new class281(arg0, this.field1220);
        if (!var2.method4923()) {
            return;
        }
        if (this.method1577()) {
            method1018();
        } else if (Statics.field1754.field819.equals(var2)) {
            method1739();
        } else if (this.method1573(var2)) {
            method46(arg0 + class237.field3121);
        } else if (this.method1614(var2, false)) {
            method46(class237.field3126 + arg0 + class237.field3122);
        } else {
            method1551(arg0);
        }
    }

    @ObfuscatedName("bx.f(I)V")
    public static final void method1018() {
        method46(class237.field3120);
    }

    @ObfuscatedName("cv.q(S)V")
    public static final void method1739() {
        method46(class237.field3123);
    }

    @ObfuscatedName("bg.r(Ljava/lang/String;I)V")
    public static final void method1551(String arg0) {
        class175 var1 = class175.method1891(class172.field2407, client.field938.field1455);
        var1.field2440.method3223(class185.method2709(arg0));
        var1.field2440.method3230(arg0);
        client.field938.method1907(var1);
    }

    @ObfuscatedName("cw.x(B)Z")
    public final boolean method1577() {
        return this.field1213.method4839() || this.field1213.method4838() >= 100 && client.field947 != 1;
    }

    @ObfuscatedName("cw.u(Ljava/lang/String;I)V")
    public final void method1596(String arg0) {
        if (arg0 == null) {
            return;
        }
        class281 var2 = new class281(arg0, this.field1220);
        if (!var2.method4923()) {
            return;
        }
        if (this.field1212.method4844(var2)) {
            client.method5084();
            class175 var3 = class175.method1891(class172.field2329, client.field938.field1455);
            var3.field2440.method3223(class185.method2709(arg0));
            var3.field2440.method3230(arg0);
            client.field938.method1907(var3);
        }
        for (int var4 = 0; var4 < class93.field1388; var4++) {
            class72 var5 = client.field945[class93.field1394[var4]];
            var5.method1033();
        }
        Iterator var6 = class95.field1416.iterator();
        while (var6.hasNext()) {
            class70 var7 = (class70) var6.next();
            var7.method990();
        }
        if (Statics.field334 != null) {
            Statics.field334.method4954();
        }
    }

    @ObfuscatedName("cw.a(Ljava/lang/String;B)V")
    public final void method1579(String arg0) {
        if (arg0 == null) {
            return;
        }
        class281 var2 = new class281(arg0, this.field1220);
        if (!var2.method4923()) {
            return;
        }
        if (this.field1213.method4844(var2)) {
            client.method5084();
            class175 var3 = class175.method1891(class172.field2390, client.field938.field1455);
            var3.field2440.method3223(class185.method2709(arg0));
            var3.field2440.method3230(arg0);
            client.field938.method1907(var3);
        }
        class95.method3218();
        if (Statics.field334 != null) {
            Statics.field334.method4950();
        }
    }

    @ObfuscatedName("ah.ad(Ljava/lang/String;II)V")
    public static final void method474(String arg0, int arg1) {
        class175 var2 = class175.method1891(class172.field2320, client.field938.field1455);
        var2.field2440.method3223(class185.method2709(arg0) + 1);
        var2.field2440.method3266(arg1);
        var2.field2440.method3230(arg0);
        client.field938.method1907(var2);
    }
}

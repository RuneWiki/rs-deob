package deob;

import java.util.Iterator;

@ObfuscatedName("bd")
public class class62 {

    @ObfuscatedName("bd.k")
    public final class424 field798;

    @ObfuscatedName("bd.a")
    public final class367 field802;

    @ObfuscatedName("bd.m")
    public final class365 field800;

    @ObfuscatedName("bd.p")
    public int field804 = 0;

    public class62(class424 arg0) {
        this.field798 = arg0;
        this.field802 = new class367(arg0);
        this.field800 = new class365(arg0);
    }

    @ObfuscatedName("bd.o(B)Z")
    public boolean method1571() {
        return this.field804 == 2;
    }

    @ObfuscatedName("bd.q(I)V")
    public final void method1572() {
        this.field804 = 1;
    }

    @ObfuscatedName("bd.l(Lpx;II)V")
    public final void method1573(class440 arg0, int arg1) {
        this.field802.method5943(arg0, arg1);
        this.field804 = 2;
        for (int var3 = 0; var3 < class97.field1305; var3++) {
            class85 var4 = client.field609[class97.field1306[var3]];
            var4.method1997();
        }
        Iterator var5 = class99.field1338.iterator();
        while (var5.hasNext()) {
            class58 var6 = (class58) var5.next();
            var6.method1000();
        }
        if (Statics.field303 != null) {
            Statics.field303.method5954();
        }
    }

    @ObfuscatedName("bd.k(B)V")
    public final void method1623() {
        for (class370 var1 = (class370) this.field802.field4299.method5544(); var1 != null; var1 = (class370) this.field802.field4299.method5551()) {
            if ((long) var1.field4315 < class270.method2485() / 1000L - 5L) {
                if (var1.field4317 > 0) {
                    class99.method4522(5, "", var1.field4316 + class309.field3922);
                }
                if (var1.field4317 == 0) {
                    class99.method4522(5, "", var1.field4316 + class309.field3891);
                }
                var1.method6391();
            }
        }
    }

    @ObfuscatedName("bd.a(S)V")
    public final void method1613() {
        this.field804 = 0;
        this.field802.method6027();
        this.field800.method6027();
    }

    @ObfuscatedName("bd.m(Lqv;ZS)Z")
    public final boolean method1601(class461 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2657.field1100)) {
            return true;
        } else {
            return this.field802.method5940(arg0, arg1);
        }
    }

    @ObfuscatedName("bd.p(Lqv;I)Z")
    public final boolean method1585(class461 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field800.method6029(arg0);
        }
    }

    @ObfuscatedName("bd.s(Ljava/lang/String;B)V")
    public final void method1608(String arg0) {
        if (arg0 == null) {
            return;
        }
        class461 var2 = new class461(arg0, this.field798);
        if (!var2.method7490()) {
            return;
        }
        if (this.method1578()) {
            method1912();
        } else if (Statics.field2657.field1100.equals(var2)) {
            method1962(class309.field3923);
        } else if (this.method1601(var2, false)) {
            method1962(arg0 + class309.field3716);
        } else if (this.method1585(var2)) {
            method1962(class309.field3849 + arg0 + class309.field3823);
        } else {
            class265 var3 = class265.method4070(class263.field2999, client.field734.field1344);
            var3.field3075.method6876(class440.method6331(arg0));
            var3.field3075.method6883(arg0);
            client.field734.method2362(var3);
        }
    }

    @ObfuscatedName("ck.r(Ljava/lang/String;B)V")
    public static final void method1962(String arg0) {
        class99.method4522(30, "", arg0);
    }

    @ObfuscatedName("bn.v(S)V")
    public static final void method1912() {
        method1962(class309.field3829);
    }

    @ObfuscatedName("bd.y(I)Z")
    public final boolean method1578() {
        return this.field802.method6065() || this.field802.method6028() >= 200 && client.field611 != 1;
    }

    @ObfuscatedName("bd.c(Ljava/lang/String;I)V")
    public final void method1605(String arg0) {
        if (arg0 == null) {
            return;
        }
        class461 var2 = new class461(arg0, this.field798);
        if (!var2.method7490()) {
            return;
        }
        if (this.method1580()) {
            method1962(class309.field3722);
        } else if (Statics.field2657.field1100.equals(var2)) {
            method2462();
        } else if (this.method1585(var2)) {
            method4392(arg0);
        } else if (this.method1601(var2, false)) {
            method1962(class309.field3837 + arg0 + class309.field3838);
        } else {
            class265 var3 = class265.method4070(class263.field2960, client.field734.field1344);
            var3.field3075.method6876(class440.method6331(arg0));
            var3.field3075.method6883(arg0);
            client.field734.method2362(var3);
        }
    }

    @ObfuscatedName("hh.w(Ljava/lang/String;I)V")
    public static final void method4392(String arg0) {
        method1962(arg0 + class309.field3843);
    }

    @ObfuscatedName("dh.b(I)V")
    public static final void method2462() {
        method1962(class309.field3834);
    }

    @ObfuscatedName("bd.t(I)Z")
    public final boolean method1580() {
        return this.field800.method6065() || this.field800.method6028() >= 100 && client.field611 != 1;
    }

    @ObfuscatedName("bd.g(Ljava/lang/String;I)V")
    public final void method1581(String arg0) {
        if (arg0 == null) {
            return;
        }
        class461 var2 = new class461(arg0, this.field798);
        if (!var2.method7490()) {
            return;
        }
        if (this.field802.method6033(var2)) {
            client.method3902();
            class265 var3 = class265.method4070(class263.field2955, client.field734.field1344);
            var3.field3075.method6876(class440.method6331(arg0));
            var3.field3075.method6883(arg0);
            client.field734.method2362(var3);
        }
        for (int var4 = 0; var4 < class97.field1305; var4++) {
            class85 var5 = client.field609[class97.field1306[var4]];
            var5.method1997();
        }
        Iterator var6 = class99.field1338.iterator();
        while (var6.hasNext()) {
            class58 var7 = (class58) var6.next();
            var7.method1000();
        }
        if (Statics.field303 != null) {
            Statics.field303.method5954();
        }
    }

    @ObfuscatedName("bd.x(Ljava/lang/String;I)V")
    public final void method1582(String arg0) {
        if (arg0 == null) {
            return;
        }
        class461 var2 = new class461(arg0, this.field798);
        if (!var2.method7490()) {
            return;
        }
        if (this.field800.method6033(var2)) {
            client.method3902();
            class265 var3 = class265.method4070(class263.field3035, client.field734.field1344);
            var3.field3075.method6876(class440.method6331(arg0));
            var3.field3075.method6883(arg0);
            client.field734.method2362(var3);
        }
        client.method2599();
    }

    @ObfuscatedName("hf.n(Ljava/lang/String;II)V")
    public static final void method4069(String arg0, int arg1) {
        class265 var2 = class265.method4070(class263.field3027, client.field734.field1344);
        var2.field3075.method6876(class440.method6331(arg0) + 1);
        var2.field3075.method6920(arg1);
        var2.field3075.method6883(arg0);
        client.field734.method2362(var2);
    }

    @ObfuscatedName("bd.e(Lqv;I)Z")
    public final boolean method1583(class461 arg0) {
        class369 var2 = (class369) this.field802.method6030(arg0);
        return var2 != null && var2.method6101();
    }
}

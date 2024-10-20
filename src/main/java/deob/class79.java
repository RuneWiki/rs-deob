package deob;

import java.util.Iterator;

@ObfuscatedName("cx")
public class class79 {

    @ObfuscatedName("cx.s")
    public final class314 field1195;

    @ObfuscatedName("cx.j")
    public final class280 field1192;

    @ObfuscatedName("cx.a")
    public final class275 field1197;

    @ObfuscatedName("cx.t")
    public int field1196 = 0;

    public class79(class314 arg0) {
        this.field1195 = arg0;
        this.field1192 = new class280(arg0);
        this.field1197 = new class275(arg0);
    }

    @ObfuscatedName("cx.p(B)Z")
    public boolean method1548() {
        return this.field1196 == 2;
    }

    @ObfuscatedName("cx.i(I)V")
    public final void method1549() {
        this.field1196 = 1;
    }

    @ObfuscatedName("cx.w(Lgj;II)V")
    public final void method1578(class185 arg0, int arg1) {
        this.field1192.method4746(arg0, arg1);
        this.field1196 = 2;
        client.method253();
    }

    @ObfuscatedName("cx.s(I)V")
    public final void method1555() {
        for (class284 var1 = (class284) this.field1192.field3694.method3606(); var1 != null; var1 = (class284) this.field1192.field3694.method3608()) {
            if ((long) var1.field3720 < class187.method35() / 1000L - 5L) {
                if (var1.field3718 > 0) {
                    Statics.method4020(5, "", var1.field3716 + class237.field3143);
                }
                if (var1.field3718 == 0) {
                    Statics.method4020(5, "", var1.field3716 + class237.field3189);
                }
                var1.method3620();
            }
        }
    }

    @ObfuscatedName("cx.j(I)V")
    public final void method1552() {
        this.field1196 = 0;
        this.field1192.method4707();
        this.field1197.method4707();
    }

    @ObfuscatedName("cx.a(Ljr;ZI)Z")
    public final boolean method1599(class281 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field470.field787)) {
            return true;
        } else {
            return this.field1192.method4745(arg0, arg1);
        }
    }

    @ObfuscatedName("cx.t(Ljr;I)Z")
    public final boolean method1554(class281 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1197.method4684(arg0);
        }
    }

    @ObfuscatedName("cx.r(Ljava/lang/String;I)V")
    public final void method1591(String arg0) {
        if (arg0 == null) {
            return;
        }
        class281 var2 = new class281(arg0, this.field1195);
        if (!var2.method4753()) {
            return;
        }
        if (this.method1556()) {
            method963(class237.field3058);
        } else if (Statics.field470.field787.equals(var2)) {
            method179();
        } else if (this.method1599(var2, false)) {
            method2613(arg0);
        } else if (this.method1554(var2)) {
            method24(arg0);
        } else {
            method472(arg0);
        }
    }

    @ObfuscatedName("bu.m(Ljava/lang/String;I)V")
    public static final void method963(String arg0) {
        Statics.method4020(30, "", arg0);
    }

    @ObfuscatedName("eg.h(Ljava/lang/String;I)V")
    public static final void method2613(String arg0) {
        method963(arg0 + class237.field3101);
    }

    @ObfuscatedName("a.o(Ljava/lang/String;I)V")
    public static final void method24(String arg0) {
        method963(class237.field3007 + arg0 + class237.field3024);
    }

    @ObfuscatedName("b.x(I)V")
    public static final void method179() {
        method963(class237.field3104);
    }

    @ObfuscatedName("au.q(Ljava/lang/String;I)V")
    public static final void method472(String arg0) {
        class175 var1 = class175.method470(class172.field2324, client.field868.field1440);
        var1.field2403.method3107(class185.method1722(arg0));
        var1.field2403.method3189(arg0);
        client.field868.method1879(var1);
    }

    @ObfuscatedName("cx.d(I)Z")
    public final boolean method1556() {
        return this.field1192.method4683() || this.field1192.method4682() >= 200 && client.field929 != 1;
    }

    @ObfuscatedName("cx.l(Ljava/lang/String;I)V")
    public final void method1557(String arg0) {
        if (arg0 == null) {
            return;
        }
        class281 var2 = new class281(arg0, this.field1195);
        if (!var2.method4753()) {
            return;
        }
        if (this.method1558()) {
            method207();
        } else if (Statics.field470.field787.equals(var2)) {
            method892();
        } else if (this.method1554(var2)) {
            method4021(arg0);
        } else if (this.method1599(var2, false)) {
            method959(arg0);
        } else {
            method4473(arg0);
        }
    }

    @ObfuscatedName("aa.f(I)V")
    public static final void method207() {
        method963(class237.field3102);
    }

    @ObfuscatedName("iu.k(Ljava/lang/String;I)V")
    public static final void method4021(String arg0) {
        method963(arg0 + class237.field3103);
    }

    @ObfuscatedName("bz.e(Ljava/lang/String;I)V")
    public static final void method959(String arg0) {
        method963(class237.field3150 + arg0 + class237.field2941);
    }

    @ObfuscatedName("bn.u(B)V")
    public static final void method892() {
        method963(class237.field3105);
    }

    @ObfuscatedName("jv.z(Ljava/lang/String;I)V")
    public static final void method4473(String arg0) {
        class175 var1 = class175.method470(class172.field2370, client.field868.field1440);
        var1.field2403.method3107(class185.method1722(arg0));
        var1.field2403.method3189(arg0);
        client.field868.method1879(var1);
    }

    @ObfuscatedName("cx.b(I)Z")
    public final boolean method1558() {
        return this.field1197.method4683() || this.field1197.method4682() >= 100 && client.field929 != 1;
    }

    @ObfuscatedName("cx.c(Ljava/lang/String;I)V")
    public final void method1559(String arg0) {
        if (arg0 == null) {
            return;
        }
        class281 var2 = new class281(arg0, this.field1195);
        if (!var2.method4753()) {
            return;
        }
        if (this.field1192.method4700(var2)) {
            client.field1001 = client.field993;
            class175 var3 = class175.method470(class172.field2337, client.field868.field1440);
            var3.field2403.method3107(class185.method1722(arg0));
            var3.field2403.method3189(arg0);
            client.field868.method1879(var3);
        }
        client.method253();
    }

    @ObfuscatedName("cx.aa(Ljava/lang/String;I)V")
    public final void method1597(String arg0) {
        if (arg0 == null) {
            return;
        }
        class281 var2 = new class281(arg0, this.field1195);
        if (!var2.method4753()) {
            return;
        }
        if (this.field1197.method4700(var2)) {
            client.field1001 = client.field993;
            class175 var3 = class175.method470(class172.field2356, client.field868.field1440);
            var3.field2403.method3107(class185.method1722(arg0));
            var3.field2403.method3189(arg0);
            client.field868.method1879(var3);
        }
        Iterator var4 = class95.field1401.iterator();
        while (var4.hasNext()) {
            class70 var5 = (class70) var4.next();
            var5.method1002();
        }
        if (Statics.field2926 != null) {
            Statics.field2926.method4780();
        }
    }
}

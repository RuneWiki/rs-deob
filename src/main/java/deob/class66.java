package deob;

@ObfuscatedName("bi")
public class class66 {

    @ObfuscatedName("bi.x")
    public final class447 field828;

    @ObfuscatedName("bi.m")
    public final class389 field829;

    @ObfuscatedName("bi.q")
    public final class387 field830;

    @ObfuscatedName("bi.f")
    public int field834 = 0;

    public class66(class447 arg0) {
        this.field828 = arg0;
        this.field829 = new class389(arg0);
        this.field830 = new class387(arg0);
    }

    @ObfuscatedName("bi.h(I)Z")
    public boolean method1719() {
        return this.field834 == 2;
    }

    @ObfuscatedName("bi.e(B)V")
    public final void method1714() {
        this.field834 = 1;
    }

    @ObfuscatedName("bi.v(Lqy;IB)V")
    public final void method1703(class467 arg0, int arg1) {
        this.field829.method6775(arg0, arg1);
        this.field834 = 2;
        client.method6050();
    }

    @ObfuscatedName("bi.x(I)V")
    public final void method1704() {
        for (class392 var1 = (class392) this.field829.field4505.method6208(); var1 != null; var1 = (class392) this.field829.field4505.method6210()) {
            if ((long) var1.field4521 < Statics.method1118() / 1000L - 5L) {
                if (var1.field4523 > 0) {
                    class107.method3247(5, "", var1.field4522 + class326.field4095);
                }
                if (var1.field4523 == 0) {
                    class107.method3247(5, "", var1.field4522 + class326.field3978);
                }
                var1.method7223();
            }
        }
    }

    @ObfuscatedName("bi.m(B)V")
    public final void method1705() {
        this.field834 = 0;
        this.field829.method6864();
        this.field830.method6864();
    }

    @ObfuscatedName("bi.q(Lrp;ZI)Z")
    public final boolean method1706(class490 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1790.field1136)) {
            return true;
        } else {
            return this.field829.method6777(arg0, arg1);
        }
    }

    @ObfuscatedName("bi.f(Lrp;B)Z")
    public final boolean method1701(class490 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field830.method6867(arg0);
        }
    }

    @ObfuscatedName("bi.r(Ljava/lang/String;I)V")
    public final void method1707(String arg0) {
        if (arg0 == null) {
            return;
        }
        class490 var2 = new class490(arg0, this.field828);
        if (!var2.method8385()) {
            return;
        }
        if (this.method1715()) {
            class326 var10000 = (class326) null;
            String var3 = class326.field3881;
            class107.method3247(30, "", var3);
        } else if (Statics.field1790.field1136.equals(var2)) {
            method4041();
        } else if (this.method1706(var2, false)) {
            Statics.method11(arg0);
        } else if (this.method1701(var2)) {
            method5763(arg0);
        } else {
            class278 var4 = class278.method2890(class276.field3110, client.field567.field1425);
            var4.field3177.method7789(class467.method155(arg0));
            var4.field3177.method7782(arg0);
            client.field567.method2603(var4);
        }
    }

    @ObfuscatedName("ll.b(Ljava/lang/String;I)V")
    public static final void method5763(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class326 var10001 = (class326) null;
        StringBuilder var2 = var10000.append(class326.field4002).append(arg0);
        class326 var3 = (class326) null;
        String var1 = var2.append(class326.field4003).toString();
        class107.method3247(30, "", var1);
    }

    @ObfuscatedName("hn.j(B)V")
    public static final void method4041() {
        class326 var10000 = (class326) null;
        String var0 = class326.field4000;
        class107.method3247(30, "", var0);
    }

    @ObfuscatedName("bi.g(I)Z")
    public final boolean method1715() {
        return this.field829.method6866() || this.field829.method6865() >= 200 && client.field693 != 1;
    }

    @ObfuscatedName("bi.i(Ljava/lang/String;B)V")
    public final void method1728(String arg0) {
        if (arg0 == null) {
            return;
        }
        class490 var2 = new class490(arg0, this.field828);
        if (!var2.method8385()) {
            return;
        }
        if (this.method1711()) {
            class326 var7 = (class326) null;
            String var3 = class326.field3829;
            class107.method3247(30, "", var3);
        } else if (Statics.field1790.field1136.equals(var2)) {
            method16();
        } else if (this.method1701(var2)) {
            Statics.method5769(arg0);
        } else if (this.method1706(var2, false)) {
            StringBuilder var10000 = new StringBuilder();
            class326 var10001 = (class326) null;
            StringBuilder var6 = var10000.append(class326.field4098).append(arg0);
            class326 var8 = (class326) null;
            String var4 = var6.append(class326.field4005).toString();
            class107.method3247(30, "", var4);
        } else {
            class278 var5 = class278.method2890(class276.field3076, client.field567.field1425);
            var5.field3177.method7789(class467.method155(arg0));
            var5.field3177.method7782(arg0);
            client.field567.method2603(var5);
        }
    }

    @ObfuscatedName("m.n(B)V")
    public static final void method16() {
        class326 var10000 = (class326) null;
        String var0 = class326.field4001;
        class107.method3247(30, "", var0);
    }

    @ObfuscatedName("bi.k(I)Z")
    public final boolean method1711() {
        return this.field830.method6866() || this.field830.method6865() >= 100 && client.field693 != 1;
    }

    @ObfuscatedName("bi.a(Ljava/lang/String;I)V")
    public final void method1712(String arg0) {
        if (arg0 == null) {
            return;
        }
        class490 var2 = new class490(arg0, this.field828);
        if (!var2.method8385()) {
            return;
        }
        if (this.field829.method6918(var2)) {
            client.field716 = client.field706;
            class278 var3 = class278.method2890(class276.field3151, client.field567.field1425);
            var3.field3177.method7789(class467.method155(arg0));
            var3.field3177.method7782(arg0);
            client.field567.method2603(var3);
        }
        client.method6050();
    }

    @ObfuscatedName("bi.s(Ljava/lang/String;I)V")
    public final void method1700(String arg0) {
        if (arg0 == null) {
            return;
        }
        class490 var2 = new class490(arg0, this.field828);
        if (!var2.method8385()) {
            return;
        }
        if (this.field830.method6918(var2)) {
            client.field716 = client.field706;
            class278 var3 = class278.method2890(class276.field3149, client.field567.field1425);
            var3.field3177.method7789(class467.method155(arg0));
            var3.field3177.method7782(arg0);
            client.field567.method2603(var3);
        }
        client.method4788();
    }

    @ObfuscatedName("fo.l(Ljava/lang/String;II)V")
    public static final void method3039(String arg0, int arg1) {
        class278 var2 = class278.method2890(class276.field3090, client.field567.field1425);
        var2.field3177.method7789(class467.method155(arg0) + 1);
        var2.field3177.method7820(arg1);
        var2.field3177.method7782(arg0);
        client.field567.method2603(var2);
    }

    @ObfuscatedName("bi.t(Lrp;I)Z")
    public final boolean method1727(class490 arg0) {
        class391 var2 = (class391) this.field829.method6886(arg0);
        return var2 != null && var2.method6934();
    }
}

package deob;

@ObfuscatedName("cm")
public class class84 {

    @ObfuscatedName("cm.w")
    public final class349 field1071;

    @ObfuscatedName("cm.t")
    public final class293 field1068;

    @ObfuscatedName("cm.j")
    public final class287 field1069;

    @ObfuscatedName("cm.n")
    public int field1070 = 0;

    public class84(class349 arg0) {
        this.field1071 = arg0;
        this.field1068 = new class293(arg0);
        this.field1069 = new class287(arg0);
    }

    @ObfuscatedName("cm.h(I)Z")
    public boolean method1791() {
        return this.field1070 == 2;
    }

    @ObfuscatedName("cm.v(I)V")
    public final void method1771() {
        this.field1070 = 1;
    }

    @ObfuscatedName("cm.x(Lkj;II)V")
    public final void method1774(class311 arg0, int arg1) {
        this.field1068.method4812(arg0, arg1);
        this.field1070 = 2;
        for (int var3 = 0; var3 < class99.field1264; var3++) {
            class76 var4 = client.field765[class99.field1269[var3]];
            var4.method1184();
        }
        class101.method2026();
        if (Statics.field245 != null) {
            Statics.field245.method4847();
        }
    }

    @ObfuscatedName("cm.w(I)V")
    public final void method1775() {
        for (class297 var1 = (class297) this.field1068.field3657.method4570(); var1 != null; var1 = (class297) this.field1068.field3657.method4573()) {
            if ((long) var1.field3681 < class308.method4891() / 1000L - 5L) {
                if (var1.field3680 > 0) {
                    Statics.method3809(5, "", var1.field3679 + class234.field2923);
                }
                if (var1.field3680 == 0) {
                    Statics.method3809(5, "", var1.field3679 + class234.field2936);
                }
                var1.method3357();
            }
        }
    }

    @ObfuscatedName("cm.t(I)V")
    public final void method1776() {
        this.field1070 = 0;
        this.field1068.method4755();
        this.field1069.method4755();
    }

    @ObfuscatedName("cm.j(Lki;ZB)Z")
    public final boolean method1777(class294 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2563.field620)) {
            return true;
        } else {
            return this.field1068.method4811(arg0, arg1);
        }
    }

    @ObfuscatedName("cm.n(Lki;I)Z")
    public final boolean method1816(class294 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1069.method4733(arg0);
        }
    }

    @ObfuscatedName("cm.p(Ljava/lang/String;I)V")
    public final void method1779(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1071);
        if (!var2.method4822()) {
            return;
        }
        if (this.method1780()) {
            method3635();
        } else if (Statics.field2563.field620.equals(var2)) {
            method3370();
        } else if (this.method1777(var2, false)) {
            method3653(arg0);
        } else if (this.method1816(var2)) {
            StringBuilder var10000 = new StringBuilder();
            class234 var10001 = (class234) null;
            StringBuilder var4 = var10000.append(class234.field2960).append(arg0);
            class234 var5 = (class234) null;
            String var3 = var4.append(class234.field3083).toString();
            Statics.method3809(30, "", var3);
        } else {
            method2702(arg0);
        }
    }

    @ObfuscatedName("hj.l(I)V")
    public static final void method3635() {
        class234 var10000 = (class234) null;
        String var0 = class234.field2954;
        Statics.method3809(30, "", var0);
    }

    @ObfuscatedName("hx.z(Ljava/lang/String;I)V")
    public static final void method3653(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class234 var10001 = (class234) null;
        String var1 = var10000.append(class234.field2955).toString();
        Statics.method3809(30, "", var1);
    }

    @ObfuscatedName("gt.u(I)V")
    public static final void method3370() {
        class234 var10000 = (class234) null;
        String var0 = class234.field3044;
        Statics.method3809(30, "", var0);
    }

    @ObfuscatedName("em.e(Ljava/lang/String;I)V")
    public static final void method2702(String arg0) {
        class197 var1 = class197.method1128(class193.field2242, client.field695.field1329);
        var1.field2361.method5095(class311.method2704(arg0));
        var1.field2361.method5105(arg0);
        client.field695.method2155(var1);
    }

    @ObfuscatedName("cm.m(I)Z")
    public final boolean method1780() {
        return this.field1068.method4775() || this.field1068.method4731() >= 200 && client.field767 != 1;
    }

    @ObfuscatedName("cm.c(Ljava/lang/String;I)V")
    public final void method1781(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1071);
        if (!var2.method4822()) {
            return;
        }
        class234 var6;
        if (this.method1790()) {
            var6 = (class234) null;
            String var3 = class234.field2956;
            Statics.method3809(30, "", var3);
        } else if (Statics.field2563.field620.equals(var2)) {
            var6 = (class234) null;
            String var4 = class234.field2959;
            Statics.method3809(30, "", var4);
        } else if (this.method1816(var2)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class234 var10001 = (class234) null;
            String var5 = var10000.append(class234.field2957).toString();
            Statics.method3809(30, "", var5);
        } else if (this.method1777(var2, false)) {
            method143(arg0);
        } else {
            method2925(arg0);
        }
    }

    @ObfuscatedName("b.i(Ljava/lang/String;I)V")
    public static final void method143(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class234 var10001 = (class234) null;
        StringBuilder var2 = var10000.append(class234.field2858).append(arg0);
        class234 var3 = (class234) null;
        String var1 = var2.append(class234.field2786).toString();
        Statics.method3809(30, "", var1);
    }

    @ObfuscatedName("ej.f(Ljava/lang/String;B)V")
    public static final void method2925(String arg0) {
        class197 var1 = class197.method1128(class193.field2320, client.field695.field1329);
        var1.field2361.method5095(class311.method2704(arg0));
        var1.field2361.method5105(arg0);
        client.field695.method2155(var1);
    }

    @ObfuscatedName("cm.y(I)Z")
    public final boolean method1790() {
        return this.field1069.method4775() || this.field1069.method4731() >= 100 && client.field767 != 1;
    }

    @ObfuscatedName("cm.r(Ljava/lang/String;I)V")
    public final void method1783(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1071);
        if (!var2.method4822()) {
            return;
        }
        if (this.field1068.method4737(var2)) {
            client.field880 = client.field738;
            class197 var3 = class197.method1128(class193.field2291, client.field695.field1329);
            var3.field2361.method5095(class311.method2704(arg0));
            var3.field2361.method5105(arg0);
            client.field695.method2155(var3);
        }
        for (int var4 = 0; var4 < class99.field1264; var4++) {
            class76 var5 = client.field765[class99.field1269[var4]];
            var5.method1184();
        }
        class101.method2026();
        if (Statics.field245 != null) {
            Statics.field245.method4847();
        }
    }

    @ObfuscatedName("cm.q(Ljava/lang/String;B)V")
    public final void method1784(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1071);
        if (!var2.method4822()) {
            return;
        }
        if (this.field1069.method4737(var2)) {
            client.field880 = client.field738;
            class197 var3 = class197.method1128(class193.field2319, client.field695.field1329);
            var3.field2361.method5095(class311.method2704(arg0));
            var3.field2361.method5105(arg0);
            client.field695.method2155(var3);
        }
        client.method90();
    }

    @ObfuscatedName("be.g(Ljava/lang/String;II)V")
    public static final void method1238(String arg0, int arg1) {
        class197 var2 = class197.method1128(class193.field2293, client.field695.field1329);
        var2.field2361.method5095(class311.method2704(arg0) + 1);
        var2.field2361.method5105(arg0);
        var2.field2361.method5142(arg1);
        client.field695.method2155(var2);
    }

    @ObfuscatedName("cm.o(Lki;I)Z")
    public final boolean method1785(class294 arg0) {
        class295 var2 = (class295) this.field1068.method4734(arg0);
        return var2 != null && var2.method4802();
    }
}

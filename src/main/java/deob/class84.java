package deob;

import java.util.Iterator;

@ObfuscatedName("cc")
public class class84 {

    @ObfuscatedName("cc.m")
    public final class349 field1095;

    @ObfuscatedName("cc.z")
    public final class293 field1096;

    @ObfuscatedName("cc.q")
    public final class287 field1097;

    @ObfuscatedName("cc.k")
    public int field1098 = 0;

    public class84(class349 arg0) {
        this.field1095 = arg0;
        this.field1096 = new class293(arg0);
        this.field1097 = new class287(arg0);
    }

    @ObfuscatedName("cc.f(I)Z")
    public boolean method1775() {
        return this.field1098 == 2;
    }

    @ObfuscatedName("cc.b(I)V")
    public final void method1774() {
        this.field1098 = 1;
    }

    @ObfuscatedName("cc.l(Lkb;II)V")
    public final void method1803(class311 arg0, int arg1) {
        this.field1096.method4897(arg0, arg1);
        this.field1098 = 2;
        for (int var3 = 0; var3 < class99.field1286; var3++) {
            class76 var4 = client.field798[class99.field1287[var3]];
            var4.method1169();
        }
        Iterator var5 = class101.field1306.iterator();
        while (var5.hasNext()) {
            class74 var6 = (class74) var5.next();
            var6.method1131();
        }
        if (Statics.field438 != null) {
            Statics.field438.method4926();
        }
    }

    @ObfuscatedName("cc.m(I)V")
    public final void method1833() {
        for (class297 var1 = (class297) this.field1096.field3653.method4660(); var1 != null; var1 = (class297) this.field1096.field3653.method4661()) {
            if ((long) var1.field3671 < class308.method4786() / 1000L - 5L) {
                if (var1.field3669 > 0) {
                    class101.method783(5, "", var1.field3670 + class234.field2874);
                }
                if (var1.field3669 == 0) {
                    class101.method783(5, "", var1.field3670 + class234.field2892);
                }
                var1.method3404();
            }
        }
    }

    @ObfuscatedName("cc.z(I)V")
    public final void method1779() {
        this.field1098 = 0;
        this.field1096.method4808();
        this.field1097.method4808();
    }

    @ObfuscatedName("cc.q(Lkm;ZI)Z")
    public final boolean method1814(class294 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field3130.field660)) {
            return true;
        } else {
            return this.field1096.method4896(arg0, arg1);
        }
    }

    @ObfuscatedName("cc.k(Lkm;I)Z")
    public final boolean method1781(class294 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1097.method4811(arg0);
        }
    }

    @ObfuscatedName("cc.c(Ljava/lang/String;I)V")
    public final void method1782(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1095);
        if (!var2.method4902()) {
            return;
        }
        if (this.method1783()) {
            class234 var10000 = (class234) null;
            String var3 = class234.field2955;
            class101.method783(30, "", var3);
        } else if (Statics.field3130.field660.equals(var2)) {
            method1127();
        } else if (this.method1814(var2, false)) {
            method824(arg0);
        } else if (this.method1781(var2)) {
            method209(arg0);
        } else {
            method790(arg0);
        }
    }

    @ObfuscatedName("bo.u(Ljava/lang/String;I)V")
    public static final void method824(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class234 var10001 = (class234) null;
        String var1 = var10000.append(class234.field2956).toString();
        class101.method783(30, "", var1);
    }

    @ObfuscatedName("d.t(Ljava/lang/String;I)V")
    public static final void method209(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class234 var10001 = (class234) null;
        StringBuilder var2 = var10000.append(class234.field2895).append(arg0);
        class234 var3 = (class234) null;
        String var1 = var2.append(class234.field2962).toString();
        class101.method783(30, "", var1);
    }

    @ObfuscatedName("bh.e(I)V")
    public static final void method1127() {
        class234 var10000 = (class234) null;
        String var0 = class234.field2959;
        class101.method783(30, "", var0);
    }

    @ObfuscatedName("bj.o(Ljava/lang/String;I)V")
    public static final void method790(String arg0) {
        class197 var1 = class197.method57(class193.field2335, client.field729.field1347);
        var1.field2371.method5203(class311.method3740(arg0));
        var1.field2371.method5355(arg0);
        client.field729.method2178(var1);
    }

    @ObfuscatedName("cc.n(I)Z")
    public final boolean method1783() {
        return this.field1096.method4810() || this.field1096.method4816() >= 200 && client.field800 != 1;
    }

    @ObfuscatedName("cc.x(Ljava/lang/String;I)V")
    public final void method1784(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1095);
        if (!var2.method4902()) {
            return;
        }
        class234 var10000;
        if (this.method1785()) {
            var10000 = (class234) null;
            String var3 = class234.field2957;
            class101.method783(30, "", var3);
        } else if (Statics.field3130.field660.equals(var2)) {
            var10000 = (class234) null;
            String var4 = class234.field2960;
            class101.method783(30, "", var4);
        } else if (this.method1781(var2)) {
            method3720(arg0);
        } else if (this.method1814(var2, false)) {
            method430(arg0);
        } else {
            method1686(arg0);
        }
    }

    @ObfuscatedName("hq.p(Ljava/lang/String;I)V")
    public static final void method3720(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class234 var10001 = (class234) null;
        String var1 = var10000.append(class234.field2958).toString();
        class101.method783(30, "", var1);
    }

    @ObfuscatedName("ak.r(Ljava/lang/String;I)V")
    public static final void method430(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class234 var10001 = (class234) null;
        StringBuilder var2 = var10000.append(class234.field2963).append(arg0);
        class234 var3 = (class234) null;
        String var1 = var2.append(class234.field2964).toString();
        class101.method783(30, "", var1);
    }

    @ObfuscatedName("ce.y(Ljava/lang/String;I)V")
    public static final void method1686(String arg0) {
        class197 var1 = class197.method57(class193.field2238, client.field729.field1347);
        var1.field2371.method5203(class311.method3740(arg0));
        var1.field2371.method5355(arg0);
        client.field729.method2178(var1);
    }

    @ObfuscatedName("cc.s(B)Z")
    public final boolean method1785() {
        return this.field1097.method4810() || this.field1097.method4816() >= 100 && client.field800 != 1;
    }

    @ObfuscatedName("cc.j(Ljava/lang/String;I)V")
    public final void method1786(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1095);
        if (!var2.method4902()) {
            return;
        }
        if (this.field1096.method4814(var2)) {
            client.field875 = client.field867;
            class197 var3 = class197.method57(class193.field2328, client.field729.field1347);
            var3.field2371.method5203(class311.method3740(arg0));
            var3.field2371.method5355(arg0);
            client.field729.method2178(var3);
        }
        for (int var4 = 0; var4 < class99.field1286; var4++) {
            class76 var5 = client.field798[class99.field1287[var4]];
            var5.method1169();
        }
        Iterator var6 = class101.field1306.iterator();
        while (var6.hasNext()) {
            class74 var7 = (class74) var6.next();
            var7.method1131();
        }
        if (Statics.field438 != null) {
            Statics.field438.method4926();
        }
    }

    @ObfuscatedName("cc.d(Ljava/lang/String;B)V")
    public final void method1822(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1095);
        if (!var2.method4902()) {
            return;
        }
        if (this.field1097.method4814(var2)) {
            client.field875 = client.field867;
            class197 var3 = class197.method57(class193.field2241, client.field729.field1347);
            var3.field2371.method5203(class311.method3740(arg0));
            var3.field2371.method5355(arg0);
            client.field729.method2178(var3);
        }
        client.method739();
    }

    @ObfuscatedName("ba.a(Ljava/lang/String;II)V")
    public static final void method979(String arg0, int arg1) {
        class197 var2 = class197.method57(class193.field2235, client.field729.field1347);
        var2.field2371.method5203(class311.method3740(arg0) + 1);
        var2.field2371.method5355(arg0);
        var2.field2371.method5207(arg1);
        client.field729.method2178(var2);
    }

    @ObfuscatedName("cc.g(Lkm;I)Z")
    public final boolean method1788(class294 arg0) {
        class295 var2 = (class295) this.field1096.method4812(arg0);
        return var2 != null && var2.method4883();
    }
}

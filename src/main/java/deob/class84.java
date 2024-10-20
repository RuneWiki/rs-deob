package deob;

import java.util.Iterator;

@ObfuscatedName("cg")
public class class84 {

    @ObfuscatedName("cg.j")
    public final class348 field1091;

    @ObfuscatedName("cg.p")
    public final class292 field1092;

    @ObfuscatedName("cg.g")
    public final class286 field1090;

    @ObfuscatedName("cg.n")
    public int field1095 = 0;

    public class84(class348 arg0) {
        this.field1091 = arg0;
        this.field1092 = new class292(arg0);
        this.field1090 = new class286(arg0);
    }

    @ObfuscatedName("cg.m(I)Z")
    public boolean method1729() {
        return this.field1095 == 2;
    }

    @ObfuscatedName("cg.o(S)V")
    public final void method1787() {
        this.field1095 = 1;
    }

    @ObfuscatedName("cg.q(Lkn;II)V")
    public final void method1730(class310 arg0, int arg1) {
        this.field1092.method4915(arg0, arg1);
        this.field1095 = 2;
        for (int var3 = 0; var3 < class99.field1281; var3++) {
            class76 var4 = client.field790[class99.field1282[var3]];
            var4.method1125();
        }
        Iterator var5 = class101.field1302.iterator();
        while (var5.hasNext()) {
            class74 var6 = (class74) var5.next();
            var6.method1090();
        }
        if (Statics.field1085 != null) {
            Statics.field1085.method4954();
        }
    }

    @ObfuscatedName("cg.j(I)V")
    public final void method1732() {
        for (class296 var1 = (class296) this.field1092.field3652.method4677(); var1 != null; var1 = (class296) this.field1092.field3652.method4684()) {
            if ((long) var1.field3668 < class307.method3253() / 1000L - 5L) {
                if (var1.field3665 > 0) {
                    class101.method1815(5, "", var1.field3666 + class234.field2942);
                }
                if (var1.field3665 == 0) {
                    class101.method1815(5, "", var1.field3666 + class234.field2943);
                }
                var1.method3384();
            }
        }
    }

    @ObfuscatedName("cg.p(I)V")
    public final void method1733() {
        this.field1095 = 0;
        this.field1092.method4816();
        this.field1090.method4816();
    }

    @ObfuscatedName("cg.g(Lkq;ZI)Z")
    public final boolean method1734(class293 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field455.field658)) {
            return true;
        } else {
            return this.field1092.method4914(arg0, arg1);
        }
    }

    @ObfuscatedName("cg.n(Lkq;B)Z")
    public final boolean method1735(class293 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1090.method4889(arg0);
        }
    }

    @ObfuscatedName("cg.u(Ljava/lang/String;I)V")
    public final void method1736(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1091);
        if (!var2.method4926()) {
            return;
        }
        if (this.method1781()) {
            method293();
        } else if (Statics.field455.field658.equals(var2)) {
            method220();
        } else if (this.method1734(var2, false)) {
            method759(arg0);
        } else if (this.method1735(var2)) {
            method71(arg0);
        } else {
            class197 var3 = class197.method3184(class193.field2337, client.field721.field1340);
            var3.field2375.method5437(Statics.method2147(arg0));
            var3.field2375.method5217(arg0);
            client.field721.method2161(var3);
        }
    }

    @ObfuscatedName("ax.a(I)V")
    public static final void method293() {
        class234 var10000 = (class234) null;
        String var0 = class234.field2961;
        class101.method1815(30, "", var0);
    }

    @ObfuscatedName("ba.z(Ljava/lang/String;I)V")
    public static final void method759(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class234 var10001 = (class234) null;
        String var1 = var10000.append(class234.field2962).toString();
        class101.method1815(30, "", var1);
    }

    @ObfuscatedName("u.w(Ljava/lang/String;B)V")
    public static final void method71(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class234 var10001 = (class234) null;
        StringBuilder var2 = var10000.append(class234.field2967).append(arg0);
        class234 var3 = (class234) null;
        String var1 = var2.append(class234.field2968).toString();
        class101.method1815(30, "", var1);
    }

    @ObfuscatedName("ah.y(I)V")
    public static final void method220() {
        class234 var10000 = (class234) null;
        String var0 = class234.field2965;
        class101.method1815(30, "", var0);
    }

    @ObfuscatedName("cg.c(I)Z")
    public final boolean method1781() {
        return this.field1092.method4818() || this.field1092.method4860() >= 200 && client.field792 != 1;
    }

    @ObfuscatedName("cg.h(Ljava/lang/String;I)V")
    public final void method1737(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1091);
        if (!var2.method4926()) {
            return;
        }
        class234 var10000;
        if (this.method1761()) {
            var10000 = (class234) null;
            String var3 = class234.field2963;
            class101.method1815(30, "", var3);
        } else if (Statics.field455.field658.equals(var2)) {
            var10000 = (class234) null;
            String var4 = class234.field2823;
            class101.method1815(30, "", var4);
        } else if (this.method1735(var2)) {
            method555(arg0);
        } else if (this.method1734(var2, false)) {
            method2618(arg0);
        } else {
            class197 var5 = class197.method3184(class193.field2317, client.field721.field1340);
            var5.field2375.method5437(Statics.method2147(arg0));
            var5.field2375.method5217(arg0);
            client.field721.method2161(var5);
        }
    }

    @ObfuscatedName("av.k(Ljava/lang/String;I)V")
    public static final void method555(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class234 var10001 = (class234) null;
        String var1 = var10000.append(class234.field2995).toString();
        class101.method1815(30, "", var1);
    }

    @ObfuscatedName("dj.r(Ljava/lang/String;I)V")
    public static final void method2618(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class234 var10001 = (class234) null;
        StringBuilder var2 = var10000.append(class234.field2949).append(arg0);
        class234 var3 = (class234) null;
        String var1 = var2.append(class234.field2811).toString();
        class101.method1815(30, "", var1);
    }

    @ObfuscatedName("cg.d(I)Z")
    public final boolean method1761() {
        return this.field1090.method4818() || this.field1090.method4860() >= 100 && client.field792 != 1;
    }

    @ObfuscatedName("cg.e(Ljava/lang/String;I)V")
    public final void method1739(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1091);
        if (!var2.method4926()) {
            return;
        }
        if (this.field1092.method4823(var2)) {
            client.field867 = client.field859;
            class197 var3 = class197.method3184(class193.field2307, client.field721.field1340);
            var3.field2375.method5437(Statics.method2147(arg0));
            var3.field2375.method5217(arg0);
            client.field721.method2161(var3);
        }
        for (int var4 = 0; var4 < class99.field1281; var4++) {
            class76 var5 = client.field790[class99.field1282[var4]];
            var5.method1125();
        }
        Iterator var6 = class101.field1302.iterator();
        while (var6.hasNext()) {
            class74 var7 = (class74) var6.next();
            var7.method1090();
        }
        if (Statics.field1085 != null) {
            Statics.field1085.method4954();
        }
    }

    @ObfuscatedName("cg.l(Ljava/lang/String;I)V")
    public final void method1740(String arg0) {
        if (arg0 == null) {
            return;
        }
        class293 var2 = new class293(arg0, this.field1091);
        if (!var2.method4926()) {
            return;
        }
        if (this.field1090.method4823(var2)) {
            client.field867 = client.field859;
            class197 var3 = class197.method3184(class193.field2256, client.field721.field1340);
            var3.field2375.method5437(Statics.method2147(arg0));
            var3.field2375.method5217(arg0);
            client.field721.method2161(var3);
        }
        client.method398();
    }

    @ObfuscatedName("bk.t(Ljava/lang/String;II)V")
    public static final void method705(String arg0, int arg1) {
        class197 var2 = class197.method3184(class193.field2330, client.field721.field1340);
        var2.field2375.method5437(Statics.method2147(arg0) + 1);
        var2.field2375.method5217(arg0);
        var2.field2375.method5254(arg1);
        client.field721.method2161(var2);
    }

    @ObfuscatedName("cg.x(Lkq;B)Z")
    public final boolean method1741(class293 arg0) {
        class294 var2 = (class294) this.field1092.method4820(arg0);
        return var2 != null && var2.method4901();
    }
}

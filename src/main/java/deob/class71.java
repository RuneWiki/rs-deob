package deob;

@ObfuscatedName("ci")
public class class71 {

    @ObfuscatedName("ci.ak")
    public final class525 field838;

    @ObfuscatedName("ci.ap")
    public final class466 field837;

    @ObfuscatedName("ci.an")
    public final class464 field835;

    @ObfuscatedName("ci.aj")
    public int field836 = 0;

    public class71(class525 arg0) {
        this.field838 = arg0;
        this.field837 = new class466(arg0);
        this.field835 = new class464(arg0);
    }

    @ObfuscatedName("ci.aq(I)Z")
    public boolean method1814() {
        return this.field836 == 2;
    }

    @ObfuscatedName("ci.ad(I)V")
    public final void method1815() {
        this.field836 = 1;
    }

    @ObfuscatedName("ci.ag(Lvp;IB)V")
    public final void method1816(class547 arg0, int arg1) {
        this.field837.method7771(arg0, arg1);
        this.field836 = 2;
        client.method5721();
    }

    @ObfuscatedName("ci.ak(B)V")
    public final void method1826() {
        for (class469 var1 = (class469) this.field837.field4921.method6905(); var1 != null; var1 = (class469) this.field837.field4921.method6913()) {
            if ((long) var1.field4937 < class327.method4500() / 1000L - 5L) {
                if (var1.field4935 > 0) {
                    class114.method3518(5, "", var1.field4936 + class379.field4280);
                }
                if (var1.field4935 == 0) {
                    class114.method3518(5, "", var1.field4936 + class379.field4281);
                }
                var1.method8123();
            }
        }
    }

    @ObfuscatedName("ci.ap(I)V")
    public final void method1867() {
        this.field836 = 0;
        this.field837.method7866();
        this.field835.method7866();
    }

    @ObfuscatedName("ci.an(Lvo;ZI)Z")
    public final boolean method1819(class569 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field297.field1137)) {
            return true;
        } else {
            return this.field837.method7772(arg0, arg1);
        }
    }

    @ObfuscatedName("ci.aj(Lvo;I)Z")
    public final boolean method1837(class569 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field835.method7869(arg0);
        }
    }

    @ObfuscatedName("ci.av(Ljava/lang/String;B)V")
    public final void method1875(String arg0) {
        if (arg0 == null) {
            return;
        }
        class569 var2 = new class569(arg0, this.field838);
        if (!var2.method9359()) {
            return;
        }
        if (this.method1818()) {
            method4608(class379.field4299);
        } else if (Statics.field297.field1137.equals(var2)) {
            method4608(class379.field4303);
        } else if (this.method1819(var2, false)) {
            method840(arg0);
        } else if (this.method1837(var2)) {
            method8118(arg0);
        } else {
            class322 var3 = class322.method3236(class320.field3355, client.field653.field1456);
            var3.field3394.method8711(class547.method2396(arg0));
            var3.field3394.method8718(arg0);
            client.field653.method2773(var3);
        }
    }

    @ObfuscatedName("kh.ab(Ljava/lang/String;I)V")
    public static final void method4608(String arg0) {
        class114.method3518(30, "", arg0);
    }

    @ObfuscatedName("bn.ai(Ljava/lang/String;I)V")
    public static final void method840(String arg0) {
        method4608(arg0 + class379.field4300);
    }

    @ObfuscatedName("tg.ae(Ljava/lang/String;S)V")
    public static final void method8118(String arg0) {
        method4608(class379.field4305 + arg0 + class379.field4381);
    }

    @ObfuscatedName("ci.au(B)Z")
    public final boolean method1818() {
        return this.field837.method7868() || this.field837.method7889() >= 200 && client.field629 != 1;
    }

    @ObfuscatedName("ci.ah(Ljava/lang/String;I)V")
    public final void method1823(String arg0) {
        if (arg0 == null) {
            return;
        }
        class569 var2 = new class569(arg0, this.field838);
        if (!var2.method9359()) {
            return;
        }
        if (this.method1848()) {
            method3087();
        } else if (Statics.field297.field1137.equals(var2)) {
            method4096();
        } else if (this.method1837(var2)) {
            method4608(arg0 + class379.field4302);
        } else if (this.method1819(var2, false)) {
            method4608(class379.field4307 + arg0 + class379.field4308);
        } else {
            class322 var3 = class322.method3236(class320.field3299, client.field653.field1456);
            var3.field3394.method8711(class547.method2396(arg0));
            var3.field3394.method8718(arg0);
            client.field653.method2773(var3);
        }
    }

    @ObfuscatedName("fm.az(I)V")
    public static final void method3087() {
        method4608(class379.field4232);
    }

    @ObfuscatedName("jd.ax(I)V")
    public static final void method4096() {
        method4608(class379.field4304);
    }

    @ObfuscatedName("ci.ac(I)Z")
    public final boolean method1848() {
        return this.field835.method7868() || this.field835.method7889() >= 100 && client.field629 != 1;
    }

    @ObfuscatedName("ci.al(Ljava/lang/String;B)V")
    public final void method1858(String arg0) {
        if (arg0 == null) {
            return;
        }
        class569 var2 = new class569(arg0, this.field838);
        if (!var2.method9359()) {
            return;
        }
        if (this.field837.method7921(var2)) {
            client.method8121();
            class322 var3 = class322.method3236(class320.field3292, client.field653.field1456);
            var3.field3394.method8711(class547.method2396(arg0));
            var3.field3394.method8718(arg0);
            client.field653.method2773(var3);
        }
        client.method5721();
    }

    @ObfuscatedName("ci.ay(Ljava/lang/String;ZB)V")
    public final void method1820(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class569 var3 = new class569(arg0, this.field838);
        if (!var3.method9359()) {
            return;
        }
        if (this.field835.method7921(var3)) {
            client.method8121();
            if (arg1) {
                class322 var4 = class322.method3236(class320.field3357, client.field653.field1456);
                var4.field3394.method8711(class547.method2396(arg0));
                var4.field3394.method8718(arg0);
                client.field653.method2773(var4);
            }
        }
        client.method3108();
    }

    @ObfuscatedName("ij.ao(Ljava/lang/String;IB)V")
    public static final void method4055(String arg0, int arg1) {
        class322 var2 = class322.method3236(class320.field3343, client.field653.field1456);
        var2.field3394.method8711(class547.method2396(arg0) + 1);
        var2.field3394.method8718(arg0);
        var2.field3394.method8711(arg1);
        client.field653.method2773(var2);
    }

    @ObfuscatedName("ci.aa(Lvo;I)Z")
    public final boolean method1852(class569 arg0) {
        class468 var2 = (class468) this.field837.method7870(arg0);
        return var2 != null && var2.method7934();
    }
}

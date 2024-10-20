package deob;

@ObfuscatedName("cq")
public class class71 {

    @ObfuscatedName("cq.az")
    public final class524 field856;

    @ObfuscatedName("cq.af")
    public final class465 field853;

    @ObfuscatedName("cq.aa")
    public final class463 field854;

    @ObfuscatedName("cq.at")
    public int field855 = 0;

    public class71(class524 arg0) {
        this.field856 = arg0;
        this.field853 = new class465(arg0);
        this.field854 = new class463(arg0);
    }

    @ObfuscatedName("cq.ak(I)Z")
    public boolean method1797() {
        return this.field855 == 2;
    }

    @ObfuscatedName("cq.al(B)V")
    public final void method1798() {
        this.field855 = 1;
    }

    @ObfuscatedName("cq.aj(Lua;II)V")
    public final void method1806(class546 arg0, int arg1) {
        this.field853.method7806(arg0, arg1);
        this.field855 = 2;
        client.method2307();
    }

    @ObfuscatedName("cq.az(I)V")
    public final void method1843() {
        for (class468 var1 = (class468) this.field853.field4903.method6960(); var1 != null; var1 = (class468) this.field853.field4903.method6962()) {
            if ((long) var1.field4915 < class326.method2895() / 1000L - 5L) {
                if (var1.field4916 > 0) {
                    class114.method2802(5, "", var1.field4914 + class378.field4253);
                }
                if (var1.field4916 == 0) {
                    class114.method2802(5, "", var1.field4914 + class378.field4322);
                }
                var1.method8181();
            }
        }
    }

    @ObfuscatedName("cq.af(I)V")
    public final void method1801() {
        this.field855 = 0;
        this.field853.method7907();
        this.field854.method7907();
    }

    @ObfuscatedName("cq.aa(Lvv;ZI)Z")
    public final boolean method1818(class568 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field84.field1153)) {
            return true;
        } else {
            return this.field853.method7813(arg0, arg1);
        }
    }

    @ObfuscatedName("cq.at(Lvv;B)Z")
    public final boolean method1803(class568 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field854.method7908(arg0);
        }
    }

    @ObfuscatedName("cq.ab(Ljava/lang/String;I)V")
    public final void method1804(String arg0) {
        if (arg0 == null) {
            return;
        }
        class568 var2 = new class568(arg0, this.field856);
        if (!var2.method9387()) {
            return;
        }
        if (this.method1805()) {
            Statics.method7067();
        } else if (Statics.field84.field1153.equals(var2)) {
            method3218();
        } else if (this.method1818(var2, false)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class378 var10001 = (class378) null;
            String var3 = var10000.append(class378.field4272).toString();
            class114.method2802(30, "", var3);
        } else if (this.method1803(var2)) {
            method3445(arg0);
        } else {
            class321 var4 = class321.method3542(class319.field3282, client.field591.field1467);
            var4.field3393.method8779(class546.method7454(arg0));
            var4.field3393.method8864(arg0);
            client.field591.method2745(var4);
        }
    }

    @ObfuscatedName("hg.ao(Ljava/lang/String;I)V")
    public static final void method3445(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class378 var10001 = (class378) null;
        StringBuilder var2 = var10000.append(class378.field4277).append(arg0);
        class378 var3 = (class378) null;
        String var1 = var2.append(class378.field4278).toString();
        class114.method2802(30, "", var1);
    }

    @ObfuscatedName("gb.ah(B)V")
    public static final void method3218() {
        class378 var10000 = (class378) null;
        String var0 = class378.field4275;
        class114.method2802(30, "", var0);
    }

    @ObfuscatedName("cq.av(I)Z")
    public final boolean method1805() {
        return this.field853.method7968() || this.field853.method7931() >= 200 && client.field654 != 1;
    }

    @ObfuscatedName("cq.aq(Ljava/lang/String;I)V")
    public final void method1846(String arg0) {
        if (arg0 == null) {
            return;
        }
        class568 var2 = new class568(arg0, this.field856);
        if (!var2.method9387()) {
            return;
        }
        class378 var6;
        if (this.method1810()) {
            var6 = (class378) null;
            String var3 = class378.field4273;
            class114.method2802(30, "", var3);
        } else if (Statics.field84.field1153.equals(var2)) {
            var6 = (class378) null;
            String var4 = class378.field4396;
            class114.method2802(30, "", var4);
        } else if (this.method1803(var2)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class378 var10001 = (class378) null;
            String var5 = var10000.append(class378.field4274).toString();
            class114.method2802(30, "", var5);
        } else if (this.method1818(var2, false)) {
            method4747(arg0);
        } else {
            method3471(arg0);
        }
    }

    @ObfuscatedName("jf.ap(Ljava/lang/String;I)V")
    public static final void method4747(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class378 var10001 = (class378) null;
        StringBuilder var2 = var10000.append(class378.field4223).append(arg0);
        class378 var3 = (class378) null;
        String var1 = var2.append(class378.field4280).toString();
        class114.method2802(30, "", var1);
    }

    @ObfuscatedName("ht.ae(Ljava/lang/String;I)V")
    public static final void method3471(String arg0) {
        class321 var1 = class321.method3542(class319.field3309, client.field591.field1467);
        var1.field3393.method8779(class546.method7454(arg0));
        var1.field3393.method8864(arg0);
        client.field591.method2745(var1);
    }

    @ObfuscatedName("cq.ax(B)Z")
    public final boolean method1810() {
        return this.field854.method7968() || this.field854.method7931() >= 100 && client.field654 != 1;
    }

    @ObfuscatedName("cq.ay(Ljava/lang/String;I)V")
    public final void method1858(String arg0) {
        if (arg0 == null) {
            return;
        }
        class568 var2 = new class568(arg0, this.field856);
        if (!var2.method9387()) {
            return;
        }
        if (this.field853.method7914(var2)) {
            client.field730 = client.field720;
            class321 var3 = class321.method3542(class319.field3302, client.field591.field1467);
            var3.field3393.method8779(class546.method7454(arg0));
            var3.field3393.method8864(arg0);
            client.field591.method2745(var3);
        }
        client.method2307();
    }

    @ObfuscatedName("cq.au(Ljava/lang/String;ZI)V")
    public final void method1809(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class568 var3 = new class568(arg0, this.field856);
        if (!var3.method9387()) {
            return;
        }
        if (this.field854.method7914(var3)) {
            client.field730 = client.field720;
            if (arg1) {
                class321 var4 = class321.method3542(class319.field3346, client.field591.field1467);
                var4.field3393.method8779(class546.method7454(arg0));
                var4.field3393.method8864(arg0);
                client.field591.method2745(var4);
            }
        }
        client.method2221();
    }

    @ObfuscatedName("iv.as(Ljava/lang/String;II)V")
    public static final void method4003(String arg0, int arg1) {
        class321 var2 = class321.method3542(class319.field3336, client.field591.field1467);
        var2.field3393.method8779(class546.method7454(arg0) + 1);
        var2.field3393.method8887(arg1);
        var2.field3393.method8864(arg0);
        client.field591.method2745(var2);
    }

    @ObfuscatedName("cq.aw(Lvv;I)Z")
    public final boolean method1813(class568 arg0) {
        class467 var2 = (class467) this.field853.method7911(arg0);
        return var2 != null && var2.method7988();
    }
}

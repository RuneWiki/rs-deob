package deob;

import java.util.Iterator;

@ObfuscatedName("bl")
public class class62 {

    @ObfuscatedName("bl.f")
    public final class423 field798;

    @ObfuscatedName("bl.j")
    public final class366 field801;

    @ObfuscatedName("bl.e")
    public final class364 field802;

    @ObfuscatedName("bl.g")
    public int field803 = 0;

    public class62(class423 arg0) {
        this.field798 = arg0;
        this.field801 = new class366(arg0);
        this.field802 = new class364(arg0);
    }

    @ObfuscatedName("bl.c(B)Z")
    public boolean method1545() {
        return this.field803 == 2;
    }

    @ObfuscatedName("bl.v(I)V")
    public final void method1546() {
        this.field803 = 1;
    }

    @ObfuscatedName("bl.q(Lqt;IB)V")
    public final void method1547(class443 arg0, int arg1) {
        this.field801.method5999(arg0, arg1);
        this.field803 = 2;
        for (int var3 = 0; var3 < class97.field1309; var3++) {
            class85 var4 = client.field643[class97.field1310[var3]];
            var4.method2028();
        }
        Iterator var5 = class99.field1333.iterator();
        while (var5.hasNext()) {
            class58 var6 = (class58) var5.next();
            var6.method1000();
        }
        if (Statics.field3294 != null) {
            Statics.field3294.method6010();
        }
    }

    @ObfuscatedName("bl.f(I)V")
    public final void method1548() {
        for (class369 var1 = (class369) this.field801.field4290.method5638(); var1 != null; var1 = (class369) this.field801.field4290.method5639()) {
            if ((long) var1.field4301 < class269.method2567() / 1000L - 5L) {
                if (var1.field4303 > 0) {
                    class99.method5035(5, "", var1.field4302 + class308.field3776);
                }
                if (var1.field4303 == 0) {
                    class99.method5035(5, "", var1.field4302 + class308.field3733);
                }
                var1.method6490();
            }
        }
    }

    @ObfuscatedName("bl.j(I)V")
    public final void method1570() {
        this.field803 = 0;
        this.field801.method6095();
        this.field802.method6095();
    }

    @ObfuscatedName("bl.e(Lqa;ZI)Z")
    public final boolean method1572(class464 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1366.field1114)) {
            return true;
        } else {
            return this.field801.method6000(arg0, arg1);
        }
    }

    @ObfuscatedName("bl.g(Lqa;I)Z")
    public final boolean method1551(class464 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field802.method6158(arg0);
        }
    }

    @ObfuscatedName("bl.w(Ljava/lang/String;B)V")
    public final void method1552(String arg0) {
        if (arg0 == null) {
            return;
        }
        class464 var2 = new class464(arg0, this.field798);
        if (!var2.method7619()) {
            return;
        }
        class308 var8;
        if (this.method1597()) {
            var8 = (class308) null;
            String var3 = class308.field3811;
            class99.method5035(30, "", var3);
        } else if (Statics.field1366.field1114.equals(var2)) {
            var8 = (class308) null;
            String var4 = class308.field3856;
            class99.method5035(30, "", var4);
        } else if (this.method1572(var2, false)) {
            method6044(arg0);
        } else if (this.method1551(var2)) {
            StringBuilder var10000 = new StringBuilder();
            class308 var10001 = (class308) null;
            StringBuilder var7 = var10000.append(class308.field3742).append(arg0);
            class308 var9 = (class308) null;
            String var5 = var7.append(class308.field3853).toString();
            class99.method5035(30, "", var5);
        } else {
            class264 var6 = class264.method3158(class262.field2965, client.field541.field1344);
            var6.field3031.method7031(class443.method2008(arg0));
            var6.field3031.method7037(arg0);
            client.field541.method2378(var6);
        }
    }

    @ObfuscatedName("nh.y(Ljava/lang/String;B)V")
    public static final void method6044(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class308 var10001 = (class308) null;
        String var1 = var10000.append(class308.field3796).toString();
        class99.method5035(30, "", var1);
    }

    @ObfuscatedName("bl.i(I)Z")
    public final boolean method1597() {
        return this.field801.method6097() || this.field801.method6096() >= 200 && client.field602 != 1;
    }

    @ObfuscatedName("bl.s(Ljava/lang/String;B)V")
    public final void method1554(String arg0) {
        if (arg0 == null) {
            return;
        }
        class464 var2 = new class464(arg0, this.field798);
        if (!var2.method7619()) {
            return;
        }
        if (this.method1555()) {
            method1025();
        } else if (Statics.field1366.field1114.equals(var2)) {
            class308 var7 = (class308) null;
            String var3 = class308.field3800;
            class99.method5035(30, "", var3);
        } else {
            StringBuilder var10000;
            class308 var10001;
            if (this.method1551(var2)) {
                var10000 = (new StringBuilder()).append(arg0);
                var10001 = (class308) null;
                String var4 = var10000.append(class308.field3798).toString();
                class99.method5035(30, "", var4);
            } else if (this.method1572(var2, false)) {
                var10000 = new StringBuilder();
                var10001 = (class308) null;
                StringBuilder var6 = var10000.append(class308.field3803).append(arg0);
                class308 var8 = (class308) null;
                String var5 = var6.append(class308.field3804).toString();
                class99.method5035(30, "", var5);
            } else {
                method2507(arg0);
            }
        }
    }

    @ObfuscatedName("bq.t(B)V")
    public static final void method1025() {
        class308 var10000 = (class308) null;
        String var0 = class308.field3865;
        class99.method5035(30, "", var0);
    }

    @ObfuscatedName("dx.z(Ljava/lang/String;I)V")
    public static final void method2507(String arg0) {
        class264 var1 = class264.method3158(class262.field2945, client.field541.field1344);
        var1.field3031.method7031(class443.method2008(arg0));
        var1.field3031.method7037(arg0);
        client.field541.method2378(var1);
    }

    @ObfuscatedName("bl.r(I)Z")
    public final boolean method1555() {
        return this.field802.method6097() || this.field802.method6096() >= 100 && client.field602 != 1;
    }

    @ObfuscatedName("bl.u(Ljava/lang/String;I)V")
    public final void method1556(String arg0) {
        if (arg0 == null) {
            return;
        }
        class464 var2 = new class464(arg0, this.field798);
        if (!var2.method7619()) {
            return;
        }
        if (this.field801.method6102(var2)) {
            client.field690 = client.field680;
            class264 var3 = class264.method3158(class262.field2959, client.field541.field1344);
            var3.field3031.method7031(class443.method2008(arg0));
            var3.field3031.method7037(arg0);
            client.field541.method2378(var3);
        }
        for (int var4 = 0; var4 < class97.field1309; var4++) {
            class85 var5 = client.field643[class97.field1310[var4]];
            var5.method2028();
        }
        Iterator var6 = class99.field1333.iterator();
        while (var6.hasNext()) {
            class58 var7 = (class58) var6.next();
            var7.method1000();
        }
        if (Statics.field3294 != null) {
            Statics.field3294.method6010();
        }
    }

    @ObfuscatedName("bl.k(Ljava/lang/String;I)V")
    public final void method1557(String arg0) {
        if (arg0 == null) {
            return;
        }
        class464 var2 = new class464(arg0, this.field798);
        if (!var2.method7619()) {
            return;
        }
        if (this.field802.method6102(var2)) {
            client.field690 = client.field680;
            class264 var3 = class264.method3158(class262.field2922, client.field541.field1344);
            var3.field3031.method7031(class443.method2008(arg0));
            var3.field3031.method7037(arg0);
            client.field541.method2378(var3);
        }
        client.method2692();
    }

    @ObfuscatedName("m.h(Ljava/lang/String;II)V")
    public static final void method304(String arg0, int arg1) {
        class264 var2 = class264.method3158(class262.field2972, client.field541.field1344);
        var2.field3031.method7031(class443.method2008(arg0) + 1);
        var2.field3031.method7076(arg1);
        var2.field3031.method7037(arg0);
        client.field541.method2378(var2);
    }

    @ObfuscatedName("bl.x(Lqa;I)Z")
    public final boolean method1558(class464 arg0) {
        class368 var2 = (class368) this.field801.method6099(arg0);
        return var2 != null && var2.method6187();
    }
}

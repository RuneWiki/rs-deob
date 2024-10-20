package deob;

import java.util.Iterator;

@ObfuscatedName("cs")
public class class70 {

    @ObfuscatedName("cs.at")
    public final class513 field835;

    @ObfuscatedName("cs.an")
    public final class448 field834;

    @ObfuscatedName("cs.ao")
    public final class446 field840;

    @ObfuscatedName("cs.ab")
    public int field838 = 0;

    public class70(class513 arg0) {
        this.field835 = arg0;
        this.field834 = new class448(arg0);
        this.field840 = new class446(arg0);
    }

    @ObfuscatedName("cs.az(I)Z")
    public boolean method1812() {
        return this.field838 == 2;
    }

    @ObfuscatedName("cs.ah(B)V")
    public final void method1757() {
        this.field838 = 1;
    }

    @ObfuscatedName("cs.af(Lur;II)V")
    public final void method1786(class535 arg0, int arg1) {
        this.field834.method7372(arg0, arg1);
        this.field838 = 2;
        for (int var3 = 0; var3 < class109.field1398; var3++) {
            class93 var4 = client.field636[class109.field1387[var3]];
            var4.method2228();
        }
        Iterator var5 = class112.field1429.iterator();
        while (var5.hasNext()) {
            class65 var6 = (class65) var5.next();
            var6.method1085();
        }
        if (Statics.field1674 != null) {
            Statics.field1674.method7389();
        }
    }

    @ObfuscatedName("cs.at(B)V")
    public final void method1759() {
        for (class451 var1 = (class451) this.field834.field4774.method6723(); var1 != null; var1 = (class451) this.field834.field4774.method6724()) {
            if ((long) var1.field4788 < class318.method3596() / 1000L - 5L) {
                if (var1.field4787 > 0) {
                    class112.method2177(5, "", var1.field4786 + class370.field4170);
                }
                if (var1.field4787 == 0) {
                    class112.method2177(5, "", var1.field4786 + class370.field4171);
                }
                var1.method7849();
            }
        }
    }

    @ObfuscatedName("cs.an(I)V")
    public final void method1760() {
        this.field838 = 0;
        this.field834.method7454();
        this.field840.method7454();
    }

    @ObfuscatedName("cs.ao(Lvx;ZI)Z")
    public final boolean method1817(class558 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1608.field1142)) {
            return true;
        } else {
            return this.field834.method7370(arg0, arg1);
        }
    }

    @ObfuscatedName("cs.ab(Lvx;S)Z")
    public final boolean method1781(class558 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field840.method7475(arg0);
        }
    }

    @ObfuscatedName("cs.aw(Ljava/lang/String;I)V")
    public final void method1763(String arg0) {
        if (arg0 == null) {
            return;
        }
        class558 var2 = new class558(arg0, this.field835);
        if (!var2.method9076()) {
            return;
        }
        if (this.method1764()) {
            method5232();
        } else if (Statics.field1608.field1142.equals(var2)) {
            method3942();
        } else if (this.method1817(var2, false)) {
            method39(arg0 + class370.field4118);
        } else if (this.method1781(var2)) {
            method1699(arg0);
        } else {
            class313 var3 = class313.method7156(class311.field3208, client.field574.field1438);
            var3.field3318.method8445(class535.method3943(arg0));
            var3.field3318.method8452(arg0);
            client.field574.method2654(var3);
        }
    }

    @ObfuscatedName("ab.ad(Ljava/lang/String;B)V")
    public static final void method39(String arg0) {
        class112.method2177(30, "", arg0);
    }

    @ObfuscatedName("lh.al(I)V")
    public static final void method5232() {
        method39(class370.field4189);
    }

    @ObfuscatedName("client.as(Ljava/lang/String;I)V")
    public static final void method1699(String arg0) {
        method39(class370.field4195 + arg0 + class370.field4196);
    }

    @ObfuscatedName("ig.ag(I)V")
    public static final void method3942() {
        method39(class370.field4149);
    }

    @ObfuscatedName("cs.ai(I)Z")
    public final boolean method1764() {
        return this.field834.method7453() || this.field834.method7461() >= 200 && client.field784 != 1;
    }

    @ObfuscatedName("cs.ax(Ljava/lang/String;I)V")
    public final void method1765(String arg0) {
        if (arg0 == null) {
            return;
        }
        class558 var2 = new class558(arg0, this.field835);
        if (!var2.method9076()) {
            return;
        }
        if (this.method1766()) {
            method39(class370.field4191);
        } else if (Statics.field1608.field1142.equals(var2)) {
            method2082();
        } else if (this.method1781(var2)) {
            method39(arg0 + class370.field4005);
        } else if (this.method1817(var2, false)) {
            method39(class370.field4175 + arg0 + class370.field4198);
        } else {
            class313 var3 = class313.method7156(class311.field3211, client.field574.field1438);
            var3.field3318.method8445(class535.method3943(arg0));
            var3.field3318.method8452(arg0);
            client.field574.method2654(var3);
        }
    }

    @ObfuscatedName("ca.ar(I)V")
    public static final void method2082() {
        method39(class370.field4152);
    }

    @ObfuscatedName("cs.aj(B)Z")
    public final boolean method1766() {
        return this.field840.method7453() || this.field840.method7461() >= 100 && client.field784 != 1;
    }

    @ObfuscatedName("cs.au(Ljava/lang/String;I)V")
    public final void method1767(String arg0) {
        if (arg0 == null) {
            return;
        }
        class558 var2 = new class558(arg0, this.field835);
        if (!var2.method9076()) {
            return;
        }
        if (this.field834.method7460(var2)) {
            client.field717 = client.field707;
            class313 var3 = class313.method7156(class311.field3276, client.field574.field1438);
            var3.field3318.method8445(class535.method3943(arg0));
            var3.field3318.method8452(arg0);
            client.field574.method2654(var3);
        }
        for (int var4 = 0; var4 < class109.field1398; var4++) {
            class93 var5 = client.field636[class109.field1387[var4]];
            var5.method2228();
        }
        Iterator var6 = class112.field1429.iterator();
        while (var6.hasNext()) {
            class65 var7 = (class65) var6.next();
            var7.method1085();
        }
        if (Statics.field1674 != null) {
            Statics.field1674.method7389();
        }
    }

    @ObfuscatedName("cs.ay(Ljava/lang/String;ZB)V")
    public final void method1768(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class558 var3 = new class558(arg0, this.field835);
        if (!var3.method9076()) {
            return;
        }
        if (this.field840.method7460(var3)) {
            client.field717 = client.field707;
            if (arg1) {
                class313 var4 = class313.method7156(class311.field3232, client.field574.field1438);
                var4.field3318.method8445(class535.method3943(arg0));
                var4.field3318.method8452(arg0);
                client.field574.method2654(var4);
            }
        }
        client.method5352();
    }

    @ObfuscatedName("on.ap(Ljava/lang/String;IB)V")
    public static final void method6254(String arg0, int arg1) {
        class313 var2 = class313.method7156(class311.field3228, client.field574.field1438);
        var2.field3318.method8445(class535.method3943(arg0) + 1);
        var2.field3318.method8452(arg0);
        var2.field3318.method8492(arg1);
        client.field574.method2654(var2);
    }

    @ObfuscatedName("cs.av(Lvx;I)Z")
    public final boolean method1769(class558 arg0) {
        class450 var2 = (class450) this.field834.method7522(arg0);
        return var2 != null && var2.method7544();
    }
}

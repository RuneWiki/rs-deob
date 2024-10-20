package deob;

@ObfuscatedName("ct")
public class class70 {

    @ObfuscatedName("ct.ai")
    public final class512 field859;

    @ObfuscatedName("ct.ar")
    public final class447 field862;

    @ObfuscatedName("ct.as")
    public final class445 field857;

    @ObfuscatedName("ct.aa")
    public int field858 = 0;

    public class70(class512 arg0) {
        this.field859 = arg0;
        this.field862 = new class447(arg0);
        this.field857 = new class445(arg0);
    }

    @ObfuscatedName("ct.aq(I)Z")
    public boolean method1848() {
        return this.field858 == 2;
    }

    @ObfuscatedName("ct.aw(I)V")
    public final void method1780() {
        this.field858 = 1;
    }

    @ObfuscatedName("ct.al(Luq;II)V")
    public final void method1776(class534 arg0, int arg1) {
        this.field862.method7498(arg0, arg1);
        this.field858 = 2;
        for (int var3 = 0; var3 < class109.field1381; var3++) {
            class93 var4 = client.field652[class109.field1376[var3]];
            var4.method2277();
        }
        class112.method2340();
        if (Statics.field1010 != null) {
            Statics.field1010.method7511();
        }
    }

    @ObfuscatedName("ct.ai(I)V")
    public final void method1777() {
        for (class450 var1 = (class450) this.field862.field4736.method6812(); var1 != null; var1 = (class450) this.field862.field4736.method6815()) {
            if ((long) var1.field4752 < class318.method2218() / 1000L - 5L) {
                if (var1.field4754 > 0) {
                    class112.method3792(5, "", var1.field4751 + class370.field4031);
                }
                if (var1.field4754 == 0) {
                    class112.method3792(5, "", var1.field4751 + class370.field4216);
                }
                var1.method7985();
            }
        }
    }

    @ObfuscatedName("ct.ar(B)V")
    public final void method1778() {
        this.field858 = 0;
        this.field862.method7587();
        this.field857.method7587();
    }

    @ObfuscatedName("ct.as(Lvn;ZB)Z")
    public final boolean method1779(class557 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1858.field1162)) {
            return true;
        } else {
            return this.field862.method7505(arg0, arg1);
        }
    }

    @ObfuscatedName("ct.aa(Lvn;I)Z")
    public final boolean method1814(class557 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field857.method7590(arg0);
        }
    }

    @ObfuscatedName("ct.az(Ljava/lang/String;I)V")
    public final void method1781(String arg0) {
        if (arg0 == null) {
            return;
        }
        class557 var2 = new class557(arg0, this.field859);
        if (!var2.method9181()) {
            return;
        }
        if (this.method1838()) {
            method1067();
        } else if (Statics.field1858.field1162.equals(var2)) {
            method2217(class370.field4193);
        } else if (this.method1779(var2, false)) {
            method411(arg0);
        } else if (this.method1814(var2)) {
            method6646(arg0);
        } else {
            method7495(arg0);
        }
    }

    @ObfuscatedName("dk.ao(Ljava/lang/String;B)V")
    public static final void method2217(String arg0) {
        class112.method3792(30, "", arg0);
    }

    @ObfuscatedName("ci.au(B)V")
    public static final void method1067() {
        method2217(class370.field4300);
    }

    @ObfuscatedName("bq.ak(Ljava/lang/String;I)V")
    public static final void method411(String arg0) {
        method2217(arg0 + class370.field4190);
    }

    @ObfuscatedName("oq.ah(Ljava/lang/String;B)V")
    public static final void method6646(String arg0) {
        method2217(class370.field4195 + arg0 + class370.field4287);
    }

    @ObfuscatedName("rn.aj(Ljava/lang/String;B)V")
    public static final void method7495(String arg0) {
        class313 var1 = class313.method5301(class311.field3192, client.field590.field1435);
        var1.field3291.method8574(class534.method3043(arg0));
        var1.field3291.method8581(arg0);
        client.field590.method2741(var1);
    }

    @ObfuscatedName("ct.af(I)Z")
    public final boolean method1838() {
        return this.field862.method7589() || this.field862.method7588() >= 200 && client.field654 != 1;
    }

    @ObfuscatedName("ct.ax(Ljava/lang/String;B)V")
    public final void method1783(String arg0) {
        if (arg0 == null) {
            return;
        }
        class557 var2 = new class557(arg0, this.field859);
        if (!var2.method9181()) {
            return;
        }
        if (this.method1784()) {
            method2217(class370.field4191);
        } else if (Statics.field1858.field1162.equals(var2)) {
            method2587();
        } else if (this.method1814(var2)) {
            method6338(arg0);
        } else if (this.method1779(var2, false)) {
            method994(arg0);
        } else {
            method3584(arg0);
        }
    }

    @ObfuscatedName("on.an(Ljava/lang/String;B)V")
    public static final void method6338(String arg0) {
        method2217(arg0 + class370.field4192);
    }

    @ObfuscatedName("ch.ag(Ljava/lang/String;I)V")
    public static final void method994(String arg0) {
        method2217(class370.field4197 + arg0 + class370.field4198);
    }

    @ObfuscatedName("dx.am(B)V")
    public static final void method2587() {
        method2217(class370.field4194);
    }

    @ObfuscatedName("hi.ad(Ljava/lang/String;I)V")
    public static final void method3584(String arg0) {
        class313 var1 = class313.method5301(class311.field3245, client.field590.field1435);
        var1.field3291.method8574(class534.method3043(arg0));
        var1.field3291.method8581(arg0);
        client.field590.method2741(var1);
    }

    @ObfuscatedName("ct.at(I)Z")
    public final boolean method1784() {
        return this.field857.method7589() || this.field857.method7588() >= 100 && client.field654 != 1;
    }

    @ObfuscatedName("ct.ay(Ljava/lang/String;I)V")
    public final void method1785(String arg0) {
        if (arg0 == null) {
            return;
        }
        class557 var2 = new class557(arg0, this.field859);
        if (!var2.method9181()) {
            return;
        }
        if (this.field862.method7594(var2)) {
            client.field733 = client.field726;
            class313 var3 = class313.method5301(class311.field3264, client.field590.field1435);
            var3.field3291.method8574(class534.method3043(arg0));
            var3.field3291.method8581(arg0);
            client.field590.method2741(var3);
        }
        for (int var4 = 0; var4 < class109.field1381; var4++) {
            class93 var5 = client.field652[class109.field1376[var4]];
            var5.method2277();
        }
        class112.method2340();
        if (Statics.field1010 != null) {
            Statics.field1010.method7511();
        }
    }

    @ObfuscatedName("ct.ae(Ljava/lang/String;ZI)V")
    public final void method1786(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class557 var3 = new class557(arg0, this.field859);
        if (!var3.method9181()) {
            return;
        }
        if (this.field857.method7594(var3)) {
            client.field733 = client.field726;
            if (arg1) {
                class313 var4 = class313.method5301(class311.field3262, client.field590.field1435);
                var4.field3291.method8574(class534.method3043(arg0));
                var4.field3291.method8581(arg0);
                client.field590.method2741(var4);
            }
        }
        client.method4017();
    }

    @ObfuscatedName("ak.ac(Ljava/lang/String;II)V")
    public static final void method83(String arg0, int arg1) {
        class313 var2 = class313.method5301(class311.field3241, client.field590.field1435);
        var2.field3291.method8574(class534.method3043(arg0) + 1);
        var2.field3291.method8581(arg0);
        var2.field3291.method8623(arg1);
        client.field590.method2741(var2);
    }

    @ObfuscatedName("ct.ab(Lvn;I)Z")
    public final boolean method1839(class557 arg0) {
        class449 var2 = (class449) this.field862.method7592(arg0);
        return var2 != null && var2.method7657();
    }
}

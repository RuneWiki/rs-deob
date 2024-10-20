package deob;

@ObfuscatedName("ci")
public class class70 {

    @ObfuscatedName("ci.ax")
    public final class508 field847;

    @ObfuscatedName("ci.ao")
    public final class443 field851;

    @ObfuscatedName("ci.ah")
    public final class441 field849;

    @ObfuscatedName("ci.ar")
    public int field850 = 0;

    public class70(class508 arg0) {
        this.field847 = arg0;
        this.field851 = new class443(arg0);
        this.field849 = new class441(arg0);
    }

    @ObfuscatedName("ci.ac(I)Z")
    public boolean method1801() {
        return this.field850 == 2;
    }

    @ObfuscatedName("ci.al(B)V")
    public final void method1794() {
        this.field850 = 1;
    }

    @ObfuscatedName("ci.ak(Lul;IB)V")
    public final void method1824(class530 arg0, int arg1) {
        this.field851.method7268(arg0, arg1);
        this.field850 = 2;
        client.method3527();
    }

    @ObfuscatedName("ci.ax(I)V")
    public final void method1797() {
        for (class446 var1 = (class446) this.field851.field4678.method6639(); var1 != null; var1 = (class446) this.field851.field4678.method6640()) {
            if ((long) var1.field4692 < class316.method6401() / 1000L - 5L) {
                if (var1.field4693 > 0) {
                    class113.method6942(5, "", var1.field4691 + class367.field4109);
                }
                if (var1.field4693 == 0) {
                    class113.method6942(5, "", var1.field4691 + class367.field4110);
                }
                var1.method7766();
            }
        }
    }

    @ObfuscatedName("ci.ao(I)V")
    public final void method1823() {
        this.field850 = 0;
        this.field851.method7408();
        this.field849.method7408();
    }

    @ObfuscatedName("ci.ah(Lvf;ZB)Z")
    public final boolean method1799(class553 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2696.field1136)) {
            return true;
        } else {
            return this.field851.method7267(arg0, arg1);
        }
    }

    @ObfuscatedName("ci.ar(Lvf;I)Z")
    public final boolean method1800(class553 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field849.method7359(arg0);
        }
    }

    @ObfuscatedName("ci.ab(Ljava/lang/String;I)V")
    public final void method1834(String arg0) {
        if (arg0 == null) {
            return;
        }
        class553 var2 = new class553(arg0, this.field847);
        if (!var2.method8994()) {
            return;
        }
        if (this.method1802()) {
            method7214(class367.field4011);
        } else if (Statics.field2696.field1136.equals(var2)) {
            method7214(class367.field4132);
        } else if (this.method1799(var2, false)) {
            Statics.method2305(arg0);
        } else if (this.method1800(var2)) {
            method7214(class367.field4134 + arg0 + class367.field4135);
        } else {
            class311 var3 = class311.method2978(class309.field3215, client.field579.field1425);
            var3.field3250.method8348(class530.method7740(arg0));
            var3.field3250.method8374(arg0);
            client.field579.method2682(var3);
        }
    }

    @ObfuscatedName("qs.am(Ljava/lang/String;B)V")
    public static final void method7214(String arg0) {
        class113.method6942(30, "", arg0);
    }

    @ObfuscatedName("ci.ag(B)Z")
    public final boolean method1802() {
        return this.field851.method7422() || this.field851.method7406() >= 200 && client.field647 != 1;
    }

    @ObfuscatedName("ci.aa(Ljava/lang/String;B)V")
    public final void method1798(String arg0) {
        if (arg0 == null) {
            return;
        }
        class553 var2 = new class553(arg0, this.field847);
        if (!var2.method8994()) {
            return;
        }
        if (this.method1803()) {
            method5170();
        } else if (Statics.field2696.field1136.equals(var2)) {
            method3981();
        } else if (this.method1800(var2)) {
            method7214(arg0 + class367.field4131);
        } else if (this.method1799(var2, false)) {
            method7214(class367.field4091 + arg0 + class367.field4181);
        } else {
            method2974(arg0);
        }
    }

    @ObfuscatedName("ku.ap(B)V")
    public static final void method5170() {
        method7214(class367.field4130);
    }

    @ObfuscatedName("iq.ay(I)V")
    public static final void method3981() {
        method7214(class367.field4133);
    }

    @ObfuscatedName("fg.as(Ljava/lang/String;I)V")
    public static final void method2974(String arg0) {
        class311 var1 = class311.method2978(class309.field3231, client.field579.field1425);
        var1.field3250.method8348(class530.method7740(arg0));
        var1.field3250.method8374(arg0);
        client.field579.method2682(var1);
    }

    @ObfuscatedName("ci.aj(I)Z")
    public final boolean method1803() {
        return this.field849.method7422() || this.field849.method7406() >= 100 && client.field647 != 1;
    }

    @ObfuscatedName("ci.an(Ljava/lang/String;B)V")
    public final void method1805(String arg0) {
        if (arg0 == null) {
            return;
        }
        class553 var2 = new class553(arg0, this.field847);
        if (!var2.method8994()) {
            return;
        }
        if (this.field851.method7363(var2)) {
            client.field724 = client.field665;
            class311 var3 = class311.method2978(class309.field3147, client.field579.field1425);
            var3.field3250.method8348(class530.method7740(arg0));
            var3.field3250.method8374(arg0);
            client.field579.method2682(var3);
        }
        client.method3527();
    }

    @ObfuscatedName("ci.au(Ljava/lang/String;ZI)V")
    public final void method1806(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class553 var3 = new class553(arg0, this.field847);
        if (!var3.method8994()) {
            return;
        }
        if (this.field849.method7363(var3)) {
            client.field724 = client.field665;
            if (arg1) {
                class311 var4 = class311.method2978(class309.field3202, client.field579.field1425);
                var4.field3250.method8348(class530.method7740(arg0));
                var4.field3250.method8374(arg0);
                client.field579.method2682(var4);
            }
        }
        client.method7817();
    }

    @ObfuscatedName("ci.ae(Lvf;B)Z")
    public final boolean method1807(class553 arg0) {
        class445 var2 = (class445) this.field851.method7360(arg0);
        return var2 != null && var2.method7427();
    }
}

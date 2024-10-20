package deob;

@ObfuscatedName("cl")
public class class71 {

    @ObfuscatedName("cl.am")
    public final class528 field850;

    @ObfuscatedName("cl.ax")
    public final class469 field845;

    @ObfuscatedName("cl.aq")
    public final class467 field846;

    @ObfuscatedName("cl.af")
    public int field844 = 0;

    public class71(class528 arg0) {
        this.field850 = arg0;
        this.field845 = new class469(arg0);
        this.field846 = new class467(arg0);
    }

    @ObfuscatedName("cl.ac(I)Z")
    public boolean method1883() {
        return this.field844 == 2;
    }

    @ObfuscatedName("cl.ae(I)V")
    public final void method1937() {
        this.field844 = 1;
    }

    @ObfuscatedName("cl.ag(Lvf;II)V")
    public final void method1885(class551 arg0, int arg1) {
        this.field845.method8001(arg0, arg1);
        this.field844 = 2;
        client.method5055();
    }

    @ObfuscatedName("cl.am(I)V")
    public final void method1915() {
        for (class472 var1 = (class472) this.field845.field4963.method7141(); var1 != null; var1 = (class472) this.field845.field4963.method7142()) {
            if ((long) var1.field4979 < class331.method3482() / 1000L - 5L) {
                if (var1.field4978 > 0) {
                    class116.method3755(5, "", var1.field4977 + class382.field4300);
                }
                if (var1.field4978 == 0) {
                    class116.method3755(5, "", var1.field4977 + class382.field4301);
                }
                var1.method8355();
            }
        }
    }

    @ObfuscatedName("cl.ax(I)V")
    public final void method1907() {
        this.field844 = 0;
        this.field845.method8086();
        this.field846.method8086();
    }

    @ObfuscatedName("cl.aq(Lwf;ZI)Z")
    public final boolean method1888(class574 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field4826.field1168)) {
            return true;
        } else {
            return this.field845.method8000(arg0, arg1);
        }
    }

    @ObfuscatedName("cl.af(Lwf;B)Z")
    public final boolean method1889(class574 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field846.method8154(arg0);
        }
    }

    @ObfuscatedName("cl.at(Ljava/lang/String;I)V")
    public final void method1890(String arg0) {
        if (arg0 == null) {
            return;
        }
        class574 var2 = new class574(arg0, this.field850);
        if (!var2.method9639()) {
            return;
        }
        if (this.method1891()) {
            method8352();
        } else if (Statics.field4826.field1168.equals(var2)) {
            method7245(class382.field4323);
        } else if (this.method1888(var2, false)) {
            method2552(arg0);
        } else if (this.method1889(var2)) {
            method7245(class382.field4325 + arg0 + class382.field4326);
        } else {
            class326 var3 = class326.method3199(class324.field3400, client.field582.field1486);
            var3.field3426.method9022(class551.method8819(arg0));
            var3.field3426.method8964(arg0);
            client.field582.method2943(var3);
        }
    }

    @ObfuscatedName("qa.au(Ljava/lang/String;B)V")
    public static final void method7245(String arg0) {
        class116.method3755(30, "", arg0);
    }

    @ObfuscatedName("tm.ar(B)V")
    public static final void method8352() {
        method7245(class382.field4335);
    }

    @ObfuscatedName("dy.al(Ljava/lang/String;I)V")
    public static final void method2552(String arg0) {
        method7245(arg0 + class382.field4320);
    }

    @ObfuscatedName("cl.ad(B)Z")
    public final boolean method1891() {
        return this.field845.method8088() || this.field845.method8109() >= 200 && client.field566 != 1;
    }

    @ObfuscatedName("cl.ah(Ljava/lang/String;I)V")
    public final void method1900(String arg0) {
        if (arg0 == null) {
            return;
        }
        class574 var2 = new class574(arg0, this.field850);
        if (!var2.method9639()) {
            return;
        }
        if (this.method1893()) {
            method4105();
        } else if (Statics.field4826.field1168.equals(var2)) {
            method7245(class382.field4324);
        } else if (this.method1889(var2)) {
            method7245(arg0 + class382.field4322);
        } else if (this.method1888(var2, false)) {
            method7245(class382.field4197 + arg0 + class382.field4382);
        } else {
            method6775(arg0);
        }
    }

    @ObfuscatedName("il.ap(B)V")
    public static final void method4105() {
        method7245(class382.field4416);
    }

    @ObfuscatedName("of.ab(Ljava/lang/String;B)V")
    public static final void method6775(String arg0) {
        class326 var1 = class326.method3199(class324.field3382, client.field582.field1486);
        var1.field3426.method9022(class551.method8819(arg0));
        var1.field3426.method8964(arg0);
        client.field582.method2943(var1);
    }

    @ObfuscatedName("cl.az(I)Z")
    public final boolean method1893() {
        return this.field846.method8088() || this.field846.method8109() >= 100 && client.field566 != 1;
    }

    @ObfuscatedName("cl.aa(Ljava/lang/String;S)V")
    public final void method1909(String arg0) {
        if (arg0 == null) {
            return;
        }
        class574 var2 = new class574(arg0, this.field850);
        if (!var2.method9639()) {
            return;
        }
        if (this.field845.method8093(var2)) {
            client.field715 = client.field710;
            class326 var3 = class326.method3199(class324.field3354, client.field582.field1486);
            var3.field3426.method9022(class551.method8819(arg0));
            var3.field3426.method8964(arg0);
            client.field582.method2943(var3);
        }
        client.method5055();
    }

    @ObfuscatedName("cl.ai(Ljava/lang/String;ZI)V")
    public final void method1895(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class574 var3 = new class574(arg0, this.field850);
        if (!var3.method9639()) {
            return;
        }
        if (this.field846.method8093(var3)) {
            client.field715 = client.field710;
            if (arg1) {
                class326 var4 = class326.method3199(class324.field3314, client.field582.field1486);
                var4.field3426.method9022(class551.method8819(arg0));
                var4.field3426.method8964(arg0);
                client.field582.method2943(var4);
            }
        }
        client.method7197();
    }

    @ObfuscatedName("ey.ao(Ljava/lang/String;II)V")
    public static final void method3020(String arg0, int arg1) {
        class326 var2 = class326.method3199(class324.field3372, client.field582.field1486);
        var2.field3426.method9022(class551.method8819(arg0) + 1);
        var2.field3426.method8964(arg0);
        var2.field3426.method9069(arg1);
        client.field582.method2943(var2);
    }

    @ObfuscatedName("cl.as(Lwf;B)Z")
    public final boolean method1910(class574 arg0) {
        class471 var2 = (class471) this.field845.method8090(arg0);
        return var2 != null && var2.method8160();
    }
}

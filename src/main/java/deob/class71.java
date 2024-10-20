package deob;

@ObfuscatedName("cc")
public class class71 {

    @ObfuscatedName("cc.aj")
    public final class535 field829;

    @ObfuscatedName("cc.ai")
    public final class470 field826;

    @ObfuscatedName("cc.ay")
    public final class468 field832;

    @ObfuscatedName("cc.as")
    public int field831 = 0;

    public class71(class535 arg0) {
        this.field829 = arg0;
        this.field826 = new class470(arg0);
        this.field832 = new class468(arg0);
    }

    @ObfuscatedName("cc.ap(I)Z")
    public boolean method1923() {
        return this.field831 == 2;
    }

    @ObfuscatedName("cc.aw(I)V")
    public final void method1924() {
        this.field831 = 1;
    }

    @ObfuscatedName("cc.ak(Lvl;II)V")
    public final void method1925(class558 arg0, int arg1) {
        this.field826.method8271(arg0, arg1);
        this.field831 = 2;
        client.method2494();
    }

    @ObfuscatedName("cc.aj(S)V")
    public final void method1926() {
        for (class473 var1 = (class473) this.field826.field4987.method7380(); var1 != null; var1 = (class473) this.field826.field4987.method7381()) {
            if ((long) var1.field5001 < class330.method2257() / 1000L - 5L) {
                if (var1.field5004 > 0) {
                    Statics.method7725(5, "", var1.field5002 + class383.field4243);
                }
                if (var1.field5004 == 0) {
                    Statics.method7725(5, "", var1.field5002 + class383.field4289);
                }
                var1.method8661();
            }
        }
    }

    @ObfuscatedName("cc.ai(I)V")
    public final void method1969() {
        this.field831 = 0;
        this.field826.method8379();
        this.field832.method8379();
    }

    @ObfuscatedName("cc.ay(Lwx;ZI)Z")
    public final boolean method1951(class581 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field3772.field1141)) {
            return true;
        } else {
            return this.field826.method8272(arg0, arg1);
        }
    }

    @ObfuscatedName("cc.as(Lwx;I)Z")
    public final boolean method1929(class581 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field832.method8358(arg0);
        }
    }

    @ObfuscatedName("cc.ae(Ljava/lang/String;I)V")
    public final void method1930(String arg0) {
        if (arg0 == null) {
            return;
        }
        class581 var2 = new class581(arg0, this.field829);
        if (!var2.method9994()) {
            return;
        }
        if (this.method1985()) {
            method1106();
        } else if (Statics.field3772.field1141.equals(var2)) {
            class383 var10000 = (class383) null;
            String var3 = class383.field4367;
            Statics.method7725(30, "", var3);
        } else if (this.method1951(var2, false)) {
            method3038(arg0);
        } else if (this.method1929(var2)) {
            method4490(arg0);
        } else {
            method324(arg0);
        }
    }

    @ObfuscatedName("co.am(I)V")
    public static final void method1106() {
        class383 var10000 = (class383) null;
        String var0 = class383.field4468;
        Statics.method7725(30, "", var0);
    }

    @ObfuscatedName("el.at(Ljava/lang/String;B)V")
    public static final void method3038(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class383 var10001 = (class383) null;
        String var1 = var10000.append(class383.field4364).toString();
        Statics.method7725(30, "", var1);
    }

    @ObfuscatedName("jw.au(Ljava/lang/String;B)V")
    public static final void method4490(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class383 var10001 = (class383) null;
        StringBuilder var2 = var10000.append(class383.field4369).append(arg0);
        class383 var3 = (class383) null;
        String var1 = var2.append(class383.field4337).toString();
        Statics.method7725(30, "", var1);
    }

    @ObfuscatedName("al.an(Ljava/lang/String;I)V")
    public static final void method324(String arg0) {
        class325 var1 = class325.method2983(class323.field3328, client.field784.field1485);
        var1.field3433.method9241(class558.method1876(arg0));
        var1.field3433.method9248(arg0);
        client.field784.method3070(var1);
    }

    @ObfuscatedName("cc.ao(B)Z")
    public final boolean method1985() {
        return this.field826.method8357() || this.field826.method8356() >= 200 && client.field631 != 1;
    }

    @ObfuscatedName("cc.af(Ljava/lang/String;I)V")
    public final void method1963(String arg0) {
        if (arg0 == null) {
            return;
        }
        class581 var2 = new class581(arg0, this.field829);
        if (!var2.method9994()) {
            return;
        }
        if (this.method1933()) {
            method5150();
        } else if (Statics.field3772.field1141.equals(var2)) {
            method2668();
        } else if (this.method1929(var2)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class383 var10001 = (class383) null;
            String var3 = var10000.append(class383.field4366).toString();
            Statics.method7725(30, "", var3);
        } else if (this.method1951(var2, false)) {
            method6928(arg0);
        } else {
            class325 var4 = class325.method2983(class323.field3350, client.field784.field1485);
            var4.field3433.method9241(class558.method1876(arg0));
            var4.field3433.method9248(arg0);
            client.field784.method3070(var4);
        }
    }

    @ObfuscatedName("jp.ar(B)V")
    public static final void method5150() {
        class383 var10000 = (class383) null;
        String var0 = class383.field4365;
        Statics.method7725(30, "", var0);
    }

    @ObfuscatedName("ob.ab(Ljava/lang/String;I)V")
    public static final void method6928(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class383 var10001 = (class383) null;
        StringBuilder var2 = var10000.append(class383.field4371).append(arg0);
        class383 var3 = (class383) null;
        String var1 = var2.append(class383.field4372).toString();
        Statics.method7725(30, "", var1);
    }

    @ObfuscatedName("de.az(I)V")
    public static final void method2668() {
        class383 var10000 = (class383) null;
        String var0 = class383.field4446;
        Statics.method7725(30, "", var0);
    }

    @ObfuscatedName("cc.ag(B)Z")
    public final boolean method1933() {
        return this.field832.method8357() || this.field832.method8356() >= 100 && client.field631 != 1;
    }

    @ObfuscatedName("cc.ad(Ljava/lang/String;I)V")
    public final void method1956(String arg0) {
        if (arg0 == null) {
            return;
        }
        class581 var2 = new class581(arg0, this.field829);
        if (!var2.method9994()) {
            return;
        }
        if (this.field826.method8362(var2)) {
            client.field587 = client.field555;
            class325 var3 = class325.method2983(class323.field3357, client.field784.field1485);
            var3.field3433.method9241(class558.method1876(arg0));
            var3.field3433.method9248(arg0);
            client.field784.method3070(var3);
        }
        client.method2494();
    }

    @ObfuscatedName("cc.ac(Ljava/lang/String;ZB)V")
    public final void method1939(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class581 var3 = new class581(arg0, this.field829);
        if (!var3.method9994()) {
            return;
        }
        if (this.field832.method8362(var3)) {
            client.method3412();
            if (arg1) {
                class325 var4 = class325.method2983(class323.field3317, client.field784.field1485);
                var4.field3433.method9241(class558.method1876(arg0));
                var4.field3433.method9248(arg0);
                client.field784.method3070(var4);
            }
        }
        client.method6902();
    }

    @ObfuscatedName("fb.av(Ljava/lang/String;II)V")
    public static final void method3357(String arg0, int arg1) {
        class325 var2 = class325.method2983(class323.field3389, client.field784.field1485);
        var2.field3433.method9241(class558.method1876(arg0) + 1);
        var2.field3433.method9470(arg1);
        var2.field3433.method9248(arg0);
        client.field784.method3070(var2);
    }

    @ObfuscatedName("cc.ax(Lwx;I)Z")
    public final boolean method1936(class581 arg0) {
        class472 var2 = (class472) this.field826.method8359(arg0);
        return var2 != null && var2.method8433();
    }
}

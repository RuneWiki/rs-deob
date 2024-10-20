package deob;

@ObfuscatedName("cr")
public class class69 {

    @ObfuscatedName("cr.aj")
    public final class509 field828;

    @ObfuscatedName("cr.aq")
    public final class444 field827;

    @ObfuscatedName("cr.ar")
    public final class442 field830;

    @ObfuscatedName("cr.ag")
    public int field829 = 0;

    public class69(class509 arg0) {
        this.field828 = arg0;
        this.field827 = new class444(arg0);
        this.field830 = new class442(arg0);
    }

    @ObfuscatedName("cr.am(B)Z")
    public boolean method1820() {
        return this.field829 == 2;
    }

    @ObfuscatedName("cr.ap(I)V")
    public final void method1821() {
        this.field829 = 1;
    }

    @ObfuscatedName("cr.af(Luk;II)V")
    public final void method1849(class531 arg0, int arg1) {
        this.field827.method7477(arg0, arg1);
        this.field829 = 2;
        client.method5083();
    }

    @ObfuscatedName("cr.aj(I)V")
    public final void method1823() {
        for (class447 var1 = (class447) this.field827.field4706.method6787(); var1 != null; var1 = (class447) this.field827.field4706.method6785()) {
            if ((long) var1.field4724 < Statics.method2852() / 1000L - 5L) {
                if (var1.field4723 > 0) {
                    class111.method6511(5, "", var1.field4722 + class367.field4083);
                }
                if (var1.field4723 == 0) {
                    class111.method6511(5, "", var1.field4722 + class367.field4138);
                }
                var1.method7984();
            }
        }
    }

    @ObfuscatedName("cr.aq(I)V")
    public final void method1824() {
        this.field829 = 0;
        this.field827.method7604();
        this.field830.method7604();
    }

    @ObfuscatedName("cr.ar(Lvs;ZI)Z")
    public final boolean method1826(class554 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field133.field1117)) {
            return true;
        } else {
            return this.field827.method7480(arg0, arg1);
        }
    }

    @ObfuscatedName("cr.ag(Lvs;I)Z")
    public final boolean method1866(class554 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field830.method7574(arg0);
        }
    }

    @ObfuscatedName("cr.ao(Ljava/lang/String;I)V")
    public final void method1867(String arg0) {
        if (arg0 == null) {
            return;
        }
        class554 var2 = new class554(arg0, this.field828);
        if (!var2.method9168()) {
            return;
        }
        if (this.method1828()) {
            method329(class367.field4156);
        } else if (Statics.field133.field1117.equals(var2)) {
            method361();
        } else if (this.method1826(var2, false)) {
            method329(arg0 + class367.field4236);
        } else if (this.method1866(var2)) {
            method328(arg0);
        } else {
            class311 var3 = class311.method7979(class309.field3211, client.field561.field1404);
            var3.field3279.method8699(class531.method4114(arg0));
            var3.field3279.method8551(arg0);
            client.field561.method2736(var3);
        }
    }

    @ObfuscatedName("ac.ae(Ljava/lang/String;I)V")
    public static final void method329(String arg0) {
        class111.method6511(30, "", arg0);
    }

    @ObfuscatedName("ac.aa(Ljava/lang/String;B)V")
    public static final void method328(String arg0) {
        method329(class367.field4162 + arg0 + class367.field4243);
    }

    @ObfuscatedName("at.au(I)V")
    public static final void method361() {
        method329(class367.field4160);
    }

    @ObfuscatedName("cr.an(I)Z")
    public final boolean method1828() {
        return this.field827.method7573() || this.field827.method7622() >= 200 && client.field519 != 1;
    }

    @ObfuscatedName("cr.ad(Ljava/lang/String;B)V")
    public final void method1825(String arg0) {
        if (arg0 == null) {
            return;
        }
        class554 var2 = new class554(arg0, this.field828);
        if (!var2.method9168()) {
            return;
        }
        if (this.method1872()) {
            method329(class367.field4051);
        } else if (Statics.field133.field1117.equals(var2)) {
            method329(class367.field4161);
        } else if (this.method1866(var2)) {
            method2137(arg0);
        } else if (this.method1826(var2, false)) {
            method7893(arg0);
        } else {
            class311 var3 = class311.method7979(class309.field3202, client.field561.field1404);
            var3.field3279.method8699(class531.method4114(arg0));
            var3.field3279.method8551(arg0);
            client.field561.method2736(var3);
        }
    }

    @ObfuscatedName("cx.ax(Ljava/lang/String;I)V")
    public static final void method2137(String arg0) {
        method329(arg0 + class367.field4159);
    }

    @ObfuscatedName("rg.aw(Ljava/lang/String;I)V")
    public static final void method7893(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class367 var10001 = (class367) null;
        StringBuilder var2 = var10000.append(class367.field4061).append(arg0);
        class367 var3 = (class367) null;
        String var1 = var2.append(class367.field4113).toString();
        class111.method6511(30, "", var1);
    }

    @ObfuscatedName("cr.az(I)Z")
    public final boolean method1872() {
        return this.field830.method7573() || this.field830.method7622() >= 100 && client.field519 != 1;
    }

    @ObfuscatedName("cr.av(Ljava/lang/String;I)V")
    public final void method1831(String arg0) {
        if (arg0 == null) {
            return;
        }
        class554 var2 = new class554(arg0, this.field828);
        if (!var2.method9168()) {
            return;
        }
        if (this.field827.method7578(var2)) {
            client.method171();
            class311 var3 = class311.method7979(class309.field3242, client.field561.field1404);
            var3.field3279.method8699(class531.method4114(arg0));
            var3.field3279.method8551(arg0);
            client.field561.method2736(var3);
        }
        for (int var4 = 0; var4 < class108.field1351; var4++) {
            class92 var5 = client.field738[class108.field1357[var4]];
            var5.method2293();
        }
        class111.method2795();
        if (Statics.field1292 != null) {
            Statics.field1292.method7489();
        }
    }

    @ObfuscatedName("cr.ak(Ljava/lang/String;ZI)V")
    public final void method1888(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class554 var3 = new class554(arg0, this.field828);
        if (!var3.method9168()) {
            return;
        }
        if (this.field830.method7578(var3)) {
            client.method171();
            if (arg1) {
                class311 var4 = class311.method7979(class309.field3188, client.field561.field1404);
                var4.field3279.method8699(class531.method4114(arg0));
                var4.field3279.method8551(arg0);
                client.field561.method2736(var4);
            }
        }
        client.method5717();
    }

    @ObfuscatedName("ne.ay(Ljava/lang/String;II)V")
    public static final void method6299(String arg0, int arg1) {
        class311 var2 = class311.method7979(class309.field3181, client.field561.field1404);
        var2.field3279.method8699(class531.method4114(arg0) + 1);
        var2.field3279.method8590(arg1);
        var2.field3279.method8551(arg0);
        client.field561.method2736(var2);
    }

    @ObfuscatedName("cr.as(Lvs;I)Z")
    public final boolean method1833(class554 arg0) {
        class446 var2 = (class446) this.field827.method7575(arg0);
        return var2 != null && var2.method7647();
    }
}

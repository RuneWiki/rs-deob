package deob;

@ObfuscatedName("cd")
public class class69 {

    @ObfuscatedName("cd.am")
    public final class494 field841;

    @ObfuscatedName("cd.as")
    public final class429 field842;

    @ObfuscatedName("cd.aj")
    public final class427 field843;

    @ObfuscatedName("cd.ag")
    public int field844 = 0;

    public class69(class494 arg0) {
        this.field841 = arg0;
        this.field842 = new class429(arg0);
        this.field843 = new class427(arg0);
    }

    @ObfuscatedName("cd.aw(B)Z")
    public boolean method1813() {
        return this.field844 == 2;
    }

    @ObfuscatedName("cd.ay(B)V")
    public final void method1774() {
        this.field844 = 1;
    }

    @ObfuscatedName("cd.ar(Lty;II)V")
    public final void method1820(class514 arg0, int arg1) {
        this.field842.method7173(arg0, arg1);
        this.field844 = 2;
        for (int var3 = 0; var3 < class108.field1366; var3++) {
            class92 var4 = client.field612[class108.field1370[var3]];
            var4.method2245();
        }
        class111.method2562();
        if (Statics.field128 != null) {
            Statics.field128.method7182();
        }
    }

    @ObfuscatedName("cd.am(B)V")
    public final void method1773() {
        for (class432 var1 = (class432) this.field842.field4636.method6490(); var1 != null; var1 = (class432) this.field842.field4636.method6491()) {
            if ((long) var1.field4649 < class303.method2705() / 1000L - 5L) {
                if (var1.field4651 > 0) {
                    class111.method7045(5, "", var1.field4650 + class353.field4059);
                }
                if (var1.field4651 == 0) {
                    class111.method7045(5, "", var1.field4650 + class353.field4060);
                }
                var1.method7657();
            }
        }
    }

    @ObfuscatedName("cd.as(I)V")
    public final void method1777() {
        this.field844 = 0;
        this.field842.method7322();
        this.field843.method7322();
    }

    @ObfuscatedName("cd.aj(Lui;ZB)Z")
    public final boolean method1821(class538 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1605.field1115)) {
            return true;
        } else {
            return this.field842.method7172(arg0, arg1);
        }
    }

    @ObfuscatedName("cd.ag(Lui;I)Z")
    public final boolean method1779(class538 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field843.method7262(arg0);
        }
    }

    @ObfuscatedName("cd.az(Ljava/lang/String;B)V")
    public final void method1780(String arg0) {
        if (arg0 == null) {
            return;
        }
        class538 var2 = new class538(arg0, this.field841);
        if (!var2.method8883()) {
            return;
        }
        if (this.method1781()) {
            method4031(class353.field4078);
        } else if (Statics.field1605.field1115.equals(var2)) {
            method3917();
        } else if (this.method1821(var2, false)) {
            method4986(arg0);
        } else if (this.method1779(var2)) {
            method4031(class353.field4031 + arg0 + class353.field3948);
        } else {
            method314(arg0);
        }
    }

    @ObfuscatedName("il.av(Ljava/lang/String;B)V")
    public static final void method4031(String arg0) {
        class111.method7045(30, "", arg0);
    }

    @ObfuscatedName("ke.ap(Ljava/lang/String;I)V")
    public static final void method4986(String arg0) {
        method4031(arg0 + class353.field4079);
    }

    @ObfuscatedName("id.aq(I)V")
    public static final void method3917() {
        method4031(class353.field4030);
    }

    @ObfuscatedName("af.at(Ljava/lang/String;I)V")
    public static final void method314(String arg0) {
        class298 var1 = class298.method8119(class296.field3144, client.field521.field1414);
        var1.field3205.method8227(class514.method8096(arg0));
        var1.field3205.method8234(arg0);
        client.field521.method2669(var1);
    }

    @ObfuscatedName("cd.ah(B)Z")
    public final boolean method1781() {
        return this.field842.method7261() || this.field842.method7308() >= 200 && client.field642 != 1;
    }

    @ObfuscatedName("cd.ax(Ljava/lang/String;B)V")
    public final void method1830(String arg0) {
        if (arg0 == null) {
            return;
        }
        class538 var2 = new class538(arg0, this.field841);
        if (!var2.method8883()) {
            return;
        }
        if (this.method1775()) {
            method2745();
        } else if (Statics.field1605.field1115.equals(var2)) {
            method4031(class353.field4196);
        } else if (this.method1779(var2)) {
            method5453(arg0);
        } else if (this.method1821(var2, false)) {
            method4031(class353.field4086 + arg0 + class353.field4087);
        } else {
            method2176(arg0);
        }
    }

    @ObfuscatedName("ee.aa(B)V")
    public static final void method2745() {
        method4031(class353.field4066);
    }

    @ObfuscatedName("mw.au(Ljava/lang/String;B)V")
    public static final void method5453(String arg0) {
        method4031(arg0 + class353.field4081);
    }

    @ObfuscatedName("do.ae(Ljava/lang/String;I)V")
    public static final void method2176(String arg0) {
        class298 var1 = class298.method8119(class296.field3169, client.field521.field1414);
        var1.field3205.method8227(class514.method8096(arg0));
        var1.field3205.method8234(arg0);
        client.field521.method2669(var1);
    }

    @ObfuscatedName("cd.ab(I)Z")
    public final boolean method1775() {
        return this.field843.method7261() || this.field843.method7308() >= 100 && client.field642 != 1;
    }

    @ObfuscatedName("cd.ad(Ljava/lang/String;I)V")
    public final void method1784(String arg0) {
        if (arg0 == null) {
            return;
        }
        class538 var2 = new class538(arg0, this.field841);
        if (!var2.method8883()) {
            return;
        }
        if (this.field842.method7266(var2)) {
            client.field764 = client.field709;
            class298 var3 = class298.method8119(class296.field3115, client.field521.field1414);
            var3.field3205.method8227(class514.method8096(arg0));
            var3.field3205.method8234(arg0);
            client.field521.method2669(var3);
        }
        for (int var4 = 0; var4 < class108.field1366; var4++) {
            class92 var5 = client.field612[class108.field1370[var4]];
            var5.method2245();
        }
        class111.method2562();
        if (Statics.field128 != null) {
            Statics.field128.method7182();
        }
    }

    @ObfuscatedName("cd.ao(Ljava/lang/String;ZB)V")
    public final void method1776(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class538 var3 = new class538(arg0, this.field841);
        if (!var3.method8883()) {
            return;
        }
        if (this.field843.method7266(var3)) {
            client.field764 = client.field709;
            if (arg1) {
                class298 var4 = class298.method8119(class296.field3156, client.field521.field1414);
                var4.field3205.method8227(class514.method8096(arg0));
                var4.field3205.method8234(arg0);
                client.field521.method2669(var4);
            }
        }
        client.method6030();
    }

    @ObfuscatedName("jn.ac(Ljava/lang/String;IB)V")
    public static final void method4667(String arg0, int arg1) {
        class298 var2 = class298.method8119(class296.field3173, client.field521.field1414);
        var2.field3205.method8227(class514.method8096(arg0) + 1);
        var2.field3205.method8234(arg0);
        var2.field3205.method8276(arg1);
        client.field521.method2669(var2);
    }

    @ObfuscatedName("cd.ak(Lui;B)Z")
    public final boolean method1786(class538 arg0) {
        class431 var2 = (class431) this.field842.method7263(arg0);
        return var2 != null && var2.method7332();
    }
}

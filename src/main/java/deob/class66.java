package deob;

@ObfuscatedName("cg")
public class class66 {

    @ObfuscatedName("cg.ab")
    public final class458 field796;

    @ObfuscatedName("cg.an")
    public final class399 field798;

    @ObfuscatedName("cg.ao")
    public final class397 field799;

    @ObfuscatedName("cg.av")
    public int field800 = 0;

    public class66(class458 arg0) {
        this.field796 = arg0;
        this.field798 = new class399(arg0);
        this.field799 = new class397(arg0);
    }

    @ObfuscatedName("cg.aj(I)Z")
    public boolean method1794() {
        return this.field800 == 2;
    }

    @ObfuscatedName("cg.al(I)V")
    public final void method1742() {
        this.field800 = 1;
    }

    @ObfuscatedName("cg.ac(Lsy;II)V")
    public final void method1743(class478 arg0, int arg1) {
        this.field798.method6857(arg0, arg1);
        this.field800 = 2;
        for (int var3 = 0; var3 < class105.field1342; var3++) {
            class90 var4 = client.field758[class105.field1344[var3]];
            var4.method2188();
        }
        class108.method4972();
        if (Statics.field251 != null) {
            Statics.field251.method6868();
        }
    }

    @ObfuscatedName("cg.ab(I)V")
    public final void method1744() {
        for (class402 var1 = (class402) this.field798.field4497.method6213(); var1 != null; var1 = (class402) this.field798.field4497.method6214()) {
            if ((long) var1.field4513 < class290.method4466() / 1000L - 5L) {
                if (var1.field4515 > 0) {
                    class108.method5191(5, "", var1.field4514 + class333.field3809);
                }
                if (var1.field4515 == 0) {
                    class108.method5191(5, "", var1.field4514 + class333.field3963);
                }
                var1.method7327();
            }
        }
    }

    @ObfuscatedName("cg.an(B)V")
    public final void method1750() {
        this.field800 = 0;
        this.field798.method6997();
        this.field799.method6997();
    }

    @ObfuscatedName("cg.ao(Ltj;ZI)Z")
    public final boolean method1765(class501 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1440.field1104)) {
            return true;
        } else {
            return this.field798.method6856(arg0, arg1);
        }
    }

    @ObfuscatedName("cg.av(Ltj;B)Z")
    public final boolean method1780(class501 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field799.method6953(arg0);
        }
    }

    @ObfuscatedName("cg.aq(Ljava/lang/String;B)V")
    public final void method1747(String arg0) {
        if (arg0 == null) {
            return;
        }
        class501 var2 = new class501(arg0, this.field796);
        if (!var2.method8489()) {
            return;
        }
        if (this.method1748()) {
            method3081();
        } else if (Statics.field1440.field1104.equals(var2)) {
            method49();
        } else if (this.method1765(var2, false)) {
            method2116(arg0 + class333.field3982);
        } else if (this.method1780(var2)) {
            method2116(class333.field3987 + arg0 + class333.field3988);
        } else {
            class285 var3 = class285.method2741(class283.field3071, client.field734.field1380);
            var3.field3169.method7886(class478.method4789(arg0));
            var3.field3169.method7893(arg0);
            client.field734.method2635(var3);
        }
    }

    @ObfuscatedName("dg.ap(Ljava/lang/String;I)V")
    public static final void method2116(String arg0) {
        class108.method5191(30, "", arg0);
    }

    @ObfuscatedName("ga.ar(I)V")
    public static final void method3081() {
        method2116(class333.field3981);
    }

    @ObfuscatedName("aq.ak(B)V")
    public static final void method49() {
        method2116(class333.field3985);
    }

    @ObfuscatedName("cg.ax(I)Z")
    public final boolean method1748() {
        return this.field798.method6952() || this.field798.method6951() >= 200 && client.field604 != 1;
    }

    @ObfuscatedName("cg.as(Ljava/lang/String;I)V")
    public final void method1749(String arg0) {
        if (arg0 == null) {
            return;
        }
        class501 var2 = new class501(arg0, this.field796);
        if (!var2.method8489()) {
            return;
        }
        if (this.method1779()) {
            method2116(class333.field3810);
        } else if (Statics.field1440.field1104.equals(var2)) {
            method5726();
        } else if (this.method1780(var2)) {
            method2116(arg0 + class333.field3876);
        } else if (this.method1765(var2, false)) {
            method2116(class333.field3989 + arg0 + class333.field3834);
        } else {
            class285 var3 = class285.method2741(class283.field3128, client.field734.field1380);
            var3.field3169.method7886(class478.method4789(arg0));
            var3.field3169.method7893(arg0);
            client.field734.method2635(var3);
        }
    }

    @ObfuscatedName("mw.ay(B)V")
    public static final void method5726() {
        method2116(class333.field3986);
    }

    @ObfuscatedName("cg.am(I)Z")
    public final boolean method1779() {
        return this.field799.method6952() || this.field799.method6951() >= 100 && client.field604 != 1;
    }

    @ObfuscatedName("cg.az(Ljava/lang/String;B)V")
    public final void method1751(String arg0) {
        if (arg0 == null) {
            return;
        }
        class501 var2 = new class501(arg0, this.field796);
        if (!var2.method8489()) {
            return;
        }
        if (this.field798.method6973(var2)) {
            client.field702 = client.field671;
            class285 var3 = class285.method2741(class283.field3085, client.field734.field1380);
            var3.field3169.method7886(class478.method4789(arg0));
            var3.field3169.method7893(arg0);
            client.field734.method2635(var3);
        }
        for (int var4 = 0; var4 < class105.field1342; var4++) {
            class90 var5 = client.field758[class105.field1344[var4]];
            var5.method2188();
        }
        class108.method4972();
        if (Statics.field251 != null) {
            Statics.field251.method6868();
        }
    }

    @ObfuscatedName("cg.ae(Ljava/lang/String;ZI)V")
    public final void method1802(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class501 var3 = new class501(arg0, this.field796);
        if (!var3.method8489()) {
            return;
        }
        if (this.field799.method6973(var3)) {
            client.field702 = client.field671;
            if (arg1) {
                class285 var4 = class285.method2741(class283.field3113, client.field734.field1380);
                var4.field3169.method7886(class478.method4789(arg0));
                var4.field3169.method7893(arg0);
                client.field734.method2635(var4);
            }
        }
        client.method1123();
    }

    @ObfuscatedName("hq.au(Ljava/lang/String;II)V")
    public static final void method3446(String arg0, int arg1) {
        class285 var2 = class285.method2741(class283.field3109, client.field734.field1380);
        var2.field3169.method7886(class478.method4789(arg0) + 1);
        var2.field3169.method8066(arg1);
        var2.field3169.method7893(arg0);
        client.field734.method2635(var2);
    }

    @ObfuscatedName("cg.ag(Ltj;B)Z")
    public final boolean method1753(class501 arg0) {
        class401 var2 = (class401) this.field798.method6954(arg0);
        return var2 != null && var2.method7025();
    }
}

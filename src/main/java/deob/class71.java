package deob;

import java.util.Iterator;

@ObfuscatedName("cc")
public class class71 {

    @ObfuscatedName("cc.au")
    public final class526 field824;

    @ObfuscatedName("cc.ax")
    public final class467 field826;

    @ObfuscatedName("cc.ao")
    public final class465 field822;

    @ObfuscatedName("cc.am")
    public int field827 = 0;

    public class71(class526 arg0) {
        this.field824 = arg0;
        this.field826 = new class467(arg0);
        this.field822 = new class465(arg0);
    }

    @ObfuscatedName("cc.ab(B)Z")
    public boolean method1854() {
        return this.field827 == 2;
    }

    @ObfuscatedName("cc.ay(I)V")
    public final void method1855() {
        this.field827 = 1;
    }

    @ObfuscatedName("cc.an(Lvg;II)V")
    public final void method1856(class549 arg0, int arg1) {
        this.field826.method7870(arg0, arg1);
        this.field827 = 2;
        for (int var3 = 0; var3 < Statics.field4799.field1322.field1399; var3++) {
            class94 var4 = Statics.field4799.field1317[Statics.field4799.field1322.field1401[var3]];
            var4.method2355();
        }
        Iterator var5 = class114.field1442.iterator();
        while (var5.hasNext()) {
            class65 var6 = (class65) var5.next();
            var6.method1106();
        }
        if (Statics.field70 != null) {
            Statics.field70.method7881();
        }
    }

    @ObfuscatedName("cc.au(I)V")
    public final void method1912() {
        for (class470 var1 = (class470) this.field826.field4901.method7009(); var1 != null; var1 = (class470) this.field826.field4901.method7011()) {
            if ((long) var1.field4916 < class329.method5009() / 1000L - 5L) {
                if (var1.field4915 > 0) {
                    class114.method4997(5, "", var1.field4914 + class380.field4252);
                }
                if (var1.field4915 == 0) {
                    class114.method4997(5, "", var1.field4914 + class380.field4253);
                }
                var1.method8212();
            }
        }
    }

    @ObfuscatedName("cc.ax(B)V")
    public final void method1858() {
        this.field827 = 0;
        this.field826.method7980();
        this.field822.method7980();
    }

    @ObfuscatedName("cc.ao(Lvf;ZB)Z")
    public final boolean method1859(class572 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2672.field1138)) {
            return true;
        } else {
            return this.field826.method7871(arg0, arg1);
        }
    }

    @ObfuscatedName("cc.am(Lvf;I)Z")
    public final boolean method1860(class572 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field822.method8000(arg0);
        }
    }

    @ObfuscatedName("cc.ac(Ljava/lang/String;I)V")
    public final void method1861(String arg0) {
        if (arg0 == null) {
            return;
        }
        class572 var2 = new class572(arg0, this.field824);
        if (!var2.method9468()) {
            return;
        }
        if (this.method1862()) {
            method7231();
        } else if (Statics.field2672.field1138.equals(var2)) {
            method670(class380.field4309);
        } else if (this.method1859(var2, false)) {
            method3152(arg0);
        } else if (this.method1860(var2)) {
            method658(arg0);
        } else {
            method7977(arg0);
        }
    }

    @ObfuscatedName("bp.ae(Ljava/lang/String;I)V")
    public static final void method670(String arg0) {
        class114.method4997(30, "", arg0);
    }

    @ObfuscatedName("qf.ad(I)V")
    public static final void method7231() {
        method670(class380.field4271);
    }

    @ObfuscatedName("fq.aq(Ljava/lang/String;I)V")
    public static final void method3152(String arg0) {
        method670(arg0 + class380.field4272);
    }

    @ObfuscatedName("bu.al(Ljava/lang/String;B)V")
    public static final void method658(String arg0) {
        method670(class380.field4277 + arg0 + class380.field4326);
    }

    @ObfuscatedName("so.aj(Ljava/lang/String;I)V")
    public static final void method7977(String arg0) {
        class324 var1 = class324.method4244(class322.field3338, client.field569.field1458);
        var1.field3379.method8781(class549.method8571(arg0));
        var1.field3379.method8869(arg0);
        client.field569.method2829(var1);
    }

    @ObfuscatedName("cc.as(I)Z")
    public final boolean method1862() {
        return this.field826.method8022() || this.field826.method8008() >= 200 && client.field631 != 1;
    }

    @ObfuscatedName("cc.aw(Ljava/lang/String;I)V")
    public final void method1879(String arg0) {
        if (arg0 == null) {
            return;
        }
        class572 var2 = new class572(arg0, this.field824);
        if (!var2.method9468()) {
            return;
        }
        if (this.method1902()) {
            method670(class380.field4273);
        } else if (Statics.field2672.field1138.equals(var2)) {
            method5881();
        } else if (this.method1860(var2)) {
            method670(arg0 + class380.field4274);
        } else if (this.method1859(var2, false)) {
            method670(class380.field4233 + arg0 + class380.field4143);
        } else {
            class324 var3 = class324.method4244(class322.field3285, client.field569.field1458);
            var3.field3379.method8781(class549.method8571(arg0));
            var3.field3379.method8869(arg0);
            client.field569.method2829(var3);
        }
    }

    @ObfuscatedName("nr.af(B)V")
    public static final void method5881() {
        method670(class380.field4276);
    }

    @ObfuscatedName("cc.aa(B)Z")
    public final boolean method1902() {
        return this.field822.method8022() || this.field822.method8008() >= 100 && client.field631 != 1;
    }

    @ObfuscatedName("cc.ah(Ljava/lang/String;B)V")
    public final void method1865(String arg0) {
        if (arg0 == null) {
            return;
        }
        class572 var2 = new class572(arg0, this.field824);
        if (!var2.method9468()) {
            return;
        }
        if (this.field826.method7961(var2)) {
            Statics.method413();
            class324 var3 = class324.method4244(class322.field3337, client.field569.field1458);
            var3.field3379.method8781(class549.method8571(arg0));
            var3.field3379.method8869(arg0);
            client.field569.method2829(var3);
        }
        for (int var4 = 0; var4 < Statics.field4799.field1322.field1399; var4++) {
            class94 var5 = Statics.field4799.field1317[Statics.field4799.field1322.field1401[var4]];
            var5.method2355();
        }
        Iterator var6 = class114.field1442.iterator();
        while (var6.hasNext()) {
            class65 var7 = (class65) var6.next();
            var7.method1106();
        }
        if (Statics.field70 != null) {
            Statics.field70.method7881();
        }
    }

    @ObfuscatedName("cc.ag(Ljava/lang/String;ZB)V")
    public final void method1896(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class572 var3 = new class572(arg0, this.field824);
        if (!var3.method9468()) {
            return;
        }
        if (this.field822.method7961(var3)) {
            Statics.method413();
            if (arg1) {
                class324 var4 = class324.method4244(class322.field3361, client.field569.field1458);
                var4.field3379.method8781(class549.method8571(arg0));
                var4.field3379.method8869(arg0);
                client.field569.method2829(var4);
            }
        }
        client.method1042();
    }

    @ObfuscatedName("ea.av(Ljava/lang/String;II)V")
    public static final void method2964(String arg0, int arg1) {
        class324 var2 = class324.method4244(class322.field3307, client.field569.field1458);
        var2.field3379.method8781(class549.method8571(arg0) + 1);
        var2.field3379.method8837(arg1);
        var2.field3379.method8869(arg0);
        client.field569.method2829(var2);
    }

    @ObfuscatedName("cc.ar(Lvf;B)Z")
    public final boolean method1863(class572 arg0) {
        class469 var2 = (class469) this.field826.method7958(arg0);
        return var2 != null && var2.method8032();
    }
}

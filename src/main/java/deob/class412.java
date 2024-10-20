package deob;

import java.util.Iterator;

@ObfuscatedName("pt")
public class class412 implements Iterable {

    @ObfuscatedName("pt.aq")
    public class501 field4667 = new class501();

    @ObfuscatedName("pt.ad")
    public class501 field4666;

    public class412() {
        this.field4667.field5077 = this.field4667;
        this.field4667.field5075 = this.field4667;
    }

    @ObfuscatedName("pt.aq()V")
    public void method6927() {
        while (this.field4667.field5077 != this.field4667) {
            this.field4667.field5077.method8125();
        }
    }

    @ObfuscatedName("pt.ad(Ltv;)V")
    public void method6923(class501 arg0) {
        if (arg0.field5075 != null) {
            arg0.method8125();
        }
        arg0.field5075 = this.field4667.field5075;
        arg0.field5077 = this.field4667;
        arg0.field5075.field5077 = arg0;
        arg0.field5077.field5075 = arg0;
    }

    @ObfuscatedName("pt.ag(Ltv;Ltv;)V")
    public static void method6924(class501 arg0, class501 arg1) {
        if (arg0.field5075 != null) {
            arg0.method8125();
        }
        arg0.field5075 = arg1;
        arg0.field5077 = arg1.field5077;
        arg0.field5075.field5077 = arg0;
        arg0.field5077.field5075 = arg0;
    }

    @ObfuscatedName("pt.ak()Ltv;")
    public class501 method6935() {
        class501 var1 = this.field4667.field5077;
        if (this.field4667 == var1) {
            return null;
        } else {
            var1.method8125();
            return var1;
        }
    }

    @ObfuscatedName("pt.ap()Ltv;")
    public class501 method6925() {
        return this.method6940((class501) null);
    }

    @ObfuscatedName("pt.an(Ltv;)Ltv;")
    public class501 method6940(class501 arg0) {
        class501 var2;
        if (arg0 == null) {
            var2 = this.field4667.field5077;
        } else {
            var2 = arg0;
        }
        if (this.field4667 == var2) {
            this.field4666 = null;
            return null;
        } else {
            this.field4666 = var2.field5077;
            return var2;
        }
    }

    @ObfuscatedName("pt.aj()Ltv;")
    public class501 method6922() {
        class501 var1 = this.field4666;
        if (this.field4667 == var1) {
            this.field4666 = null;
            return null;
        } else {
            this.field4666 = var1.field5077;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class411(this);
    }
}

package deob;

@ObfuscatedName("pz")
public final class class406 {

    @ObfuscatedName("pz.aq")
    public class501 field4653 = new class501();

    public class406() {
        this.field4653.field5077 = this.field4653;
        this.field4653.field5075 = this.field4653;
    }

    @ObfuscatedName("pz.aq(Ltv;)V")
    public void method6780(class501 arg0) {
        if (arg0.field5075 != null) {
            arg0.method8125();
        }
        arg0.field5075 = this.field4653.field5075;
        arg0.field5077 = this.field4653;
        arg0.field5075.field5077 = arg0;
        arg0.field5077.field5075 = arg0;
    }

    @ObfuscatedName("pz.ad(Ltv;)V")
    public void method6781(class501 arg0) {
        if (arg0.field5075 != null) {
            arg0.method8125();
        }
        arg0.field5075 = this.field4653;
        arg0.field5077 = this.field4653.field5077;
        arg0.field5075.field5077 = arg0;
        arg0.field5077.field5075 = arg0;
    }

    @ObfuscatedName("pz.ag()Ltv;")
    public class501 method6783() {
        class501 var1 = this.field4653.field5077;
        return this.field4653 == var1 ? null : var1;
    }
}

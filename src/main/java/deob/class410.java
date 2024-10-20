package deob;

@ObfuscatedName("pd")
public class class410 {

    @ObfuscatedName("pd.aq")
    public class500 field4662 = new class500();

    @ObfuscatedName("pd.ad")
    public class500 field4661;

    public class410() {
        this.field4662.field5074 = this.field4662;
        this.field4662.field5073 = this.field4662;
    }

    @ObfuscatedName("pd.aq(Ltf;)V")
    public void method6904(class500 arg0) {
        if (arg0.field5073 != null) {
            arg0.method8123();
        }
        arg0.field5073 = this.field4662.field5073;
        arg0.field5074 = this.field4662;
        arg0.field5073.field5074 = arg0;
        arg0.field5074.field5073 = arg0;
    }

    @ObfuscatedName("pd.ad()Ltf;")
    public class500 method6905() {
        class500 var1 = this.field4662.field5074;
        if (this.field4662 == var1) {
            this.field4661 = null;
            return null;
        } else {
            this.field4661 = var1.field5074;
            return var1;
        }
    }

    @ObfuscatedName("pd.ag()Ltf;")
    public class500 method6913() {
        class500 var1 = this.field4661;
        if (this.field4662 == var1) {
            this.field4661 = null;
            return null;
        } else {
            this.field4661 = var1.field5074;
            return var1;
        }
    }
}

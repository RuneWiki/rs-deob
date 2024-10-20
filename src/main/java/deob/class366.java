package deob;

@ObfuscatedName("og")
public class class366 {

    @ObfuscatedName("og.af")
    public class443 field4362 = new class443();

    @ObfuscatedName("og.an")
    public class443 field4363;

    public class366() {
        this.field4362.field4736 = this.field4362;
        this.field4362.field4737 = this.field4362;
    }

    @ObfuscatedName("og.af(Lrx;)V")
    public void method6451(class443 arg0) {
        if (arg0.field4737 != null) {
            arg0.method7639();
        }
        arg0.field4737 = this.field4362.field4737;
        arg0.field4736 = this.field4362;
        arg0.field4737.field4736 = arg0;
        arg0.field4736.field4737 = arg0;
    }

    @ObfuscatedName("og.an()Lrx;")
    public class443 method6446() {
        class443 var1 = this.field4362.field4736;
        if (this.field4362 == var1) {
            this.field4363 = null;
            return null;
        } else {
            this.field4363 = var1.field4736;
            return var1;
        }
    }

    @ObfuscatedName("og.aw()Lrx;")
    public class443 method6449() {
        class443 var1 = this.field4363;
        if (this.field4362 == var1) {
            this.field4363 = null;
            return null;
        } else {
            this.field4363 = var1.field4736;
            return var1;
        }
    }
}

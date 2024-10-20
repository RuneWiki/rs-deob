package deob;

@ObfuscatedName("oi")
public final class class375 {

    @ObfuscatedName("oi.at")
    public class457 field4374 = new class457();

    public class375() {
        this.field4374.field4750 = this.field4374;
        this.field4374.field4749 = this.field4374;
    }

    @ObfuscatedName("oi.at(Lrh;)V")
    public void method6289(class457 arg0) {
        if (arg0.field4749 != null) {
            arg0.method7554();
        }
        arg0.field4749 = this.field4374.field4749;
        arg0.field4750 = this.field4374;
        arg0.field4749.field4750 = arg0;
        arg0.field4750.field4749 = arg0;
    }

    @ObfuscatedName("oi.an(Lrh;)V")
    public void method6290(class457 arg0) {
        if (arg0.field4749 != null) {
            arg0.method7554();
        }
        arg0.field4749 = this.field4374;
        arg0.field4750 = this.field4374.field4750;
        arg0.field4749.field4750 = arg0;
        arg0.field4750.field4749 = arg0;
    }

    @ObfuscatedName("oi.av()Lrh;")
    public class457 method6288() {
        class457 var1 = this.field4374.field4750;
        return this.field4374 == var1 ? null : var1;
    }
}

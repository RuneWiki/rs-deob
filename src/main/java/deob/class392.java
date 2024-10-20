package deob;

@ObfuscatedName("pl")
public final class class392 {

    @ObfuscatedName("pl.ac")
    public class484 field4457 = new class484();

    public class392() {
        this.field4457.field4850 = this.field4457;
        this.field4457.field4852 = this.field4457;
    }

    @ObfuscatedName("pl.ac(Lsb;)V")
    public void method6518(class484 arg0) {
        if (arg0.field4852 != null) {
            arg0.method7774();
        }
        arg0.field4852 = this.field4457.field4852;
        arg0.field4850 = this.field4457;
        arg0.field4852.field4850 = arg0;
        arg0.field4850.field4852 = arg0;
    }

    @ObfuscatedName("pl.al(Lsb;)V")
    public void method6519(class484 arg0) {
        if (arg0.field4852 != null) {
            arg0.method7774();
        }
        arg0.field4852 = this.field4457;
        arg0.field4850 = this.field4457.field4850;
        arg0.field4852.field4850 = arg0;
        arg0.field4850.field4852 = arg0;
    }

    @ObfuscatedName("pl.ak()Lsb;")
    public class484 method6520() {
        class484 var1 = this.field4457.field4850;
        return this.field4457 == var1 ? null : var1;
    }
}

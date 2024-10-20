package deob;

@ObfuscatedName("lr")
public final class class333 {

    @ObfuscatedName("lr.c")
    public class405 field4122 = new class405();

    public class333() {
        this.field4122.field4456 = this.field4122;
        this.field4122.field4457 = this.field4122;
    }

    @ObfuscatedName("lr.c(Loo;)V")
    public void method5521(class405 arg0) {
        if (arg0.field4457 != null) {
            arg0.method6493();
        }
        arg0.field4457 = this.field4122.field4457;
        arg0.field4456 = this.field4122;
        arg0.field4457.field4456 = arg0;
        arg0.field4456.field4457 = arg0;
    }

    @ObfuscatedName("lr.v(Loo;)V")
    public void method5519(class405 arg0) {
        if (arg0.field4457 != null) {
            arg0.method6493();
        }
        arg0.field4457 = this.field4122;
        arg0.field4456 = this.field4122.field4456;
        arg0.field4457.field4456 = arg0;
        arg0.field4456.field4457 = arg0;
    }

    @ObfuscatedName("lr.q()Loo;")
    public class405 method5520() {
        class405 var1 = this.field4122.field4456;
        return this.field4122 == var1 ? null : var1;
    }
}

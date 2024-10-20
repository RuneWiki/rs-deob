package deob;

@ObfuscatedName("lm")
public class class338 {

    @ObfuscatedName("lm.o")
    public class405 field4150 = new class405();

    @ObfuscatedName("lm.q")
    public class405 field4149;

    public class338() {
        this.field4150.field4457 = this.field4150;
        this.field4150.field4458 = this.field4150;
    }

    @ObfuscatedName("lm.o(Log;)V")
    public void method5545(class405 arg0) {
        if (arg0.field4458 != null) {
            arg0.method6391();
        }
        arg0.field4458 = this.field4150.field4458;
        arg0.field4457 = this.field4150;
        arg0.field4458.field4457 = arg0;
        arg0.field4457.field4458 = arg0;
    }

    @ObfuscatedName("lm.q()Log;")
    public class405 method5544() {
        class405 var1 = this.field4150.field4457;
        if (this.field4150 == var1) {
            this.field4149 = null;
            return null;
        } else {
            this.field4149 = var1.field4457;
            return var1;
        }
    }

    @ObfuscatedName("lm.l()Log;")
    public class405 method5551() {
        class405 var1 = this.field4149;
        if (this.field4150 == var1) {
            this.field4149 = null;
            return null;
        } else {
            this.field4149 = var1.field4457;
            return var1;
        }
    }
}

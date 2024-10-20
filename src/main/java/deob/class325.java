package deob;

@ObfuscatedName("lo")
public final class class325 {

    @ObfuscatedName("lo.c")
    public class387 field4009 = new class387();

    public class325() {
        this.field4009.field4294 = this.field4009;
        this.field4009.field4293 = this.field4009;
    }

    @ObfuscatedName("lo.c(Lnd;)V")
    public void method5254(class387 arg0) {
        if (arg0.field4293 != null) {
            arg0.method6163();
        }
        arg0.field4293 = this.field4009.field4293;
        arg0.field4294 = this.field4009;
        arg0.field4293.field4294 = arg0;
        arg0.field4294.field4293 = arg0;
    }

    @ObfuscatedName("lo.l(Lnd;)V")
    public void method5259(class387 arg0) {
        if (arg0.field4293 != null) {
            arg0.method6163();
        }
        arg0.field4293 = this.field4009;
        arg0.field4294 = this.field4009.field4294;
        arg0.field4293.field4294 = arg0;
        arg0.field4294.field4293 = arg0;
    }

    @ObfuscatedName("lo.s()Lnd;")
    public class387 method5255() {
        class387 var1 = this.field4009.field4294;
        return this.field4009 == var1 ? null : var1;
    }
}

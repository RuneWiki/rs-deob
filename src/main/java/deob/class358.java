package deob;

@ObfuscatedName("nl")
public final class class358 {

    @ObfuscatedName("nl.aj")
    public class439 field4317 = new class439();

    public class358() {
        this.field4317.field4666 = this.field4317;
        this.field4317.field4665 = this.field4317;
    }

    @ObfuscatedName("nl.aj(Lqk;)V")
    public void method6084(class439 arg0) {
        if (arg0.field4665 != null) {
            arg0.method7331();
        }
        arg0.field4665 = this.field4317.field4665;
        arg0.field4666 = this.field4317;
        arg0.field4665.field4666 = arg0;
        arg0.field4666.field4665 = arg0;
    }

    @ObfuscatedName("nl.al(Lqk;)V")
    public void method6076(class439 arg0) {
        if (arg0.field4665 != null) {
            arg0.method7331();
        }
        arg0.field4665 = this.field4317;
        arg0.field4666 = this.field4317.field4666;
        arg0.field4665.field4666 = arg0;
        arg0.field4666.field4665 = arg0;
    }

    @ObfuscatedName("nl.ac()Lqk;")
    public class439 method6079() {
        class439 var1 = this.field4317.field4666;
        return this.field4317 == var1 ? null : var1;
    }
}

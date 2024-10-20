package deob;

@ObfuscatedName("ly")
public final class class335 {

    @ObfuscatedName("ly.c")
    public class407 field4166 = new class407();

    public class335() {
        this.field4166.field4498 = this.field4166;
        this.field4166.field4499 = this.field4166;
    }

    @ObfuscatedName("ly.c(Loa;)V")
    public void method5639(class407 arg0) {
        if (arg0.field4499 != null) {
            arg0.method6653();
        }
        arg0.field4499 = this.field4166.field4499;
        arg0.field4498 = this.field4166;
        arg0.field4499.field4498 = arg0;
        arg0.field4498.field4499 = arg0;
    }

    @ObfuscatedName("ly.p(Loa;)V")
    public void method5633(class407 arg0) {
        if (arg0.field4499 != null) {
            arg0.method6653();
        }
        arg0.field4499 = this.field4166;
        arg0.field4498 = this.field4166.field4498;
        arg0.field4499.field4498 = arg0;
        arg0.field4498.field4499 = arg0;
    }

    @ObfuscatedName("ly.f()Loa;")
    public class407 method5631() {
        class407 var1 = this.field4166.field4498;
        return this.field4166 == var1 ? null : var1;
    }
}

package deob;

@ObfuscatedName("lr")
public final class class334 {

    @ObfuscatedName("lr.o")
    public class406 field4141 = new class406();

    public class334() {
        this.field4141.field4460 = this.field4141;
        this.field4141.field4461 = this.field4141;
    }

    @ObfuscatedName("lr.o(Loq;)V")
    public void method5405(class406 arg0) {
        if (arg0.field4461 != null) {
            arg0.method6393();
        }
        arg0.field4461 = this.field4141.field4461;
        arg0.field4460 = this.field4141;
        arg0.field4461.field4460 = arg0;
        arg0.field4460.field4461 = arg0;
    }

    @ObfuscatedName("lr.q(Loq;)V")
    public void method5406(class406 arg0) {
        if (arg0.field4461 != null) {
            arg0.method6393();
        }
        arg0.field4461 = this.field4141;
        arg0.field4460 = this.field4141.field4460;
        arg0.field4461.field4460 = arg0;
        arg0.field4460.field4461 = arg0;
    }

    @ObfuscatedName("lr.l()Loq;")
    public class406 method5407() {
        class406 var1 = this.field4141.field4460;
        return this.field4141 == var1 ? null : var1;
    }
}

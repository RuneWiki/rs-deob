package deob;

@ObfuscatedName("ks")
public final class class295 {

    @ObfuscatedName("ks.s")
    public class349 field3717 = new class349();

    public class295() {
        this.field3717.field3959 = this.field3717;
        this.field3717.field3960 = this.field3717;
    }

    @ObfuscatedName("ks.s(Lmw;)V")
    public void method4693(class349 arg0) {
        if (arg0.field3960 != null) {
            arg0.method5445();
        }
        arg0.field3960 = this.field3717.field3960;
        arg0.field3959 = this.field3717;
        arg0.field3960.field3959 = arg0;
        arg0.field3959.field3960 = arg0;
    }

    @ObfuscatedName("ks.t(Lmw;)V")
    public void method4694(class349 arg0) {
        if (arg0.field3960 != null) {
            arg0.method5445();
        }
        arg0.field3960 = this.field3717;
        arg0.field3959 = this.field3717.field3959;
        arg0.field3960.field3959 = arg0;
        arg0.field3959.field3960 = arg0;
    }

    @ObfuscatedName("ks.v()Lmw;")
    public class349 method4698() {
        class349 var1 = this.field3717.field3959;
        return this.field3717 == var1 ? null : var1;
    }
}

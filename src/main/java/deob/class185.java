package deob;

@ObfuscatedName("gh")
public final class class185 {

    @ObfuscatedName("gh.p")
    public class195 field2459 = new class195();

    public class185() {
        this.field2459.field2488 = this.field2459;
        this.field2459.field2487 = this.field2459;
    }

    @ObfuscatedName("gh.p(Lgp;)V")
    public void method3152(class195 arg0) {
        if (arg0.field2487 != null) {
            arg0.method3285();
        }
        arg0.field2487 = this.field2459.field2487;
        arg0.field2488 = this.field2459;
        arg0.field2487.field2488 = arg0;
        arg0.field2488.field2487 = arg0;
    }

    @ObfuscatedName("gh.m(Lgp;)V")
    public void method3141(class195 arg0) {
        if (arg0.field2487 != null) {
            arg0.method3285();
        }
        arg0.field2487 = this.field2459;
        arg0.field2488 = this.field2459.field2488;
        arg0.field2487.field2488 = arg0;
        arg0.field2488.field2487 = arg0;
    }

    @ObfuscatedName("gh.e()Lgp;")
    public class195 method3136() {
        class195 var1 = this.field2459.field2488;
        if (this.field2459 == var1) {
            return null;
        } else {
            var1.method3285();
            return var1;
        }
    }

    @ObfuscatedName("gh.t()Lgp;")
    public class195 method3137() {
        class195 var1 = this.field2459.field2488;
        return this.field2459 == var1 ? null : var1;
    }

    @ObfuscatedName("gh.w()V")
    public void method3148() {
        while (true) {
            class195 var1 = this.field2459.field2488;
            if (this.field2459 == var1) {
                return;
            }
            var1.method3285();
        }
    }
}

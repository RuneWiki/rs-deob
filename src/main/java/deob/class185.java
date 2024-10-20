package deob;

@ObfuscatedName("gb")
public final class class185 {

    @ObfuscatedName("gb.n")
    public class195 field2459 = new class195();

    public class185() {
        this.field2459.field2487 = this.field2459;
        this.field2459.field2488 = this.field2459;
    }

    @ObfuscatedName("gb.n(Lgu;)V")
    public void method3222(class195 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3391();
        }
        arg0.field2488 = this.field2459.field2488;
        arg0.field2487 = this.field2459;
        arg0.field2488.field2487 = arg0;
        arg0.field2487.field2488 = arg0;
    }

    @ObfuscatedName("gb.p(Lgu;)V")
    public void method3224(class195 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3391();
        }
        arg0.field2488 = this.field2459;
        arg0.field2487 = this.field2459.field2487;
        arg0.field2488.field2487 = arg0;
        arg0.field2487.field2488 = arg0;
    }

    @ObfuscatedName("gb.i()Lgu;")
    public class195 method3226() {
        class195 var1 = this.field2459.field2487;
        if (this.field2459 == var1) {
            return null;
        } else {
            var1.method3391();
            return var1;
        }
    }

    @ObfuscatedName("gb.j()Lgu;")
    public class195 method3235() {
        class195 var1 = this.field2459.field2487;
        return this.field2459 == var1 ? null : var1;
    }

    @ObfuscatedName("gb.f()V")
    public void method3240() {
        while (true) {
            class195 var1 = this.field2459.field2487;
            if (this.field2459 == var1) {
                return;
            }
            var1.method3391();
        }
    }
}

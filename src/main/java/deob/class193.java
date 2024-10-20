package deob;

@ObfuscatedName("gs")
public final class class193 {

    @ObfuscatedName("gs.q")
    public class194 field2946 = new class194();

    public class193() {
        this.field2946.field2947 = this.field2946;
        this.field2946.field2948 = this.field2946;
    }

    @ObfuscatedName("gs.q(Lgb;)V")
    public void method3366(class194 arg0) {
        if (arg0.field2948 != null) {
            arg0.method3386();
        }
        arg0.field2948 = this.field2946.field2948;
        arg0.field2947 = this.field2946;
        arg0.field2948.field2947 = arg0;
        arg0.field2947.field2948 = arg0;
    }

    @ObfuscatedName("gs.s(Lgb;)V")
    public void method3367(class194 arg0) {
        if (arg0.field2948 != null) {
            arg0.method3386();
        }
        arg0.field2948 = this.field2946;
        arg0.field2947 = this.field2946.field2947;
        arg0.field2948.field2947 = arg0;
        arg0.field2947.field2948 = arg0;
    }

    @ObfuscatedName("gs.h()Lgb;")
    public class194 method3372() {
        class194 var1 = this.field2946.field2947;
        if (this.field2946 == var1) {
            return null;
        } else {
            var1.method3386();
            return var1;
        }
    }

    @ObfuscatedName("gs.e()Lgb;")
    public class194 method3369() {
        class194 var1 = this.field2946.field2947;
        return this.field2946 == var1 ? null : var1;
    }

    @ObfuscatedName("gs.n()V")
    public void method3370() {
        while (true) {
            class194 var1 = this.field2946.field2947;
            if (this.field2946 == var1) {
                return;
            }
            var1.method3386();
        }
    }
}

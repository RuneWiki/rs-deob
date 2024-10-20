package deob;

@ObfuscatedName("ge")
public final class class188 {

    @ObfuscatedName("ge.w")
    public class198 field2465 = new class198();

    public class188() {
        this.field2465.field2493 = this.field2465;
        this.field2465.field2494 = this.field2465;
    }

    @ObfuscatedName("ge.w(Lgw;)V")
    public void method3192(class198 arg0) {
        if (arg0.field2494 != null) {
            arg0.method3331();
        }
        arg0.field2494 = this.field2465.field2494;
        arg0.field2493 = this.field2465;
        arg0.field2494.field2493 = arg0;
        arg0.field2493.field2494 = arg0;
    }

    @ObfuscatedName("ge.o(Lgw;)V")
    public void method3191(class198 arg0) {
        if (arg0.field2494 != null) {
            arg0.method3331();
        }
        arg0.field2494 = this.field2465;
        arg0.field2493 = this.field2465.field2493;
        arg0.field2494.field2493 = arg0;
        arg0.field2493.field2494 = arg0;
    }

    @ObfuscatedName("ge.x()Lgw;")
    public class198 method3194() {
        class198 var1 = this.field2465.field2493;
        if (this.field2465 == var1) {
            return null;
        } else {
            var1.method3331();
            return var1;
        }
    }

    @ObfuscatedName("ge.k()Lgw;")
    public class198 method3193() {
        class198 var1 = this.field2465.field2493;
        return this.field2465 == var1 ? null : var1;
    }

    @ObfuscatedName("ge.f()V")
    public void method3198() {
        while (true) {
            class198 var1 = this.field2465.field2493;
            if (this.field2465 == var1) {
                return;
            }
            var1.method3331();
        }
    }
}

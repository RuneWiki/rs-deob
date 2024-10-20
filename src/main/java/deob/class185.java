package deob;

@ObfuscatedName("ga")
public final class class185 {

    @ObfuscatedName("ga.i")
    public class195 field2450 = new class195();

    public class185() {
        this.field2450.field2478 = this.field2450;
        this.field2450.field2479 = this.field2450;
    }

    @ObfuscatedName("ga.i(Lgc;)V")
    public void method3179(class195 arg0) {
        if (arg0.field2479 != null) {
            arg0.method3323();
        }
        arg0.field2479 = this.field2450.field2479;
        arg0.field2478 = this.field2450;
        arg0.field2479.field2478 = arg0;
        arg0.field2478.field2479 = arg0;
    }

    @ObfuscatedName("ga.w(Lgc;)V")
    public void method3186(class195 arg0) {
        if (arg0.field2479 != null) {
            arg0.method3323();
        }
        arg0.field2479 = this.field2450;
        arg0.field2478 = this.field2450.field2478;
        arg0.field2479.field2478 = arg0;
        arg0.field2478.field2479 = arg0;
    }

    @ObfuscatedName("ga.a()Lgc;")
    public class195 method3181() {
        class195 var1 = this.field2450.field2478;
        if (this.field2450 == var1) {
            return null;
        } else {
            var1.method3323();
            return var1;
        }
    }

    @ObfuscatedName("ga.t()Lgc;")
    public class195 method3182() {
        class195 var1 = this.field2450.field2478;
        return this.field2450 == var1 ? null : var1;
    }

    @ObfuscatedName("ga.s()V")
    public void method3183() {
        while (true) {
            class195 var1 = this.field2450.field2478;
            if (this.field2450 == var1) {
                return;
            }
            var1.method3323();
        }
    }
}

package deob;

@ObfuscatedName("fx")
public final class class181 {

    @ObfuscatedName("fx.t")
    public class182 field2852 = new class182();

    public class181() {
        this.field2852.field2853 = this.field2852;
        this.field2852.field2854 = this.field2852;
    }

    @ObfuscatedName("fx.t(Lfe;)V")
    public void method3284(class182 arg0) {
        if (arg0.field2854 != null) {
            arg0.method3299();
        }
        arg0.field2854 = this.field2852.field2854;
        arg0.field2853 = this.field2852;
        arg0.field2854.field2853 = arg0;
        arg0.field2853.field2854 = arg0;
    }

    @ObfuscatedName("fx.s(Lfe;)V")
    public void method3285(class182 arg0) {
        if (arg0.field2854 != null) {
            arg0.method3299();
        }
        arg0.field2854 = this.field2852;
        arg0.field2853 = this.field2852.field2853;
        arg0.field2854.field2853 = arg0;
        arg0.field2853.field2854 = arg0;
    }

    @ObfuscatedName("fx.f()Lfe;")
    public class182 method3286() {
        class182 var1 = this.field2852.field2853;
        if (this.field2852 == var1) {
            return null;
        } else {
            var1.method3299();
            return var1;
        }
    }

    @ObfuscatedName("fx.e()Lfe;")
    public class182 method3283() {
        class182 var1 = this.field2852.field2853;
        return this.field2852 == var1 ? null : var1;
    }

    @ObfuscatedName("fx.d()V")
    public void method3287() {
        while (true) {
            class182 var1 = this.field2852.field2853;
            if (this.field2852 == var1) {
                return;
            }
            var1.method3299();
        }
    }
}

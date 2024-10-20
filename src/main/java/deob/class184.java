package deob;

@ObfuscatedName("ga")
public final class class184 {

    @ObfuscatedName("ga.e")
    public class185 field2883 = new class185();

    public class184() {
        this.field2883.field2884 = this.field2883;
        this.field2883.field2885 = this.field2883;
    }

    @ObfuscatedName("ga.e(Lgr;)V")
    public void method3285(class185 arg0) {
        if (arg0.field2885 != null) {
            arg0.method3299();
        }
        arg0.field2885 = this.field2883.field2885;
        arg0.field2884 = this.field2883;
        arg0.field2885.field2884 = arg0;
        arg0.field2884.field2885 = arg0;
    }

    @ObfuscatedName("ga.v(Lgr;)V")
    public void method3295(class185 arg0) {
        if (arg0.field2885 != null) {
            arg0.method3299();
        }
        arg0.field2885 = this.field2883;
        arg0.field2884 = this.field2883.field2884;
        arg0.field2885.field2884 = arg0;
        arg0.field2884.field2885 = arg0;
    }

    @ObfuscatedName("ga.k()Lgr;")
    public class185 method3284() {
        class185 var1 = this.field2883.field2884;
        if (this.field2883 == var1) {
            return null;
        } else {
            var1.method3299();
            return var1;
        }
    }

    @ObfuscatedName("ga.g()Lgr;")
    public class185 method3281() {
        class185 var1 = this.field2883.field2884;
        return this.field2883 == var1 ? null : var1;
    }

    @ObfuscatedName("ga.q()V")
    public void method3286() {
        while (true) {
            class185 var1 = this.field2883.field2884;
            if (this.field2883 == var1) {
                return;
            }
            var1.method3299();
        }
    }
}

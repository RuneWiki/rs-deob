package deob;

@ObfuscatedName("fl")
public final class class173 {

    @ObfuscatedName("fl.z")
    public class174 field2812 = new class174();

    public class173() {
        this.field2812.field2813 = this.field2812;
        this.field2812.field2814 = this.field2812;
    }

    @ObfuscatedName("fl.z(Lfb;)V")
    public void method3265(class174 arg0) {
        if (arg0.field2814 != null) {
            arg0.method3282();
        }
        arg0.field2814 = this.field2812.field2814;
        arg0.field2813 = this.field2812;
        arg0.field2814.field2813 = arg0;
        arg0.field2813.field2814 = arg0;
    }

    @ObfuscatedName("fl.n(Lfb;)V")
    public void method3262(class174 arg0) {
        if (arg0.field2814 != null) {
            arg0.method3282();
        }
        arg0.field2814 = this.field2812;
        arg0.field2813 = this.field2812.field2813;
        arg0.field2814.field2813 = arg0;
        arg0.field2813.field2814 = arg0;
    }

    @ObfuscatedName("fl.u()Lfb;")
    public class174 method3263() {
        class174 var1 = this.field2812.field2813;
        if (this.field2812 == var1) {
            return null;
        } else {
            var1.method3282();
            return var1;
        }
    }

    @ObfuscatedName("fl.t()Lfb;")
    public class174 method3264() {
        class174 var1 = this.field2812.field2813;
        return this.field2812 == var1 ? null : var1;
    }

    @ObfuscatedName("fl.e()V")
    public void method3267() {
        while (true) {
            class174 var1 = this.field2812.field2813;
            if (this.field2812 == var1) {
                return;
            }
            var1.method3282();
        }
    }
}

package deob;

@ObfuscatedName("gn")
public final class class184 {

    @ObfuscatedName("gn.f")
    public class185 field2871 = new class185();

    public class184() {
        this.field2871.field2873 = this.field2871;
        this.field2871.field2872 = this.field2871;
    }

    @ObfuscatedName("gn.f(Lgt;)V")
    public void method3328(class185 arg0) {
        if (arg0.field2872 != null) {
            arg0.method3347();
        }
        arg0.field2872 = this.field2871.field2872;
        arg0.field2873 = this.field2871;
        arg0.field2872.field2873 = arg0;
        arg0.field2873.field2872 = arg0;
    }

    @ObfuscatedName("gn.k(Lgt;)V")
    public void method3329(class185 arg0) {
        if (arg0.field2872 != null) {
            arg0.method3347();
        }
        arg0.field2872 = this.field2871;
        arg0.field2873 = this.field2871.field2873;
        arg0.field2872.field2873 = arg0;
        arg0.field2873.field2872 = arg0;
    }

    @ObfuscatedName("gn.y()Lgt;")
    public class185 method3330() {
        class185 var1 = this.field2871.field2873;
        if (this.field2871 == var1) {
            return null;
        } else {
            var1.method3347();
            return var1;
        }
    }

    @ObfuscatedName("gn.e()Lgt;")
    public class185 method3345() {
        class185 var1 = this.field2871.field2873;
        return this.field2871 == var1 ? null : var1;
    }

    @ObfuscatedName("gn.r()V")
    public void method3332() {
        while (true) {
            class185 var1 = this.field2871.field2873;
            if (this.field2871 == var1) {
                return;
            }
            var1.method3347();
        }
    }
}

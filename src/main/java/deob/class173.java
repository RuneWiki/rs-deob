package deob;

@ObfuscatedName("fx")
public class class173 {

    @ObfuscatedName("fx.b")
    public class183 field2838 = new class183();

    @ObfuscatedName("fx.u")
    public class183 field2837;

    public class173() {
        this.field2838.field2859 = this.field2838;
        this.field2838.field2858 = this.field2838;
    }

    @ObfuscatedName("fx.b(Lgc;)V")
    public void method3140(class183 arg0) {
        if (arg0.field2858 != null) {
            arg0.method3255();
        }
        arg0.field2858 = this.field2838.field2858;
        arg0.field2859 = this.field2838;
        arg0.field2858.field2859 = arg0;
        arg0.field2859.field2858 = arg0;
    }

    @ObfuscatedName("fx.u()Lgc;")
    public class183 method3143() {
        class183 var1 = this.field2838.field2859;
        if (this.field2838 == var1) {
            this.field2837 = null;
            return null;
        } else {
            this.field2837 = var1.field2859;
            return var1;
        }
    }

    @ObfuscatedName("fx.x()Lgc;")
    public class183 method3141() {
        class183 var1 = this.field2837;
        if (this.field2838 == var1) {
            this.field2837 = null;
            return null;
        } else {
            this.field2837 = var1.field2859;
            return var1;
        }
    }
}

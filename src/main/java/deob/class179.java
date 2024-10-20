package deob;

@ObfuscatedName("ff")
public final class class179 {

    @ObfuscatedName("ff.e")
    public class180 field2835 = new class180();

    public class179() {
        this.field2835.field2836 = this.field2835;
        this.field2835.field2837 = this.field2835;
    }

    @ObfuscatedName("ff.e(Lfi;)V")
    public void method3273(class180 arg0) {
        if (arg0.field2837 != null) {
            arg0.method3287();
        }
        arg0.field2837 = this.field2835.field2837;
        arg0.field2836 = this.field2835;
        arg0.field2837.field2836 = arg0;
        arg0.field2836.field2837 = arg0;
    }

    @ObfuscatedName("ff.p(Lfi;)V")
    public void method3286(class180 arg0) {
        if (arg0.field2837 != null) {
            arg0.method3287();
        }
        arg0.field2837 = this.field2835;
        arg0.field2836 = this.field2835.field2836;
        arg0.field2837.field2836 = arg0;
        arg0.field2836.field2837 = arg0;
    }

    @ObfuscatedName("ff.a()Lfi;")
    public class180 method3270() {
        class180 var1 = this.field2835.field2836;
        if (this.field2835 == var1) {
            return null;
        } else {
            var1.method3287();
            return var1;
        }
    }

    @ObfuscatedName("ff.g()Lfi;")
    public class180 method3274() {
        class180 var1 = this.field2835.field2836;
        return this.field2835 == var1 ? null : var1;
    }

    @ObfuscatedName("ff.u()V")
    public void method3275() {
        while (true) {
            class180 var1 = this.field2835.field2836;
            if (this.field2835 == var1) {
                return;
            }
            var1.method3287();
        }
    }
}

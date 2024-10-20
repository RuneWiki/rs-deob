package deob;

@ObfuscatedName("fu")
public final class class172 {

    @ObfuscatedName("fu.c")
    public class174 field2809 = new class174();

    public class172() {
        this.field2809.field2812 = this.field2809;
        this.field2809.field2813 = this.field2809;
    }

    @ObfuscatedName("fu.c(Lfb;)V")
    public void method3106(class174 arg0) {
        if (arg0.field2813 != null) {
            arg0.method3133();
        }
        arg0.field2813 = this.field2809.field2813;
        arg0.field2812 = this.field2809;
        arg0.field2813.field2812 = arg0;
        arg0.field2812.field2813 = arg0;
    }

    @ObfuscatedName("fu.q(Lfb;)V")
    public void method3108(class174 arg0) {
        if (arg0.field2813 != null) {
            arg0.method3133();
        }
        arg0.field2813 = this.field2809;
        arg0.field2812 = this.field2809.field2812;
        arg0.field2813.field2812 = arg0;
        arg0.field2812.field2813 = arg0;
    }

    @ObfuscatedName("fu.y()Lfb;")
    public class174 method3119() {
        class174 var1 = this.field2809.field2812;
        if (this.field2809 == var1) {
            return null;
        } else {
            var1.method3133();
            return var1;
        }
    }

    @ObfuscatedName("fu.v()Lfb;")
    public class174 method3109() {
        class174 var1 = this.field2809.field2812;
        return this.field2809 == var1 ? null : var1;
    }

    @ObfuscatedName("fu.g()V")
    public void method3114() {
        while (true) {
            class174 var1 = this.field2809.field2812;
            if (this.field2809 == var1) {
                return;
            }
            var1.method3133();
        }
    }
}

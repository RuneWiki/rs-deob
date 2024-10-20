package deob;

@ObfuscatedName("fo")
public final class class170 {

    @ObfuscatedName("fo.z")
    public class172 field2739 = new class172();

    public class170() {
        this.field2739.field2742 = this.field2739;
        this.field2739.field2743 = this.field2739;
    }

    @ObfuscatedName("fo.z(Lff;)V")
    public void method3248(class172 arg0) {
        if (arg0.field2743 != null) {
            arg0.method3280();
        }
        arg0.field2743 = this.field2739.field2743;
        arg0.field2742 = this.field2739;
        arg0.field2743.field2742 = arg0;
        arg0.field2742.field2743 = arg0;
    }

    @ObfuscatedName("fo.h(Lff;)V")
    public void method3249(class172 arg0) {
        if (arg0.field2743 != null) {
            arg0.method3280();
        }
        arg0.field2743 = this.field2739;
        arg0.field2742 = this.field2739.field2742;
        arg0.field2743.field2742 = arg0;
        arg0.field2742.field2743 = arg0;
    }

    @ObfuscatedName("fo.c()Lff;")
    public class172 method3250() {
        class172 var1 = this.field2739.field2742;
        if (this.field2739 == var1) {
            return null;
        } else {
            var1.method3280();
            return var1;
        }
    }

    @ObfuscatedName("fo.p()Lff;")
    public class172 method3251() {
        class172 var1 = this.field2739.field2742;
        return this.field2739 == var1 ? null : var1;
    }

    @ObfuscatedName("fo.i()V")
    public void method3252() {
        while (true) {
            class172 var1 = this.field2739.field2742;
            if (this.field2739 == var1) {
                return;
            }
            var1.method3280();
        }
    }
}

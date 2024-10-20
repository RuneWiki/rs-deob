package deob;

@ObfuscatedName("gv")
public final class class203 {

    @ObfuscatedName("gv.o")
    public class204 field3086 = new class204();

    public class203() {
        this.field3086.field3088 = this.field3086;
        this.field3086.field3087 = this.field3086;
    }

    @ObfuscatedName("gv.o(Lgn;)V")
    public void method3571(class204 arg0) {
        if (arg0.field3087 != null) {
            arg0.method3580();
        }
        arg0.field3087 = this.field3086.field3087;
        arg0.field3088 = this.field3086;
        arg0.field3087.field3088 = arg0;
        arg0.field3088.field3087 = arg0;
    }

    @ObfuscatedName("gv.f(Lgn;)V")
    public void method3575(class204 arg0) {
        if (arg0.field3087 != null) {
            arg0.method3580();
        }
        arg0.field3087 = this.field3086;
        arg0.field3088 = this.field3086.field3088;
        arg0.field3087.field3088 = arg0;
        arg0.field3088.field3087 = arg0;
    }

    @ObfuscatedName("gv.i()Lgn;")
    public class204 method3573() {
        class204 var1 = this.field3086.field3088;
        if (this.field3086 == var1) {
            return null;
        } else {
            var1.method3580();
            return var1;
        }
    }

    @ObfuscatedName("gv.h()Lgn;")
    public class204 method3574() {
        class204 var1 = this.field3086.field3088;
        return this.field3086 == var1 ? null : var1;
    }

    @ObfuscatedName("gv.q()V")
    public void method3570() {
        while (true) {
            class204 var1 = this.field3086.field3088;
            if (this.field3086 == var1) {
                return;
            }
            var1.method3580();
        }
    }
}

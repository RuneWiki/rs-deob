package deob;

@ObfuscatedName("gt")
public final class class203 {

    @ObfuscatedName("gt.c")
    public class204 field3085 = new class204();

    public class203() {
        this.field3085.field3087 = this.field3085;
        this.field3085.field3086 = this.field3085;
    }

    @ObfuscatedName("gt.c(Lgq;)V")
    public void method3611(class204 arg0) {
        if (arg0.field3086 != null) {
            arg0.method3626();
        }
        arg0.field3086 = this.field3085.field3086;
        arg0.field3087 = this.field3085;
        arg0.field3086.field3087 = arg0;
        arg0.field3087.field3086 = arg0;
    }

    @ObfuscatedName("gt.h(Lgq;)V")
    public void method3610(class204 arg0) {
        if (arg0.field3086 != null) {
            arg0.method3626();
        }
        arg0.field3086 = this.field3085;
        arg0.field3087 = this.field3085.field3087;
        arg0.field3086.field3087 = arg0;
        arg0.field3087.field3086 = arg0;
    }

    @ObfuscatedName("gt.k()Lgq;")
    public class204 method3617() {
        class204 var1 = this.field3085.field3087;
        if (this.field3085 == var1) {
            return null;
        } else {
            var1.method3626();
            return var1;
        }
    }

    @ObfuscatedName("gt.t()Lgq;")
    public class204 method3612() {
        class204 var1 = this.field3085.field3087;
        return this.field3085 == var1 ? null : var1;
    }

    @ObfuscatedName("gt.g()V")
    public void method3614() {
        while (true) {
            class204 var1 = this.field3085.field3087;
            if (this.field3085 == var1) {
                return;
            }
            var1.method3626();
        }
    }
}

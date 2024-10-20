package deob;

@ObfuscatedName("gr")
public final class class203 {

    @ObfuscatedName("gr.n")
    public class204 field3085 = new class204();

    public class203() {
        this.field3085.field3087 = this.field3085;
        this.field3085.field3086 = this.field3085;
    }

    @ObfuscatedName("gr.n(Lgt;)V")
    public void method3611(class204 arg0) {
        if (arg0.field3086 != null) {
            arg0.method3627();
        }
        arg0.field3086 = this.field3085.field3086;
        arg0.field3087 = this.field3085;
        arg0.field3086.field3087 = arg0;
        arg0.field3087.field3086 = arg0;
    }

    @ObfuscatedName("gr.d(Lgt;)V")
    public void method3610(class204 arg0) {
        if (arg0.field3086 != null) {
            arg0.method3627();
        }
        arg0.field3086 = this.field3085;
        arg0.field3087 = this.field3085.field3087;
        arg0.field3086.field3087 = arg0;
        arg0.field3087.field3086 = arg0;
    }

    @ObfuscatedName("gr.s()Lgt;")
    public class204 method3620() {
        class204 var1 = this.field3085.field3087;
        if (this.field3085 == var1) {
            return null;
        } else {
            var1.method3627();
            return var1;
        }
    }

    @ObfuscatedName("gr.q()Lgt;")
    public class204 method3614() {
        class204 var1 = this.field3085.field3087;
        return this.field3085 == var1 ? null : var1;
    }

    @ObfuscatedName("gr.j()V")
    public void method3615() {
        while (true) {
            class204 var1 = this.field3085.field3087;
            if (this.field3085 == var1) {
                return;
            }
            var1.method3627();
        }
    }
}

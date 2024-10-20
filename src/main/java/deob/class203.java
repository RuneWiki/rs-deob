package deob;

@ObfuscatedName("gs")
public final class class203 {

    @ObfuscatedName("gs.g")
    public class204 field3087 = new class204();

    public class203() {
        this.field3087.field3089 = this.field3087;
        this.field3087.field3088 = this.field3087;
    }

    @ObfuscatedName("gs.g(Lgm;)V")
    public void method3653(class204 arg0) {
        if (arg0.field3088 != null) {
            arg0.method3671();
        }
        arg0.field3088 = this.field3087.field3088;
        arg0.field3089 = this.field3087;
        arg0.field3088.field3089 = arg0;
        arg0.field3089.field3088 = arg0;
    }

    @ObfuscatedName("gs.b(Lgm;)V")
    public void method3654(class204 arg0) {
        if (arg0.field3088 != null) {
            arg0.method3671();
        }
        arg0.field3088 = this.field3087;
        arg0.field3089 = this.field3087.field3089;
        arg0.field3088.field3089 = arg0;
        arg0.field3089.field3088 = arg0;
    }

    @ObfuscatedName("gs.w()Lgm;")
    public class204 method3655() {
        class204 var1 = this.field3087.field3089;
        if (this.field3087 == var1) {
            return null;
        } else {
            var1.method3671();
            return var1;
        }
    }

    @ObfuscatedName("gs.d()Lgm;")
    public class204 method3670() {
        class204 var1 = this.field3087.field3089;
        return this.field3087 == var1 ? null : var1;
    }

    @ObfuscatedName("gs.z()V")
    public void method3657() {
        while (true) {
            class204 var1 = this.field3087.field3089;
            if (this.field3087 == var1) {
                return;
            }
            var1.method3671();
        }
    }
}

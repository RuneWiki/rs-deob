package deob;

@ObfuscatedName("gz")
public final class class203 {

    @ObfuscatedName("gz.i")
    public class204 field3087 = new class204();

    public class203() {
        this.field3087.field3088 = this.field3087;
        this.field3087.field3089 = this.field3087;
    }

    @ObfuscatedName("gz.i(Lgr;)V")
    public void method3595(class204 arg0) {
        if (arg0.field3089 != null) {
            arg0.method3605();
        }
        arg0.field3089 = this.field3087.field3089;
        arg0.field3088 = this.field3087;
        arg0.field3089.field3088 = arg0;
        arg0.field3088.field3089 = arg0;
    }

    @ObfuscatedName("gz.v(Lgr;)V")
    public void method3591(class204 arg0) {
        if (arg0.field3089 != null) {
            arg0.method3605();
        }
        arg0.field3089 = this.field3087;
        arg0.field3088 = this.field3087.field3088;
        arg0.field3089.field3088 = arg0;
        arg0.field3088.field3089 = arg0;
    }

    @ObfuscatedName("gz.f()Lgr;")
    public class204 method3594() {
        class204 var1 = this.field3087.field3088;
        if (this.field3087 == var1) {
            return null;
        } else {
            var1.method3605();
            return var1;
        }
    }

    @ObfuscatedName("gz.h()Lgr;")
    public class204 method3593() {
        class204 var1 = this.field3087.field3088;
        return this.field3087 == var1 ? null : var1;
    }

    @ObfuscatedName("gz.a()V")
    public void method3590() {
        while (true) {
            class204 var1 = this.field3087.field3088;
            if (this.field3087 == var1) {
                return;
            }
            var1.method3605();
        }
    }
}

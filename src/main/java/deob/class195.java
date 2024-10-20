package deob;

@ObfuscatedName("gf")
public class class195 {

    @ObfuscatedName("gf.v")
    public class207 field3088 = new class207();

    @ObfuscatedName("gf.f")
    public class207 field3087;

    public class195() {
        this.field3088.field3112 = this.field3088;
        this.field3088.field3113 = this.field3088;
    }

    @ObfuscatedName("gf.v(Lga;)V")
    public void method3521(class207 arg0) {
        if (arg0.field3113 != null) {
            arg0.method3641();
        }
        arg0.field3113 = this.field3088.field3113;
        arg0.field3112 = this.field3088;
        arg0.field3113.field3112 = arg0;
        arg0.field3112.field3113 = arg0;
    }

    @ObfuscatedName("gf.f()Lga;")
    public class207 method3515() {
        class207 var1 = this.field3088.field3112;
        if (this.field3088 == var1) {
            this.field3087 = null;
            return null;
        } else {
            this.field3087 = var1.field3112;
            return var1;
        }
    }

    @ObfuscatedName("gf.i()Lga;")
    public class207 method3516() {
        class207 var1 = this.field3087;
        if (this.field3088 == var1) {
            this.field3087 = null;
            return null;
        } else {
            this.field3087 = var1.field3112;
            return var1;
        }
    }
}

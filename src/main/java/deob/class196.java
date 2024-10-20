package deob;

@ObfuscatedName("ga")
public class class196 {

    @ObfuscatedName("ga.b")
    public class208 field3087 = new class208();

    @ObfuscatedName("ga.g")
    public class208 field3088;

    public class196() {
        this.field3087.field3112 = this.field3087;
        this.field3087.field3113 = this.field3087;
    }

    @ObfuscatedName("ga.b(Lgx;)V")
    public void method3525(class208 arg0) {
        if (arg0.field3113 != null) {
            arg0.method3636();
        }
        arg0.field3113 = this.field3087.field3113;
        arg0.field3112 = this.field3087;
        arg0.field3113.field3112 = arg0;
        arg0.field3112.field3113 = arg0;
    }

    @ObfuscatedName("ga.g()Lgx;")
    public class208 method3524() {
        class208 var1 = this.field3087.field3112;
        if (this.field3087 == var1) {
            this.field3088 = null;
            return null;
        } else {
            this.field3088 = var1.field3112;
            return var1;
        }
    }

    @ObfuscatedName("ga.j()Lgx;")
    public class208 method3517() {
        class208 var1 = this.field3088;
        if (this.field3087 == var1) {
            this.field3088 = null;
            return null;
        } else {
            this.field3088 = var1.field3112;
            return var1;
        }
    }
}

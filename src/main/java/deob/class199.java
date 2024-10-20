package deob;

@ObfuscatedName("gu")
public class class199 {

    @ObfuscatedName("gu.j")
    public class208 field3087 = new class208();

    @ObfuscatedName("gu.m")
    public class208 field3088;

    public class199() {
        this.field3087.field3103 = this.field3087;
        this.field3087.field3104 = this.field3087;
    }

    @ObfuscatedName("gu.j()V")
    public void method3600() {
        while (true) {
            class208 var1 = this.field3087.field3103;
            if (this.field3087 == var1) {
                this.field3088 = null;
                return;
            }
            var1.method3700();
        }
    }

    @ObfuscatedName("gu.m(Lgt;)V")
    public void method3603(class208 arg0) {
        if (arg0.field3104 != null) {
            arg0.method3700();
        }
        arg0.field3104 = this.field3087.field3104;
        arg0.field3103 = this.field3087;
        arg0.field3104.field3103 = arg0;
        arg0.field3103.field3104 = arg0;
    }

    @ObfuscatedName("gu.f(Lgt;)V")
    public void method3602(class208 arg0) {
        if (arg0.field3104 != null) {
            arg0.method3700();
        }
        arg0.field3104 = this.field3087;
        arg0.field3103 = this.field3087.field3103;
        arg0.field3104.field3103 = arg0;
        arg0.field3103.field3104 = arg0;
    }

    @ObfuscatedName("gu.l(Lgt;Lgt;)V")
    public static void method3622(class208 arg0, class208 arg1) {
        if (arg0.field3104 != null) {
            arg0.method3700();
        }
        arg0.field3104 = arg1.field3104;
        arg0.field3103 = arg1;
        arg0.field3104.field3103 = arg0;
        arg0.field3103.field3104 = arg0;
    }

    @ObfuscatedName("gu.u()Lgt;")
    public class208 method3604() {
        class208 var1 = this.field3087.field3103;
        if (this.field3087 == var1) {
            return null;
        } else {
            var1.method3700();
            return var1;
        }
    }

    @ObfuscatedName("gu.a()Lgt;")
    public class208 method3601() {
        class208 var1 = this.field3087.field3104;
        if (this.field3087 == var1) {
            return null;
        } else {
            var1.method3700();
            return var1;
        }
    }

    @ObfuscatedName("gu.h()Lgt;")
    public class208 method3606() {
        class208 var1 = this.field3087.field3103;
        if (this.field3087 == var1) {
            this.field3088 = null;
            return null;
        } else {
            this.field3088 = var1.field3103;
            return var1;
        }
    }

    @ObfuscatedName("gu.i()Lgt;")
    public class208 method3619() {
        class208 var1 = this.field3087.field3104;
        if (this.field3087 == var1) {
            this.field3088 = null;
            return null;
        } else {
            this.field3088 = var1.field3104;
            return var1;
        }
    }

    @ObfuscatedName("gu.t()Lgt;")
    public class208 method3608() {
        class208 var1 = this.field3088;
        if (this.field3087 == var1) {
            this.field3088 = null;
            return null;
        } else {
            this.field3088 = var1.field3103;
            return var1;
        }
    }

    @ObfuscatedName("gu.k()Lgt;")
    public class208 method3609() {
        class208 var1 = this.field3088;
        if (this.field3087 == var1) {
            this.field3088 = null;
            return null;
        } else {
            this.field3088 = var1.field3104;
            return var1;
        }
    }
}

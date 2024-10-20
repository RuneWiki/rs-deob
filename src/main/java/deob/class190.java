package deob;

@ObfuscatedName("gq")
public class class190 {

    @ObfuscatedName("gq.t")
    public class199 field2998 = new class199();

    @ObfuscatedName("gq.b")
    public class199 field2999;

    public class190() {
        this.field2998.field3014 = this.field2998;
        this.field2998.field3016 = this.field2998;
    }

    @ObfuscatedName("gq.t()V")
    public void method3420() {
        while (true) {
            class199 var1 = this.field2998.field3014;
            if (this.field2998 == var1) {
                this.field2999 = null;
                return;
            }
            var1.method3506();
        }
    }

    @ObfuscatedName("gq.b(Lgt;)V")
    public void method3442(class199 arg0) {
        if (arg0.field3016 != null) {
            arg0.method3506();
        }
        arg0.field3016 = this.field2998.field3016;
        arg0.field3014 = this.field2998;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
    }

    @ObfuscatedName("gq.p(Lgt;)V")
    public void method3444(class199 arg0) {
        if (arg0.field3016 != null) {
            arg0.method3506();
        }
        arg0.field3016 = this.field2998;
        arg0.field3014 = this.field2998.field3014;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
    }

    @ObfuscatedName("gq.e(Lgt;Lgt;)V")
    public static void method3411(class199 arg0, class199 arg1) {
        if (arg0.field3016 != null) {
            arg0.method3506();
        }
        arg0.field3016 = arg1.field3016;
        arg0.field3014 = arg1;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
    }

    @ObfuscatedName("gq.i()Lgt;")
    public class199 method3421() {
        class199 var1 = this.field2998.field3014;
        if (this.field2998 == var1) {
            return null;
        } else {
            var1.method3506();
            return var1;
        }
    }

    @ObfuscatedName("gq.o()Lgt;")
    public class199 method3410() {
        class199 var1 = this.field2998.field3016;
        if (this.field2998 == var1) {
            return null;
        } else {
            var1.method3506();
            return var1;
        }
    }

    @ObfuscatedName("gq.f()Lgt;")
    public class199 method3415() {
        class199 var1 = this.field2998.field3014;
        if (this.field2998 == var1) {
            this.field2999 = null;
            return null;
        } else {
            this.field2999 = var1.field3014;
            return var1;
        }
    }

    @ObfuscatedName("gq.d()Lgt;")
    public class199 method3438() {
        class199 var1 = this.field2998.field3016;
        if (this.field2998 == var1) {
            this.field2999 = null;
            return null;
        } else {
            this.field2999 = var1.field3016;
            return var1;
        }
    }

    @ObfuscatedName("gq.j()Lgt;")
    public class199 method3419() {
        class199 var1 = this.field2999;
        if (this.field2998 == var1) {
            this.field2999 = null;
            return null;
        } else {
            this.field2999 = var1.field3014;
            return var1;
        }
    }

    @ObfuscatedName("gq.x()Lgt;")
    public class199 method3414() {
        class199 var1 = this.field2999;
        if (this.field2998 == var1) {
            this.field2999 = null;
            return null;
        } else {
            this.field2999 = var1.field3016;
            return var1;
        }
    }
}

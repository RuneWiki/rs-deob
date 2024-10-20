package deob;

@ObfuscatedName("gd")
public class class203 {

    @ObfuscatedName("gd.f")
    public class212 field3149 = new class212();

    @ObfuscatedName("gd.e")
    public class212 field3150;

    public class203() {
        this.field3149.field3166 = this.field3149;
        this.field3149.field3168 = this.field3149;
    }

    @ObfuscatedName("gd.f()V")
    public void method3641() {
        while (true) {
            class212 var1 = this.field3149.field3166;
            if (this.field3149 == var1) {
                this.field3150 = null;
                return;
            }
            var1.method3744();
        }
    }

    @ObfuscatedName("gd.e(Lhs;)V")
    public void method3642(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3744();
        }
        arg0.field3168 = this.field3149.field3168;
        arg0.field3166 = this.field3149;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gd.n(Lhs;)V")
    public void method3666(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3744();
        }
        arg0.field3168 = this.field3149;
        arg0.field3166 = this.field3149.field3166;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gd.t(Lhs;Lhs;)V")
    public static void method3644(class212 arg0, class212 arg1) {
        if (arg0.field3168 != null) {
            arg0.method3744();
        }
        arg0.field3168 = arg1.field3168;
        arg0.field3166 = arg1;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gd.v()Lhs;")
    public class212 method3660() {
        class212 var1 = this.field3149.field3166;
        if (this.field3149 == var1) {
            return null;
        } else {
            var1.method3744();
            return var1;
        }
    }

    @ObfuscatedName("gd.b()Lhs;")
    public class212 method3661() {
        class212 var1 = this.field3149.field3168;
        if (this.field3149 == var1) {
            return null;
        } else {
            var1.method3744();
            return var1;
        }
    }

    @ObfuscatedName("gd.m()Lhs;")
    public class212 method3646() {
        class212 var1 = this.field3149.field3166;
        if (this.field3149 == var1) {
            this.field3150 = null;
            return null;
        } else {
            this.field3150 = var1.field3166;
            return var1;
        }
    }

    @ObfuscatedName("gd.k()Lhs;")
    public class212 method3647() {
        class212 var1 = this.field3149.field3168;
        if (this.field3149 == var1) {
            this.field3150 = null;
            return null;
        } else {
            this.field3150 = var1.field3168;
            return var1;
        }
    }

    @ObfuscatedName("gd.c()Lhs;")
    public class212 method3648() {
        class212 var1 = this.field3150;
        if (this.field3149 == var1) {
            this.field3150 = null;
            return null;
        } else {
            this.field3150 = var1.field3166;
            return var1;
        }
    }

    @ObfuscatedName("gd.w()Lhs;")
    public class212 method3649() {
        class212 var1 = this.field3150;
        if (this.field3149 == var1) {
            this.field3150 = null;
            return null;
        } else {
            this.field3150 = var1.field3168;
            return var1;
        }
    }
}

package deob;

@ObfuscatedName("gh")
public class class189 {

    @ObfuscatedName("gh.e")
    public class198 field2946 = new class198();

    @ObfuscatedName("gh.a")
    public class198 field2947;

    public class189() {
        this.field2946.field2962 = this.field2946;
        this.field2946.field2964 = this.field2946;
    }

    @ObfuscatedName("gh.e()V")
    public void method3373() {
        while (true) {
            class198 var1 = this.field2946.field2962;
            if (this.field2946 == var1) {
                this.field2947 = null;
                return;
            }
            var1.method3463();
        }
    }

    @ObfuscatedName("gh.a(Lgm;)V")
    public void method3374(class198 arg0) {
        if (arg0.field2964 != null) {
            arg0.method3463();
        }
        arg0.field2964 = this.field2946.field2964;
        arg0.field2962 = this.field2946;
        arg0.field2964.field2962 = arg0;
        arg0.field2962.field2964 = arg0;
    }

    @ObfuscatedName("gh.l(Lgm;)V")
    public void method3388(class198 arg0) {
        if (arg0.field2964 != null) {
            arg0.method3463();
        }
        arg0.field2964 = this.field2946;
        arg0.field2962 = this.field2946.field2962;
        arg0.field2964.field2962 = arg0;
        arg0.field2962.field2964 = arg0;
    }

    @ObfuscatedName("gh.c(Lgm;Lgm;)V")
    public static void method3372(class198 arg0, class198 arg1) {
        if (arg0.field2964 != null) {
            arg0.method3463();
        }
        arg0.field2964 = arg1.field2964;
        arg0.field2962 = arg1;
        arg0.field2964.field2962 = arg0;
        arg0.field2962.field2964 = arg0;
    }

    @ObfuscatedName("gh.u()Lgm;")
    public class198 method3393() {
        class198 var1 = this.field2946.field2962;
        if (this.field2946 == var1) {
            return null;
        } else {
            var1.method3463();
            return var1;
        }
    }

    @ObfuscatedName("gh.w()Lgm;")
    public class198 method3377() {
        class198 var1 = this.field2946.field2964;
        if (this.field2946 == var1) {
            return null;
        } else {
            var1.method3463();
            return var1;
        }
    }

    @ObfuscatedName("gh.i()Lgm;")
    public class198 method3378() {
        class198 var1 = this.field2946.field2962;
        if (this.field2946 == var1) {
            this.field2947 = null;
            return null;
        } else {
            this.field2947 = var1.field2962;
            return var1;
        }
    }

    @ObfuscatedName("gh.r()Lgm;")
    public class198 method3379() {
        class198 var1 = this.field2946.field2964;
        if (this.field2946 == var1) {
            this.field2947 = null;
            return null;
        } else {
            this.field2947 = var1.field2964;
            return var1;
        }
    }

    @ObfuscatedName("gh.f()Lgm;")
    public class198 method3394() {
        class198 var1 = this.field2947;
        if (this.field2946 == var1) {
            this.field2947 = null;
            return null;
        } else {
            this.field2947 = var1.field2962;
            return var1;
        }
    }

    @ObfuscatedName("gh.g()Lgm;")
    public class198 method3395() {
        class198 var1 = this.field2947;
        if (this.field2946 == var1) {
            this.field2947 = null;
            return null;
        } else {
            this.field2947 = var1.field2964;
            return var1;
        }
    }
}

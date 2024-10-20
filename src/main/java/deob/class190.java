package deob;

@ObfuscatedName("go")
public class class190 {

    @ObfuscatedName("go.p")
    public class199 field2998 = new class199();

    @ObfuscatedName("go.k")
    public class199 field2999;

    public class190() {
        this.field2998.field3014 = this.field2998;
        this.field2998.field3016 = this.field2998;
    }

    @ObfuscatedName("go.p()V")
    public void method3445() {
        while (true) {
            class199 var1 = this.field2998.field3014;
            if (this.field2998 == var1) {
                this.field2999 = null;
                return;
            }
            var1.method3533();
        }
    }

    @ObfuscatedName("go.k(Lgl;)V")
    public void method3437(class199 arg0) {
        if (arg0.field3016 != null) {
            arg0.method3533();
        }
        arg0.field3016 = this.field2998.field3016;
        arg0.field3014 = this.field2998;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
    }

    @ObfuscatedName("go.e(Lgl;)V")
    public void method3438(class199 arg0) {
        if (arg0.field3016 != null) {
            arg0.method3533();
        }
        arg0.field3016 = this.field2998;
        arg0.field3014 = this.field2998.field3014;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
    }

    @ObfuscatedName("go.f(Lgl;Lgl;)V")
    public static void method3439(class199 arg0, class199 arg1) {
        if (arg0.field3016 != null) {
            arg0.method3533();
        }
        arg0.field3016 = arg1.field3016;
        arg0.field3014 = arg1;
        arg0.field3016.field3014 = arg0;
        arg0.field3014.field3016 = arg0;
    }

    @ObfuscatedName("go.w()Lgl;")
    public class199 method3452() {
        class199 var1 = this.field2998.field3014;
        if (this.field2998 == var1) {
            return null;
        } else {
            var1.method3533();
            return var1;
        }
    }

    @ObfuscatedName("go.t()Lgl;")
    public class199 method3440() {
        class199 var1 = this.field2998.field3016;
        if (this.field2998 == var1) {
            return null;
        } else {
            var1.method3533();
            return var1;
        }
    }

    @ObfuscatedName("go.s()Lgl;")
    public class199 method3442() {
        class199 var1 = this.field2998.field3014;
        if (this.field2998 == var1) {
            this.field2999 = null;
            return null;
        } else {
            this.field2999 = var1.field3014;
            return var1;
        }
    }

    @ObfuscatedName("go.c()Lgl;")
    public class199 method3443() {
        class199 var1 = this.field2998.field3016;
        if (this.field2998 == var1) {
            this.field2999 = null;
            return null;
        } else {
            this.field2999 = var1.field3016;
            return var1;
        }
    }

    @ObfuscatedName("go.d()Lgl;")
    public class199 method3444() {
        class199 var1 = this.field2999;
        if (this.field2998 == var1) {
            this.field2999 = null;
            return null;
        } else {
            this.field2999 = var1.field3014;
            return var1;
        }
    }

    @ObfuscatedName("go.v()Lgl;")
    public class199 method3446() {
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

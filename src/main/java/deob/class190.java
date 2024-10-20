package deob;

@ObfuscatedName("ge")
public class class190 {

    @ObfuscatedName("ge.n")
    public class199 field2997 = new class199();

    @ObfuscatedName("ge.w")
    public class199 field2996;

    public class190() {
        this.field2997.field3014 = this.field2997;
        this.field2997.field3012 = this.field2997;
    }

    @ObfuscatedName("ge.n()V")
    public void method3376() {
        while (true) {
            class199 var1 = this.field2997.field3014;
            if (this.field2997 == var1) {
                this.field2996 = null;
                return;
            }
            var1.method3474();
        }
    }

    @ObfuscatedName("ge.w(Lgn;)V")
    public void method3377(class199 arg0) {
        if (arg0.field3012 != null) {
            arg0.method3474();
        }
        arg0.field3012 = this.field2997.field3012;
        arg0.field3014 = this.field2997;
        arg0.field3012.field3014 = arg0;
        arg0.field3014.field3012 = arg0;
    }

    @ObfuscatedName("ge.i(Lgn;)V")
    public void method3378(class199 arg0) {
        if (arg0.field3012 != null) {
            arg0.method3474();
        }
        arg0.field3012 = this.field2997;
        arg0.field3014 = this.field2997.field3014;
        arg0.field3012.field3014 = arg0;
        arg0.field3014.field3012 = arg0;
    }

    @ObfuscatedName("ge.e(Lgn;Lgn;)V")
    public static void method3379(class199 arg0, class199 arg1) {
        if (arg0.field3012 != null) {
            arg0.method3474();
        }
        arg0.field3012 = arg1.field3012;
        arg0.field3014 = arg1;
        arg0.field3012.field3014 = arg0;
        arg0.field3014.field3012 = arg0;
    }

    @ObfuscatedName("ge.h()Lgn;")
    public class199 method3380() {
        class199 var1 = this.field2997.field3014;
        if (this.field2997 == var1) {
            return null;
        } else {
            var1.method3474();
            return var1;
        }
    }

    @ObfuscatedName("ge.q()Lgn;")
    public class199 method3399() {
        class199 var1 = this.field2997.field3012;
        if (this.field2997 == var1) {
            return null;
        } else {
            var1.method3474();
            return var1;
        }
    }

    @ObfuscatedName("ge.l()Lgn;")
    public class199 method3382() {
        class199 var1 = this.field2997.field3014;
        if (this.field2997 == var1) {
            this.field2996 = null;
            return null;
        } else {
            this.field2996 = var1.field3014;
            return var1;
        }
    }

    @ObfuscatedName("ge.c()Lgn;")
    public class199 method3383() {
        class199 var1 = this.field2997.field3012;
        if (this.field2997 == var1) {
            this.field2996 = null;
            return null;
        } else {
            this.field2996 = var1.field3012;
            return var1;
        }
    }

    @ObfuscatedName("ge.f()Lgn;")
    public class199 method3384() {
        class199 var1 = this.field2996;
        if (this.field2997 == var1) {
            this.field2996 = null;
            return null;
        } else {
            this.field2996 = var1.field3014;
            return var1;
        }
    }

    @ObfuscatedName("ge.s()Lgn;")
    public class199 method3390() {
        class199 var1 = this.field2996;
        if (this.field2997 == var1) {
            this.field2996 = null;
            return null;
        } else {
            this.field2996 = var1.field3012;
            return var1;
        }
    }
}

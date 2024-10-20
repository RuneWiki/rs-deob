package deob;

@ObfuscatedName("gq")
public class class199 {

    @ObfuscatedName("gq.h")
    public class208 field3077 = new class208();

    @ObfuscatedName("gq.q")
    public class208 field3078;

    public class199() {
        this.field3077.field3094 = this.field3077;
        this.field3077.field3095 = this.field3077;
    }

    @ObfuscatedName("gq.h()V")
    public void method3608() {
        while (true) {
            class208 var1 = this.field3077.field3094;
            if (this.field3077 == var1) {
                this.field3078 = null;
                return;
            }
            var1.method3711();
        }
    }

    @ObfuscatedName("gq.q(Lgm;)V")
    public void method3609(class208 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3711();
        }
        arg0.field3095 = this.field3077.field3095;
        arg0.field3094 = this.field3077;
        arg0.field3095.field3094 = arg0;
        arg0.field3094.field3095 = arg0;
    }

    @ObfuscatedName("gq.v(Lgm;)V")
    public void method3621(class208 arg0) {
        if (arg0.field3095 != null) {
            arg0.method3711();
        }
        arg0.field3095 = this.field3077;
        arg0.field3094 = this.field3077.field3094;
        arg0.field3095.field3094 = arg0;
        arg0.field3094.field3095 = arg0;
    }

    @ObfuscatedName("gq.n(Lgm;Lgm;)V")
    public static void method3618(class208 arg0, class208 arg1) {
        if (arg0.field3095 != null) {
            arg0.method3711();
        }
        arg0.field3095 = arg1.field3095;
        arg0.field3094 = arg1;
        arg0.field3095.field3094 = arg0;
        arg0.field3094.field3095 = arg0;
    }

    @ObfuscatedName("gq.f()Lgm;")
    public class208 method3628() {
        class208 var1 = this.field3077.field3094;
        if (this.field3077 == var1) {
            return null;
        } else {
            var1.method3711();
            return var1;
        }
    }

    @ObfuscatedName("gq.g()Lgm;")
    public class208 method3619() {
        class208 var1 = this.field3077.field3095;
        if (this.field3077 == var1) {
            return null;
        } else {
            var1.method3711();
            return var1;
        }
    }

    @ObfuscatedName("gq.o()Lgm;")
    public class208 method3611() {
        class208 var1 = this.field3077.field3094;
        if (this.field3077 == var1) {
            this.field3078 = null;
            return null;
        } else {
            this.field3078 = var1.field3094;
            return var1;
        }
    }

    @ObfuscatedName("gq.s()Lgm;")
    public class208 method3607() {
        class208 var1 = this.field3077.field3095;
        if (this.field3077 == var1) {
            this.field3078 = null;
            return null;
        } else {
            this.field3078 = var1.field3095;
            return var1;
        }
    }

    @ObfuscatedName("gq.k()Lgm;")
    public class208 method3616() {
        class208 var1 = this.field3078;
        if (this.field3077 == var1) {
            this.field3078 = null;
            return null;
        } else {
            this.field3078 = var1.field3094;
            return var1;
        }
    }

    @ObfuscatedName("gq.b()Lgm;")
    public class208 method3617() {
        class208 var1 = this.field3078;
        if (this.field3077 == var1) {
            this.field3078 = null;
            return null;
        } else {
            this.field3078 = var1.field3095;
            return var1;
        }
    }
}

package deob;

@ObfuscatedName("gi")
public class class199 {

    @ObfuscatedName("gi.o")
    public class208 field3095 = new class208();

    @ObfuscatedName("gi.e")
    public class208 field3096;

    public class199() {
        this.field3095.field3112 = this.field3095;
        this.field3095.field3111 = this.field3095;
    }

    @ObfuscatedName("gi.o()V")
    public void method3575() {
        while (true) {
            class208 var1 = this.field3095.field3112;
            if (this.field3095 == var1) {
                this.field3096 = null;
                return;
            }
            var1.method3670();
        }
    }

    @ObfuscatedName("gi.e(Lgn;)V")
    public void method3589(class208 arg0) {
        if (arg0.field3111 != null) {
            arg0.method3670();
        }
        arg0.field3111 = this.field3095.field3111;
        arg0.field3112 = this.field3095;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
    }

    @ObfuscatedName("gi.u(Lgn;)V")
    public void method3590(class208 arg0) {
        if (arg0.field3111 != null) {
            arg0.method3670();
        }
        arg0.field3111 = this.field3095;
        arg0.field3112 = this.field3095.field3112;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
    }

    @ObfuscatedName("gi.b(Lgn;Lgn;)V")
    public static void method3574(class208 arg0, class208 arg1) {
        if (arg0.field3111 != null) {
            arg0.method3670();
        }
        arg0.field3111 = arg1.field3111;
        arg0.field3112 = arg1;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
    }

    @ObfuscatedName("gi.p()Lgn;")
    public class208 method3579() {
        class208 var1 = this.field3095.field3112;
        if (this.field3095 == var1) {
            return null;
        } else {
            var1.method3670();
            return var1;
        }
    }

    @ObfuscatedName("gi.s()Lgn;")
    public class208 method3580() {
        class208 var1 = this.field3095.field3111;
        if (this.field3095 == var1) {
            return null;
        } else {
            var1.method3670();
            return var1;
        }
    }

    @ObfuscatedName("gi.y()Lgn;")
    public class208 method3581() {
        class208 var1 = this.field3095.field3112;
        if (this.field3095 == var1) {
            this.field3096 = null;
            return null;
        } else {
            this.field3096 = var1.field3112;
            return var1;
        }
    }

    @ObfuscatedName("gi.t()Lgn;")
    public class208 method3584() {
        class208 var1 = this.field3095.field3111;
        if (this.field3095 == var1) {
            this.field3096 = null;
            return null;
        } else {
            this.field3096 = var1.field3111;
            return var1;
        }
    }

    @ObfuscatedName("gi.w()Lgn;")
    public class208 method3583() {
        class208 var1 = this.field3096;
        if (this.field3095 == var1) {
            this.field3096 = null;
            return null;
        } else {
            this.field3096 = var1.field3112;
            return var1;
        }
    }

    @ObfuscatedName("gi.h()Lgn;")
    public class208 method3586() {
        class208 var1 = this.field3096;
        if (this.field3095 == var1) {
            this.field3096 = null;
            return null;
        } else {
            this.field3096 = var1.field3111;
            return var1;
        }
    }
}

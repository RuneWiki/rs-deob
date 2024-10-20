package deob;

@ObfuscatedName("gr")
public class class199 {

    @ObfuscatedName("gr.j")
    public class208 field3096 = new class208();

    @ObfuscatedName("gr.l")
    public class208 field3095;

    public class199() {
        this.field3096.field3112 = this.field3096;
        this.field3096.field3111 = this.field3096;
    }

    @ObfuscatedName("gr.j()V")
    public void method3522() {
        while (true) {
            class208 var1 = this.field3096.field3112;
            if (this.field3096 == var1) {
                this.field3095 = null;
                return;
            }
            var1.method3608();
        }
    }

    @ObfuscatedName("gr.l(Lgu;)V")
    public void method3523(class208 arg0) {
        if (arg0.field3111 != null) {
            arg0.method3608();
        }
        arg0.field3111 = this.field3096.field3111;
        arg0.field3112 = this.field3096;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
    }

    @ObfuscatedName("gr.a(Lgu;)V")
    public void method3524(class208 arg0) {
        if (arg0.field3111 != null) {
            arg0.method3608();
        }
        arg0.field3111 = this.field3096;
        arg0.field3112 = this.field3096.field3112;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
    }

    @ObfuscatedName("gr.i(Lgu;Lgu;)V")
    public static void method3521(class208 arg0, class208 arg1) {
        if (arg0.field3111 != null) {
            arg0.method3608();
        }
        arg0.field3111 = arg1.field3111;
        arg0.field3112 = arg1;
        arg0.field3111.field3112 = arg0;
        arg0.field3112.field3111 = arg0;
    }

    @ObfuscatedName("gr.f()Lgu;")
    public class208 method3526() {
        class208 var1 = this.field3096.field3112;
        if (this.field3096 == var1) {
            return null;
        } else {
            var1.method3608();
            return var1;
        }
    }

    @ObfuscatedName("gr.m()Lgu;")
    public class208 method3550() {
        class208 var1 = this.field3096.field3111;
        if (this.field3096 == var1) {
            return null;
        } else {
            var1.method3608();
            return var1;
        }
    }

    @ObfuscatedName("gr.o()Lgu;")
    public class208 method3528() {
        class208 var1 = this.field3096.field3112;
        if (this.field3096 == var1) {
            this.field3095 = null;
            return null;
        } else {
            this.field3095 = var1.field3112;
            return var1;
        }
    }

    @ObfuscatedName("gr.h()Lgu;")
    public class208 method3529() {
        class208 var1 = this.field3096.field3111;
        if (this.field3096 == var1) {
            this.field3095 = null;
            return null;
        } else {
            this.field3095 = var1.field3111;
            return var1;
        }
    }

    @ObfuscatedName("gr.n()Lgu;")
    public class208 method3527() {
        class208 var1 = this.field3095;
        if (this.field3096 == var1) {
            this.field3095 = null;
            return null;
        } else {
            this.field3095 = var1.field3112;
            return var1;
        }
    }

    @ObfuscatedName("gr.k()Lgu;")
    public class208 method3531() {
        class208 var1 = this.field3095;
        if (this.field3096 == var1) {
            this.field3095 = null;
            return null;
        } else {
            this.field3095 = var1.field3111;
            return var1;
        }
    }
}

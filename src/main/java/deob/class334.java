package deob;

@ObfuscatedName("lo")
public class class334 {

    @ObfuscatedName("lo.c")
    public class410 field4123 = new class410();

    @ObfuscatedName("lo.v")
    public class410 field4124;

    public class334() {
        this.field4123.field4463 = this.field4123;
        this.field4123.field4464 = this.field4123;
    }

    @ObfuscatedName("lo.c()V")
    public void method5560() {
        while (true) {
            class410 var1 = this.field4123.field4463;
            if (this.field4123 == var1) {
                this.field4124 = null;
                return;
            }
            var1.method6497();
        }
    }

    @ObfuscatedName("lo.v(Loh;)V")
    public void method5530(class410 arg0) {
        if (arg0.field4464 != null) {
            arg0.method6497();
        }
        arg0.field4464 = this.field4123.field4464;
        arg0.field4463 = this.field4123;
        arg0.field4464.field4463 = arg0;
        arg0.field4463.field4464 = arg0;
    }

    @ObfuscatedName("lo.q(Loh;)V")
    public void method5531(class410 arg0) {
        if (arg0.field4464 != null) {
            arg0.method6497();
        }
        arg0.field4464 = this.field4123;
        arg0.field4463 = this.field4123.field4463;
        arg0.field4464.field4463 = arg0;
        arg0.field4463.field4464 = arg0;
    }

    @ObfuscatedName("lo.f(Loh;Loh;)V")
    public static void method5557(class410 arg0, class410 arg1) {
        if (arg0.field4464 != null) {
            arg0.method6497();
        }
        arg0.field4464 = arg1.field4464;
        arg0.field4463 = arg1;
        arg0.field4464.field4463 = arg0;
        arg0.field4463.field4464 = arg0;
    }

    @ObfuscatedName("lo.j()Loh;")
    public class410 method5533() {
        class410 var1 = this.field4123.field4463;
        if (this.field4123 == var1) {
            return null;
        } else {
            var1.method6497();
            return var1;
        }
    }

    @ObfuscatedName("lo.e()Loh;")
    public class410 method5534() {
        class410 var1 = this.field4123.field4464;
        if (this.field4123 == var1) {
            return null;
        } else {
            var1.method6497();
            return var1;
        }
    }

    @ObfuscatedName("lo.g()Loh;")
    public class410 method5535() {
        class410 var1 = this.field4123.field4463;
        if (this.field4123 == var1) {
            this.field4124 = null;
            return null;
        } else {
            this.field4124 = var1.field4463;
            return var1;
        }
    }

    @ObfuscatedName("lo.w()Loh;")
    public class410 method5536() {
        class410 var1 = this.field4123.field4464;
        if (this.field4123 == var1) {
            this.field4124 = null;
            return null;
        } else {
            this.field4124 = var1.field4464;
            return var1;
        }
    }

    @ObfuscatedName("lo.y()Loh;")
    public class410 method5537() {
        class410 var1 = this.field4124;
        if (this.field4123 == var1) {
            this.field4124 = null;
            return null;
        } else {
            this.field4124 = var1.field4463;
            return var1;
        }
    }

    @ObfuscatedName("lo.i()Loh;")
    public class410 method5547() {
        class410 var1 = this.field4124;
        if (this.field4123 == var1) {
            this.field4124 = null;
            return null;
        } else {
            this.field4124 = var1.field4464;
            return var1;
        }
    }
}

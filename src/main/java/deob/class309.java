package deob;

@ObfuscatedName("kn")
public class class309 {

    @ObfuscatedName("kn.i")
    public class370 field3812 = new class370();

    @ObfuscatedName("kn.w")
    public class370 field3811;

    public class309() {
        this.field3812.field4074 = this.field3812;
        this.field3812.field4076 = this.field3812;
    }

    @ObfuscatedName("kn.i()V")
    public void method4989() {
        while (true) {
            class370 var1 = this.field3812.field4074;
            if (this.field3812 == var1) {
                this.field3811 = null;
                return;
            }
            var1.method5752();
        }
    }

    @ObfuscatedName("kn.w(Lns;)V")
    public void method4980(class370 arg0) {
        if (arg0.field4076 != null) {
            arg0.method5752();
        }
        arg0.field4076 = this.field3812.field4076;
        arg0.field4074 = this.field3812;
        arg0.field4076.field4074 = arg0;
        arg0.field4074.field4076 = arg0;
    }

    @ObfuscatedName("kn.s(Lns;)V")
    public void method4983(class370 arg0) {
        if (arg0.field4076 != null) {
            arg0.method5752();
        }
        arg0.field4076 = this.field3812;
        arg0.field4074 = this.field3812.field4074;
        arg0.field4076.field4074 = arg0;
        arg0.field4074.field4076 = arg0;
    }

    @ObfuscatedName("kn.a(Lns;Lns;)V")
    public static void method4982(class370 arg0, class370 arg1) {
        if (arg0.field4076 != null) {
            arg0.method5752();
        }
        arg0.field4076 = arg1.field4076;
        arg0.field4074 = arg1;
        arg0.field4076.field4074 = arg0;
        arg0.field4074.field4076 = arg0;
    }

    @ObfuscatedName("kn.o()Lns;")
    public class370 method4994() {
        class370 var1 = this.field3812.field4074;
        if (this.field3812 == var1) {
            return null;
        } else {
            var1.method5752();
            return var1;
        }
    }

    @ObfuscatedName("kn.g()Lns;")
    public class370 method4984() {
        class370 var1 = this.field3812.field4076;
        if (this.field3812 == var1) {
            return null;
        } else {
            var1.method5752();
            return var1;
        }
    }

    @ObfuscatedName("kn.e()Lns;")
    public class370 method4981() {
        class370 var1 = this.field3812.field4074;
        if (this.field3812 == var1) {
            this.field3811 = null;
            return null;
        } else {
            this.field3811 = var1.field4074;
            return var1;
        }
    }

    @ObfuscatedName("kn.p()Lns;")
    public class370 method5004() {
        class370 var1 = this.field3812.field4076;
        if (this.field3812 == var1) {
            this.field3811 = null;
            return null;
        } else {
            this.field3811 = var1.field4076;
            return var1;
        }
    }

    @ObfuscatedName("kn.j()Lns;")
    public class370 method4987() {
        class370 var1 = this.field3811;
        if (this.field3812 == var1) {
            this.field3811 = null;
            return null;
        } else {
            this.field3811 = var1.field4074;
            return var1;
        }
    }

    @ObfuscatedName("kn.b()Lns;")
    public class370 method4988() {
        class370 var1 = this.field3811;
        if (this.field3812 == var1) {
            this.field3811 = null;
            return null;
        } else {
            this.field3811 = var1.field4076;
            return var1;
        }
    }
}

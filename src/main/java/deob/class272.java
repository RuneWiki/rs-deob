package deob;

@ObfuscatedName("ju")
public class class272 {

    @ObfuscatedName("ju.f")
    public class351 field3382 = new class351();

    @ObfuscatedName("ju.o")
    public class351 field3381;

    public class272() {
        this.field3382.field3942 = this.field3382;
        this.field3382.field3943 = this.field3382;
    }

    @ObfuscatedName("ju.f()V")
    public void method4154() {
        while (true) {
            class351 var1 = this.field3382.field3942;
            if (this.field3382 == var1) {
                this.field3381 = null;
                return;
            }
            var1.method5354();
        }
    }

    @ObfuscatedName("ju.o(Lmh;)V")
    public void method4155(class351 arg0) {
        if (arg0.field3943 != null) {
            arg0.method5354();
        }
        arg0.field3943 = this.field3382.field3943;
        arg0.field3942 = this.field3382;
        arg0.field3943.field3942 = arg0;
        arg0.field3942.field3943 = arg0;
    }

    @ObfuscatedName("ju.u(Lmh;)V")
    public void method4156(class351 arg0) {
        if (arg0.field3943 != null) {
            arg0.method5354();
        }
        arg0.field3943 = this.field3382;
        arg0.field3942 = this.field3382.field3942;
        arg0.field3943.field3942 = arg0;
        arg0.field3942.field3943 = arg0;
    }

    @ObfuscatedName("ju.p(Lmh;Lmh;)V")
    public static void method4157(class351 arg0, class351 arg1) {
        if (arg0.field3943 != null) {
            arg0.method5354();
        }
        arg0.field3943 = arg1.field3943;
        arg0.field3942 = arg1;
        arg0.field3943.field3942 = arg0;
        arg0.field3942.field3943 = arg0;
    }

    @ObfuscatedName("ju.b()Lmh;")
    public class351 method4158() {
        class351 var1 = this.field3382.field3942;
        if (this.field3382 == var1) {
            return null;
        } else {
            var1.method5354();
            return var1;
        }
    }

    @ObfuscatedName("ju.e()Lmh;")
    public class351 method4175() {
        class351 var1 = this.field3382.field3943;
        if (this.field3382 == var1) {
            return null;
        } else {
            var1.method5354();
            return var1;
        }
    }

    @ObfuscatedName("ju.k()Lmh;")
    public class351 method4160() {
        class351 var1 = this.field3382.field3942;
        if (this.field3382 == var1) {
            this.field3381 = null;
            return null;
        } else {
            this.field3381 = var1.field3942;
            return var1;
        }
    }

    @ObfuscatedName("ju.g()Lmh;")
    public class351 method4188() {
        class351 var1 = this.field3382.field3943;
        if (this.field3382 == var1) {
            this.field3381 = null;
            return null;
        } else {
            this.field3381 = var1.field3943;
            return var1;
        }
    }

    @ObfuscatedName("ju.h()Lmh;")
    public class351 method4182() {
        class351 var1 = this.field3381;
        if (this.field3382 == var1) {
            this.field3381 = null;
            return null;
        } else {
            this.field3381 = var1.field3942;
            return var1;
        }
    }

    @ObfuscatedName("ju.n()Lmh;")
    public class351 method4162() {
        class351 var1 = this.field3381;
        if (this.field3382 == var1) {
            this.field3381 = null;
            return null;
        } else {
            this.field3381 = var1.field3943;
            return var1;
        }
    }
}

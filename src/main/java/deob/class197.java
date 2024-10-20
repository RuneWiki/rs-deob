package deob;

@ObfuscatedName("gt")
public class class197 {

    @ObfuscatedName("gt.s")
    public class196 field2489 = new class196();

    @ObfuscatedName("gt.c")
    public class196 field2490;

    public class197() {
        this.field2489.field2486 = this.field2489;
        this.field2489.field2488 = this.field2489;
    }

    @ObfuscatedName("gt.s()V")
    public void method3409() {
        while (true) {
            class196 var1 = this.field2489.field2486;
            if (this.field2489 == var1) {
                this.field2490 = null;
                return;
            }
            var1.method3372();
        }
    }

    @ObfuscatedName("gt.c(Lgr;)V")
    public void method3394(class196 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3372();
        }
        arg0.field2488 = this.field2489.field2488;
        arg0.field2486 = this.field2489;
        arg0.field2488.field2486 = arg0;
        arg0.field2486.field2488 = arg0;
    }

    @ObfuscatedName("gt.f(Lgr;)V")
    public void method3379(class196 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3372();
        }
        arg0.field2488 = this.field2489;
        arg0.field2486 = this.field2489.field2486;
        arg0.field2488.field2486 = arg0;
        arg0.field2486.field2488 = arg0;
    }

    @ObfuscatedName("gt.m(Lgr;Lgr;)V")
    public static void method3380(class196 arg0, class196 arg1) {
        if (arg0.field2488 != null) {
            arg0.method3372();
        }
        arg0.field2488 = arg1.field2488;
        arg0.field2486 = arg1;
        arg0.field2488.field2486 = arg0;
        arg0.field2486.field2488 = arg0;
    }

    @ObfuscatedName("gt.h()Lgr;")
    public class196 method3381() {
        class196 var1 = this.field2489.field2486;
        if (this.field2489 == var1) {
            return null;
        } else {
            var1.method3372();
            return var1;
        }
    }

    @ObfuscatedName("gt.t()Lgr;")
    public class196 method3382() {
        class196 var1 = this.field2489.field2488;
        if (this.field2489 == var1) {
            return null;
        } else {
            var1.method3372();
            return var1;
        }
    }

    @ObfuscatedName("gt.p()Lgr;")
    public class196 method3389() {
        class196 var1 = this.field2489.field2486;
        if (this.field2489 == var1) {
            this.field2490 = null;
            return null;
        } else {
            this.field2490 = var1.field2486;
            return var1;
        }
    }

    @ObfuscatedName("gt.d()Lgr;")
    public class196 method3410() {
        class196 var1 = this.field2489.field2488;
        if (this.field2489 == var1) {
            this.field2490 = null;
            return null;
        } else {
            this.field2490 = var1.field2488;
            return var1;
        }
    }

    @ObfuscatedName("gt.n()Lgr;")
    public class196 method3385() {
        class196 var1 = this.field2490;
        if (this.field2489 == var1) {
            this.field2490 = null;
            return null;
        } else {
            this.field2490 = var1.field2486;
            return var1;
        }
    }

    @ObfuscatedName("gt.z()Lgr;")
    public class196 method3386() {
        class196 var1 = this.field2490;
        if (this.field2489 == var1) {
            this.field2490 = null;
            return null;
        } else {
            this.field2490 = var1.field2488;
            return var1;
        }
    }
}

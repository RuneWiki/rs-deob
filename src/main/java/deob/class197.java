package deob;

@ObfuscatedName("gu")
public class class197 {

    @ObfuscatedName("gu.w")
    public class196 field2491 = new class196();

    @ObfuscatedName("gu.o")
    public class196 field2492;

    public class197() {
        this.field2491.field2489 = this.field2491;
        this.field2491.field2488 = this.field2491;
    }

    @ObfuscatedName("gu.w()V")
    public void method3323() {
        while (true) {
            class196 var1 = this.field2491.field2489;
            if (this.field2491 == var1) {
                this.field2492 = null;
                return;
            }
            var1.method3294();
        }
    }

    @ObfuscatedName("gu.o(Lgd;)V")
    public void method3299(class196 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3294();
        }
        arg0.field2488 = this.field2491.field2488;
        arg0.field2489 = this.field2491;
        arg0.field2488.field2489 = arg0;
        arg0.field2489.field2488 = arg0;
    }

    @ObfuscatedName("gu.x(Lgd;)V")
    public void method3300(class196 arg0) {
        if (arg0.field2488 != null) {
            arg0.method3294();
        }
        arg0.field2488 = this.field2491;
        arg0.field2489 = this.field2491.field2489;
        arg0.field2488.field2489 = arg0;
        arg0.field2489.field2488 = arg0;
    }

    @ObfuscatedName("gu.k(Lgd;Lgd;)V")
    public static void method3301(class196 arg0, class196 arg1) {
        if (arg0.field2488 != null) {
            arg0.method3294();
        }
        arg0.field2488 = arg1.field2488;
        arg0.field2489 = arg1;
        arg0.field2488.field2489 = arg0;
        arg0.field2489.field2488 = arg0;
    }

    @ObfuscatedName("gu.f()Lgd;")
    public class196 method3302() {
        class196 var1 = this.field2491.field2489;
        if (this.field2491 == var1) {
            return null;
        } else {
            var1.method3294();
            return var1;
        }
    }

    @ObfuscatedName("gu.i()Lgd;")
    public class196 method3320() {
        class196 var1 = this.field2491.field2488;
        if (this.field2491 == var1) {
            return null;
        } else {
            var1.method3294();
            return var1;
        }
    }

    @ObfuscatedName("gu.j()Lgd;")
    public class196 method3304() {
        class196 var1 = this.field2491.field2489;
        if (this.field2491 == var1) {
            this.field2492 = null;
            return null;
        } else {
            this.field2492 = var1.field2489;
            return var1;
        }
    }

    @ObfuscatedName("gu.m()Lgd;")
    public class196 method3305() {
        class196 var1 = this.field2491.field2488;
        if (this.field2491 == var1) {
            this.field2492 = null;
            return null;
        } else {
            this.field2492 = var1.field2488;
            return var1;
        }
    }

    @ObfuscatedName("gu.u()Lgd;")
    public class196 method3306() {
        class196 var1 = this.field2492;
        if (this.field2491 == var1) {
            this.field2492 = null;
            return null;
        } else {
            this.field2492 = var1.field2489;
            return var1;
        }
    }

    @ObfuscatedName("gu.h()Lgd;")
    public class196 method3317() {
        class196 var1 = this.field2492;
        if (this.field2491 == var1) {
            this.field2492 = null;
            return null;
        } else {
            this.field2492 = var1.field2488;
            return var1;
        }
    }
}

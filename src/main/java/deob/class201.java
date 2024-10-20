package deob;

@ObfuscatedName("gg")
public class class201 {

    @ObfuscatedName("gg.b")
    public class200 field2558 = new class200();

    @ObfuscatedName("gg.s")
    public class200 field2559;

    public class201() {
        this.field2558.field2556 = this.field2558;
        this.field2558.field2555 = this.field2558;
    }

    @ObfuscatedName("gg.b()V")
    public void method3399() {
        while (true) {
            class200 var1 = this.field2558.field2556;
            if (this.field2558 == var1) {
                this.field2559 = null;
                return;
            }
            var1.method3392();
        }
    }

    @ObfuscatedName("gg.s(Lgt;)V")
    public void method3400(class200 arg0) {
        if (arg0.field2555 != null) {
            arg0.method3392();
        }
        arg0.field2555 = this.field2558.field2555;
        arg0.field2556 = this.field2558;
        arg0.field2555.field2556 = arg0;
        arg0.field2556.field2555 = arg0;
    }

    @ObfuscatedName("gg.r(Lgt;)V")
    public void method3401(class200 arg0) {
        if (arg0.field2555 != null) {
            arg0.method3392();
        }
        arg0.field2555 = this.field2558;
        arg0.field2556 = this.field2558.field2556;
        arg0.field2555.field2556 = arg0;
        arg0.field2556.field2555 = arg0;
    }

    @ObfuscatedName("gg.g(Lgt;Lgt;)V")
    public static void method3427(class200 arg0, class200 arg1) {
        if (arg0.field2555 != null) {
            arg0.method3392();
        }
        arg0.field2555 = arg1.field2555;
        arg0.field2556 = arg1;
        arg0.field2555.field2556 = arg0;
        arg0.field2556.field2555 = arg0;
    }

    @ObfuscatedName("gg.x()Lgt;")
    public class200 method3403() {
        class200 var1 = this.field2558.field2556;
        if (this.field2558 == var1) {
            return null;
        } else {
            var1.method3392();
            return var1;
        }
    }

    @ObfuscatedName("gg.f()Lgt;")
    public class200 method3420() {
        class200 var1 = this.field2558.field2555;
        if (this.field2558 == var1) {
            return null;
        } else {
            var1.method3392();
            return var1;
        }
    }

    @ObfuscatedName("gg.u()Lgt;")
    public class200 method3405() {
        class200 var1 = this.field2558.field2556;
        if (this.field2558 == var1) {
            this.field2559 = null;
            return null;
        } else {
            this.field2559 = var1.field2556;
            return var1;
        }
    }

    @ObfuscatedName("gg.t()Lgt;")
    public class200 method3406() {
        class200 var1 = this.field2558.field2555;
        if (this.field2558 == var1) {
            this.field2559 = null;
            return null;
        } else {
            this.field2559 = var1.field2555;
            return var1;
        }
    }

    @ObfuscatedName("gg.k()Lgt;")
    public class200 method3414() {
        class200 var1 = this.field2559;
        if (this.field2558 == var1) {
            this.field2559 = null;
            return null;
        } else {
            this.field2559 = var1.field2556;
            return var1;
        }
    }

    @ObfuscatedName("gg.n()Lgt;")
    public class200 method3408() {
        class200 var1 = this.field2559;
        if (this.field2558 == var1) {
            this.field2559 = null;
            return null;
        } else {
            this.field2559 = var1.field2555;
            return var1;
        }
    }
}

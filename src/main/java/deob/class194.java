package deob;

@ObfuscatedName("gt")
public class class194 {

    @ObfuscatedName("gt.a")
    public class193 field2468 = new class193();

    @ObfuscatedName("gt.j")
    public class193 field2469;

    public class194() {
        this.field2468.field2466 = this.field2468;
        this.field2468.field2465 = this.field2468;
    }

    @ObfuscatedName("gt.a()V")
    public void method3319() {
        while (true) {
            class193 var1 = this.field2468.field2466;
            if (this.field2468 == var1) {
                this.field2469 = null;
                return;
            }
            var1.method3308();
        }
    }

    @ObfuscatedName("gt.j(Lge;)V")
    public void method3320(class193 arg0) {
        if (arg0.field2465 != null) {
            arg0.method3308();
        }
        arg0.field2465 = this.field2468.field2465;
        arg0.field2466 = this.field2468;
        arg0.field2465.field2466 = arg0;
        arg0.field2466.field2465 = arg0;
    }

    @ObfuscatedName("gt.n(Lge;)V")
    public void method3341(class193 arg0) {
        if (arg0.field2465 != null) {
            arg0.method3308();
        }
        arg0.field2465 = this.field2468;
        arg0.field2466 = this.field2468.field2466;
        arg0.field2465.field2466 = arg0;
        arg0.field2466.field2465 = arg0;
    }

    @ObfuscatedName("gt.r(Lge;Lge;)V")
    public static void method3322(class193 arg0, class193 arg1) {
        if (arg0.field2465 != null) {
            arg0.method3308();
        }
        arg0.field2465 = arg1.field2465;
        arg0.field2466 = arg1;
        arg0.field2465.field2466 = arg0;
        arg0.field2466.field2465 = arg0;
    }

    @ObfuscatedName("gt.v()Lge;")
    public class193 method3323() {
        class193 var1 = this.field2468.field2466;
        if (this.field2468 == var1) {
            return null;
        } else {
            var1.method3308();
            return var1;
        }
    }

    @ObfuscatedName("gt.e()Lge;")
    public class193 method3339() {
        class193 var1 = this.field2468.field2465;
        if (this.field2468 == var1) {
            return null;
        } else {
            var1.method3308();
            return var1;
        }
    }

    @ObfuscatedName("gt.l()Lge;")
    public class193 method3318() {
        class193 var1 = this.field2468.field2466;
        if (this.field2468 == var1) {
            this.field2469 = null;
            return null;
        } else {
            this.field2469 = var1.field2466;
            return var1;
        }
    }

    @ObfuscatedName("gt.s()Lge;")
    public class193 method3336() {
        class193 var1 = this.field2468.field2465;
        if (this.field2468 == var1) {
            this.field2469 = null;
            return null;
        } else {
            this.field2469 = var1.field2465;
            return var1;
        }
    }

    @ObfuscatedName("gt.w()Lge;")
    public class193 method3338() {
        class193 var1 = this.field2469;
        if (this.field2468 == var1) {
            this.field2469 = null;
            return null;
        } else {
            this.field2469 = var1.field2466;
            return var1;
        }
    }

    @ObfuscatedName("gt.p()Lge;")
    public class193 method3328() {
        class193 var1 = this.field2469;
        if (this.field2468 == var1) {
            this.field2469 = null;
            return null;
        } else {
            this.field2469 = var1.field2465;
            return var1;
        }
    }
}

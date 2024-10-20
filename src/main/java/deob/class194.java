package deob;

@ObfuscatedName("gq")
public class class194 {

    @ObfuscatedName("gq.i")
    public class193 field2470 = new class193();

    @ObfuscatedName("gq.h")
    public class193 field2469;

    public class194() {
        this.field2470.field2468 = this.field2470;
        this.field2470.field2466 = this.field2470;
    }

    @ObfuscatedName("gq.i()V")
    public void method3372() {
        while (true) {
            class193 var1 = this.field2470.field2468;
            if (this.field2470 == var1) {
                this.field2469 = null;
                return;
            }
            var1.method3364();
        }
    }

    @ObfuscatedName("gq.h(Lgn;)V")
    public void method3371(class193 arg0) {
        if (arg0.field2466 != null) {
            arg0.method3364();
        }
        arg0.field2466 = this.field2470.field2466;
        arg0.field2468 = this.field2470;
        arg0.field2466.field2468 = arg0;
        arg0.field2468.field2466 = arg0;
    }

    @ObfuscatedName("gq.u(Lgn;)V")
    public void method3402(class193 arg0) {
        if (arg0.field2466 != null) {
            arg0.method3364();
        }
        arg0.field2466 = this.field2470;
        arg0.field2468 = this.field2470.field2468;
        arg0.field2466.field2468 = arg0;
        arg0.field2468.field2466 = arg0;
    }

    @ObfuscatedName("gq.q(Lgn;Lgn;)V")
    public static void method3389(class193 arg0, class193 arg1) {
        if (arg0.field2466 != null) {
            arg0.method3364();
        }
        arg0.field2466 = arg1.field2466;
        arg0.field2468 = arg1;
        arg0.field2466.field2468 = arg0;
        arg0.field2468.field2466 = arg0;
    }

    @ObfuscatedName("gq.g()Lgn;")
    public class193 method3374() {
        class193 var1 = this.field2470.field2468;
        if (this.field2470 == var1) {
            return null;
        } else {
            var1.method3364();
            return var1;
        }
    }

    @ObfuscatedName("gq.v()Lgn;")
    public class193 method3375() {
        class193 var1 = this.field2470.field2466;
        if (this.field2470 == var1) {
            return null;
        } else {
            var1.method3364();
            return var1;
        }
    }

    @ObfuscatedName("gq.t()Lgn;")
    public class193 method3376() {
        class193 var1 = this.field2470.field2468;
        if (this.field2470 == var1) {
            this.field2469 = null;
            return null;
        } else {
            this.field2469 = var1.field2468;
            return var1;
        }
    }

    @ObfuscatedName("gq.p()Lgn;")
    public class193 method3382() {
        class193 var1 = this.field2470.field2466;
        if (this.field2470 == var1) {
            this.field2469 = null;
            return null;
        } else {
            this.field2469 = var1.field2466;
            return var1;
        }
    }

    @ObfuscatedName("gq.l()Lgn;")
    public class193 method3377() {
        class193 var1 = this.field2469;
        if (this.field2470 == var1) {
            this.field2469 = null;
            return null;
        } else {
            this.field2469 = var1.field2468;
            return var1;
        }
    }

    @ObfuscatedName("gq.a()Lgn;")
    public class193 method3378() {
        class193 var1 = this.field2469;
        if (this.field2470 == var1) {
            this.field2469 = null;
            return null;
        } else {
            this.field2469 = var1.field2466;
            return var1;
        }
    }
}

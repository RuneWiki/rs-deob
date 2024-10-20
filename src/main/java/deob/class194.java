package deob;

@ObfuscatedName("gz")
public class class194 {

    @ObfuscatedName("gz.w")
    public class193 field2467 = new class193();

    @ObfuscatedName("gz.s")
    public class193 field2468;

    public class194() {
        this.field2467.field2465 = this.field2467;
        this.field2467.field2466 = this.field2467;
    }

    @ObfuscatedName("gz.w()V")
    public void method3428() {
        while (true) {
            class193 var1 = this.field2467.field2465;
            if (this.field2467 == var1) {
                this.field2468 = null;
                return;
            }
            var1.method3425();
        }
    }

    @ObfuscatedName("gz.s(Lgd;)V")
    public void method3429(class193 arg0) {
        if (arg0.field2466 != null) {
            arg0.method3425();
        }
        arg0.field2466 = this.field2467.field2466;
        arg0.field2465 = this.field2467;
        arg0.field2466.field2465 = arg0;
        arg0.field2465.field2466 = arg0;
    }

    @ObfuscatedName("gz.q(Lgd;)V")
    public void method3430(class193 arg0) {
        if (arg0.field2466 != null) {
            arg0.method3425();
        }
        arg0.field2466 = this.field2467;
        arg0.field2465 = this.field2467.field2465;
        arg0.field2466.field2465 = arg0;
        arg0.field2465.field2466 = arg0;
    }

    @ObfuscatedName("gz.o(Lgd;Lgd;)V")
    public static void method3431(class193 arg0, class193 arg1) {
        if (arg0.field2466 != null) {
            arg0.method3425();
        }
        arg0.field2466 = arg1.field2466;
        arg0.field2465 = arg1;
        arg0.field2466.field2465 = arg0;
        arg0.field2465.field2466 = arg0;
    }

    @ObfuscatedName("gz.g()Lgd;")
    public class193 method3432() {
        class193 var1 = this.field2467.field2465;
        if (this.field2467 == var1) {
            return null;
        } else {
            var1.method3425();
            return var1;
        }
    }

    @ObfuscatedName("gz.v()Lgd;")
    public class193 method3433() {
        class193 var1 = this.field2467.field2466;
        if (this.field2467 == var1) {
            return null;
        } else {
            var1.method3425();
            return var1;
        }
    }

    @ObfuscatedName("gz.p()Lgd;")
    public class193 method3427() {
        class193 var1 = this.field2467.field2465;
        if (this.field2467 == var1) {
            this.field2468 = null;
            return null;
        } else {
            this.field2468 = var1.field2465;
            return var1;
        }
    }

    @ObfuscatedName("gz.e()Lgd;")
    public class193 method3439() {
        class193 var1 = this.field2467.field2466;
        if (this.field2467 == var1) {
            this.field2468 = null;
            return null;
        } else {
            this.field2468 = var1.field2466;
            return var1;
        }
    }

    @ObfuscatedName("gz.d()Lgd;")
    public class193 method3435() {
        class193 var1 = this.field2468;
        if (this.field2467 == var1) {
            this.field2468 = null;
            return null;
        } else {
            this.field2468 = var1.field2465;
            return var1;
        }
    }

    @ObfuscatedName("gz.x()Lgd;")
    public class193 method3437() {
        class193 var1 = this.field2468;
        if (this.field2467 == var1) {
            this.field2468 = null;
            return null;
        } else {
            this.field2468 = var1.field2466;
            return var1;
        }
    }
}

package deob;

@ObfuscatedName("gs")
public class class194 {

    @ObfuscatedName("gs.d")
    public class193 field2442 = new class193();

    @ObfuscatedName("gs.q")
    public class193 field2443;

    public class194() {
        this.field2442.field2440 = this.field2442;
        this.field2442.field2439 = this.field2442;
    }

    @ObfuscatedName("gs.d()V")
    public void method3347() {
        while (true) {
            class193 var1 = this.field2442.field2440;
            if (this.field2442 == var1) {
                this.field2443 = null;
                return;
            }
            var1.method3312();
        }
    }

    @ObfuscatedName("gs.q(Lgm;)V")
    public void method3318(class193 arg0) {
        if (arg0.field2439 != null) {
            arg0.method3312();
        }
        arg0.field2439 = this.field2442.field2439;
        arg0.field2440 = this.field2442;
        arg0.field2439.field2440 = arg0;
        arg0.field2440.field2439 = arg0;
    }

    @ObfuscatedName("gs.x(Lgm;)V")
    public void method3317(class193 arg0) {
        if (arg0.field2439 != null) {
            arg0.method3312();
        }
        arg0.field2439 = this.field2442;
        arg0.field2440 = this.field2442.field2440;
        arg0.field2439.field2440 = arg0;
        arg0.field2440.field2439 = arg0;
    }

    @ObfuscatedName("gs.y(Lgm;Lgm;)V")
    public static void method3320(class193 arg0, class193 arg1) {
        if (arg0.field2439 != null) {
            arg0.method3312();
        }
        arg0.field2439 = arg1.field2439;
        arg0.field2440 = arg1;
        arg0.field2439.field2440 = arg0;
        arg0.field2440.field2439 = arg0;
    }

    @ObfuscatedName("gs.e()Lgm;")
    public class193 method3334() {
        class193 var1 = this.field2442.field2440;
        if (this.field2442 == var1) {
            return null;
        } else {
            var1.method3312();
            return var1;
        }
    }

    @ObfuscatedName("gs.f()Lgm;")
    public class193 method3322() {
        class193 var1 = this.field2442.field2439;
        if (this.field2442 == var1) {
            return null;
        } else {
            var1.method3312();
            return var1;
        }
    }

    @ObfuscatedName("gs.v()Lgm;")
    public class193 method3323() {
        class193 var1 = this.field2442.field2440;
        if (this.field2442 == var1) {
            this.field2443 = null;
            return null;
        } else {
            this.field2443 = var1.field2440;
            return var1;
        }
    }

    @ObfuscatedName("gs.t()Lgm;")
    public class193 method3337() {
        class193 var1 = this.field2442.field2439;
        if (this.field2442 == var1) {
            this.field2443 = null;
            return null;
        } else {
            this.field2443 = var1.field2439;
            return var1;
        }
    }

    @ObfuscatedName("gs.i()Lgm;")
    public class193 method3325() {
        class193 var1 = this.field2443;
        if (this.field2442 == var1) {
            this.field2443 = null;
            return null;
        } else {
            this.field2443 = var1.field2440;
            return var1;
        }
    }

    @ObfuscatedName("gs.r()Lgm;")
    public class193 method3326() {
        class193 var1 = this.field2443;
        if (this.field2442 == var1) {
            this.field2443 = null;
            return null;
        } else {
            this.field2443 = var1.field2439;
            return var1;
        }
    }
}

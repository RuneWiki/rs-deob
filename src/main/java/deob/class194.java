package deob;

@ObfuscatedName("gw")
public class class194 {

    @ObfuscatedName("gw.i")
    public class193 field2477 = new class193();

    @ObfuscatedName("gw.w")
    public class193 field2476;

    public class194() {
        this.field2477.field2474 = this.field2477;
        this.field2477.field2475 = this.field2477;
    }

    @ObfuscatedName("gw.i()V")
    public void method3301() {
        while (true) {
            class193 var1 = this.field2477.field2474;
            if (this.field2477 == var1) {
                this.field2476 = null;
                return;
            }
            var1.method3290();
        }
    }

    @ObfuscatedName("gw.w(Lgm;)V")
    public void method3322(class193 arg0) {
        if (arg0.field2475 != null) {
            arg0.method3290();
        }
        arg0.field2475 = this.field2477.field2475;
        arg0.field2474 = this.field2477;
        arg0.field2475.field2474 = arg0;
        arg0.field2474.field2475 = arg0;
    }

    @ObfuscatedName("gw.a(Lgm;)V")
    public void method3299(class193 arg0) {
        if (arg0.field2475 != null) {
            arg0.method3290();
        }
        arg0.field2475 = this.field2477;
        arg0.field2474 = this.field2477.field2474;
        arg0.field2475.field2474 = arg0;
        arg0.field2474.field2475 = arg0;
    }

    @ObfuscatedName("gw.t(Lgm;Lgm;)V")
    public static void method3300(class193 arg0, class193 arg1) {
        if (arg0.field2475 != null) {
            arg0.method3290();
        }
        arg0.field2475 = arg1.field2475;
        arg0.field2474 = arg1;
        arg0.field2475.field2474 = arg0;
        arg0.field2474.field2475 = arg0;
    }

    @ObfuscatedName("gw.s()Lgm;")
    public class193 method3306() {
        class193 var1 = this.field2477.field2474;
        if (this.field2477 == var1) {
            return null;
        } else {
            var1.method3290();
            return var1;
        }
    }

    @ObfuscatedName("gw.r()Lgm;")
    public class193 method3302() {
        class193 var1 = this.field2477.field2475;
        if (this.field2477 == var1) {
            return null;
        } else {
            var1.method3290();
            return var1;
        }
    }

    @ObfuscatedName("gw.v()Lgm;")
    public class193 method3303() {
        class193 var1 = this.field2477.field2474;
        if (this.field2477 == var1) {
            this.field2476 = null;
            return null;
        } else {
            this.field2476 = var1.field2474;
            return var1;
        }
    }

    @ObfuscatedName("gw.y()Lgm;")
    public class193 method3304() {
        class193 var1 = this.field2477.field2475;
        if (this.field2477 == var1) {
            this.field2476 = null;
            return null;
        } else {
            this.field2476 = var1.field2475;
            return var1;
        }
    }

    @ObfuscatedName("gw.j()Lgm;")
    public class193 method3297() {
        class193 var1 = this.field2476;
        if (this.field2477 == var1) {
            this.field2476 = null;
            return null;
        } else {
            this.field2476 = var1.field2474;
            return var1;
        }
    }

    @ObfuscatedName("gw.k()Lgm;")
    public class193 method3310() {
        class193 var1 = this.field2476;
        if (this.field2477 == var1) {
            this.field2476 = null;
            return null;
        } else {
            this.field2476 = var1.field2475;
            return var1;
        }
    }
}

package deob;

@ObfuscatedName("fk")
public class class177 {

    @ObfuscatedName("fk.a")
    public class179 field2812 = new class179();

    @ObfuscatedName("fk.x")
    public class179 field2811;

    public class177() {
        this.field2812.field2815 = this.field2812;
        this.field2812.field2817 = this.field2812;
    }

    @ObfuscatedName("fk.a()V")
    public void method3266() {
        while (true) {
            class179 var1 = this.field2812.field2815;
            if (this.field2812 == var1) {
                this.field2811 = null;
                return;
            }
            var1.method3288();
        }
    }

    @ObfuscatedName("fk.x(Lfp;)V")
    public void method3247(class179 arg0) {
        if (arg0.field2817 != null) {
            arg0.method3288();
        }
        arg0.field2817 = this.field2812.field2817;
        arg0.field2815 = this.field2812;
        arg0.field2817.field2815 = arg0;
        arg0.field2815.field2817 = arg0;
    }

    @ObfuscatedName("fk.e(Lfp;)V")
    public void method3248(class179 arg0) {
        if (arg0.field2817 != null) {
            arg0.method3288();
        }
        arg0.field2817 = this.field2812;
        arg0.field2815 = this.field2812.field2815;
        arg0.field2817.field2815 = arg0;
        arg0.field2815.field2817 = arg0;
    }

    @ObfuscatedName("fk.r(Lfp;Lfp;)V")
    public static void method3277(class179 arg0, class179 arg1) {
        if (arg0.field2817 != null) {
            arg0.method3288();
        }
        arg0.field2817 = arg1.field2817;
        arg0.field2815 = arg1;
        arg0.field2817.field2815 = arg0;
        arg0.field2815.field2817 = arg0;
    }

    @ObfuscatedName("fk.p()Lfp;")
    public class179 method3274() {
        class179 var1 = this.field2812.field2815;
        if (this.field2812 == var1) {
            return null;
        } else {
            var1.method3288();
            return var1;
        }
    }

    @ObfuscatedName("fk.n()Lfp;")
    public class179 method3251() {
        class179 var1 = this.field2812.field2817;
        if (this.field2812 == var1) {
            return null;
        } else {
            var1.method3288();
            return var1;
        }
    }

    @ObfuscatedName("fk.o()Lfp;")
    public class179 method3252() {
        class179 var1 = this.field2812.field2815;
        if (this.field2812 == var1) {
            this.field2811 = null;
            return null;
        } else {
            this.field2811 = var1.field2815;
            return var1;
        }
    }

    @ObfuscatedName("fk.l()Lfp;")
    public class179 method3253() {
        class179 var1 = this.field2812.field2817;
        if (this.field2812 == var1) {
            this.field2811 = null;
            return null;
        } else {
            this.field2811 = var1.field2817;
            return var1;
        }
    }

    @ObfuscatedName("fk.t()Lfp;")
    public class179 method3268() {
        class179 var1 = this.field2811;
        if (this.field2812 == var1) {
            this.field2811 = null;
            return null;
        } else {
            this.field2811 = var1.field2815;
            return var1;
        }
    }

    @ObfuscatedName("fk.q()Lfp;")
    public class179 method3255() {
        class179 var1 = this.field2811;
        if (this.field2812 == var1) {
            this.field2811 = null;
            return null;
        } else {
            this.field2811 = var1.field2817;
            return var1;
        }
    }
}

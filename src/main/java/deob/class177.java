package deob;

@ObfuscatedName("fj")
public class class177 {

    @ObfuscatedName("fj.b")
    public class179 field2807 = new class179();

    @ObfuscatedName("fj.e")
    public class179 field2806;

    public class177() {
        this.field2807.field2811 = this.field2807;
        this.field2807.field2812 = this.field2807;
    }

    @ObfuscatedName("fj.b()V")
    public void method3308() {
        while (true) {
            class179 var1 = this.field2807.field2811;
            if (this.field2807 == var1) {
                this.field2806 = null;
                return;
            }
            var1.method3341();
        }
    }

    @ObfuscatedName("fj.e(Lfc;)V")
    public void method3318(class179 arg0) {
        if (arg0.field2812 != null) {
            arg0.method3341();
        }
        arg0.field2812 = this.field2807.field2812;
        arg0.field2811 = this.field2807;
        arg0.field2812.field2811 = arg0;
        arg0.field2811.field2812 = arg0;
    }

    @ObfuscatedName("fj.g(Lfc;)V")
    public void method3310(class179 arg0) {
        if (arg0.field2812 != null) {
            arg0.method3341();
        }
        arg0.field2812 = this.field2807;
        arg0.field2811 = this.field2807.field2811;
        arg0.field2812.field2811 = arg0;
        arg0.field2811.field2812 = arg0;
    }

    @ObfuscatedName("fj.o(Lfc;Lfc;)V")
    public static void method3311(class179 arg0, class179 arg1) {
        if (arg0.field2812 != null) {
            arg0.method3341();
        }
        arg0.field2812 = arg1.field2812;
        arg0.field2811 = arg1;
        arg0.field2812.field2811 = arg0;
        arg0.field2811.field2812 = arg0;
    }

    @ObfuscatedName("fj.a()Lfc;")
    public class179 method3312() {
        class179 var1 = this.field2807.field2811;
        if (this.field2807 == var1) {
            return null;
        } else {
            var1.method3341();
            return var1;
        }
    }

    @ObfuscatedName("fj.h()Lfc;")
    public class179 method3313() {
        class179 var1 = this.field2807.field2812;
        if (this.field2807 == var1) {
            return null;
        } else {
            var1.method3341();
            return var1;
        }
    }

    @ObfuscatedName("fj.j()Lfc;")
    public class179 method3314() {
        class179 var1 = this.field2807.field2811;
        if (this.field2807 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2811;
            return var1;
        }
    }

    @ObfuscatedName("fj.f()Lfc;")
    public class179 method3307() {
        class179 var1 = this.field2807.field2812;
        if (this.field2807 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2812;
            return var1;
        }
    }

    @ObfuscatedName("fj.q()Lfc;")
    public class179 method3325() {
        class179 var1 = this.field2806;
        if (this.field2807 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2811;
            return var1;
        }
    }

    @ObfuscatedName("fj.l()Lfc;")
    public class179 method3317() {
        class179 var1 = this.field2806;
        if (this.field2807 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2812;
            return var1;
        }
    }
}

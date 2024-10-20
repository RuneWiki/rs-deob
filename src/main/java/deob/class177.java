package deob;

@ObfuscatedName("fs")
public class class177 {

    @ObfuscatedName("fs.j")
    public class179 field2807 = new class179();

    @ObfuscatedName("fs.f")
    public class179 field2808;

    public class177() {
        this.field2807.field2812 = this.field2807;
        this.field2807.field2811 = this.field2807;
    }

    @ObfuscatedName("fs.j()V")
    public void method3340() {
        while (true) {
            class179 var1 = this.field2807.field2812;
            if (this.field2807 == var1) {
                this.field2808 = null;
                return;
            }
            var1.method3349();
        }
    }

    @ObfuscatedName("fs.f(Lfz;)V")
    public void method3312(class179 arg0) {
        if (arg0.field2811 != null) {
            arg0.method3349();
        }
        arg0.field2811 = this.field2807.field2811;
        arg0.field2812 = this.field2807;
        arg0.field2811.field2812 = arg0;
        arg0.field2812.field2811 = arg0;
    }

    @ObfuscatedName("fs.o(Lfz;)V")
    public void method3313(class179 arg0) {
        if (arg0.field2811 != null) {
            arg0.method3349();
        }
        arg0.field2811 = this.field2807;
        arg0.field2812 = this.field2807.field2812;
        arg0.field2811.field2812 = arg0;
        arg0.field2812.field2811 = arg0;
    }

    @ObfuscatedName("fs.h(Lfz;Lfz;)V")
    public static void method3321(class179 arg0, class179 arg1) {
        if (arg0.field2811 != null) {
            arg0.method3349();
        }
        arg0.field2811 = arg1.field2811;
        arg0.field2812 = arg1;
        arg0.field2811.field2812 = arg0;
        arg0.field2812.field2811 = arg0;
    }

    @ObfuscatedName("fs.u()Lfz;")
    public class179 method3315() {
        class179 var1 = this.field2807.field2812;
        if (this.field2807 == var1) {
            return null;
        } else {
            var1.method3349();
            return var1;
        }
    }

    @ObfuscatedName("fs.a()Lfz;")
    public class179 method3316() {
        class179 var1 = this.field2807.field2811;
        if (this.field2807 == var1) {
            return null;
        } else {
            var1.method3349();
            return var1;
        }
    }

    @ObfuscatedName("fs.q()Lfz;")
    public class179 method3338() {
        class179 var1 = this.field2807.field2812;
        if (this.field2807 == var1) {
            this.field2808 = null;
            return null;
        } else {
            this.field2808 = var1.field2812;
            return var1;
        }
    }

    @ObfuscatedName("fs.t()Lfz;")
    public class179 method3318() {
        class179 var1 = this.field2807.field2811;
        if (this.field2807 == var1) {
            this.field2808 = null;
            return null;
        } else {
            this.field2808 = var1.field2811;
            return var1;
        }
    }

    @ObfuscatedName("fs.n()Lfz;")
    public class179 method3323() {
        class179 var1 = this.field2808;
        if (this.field2807 == var1) {
            this.field2808 = null;
            return null;
        } else {
            this.field2808 = var1.field2812;
            return var1;
        }
    }

    @ObfuscatedName("fs.i()Lfz;")
    public class179 method3320() {
        class179 var1 = this.field2808;
        if (this.field2807 == var1) {
            this.field2808 = null;
            return null;
        } else {
            this.field2808 = var1.field2811;
            return var1;
        }
    }
}

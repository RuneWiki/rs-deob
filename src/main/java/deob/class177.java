package deob;

@ObfuscatedName("fy")
public class class177 {

    @ObfuscatedName("fy.i")
    public class179 field2812 = new class179();

    @ObfuscatedName("fy.w")
    public class179 field2813;

    public class177() {
        this.field2812.field2816 = this.field2812;
        this.field2812.field2818 = this.field2812;
    }

    @ObfuscatedName("fy.i()V")
    public void method3288() {
        while (true) {
            class179 var1 = this.field2812.field2816;
            if (this.field2812 == var1) {
                this.field2813 = null;
                return;
            }
            var1.method3328();
        }
    }

    @ObfuscatedName("fy.w(Lft;)V")
    public void method3289(class179 arg0) {
        if (arg0.field2818 != null) {
            arg0.method3328();
        }
        arg0.field2818 = this.field2812.field2818;
        arg0.field2816 = this.field2812;
        arg0.field2818.field2816 = arg0;
        arg0.field2816.field2818 = arg0;
    }

    @ObfuscatedName("fy.f(Lft;)V")
    public void method3290(class179 arg0) {
        if (arg0.field2818 != null) {
            arg0.method3328();
        }
        arg0.field2818 = this.field2812;
        arg0.field2816 = this.field2812.field2816;
        arg0.field2818.field2816 = arg0;
        arg0.field2816.field2818 = arg0;
    }

    @ObfuscatedName("fy.e(Lft;Lft;)V")
    public static void method3291(class179 arg0, class179 arg1) {
        if (arg0.field2818 != null) {
            arg0.method3328();
        }
        arg0.field2818 = arg1.field2818;
        arg0.field2816 = arg1;
        arg0.field2818.field2816 = arg0;
        arg0.field2816.field2818 = arg0;
    }

    @ObfuscatedName("fy.t()Lft;")
    public class179 method3310() {
        class179 var1 = this.field2812.field2816;
        if (this.field2812 == var1) {
            return null;
        } else {
            var1.method3328();
            return var1;
        }
    }

    @ObfuscatedName("fy.d()Lft;")
    public class179 method3293() {
        class179 var1 = this.field2812.field2818;
        if (this.field2812 == var1) {
            return null;
        } else {
            var1.method3328();
            return var1;
        }
    }

    @ObfuscatedName("fy.p()Lft;")
    public class179 method3294() {
        class179 var1 = this.field2812.field2816;
        if (this.field2812 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2816;
            return var1;
        }
    }

    @ObfuscatedName("fy.k()Lft;")
    public class179 method3315() {
        class179 var1 = this.field2812.field2818;
        if (this.field2812 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2818;
            return var1;
        }
    }

    @ObfuscatedName("fy.r()Lft;")
    public class179 method3296() {
        class179 var1 = this.field2813;
        if (this.field2812 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2816;
            return var1;
        }
    }

    @ObfuscatedName("fy.l()Lft;")
    public class179 method3322() {
        class179 var1 = this.field2813;
        if (this.field2812 == var1) {
            this.field2813 = null;
            return null;
        } else {
            this.field2813 = var1.field2818;
            return var1;
        }
    }
}

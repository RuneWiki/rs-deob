package deob;

@ObfuscatedName("fa")
public class class176 {

    @ObfuscatedName("fa.v")
    public class178 field2809 = new class178();

    @ObfuscatedName("fa.f")
    public class178 field2808;

    public class176() {
        this.field2809.field2813 = this.field2809;
        this.field2809.field2812 = this.field2809;
    }

    @ObfuscatedName("fa.v()V")
    public void method3288() {
        while (true) {
            class178 var1 = this.field2809.field2813;
            if (this.field2809 == var1) {
                this.field2808 = null;
                return;
            }
            var1.method3320();
        }
    }

    @ObfuscatedName("fa.f(Lfd;)V")
    public void method3316(class178 arg0) {
        if (arg0.field2812 != null) {
            arg0.method3320();
        }
        arg0.field2812 = this.field2809.field2812;
        arg0.field2813 = this.field2809;
        arg0.field2812.field2813 = arg0;
        arg0.field2813.field2812 = arg0;
    }

    @ObfuscatedName("fa.n(Lfd;)V")
    public void method3291(class178 arg0) {
        if (arg0.field2812 != null) {
            arg0.method3320();
        }
        arg0.field2812 = this.field2809;
        arg0.field2813 = this.field2809.field2813;
        arg0.field2812.field2813 = arg0;
        arg0.field2813.field2812 = arg0;
    }

    @ObfuscatedName("fa.c(Lfd;Lfd;)V")
    public static void method3297(class178 arg0, class178 arg1) {
        if (arg0.field2812 != null) {
            arg0.method3320();
        }
        arg0.field2812 = arg1.field2812;
        arg0.field2813 = arg1;
        arg0.field2812.field2813 = arg0;
        arg0.field2813.field2812 = arg0;
    }

    @ObfuscatedName("fa.r()Lfd;")
    public class178 method3292() {
        class178 var1 = this.field2809.field2813;
        if (this.field2809 == var1) {
            return null;
        } else {
            var1.method3320();
            return var1;
        }
    }

    @ObfuscatedName("fa.k()Lfd;")
    public class178 method3293() {
        class178 var1 = this.field2809.field2812;
        if (this.field2809 == var1) {
            return null;
        } else {
            var1.method3320();
            return var1;
        }
    }

    @ObfuscatedName("fa.e()Lfd;")
    public class178 method3294() {
        class178 var1 = this.field2809.field2813;
        if (this.field2809 == var1) {
            this.field2808 = null;
            return null;
        } else {
            this.field2808 = var1.field2813;
            return var1;
        }
    }

    @ObfuscatedName("fa.q()Lfd;")
    public class178 method3295() {
        class178 var1 = this.field2809.field2812;
        if (this.field2809 == var1) {
            this.field2808 = null;
            return null;
        } else {
            this.field2808 = var1.field2812;
            return var1;
        }
    }

    @ObfuscatedName("fa.u()Lfd;")
    public class178 method3296() {
        class178 var1 = this.field2808;
        if (this.field2809 == var1) {
            this.field2808 = null;
            return null;
        } else {
            this.field2808 = var1.field2813;
            return var1;
        }
    }

    @ObfuscatedName("fa.s()Lfd;")
    public class178 method3287() {
        class178 var1 = this.field2808;
        if (this.field2809 == var1) {
            this.field2808 = null;
            return null;
        } else {
            this.field2808 = var1.field2812;
            return var1;
        }
    }
}

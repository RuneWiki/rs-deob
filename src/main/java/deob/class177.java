package deob;

@ObfuscatedName("ff")
public class class177 {

    @ObfuscatedName("ff.p")
    public class179 field2808 = new class179();

    @ObfuscatedName("ff.e")
    public class179 field2809;

    public class177() {
        this.field2808.field2812 = this.field2808;
        this.field2808.field2814 = this.field2808;
    }

    @ObfuscatedName("ff.p()V")
    public void method3324() {
        while (true) {
            class179 var1 = this.field2808.field2812;
            if (this.field2808 == var1) {
                this.field2809 = null;
                return;
            }
            var1.method3360();
        }
    }

    @ObfuscatedName("ff.e(Lfw;)V")
    public void method3332(class179 arg0) {
        if (arg0.field2814 != null) {
            arg0.method3360();
        }
        arg0.field2814 = this.field2808.field2814;
        arg0.field2812 = this.field2808;
        arg0.field2814.field2812 = arg0;
        arg0.field2812.field2814 = arg0;
    }

    @ObfuscatedName("ff.a(Lfw;)V")
    public void method3334(class179 arg0) {
        if (arg0.field2814 != null) {
            arg0.method3360();
        }
        arg0.field2814 = this.field2808;
        arg0.field2812 = this.field2808.field2812;
        arg0.field2814.field2812 = arg0;
        arg0.field2812.field2814 = arg0;
    }

    @ObfuscatedName("ff.h(Lfw;Lfw;)V")
    public static void method3326(class179 arg0, class179 arg1) {
        if (arg0.field2814 != null) {
            arg0.method3360();
        }
        arg0.field2814 = arg1.field2814;
        arg0.field2812 = arg1;
        arg0.field2814.field2812 = arg0;
        arg0.field2812.field2814 = arg0;
    }

    @ObfuscatedName("ff.y()Lfw;")
    public class179 method3328() {
        class179 var1 = this.field2808.field2812;
        if (this.field2808 == var1) {
            return null;
        } else {
            var1.method3360();
            return var1;
        }
    }

    @ObfuscatedName("ff.j()Lfw;")
    public class179 method3329() {
        class179 var1 = this.field2808.field2814;
        if (this.field2808 == var1) {
            return null;
        } else {
            var1.method3360();
            return var1;
        }
    }

    @ObfuscatedName("ff.l()Lfw;")
    public class179 method3325() {
        class179 var1 = this.field2808.field2812;
        if (this.field2808 == var1) {
            this.field2809 = null;
            return null;
        } else {
            this.field2809 = var1.field2812;
            return var1;
        }
    }

    @ObfuscatedName("ff.f()Lfw;")
    public class179 method3331() {
        class179 var1 = this.field2808.field2814;
        if (this.field2808 == var1) {
            this.field2809 = null;
            return null;
        } else {
            this.field2809 = var1.field2814;
            return var1;
        }
    }

    @ObfuscatedName("ff.n()Lfw;")
    public class179 method3333() {
        class179 var1 = this.field2809;
        if (this.field2808 == var1) {
            this.field2809 = null;
            return null;
        } else {
            this.field2809 = var1.field2812;
            return var1;
        }
    }

    @ObfuscatedName("ff.k()Lfw;")
    public class179 method3350() {
        class179 var1 = this.field2809;
        if (this.field2808 == var1) {
            this.field2809 = null;
            return null;
        } else {
            this.field2809 = var1.field2814;
            return var1;
        }
    }
}

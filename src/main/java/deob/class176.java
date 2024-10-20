package deob;

@ObfuscatedName("fn")
public class class176 {

    @ObfuscatedName("fn.y")
    public class183 field2817 = new class183();

    @ObfuscatedName("fn.u")
    public class183 field2818;

    public class176() {
        this.field2817.field2829 = this.field2817;
        this.field2817.field2831 = this.field2817;
    }

    @ObfuscatedName("fn.y()V")
    public void method3201() {
        while (true) {
            class183 var1 = this.field2817.field2829;
            if (this.field2817 == var1) {
                this.field2818 = null;
                return;
            }
            var1.method3268();
        }
    }

    @ObfuscatedName("fn.u(Lgw;)V")
    public void method3202(class183 arg0) {
        if (arg0.field2831 != null) {
            arg0.method3268();
        }
        arg0.field2831 = this.field2817.field2831;
        arg0.field2829 = this.field2817;
        arg0.field2831.field2829 = arg0;
        arg0.field2829.field2831 = arg0;
    }

    @ObfuscatedName("fn.k(Lgw;)V")
    public void method3211(class183 arg0) {
        if (arg0.field2831 != null) {
            arg0.method3268();
        }
        arg0.field2831 = this.field2817;
        arg0.field2829 = this.field2817.field2829;
        arg0.field2831.field2829 = arg0;
        arg0.field2829.field2831 = arg0;
    }

    @ObfuscatedName("fn.v(Lgw;Lgw;)V")
    public static void method3200(class183 arg0, class183 arg1) {
        if (arg0.field2831 != null) {
            arg0.method3268();
        }
        arg0.field2831 = arg1.field2831;
        arg0.field2829 = arg1;
        arg0.field2831.field2829 = arg0;
        arg0.field2829.field2831 = arg0;
    }

    @ObfuscatedName("fn.l()Lgw;")
    public class183 method3229() {
        class183 var1 = this.field2817.field2829;
        if (this.field2817 == var1) {
            return null;
        } else {
            var1.method3268();
            return var1;
        }
    }

    @ObfuscatedName("fn.g()Lgw;")
    public class183 method3206() {
        class183 var1 = this.field2817.field2831;
        if (this.field2817 == var1) {
            return null;
        } else {
            var1.method3268();
            return var1;
        }
    }

    @ObfuscatedName("fn.a()Lgw;")
    public class183 method3234() {
        class183 var1 = this.field2817.field2829;
        if (this.field2817 == var1) {
            this.field2818 = null;
            return null;
        } else {
            this.field2818 = var1.field2829;
            return var1;
        }
    }

    @ObfuscatedName("fn.x()Lgw;")
    public class183 method3208() {
        class183 var1 = this.field2817.field2831;
        if (this.field2817 == var1) {
            this.field2818 = null;
            return null;
        } else {
            this.field2818 = var1.field2831;
            return var1;
        }
    }

    @ObfuscatedName("fn.r()Lgw;")
    public class183 method3209() {
        class183 var1 = this.field2818;
        if (this.field2817 == var1) {
            this.field2818 = null;
            return null;
        } else {
            this.field2818 = var1.field2829;
            return var1;
        }
    }

    @ObfuscatedName("fn.w()Lgw;")
    public class183 method3212() {
        class183 var1 = this.field2818;
        if (this.field2817 == var1) {
            this.field2818 = null;
            return null;
        } else {
            this.field2818 = var1.field2831;
            return var1;
        }
    }
}

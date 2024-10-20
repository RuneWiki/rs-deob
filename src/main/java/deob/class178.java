package deob;

@ObfuscatedName("fx")
public class class178 {

    @ObfuscatedName("fx.g")
    public class187 field2870 = new class187();

    @ObfuscatedName("fx.i")
    public class187 field2869;

    public class178() {
        this.field2870.field2886 = this.field2870;
        this.field2870.field2887 = this.field2870;
    }

    @ObfuscatedName("fx.g()V")
    public void method3201() {
        while (true) {
            class187 var1 = this.field2870.field2886;
            if (this.field2870 == var1) {
                this.field2869 = null;
                return;
            }
            var1.method3304();
        }
    }

    @ObfuscatedName("fx.i(Lgf;)V")
    public void method3202(class187 arg0) {
        if (arg0.field2887 != null) {
            arg0.method3304();
        }
        arg0.field2887 = this.field2870.field2887;
        arg0.field2886 = this.field2870;
        arg0.field2887.field2886 = arg0;
        arg0.field2886.field2887 = arg0;
    }

    @ObfuscatedName("fx.k(Lgf;)V")
    public void method3203(class187 arg0) {
        if (arg0.field2887 != null) {
            arg0.method3304();
        }
        arg0.field2887 = this.field2870;
        arg0.field2886 = this.field2870.field2886;
        arg0.field2887.field2886 = arg0;
        arg0.field2886.field2887 = arg0;
    }

    @ObfuscatedName("fx.e(Lgf;Lgf;)V")
    public static void method3204(class187 arg0, class187 arg1) {
        if (arg0.field2887 != null) {
            arg0.method3304();
        }
        arg0.field2887 = arg1.field2887;
        arg0.field2886 = arg1;
        arg0.field2887.field2886 = arg0;
        arg0.field2886.field2887 = arg0;
    }

    @ObfuscatedName("fx.w()Lgf;")
    public class187 method3219() {
        class187 var1 = this.field2870.field2886;
        if (this.field2870 == var1) {
            return null;
        } else {
            var1.method3304();
            return var1;
        }
    }

    @ObfuscatedName("fx.m()Lgf;")
    public class187 method3208() {
        class187 var1 = this.field2870.field2887;
        if (this.field2870 == var1) {
            return null;
        } else {
            var1.method3304();
            return var1;
        }
    }

    @ObfuscatedName("fx.u()Lgf;")
    public class187 method3200() {
        class187 var1 = this.field2870.field2886;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2886;
            return var1;
        }
    }

    @ObfuscatedName("fx.j()Lgf;")
    public class187 method3205() {
        class187 var1 = this.field2870.field2887;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2887;
            return var1;
        }
    }

    @ObfuscatedName("fx.o()Lgf;")
    public class187 method3209() {
        class187 var1 = this.field2869;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2886;
            return var1;
        }
    }

    @ObfuscatedName("fx.h()Lgf;")
    public class187 method3210() {
        class187 var1 = this.field2869;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2887;
            return var1;
        }
    }
}

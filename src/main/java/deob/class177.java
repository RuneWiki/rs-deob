package deob;

@ObfuscatedName("fi")
public class class177 {

    @ObfuscatedName("fi.i")
    public class186 field2854 = new class186();

    @ObfuscatedName("fi.c")
    public class186 field2853;

    public class177() {
        this.field2854.field2870 = this.field2854;
        this.field2854.field2869 = this.field2854;
    }

    @ObfuscatedName("fi.i()V")
    public void method3250() {
        while (true) {
            class186 var1 = this.field2854.field2870;
            if (this.field2854 == var1) {
                this.field2853 = null;
                return;
            }
            var1.method3334();
        }
    }

    @ObfuscatedName("fi.c(Lgq;)V")
    public void method3251(class186 arg0) {
        if (arg0.field2869 != null) {
            arg0.method3334();
        }
        arg0.field2869 = this.field2854.field2869;
        arg0.field2870 = this.field2854;
        arg0.field2869.field2870 = arg0;
        arg0.field2870.field2869 = arg0;
    }

    @ObfuscatedName("fi.h(Lgq;)V")
    public void method3252(class186 arg0) {
        if (arg0.field2869 != null) {
            arg0.method3334();
        }
        arg0.field2869 = this.field2854;
        arg0.field2870 = this.field2854.field2870;
        arg0.field2869.field2870 = arg0;
        arg0.field2870.field2869 = arg0;
    }

    @ObfuscatedName("fi.v(Lgq;Lgq;)V")
    public static void method3253(class186 arg0, class186 arg1) {
        if (arg0.field2869 != null) {
            arg0.method3334();
        }
        arg0.field2869 = arg1.field2869;
        arg0.field2870 = arg1;
        arg0.field2869.field2870 = arg0;
        arg0.field2870.field2869 = arg0;
    }

    @ObfuscatedName("fi.q()Lgq;")
    public class186 method3264() {
        class186 var1 = this.field2854.field2870;
        if (this.field2854 == var1) {
            return null;
        } else {
            var1.method3334();
            return var1;
        }
    }

    @ObfuscatedName("fi.s()Lgq;")
    public class186 method3255() {
        class186 var1 = this.field2854.field2869;
        if (this.field2854 == var1) {
            return null;
        } else {
            var1.method3334();
            return var1;
        }
    }

    @ObfuscatedName("fi.g()Lgq;")
    public class186 method3257() {
        class186 var1 = this.field2854.field2870;
        if (this.field2854 == var1) {
            this.field2853 = null;
            return null;
        } else {
            this.field2853 = var1.field2870;
            return var1;
        }
    }

    @ObfuscatedName("fi.u()Lgq;")
    public class186 method3258() {
        class186 var1 = this.field2854.field2869;
        if (this.field2854 == var1) {
            this.field2853 = null;
            return null;
        } else {
            this.field2853 = var1.field2869;
            return var1;
        }
    }

    @ObfuscatedName("fi.d()Lgq;")
    public class186 method3249() {
        class186 var1 = this.field2853;
        if (this.field2854 == var1) {
            this.field2853 = null;
            return null;
        } else {
            this.field2853 = var1.field2870;
            return var1;
        }
    }

    @ObfuscatedName("fi.y()Lgq;")
    public class186 method3259() {
        class186 var1 = this.field2853;
        if (this.field2854 == var1) {
            this.field2853 = null;
            return null;
        } else {
            this.field2853 = var1.field2869;
            return var1;
        }
    }
}

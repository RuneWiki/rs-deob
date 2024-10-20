package deob;

@ObfuscatedName("fg")
public class class182 {

    @ObfuscatedName("fg.a")
    public class191 field2891 = new class191();

    @ObfuscatedName("fg.v")
    public class191 field2892;

    public class182() {
        this.field2891.field2909 = this.field2891;
        this.field2891.field2907 = this.field2891;
    }

    @ObfuscatedName("fg.a()V")
    public void method3284() {
        while (true) {
            class191 var1 = this.field2891.field2909;
            if (this.field2891 == var1) {
                this.field2892 = null;
                return;
            }
            var1.method3343();
        }
    }

    @ObfuscatedName("fg.v(Lgq;)V")
    public void method3274(class191 arg0) {
        if (arg0.field2907 != null) {
            arg0.method3343();
        }
        arg0.field2907 = this.field2891.field2907;
        arg0.field2909 = this.field2891;
        arg0.field2907.field2909 = arg0;
        arg0.field2909.field2907 = arg0;
    }

    @ObfuscatedName("fg.i(Lgq;)V")
    public void method3257(class191 arg0) {
        if (arg0.field2907 != null) {
            arg0.method3343();
        }
        arg0.field2907 = this.field2891;
        arg0.field2909 = this.field2891.field2909;
        arg0.field2907.field2909 = arg0;
        arg0.field2909.field2907 = arg0;
    }

    @ObfuscatedName("fg.b(Lgq;Lgq;)V")
    public static void method3248(class191 arg0, class191 arg1) {
        if (arg0.field2907 != null) {
            arg0.method3343();
        }
        arg0.field2907 = arg1.field2907;
        arg0.field2909 = arg1;
        arg0.field2907.field2909 = arg0;
        arg0.field2909.field2907 = arg0;
    }

    @ObfuscatedName("fg.l()Lgq;")
    public class191 method3249() {
        class191 var1 = this.field2891.field2909;
        if (this.field2891 == var1) {
            return null;
        } else {
            var1.method3343();
            return var1;
        }
    }

    @ObfuscatedName("fg.m()Lgq;")
    public class191 method3250() {
        class191 var1 = this.field2891.field2907;
        if (this.field2891 == var1) {
            return null;
        } else {
            var1.method3343();
            return var1;
        }
    }

    @ObfuscatedName("fg.w()Lgq;")
    public class191 method3251() {
        class191 var1 = this.field2891.field2909;
        if (this.field2891 == var1) {
            this.field2892 = null;
            return null;
        } else {
            this.field2892 = var1.field2909;
            return var1;
        }
    }

    @ObfuscatedName("fg.e()Lgq;")
    public class191 method3252() {
        class191 var1 = this.field2891.field2907;
        if (this.field2891 == var1) {
            this.field2892 = null;
            return null;
        } else {
            this.field2892 = var1.field2907;
            return var1;
        }
    }

    @ObfuscatedName("fg.n()Lgq;")
    public class191 method3261() {
        class191 var1 = this.field2892;
        if (this.field2891 == var1) {
            this.field2892 = null;
            return null;
        } else {
            this.field2892 = var1.field2909;
            return var1;
        }
    }

    @ObfuscatedName("fg.s()Lgq;")
    public class191 method3253() {
        class191 var1 = this.field2892;
        if (this.field2891 == var1) {
            this.field2892 = null;
            return null;
        } else {
            this.field2892 = var1.field2907;
            return var1;
        }
    }
}

package deob;

@ObfuscatedName("fv")
public class class178 {

    @ObfuscatedName("fv.p")
    public class187 field2863 = new class187();

    @ObfuscatedName("fv.g")
    public class187 field2864;

    public class178() {
        this.field2863.field2880 = this.field2863;
        this.field2863.field2879 = this.field2863;
    }

    @ObfuscatedName("fv.p()V")
    public void method3292() {
        while (true) {
            class187 var1 = this.field2863.field2880;
            if (this.field2863 == var1) {
                this.field2864 = null;
                return;
            }
            var1.method3378();
        }
    }

    @ObfuscatedName("fv.g(Lgq;)V")
    public void method3291(class187 arg0) {
        if (arg0.field2879 != null) {
            arg0.method3378();
        }
        arg0.field2879 = this.field2863.field2879;
        arg0.field2880 = this.field2863;
        arg0.field2879.field2880 = arg0;
        arg0.field2880.field2879 = arg0;
    }

    @ObfuscatedName("fv.x(Lgq;)V")
    public void method3294(class187 arg0) {
        if (arg0.field2879 != null) {
            arg0.method3378();
        }
        arg0.field2879 = this.field2863;
        arg0.field2880 = this.field2863.field2880;
        arg0.field2879.field2880 = arg0;
        arg0.field2880.field2879 = arg0;
    }

    @ObfuscatedName("fv.c(Lgq;Lgq;)V")
    public static void method3295(class187 arg0, class187 arg1) {
        if (arg0.field2879 != null) {
            arg0.method3378();
        }
        arg0.field2879 = arg1.field2879;
        arg0.field2880 = arg1;
        arg0.field2879.field2880 = arg0;
        arg0.field2880.field2879 = arg0;
    }

    @ObfuscatedName("fv.n()Lgq;")
    public class187 method3305() {
        class187 var1 = this.field2863.field2880;
        if (this.field2863 == var1) {
            return null;
        } else {
            var1.method3378();
            return var1;
        }
    }

    @ObfuscatedName("fv.s()Lgq;")
    public class187 method3293() {
        class187 var1 = this.field2863.field2879;
        if (this.field2863 == var1) {
            return null;
        } else {
            var1.method3378();
            return var1;
        }
    }

    @ObfuscatedName("fv.r()Lgq;")
    public class187 method3303() {
        class187 var1 = this.field2863.field2880;
        if (this.field2863 == var1) {
            this.field2864 = null;
            return null;
        } else {
            this.field2864 = var1.field2880;
            return var1;
        }
    }

    @ObfuscatedName("fv.w()Lgq;")
    public class187 method3299() {
        class187 var1 = this.field2863.field2879;
        if (this.field2863 == var1) {
            this.field2864 = null;
            return null;
        } else {
            this.field2864 = var1.field2879;
            return var1;
        }
    }

    @ObfuscatedName("fv.u()Lgq;")
    public class187 method3300() {
        class187 var1 = this.field2864;
        if (this.field2863 == var1) {
            this.field2864 = null;
            return null;
        } else {
            this.field2864 = var1.field2880;
            return var1;
        }
    }

    @ObfuscatedName("fv.d()Lgq;")
    public class187 method3317() {
        class187 var1 = this.field2864;
        if (this.field2863 == var1) {
            this.field2864 = null;
            return null;
        } else {
            this.field2864 = var1.field2879;
            return var1;
        }
    }
}

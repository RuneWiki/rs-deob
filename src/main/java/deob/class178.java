package deob;

@ObfuscatedName("fw")
public class class178 {

    @ObfuscatedName("fw.k")
    public class187 field2862 = new class187();

    @ObfuscatedName("fw.y")
    public class187 field2861;

    public class178() {
        this.field2862.field2878 = this.field2862;
        this.field2862.field2877 = this.field2862;
    }

    @ObfuscatedName("fw.k()V")
    public void method3270() {
        while (true) {
            class187 var1 = this.field2862.field2878;
            if (this.field2862 == var1) {
                this.field2861 = null;
                return;
            }
            var1.method3365();
        }
    }

    @ObfuscatedName("fw.y(Lgk;)V")
    public void method3271(class187 arg0) {
        if (arg0.field2877 != null) {
            arg0.method3365();
        }
        arg0.field2877 = this.field2862.field2877;
        arg0.field2878 = this.field2862;
        arg0.field2877.field2878 = arg0;
        arg0.field2878.field2877 = arg0;
    }

    @ObfuscatedName("fw.s(Lgk;)V")
    public void method3294(class187 arg0) {
        if (arg0.field2877 != null) {
            arg0.method3365();
        }
        arg0.field2877 = this.field2862;
        arg0.field2878 = this.field2862.field2878;
        arg0.field2877.field2878 = arg0;
        arg0.field2878.field2877 = arg0;
    }

    @ObfuscatedName("fw.g(Lgk;Lgk;)V")
    public static void method3276(class187 arg0, class187 arg1) {
        if (arg0.field2877 != null) {
            arg0.method3365();
        }
        arg0.field2877 = arg1.field2877;
        arg0.field2878 = arg1;
        arg0.field2877.field2878 = arg0;
        arg0.field2878.field2877 = arg0;
    }

    @ObfuscatedName("fw.h()Lgk;")
    public class187 method3274() {
        class187 var1 = this.field2862.field2878;
        if (this.field2862 == var1) {
            return null;
        } else {
            var1.method3365();
            return var1;
        }
    }

    @ObfuscatedName("fw.l()Lgk;")
    public class187 method3275() {
        class187 var1 = this.field2862.field2877;
        if (this.field2862 == var1) {
            return null;
        } else {
            var1.method3365();
            return var1;
        }
    }

    @ObfuscatedName("fw.e()Lgk;")
    public class187 method3301() {
        class187 var1 = this.field2862.field2878;
        if (this.field2862 == var1) {
            this.field2861 = null;
            return null;
        } else {
            this.field2861 = var1.field2878;
            return var1;
        }
    }

    @ObfuscatedName("fw.u()Lgk;")
    public class187 method3299() {
        class187 var1 = this.field2862.field2877;
        if (this.field2862 == var1) {
            this.field2861 = null;
            return null;
        } else {
            this.field2861 = var1.field2877;
            return var1;
        }
    }

    @ObfuscatedName("fw.j()Lgk;")
    public class187 method3278() {
        class187 var1 = this.field2861;
        if (this.field2862 == var1) {
            this.field2861 = null;
            return null;
        } else {
            this.field2861 = var1.field2878;
            return var1;
        }
    }

    @ObfuscatedName("fw.c()Lgk;")
    public class187 method3291() {
        class187 var1 = this.field2861;
        if (this.field2862 == var1) {
            this.field2861 = null;
            return null;
        } else {
            this.field2861 = var1.field2877;
            return var1;
        }
    }
}

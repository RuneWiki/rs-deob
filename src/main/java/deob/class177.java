package deob;

@ObfuscatedName("fl")
public class class177 {

    @ObfuscatedName("fl.t")
    public class186 field2847 = new class186();

    @ObfuscatedName("fl.s")
    public class186 field2848;

    public class177() {
        this.field2847.field2863 = this.field2847;
        this.field2847.field2865 = this.field2847;
    }

    @ObfuscatedName("fl.t()V")
    public void method3241() {
        while (true) {
            class186 var1 = this.field2847.field2863;
            if (this.field2847 == var1) {
                this.field2848 = null;
                return;
            }
            var1.method3316();
        }
    }

    @ObfuscatedName("fl.s(Lgm;)V")
    public void method3260(class186 arg0) {
        if (arg0.field2865 != null) {
            arg0.method3316();
        }
        arg0.field2865 = this.field2847.field2865;
        arg0.field2863 = this.field2847;
        arg0.field2865.field2863 = arg0;
        arg0.field2863.field2865 = arg0;
    }

    @ObfuscatedName("fl.f(Lgm;)V")
    public void method3240(class186 arg0) {
        if (arg0.field2865 != null) {
            arg0.method3316();
        }
        arg0.field2865 = this.field2847;
        arg0.field2863 = this.field2847.field2863;
        arg0.field2865.field2863 = arg0;
        arg0.field2863.field2865 = arg0;
    }

    @ObfuscatedName("fl.e(Lgm;Lgm;)V")
    public static void method3236(class186 arg0, class186 arg1) {
        if (arg0.field2865 != null) {
            arg0.method3316();
        }
        arg0.field2865 = arg1.field2865;
        arg0.field2863 = arg1;
        arg0.field2865.field2863 = arg0;
        arg0.field2863.field2865 = arg0;
    }

    @ObfuscatedName("fl.d()Lgm;")
    public class186 method3237() {
        class186 var1 = this.field2847.field2863;
        if (this.field2847 == var1) {
            return null;
        } else {
            var1.method3316();
            return var1;
        }
    }

    @ObfuscatedName("fl.n()Lgm;")
    public class186 method3238() {
        class186 var1 = this.field2847.field2865;
        if (this.field2847 == var1) {
            return null;
        } else {
            var1.method3316();
            return var1;
        }
    }

    @ObfuscatedName("fl.v()Lgm;")
    public class186 method3239() {
        class186 var1 = this.field2847.field2863;
        if (this.field2847 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2863;
            return var1;
        }
    }

    @ObfuscatedName("fl.z()Lgm;")
    public class186 method3235() {
        class186 var1 = this.field2847.field2865;
        if (this.field2847 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2865;
            return var1;
        }
    }

    @ObfuscatedName("fl.j()Lgm;")
    public class186 method3248() {
        class186 var1 = this.field2848;
        if (this.field2847 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2863;
            return var1;
        }
    }

    @ObfuscatedName("fl.u()Lgm;")
    public class186 method3242() {
        class186 var1 = this.field2848;
        if (this.field2847 == var1) {
            this.field2848 = null;
            return null;
        } else {
            this.field2848 = var1.field2865;
            return var1;
        }
    }
}

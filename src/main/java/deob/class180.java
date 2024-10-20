package deob;

@ObfuscatedName("fb")
public class class180 {

    @ObfuscatedName("fb.g")
    public class189 field2870 = new class189();

    @ObfuscatedName("fb.j")
    public class189 field2869;

    public class180() {
        this.field2870.field2886 = this.field2870;
        this.field2870.field2885 = this.field2870;
    }

    @ObfuscatedName("fb.g()V")
    public void method3168() {
        while (true) {
            class189 var1 = this.field2870.field2886;
            if (this.field2870 == var1) {
                this.field2869 = null;
                return;
            }
            var1.method3259();
        }
    }

    @ObfuscatedName("fb.j(Lgn;)V")
    public void method3169(class189 arg0) {
        if (arg0.field2885 != null) {
            arg0.method3259();
        }
        arg0.field2885 = this.field2870.field2885;
        arg0.field2886 = this.field2870;
        arg0.field2885.field2886 = arg0;
        arg0.field2886.field2885 = arg0;
    }

    @ObfuscatedName("fb.z(Lgn;)V")
    public void method3170(class189 arg0) {
        if (arg0.field2885 != null) {
            arg0.method3259();
        }
        arg0.field2885 = this.field2870;
        arg0.field2886 = this.field2870.field2886;
        arg0.field2885.field2886 = arg0;
        arg0.field2886.field2885 = arg0;
    }

    @ObfuscatedName("fb.b(Lgn;Lgn;)V")
    public static void method3189(class189 arg0, class189 arg1) {
        if (arg0.field2885 != null) {
            arg0.method3259();
        }
        arg0.field2885 = arg1.field2885;
        arg0.field2886 = arg1;
        arg0.field2885.field2886 = arg0;
        arg0.field2886.field2885 = arg0;
    }

    @ObfuscatedName("fb.k()Lgn;")
    public class189 method3186() {
        class189 var1 = this.field2870.field2886;
        if (this.field2870 == var1) {
            return null;
        } else {
            var1.method3259();
            return var1;
        }
    }

    @ObfuscatedName("fb.c()Lgn;")
    public class189 method3173() {
        class189 var1 = this.field2870.field2885;
        if (this.field2870 == var1) {
            return null;
        } else {
            var1.method3259();
            return var1;
        }
    }

    @ObfuscatedName("fb.w()Lgn;")
    public class189 method3174() {
        class189 var1 = this.field2870.field2886;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2886;
            return var1;
        }
    }

    @ObfuscatedName("fb.l()Lgn;")
    public class189 method3183() {
        class189 var1 = this.field2870.field2885;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2885;
            return var1;
        }
    }

    @ObfuscatedName("fb.n()Lgn;")
    public class189 method3176() {
        class189 var1 = this.field2869;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2886;
            return var1;
        }
    }

    @ObfuscatedName("fb.d()Lgn;")
    public class189 method3167() {
        class189 var1 = this.field2869;
        if (this.field2870 == var1) {
            this.field2869 = null;
            return null;
        } else {
            this.field2869 = var1.field2885;
            return var1;
        }
    }
}

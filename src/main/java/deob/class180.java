package deob;

@ObfuscatedName("fg")
public class class180 {

    @ObfuscatedName("fg.e")
    public class189 field2879 = new class189();

    @ObfuscatedName("fg.v")
    public class189 field2878;

    public class180() {
        this.field2879.field2895 = this.field2879;
        this.field2879.field2896 = this.field2879;
    }

    @ObfuscatedName("fg.e()V")
    public void method3223() {
        while (true) {
            class189 var1 = this.field2879.field2895;
            if (this.field2879 == var1) {
                this.field2878 = null;
                return;
            }
            var1.method3324();
        }
    }

    @ObfuscatedName("fg.v(Lgp;)V")
    public void method3224(class189 arg0) {
        if (arg0.field2896 != null) {
            arg0.method3324();
        }
        arg0.field2896 = this.field2879.field2896;
        arg0.field2895 = this.field2879;
        arg0.field2896.field2895 = arg0;
        arg0.field2895.field2896 = arg0;
    }

    @ObfuscatedName("fg.k(Lgp;)V")
    public void method3225(class189 arg0) {
        if (arg0.field2896 != null) {
            arg0.method3324();
        }
        arg0.field2896 = this.field2879;
        arg0.field2895 = this.field2879.field2895;
        arg0.field2896.field2895 = arg0;
        arg0.field2895.field2896 = arg0;
    }

    @ObfuscatedName("fg.g(Lgp;Lgp;)V")
    public static void method3235(class189 arg0, class189 arg1) {
        if (arg0.field2896 != null) {
            arg0.method3324();
        }
        arg0.field2896 = arg1.field2896;
        arg0.field2895 = arg1;
        arg0.field2896.field2895 = arg0;
        arg0.field2895.field2896 = arg0;
    }

    @ObfuscatedName("fg.q()Lgp;")
    public class189 method3227() {
        class189 var1 = this.field2879.field2895;
        if (this.field2879 == var1) {
            return null;
        } else {
            var1.method3324();
            return var1;
        }
    }

    @ObfuscatedName("fg.l()Lgp;")
    public class189 method3228() {
        class189 var1 = this.field2879.field2896;
        if (this.field2879 == var1) {
            return null;
        } else {
            var1.method3324();
            return var1;
        }
    }

    @ObfuscatedName("fg.a()Lgp;")
    public class189 method3226() {
        class189 var1 = this.field2879.field2895;
        if (this.field2879 == var1) {
            this.field2878 = null;
            return null;
        } else {
            this.field2878 = var1.field2895;
            return var1;
        }
    }

    @ObfuscatedName("fg.b()Lgp;")
    public class189 method3230() {
        class189 var1 = this.field2879.field2896;
        if (this.field2879 == var1) {
            this.field2878 = null;
            return null;
        } else {
            this.field2878 = var1.field2896;
            return var1;
        }
    }

    @ObfuscatedName("fg.z()Lgp;")
    public class189 method3231() {
        class189 var1 = this.field2878;
        if (this.field2879 == var1) {
            this.field2878 = null;
            return null;
        } else {
            this.field2878 = var1.field2895;
            return var1;
        }
    }

    @ObfuscatedName("fg.w()Lgp;")
    public class189 method3249() {
        class189 var1 = this.field2878;
        if (this.field2879 == var1) {
            this.field2878 = null;
            return null;
        } else {
            this.field2878 = var1.field2896;
            return var1;
        }
    }
}

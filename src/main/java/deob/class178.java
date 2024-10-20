package deob;

@ObfuscatedName("fx")
public class class178 {

    @ObfuscatedName("fx.n")
    public class187 field2871 = new class187();

    @ObfuscatedName("fx.x")
    public class187 field2870;

    public class178() {
        this.field2871.field2887 = this.field2871;
        this.field2871.field2886 = this.field2871;
    }

    @ObfuscatedName("fx.n()V")
    public void method3180() {
        while (true) {
            class187 var1 = this.field2871.field2887;
            if (this.field2871 == var1) {
                this.field2870 = null;
                return;
            }
            var1.method3277();
        }
    }

    @ObfuscatedName("fx.x(Lga;)V")
    public void method3181(class187 arg0) {
        if (arg0.field2886 != null) {
            arg0.method3277();
        }
        arg0.field2886 = this.field2871.field2886;
        arg0.field2887 = this.field2871;
        arg0.field2886.field2887 = arg0;
        arg0.field2887.field2886 = arg0;
    }

    @ObfuscatedName("fx.k(Lga;)V")
    public void method3182(class187 arg0) {
        if (arg0.field2886 != null) {
            arg0.method3277();
        }
        arg0.field2886 = this.field2871;
        arg0.field2887 = this.field2871.field2887;
        arg0.field2886.field2887 = arg0;
        arg0.field2887.field2886 = arg0;
    }

    @ObfuscatedName("fx.i(Lga;Lga;)V")
    public static void method3183(class187 arg0, class187 arg1) {
        if (arg0.field2886 != null) {
            arg0.method3277();
        }
        arg0.field2886 = arg1.field2886;
        arg0.field2887 = arg1;
        arg0.field2886.field2887 = arg0;
        arg0.field2887.field2886 = arg0;
    }

    @ObfuscatedName("fx.d()Lga;")
    public class187 method3186() {
        class187 var1 = this.field2871.field2887;
        if (this.field2871 == var1) {
            return null;
        } else {
            var1.method3277();
            return var1;
        }
    }

    @ObfuscatedName("fx.q()Lga;")
    public class187 method3185() {
        class187 var1 = this.field2871.field2886;
        if (this.field2871 == var1) {
            return null;
        } else {
            var1.method3277();
            return var1;
        }
    }

    @ObfuscatedName("fx.m()Lga;")
    public class187 method3179() {
        class187 var1 = this.field2871.field2887;
        if (this.field2871 == var1) {
            this.field2870 = null;
            return null;
        } else {
            this.field2870 = var1.field2887;
            return var1;
        }
    }

    @ObfuscatedName("fx.a()Lga;")
    public class187 method3187() {
        class187 var1 = this.field2871.field2886;
        if (this.field2871 == var1) {
            this.field2870 = null;
            return null;
        } else {
            this.field2870 = var1.field2886;
            return var1;
        }
    }

    @ObfuscatedName("fx.w()Lga;")
    public class187 method3199() {
        class187 var1 = this.field2870;
        if (this.field2871 == var1) {
            this.field2870 = null;
            return null;
        } else {
            this.field2870 = var1.field2887;
            return var1;
        }
    }

    @ObfuscatedName("fx.e()Lga;")
    public class187 method3194() {
        class187 var1 = this.field2870;
        if (this.field2871 == var1) {
            this.field2870 = null;
            return null;
        } else {
            this.field2870 = var1.field2886;
            return var1;
        }
    }
}

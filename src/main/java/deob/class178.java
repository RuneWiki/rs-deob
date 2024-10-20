package deob;

@ObfuscatedName("fn")
public class class178 {

    @ObfuscatedName("fn.g")
    public class187 field2857 = new class187();

    @ObfuscatedName("fn.s")
    public class187 field2856;

    public class178() {
        this.field2857.field2874 = this.field2857;
        this.field2857.field2872 = this.field2857;
    }

    @ObfuscatedName("fn.g()V")
    public void method3191() {
        while (true) {
            class187 var1 = this.field2857.field2874;
            if (this.field2857 == var1) {
                this.field2856 = null;
                return;
            }
            var1.method3280();
        }
    }

    @ObfuscatedName("fn.s(Lgg;)V")
    public void method3200(class187 arg0) {
        if (arg0.field2872 != null) {
            arg0.method3280();
        }
        arg0.field2872 = this.field2857.field2872;
        arg0.field2874 = this.field2857;
        arg0.field2872.field2874 = arg0;
        arg0.field2874.field2872 = arg0;
    }

    @ObfuscatedName("fn.h(Lgg;)V")
    public void method3217(class187 arg0) {
        if (arg0.field2872 != null) {
            arg0.method3280();
        }
        arg0.field2872 = this.field2857;
        arg0.field2874 = this.field2857.field2874;
        arg0.field2872.field2874 = arg0;
        arg0.field2874.field2872 = arg0;
    }

    @ObfuscatedName("fn.m(Lgg;Lgg;)V")
    public static void method3190(class187 arg0, class187 arg1) {
        if (arg0.field2872 != null) {
            arg0.method3280();
        }
        arg0.field2872 = arg1.field2872;
        arg0.field2874 = arg1;
        arg0.field2872.field2874 = arg0;
        arg0.field2874.field2872 = arg0;
    }

    @ObfuscatedName("fn.u()Lgg;")
    public class187 method3195() {
        class187 var1 = this.field2857.field2874;
        if (this.field2857 == var1) {
            return null;
        } else {
            var1.method3280();
            return var1;
        }
    }

    @ObfuscatedName("fn.j()Lgg;")
    public class187 method3208() {
        class187 var1 = this.field2857.field2872;
        if (this.field2857 == var1) {
            return null;
        } else {
            var1.method3280();
            return var1;
        }
    }

    @ObfuscatedName("fn.b()Lgg;")
    public class187 method3196() {
        class187 var1 = this.field2857.field2874;
        if (this.field2857 == var1) {
            this.field2856 = null;
            return null;
        } else {
            this.field2856 = var1.field2874;
            return var1;
        }
    }

    @ObfuscatedName("fn.v()Lgg;")
    public class187 method3193() {
        class187 var1 = this.field2857.field2872;
        if (this.field2857 == var1) {
            this.field2856 = null;
            return null;
        } else {
            this.field2856 = var1.field2872;
            return var1;
        }
    }

    @ObfuscatedName("fn.y()Lgg;")
    public class187 method3206() {
        class187 var1 = this.field2856;
        if (this.field2857 == var1) {
            this.field2856 = null;
            return null;
        } else {
            this.field2856 = var1.field2874;
            return var1;
        }
    }

    @ObfuscatedName("fn.w()Lgg;")
    public class187 method3199() {
        class187 var1 = this.field2856;
        if (this.field2857 == var1) {
            this.field2856 = null;
            return null;
        } else {
            this.field2856 = var1.field2872;
            return var1;
        }
    }
}

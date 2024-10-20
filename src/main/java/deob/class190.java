package deob;

@ObfuscatedName("gr")
public class class190 {

    @ObfuscatedName("gr.y")
    public class199 field3009 = new class199();

    @ObfuscatedName("gr.k")
    public class199 field3008;

    public class190() {
        this.field3009.field3025 = this.field3009;
        this.field3009.field3026 = this.field3009;
    }

    @ObfuscatedName("gr.y()V")
    public void method3406() {
        while (true) {
            class199 var1 = this.field3009.field3025;
            if (this.field3009 == var1) {
                this.field3008 = null;
                return;
            }
            var1.method3482();
        }
    }

    @ObfuscatedName("gr.k(Lgb;)V")
    public void method3391(class199 arg0) {
        if (arg0.field3026 != null) {
            arg0.method3482();
        }
        arg0.field3026 = this.field3009.field3026;
        arg0.field3025 = this.field3009;
        arg0.field3026.field3025 = arg0;
        arg0.field3025.field3026 = arg0;
    }

    @ObfuscatedName("gr.g(Lgb;)V")
    public void method3415(class199 arg0) {
        if (arg0.field3026 != null) {
            arg0.method3482();
        }
        arg0.field3026 = this.field3009;
        arg0.field3025 = this.field3009.field3025;
        arg0.field3026.field3025 = arg0;
        arg0.field3025.field3026 = arg0;
    }

    @ObfuscatedName("gr.n(Lgb;Lgb;)V")
    public static void method3423(class199 arg0, class199 arg1) {
        if (arg0.field3026 != null) {
            arg0.method3482();
        }
        arg0.field3026 = arg1.field3026;
        arg0.field3025 = arg1;
        arg0.field3026.field3025 = arg0;
        arg0.field3025.field3026 = arg0;
    }

    @ObfuscatedName("gr.t()Lgb;")
    public class199 method3394() {
        class199 var1 = this.field3009.field3025;
        if (this.field3009 == var1) {
            return null;
        } else {
            var1.method3482();
            return var1;
        }
    }

    @ObfuscatedName("gr.e()Lgb;")
    public class199 method3393() {
        class199 var1 = this.field3009.field3026;
        if (this.field3009 == var1) {
            return null;
        } else {
            var1.method3482();
            return var1;
        }
    }

    @ObfuscatedName("gr.q()Lgb;")
    public class199 method3396() {
        class199 var1 = this.field3009.field3025;
        if (this.field3009 == var1) {
            this.field3008 = null;
            return null;
        } else {
            this.field3008 = var1.field3025;
            return var1;
        }
    }

    @ObfuscatedName("gr.z()Lgb;")
    public class199 method3411() {
        class199 var1 = this.field3009.field3026;
        if (this.field3009 == var1) {
            this.field3008 = null;
            return null;
        } else {
            this.field3008 = var1.field3026;
            return var1;
        }
    }

    @ObfuscatedName("gr.v()Lgb;")
    public class199 method3398() {
        class199 var1 = this.field3008;
        if (this.field3009 == var1) {
            this.field3008 = null;
            return null;
        } else {
            this.field3008 = var1.field3025;
            return var1;
        }
    }

    @ObfuscatedName("gr.b()Lgb;")
    public class199 method3399() {
        class199 var1 = this.field3008;
        if (this.field3009 == var1) {
            this.field3008 = null;
            return null;
        } else {
            this.field3008 = var1.field3026;
            return var1;
        }
    }
}

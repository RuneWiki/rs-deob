package deob;

@ObfuscatedName("gl")
public class class199 {

    @ObfuscatedName("gl.d")
    public class208 field3089 = new class208();

    @ObfuscatedName("gl.p")
    public class208 field3090;

    public class199() {
        this.field3089.field3105 = this.field3089;
        this.field3089.field3106 = this.field3089;
    }

    @ObfuscatedName("gl.d()V")
    public void method3607() {
        while (true) {
            class208 var1 = this.field3089.field3105;
            if (this.field3089 == var1) {
                this.field3090 = null;
                return;
            }
            var1.method3715();
        }
    }

    @ObfuscatedName("gl.p(Lgj;)V")
    public void method3633(class208 arg0) {
        if (arg0.field3106 != null) {
            arg0.method3715();
        }
        arg0.field3106 = this.field3089.field3106;
        arg0.field3105 = this.field3089;
        arg0.field3106.field3105 = arg0;
        arg0.field3105.field3106 = arg0;
    }

    @ObfuscatedName("gl.v(Lgj;)V")
    public void method3630(class208 arg0) {
        if (arg0.field3106 != null) {
            arg0.method3715();
        }
        arg0.field3106 = this.field3089;
        arg0.field3105 = this.field3089.field3105;
        arg0.field3106.field3105 = arg0;
        arg0.field3105.field3106 = arg0;
    }

    @ObfuscatedName("gl.l(Lgj;Lgj;)V")
    public static void method3610(class208 arg0, class208 arg1) {
        if (arg0.field3106 != null) {
            arg0.method3715();
        }
        arg0.field3106 = arg1.field3106;
        arg0.field3105 = arg1;
        arg0.field3106.field3105 = arg0;
        arg0.field3105.field3106 = arg0;
    }

    @ObfuscatedName("gl.y()Lgj;")
    public class208 method3611() {
        class208 var1 = this.field3089.field3105;
        if (this.field3089 == var1) {
            return null;
        } else {
            var1.method3715();
            return var1;
        }
    }

    @ObfuscatedName("gl.w()Lgj;")
    public class208 method3612() {
        class208 var1 = this.field3089.field3106;
        if (this.field3089 == var1) {
            return null;
        } else {
            var1.method3715();
            return var1;
        }
    }

    @ObfuscatedName("gl.u()Lgj;")
    public class208 method3613() {
        class208 var1 = this.field3089.field3105;
        if (this.field3089 == var1) {
            this.field3090 = null;
            return null;
        } else {
            this.field3090 = var1.field3105;
            return var1;
        }
    }

    @ObfuscatedName("gl.a()Lgj;")
    public class208 method3614() {
        class208 var1 = this.field3089.field3106;
        if (this.field3089 == var1) {
            this.field3090 = null;
            return null;
        } else {
            this.field3090 = var1.field3106;
            return var1;
        }
    }

    @ObfuscatedName("gl.e()Lgj;")
    public class208 method3615() {
        class208 var1 = this.field3090;
        if (this.field3089 == var1) {
            this.field3090 = null;
            return null;
        } else {
            this.field3090 = var1.field3105;
            return var1;
        }
    }

    @ObfuscatedName("gl.b()Lgj;")
    public class208 method3641() {
        class208 var1 = this.field3090;
        if (this.field3089 == var1) {
            this.field3090 = null;
            return null;
        } else {
            this.field3090 = var1.field3106;
            return var1;
        }
    }
}

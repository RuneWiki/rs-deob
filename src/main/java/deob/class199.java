package deob;

@ObfuscatedName("gi")
public class class199 {

    @ObfuscatedName("gi.f")
    public class208 field3090 = new class208();

    @ObfuscatedName("gi.s")
    public class208 field3089;

    public class199() {
        this.field3090.field3106 = this.field3090;
        this.field3090.field3107 = this.field3090;
    }

    @ObfuscatedName("gi.f()V")
    public void method3560() {
        while (true) {
            class208 var1 = this.field3090.field3106;
            if (this.field3090 == var1) {
                this.field3089 = null;
                return;
            }
            var1.method3665();
        }
    }

    @ObfuscatedName("gi.s(Lgm;)V")
    public void method3559(class208 arg0) {
        if (arg0.field3107 != null) {
            arg0.method3665();
        }
        arg0.field3107 = this.field3090.field3107;
        arg0.field3106 = this.field3090;
        arg0.field3107.field3106 = arg0;
        arg0.field3106.field3107 = arg0;
    }

    @ObfuscatedName("gi.q(Lgm;)V")
    public void method3561(class208 arg0) {
        if (arg0.field3107 != null) {
            arg0.method3665();
        }
        arg0.field3107 = this.field3090;
        arg0.field3106 = this.field3090.field3106;
        arg0.field3107.field3106 = arg0;
        arg0.field3106.field3107 = arg0;
    }

    @ObfuscatedName("gi.g(Lgm;Lgm;)V")
    public static void method3568(class208 arg0, class208 arg1) {
        if (arg0.field3107 != null) {
            arg0.method3665();
        }
        arg0.field3107 = arg1.field3107;
        arg0.field3106 = arg1;
        arg0.field3107.field3106 = arg0;
        arg0.field3106.field3107 = arg0;
    }

    @ObfuscatedName("gi.m()Lgm;")
    public class208 method3564() {
        class208 var1 = this.field3090.field3106;
        if (this.field3090 == var1) {
            return null;
        } else {
            var1.method3665();
            return var1;
        }
    }

    @ObfuscatedName("gi.t()Lgm;")
    public class208 method3565() {
        class208 var1 = this.field3090.field3107;
        if (this.field3090 == var1) {
            return null;
        } else {
            var1.method3665();
            return var1;
        }
    }

    @ObfuscatedName("gi.j()Lgm;")
    public class208 method3566() {
        class208 var1 = this.field3090.field3106;
        if (this.field3090 == var1) {
            this.field3089 = null;
            return null;
        } else {
            this.field3089 = var1.field3106;
            return var1;
        }
    }

    @ObfuscatedName("gi.n()Lgm;")
    public class208 method3569() {
        class208 var1 = this.field3090.field3107;
        if (this.field3090 == var1) {
            this.field3089 = null;
            return null;
        } else {
            this.field3089 = var1.field3107;
            return var1;
        }
    }

    @ObfuscatedName("gi.l()Lgm;")
    public class208 method3567() {
        class208 var1 = this.field3089;
        if (this.field3090 == var1) {
            this.field3089 = null;
            return null;
        } else {
            this.field3089 = var1.field3106;
            return var1;
        }
    }

    @ObfuscatedName("gi.i()Lgm;")
    public class208 method3585() {
        class208 var1 = this.field3089;
        if (this.field3090 == var1) {
            this.field3089 = null;
            return null;
        } else {
            this.field3089 = var1.field3107;
            return var1;
        }
    }
}

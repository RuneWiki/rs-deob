package deob;

@ObfuscatedName("gu")
public class class199 {

    @ObfuscatedName("gu.l")
    public class208 field3090 = new class208();

    @ObfuscatedName("gu.e")
    public class208 field3089;

    public class199() {
        this.field3090.field3106 = this.field3090;
        this.field3090.field3105 = this.field3090;
    }

    @ObfuscatedName("gu.l()V")
    public void method3568() {
        while (true) {
            class208 var1 = this.field3090.field3106;
            if (this.field3090 == var1) {
                this.field3089 = null;
                return;
            }
            var1.method3620();
        }
    }

    @ObfuscatedName("gu.e(Lgj;)V")
    public void method3567(class208 arg0) {
        if (arg0.field3105 != null) {
            arg0.method3620();
        }
        arg0.field3105 = this.field3090.field3105;
        arg0.field3106 = this.field3090;
        arg0.field3105.field3106 = arg0;
        arg0.field3106.field3105 = arg0;
    }

    @ObfuscatedName("gu.q(Lgj;)V")
    public void method3540(class208 arg0) {
        if (arg0.field3105 != null) {
            arg0.method3620();
        }
        arg0.field3105 = this.field3090;
        arg0.field3106 = this.field3090.field3106;
        arg0.field3105.field3106 = arg0;
        arg0.field3106.field3105 = arg0;
    }

    @ObfuscatedName("gu.o(Lgj;Lgj;)V")
    public static void method3541(class208 arg0, class208 arg1) {
        if (arg0.field3105 != null) {
            arg0.method3620();
        }
        arg0.field3105 = arg1.field3105;
        arg0.field3106 = arg1;
        arg0.field3105.field3106 = arg0;
        arg0.field3106.field3105 = arg0;
    }

    @ObfuscatedName("gu.g()Lgj;")
    public class208 method3542() {
        class208 var1 = this.field3090.field3106;
        if (this.field3090 == var1) {
            return null;
        } else {
            var1.method3620();
            return var1;
        }
    }

    @ObfuscatedName("gu.m()Lgj;")
    public class208 method3553() {
        class208 var1 = this.field3090.field3105;
        if (this.field3090 == var1) {
            return null;
        } else {
            var1.method3620();
            return var1;
        }
    }

    @ObfuscatedName("gu.b()Lgj;")
    public class208 method3544() {
        class208 var1 = this.field3090.field3106;
        if (this.field3090 == var1) {
            this.field3089 = null;
            return null;
        } else {
            this.field3089 = var1.field3106;
            return var1;
        }
    }

    @ObfuscatedName("gu.p()Lgj;")
    public class208 method3545() {
        class208 var1 = this.field3090.field3105;
        if (this.field3090 == var1) {
            this.field3089 = null;
            return null;
        } else {
            this.field3089 = var1.field3105;
            return var1;
        }
    }

    @ObfuscatedName("gu.t()Lgj;")
    public class208 method3538() {
        class208 var1 = this.field3089;
        if (this.field3090 == var1) {
            this.field3089 = null;
            return null;
        } else {
            this.field3089 = var1.field3106;
            return var1;
        }
    }

    @ObfuscatedName("gu.w()Lgj;")
    public class208 method3547() {
        class208 var1 = this.field3089;
        if (this.field3090 == var1) {
            this.field3089 = null;
            return null;
        } else {
            this.field3089 = var1.field3105;
            return var1;
        }
    }
}

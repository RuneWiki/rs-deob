package deob;

@ObfuscatedName("gd")
public class class199 {

    @ObfuscatedName("gd.a")
    public class208 field3095 = new class208();

    @ObfuscatedName("gd.r")
    public class208 field3094;

    public class199() {
        this.field3095.field3111 = this.field3095;
        this.field3095.field3110 = this.field3095;
    }

    @ObfuscatedName("gd.a()V")
    public void method3569() {
        while (true) {
            class208 var1 = this.field3095.field3111;
            if (this.field3095 == var1) {
                this.field3094 = null;
                return;
            }
            var1.method3661();
        }
    }

    @ObfuscatedName("gd.r(Lgs;)V")
    public void method3570(class208 arg0) {
        if (arg0.field3110 != null) {
            arg0.method3661();
        }
        arg0.field3110 = this.field3095.field3110;
        arg0.field3111 = this.field3095;
        arg0.field3110.field3111 = arg0;
        arg0.field3111.field3110 = arg0;
    }

    @ObfuscatedName("gd.f(Lgs;)V")
    public void method3571(class208 arg0) {
        if (arg0.field3110 != null) {
            arg0.method3661();
        }
        arg0.field3110 = this.field3095;
        arg0.field3111 = this.field3095.field3111;
        arg0.field3110.field3111 = arg0;
        arg0.field3111.field3110 = arg0;
    }

    @ObfuscatedName("gd.s(Lgs;Lgs;)V")
    public static void method3590(class208 arg0, class208 arg1) {
        if (arg0.field3110 != null) {
            arg0.method3661();
        }
        arg0.field3110 = arg1.field3110;
        arg0.field3111 = arg1;
        arg0.field3110.field3111 = arg0;
        arg0.field3111.field3110 = arg0;
    }

    @ObfuscatedName("gd.y()Lgs;")
    public class208 method3581() {
        class208 var1 = this.field3095.field3111;
        if (this.field3095 == var1) {
            return null;
        } else {
            var1.method3661();
            return var1;
        }
    }

    @ObfuscatedName("gd.e()Lgs;")
    public class208 method3574() {
        class208 var1 = this.field3095.field3110;
        if (this.field3095 == var1) {
            return null;
        } else {
            var1.method3661();
            return var1;
        }
    }

    @ObfuscatedName("gd.g()Lgs;")
    public class208 method3575() {
        class208 var1 = this.field3095.field3111;
        if (this.field3095 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3111;
            return var1;
        }
    }

    @ObfuscatedName("gd.m()Lgs;")
    public class208 method3587() {
        class208 var1 = this.field3095.field3110;
        if (this.field3095 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3110;
            return var1;
        }
    }

    @ObfuscatedName("gd.j()Lgs;")
    public class208 method3576() {
        class208 var1 = this.field3094;
        if (this.field3095 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3111;
            return var1;
        }
    }

    @ObfuscatedName("gd.n()Lgs;")
    public class208 method3578() {
        class208 var1 = this.field3094;
        if (this.field3095 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3110;
            return var1;
        }
    }
}

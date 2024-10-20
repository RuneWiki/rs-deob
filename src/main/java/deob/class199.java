package deob;

@ObfuscatedName("gp")
public class class199 {

    @ObfuscatedName("gp.n")
    public class208 field3095 = new class208();

    @ObfuscatedName("gp.q")
    public class208 field3094;

    public class199() {
        this.field3095.field3110 = this.field3095;
        this.field3095.field3111 = this.field3095;
    }

    @ObfuscatedName("gp.n()V")
    public void method3543() {
        while (true) {
            class208 var1 = this.field3095.field3110;
            if (this.field3095 == var1) {
                this.field3094 = null;
                return;
            }
            var1.method3651();
        }
    }

    @ObfuscatedName("gp.q(Lga;)V")
    public void method3544(class208 arg0) {
        if (arg0.field3111 != null) {
            arg0.method3651();
        }
        arg0.field3111 = this.field3095.field3111;
        arg0.field3110 = this.field3095;
        arg0.field3111.field3110 = arg0;
        arg0.field3110.field3111 = arg0;
    }

    @ObfuscatedName("gp.c(Lga;)V")
    public void method3554(class208 arg0) {
        if (arg0.field3111 != null) {
            arg0.method3651();
        }
        arg0.field3111 = this.field3095;
        arg0.field3110 = this.field3095.field3110;
        arg0.field3111.field3110 = arg0;
        arg0.field3110.field3111 = arg0;
    }

    @ObfuscatedName("gp.l(Lga;Lga;)V")
    public static void method3553(class208 arg0, class208 arg1) {
        if (arg0.field3111 != null) {
            arg0.method3651();
        }
        arg0.field3111 = arg1.field3111;
        arg0.field3110 = arg1;
        arg0.field3111.field3110 = arg0;
        arg0.field3110.field3111 = arg0;
    }

    @ObfuscatedName("gp.r()Lga;")
    public class208 method3547() {
        class208 var1 = this.field3095.field3110;
        if (this.field3095 == var1) {
            return null;
        } else {
            var1.method3651();
            return var1;
        }
    }

    @ObfuscatedName("gp.u()Lga;")
    public class208 method3548() {
        class208 var1 = this.field3095.field3111;
        if (this.field3095 == var1) {
            return null;
        } else {
            var1.method3651();
            return var1;
        }
    }

    @ObfuscatedName("gp.j()Lga;")
    public class208 method3549() {
        class208 var1 = this.field3095.field3110;
        if (this.field3095 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3110;
            return var1;
        }
    }

    @ObfuscatedName("gp.w()Lga;")
    public class208 method3570() {
        class208 var1 = this.field3095.field3111;
        if (this.field3095 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3111;
            return var1;
        }
    }

    @ObfuscatedName("gp.y()Lga;")
    public class208 method3550() {
        class208 var1 = this.field3094;
        if (this.field3095 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3110;
            return var1;
        }
    }

    @ObfuscatedName("gp.o()Lga;")
    public class208 method3551() {
        class208 var1 = this.field3094;
        if (this.field3095 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3111;
            return var1;
        }
    }
}

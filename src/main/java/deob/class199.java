package deob;

@ObfuscatedName("gm")
public class class199 {

    @ObfuscatedName("gm.k")
    public class208 field3093 = new class208();

    @ObfuscatedName("gm.h")
    public class208 field3094;

    public class199() {
        this.field3093.field3110 = this.field3093;
        this.field3093.field3109 = this.field3093;
    }

    @ObfuscatedName("gm.k()V")
    public void method3576() {
        while (true) {
            class208 var1 = this.field3093.field3110;
            if (this.field3093 == var1) {
                this.field3094 = null;
                return;
            }
            var1.method3679();
        }
    }

    @ObfuscatedName("gm.h(Lgp;)V")
    public void method3588(class208 arg0) {
        if (arg0.field3109 != null) {
            arg0.method3679();
        }
        arg0.field3109 = this.field3093.field3109;
        arg0.field3110 = this.field3093;
        arg0.field3109.field3110 = arg0;
        arg0.field3110.field3109 = arg0;
    }

    @ObfuscatedName("gm.o(Lgp;)V")
    public void method3577(class208 arg0) {
        if (arg0.field3109 != null) {
            arg0.method3679();
        }
        arg0.field3109 = this.field3093;
        arg0.field3110 = this.field3093.field3110;
        arg0.field3109.field3110 = arg0;
        arg0.field3110.field3109 = arg0;
    }

    @ObfuscatedName("gm.z(Lgp;Lgp;)V")
    public static void method3598(class208 arg0, class208 arg1) {
        if (arg0.field3109 != null) {
            arg0.method3679();
        }
        arg0.field3109 = arg1.field3109;
        arg0.field3110 = arg1;
        arg0.field3109.field3110 = arg0;
        arg0.field3110.field3109 = arg0;
    }

    @ObfuscatedName("gm.c()Lgp;")
    public class208 method3580() {
        class208 var1 = this.field3093.field3110;
        if (this.field3093 == var1) {
            return null;
        } else {
            var1.method3679();
            return var1;
        }
    }

    @ObfuscatedName("gm.d()Lgp;")
    public class208 method3579() {
        class208 var1 = this.field3093.field3109;
        if (this.field3093 == var1) {
            return null;
        } else {
            var1.method3679();
            return var1;
        }
    }

    @ObfuscatedName("gm.l()Lgp;")
    public class208 method3581() {
        class208 var1 = this.field3093.field3110;
        if (this.field3093 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3110;
            return var1;
        }
    }

    @ObfuscatedName("gm.b()Lgp;")
    public class208 method3578() {
        class208 var1 = this.field3093.field3109;
        if (this.field3093 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3109;
            return var1;
        }
    }

    @ObfuscatedName("gm.j()Lgp;")
    public class208 method3583() {
        class208 var1 = this.field3094;
        if (this.field3093 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3110;
            return var1;
        }
    }

    @ObfuscatedName("gm.f()Lgp;")
    public class208 method3584() {
        class208 var1 = this.field3094;
        if (this.field3093 == var1) {
            this.field3094 = null;
            return null;
        } else {
            this.field3094 = var1.field3109;
            return var1;
        }
    }
}

package deob;

@ObfuscatedName("gq")
public class class189 {

    @ObfuscatedName("gq.q")
    public class198 field2942 = new class198();

    @ObfuscatedName("gq.s")
    public class198 field2941;

    public class189() {
        this.field2942.field2959 = this.field2942;
        this.field2942.field2957 = this.field2942;
    }

    @ObfuscatedName("gq.q()V")
    public void method3303() {
        while (true) {
            class198 var1 = this.field2942.field2959;
            if (this.field2942 == var1) {
                this.field2941 = null;
                return;
            }
            var1.method3404();
        }
    }

    @ObfuscatedName("gq.s(Lgw;)V")
    public void method3327(class198 arg0) {
        if (arg0.field2957 != null) {
            arg0.method3404();
        }
        arg0.field2957 = this.field2942.field2957;
        arg0.field2959 = this.field2942;
        arg0.field2957.field2959 = arg0;
        arg0.field2959.field2957 = arg0;
    }

    @ObfuscatedName("gq.h(Lgw;)V")
    public void method3305(class198 arg0) {
        if (arg0.field2957 != null) {
            arg0.method3404();
        }
        arg0.field2957 = this.field2942;
        arg0.field2959 = this.field2942.field2959;
        arg0.field2957.field2959 = arg0;
        arg0.field2959.field2957 = arg0;
    }

    @ObfuscatedName("gq.e(Lgw;Lgw;)V")
    public static void method3340(class198 arg0, class198 arg1) {
        if (arg0.field2957 != null) {
            arg0.method3404();
        }
        arg0.field2957 = arg1.field2957;
        arg0.field2959 = arg1;
        arg0.field2957.field2959 = arg0;
        arg0.field2959.field2957 = arg0;
    }

    @ObfuscatedName("gq.n()Lgw;")
    public class198 method3307() {
        class198 var1 = this.field2942.field2959;
        if (this.field2942 == var1) {
            return null;
        } else {
            var1.method3404();
            return var1;
        }
    }

    @ObfuscatedName("gq.t()Lgw;")
    public class198 method3319() {
        class198 var1 = this.field2942.field2957;
        if (this.field2942 == var1) {
            return null;
        } else {
            var1.method3404();
            return var1;
        }
    }

    @ObfuscatedName("gq.l()Lgw;")
    public class198 method3309() {
        class198 var1 = this.field2942.field2959;
        if (this.field2942 == var1) {
            this.field2941 = null;
            return null;
        } else {
            this.field2941 = var1.field2959;
            return var1;
        }
    }

    @ObfuscatedName("gq.m()Lgw;")
    public class198 method3314() {
        class198 var1 = this.field2942.field2957;
        if (this.field2942 == var1) {
            this.field2941 = null;
            return null;
        } else {
            this.field2941 = var1.field2957;
            return var1;
        }
    }

    @ObfuscatedName("gq.o()Lgw;")
    public class198 method3311() {
        class198 var1 = this.field2941;
        if (this.field2942 == var1) {
            this.field2941 = null;
            return null;
        } else {
            this.field2941 = var1.field2959;
            return var1;
        }
    }

    @ObfuscatedName("gq.k()Lgw;")
    public class198 method3318() {
        class198 var1 = this.field2941;
        if (this.field2942 == var1) {
            this.field2941 = null;
            return null;
        } else {
            this.field2941 = var1.field2957;
            return var1;
        }
    }
}

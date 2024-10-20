package deob;

@ObfuscatedName("gw")
public class class205 {

    @ObfuscatedName("gw.s")
    public class204 field2588 = new class204();

    @ObfuscatedName("gw.g")
    public class204 field2587;

    public class205() {
        this.field2588.field2584 = this.field2588;
        this.field2588.field2586 = this.field2588;
    }

    @ObfuscatedName("gw.s()V")
    public void method3746() {
        while (true) {
            class204 var1 = this.field2588.field2584;
            if (this.field2588 == var1) {
                this.field2587 = null;
                return;
            }
            var1.method3740();
        }
    }

    @ObfuscatedName("gw.g(Lgf;)V")
    public void method3747(class204 arg0) {
        if (arg0.field2586 != null) {
            arg0.method3740();
        }
        arg0.field2586 = this.field2588.field2586;
        arg0.field2584 = this.field2588;
        arg0.field2586.field2584 = arg0;
        arg0.field2584.field2586 = arg0;
    }

    @ObfuscatedName("gw.m(Lgf;)V")
    public void method3748(class204 arg0) {
        if (arg0.field2586 != null) {
            arg0.method3740();
        }
        arg0.field2586 = this.field2588;
        arg0.field2584 = this.field2588.field2584;
        arg0.field2586.field2584 = arg0;
        arg0.field2584.field2586 = arg0;
    }

    @ObfuscatedName("gw.h(Lgf;Lgf;)V")
    public static void method3749(class204 arg0, class204 arg1) {
        if (arg0.field2586 != null) {
            arg0.method3740();
        }
        arg0.field2586 = arg1.field2586;
        arg0.field2584 = arg1;
        arg0.field2586.field2584 = arg0;
        arg0.field2584.field2586 = arg0;
    }

    @ObfuscatedName("gw.i()Lgf;")
    public class204 method3750() {
        class204 var1 = this.field2588.field2584;
        if (this.field2588 == var1) {
            return null;
        } else {
            var1.method3740();
            return var1;
        }
    }

    @ObfuscatedName("gw.w()Lgf;")
    public class204 method3751() {
        class204 var1 = this.field2588.field2586;
        if (this.field2588 == var1) {
            return null;
        } else {
            var1.method3740();
            return var1;
        }
    }

    @ObfuscatedName("gw.t()Lgf;")
    public class204 method3752() {
        class204 var1 = this.field2588.field2584;
        if (this.field2588 == var1) {
            this.field2587 = null;
            return null;
        } else {
            this.field2587 = var1.field2584;
            return var1;
        }
    }

    @ObfuscatedName("gw.d()Lgf;")
    public class204 method3753() {
        class204 var1 = this.field2588.field2586;
        if (this.field2588 == var1) {
            this.field2587 = null;
            return null;
        } else {
            this.field2587 = var1.field2586;
            return var1;
        }
    }

    @ObfuscatedName("gw.z()Lgf;")
    public class204 method3762() {
        class204 var1 = this.field2587;
        if (this.field2588 == var1) {
            this.field2587 = null;
            return null;
        } else {
            this.field2587 = var1.field2584;
            return var1;
        }
    }

    @ObfuscatedName("gw.k()Lgf;")
    public class204 method3745() {
        class204 var1 = this.field2587;
        if (this.field2588 == var1) {
            this.field2587 = null;
            return null;
        } else {
            this.field2587 = var1.field2586;
            return var1;
        }
    }
}

package deob;

@ObfuscatedName("gy")
public class class194 {

    @ObfuscatedName("gy.p")
    public class193 field2485 = new class193();

    @ObfuscatedName("gy.m")
    public class193 field2486;

    public class194() {
        this.field2485.field2484 = this.field2485;
        this.field2485.field2482 = this.field2485;
    }

    @ObfuscatedName("gy.p()V")
    public void method3246() {
        while (true) {
            class193 var1 = this.field2485.field2484;
            if (this.field2485 == var1) {
                this.field2486 = null;
                return;
            }
            var1.method3234();
        }
    }

    @ObfuscatedName("gy.m(Lgw;)V")
    public void method3270(class193 arg0) {
        if (arg0.field2482 != null) {
            arg0.method3234();
        }
        arg0.field2482 = this.field2485.field2482;
        arg0.field2484 = this.field2485;
        arg0.field2482.field2484 = arg0;
        arg0.field2484.field2482 = arg0;
    }

    @ObfuscatedName("gy.e(Lgw;)V")
    public void method3266(class193 arg0) {
        if (arg0.field2482 != null) {
            arg0.method3234();
        }
        arg0.field2482 = this.field2485;
        arg0.field2484 = this.field2485.field2484;
        arg0.field2482.field2484 = arg0;
        arg0.field2484.field2482 = arg0;
    }

    @ObfuscatedName("gy.t(Lgw;Lgw;)V")
    public static void method3283(class193 arg0, class193 arg1) {
        if (arg0.field2482 != null) {
            arg0.method3234();
        }
        arg0.field2482 = arg1.field2482;
        arg0.field2484 = arg1;
        arg0.field2482.field2484 = arg0;
        arg0.field2484.field2482 = arg0;
    }

    @ObfuscatedName("gy.w()Lgw;")
    public class193 method3250() {
        class193 var1 = this.field2485.field2484;
        if (this.field2485 == var1) {
            return null;
        } else {
            var1.method3234();
            return var1;
        }
    }

    @ObfuscatedName("gy.z()Lgw;")
    public class193 method3278() {
        class193 var1 = this.field2485.field2482;
        if (this.field2485 == var1) {
            return null;
        } else {
            var1.method3234();
            return var1;
        }
    }

    @ObfuscatedName("gy.j()Lgw;")
    public class193 method3252() {
        class193 var1 = this.field2485.field2484;
        if (this.field2485 == var1) {
            this.field2486 = null;
            return null;
        } else {
            this.field2486 = var1.field2484;
            return var1;
        }
    }

    @ObfuscatedName("gy.c()Lgw;")
    public class193 method3253() {
        class193 var1 = this.field2485.field2482;
        if (this.field2485 == var1) {
            this.field2486 = null;
            return null;
        } else {
            this.field2486 = var1.field2482;
            return var1;
        }
    }

    @ObfuscatedName("gy.o()Lgw;")
    public class193 method3277() {
        class193 var1 = this.field2486;
        if (this.field2485 == var1) {
            this.field2486 = null;
            return null;
        } else {
            this.field2486 = var1.field2484;
            return var1;
        }
    }

    @ObfuscatedName("gy.q()Lgw;")
    public class193 method3255() {
        class193 var1 = this.field2486;
        if (this.field2485 == var1) {
            this.field2486 = null;
            return null;
        } else {
            this.field2486 = var1.field2482;
            return var1;
        }
    }
}

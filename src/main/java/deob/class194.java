package deob;

@ObfuscatedName("gs")
public class class194 {

    @ObfuscatedName("gs.n")
    public class193 field2486 = new class193();

    @ObfuscatedName("gs.p")
    public class193 field2485;

    public class194() {
        this.field2486.field2482 = this.field2486;
        this.field2486.field2484 = this.field2486;
    }

    @ObfuscatedName("gs.n()V")
    public void method3351() {
        while (true) {
            class193 var1 = this.field2486.field2482;
            if (this.field2486 == var1) {
                this.field2485 = null;
                return;
            }
            var1.method3347();
        }
    }

    @ObfuscatedName("gs.p(Lgr;)V")
    public void method3384(class193 arg0) {
        if (arg0.field2484 != null) {
            arg0.method3347();
        }
        arg0.field2484 = this.field2486.field2484;
        arg0.field2482 = this.field2486;
        arg0.field2484.field2482 = arg0;
        arg0.field2482.field2484 = arg0;
    }

    @ObfuscatedName("gs.i(Lgr;)V")
    public void method3353(class193 arg0) {
        if (arg0.field2484 != null) {
            arg0.method3347();
        }
        arg0.field2484 = this.field2486;
        arg0.field2482 = this.field2486.field2482;
        arg0.field2484.field2482 = arg0;
        arg0.field2482.field2484 = arg0;
    }

    @ObfuscatedName("gs.j(Lgr;Lgr;)V")
    public static void method3350(class193 arg0, class193 arg1) {
        if (arg0.field2484 != null) {
            arg0.method3347();
        }
        arg0.field2484 = arg1.field2484;
        arg0.field2482 = arg1;
        arg0.field2484.field2482 = arg0;
        arg0.field2482.field2484 = arg0;
    }

    @ObfuscatedName("gs.f()Lgr;")
    public class193 method3354() {
        class193 var1 = this.field2486.field2482;
        if (this.field2486 == var1) {
            return null;
        } else {
            var1.method3347();
            return var1;
        }
    }

    @ObfuscatedName("gs.m()Lgr;")
    public class193 method3356() {
        class193 var1 = this.field2486.field2484;
        if (this.field2486 == var1) {
            return null;
        } else {
            var1.method3347();
            return var1;
        }
    }

    @ObfuscatedName("gs.c()Lgr;")
    public class193 method3372() {
        class193 var1 = this.field2486.field2482;
        if (this.field2486 == var1) {
            this.field2485 = null;
            return null;
        } else {
            this.field2485 = var1.field2482;
            return var1;
        }
    }

    @ObfuscatedName("gs.z()Lgr;")
    public class193 method3379() {
        class193 var1 = this.field2486.field2484;
        if (this.field2486 == var1) {
            this.field2485 = null;
            return null;
        } else {
            this.field2485 = var1.field2484;
            return var1;
        }
    }

    @ObfuscatedName("gs.h()Lgr;")
    public class193 method3358() {
        class193 var1 = this.field2485;
        if (this.field2486 == var1) {
            this.field2485 = null;
            return null;
        } else {
            this.field2485 = var1.field2482;
            return var1;
        }
    }

    @ObfuscatedName("gs.g()Lgr;")
    public class193 method3359() {
        class193 var1 = this.field2485;
        if (this.field2486 == var1) {
            this.field2485 = null;
            return null;
        } else {
            this.field2485 = var1.field2484;
            return var1;
        }
    }
}

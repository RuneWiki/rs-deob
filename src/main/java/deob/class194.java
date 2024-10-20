package deob;

@ObfuscatedName("gs")
public class class194 {

    @ObfuscatedName("gs.i")
    public class193 field2483 = new class193();

    @ObfuscatedName("gs.c")
    public class193 field2484;

    public class194() {
        this.field2483.field2481 = this.field2483;
        this.field2483.field2482 = this.field2483;
    }

    @ObfuscatedName("gs.i()V")
    public void method3287() {
        while (true) {
            class193 var1 = this.field2483.field2481;
            if (this.field2483 == var1) {
                this.field2484 = null;
                return;
            }
            var1.method3278();
        }
    }

    @ObfuscatedName("gs.c(Lgz;)V")
    public void method3289(class193 arg0) {
        if (arg0.field2482 != null) {
            arg0.method3278();
        }
        arg0.field2482 = this.field2483.field2482;
        arg0.field2481 = this.field2483;
        arg0.field2482.field2481 = arg0;
        arg0.field2481.field2482 = arg0;
    }

    @ObfuscatedName("gs.e(Lgz;)V")
    public void method3290(class193 arg0) {
        if (arg0.field2482 != null) {
            arg0.method3278();
        }
        arg0.field2482 = this.field2483;
        arg0.field2481 = this.field2483.field2481;
        arg0.field2482.field2481 = arg0;
        arg0.field2481.field2482 = arg0;
    }

    @ObfuscatedName("gs.v(Lgz;Lgz;)V")
    public static void method3291(class193 arg0, class193 arg1) {
        if (arg0.field2482 != null) {
            arg0.method3278();
        }
        arg0.field2482 = arg1.field2482;
        arg0.field2481 = arg1;
        arg0.field2482.field2481 = arg0;
        arg0.field2481.field2482 = arg0;
    }

    @ObfuscatedName("gs.b()Lgz;")
    public class193 method3313() {
        class193 var1 = this.field2483.field2481;
        if (this.field2483 == var1) {
            return null;
        } else {
            var1.method3278();
            return var1;
        }
    }

    @ObfuscatedName("gs.y()Lgz;")
    public class193 method3293() {
        class193 var1 = this.field2483.field2482;
        if (this.field2483 == var1) {
            return null;
        } else {
            var1.method3278();
            return var1;
        }
    }

    @ObfuscatedName("gs.h()Lgz;")
    public class193 method3294() {
        class193 var1 = this.field2483.field2481;
        if (this.field2483 == var1) {
            this.field2484 = null;
            return null;
        } else {
            this.field2484 = var1.field2481;
            return var1;
        }
    }

    @ObfuscatedName("gs.x()Lgz;")
    public class193 method3292() {
        class193 var1 = this.field2483.field2482;
        if (this.field2483 == var1) {
            this.field2484 = null;
            return null;
        } else {
            this.field2484 = var1.field2482;
            return var1;
        }
    }

    @ObfuscatedName("gs.f()Lgz;")
    public class193 method3296() {
        class193 var1 = this.field2484;
        if (this.field2483 == var1) {
            this.field2484 = null;
            return null;
        } else {
            this.field2484 = var1.field2481;
            return var1;
        }
    }

    @ObfuscatedName("gs.n()Lgz;")
    public class193 method3300() {
        class193 var1 = this.field2484;
        if (this.field2483 == var1) {
            this.field2484 = null;
            return null;
        } else {
            this.field2484 = var1.field2482;
            return var1;
        }
    }
}

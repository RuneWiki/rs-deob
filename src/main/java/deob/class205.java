package deob;

@ObfuscatedName("gy")
public class class205 {

    @ObfuscatedName("gy.p")
    public class204 field2565 = new class204();

    @ObfuscatedName("gy.i")
    public class204 field2564;

    public class205() {
        this.field2565.field2562 = this.field2565;
        this.field2565.field2561 = this.field2565;
    }

    @ObfuscatedName("gy.p()V")
    public void method3586() {
        while (true) {
            class204 var1 = this.field2565.field2562;
            if (this.field2565 == var1) {
                this.field2564 = null;
                return;
            }
            var1.method3561();
        }
    }

    @ObfuscatedName("gy.i(Lgw;)V")
    public void method3572(class204 arg0) {
        if (arg0.field2561 != null) {
            arg0.method3561();
        }
        arg0.field2561 = this.field2565.field2561;
        arg0.field2562 = this.field2565;
        arg0.field2561.field2562 = arg0;
        arg0.field2562.field2561 = arg0;
    }

    @ObfuscatedName("gy.w(Lgw;)V")
    public void method3567(class204 arg0) {
        if (arg0.field2561 != null) {
            arg0.method3561();
        }
        arg0.field2561 = this.field2565;
        arg0.field2562 = this.field2565.field2562;
        arg0.field2561.field2562 = arg0;
        arg0.field2562.field2561 = arg0;
    }

    @ObfuscatedName("gy.s(Lgw;Lgw;)V")
    public static void method3569(class204 arg0, class204 arg1) {
        if (arg0.field2561 != null) {
            arg0.method3561();
        }
        arg0.field2561 = arg1.field2561;
        arg0.field2562 = arg1;
        arg0.field2561.field2562 = arg0;
        arg0.field2562.field2561 = arg0;
    }

    @ObfuscatedName("gy.j()Lgw;")
    public class204 method3570() {
        class204 var1 = this.field2565.field2562;
        if (this.field2565 == var1) {
            return null;
        } else {
            var1.method3561();
            return var1;
        }
    }

    @ObfuscatedName("gy.a()Lgw;")
    public class204 method3571() {
        class204 var1 = this.field2565.field2561;
        if (this.field2565 == var1) {
            return null;
        } else {
            var1.method3561();
            return var1;
        }
    }

    @ObfuscatedName("gy.t()Lgw;")
    public class204 method3581() {
        class204 var1 = this.field2565.field2562;
        if (this.field2565 == var1) {
            this.field2564 = null;
            return null;
        } else {
            this.field2564 = var1.field2562;
            return var1;
        }
    }

    @ObfuscatedName("gy.r()Lgw;")
    public class204 method3573() {
        class204 var1 = this.field2565.field2561;
        if (this.field2565 == var1) {
            this.field2564 = null;
            return null;
        } else {
            this.field2564 = var1.field2561;
            return var1;
        }
    }

    @ObfuscatedName("gy.m()Lgw;")
    public class204 method3597() {
        class204 var1 = this.field2564;
        if (this.field2565 == var1) {
            this.field2564 = null;
            return null;
        } else {
            this.field2564 = var1.field2562;
            return var1;
        }
    }

    @ObfuscatedName("gy.h()Lgw;")
    public class204 method3574() {
        class204 var1 = this.field2564;
        if (this.field2565 == var1) {
            this.field2564 = null;
            return null;
        } else {
            this.field2564 = var1.field2561;
            return var1;
        }
    }
}

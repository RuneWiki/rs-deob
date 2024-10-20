package deob;

@ObfuscatedName("gi")
public class class205 {

    @ObfuscatedName("gi.n")
    public class204 field2599 = new class204();

    @ObfuscatedName("gi.v")
    public class204 field2600;

    public class205() {
        this.field2599.field2598 = this.field2599;
        this.field2599.field2596 = this.field2599;
    }

    @ObfuscatedName("gi.n()V")
    public void method3486() {
        while (true) {
            class204 var1 = this.field2599.field2598;
            if (this.field2599 == var1) {
                this.field2600 = null;
                return;
            }
            var1.method3474();
        }
    }

    @ObfuscatedName("gi.v(Lgw;)V")
    public void method3482(class204 arg0) {
        if (arg0.field2596 != null) {
            arg0.method3474();
        }
        arg0.field2596 = this.field2599.field2596;
        arg0.field2598 = this.field2599;
        arg0.field2596.field2598 = arg0;
        arg0.field2598.field2596 = arg0;
    }

    @ObfuscatedName("gi.y(Lgw;)V")
    public void method3483(class204 arg0) {
        if (arg0.field2596 != null) {
            arg0.method3474();
        }
        arg0.field2596 = this.field2599;
        arg0.field2598 = this.field2599.field2598;
        arg0.field2596.field2598 = arg0;
        arg0.field2598.field2596 = arg0;
    }

    @ObfuscatedName("gi.r(Lgw;Lgw;)V")
    public static void method3484(class204 arg0, class204 arg1) {
        if (arg0.field2596 != null) {
            arg0.method3474();
        }
        arg0.field2596 = arg1.field2596;
        arg0.field2598 = arg1;
        arg0.field2596.field2598 = arg0;
        arg0.field2598.field2596 = arg0;
    }

    @ObfuscatedName("gi.h()Lgw;")
    public class204 method3485() {
        class204 var1 = this.field2599.field2598;
        if (this.field2599 == var1) {
            return null;
        } else {
            var1.method3474();
            return var1;
        }
    }

    @ObfuscatedName("gi.d()Lgw;")
    public class204 method3511() {
        class204 var1 = this.field2599.field2596;
        if (this.field2599 == var1) {
            return null;
        } else {
            var1.method3474();
            return var1;
        }
    }

    @ObfuscatedName("gi.s()Lgw;")
    public class204 method3492() {
        class204 var1 = this.field2599.field2598;
        if (this.field2599 == var1) {
            this.field2600 = null;
            return null;
        } else {
            this.field2600 = var1.field2598;
            return var1;
        }
    }

    @ObfuscatedName("gi.b()Lgw;")
    public class204 method3490() {
        class204 var1 = this.field2599.field2596;
        if (this.field2599 == var1) {
            this.field2600 = null;
            return null;
        } else {
            this.field2600 = var1.field2596;
            return var1;
        }
    }

    @ObfuscatedName("gi.e()Lgw;")
    public class204 method3481() {
        class204 var1 = this.field2600;
        if (this.field2599 == var1) {
            this.field2600 = null;
            return null;
        } else {
            this.field2600 = var1.field2598;
            return var1;
        }
    }

    @ObfuscatedName("gi.f()Lgw;")
    public class204 method3506() {
        class204 var1 = this.field2600;
        if (this.field2599 == var1) {
            this.field2600 = null;
            return null;
        } else {
            this.field2600 = var1.field2596;
            return var1;
        }
    }
}

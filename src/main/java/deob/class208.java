package deob;

@ObfuscatedName("gs")
public class class208 {

    @ObfuscatedName("gs.f")
    public class207 field2498 = new class207();

    @ObfuscatedName("gs.l")
    public class207 field2499;

    public class208() {
        this.field2498.field2495 = this.field2498;
        this.field2498.field2496 = this.field2498;
    }

    @ObfuscatedName("gs.f()V")
    public void method3844() {
        while (true) {
            class207 var1 = this.field2498.field2495;
            if (this.field2498 == var1) {
                this.field2499 = null;
                return;
            }
            var1.method3818();
        }
    }

    @ObfuscatedName("gs.l(Lgu;)V")
    public void method3823(class207 arg0) {
        if (arg0.field2496 != null) {
            arg0.method3818();
        }
        arg0.field2496 = this.field2498.field2496;
        arg0.field2495 = this.field2498;
        arg0.field2496.field2495 = arg0;
        arg0.field2495.field2496 = arg0;
    }

    @ObfuscatedName("gs.w(Lgu;)V")
    public void method3824(class207 arg0) {
        if (arg0.field2496 != null) {
            arg0.method3818();
        }
        arg0.field2496 = this.field2498;
        arg0.field2495 = this.field2498.field2495;
        arg0.field2496.field2495 = arg0;
        arg0.field2495.field2496 = arg0;
    }

    @ObfuscatedName("gs.s(Lgu;Lgu;)V")
    public static void method3845(class207 arg0, class207 arg1) {
        if (arg0.field2496 != null) {
            arg0.method3818();
        }
        arg0.field2496 = arg1.field2496;
        arg0.field2495 = arg1;
        arg0.field2496.field2495 = arg0;
        arg0.field2495.field2496 = arg0;
    }

    @ObfuscatedName("gs.e()Lgu;")
    public class207 method3822() {
        class207 var1 = this.field2498.field2495;
        if (this.field2498 == var1) {
            return null;
        } else {
            var1.method3818();
            return var1;
        }
    }

    @ObfuscatedName("gs.c()Lgu;")
    public class207 method3826() {
        class207 var1 = this.field2498.field2496;
        if (this.field2498 == var1) {
            return null;
        } else {
            var1.method3818();
            return var1;
        }
    }

    @ObfuscatedName("gs.p()Lgu;")
    public class207 method3827() {
        class207 var1 = this.field2498.field2495;
        if (this.field2498 == var1) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.field2495;
            return var1;
        }
    }

    @ObfuscatedName("gs.r()Lgu;")
    public class207 method3828() {
        class207 var1 = this.field2498.field2496;
        if (this.field2498 == var1) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.field2496;
            return var1;
        }
    }

    @ObfuscatedName("gs.m()Lgu;")
    public class207 method3829() {
        class207 var1 = this.field2499;
        if (this.field2498 == var1) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.field2495;
            return var1;
        }
    }

    @ObfuscatedName("gs.d()Lgu;")
    public class207 method3830() {
        class207 var1 = this.field2499;
        if (this.field2498 == var1) {
            this.field2499 = null;
            return null;
        } else {
            this.field2499 = var1.field2496;
            return var1;
        }
    }
}

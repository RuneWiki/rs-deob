package deob;

@ObfuscatedName("gi")
public class class208 {

    @ObfuscatedName("gi.g")
    public class207 field2499 = new class207();

    @ObfuscatedName("gi.r")
    public class207 field2500;

    public class208() {
        this.field2499.field2496 = this.field2499;
        this.field2499.field2498 = this.field2499;
    }

    @ObfuscatedName("gi.g()V")
    public void method3956() {
        while (true) {
            class207 var1 = this.field2499.field2496;
            if (this.field2499 == var1) {
                this.field2500 = null;
                return;
            }
            var1.method3952();
        }
    }

    @ObfuscatedName("gi.r(Lgy;)V")
    public void method3957(class207 arg0) {
        if (arg0.field2498 != null) {
            arg0.method3952();
        }
        arg0.field2498 = this.field2499.field2498;
        arg0.field2496 = this.field2499;
        arg0.field2498.field2496 = arg0;
        arg0.field2496.field2498 = arg0;
    }

    @ObfuscatedName("gi.e(Lgy;)V")
    public void method3958(class207 arg0) {
        if (arg0.field2498 != null) {
            arg0.method3952();
        }
        arg0.field2498 = this.field2499;
        arg0.field2496 = this.field2499.field2496;
        arg0.field2498.field2496 = arg0;
        arg0.field2496.field2498 = arg0;
    }

    @ObfuscatedName("gi.q(Lgy;Lgy;)V")
    public static void method3988(class207 arg0, class207 arg1) {
        if (arg0.field2498 != null) {
            arg0.method3952();
        }
        arg0.field2498 = arg1.field2498;
        arg0.field2496 = arg1;
        arg0.field2498.field2496 = arg0;
        arg0.field2496.field2498 = arg0;
    }

    @ObfuscatedName("gi.c()Lgy;")
    public class207 method3960() {
        class207 var1 = this.field2499.field2496;
        if (this.field2499 == var1) {
            return null;
        } else {
            var1.method3952();
            return var1;
        }
    }

    @ObfuscatedName("gi.i()Lgy;")
    public class207 method3961() {
        class207 var1 = this.field2499.field2498;
        if (this.field2499 == var1) {
            return null;
        } else {
            var1.method3952();
            return var1;
        }
    }

    @ObfuscatedName("gi.p()Lgy;")
    public class207 method3979() {
        class207 var1 = this.field2499.field2496;
        if (this.field2499 == var1) {
            this.field2500 = null;
            return null;
        } else {
            this.field2500 = var1.field2496;
            return var1;
        }
    }

    @ObfuscatedName("gi.m()Lgy;")
    public class207 method3955() {
        class207 var1 = this.field2499.field2498;
        if (this.field2499 == var1) {
            this.field2500 = null;
            return null;
        } else {
            this.field2500 = var1.field2498;
            return var1;
        }
    }

    @ObfuscatedName("gi.d()Lgy;")
    public class207 method3964() {
        class207 var1 = this.field2500;
        if (this.field2499 == var1) {
            this.field2500 = null;
            return null;
        } else {
            this.field2500 = var1.field2496;
            return var1;
        }
    }

    @ObfuscatedName("gi.j()Lgy;")
    public class207 method3976() {
        class207 var1 = this.field2500;
        if (this.field2499 == var1) {
            this.field2500 = null;
            return null;
        } else {
            this.field2500 = var1.field2498;
            return var1;
        }
    }
}

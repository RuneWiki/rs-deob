package deob;

@ObfuscatedName("hl")
public class class213 {

    @ObfuscatedName("hl.n")
    public class212 field2504 = new class212();

    @ObfuscatedName("hl.h")
    public class212 field2503;

    public class213() {
        this.field2504.field2500 = this.field2504;
        this.field2504.field2501 = this.field2504;
    }

    @ObfuscatedName("hl.n()V")
    public void method3980() {
        while (true) {
            class212 var1 = this.field2504.field2500;
            if (this.field2504 == var1) {
                this.field2503 = null;
                return;
            }
            var1.method3973();
        }
    }

    @ObfuscatedName("hl.h(Lhv;)V")
    public void method3981(class212 arg0) {
        if (arg0.field2501 != null) {
            arg0.method3973();
        }
        arg0.field2501 = this.field2504.field2501;
        arg0.field2500 = this.field2504;
        arg0.field2501.field2500 = arg0;
        arg0.field2500.field2501 = arg0;
    }

    @ObfuscatedName("hl.l(Lhv;)V")
    public void method3982(class212 arg0) {
        if (arg0.field2501 != null) {
            arg0.method3973();
        }
        arg0.field2501 = this.field2504;
        arg0.field2500 = this.field2504.field2500;
        arg0.field2501.field2500 = arg0;
        arg0.field2500.field2501 = arg0;
    }

    @ObfuscatedName("hl.g(Lhv;Lhv;)V")
    public static void method3983(class212 arg0, class212 arg1) {
        if (arg0.field2501 != null) {
            arg0.method3973();
        }
        arg0.field2501 = arg1.field2501;
        arg0.field2500 = arg1;
        arg0.field2501.field2500 = arg0;
        arg0.field2500.field2501 = arg0;
    }

    @ObfuscatedName("hl.b()Lhv;")
    public class212 method3984() {
        class212 var1 = this.field2504.field2500;
        if (this.field2504 == var1) {
            return null;
        } else {
            var1.method3973();
            return var1;
        }
    }

    @ObfuscatedName("hl.a()Lhv;")
    public class212 method3985() {
        class212 var1 = this.field2504.field2501;
        if (this.field2504 == var1) {
            return null;
        } else {
            var1.method3973();
            return var1;
        }
    }

    @ObfuscatedName("hl.c()Lhv;")
    public class212 method3986() {
        class212 var1 = this.field2504.field2500;
        if (this.field2504 == var1) {
            this.field2503 = null;
            return null;
        } else {
            this.field2503 = var1.field2500;
            return var1;
        }
    }

    @ObfuscatedName("hl.z()Lhv;")
    public class212 method4003() {
        class212 var1 = this.field2504.field2501;
        if (this.field2504 == var1) {
            this.field2503 = null;
            return null;
        } else {
            this.field2503 = var1.field2501;
            return var1;
        }
    }

    @ObfuscatedName("hl.j()Lhv;")
    public class212 method3988() {
        class212 var1 = this.field2503;
        if (this.field2504 == var1) {
            this.field2503 = null;
            return null;
        } else {
            this.field2503 = var1.field2500;
            return var1;
        }
    }

    @ObfuscatedName("hl.d()Lhv;")
    public class212 method3989() {
        class212 var1 = this.field2503;
        if (this.field2504 == var1) {
            this.field2503 = null;
            return null;
        } else {
            this.field2503 = var1.field2501;
            return var1;
        }
    }
}

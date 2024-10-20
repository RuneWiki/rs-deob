package deob;

@ObfuscatedName("jd")
public class class262 {

    @ObfuscatedName("jd.u")
    public class181 field3540 = new class181();

    @ObfuscatedName("jd.f")
    public class181 field3539;

    public class262() {
        this.field3540.field2127 = this.field3540;
        this.field3540.field2128 = this.field3540;
    }

    @ObfuscatedName("jd.u()V")
    public void method4578() {
        while (true) {
            class181 var1 = this.field3540.field2127;
            if (this.field3540 == var1) {
                this.field3539 = null;
                return;
            }
            var1.method3332();
        }
    }

    @ObfuscatedName("jd.f(Lfb;)V")
    public void method4563(class181 arg0) {
        if (arg0.field2128 != null) {
            arg0.method3332();
        }
        arg0.field2128 = this.field3540.field2128;
        arg0.field2127 = this.field3540;
        arg0.field2128.field2127 = arg0;
        arg0.field2127.field2128 = arg0;
    }

    @ObfuscatedName("jd.b(Lfb;)V")
    public void method4564(class181 arg0) {
        if (arg0.field2128 != null) {
            arg0.method3332();
        }
        arg0.field2128 = this.field3540;
        arg0.field2127 = this.field3540.field2127;
        arg0.field2128.field2127 = arg0;
        arg0.field2127.field2128 = arg0;
    }

    @ObfuscatedName("jd.g(Lfb;Lfb;)V")
    public static void method4565(class181 arg0, class181 arg1) {
        if (arg0.field2128 != null) {
            arg0.method3332();
        }
        arg0.field2128 = arg1.field2128;
        arg0.field2127 = arg1;
        arg0.field2128.field2127 = arg0;
        arg0.field2127.field2128 = arg0;
    }

    @ObfuscatedName("jd.z()Lfb;")
    public class181 method4566() {
        class181 var1 = this.field3540.field2127;
        if (this.field3540 == var1) {
            return null;
        } else {
            var1.method3332();
            return var1;
        }
    }

    @ObfuscatedName("jd.p()Lfb;")
    public class181 method4567() {
        class181 var1 = this.field3540.field2128;
        if (this.field3540 == var1) {
            return null;
        } else {
            var1.method3332();
            return var1;
        }
    }

    @ObfuscatedName("jd.h()Lfb;")
    public class181 method4568() {
        class181 var1 = this.field3540.field2127;
        if (this.field3540 == var1) {
            this.field3539 = null;
            return null;
        } else {
            this.field3539 = var1.field2127;
            return var1;
        }
    }

    @ObfuscatedName("jd.y()Lfb;")
    public class181 method4569() {
        class181 var1 = this.field3540.field2128;
        if (this.field3540 == var1) {
            this.field3539 = null;
            return null;
        } else {
            this.field3539 = var1.field2128;
            return var1;
        }
    }

    @ObfuscatedName("jd.w()Lfb;")
    public class181 method4561() {
        class181 var1 = this.field3539;
        if (this.field3540 == var1) {
            this.field3539 = null;
            return null;
        } else {
            this.field3539 = var1.field2127;
            return var1;
        }
    }

    @ObfuscatedName("jd.i()Lfb;")
    public class181 method4597() {
        class181 var1 = this.field3539;
        if (this.field3540 == var1) {
            this.field3539 = null;
            return null;
        } else {
            this.field3539 = var1.field2128;
            return var1;
        }
    }
}

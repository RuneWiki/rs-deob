package deob;

@ObfuscatedName("jc")
public class class262 {

    @ObfuscatedName("jc.s")
    public class181 field3514 = new class181();

    @ObfuscatedName("jc.j")
    public class181 field3515;

    public class262() {
        this.field3514.field2097 = this.field3514;
        this.field3514.field2095 = this.field3514;
    }

    @ObfuscatedName("jc.s()V")
    public void method4473() {
        while (true) {
            class181 var1 = this.field3514.field2097;
            if (this.field3514 == var1) {
                this.field3515 = null;
                return;
            }
            var1.method3304();
        }
    }

    @ObfuscatedName("jc.j(Lfb;)V")
    public void method4475(class181 arg0) {
        if (arg0.field2095 != null) {
            arg0.method3304();
        }
        arg0.field2095 = this.field3514.field2095;
        arg0.field2097 = this.field3514;
        arg0.field2095.field2097 = arg0;
        arg0.field2097.field2095 = arg0;
    }

    @ObfuscatedName("jc.i(Lfb;)V")
    public void method4476(class181 arg0) {
        if (arg0.field2095 != null) {
            arg0.method3304();
        }
        arg0.field2095 = this.field3514;
        arg0.field2097 = this.field3514.field2097;
        arg0.field2095.field2097 = arg0;
        arg0.field2097.field2095 = arg0;
    }

    @ObfuscatedName("jc.k(Lfb;Lfb;)V")
    public static void method4496(class181 arg0, class181 arg1) {
        if (arg0.field2095 != null) {
            arg0.method3304();
        }
        arg0.field2095 = arg1.field2095;
        arg0.field2097 = arg1;
        arg0.field2095.field2097 = arg0;
        arg0.field2097.field2095 = arg0;
    }

    @ObfuscatedName("jc.u()Lfb;")
    public class181 method4478() {
        class181 var1 = this.field3514.field2097;
        if (this.field3514 == var1) {
            return null;
        } else {
            var1.method3304();
            return var1;
        }
    }

    @ObfuscatedName("jc.n()Lfb;")
    public class181 method4479() {
        class181 var1 = this.field3514.field2095;
        if (this.field3514 == var1) {
            return null;
        } else {
            var1.method3304();
            return var1;
        }
    }

    @ObfuscatedName("jc.t()Lfb;")
    public class181 method4480() {
        class181 var1 = this.field3514.field2097;
        if (this.field3514 == var1) {
            this.field3515 = null;
            return null;
        } else {
            this.field3515 = var1.field2097;
            return var1;
        }
    }

    @ObfuscatedName("jc.q()Lfb;")
    public class181 method4481() {
        class181 var1 = this.field3514.field2095;
        if (this.field3514 == var1) {
            this.field3515 = null;
            return null;
        } else {
            this.field3515 = var1.field2095;
            return var1;
        }
    }

    @ObfuscatedName("jc.x()Lfb;")
    public class181 method4491() {
        class181 var1 = this.field3515;
        if (this.field3514 == var1) {
            this.field3515 = null;
            return null;
        } else {
            this.field3515 = var1.field2097;
            return var1;
        }
    }

    @ObfuscatedName("jc.d()Lfb;")
    public class181 method4483() {
        class181 var1 = this.field3515;
        if (this.field3514 == var1) {
            this.field3515 = null;
            return null;
        } else {
            this.field3515 = var1.field2095;
            return var1;
        }
    }
}

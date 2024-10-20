package deob;

@ObfuscatedName("ld")
public class class335 {

    @ObfuscatedName("ld.v")
    public class409 field4082 = new class409();

    @ObfuscatedName("ld.c")
    public class409 field4083;

    public class335() {
        this.field4082.field4411 = this.field4082;
        this.field4082.field4412 = this.field4082;
    }

    @ObfuscatedName("ld.v()V")
    public void method5526() {
        while (true) {
            class409 var1 = this.field4082.field4411;
            if (this.field4082 == var1) {
                this.field4083 = null;
                return;
            }
            var1.method6503();
        }
    }

    @ObfuscatedName("ld.c(Loq;)V")
    public void method5530(class409 arg0) {
        if (arg0.field4412 != null) {
            arg0.method6503();
        }
        arg0.field4412 = this.field4082.field4412;
        arg0.field4411 = this.field4082;
        arg0.field4412.field4411 = arg0;
        arg0.field4411.field4412 = arg0;
    }

    @ObfuscatedName("ld.i(Loq;)V")
    public void method5528(class409 arg0) {
        if (arg0.field4412 != null) {
            arg0.method6503();
        }
        arg0.field4412 = this.field4082;
        arg0.field4411 = this.field4082.field4411;
        arg0.field4412.field4411 = arg0;
        arg0.field4411.field4412 = arg0;
    }

    @ObfuscatedName("ld.f(Loq;Loq;)V")
    public static void method5529(class409 arg0, class409 arg1) {
        if (arg0.field4412 != null) {
            arg0.method6503();
        }
        arg0.field4412 = arg1.field4412;
        arg0.field4411 = arg1;
        arg0.field4412.field4411 = arg0;
        arg0.field4411.field4412 = arg0;
    }

    @ObfuscatedName("ld.b()Loq;")
    public class409 method5525() {
        class409 var1 = this.field4082.field4411;
        if (this.field4082 == var1) {
            return null;
        } else {
            var1.method6503();
            return var1;
        }
    }

    @ObfuscatedName("ld.n()Loq;")
    public class409 method5531() {
        class409 var1 = this.field4082.field4412;
        if (this.field4082 == var1) {
            return null;
        } else {
            var1.method6503();
            return var1;
        }
    }

    @ObfuscatedName("ld.s()Loq;")
    public class409 method5540() {
        class409 var1 = this.field4082.field4411;
        if (this.field4082 == var1) {
            this.field4083 = null;
            return null;
        } else {
            this.field4083 = var1.field4411;
            return var1;
        }
    }

    @ObfuscatedName("ld.l()Loq;")
    public class409 method5548() {
        class409 var1 = this.field4082.field4412;
        if (this.field4082 == var1) {
            this.field4083 = null;
            return null;
        } else {
            this.field4083 = var1.field4412;
            return var1;
        }
    }

    @ObfuscatedName("ld.q()Loq;")
    public class409 method5534() {
        class409 var1 = this.field4083;
        if (this.field4082 == var1) {
            this.field4083 = null;
            return null;
        } else {
            this.field4083 = var1.field4411;
            return var1;
        }
    }

    @ObfuscatedName("ld.o()Loq;")
    public class409 method5536() {
        class409 var1 = this.field4083;
        if (this.field4082 == var1) {
            this.field4083 = null;
            return null;
        } else {
            this.field4083 = var1.field4412;
            return var1;
        }
    }
}

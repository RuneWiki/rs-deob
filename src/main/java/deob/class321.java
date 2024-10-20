package deob;

@ObfuscatedName("lh")
public class class321 {

    @ObfuscatedName("lh.c")
    public class387 field3962 = new class387();

    @ObfuscatedName("lh.b")
    public class387 field3963;

    public class321() {
        this.field3962.field4258 = this.field3962;
        this.field3962.field4259 = this.field3962;
    }

    @ObfuscatedName("lh.c()V")
    public void method5309() {
        while (true) {
            class387 var1 = this.field3962.field4258;
            if (this.field3962 == var1) {
                this.field3963 = null;
                return;
            }
            var1.method6163();
        }
    }

    @ObfuscatedName("lh.b(Lnw;)V")
    public void method5296(class387 arg0) {
        if (arg0.field4259 != null) {
            arg0.method6163();
        }
        arg0.field4259 = this.field3962.field4259;
        arg0.field4258 = this.field3962;
        arg0.field4259.field4258 = arg0;
        arg0.field4258.field4259 = arg0;
    }

    @ObfuscatedName("lh.p(Lnw;)V")
    public void method5297(class387 arg0) {
        if (arg0.field4259 != null) {
            arg0.method6163();
        }
        arg0.field4259 = this.field3962;
        arg0.field4258 = this.field3962.field4258;
        arg0.field4259.field4258 = arg0;
        arg0.field4258.field4259 = arg0;
    }

    @ObfuscatedName("lh.m(Lnw;Lnw;)V")
    public static void method5298(class387 arg0, class387 arg1) {
        if (arg0.field4259 != null) {
            arg0.method6163();
        }
        arg0.field4259 = arg1.field4259;
        arg0.field4258 = arg1;
        arg0.field4259.field4258 = arg0;
        arg0.field4258.field4259 = arg0;
    }

    @ObfuscatedName("lh.t()Lnw;")
    public class387 method5299() {
        class387 var1 = this.field3962.field4258;
        if (this.field3962 == var1) {
            return null;
        } else {
            var1.method6163();
            return var1;
        }
    }

    @ObfuscatedName("lh.s()Lnw;")
    public class387 method5304() {
        class387 var1 = this.field3962.field4259;
        if (this.field3962 == var1) {
            return null;
        } else {
            var1.method6163();
            return var1;
        }
    }

    @ObfuscatedName("lh.j()Lnw;")
    public class387 method5301() {
        class387 var1 = this.field3962.field4258;
        if (this.field3962 == var1) {
            this.field3963 = null;
            return null;
        } else {
            this.field3963 = var1.field4258;
            return var1;
        }
    }

    @ObfuscatedName("lh.w()Lnw;")
    public class387 method5302() {
        class387 var1 = this.field3962.field4259;
        if (this.field3962 == var1) {
            this.field3963 = null;
            return null;
        } else {
            this.field3963 = var1.field4259;
            return var1;
        }
    }

    @ObfuscatedName("lh.n()Lnw;")
    public class387 method5303() {
        class387 var1 = this.field3963;
        if (this.field3962 == var1) {
            this.field3963 = null;
            return null;
        } else {
            this.field3963 = var1.field4258;
            return var1;
        }
    }

    @ObfuscatedName("lh.r()Lnw;")
    public class387 method5315() {
        class387 var1 = this.field3963;
        if (this.field3962 == var1) {
            this.field3963 = null;
            return null;
        } else {
            this.field3963 = var1.field4259;
            return var1;
        }
    }
}

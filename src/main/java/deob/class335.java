package deob;

@ObfuscatedName("lm")
public class class335 {

    @ObfuscatedName("lm.s")
    public class411 field4126 = new class411();

    @ObfuscatedName("lm.h")
    public class411 field4125;

    public class335() {
        this.field4126.field4469 = this.field4126;
        this.field4126.field4470 = this.field4126;
    }

    @ObfuscatedName("lm.s()V")
    public void method5438() {
        while (true) {
            class411 var1 = this.field4126.field4469;
            if (this.field4126 == var1) {
                this.field4125 = null;
                return;
            }
            var1.method6409();
        }
    }

    @ObfuscatedName("lm.h(Lon;)V")
    public void method5425(class411 arg0) {
        if (arg0.field4470 != null) {
            arg0.method6409();
        }
        arg0.field4470 = this.field4126.field4470;
        arg0.field4469 = this.field4126;
        arg0.field4470.field4469 = arg0;
        arg0.field4469.field4470 = arg0;
    }

    @ObfuscatedName("lm.w(Lon;)V")
    public void method5427(class411 arg0) {
        if (arg0.field4470 != null) {
            arg0.method6409();
        }
        arg0.field4470 = this.field4126;
        arg0.field4469 = this.field4126.field4469;
        arg0.field4470.field4469 = arg0;
        arg0.field4469.field4470 = arg0;
    }

    @ObfuscatedName("lm.v(Lon;Lon;)V")
    public static void method5428(class411 arg0, class411 arg1) {
        if (arg0.field4470 != null) {
            arg0.method6409();
        }
        arg0.field4470 = arg1.field4470;
        arg0.field4469 = arg1;
        arg0.field4470.field4469 = arg0;
        arg0.field4469.field4470 = arg0;
    }

    @ObfuscatedName("lm.c()Lon;")
    public class411 method5457() {
        class411 var1 = this.field4126.field4469;
        if (this.field4126 == var1) {
            return null;
        } else {
            var1.method6409();
            return var1;
        }
    }

    @ObfuscatedName("lm.q()Lon;")
    public class411 method5430() {
        class411 var1 = this.field4126.field4470;
        if (this.field4126 == var1) {
            return null;
        } else {
            var1.method6409();
            return var1;
        }
    }

    @ObfuscatedName("lm.i()Lon;")
    public class411 method5442() {
        class411 var1 = this.field4126.field4469;
        if (this.field4126 == var1) {
            this.field4125 = null;
            return null;
        } else {
            this.field4125 = var1.field4469;
            return var1;
        }
    }

    @ObfuscatedName("lm.k()Lon;")
    public class411 method5424() {
        class411 var1 = this.field4126.field4470;
        if (this.field4126 == var1) {
            this.field4125 = null;
            return null;
        } else {
            this.field4125 = var1.field4470;
            return var1;
        }
    }

    @ObfuscatedName("lm.o()Lon;")
    public class411 method5426() {
        class411 var1 = this.field4125;
        if (this.field4126 == var1) {
            this.field4125 = null;
            return null;
        } else {
            this.field4125 = var1.field4469;
            return var1;
        }
    }

    @ObfuscatedName("lm.n()Lon;")
    public class411 method5434() {
        class411 var1 = this.field4125;
        if (this.field4126 == var1) {
            this.field4125 = null;
            return null;
        } else {
            this.field4125 = var1.field4470;
            return var1;
        }
    }
}

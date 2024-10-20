package deob;

@ObfuscatedName("mo")
public class class356 {

    @ObfuscatedName("mo.f")
    public class440 field4344 = new class440();

    @ObfuscatedName("mo.w")
    public class440 field4345;

    public class356() {
        this.field4344.field4710 = this.field4344;
        this.field4344.field4709 = this.field4344;
    }

    @ObfuscatedName("mo.f()V")
    public void method6235() {
        while (true) {
            class440 var1 = this.field4344.field4710;
            if (this.field4344 == var1) {
                this.field4345 = null;
                return;
            }
            var1.method7431();
        }
    }

    @ObfuscatedName("mo.w(Lpr;)V")
    public void method6236(class440 arg0) {
        if (arg0.field4709 != null) {
            arg0.method7431();
        }
        arg0.field4709 = this.field4344.field4709;
        arg0.field4710 = this.field4344;
        arg0.field4709.field4710 = arg0;
        arg0.field4710.field4709 = arg0;
    }

    @ObfuscatedName("mo.v(Lpr;)V")
    public void method6237(class440 arg0) {
        if (arg0.field4709 != null) {
            arg0.method7431();
        }
        arg0.field4709 = this.field4344;
        arg0.field4710 = this.field4344.field4710;
        arg0.field4709.field4710 = arg0;
        arg0.field4710.field4709 = arg0;
    }

    @ObfuscatedName("mo.s(Lpr;Lpr;)V")
    public static void method6262(class440 arg0, class440 arg1) {
        if (arg0.field4709 != null) {
            arg0.method7431();
        }
        arg0.field4709 = arg1.field4709;
        arg0.field4710 = arg1;
        arg0.field4709.field4710 = arg0;
        arg0.field4710.field4709 = arg0;
    }

    @ObfuscatedName("mo.z()Lpr;")
    public class440 method6239() {
        class440 var1 = this.field4344.field4710;
        if (this.field4344 == var1) {
            return null;
        } else {
            var1.method7431();
            return var1;
        }
    }

    @ObfuscatedName("mo.j()Lpr;")
    public class440 method6266() {
        class440 var1 = this.field4344.field4709;
        if (this.field4344 == var1) {
            return null;
        } else {
            var1.method7431();
            return var1;
        }
    }

    @ObfuscatedName("mo.i()Lpr;")
    public class440 method6241() {
        class440 var1 = this.field4344.field4710;
        if (this.field4344 == var1) {
            this.field4345 = null;
            return null;
        } else {
            this.field4345 = var1.field4710;
            return var1;
        }
    }

    @ObfuscatedName("mo.n()Lpr;")
    public class440 method6238() {
        class440 var1 = this.field4344.field4709;
        if (this.field4344 == var1) {
            this.field4345 = null;
            return null;
        } else {
            this.field4345 = var1.field4709;
            return var1;
        }
    }

    @ObfuscatedName("mo.l()Lpr;")
    public class440 method6248() {
        class440 var1 = this.field4345;
        if (this.field4344 == var1) {
            this.field4345 = null;
            return null;
        } else {
            this.field4345 = var1.field4710;
            return var1;
        }
    }

    @ObfuscatedName("mo.k()Lpr;")
    public class440 method6243() {
        class440 var1 = this.field4345;
        if (this.field4344 == var1) {
            this.field4345 = null;
            return null;
        } else {
            this.field4345 = var1.field4709;
            return var1;
        }
    }
}

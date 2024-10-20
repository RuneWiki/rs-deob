package deob;

@ObfuscatedName("gd")
public class class208 {

    @ObfuscatedName("gd.f")
    public class207 field2488 = new class207();

    @ObfuscatedName("gd.h")
    public class207 field2489;

    public class208() {
        this.field2488.field2487 = this.field2488;
        this.field2488.field2485 = this.field2488;
    }

    @ObfuscatedName("gd.f()V")
    public void method3815() {
        while (true) {
            class207 var1 = this.field2488.field2487;
            if (this.field2488 == var1) {
                this.field2489 = null;
                return;
            }
            var1.method3812();
        }
    }

    @ObfuscatedName("gd.h(Lgf;)V")
    public void method3831(class207 arg0) {
        if (arg0.field2485 != null) {
            arg0.method3812();
        }
        arg0.field2485 = this.field2488.field2485;
        arg0.field2487 = this.field2488;
        arg0.field2485.field2487 = arg0;
        arg0.field2487.field2485 = arg0;
    }

    @ObfuscatedName("gd.e(Lgf;)V")
    public void method3816(class207 arg0) {
        if (arg0.field2485 != null) {
            arg0.method3812();
        }
        arg0.field2485 = this.field2488;
        arg0.field2487 = this.field2488.field2487;
        arg0.field2485.field2487 = arg0;
        arg0.field2487.field2485 = arg0;
    }

    @ObfuscatedName("gd.b(Lgf;Lgf;)V")
    public static void method3817(class207 arg0, class207 arg1) {
        if (arg0.field2485 != null) {
            arg0.method3812();
        }
        arg0.field2485 = arg1.field2485;
        arg0.field2487 = arg1;
        arg0.field2485.field2487 = arg0;
        arg0.field2487.field2485 = arg0;
    }

    @ObfuscatedName("gd.l()Lgf;")
    public class207 method3818() {
        class207 var1 = this.field2488.field2487;
        if (this.field2488 == var1) {
            return null;
        } else {
            var1.method3812();
            return var1;
        }
    }

    @ObfuscatedName("gd.w()Lgf;")
    public class207 method3819() {
        class207 var1 = this.field2488.field2485;
        if (this.field2488 == var1) {
            return null;
        } else {
            var1.method3812();
            return var1;
        }
    }

    @ObfuscatedName("gd.d()Lgf;")
    public class207 method3823() {
        class207 var1 = this.field2488.field2487;
        if (this.field2488 == var1) {
            this.field2489 = null;
            return null;
        } else {
            this.field2489 = var1.field2487;
            return var1;
        }
    }

    @ObfuscatedName("gd.n()Lgf;")
    public class207 method3821() {
        class207 var1 = this.field2488.field2485;
        if (this.field2488 == var1) {
            this.field2489 = null;
            return null;
        } else {
            this.field2489 = var1.field2485;
            return var1;
        }
    }

    @ObfuscatedName("gd.s()Lgf;")
    public class207 method3822() {
        class207 var1 = this.field2489;
        if (this.field2488 == var1) {
            this.field2489 = null;
            return null;
        } else {
            this.field2489 = var1.field2487;
            return var1;
        }
    }

    @ObfuscatedName("gd.g()Lgf;")
    public class207 method3813() {
        class207 var1 = this.field2489;
        if (this.field2488 == var1) {
            this.field2489 = null;
            return null;
        } else {
            this.field2489 = var1.field2485;
            return var1;
        }
    }
}

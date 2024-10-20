package deob;

@ObfuscatedName("gh")
public class class194 {

    @ObfuscatedName("gh.d")
    public class193 field2489 = new class193();

    @ObfuscatedName("gh.k")
    public class193 field2488;

    public class194() {
        this.field2489.field2485 = this.field2489;
        this.field2489.field2487 = this.field2489;
    }

    @ObfuscatedName("gh.d()V")
    public void method3416() {
        while (true) {
            class193 var1 = this.field2489.field2485;
            if (this.field2489 == var1) {
                this.field2488 = null;
                return;
            }
            var1.method3407();
        }
    }

    @ObfuscatedName("gh.k(Lgs;)V")
    public void method3411(class193 arg0) {
        if (arg0.field2487 != null) {
            arg0.method3407();
        }
        arg0.field2487 = this.field2489.field2487;
        arg0.field2485 = this.field2489;
        arg0.field2487.field2485 = arg0;
        arg0.field2485.field2487 = arg0;
    }

    @ObfuscatedName("gh.e(Lgs;)V")
    public void method3415(class193 arg0) {
        if (arg0.field2487 != null) {
            arg0.method3407();
        }
        arg0.field2487 = this.field2489;
        arg0.field2485 = this.field2489.field2485;
        arg0.field2487.field2485 = arg0;
        arg0.field2485.field2487 = arg0;
    }

    @ObfuscatedName("gh.p(Lgs;Lgs;)V")
    public static void method3413(class193 arg0, class193 arg1) {
        if (arg0.field2487 != null) {
            arg0.method3407();
        }
        arg0.field2487 = arg1.field2487;
        arg0.field2485 = arg1;
        arg0.field2487.field2485 = arg0;
        arg0.field2485.field2487 = arg0;
    }

    @ObfuscatedName("gh.q()Lgs;")
    public class193 method3414() {
        class193 var1 = this.field2489.field2485;
        if (this.field2489 == var1) {
            return null;
        } else {
            var1.method3407();
            return var1;
        }
    }

    @ObfuscatedName("gh.s()Lgs;")
    public class193 method3410() {
        class193 var1 = this.field2489.field2487;
        if (this.field2489 == var1) {
            return null;
        } else {
            var1.method3407();
            return var1;
        }
    }

    @ObfuscatedName("gh.r()Lgs;")
    public class193 method3409() {
        class193 var1 = this.field2489.field2485;
        if (this.field2489 == var1) {
            this.field2488 = null;
            return null;
        } else {
            this.field2488 = var1.field2485;
            return var1;
        }
    }

    @ObfuscatedName("gh.g()Lgs;")
    public class193 method3417() {
        class193 var1 = this.field2489.field2487;
        if (this.field2489 == var1) {
            this.field2488 = null;
            return null;
        } else {
            this.field2488 = var1.field2487;
            return var1;
        }
    }

    @ObfuscatedName("gh.v()Lgs;")
    public class193 method3429() {
        class193 var1 = this.field2488;
        if (this.field2489 == var1) {
            this.field2488 = null;
            return null;
        } else {
            this.field2488 = var1.field2485;
            return var1;
        }
    }

    @ObfuscatedName("gh.t()Lgs;")
    public class193 method3419() {
        class193 var1 = this.field2488;
        if (this.field2489 == var1) {
            this.field2488 = null;
            return null;
        } else {
            this.field2488 = var1.field2487;
            return var1;
        }
    }
}

package deob;

@ObfuscatedName("gv")
public class class195 {

    @ObfuscatedName("gv.e")
    public class194 field2455 = new class194();

    @ObfuscatedName("gv.n")
    public class194 field2454;

    public class195() {
        this.field2455.field2452 = this.field2455;
        this.field2455.field2453 = this.field2455;
    }

    @ObfuscatedName("gv.e()V")
    public void method3366() {
        while (true) {
            class194 var1 = this.field2455.field2452;
            if (this.field2455 == var1) {
                this.field2454 = null;
                return;
            }
            var1.method3333();
        }
    }

    @ObfuscatedName("gv.n(Lgx;)V")
    public void method3379(class194 arg0) {
        if (arg0.field2453 != null) {
            arg0.method3333();
        }
        arg0.field2453 = this.field2455.field2453;
        arg0.field2452 = this.field2455;
        arg0.field2453.field2452 = arg0;
        arg0.field2452.field2453 = arg0;
    }

    @ObfuscatedName("gv.g(Lgx;)V")
    public void method3343(class194 arg0) {
        if (arg0.field2453 != null) {
            arg0.method3333();
        }
        arg0.field2453 = this.field2455;
        arg0.field2452 = this.field2455.field2452;
        arg0.field2453.field2452 = arg0;
        arg0.field2452.field2453 = arg0;
    }

    @ObfuscatedName("gv.y(Lgx;Lgx;)V")
    public static void method3345(class194 arg0, class194 arg1) {
        if (arg0.field2453 != null) {
            arg0.method3333();
        }
        arg0.field2453 = arg1.field2453;
        arg0.field2452 = arg1;
        arg0.field2453.field2452 = arg0;
        arg0.field2452.field2453 = arg0;
    }

    @ObfuscatedName("gv.w()Lgx;")
    public class194 method3341() {
        class194 var1 = this.field2455.field2452;
        if (this.field2455 == var1) {
            return null;
        } else {
            var1.method3333();
            return var1;
        }
    }

    @ObfuscatedName("gv.k()Lgx;")
    public class194 method3347() {
        class194 var1 = this.field2455.field2453;
        if (this.field2455 == var1) {
            return null;
        } else {
            var1.method3333();
            return var1;
        }
    }

    @ObfuscatedName("gv.v()Lgx;")
    public class194 method3348() {
        class194 var1 = this.field2455.field2452;
        if (this.field2455 == var1) {
            this.field2454 = null;
            return null;
        } else {
            this.field2454 = var1.field2452;
            return var1;
        }
    }

    @ObfuscatedName("gv.z()Lgx;")
    public class194 method3349() {
        class194 var1 = this.field2455.field2453;
        if (this.field2455 == var1) {
            this.field2454 = null;
            return null;
        } else {
            this.field2454 = var1.field2453;
            return var1;
        }
    }

    @ObfuscatedName("gv.r()Lgx;")
    public class194 method3350() {
        class194 var1 = this.field2454;
        if (this.field2455 == var1) {
            this.field2454 = null;
            return null;
        } else {
            this.field2454 = var1.field2452;
            return var1;
        }
    }

    @ObfuscatedName("gv.u()Lgx;")
    public class194 method3351() {
        class194 var1 = this.field2454;
        if (this.field2455 == var1) {
            this.field2454 = null;
            return null;
        } else {
            this.field2454 = var1.field2453;
            return var1;
        }
    }
}

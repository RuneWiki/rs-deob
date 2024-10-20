package deob;

@ObfuscatedName("gj")
public class class194 {

    @ObfuscatedName("gj.e")
    public class193 field2456 = new class193();

    @ObfuscatedName("gj.o")
    public class193 field2455;

    public class194() {
        this.field2456.field2453 = this.field2456;
        this.field2456.field2452 = this.field2456;
    }

    @ObfuscatedName("gj.e()V")
    public void method3312() {
        while (true) {
            class193 var1 = this.field2456.field2453;
            if (this.field2456 == var1) {
                this.field2455 = null;
                return;
            }
            var1.method3304();
        }
    }

    @ObfuscatedName("gj.o(Lgc;)V")
    public void method3318(class193 arg0) {
        if (arg0.field2452 != null) {
            arg0.method3304();
        }
        arg0.field2452 = this.field2456.field2452;
        arg0.field2453 = this.field2456;
        arg0.field2452.field2453 = arg0;
        arg0.field2453.field2452 = arg0;
    }

    @ObfuscatedName("gj.m(Lgc;)V")
    public void method3314(class193 arg0) {
        if (arg0.field2452 != null) {
            arg0.method3304();
        }
        arg0.field2452 = this.field2456;
        arg0.field2453 = this.field2456.field2453;
        arg0.field2452.field2453 = arg0;
        arg0.field2453.field2452 = arg0;
    }

    @ObfuscatedName("gj.g(Lgc;Lgc;)V")
    public static void method3346(class193 arg0, class193 arg1) {
        if (arg0.field2452 != null) {
            arg0.method3304();
        }
        arg0.field2452 = arg1.field2452;
        arg0.field2453 = arg1;
        arg0.field2452.field2453 = arg0;
        arg0.field2453.field2452 = arg0;
    }

    @ObfuscatedName("gj.d()Lgc;")
    public class193 method3316() {
        class193 var1 = this.field2456.field2453;
        if (this.field2456 == var1) {
            return null;
        } else {
            var1.method3304();
            return var1;
        }
    }

    @ObfuscatedName("gj.b()Lgc;")
    public class193 method3323() {
        class193 var1 = this.field2456.field2452;
        if (this.field2456 == var1) {
            return null;
        } else {
            var1.method3304();
            return var1;
        }
    }

    @ObfuscatedName("gj.k()Lgc;")
    public class193 method3336() {
        class193 var1 = this.field2456.field2453;
        if (this.field2456 == var1) {
            this.field2455 = null;
            return null;
        } else {
            this.field2455 = var1.field2453;
            return var1;
        }
    }

    @ObfuscatedName("gj.q()Lgc;")
    public class193 method3321() {
        class193 var1 = this.field2456.field2452;
        if (this.field2456 == var1) {
            this.field2455 = null;
            return null;
        } else {
            this.field2455 = var1.field2452;
            return var1;
        }
    }

    @ObfuscatedName("gj.h()Lgc;")
    public class193 method3324() {
        class193 var1 = this.field2455;
        if (this.field2456 == var1) {
            this.field2455 = null;
            return null;
        } else {
            this.field2455 = var1.field2453;
            return var1;
        }
    }

    @ObfuscatedName("gj.i()Lgc;")
    public class193 method3317() {
        class193 var1 = this.field2455;
        if (this.field2456 == var1) {
            this.field2455 = null;
            return null;
        } else {
            this.field2455 = var1.field2452;
            return var1;
        }
    }
}

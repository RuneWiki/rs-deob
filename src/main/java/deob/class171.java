package deob;

@ObfuscatedName("fj")
public class class171 {

    @ObfuscatedName("fj.m")
    public class176 field2803 = new class176();

    @ObfuscatedName("fj.k")
    public class176 field2804;

    public class171() {
        this.field2803.field2813 = this.field2803;
        this.field2803.field2811 = this.field2803;
    }

    @ObfuscatedName("fj.m()V")
    public void method3171() {
        while (true) {
            class176 var1 = this.field2803.field2813;
            if (this.field2803 == var1) {
                this.field2804 = null;
                return;
            }
            var1.method3223();
        }
    }

    @ObfuscatedName("fj.k(Lfv;)V")
    public void method3180(class176 arg0) {
        if (arg0.field2811 != null) {
            arg0.method3223();
        }
        arg0.field2811 = this.field2803.field2811;
        arg0.field2813 = this.field2803;
        arg0.field2811.field2813 = arg0;
        arg0.field2813.field2811 = arg0;
    }

    @ObfuscatedName("fj.y(Lfv;)V")
    public void method3176(class176 arg0) {
        if (arg0.field2811 != null) {
            arg0.method3223();
        }
        arg0.field2811 = this.field2803;
        arg0.field2813 = this.field2803.field2813;
        arg0.field2811.field2813 = arg0;
        arg0.field2813.field2811 = arg0;
    }

    @ObfuscatedName("fj.g(Lfv;Lfv;)V")
    public static void method3175(class176 arg0, class176 arg1) {
        if (arg0.field2811 != null) {
            arg0.method3223();
        }
        arg0.field2811 = arg1.field2811;
        arg0.field2813 = arg1;
        arg0.field2811.field2813 = arg0;
        arg0.field2813.field2811 = arg0;
    }

    @ObfuscatedName("fj.r()Lfv;")
    public class176 method3182() {
        class176 var1 = this.field2803.field2813;
        if (this.field2803 == var1) {
            return null;
        } else {
            var1.method3223();
            return var1;
        }
    }

    @ObfuscatedName("fj.i()Lfv;")
    public class176 method3177() {
        class176 var1 = this.field2803.field2811;
        if (this.field2803 == var1) {
            return null;
        } else {
            var1.method3223();
            return var1;
        }
    }

    @ObfuscatedName("fj.f()Lfv;")
    public class176 method3178() {
        class176 var1 = this.field2803.field2813;
        if (this.field2803 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2813;
            return var1;
        }
    }

    @ObfuscatedName("fj.a()Lfv;")
    public class176 method3186() {
        class176 var1 = this.field2803.field2811;
        if (this.field2803 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2811;
            return var1;
        }
    }

    @ObfuscatedName("fj.w()Lfv;")
    public class176 method3179() {
        class176 var1 = this.field2804;
        if (this.field2803 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2813;
            return var1;
        }
    }

    @ObfuscatedName("fj.u()Lfv;")
    public class176 method3173() {
        class176 var1 = this.field2804;
        if (this.field2803 == var1) {
            this.field2804 = null;
            return null;
        } else {
            this.field2804 = var1.field2811;
            return var1;
        }
    }
}

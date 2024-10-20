package deob;

@ObfuscatedName("fv")
public class class176 {

    @ObfuscatedName("fv.p")
    public class178 field2805 = new class178();

    @ObfuscatedName("fv.j")
    public class178 field2806;

    public class176() {
        this.field2805.field2810 = this.field2805;
        this.field2805.field2811 = this.field2805;
    }

    @ObfuscatedName("fv.p()V")
    public void method3287() {
        while (true) {
            class178 var1 = this.field2805.field2810;
            if (this.field2805 == var1) {
                this.field2806 = null;
                return;
            }
            var1.method3327();
        }
    }

    @ObfuscatedName("fv.j(Lfi;)V")
    public void method3305(class178 arg0) {
        if (arg0.field2811 != null) {
            arg0.method3327();
        }
        arg0.field2811 = this.field2805.field2811;
        arg0.field2810 = this.field2805;
        arg0.field2811.field2810 = arg0;
        arg0.field2810.field2811 = arg0;
    }

    @ObfuscatedName("fv.w(Lfi;)V")
    public void method3281(class178 arg0) {
        if (arg0.field2811 != null) {
            arg0.method3327();
        }
        arg0.field2811 = this.field2805;
        arg0.field2810 = this.field2805.field2810;
        arg0.field2811.field2810 = arg0;
        arg0.field2810.field2811 = arg0;
    }

    @ObfuscatedName("fv.h(Lfi;Lfi;)V")
    public static void method3282(class178 arg0, class178 arg1) {
        if (arg0.field2811 != null) {
            arg0.method3327();
        }
        arg0.field2811 = arg1.field2811;
        arg0.field2810 = arg1;
        arg0.field2811.field2810 = arg0;
        arg0.field2810.field2811 = arg0;
    }

    @ObfuscatedName("fv.v()Lfi;")
    public class178 method3283() {
        class178 var1 = this.field2805.field2810;
        if (this.field2805 == var1) {
            return null;
        } else {
            var1.method3327();
            return var1;
        }
    }

    @ObfuscatedName("fv.k()Lfi;")
    public class178 method3284() {
        class178 var1 = this.field2805.field2811;
        if (this.field2805 == var1) {
            return null;
        } else {
            var1.method3327();
            return var1;
        }
    }

    @ObfuscatedName("fv.g()Lfi;")
    public class178 method3285() {
        class178 var1 = this.field2805.field2810;
        if (this.field2805 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2810;
            return var1;
        }
    }

    @ObfuscatedName("fv.n()Lfi;")
    public class178 method3286() {
        class178 var1 = this.field2805.field2811;
        if (this.field2805 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2811;
            return var1;
        }
    }

    @ObfuscatedName("fv.c()Lfi;")
    public class178 method3299() {
        class178 var1 = this.field2806;
        if (this.field2805 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2810;
            return var1;
        }
    }

    @ObfuscatedName("fv.o()Lfi;")
    public class178 method3309() {
        class178 var1 = this.field2806;
        if (this.field2805 == var1) {
            this.field2806 = null;
            return null;
        } else {
            this.field2806 = var1.field2811;
            return var1;
        }
    }
}

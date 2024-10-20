package deob;

@ObfuscatedName("fe")
public class class177 {

    @ObfuscatedName("fe.a")
    public class179 field2811 = new class179();

    @ObfuscatedName("fe.r")
    public class179 field2812;

    public class177() {
        this.field2811.field2816 = this.field2811;
        this.field2811.field2815 = this.field2811;
    }

    @ObfuscatedName("fe.a()V")
    public void method3270() {
        while (true) {
            class179 var1 = this.field2811.field2816;
            if (this.field2811 == var1) {
                this.field2812 = null;
                return;
            }
            var1.method3311();
        }
    }

    @ObfuscatedName("fe.r(Lfs;)V")
    public void method3271(class179 arg0) {
        if (arg0.field2815 != null) {
            arg0.method3311();
        }
        arg0.field2815 = this.field2811.field2815;
        arg0.field2816 = this.field2811;
        arg0.field2815.field2816 = arg0;
        arg0.field2816.field2815 = arg0;
    }

    @ObfuscatedName("fe.u(Lfs;)V")
    public void method3272(class179 arg0) {
        if (arg0.field2815 != null) {
            arg0.method3311();
        }
        arg0.field2815 = this.field2811;
        arg0.field2816 = this.field2811.field2816;
        arg0.field2815.field2816 = arg0;
        arg0.field2816.field2815 = arg0;
    }

    @ObfuscatedName("fe.t(Lfs;Lfs;)V")
    public static void method3273(class179 arg0, class179 arg1) {
        if (arg0.field2815 != null) {
            arg0.method3311();
        }
        arg0.field2815 = arg1.field2815;
        arg0.field2816 = arg1;
        arg0.field2815.field2816 = arg0;
        arg0.field2816.field2815 = arg0;
    }

    @ObfuscatedName("fe.k()Lfs;")
    public class179 method3285() {
        class179 var1 = this.field2811.field2816;
        if (this.field2811 == var1) {
            return null;
        } else {
            var1.method3311();
            return var1;
        }
    }

    @ObfuscatedName("fe.x()Lfs;")
    public class179 method3296() {
        class179 var1 = this.field2811.field2815;
        if (this.field2811 == var1) {
            return null;
        } else {
            var1.method3311();
            return var1;
        }
    }

    @ObfuscatedName("fe.v()Lfs;")
    public class179 method3276() {
        class179 var1 = this.field2811.field2816;
        if (this.field2811 == var1) {
            this.field2812 = null;
            return null;
        } else {
            this.field2812 = var1.field2816;
            return var1;
        }
    }

    @ObfuscatedName("fe.g()Lfs;")
    public class179 method3277() {
        class179 var1 = this.field2811.field2815;
        if (this.field2811 == var1) {
            this.field2812 = null;
            return null;
        } else {
            this.field2812 = var1.field2815;
            return var1;
        }
    }

    @ObfuscatedName("fe.n()Lfs;")
    public class179 method3278() {
        class179 var1 = this.field2812;
        if (this.field2811 == var1) {
            this.field2812 = null;
            return null;
        } else {
            this.field2812 = var1.field2816;
            return var1;
        }
    }

    @ObfuscatedName("fe.q()Lfs;")
    public class179 method3297() {
        class179 var1 = this.field2812;
        if (this.field2811 == var1) {
            this.field2812 = null;
            return null;
        } else {
            this.field2812 = var1.field2815;
            return var1;
        }
    }
}

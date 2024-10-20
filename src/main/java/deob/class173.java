package deob;

@ObfuscatedName("fz")
public class class173 {

    @ObfuscatedName("fz.g")
    public class178 field2800 = new class178();

    @ObfuscatedName("fz.m")
    public class178 field2799;

    public class173() {
        this.field2800.field2811 = this.field2800;
        this.field2800.field2812 = this.field2800;
    }

    @ObfuscatedName("fz.g(Lfg;)V")
    public void method3279(class178 arg0) {
        if (arg0.field2812 != null) {
            arg0.method3342();
        }
        arg0.field2812 = this.field2800.field2812;
        arg0.field2811 = this.field2800;
        arg0.field2812.field2811 = arg0;
        arg0.field2811.field2812 = arg0;
    }

    @ObfuscatedName("fz.m()Lfg;")
    public class178 method3280() {
        class178 var1 = this.field2800.field2811;
        if (this.field2800 == var1) {
            this.field2799 = null;
            return null;
        } else {
            this.field2799 = var1.field2811;
            return var1;
        }
    }

    @ObfuscatedName("fz.v()Lfg;")
    public class178 method3286() {
        class178 var1 = this.field2799;
        if (this.field2800 == var1) {
            this.field2799 = null;
            return null;
        } else {
            this.field2799 = var1.field2811;
            return var1;
        }
    }
}

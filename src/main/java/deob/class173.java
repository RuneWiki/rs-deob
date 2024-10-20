package deob;

@ObfuscatedName("fr")
public class class173 {

    @ObfuscatedName("fr.b")
    public class178 field2811 = new class178();

    @ObfuscatedName("fr.c")
    public class178 field2812;

    public class173() {
        this.field2811.field2824 = this.field2811;
        this.field2811.field2823 = this.field2811;
    }

    @ObfuscatedName("fr.b(Lfm;)V")
    public void method3218(class178 arg0) {
        if (arg0.field2823 != null) {
            arg0.method3279();
        }
        arg0.field2823 = this.field2811.field2823;
        arg0.field2824 = this.field2811;
        arg0.field2823.field2824 = arg0;
        arg0.field2824.field2823 = arg0;
    }

    @ObfuscatedName("fr.c()Lfm;")
    public class178 method3217() {
        class178 var1 = this.field2811.field2824;
        if (this.field2811 == var1) {
            this.field2812 = null;
            return null;
        } else {
            this.field2812 = var1.field2824;
            return var1;
        }
    }

    @ObfuscatedName("fr.j()Lfm;")
    public class178 method3221() {
        class178 var1 = this.field2812;
        if (this.field2811 == var1) {
            this.field2812 = null;
            return null;
        } else {
            this.field2812 = var1.field2824;
            return var1;
        }
    }
}

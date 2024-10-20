package deob;

@ObfuscatedName("fz")
public class class179 {

    @ObfuscatedName("fz.dz")
    public long field2813;

    @ObfuscatedName("fz.du")
    public class179 field2812;

    @ObfuscatedName("fz.ex")
    public class179 field2811;

    @ObfuscatedName("fz.ih()V")
    public void method3349() {
        if (this.field2811 != null) {
            this.field2811.field2812 = this.field2812;
            this.field2812.field2811 = this.field2811;
            this.field2812 = null;
            this.field2811 = null;
        }
    }

    @ObfuscatedName("fz.iz()Z")
    public boolean method3350() {
        return this.field2811 != null;
    }
}

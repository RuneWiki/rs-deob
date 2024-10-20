package deob;

@ObfuscatedName("fc")
public class class179 {

    @ObfuscatedName("fc.dg")
    public long field2810;

    @ObfuscatedName("fc.dt")
    public class179 field2811;

    @ObfuscatedName("fc.ef")
    public class179 field2812;

    @ObfuscatedName("fc.hv()V")
    public void method3341() {
        if (this.field2812 != null) {
            this.field2812.field2811 = this.field2811;
            this.field2811.field2812 = this.field2812;
            this.field2811 = null;
            this.field2812 = null;
        }
    }

    @ObfuscatedName("fc.ha()Z")
    public boolean method3338() {
        return this.field2812 != null;
    }
}

package deob;

@ObfuscatedName("fv")
public class class176 {

    @ObfuscatedName("fv.dm")
    public long field2812;

    @ObfuscatedName("fv.el")
    public class176 field2813;

    @ObfuscatedName("fv.ev")
    public class176 field2811;

    @ObfuscatedName("fv.hh()V")
    public void method3223() {
        if (this.field2811 != null) {
            this.field2811.field2813 = this.field2813;
            this.field2813.field2811 = this.field2811;
            this.field2813 = null;
            this.field2811 = null;
        }
    }

    @ObfuscatedName("fv.hx()Z")
    public boolean method3224() {
        return this.field2811 != null;
    }
}

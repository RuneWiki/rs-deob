package deob;

@ObfuscatedName("fd")
public class class178 {

    @ObfuscatedName("fd.dw")
    public long field2814;

    @ObfuscatedName("fd.dl")
    public class178 field2813;

    @ObfuscatedName("fd.ez")
    public class178 field2812;

    @ObfuscatedName("fd.hk()V")
    public void method3320() {
        if (this.field2812 != null) {
            this.field2812.field2813 = this.field2813;
            this.field2813.field2812 = this.field2812;
            this.field2813 = null;
            this.field2812 = null;
        }
    }

    @ObfuscatedName("fd.hd()Z")
    public boolean method3321() {
        return this.field2812 != null;
    }
}

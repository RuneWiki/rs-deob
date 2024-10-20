package deob;

@ObfuscatedName("fw")
public class class179 {

    @ObfuscatedName("fw.du")
    public long field2813;

    @ObfuscatedName("fw.dr")
    public class179 field2812;

    @ObfuscatedName("fw.ei")
    public class179 field2814;

    @ObfuscatedName("fw.hr()V")
    public void method3360() {
        if (this.field2814 != null) {
            this.field2814.field2812 = this.field2812;
            this.field2812.field2814 = this.field2814;
            this.field2812 = null;
            this.field2814 = null;
        }
    }

    @ObfuscatedName("fw.hp()Z")
    public boolean method3364() {
        return this.field2814 != null;
    }
}

package deob;

@ObfuscatedName("hf")
public class class212 {

    @ObfuscatedName("hf.ez")
    public long field3168;

    @ObfuscatedName("hf.eu")
    public class212 field3169;

    @ObfuscatedName("hf.em")
    public class212 field3167;

    @ObfuscatedName("hf.hc()V")
    public void method3729() {
        if (this.field3167 != null) {
            this.field3167.field3169 = this.field3169;
            this.field3169.field3167 = this.field3167;
            this.field3169 = null;
            this.field3167 = null;
        }
    }

    @ObfuscatedName("hf.hm()Z")
    public boolean method3728() {
        return this.field3167 != null;
    }
}

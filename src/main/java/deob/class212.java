package deob;

@ObfuscatedName("hs")
public class class212 {

    @ObfuscatedName("hs.ex")
    public long field3167;

    @ObfuscatedName("hs.eo")
    public class212 field3166;

    @ObfuscatedName("hs.ey")
    public class212 field3168;

    @ObfuscatedName("hs.is()V")
    public void method3744() {
        if (this.field3168 != null) {
            this.field3168.field3166 = this.field3166;
            this.field3166.field3168 = this.field3168;
            this.field3166 = null;
            this.field3168 = null;
        }
    }

    @ObfuscatedName("hs.ii()Z")
    public boolean method3743() {
        return this.field3168 != null;
    }
}

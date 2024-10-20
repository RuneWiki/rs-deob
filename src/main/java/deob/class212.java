package deob;

@ObfuscatedName("hg")
public class class212 {

    @ObfuscatedName("hg.ek")
    public long field3167;

    @ObfuscatedName("hg.ey")
    public class212 field3166;

    @ObfuscatedName("hg.ea")
    public class212 field3168;

    @ObfuscatedName("hg.jl()V")
    public void method3699() {
        if (this.field3168 != null) {
            this.field3168.field3166 = this.field3166;
            this.field3166.field3168 = this.field3168;
            this.field3166 = null;
            this.field3168 = null;
        }
    }

    @ObfuscatedName("hg.jm()Z")
    public boolean method3704() {
        return this.field3168 != null;
    }
}

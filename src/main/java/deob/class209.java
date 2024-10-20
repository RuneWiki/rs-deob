package deob;

@ObfuscatedName("hc")
public class class209 {

    @ObfuscatedName("hc.eq")
    public long field3123;

    @ObfuscatedName("hc.eh")
    public class209 field3124;

    @ObfuscatedName("hc.ez")
    public class209 field3125;

    @ObfuscatedName("hc.ig()V")
    public void method3639() {
        if (this.field3125 != null) {
            this.field3125.field3124 = this.field3124;
            this.field3124.field3125 = this.field3125;
            this.field3124 = null;
            this.field3125 = null;
        }
    }

    @ObfuscatedName("hc.it()Z")
    public boolean method3638() {
        return this.field3125 != null;
    }
}

package deob;

@ObfuscatedName("gm")
public class class208 {

    @ObfuscatedName("gm.ec")
    public long field3093;

    @ObfuscatedName("gm.eb")
    public class208 field3094;

    @ObfuscatedName("gm.es")
    public class208 field3095;

    @ObfuscatedName("gm.ip()V")
    public void method3711() {
        if (this.field3095 != null) {
            this.field3095.field3094 = this.field3094;
            this.field3094.field3095 = this.field3095;
            this.field3094 = null;
            this.field3095 = null;
        }
    }

    @ObfuscatedName("gm.it()Z")
    public boolean method3712() {
        return this.field3095 != null;
    }
}

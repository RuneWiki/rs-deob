package deob;

@ObfuscatedName("gj")
public class class208 {

    @ObfuscatedName("gj.ec")
    public long field3107;

    @ObfuscatedName("gj.ee")
    public class208 field3105;

    @ObfuscatedName("gj.eo")
    public class208 field3106;

    @ObfuscatedName("gj.ix()V")
    public void method3715() {
        if (this.field3106 != null) {
            this.field3106.field3105 = this.field3105;
            this.field3105.field3106 = this.field3106;
            this.field3105 = null;
            this.field3106 = null;
        }
    }

    @ObfuscatedName("gj.iv()Z")
    public boolean method3713() {
        return this.field3106 != null;
    }
}

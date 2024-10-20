package deob;

@ObfuscatedName("fm")
public class class180 {

    @ObfuscatedName("fm.dy")
    public long field2837;

    @ObfuscatedName("fm.en")
    public class180 field2836;

    @ObfuscatedName("fm.es")
    public class180 field2835;

    @ObfuscatedName("fm.ix()V")
    public void method3360() {
        if (this.field2835 != null) {
            this.field2835.field2836 = this.field2836;
            this.field2836.field2835 = this.field2835;
            this.field2836 = null;
            this.field2835 = null;
        }
    }

    @ObfuscatedName("fm.iu()Z")
    public boolean method3361() {
        return this.field2835 != null;
    }
}

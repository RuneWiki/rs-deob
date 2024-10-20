package deob;

@ObfuscatedName("gt")
public class class208 {

    @ObfuscatedName("gt.eg")
    public long field3105;

    @ObfuscatedName("gt.es")
    public class208 field3103;

    @ObfuscatedName("gt.ee")
    public class208 field3104;

    @ObfuscatedName("gt.ip()V")
    public void method3700() {
        if (this.field3104 != null) {
            this.field3104.field3103 = this.field3103;
            this.field3103.field3104 = this.field3104;
            this.field3103 = null;
            this.field3104 = null;
        }
    }

    @ObfuscatedName("gt.ib()Z")
    public boolean method3703() {
        return this.field3104 != null;
    }
}

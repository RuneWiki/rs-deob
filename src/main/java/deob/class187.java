package deob;

@ObfuscatedName("gf")
public class class187 {

    @ObfuscatedName("gf.dw")
    public long field2885;

    @ObfuscatedName("gf.ee")
    public class187 field2886;

    @ObfuscatedName("gf.el")
    public class187 field2887;

    @ObfuscatedName("gf.id()V")
    public void method3304() {
        if (this.field2887 != null) {
            this.field2887.field2886 = this.field2886;
            this.field2886.field2887 = this.field2887;
            this.field2886 = null;
            this.field2887 = null;
        }
    }

    @ObfuscatedName("gf.ih()Z")
    public boolean method3303() {
        return this.field2887 != null;
    }
}

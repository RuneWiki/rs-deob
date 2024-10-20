package deob;

@ObfuscatedName("gn")
public class class208 {

    @ObfuscatedName("gn.eq")
    public long field3113;

    @ObfuscatedName("gn.el")
    public class208 field3112;

    @ObfuscatedName("gn.ew")
    public class208 field3111;

    @ObfuscatedName("gn.is()V")
    public void method3670() {
        if (this.field3111 != null) {
            this.field3111.field3112 = this.field3112;
            this.field3112.field3111 = this.field3111;
            this.field3112 = null;
            this.field3111 = null;
        }
    }

    @ObfuscatedName("gn.iy()Z")
    public boolean method3671() {
        return this.field3111 != null;
    }
}

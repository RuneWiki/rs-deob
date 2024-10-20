package deob;

@ObfuscatedName("gn")
public class class189 {

    @ObfuscatedName("gn.ef")
    public long field2887;

    @ObfuscatedName("gn.ep")
    public class189 field2886;

    @ObfuscatedName("gn.ew")
    public class189 field2885;

    @ObfuscatedName("gn.hv()V")
    public void method3259() {
        if (this.field2885 != null) {
            this.field2885.field2886 = this.field2886;
            this.field2886.field2885 = this.field2885;
            this.field2886 = null;
            this.field2885 = null;
        }
    }

    @ObfuscatedName("gn.id()Z")
    public boolean method3256() {
        return this.field2885 != null;
    }
}

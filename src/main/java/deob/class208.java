package deob;

@ObfuscatedName("gs")
public class class208 {

    @ObfuscatedName("gs.eq")
    public long field3112;

    @ObfuscatedName("gs.ep")
    public class208 field3111;

    @ObfuscatedName("gs.ez")
    public class208 field3110;

    @ObfuscatedName("gs.if()V")
    public void method3661() {
        if (this.field3110 != null) {
            this.field3110.field3111 = this.field3111;
            this.field3111.field3110 = this.field3110;
            this.field3111 = null;
            this.field3110 = null;
        }
    }

    @ObfuscatedName("gs.iz()Z")
    public boolean method3659() {
        return this.field3110 != null;
    }
}

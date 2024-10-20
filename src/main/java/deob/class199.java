package deob;

@ObfuscatedName("gt")
public class class199 {

    @ObfuscatedName("gt.es")
    public long field3015;

    @ObfuscatedName("gt.ew")
    public class199 field3014;

    @ObfuscatedName("gt.ec")
    public class199 field3016;

    @ObfuscatedName("gt.iv()V")
    public void method3506() {
        if (this.field3016 != null) {
            this.field3016.field3014 = this.field3014;
            this.field3014.field3016 = this.field3016;
            this.field3014 = null;
            this.field3016 = null;
        }
    }

    @ObfuscatedName("gt.if()Z")
    public boolean method3505() {
        return this.field3016 != null;
    }
}

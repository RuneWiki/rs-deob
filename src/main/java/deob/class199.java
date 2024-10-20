package deob;

@ObfuscatedName("gn")
public class class199 {

    @ObfuscatedName("gn.em")
    public long field3013;

    @ObfuscatedName("gn.eq")
    public class199 field3014;

    @ObfuscatedName("gn.ep")
    public class199 field3012;

    @ObfuscatedName("gn.is()V")
    public void method3474() {
        if (this.field3012 != null) {
            this.field3012.field3014 = this.field3014;
            this.field3014.field3012 = this.field3012;
            this.field3014 = null;
            this.field3012 = null;
        }
    }

    @ObfuscatedName("gn.il()Z")
    public boolean method3470() {
        return this.field3012 != null;
    }
}

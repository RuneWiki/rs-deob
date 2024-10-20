package deob;

@ObfuscatedName("ga")
public class class199 {

    @ObfuscatedName("ga.ea")
    public long field3007;

    @ObfuscatedName("ga.ey")
    public class199 field3008;

    @ObfuscatedName("ga.eb")
    public class199 field3009;

    @ObfuscatedName("ga.iw()V")
    public void method3562() {
        if (this.field3009 != null) {
            this.field3009.field3008 = this.field3008;
            this.field3008.field3009 = this.field3009;
            this.field3008 = null;
            this.field3009 = null;
        }
    }

    @ObfuscatedName("ga.if()Z")
    public boolean method3564() {
        return this.field3009 != null;
    }
}

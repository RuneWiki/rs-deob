package deob;

@ObfuscatedName("gj")
public class class199 {

    @ObfuscatedName("gj.ef")
    public long field3015;

    @ObfuscatedName("gj.eu")
    public class199 field3013;

    @ObfuscatedName("gj.eb")
    public class199 field3014;

    @ObfuscatedName("gj.jo()V")
    public void method3564() {
        if (this.field3014 != null) {
            this.field3014.field3013 = this.field3013;
            this.field3013.field3014 = this.field3014;
            this.field3013 = null;
            this.field3014 = null;
        }
    }

    @ObfuscatedName("gj.jf()Z")
    public boolean method3566() {
        return this.field3014 != null;
    }
}

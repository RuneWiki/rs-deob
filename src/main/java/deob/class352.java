package deob;

@ObfuscatedName("mw")
public class class352 {

    @ObfuscatedName("mw.ff")
    public long field3938;

    @ObfuscatedName("mw.fw")
    public class352 field3939;

    @ObfuscatedName("mw.fj")
    public class352 field3940;

    @ObfuscatedName("mw.eq()V")
    public void method5496() {
        if (this.field3940 != null) {
            this.field3940.field3939 = this.field3939;
            this.field3939.field3940 = this.field3940;
            this.field3939 = null;
            this.field3940 = null;
        }
    }

    @ObfuscatedName("mw.fz()Z")
    public boolean method5492() {
        return this.field3940 != null;
    }
}

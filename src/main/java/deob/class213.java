package deob;

@ObfuscatedName("he")
public class class213 {

    @ObfuscatedName("he.co")
    public long field2613;

    @ObfuscatedName("he.ct")
    public class213 field2612;

    @ObfuscatedName("he.cj")
    public class213 field2611;

    @ObfuscatedName("he.ks()V")
    public void method3726() {
        if (this.field2611 != null) {
            this.field2611.field2612 = this.field2612;
            this.field2612.field2611 = this.field2611;
            this.field2612 = null;
            this.field2611 = null;
        }
    }

    @ObfuscatedName("he.ka()Z")
    public boolean method3730() {
        return this.field2611 != null;
    }
}

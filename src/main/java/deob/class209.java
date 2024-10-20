package deob;

@ObfuscatedName("he")
public class class209 {

    @ObfuscatedName("he.ed")
    public long field3126;

    @ObfuscatedName("he.ey")
    public class209 field3127;

    @ObfuscatedName("he.en")
    public class209 field3125;

    @ObfuscatedName("he.id()V")
    public void method3607() {
        if (this.field3125 != null) {
            this.field3125.field3127 = this.field3127;
            this.field3127.field3125 = this.field3125;
            this.field3127 = null;
            this.field3125 = null;
        }
    }

    @ObfuscatedName("he.iq()Z")
    public boolean method3601() {
        return this.field3125 != null;
    }
}

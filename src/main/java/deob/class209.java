package deob;

@ObfuscatedName("hd")
public class class209 {

    @ObfuscatedName("hd.ed")
    public long field3126;

    @ObfuscatedName("hd.ea")
    public class209 field3125;

    @ObfuscatedName("hd.eu")
    public class209 field3127;

    @ObfuscatedName("hd.ia()V")
    public void method3639() {
        if (this.field3127 != null) {
            this.field3127.field3125 = this.field3125;
            this.field3125.field3127 = this.field3127;
            this.field3125 = null;
            this.field3127 = null;
        }
    }

    @ObfuscatedName("hd.iq()Z")
    public boolean method3638() {
        return this.field3127 != null;
    }
}

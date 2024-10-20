package deob;

@ObfuscatedName("fx")
public class class4 {

    @ObfuscatedName("fx.dp")
    public class4 field9;

    @ObfuscatedName("fx.er")
    public class4 field10;

    @ObfuscatedName("fx.da")
    public long field11;

    @ObfuscatedName("fx.iy()V")
    public void method44() {
        if (this.field10 != null) {
            this.field10.field9 = this.field9;
            this.field9.field10 = this.field10;
            this.field9 = null;
            this.field10 = null;
        }
    }

    @ObfuscatedName("fx.iq()Z")
    public boolean method47() {
        return this.field10 != null;
    }
}

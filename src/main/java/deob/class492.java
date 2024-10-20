package deob;

@ObfuscatedName("se")
public class class492 {

    @ObfuscatedName("se.hd")
    public long field4920;

    @ObfuscatedName("se.hw")
    public class492 field4918;

    @ObfuscatedName("se.hq")
    public class492 field4919;

    @ObfuscatedName("se.gv()V")
    public void method7996() {
        if (this.field4919 != null) {
            this.field4919.field4918 = this.field4918;
            this.field4918.field4919 = this.field4919;
            this.field4918 = null;
            this.field4919 = null;
        }
    }

    @ObfuscatedName("se.gu()Z")
    public boolean method7992() {
        return this.field4919 != null;
    }
}

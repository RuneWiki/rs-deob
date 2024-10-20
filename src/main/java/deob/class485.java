package deob;

@ObfuscatedName("sh")
public class class485 {

    @ObfuscatedName("sh.hp")
    public long field4849;

    @ObfuscatedName("sh.hl")
    public class485 field4850;

    @ObfuscatedName("sh.hq")
    public class485 field4848;

    @ObfuscatedName("sh.fz()V")
    public void method7828() {
        if (this.field4848 != null) {
            this.field4848.field4850 = this.field4850;
            this.field4850.field4848 = this.field4848;
            this.field4850 = null;
            this.field4848 = null;
        }
    }

    @ObfuscatedName("sh.fx()Z")
    public boolean method7827() {
        return this.field4848 != null;
    }
}

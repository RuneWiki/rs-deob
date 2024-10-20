package deob;

@ObfuscatedName("pl")
public class class433 {

    @ObfuscatedName("pl.gt")
    public long field4686;

    @ObfuscatedName("pl.gc")
    public class433 field4684;

    @ObfuscatedName("pl.gw")
    public class433 field4685;

    @ObfuscatedName("pl.fd()V")
    public void method7230() {
        if (this.field4685 != null) {
            this.field4685.field4684 = this.field4684;
            this.field4684.field4685 = this.field4685;
            this.field4684 = null;
            this.field4685 = null;
        }
    }

    @ObfuscatedName("pl.fr()Z")
    public boolean method7228() {
        return this.field4685 != null;
    }
}

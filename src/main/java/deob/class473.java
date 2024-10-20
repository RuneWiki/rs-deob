package deob;

@ObfuscatedName("sj")
public class class473 {

    @ObfuscatedName("sj.hq")
    public long field4814;

    @ObfuscatedName("sj.hw")
    public class473 field4813;

    @ObfuscatedName("sj.hy")
    public class473 field4815;

    @ObfuscatedName("sj.gg()V")
    public void method7700() {
        if (this.field4815 != null) {
            this.field4815.field4813 = this.field4813;
            this.field4813.field4815 = this.field4815;
            this.field4813 = null;
            this.field4815 = null;
        }
    }

    @ObfuscatedName("sj.gw()Z")
    public boolean method7704() {
        return this.field4815 != null;
    }
}

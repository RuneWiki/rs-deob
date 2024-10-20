package deob;

@ObfuscatedName("gw")
public class class186 {

    @ObfuscatedName("gw.cl")
    public long field2139;

    @ObfuscatedName("gw.ct")
    public class186 field2140;

    @ObfuscatedName("gw.cz")
    public class186 field2141;

    @ObfuscatedName("gw.es()V")
    public void method3306() {
        if (this.field2141 != null) {
            this.field2141.field2140 = this.field2140;
            this.field2140.field2141 = this.field2141;
            this.field2140 = null;
            this.field2141 = null;
        }
    }

    @ObfuscatedName("gw.eg()Z")
    public boolean method3302() {
        return this.field2141 != null;
    }
}

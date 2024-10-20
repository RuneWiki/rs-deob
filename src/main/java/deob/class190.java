package deob;

@ObfuscatedName("gn")
public class class190 {

    @ObfuscatedName("gn.cm")
    public long field2140;

    @ObfuscatedName("gn.cb")
    public class190 field2141;

    @ObfuscatedName("gn.ct")
    public class190 field2142;

    @ObfuscatedName("gn.fm()V")
    public void method3407() {
        if (this.field2142 != null) {
            this.field2142.field2141 = this.field2141;
            this.field2141.field2142 = this.field2142;
            this.field2141 = null;
            this.field2142 = null;
        }
    }

    @ObfuscatedName("gn.fg()Z")
    public boolean method3411() {
        return this.field2142 != null;
    }
}

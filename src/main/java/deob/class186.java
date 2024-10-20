package deob;

@ObfuscatedName("gm")
public class class186 {

    @ObfuscatedName("gm.dq")
    public long field2874;

    @ObfuscatedName("gm.ea")
    public class186 field2873;

    @ObfuscatedName("gm.eq")
    public class186 field2872;

    @ObfuscatedName("gm.hk()V")
    public void method3204() {
        if (this.field2872 != null) {
            this.field2872.field2873 = this.field2873;
            this.field2873.field2872 = this.field2872;
            this.field2873 = null;
            this.field2872 = null;
        }
    }

    @ObfuscatedName("gm.hc()Z")
    public boolean method3205() {
        return this.field2872 != null;
    }
}

package deob;

@ObfuscatedName("gz")
public class class187 {

    @ObfuscatedName("gz.dt")
    public long field2884;

    @ObfuscatedName("gz.eq")
    public class187 field2883;

    @ObfuscatedName("gz.ee")
    public class187 field2882;

    @ObfuscatedName("gz.hv()V")
    public void method3285() {
        if (this.field2882 != null) {
            this.field2882.field2883 = this.field2883;
            this.field2883.field2882 = this.field2882;
            this.field2883 = null;
            this.field2882 = null;
        }
    }

    @ObfuscatedName("gz.hd()Z")
    public boolean method3288() {
        return this.field2882 != null;
    }
}

package deob;

@ObfuscatedName("gz")
public class class193 {

    @ObfuscatedName("gz.cl")
    public long field2480;

    @ObfuscatedName("gz.cg")
    public class193 field2481;

    @ObfuscatedName("gz.cb")
    public class193 field2482;

    @ObfuscatedName("gz.ij()V")
    public void method3278() {
        if (this.field2482 != null) {
            this.field2482.field2481 = this.field2481;
            this.field2481.field2482 = this.field2482;
            this.field2481 = null;
            this.field2482 = null;
        }
    }

    @ObfuscatedName("gz.ig()Z")
    public boolean method3286() {
        return this.field2482 != null;
    }
}

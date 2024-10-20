package deob;

@ObfuscatedName("gs")
public class class194 {

    @ObfuscatedName("gs.cx")
    public long field2475;

    @ObfuscatedName("gs.cd")
    public class194 field2474;

    @ObfuscatedName("gs.cb")
    public class194 field2473;

    @ObfuscatedName("gs.ir()V")
    public void method3397() {
        if (this.field2473 != null) {
            this.field2473.field2474 = this.field2474;
            this.field2474.field2473 = this.field2473;
            this.field2474 = null;
            this.field2473 = null;
        }
    }

    @ObfuscatedName("gs.jf()Z")
    public boolean method3398() {
        return this.field2473 != null;
    }
}

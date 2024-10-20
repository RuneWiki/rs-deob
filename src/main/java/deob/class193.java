package deob;

@ObfuscatedName("gn")
public class class193 {

    @ObfuscatedName("gn.cx")
    public long field2467;

    @ObfuscatedName("gn.cw")
    public class193 field2468;

    @ObfuscatedName("gn.co")
    public class193 field2466;

    @ObfuscatedName("gn.ii()V")
    public void method3364() {
        if (this.field2466 != null) {
            this.field2466.field2468 = this.field2468;
            this.field2468.field2466 = this.field2466;
            this.field2468 = null;
            this.field2466 = null;
        }
    }

    @ObfuscatedName("gn.iv()Z")
    public boolean method3363() {
        return this.field2466 != null;
    }
}

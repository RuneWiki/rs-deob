package deob;

@ObfuscatedName("pr")
public class class440 {

    @ObfuscatedName("pr.gr")
    public long field4711;

    @ObfuscatedName("pr.gz")
    public class440 field4710;

    @ObfuscatedName("pr.ge")
    public class440 field4709;

    @ObfuscatedName("pr.fs()V")
    public void method7431() {
        if (this.field4709 != null) {
            this.field4709.field4710 = this.field4710;
            this.field4710.field4709 = this.field4709;
            this.field4710 = null;
            this.field4709 = null;
        }
    }

    @ObfuscatedName("pr.fg()Z")
    public boolean method7430() {
        return this.field4709 != null;
    }
}

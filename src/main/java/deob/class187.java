package deob;

@ObfuscatedName("gq")
public class class187 {

    @ObfuscatedName("gq.db")
    public long field2881;

    @ObfuscatedName("gq.ef")
    public class187 field2880;

    @ObfuscatedName("gq.el")
    public class187 field2879;

    @ObfuscatedName("gq.ii()V")
    public void method3378() {
        if (this.field2879 != null) {
            this.field2879.field2880 = this.field2880;
            this.field2880.field2879 = this.field2879;
            this.field2880 = null;
            this.field2879 = null;
        }
    }

    @ObfuscatedName("gq.iw()Z")
    public boolean method3379() {
        return this.field2879 != null;
    }
}

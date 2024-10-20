package deob;

@ObfuscatedName("fs")
public class class179 {

    @ObfuscatedName("fs.dr")
    public long field2817;

    @ObfuscatedName("fs.dm")
    public class179 field2816;

    @ObfuscatedName("fs.ee")
    public class179 field2815;

    @ObfuscatedName("fs.if()V")
    public void method3311() {
        if (this.field2815 != null) {
            this.field2815.field2816 = this.field2816;
            this.field2816.field2815 = this.field2815;
            this.field2816 = null;
            this.field2815 = null;
        }
    }

    @ObfuscatedName("fs.ix()Z")
    public boolean method3312() {
        return this.field2815 != null;
    }
}

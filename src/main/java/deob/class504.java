package deob;

@ObfuscatedName("tl")
public class class504 {

    @ObfuscatedName("tl.he")
    public long field5049;

    @ObfuscatedName("tl.hj")
    public class504 field5048;

    @ObfuscatedName("tl.hg")
    public class504 field5050;

    @ObfuscatedName("tl.jg()V")
    public void method8189() {
        if (this.field5050 != null) {
            this.field5050.field5048 = this.field5048;
            this.field5048.field5050 = this.field5050;
            this.field5048 = null;
            this.field5050 = null;
        }
    }

    @ObfuscatedName("tl.je()Z")
    public boolean method8187() {
        return this.field5050 != null;
    }
}

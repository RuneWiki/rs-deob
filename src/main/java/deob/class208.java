package deob;

@ObfuscatedName("gp")
public class class208 {

    @ObfuscatedName("gp.eb")
    public long field3111;

    @ObfuscatedName("gp.ew")
    public class208 field3110;

    @ObfuscatedName("gp.eh")
    public class208 field3109;

    @ObfuscatedName("gp.hv()V")
    public void method3679() {
        if (this.field3109 != null) {
            this.field3109.field3110 = this.field3110;
            this.field3110.field3109 = this.field3109;
            this.field3110 = null;
            this.field3109 = null;
        }
    }

    @ObfuscatedName("gp.ib()Z")
    public boolean method3678() {
        return this.field3109 != null;
    }
}

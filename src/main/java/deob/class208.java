package deob;

@ObfuscatedName("gx")
public class class208 {

    @ObfuscatedName("gx.et")
    public long field3091;

    @ObfuscatedName("gx.ed")
    public class208 field3092;

    @ObfuscatedName("gx.eo")
    public class208 field3093;

    @ObfuscatedName("gx.il()V")
    public void method3588() {
        if (this.field3093 != null) {
            this.field3093.field3092 = this.field3092;
            this.field3092.field3093 = this.field3093;
            this.field3092 = null;
            this.field3093 = null;
        }
    }

    @ObfuscatedName("gx.it()Z")
    public boolean method3592() {
        return this.field3093 != null;
    }
}

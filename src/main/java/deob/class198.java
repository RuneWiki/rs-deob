package deob;

@ObfuscatedName("gw")
public class class198 {

    @ObfuscatedName("gw.ei")
    public long field2958;

    @ObfuscatedName("gw.ed")
    public class198 field2959;

    @ObfuscatedName("gw.en")
    public class198 field2957;

    @ObfuscatedName("gw.hc()V")
    public void method3404() {
        if (this.field2957 != null) {
            this.field2957.field2959 = this.field2959;
            this.field2959.field2957 = this.field2957;
            this.field2959 = null;
            this.field2957 = null;
        }
    }

    @ObfuscatedName("gw.hl()Z")
    public boolean method3399() {
        return this.field2957 != null;
    }
}

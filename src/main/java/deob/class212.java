package deob;

@ObfuscatedName("hr")
public class class212 {

    @ObfuscatedName("hr.ev")
    public long field3171;

    @ObfuscatedName("hr.ez")
    public class212 field3170;

    @ObfuscatedName("hr.ec")
    public class212 field3172;

    @ObfuscatedName("hr.ic()V")
    public void method3729() {
        if (this.field3172 != null) {
            this.field3172.field3170 = this.field3170;
            this.field3170.field3172 = this.field3172;
            this.field3170 = null;
            this.field3172 = null;
        }
    }

    @ObfuscatedName("hr.is()Z")
    public boolean method3730() {
        return this.field3172 != null;
    }
}

package deob;

@ObfuscatedName("gq")
public class class186 {

    @ObfuscatedName("gq.di")
    public long field2871;

    @ObfuscatedName("gq.eo")
    public class186 field2870;

    @ObfuscatedName("gq.ep")
    public class186 field2869;

    @ObfuscatedName("gq.ik()V")
    public void method3334() {
        if (this.field2869 != null) {
            this.field2869.field2870 = this.field2870;
            this.field2870.field2869 = this.field2869;
            this.field2870 = null;
            this.field2869 = null;
        }
    }

    @ObfuscatedName("gq.im()Z")
    public boolean method3330() {
        return this.field2869 != null;
    }
}

package deob;

@ObfuscatedName("fn")
public class class20 {

    @ObfuscatedName("fn.m")
    public class20 field231;

    @ObfuscatedName("fn.i")
    public class20 field232;

    @ObfuscatedName("fn.v()V")
    public void method192() {
        if (this.field231 != null) {
            this.field231.field232 = this.field232;
            this.field232.field231 = this.field231;
            this.field232 = null;
            this.field231 = null;
        }
    }
}

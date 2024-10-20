package deob;

@ObfuscatedName("gx")
public class class189 {

    @ObfuscatedName("gx.ep")
    public long field2882;

    @ObfuscatedName("gx.ef")
    public class189 field2883;

    @ObfuscatedName("gx.er")
    public class189 field2884;

    @ObfuscatedName("gx.ie()V")
    public void method3367() {
        if (this.field2884 != null) {
            this.field2884.field2883 = this.field2883;
            this.field2883.field2884 = this.field2884;
            this.field2883 = null;
            this.field2884 = null;
        }
    }

    @ObfuscatedName("gx.im()Z")
    public boolean method3365() {
        return this.field2884 != null;
    }
}

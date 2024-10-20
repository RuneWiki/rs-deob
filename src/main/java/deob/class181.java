package deob;

@ObfuscatedName("fx")
public class class181 {

    @ObfuscatedName("fx.dy")
    public long field2839;

    @ObfuscatedName("fx.eo")
    public class181 field2838;

    @ObfuscatedName("fx.ec")
    public class181 field2840;

    @ObfuscatedName("fx.ir()V")
    public void method3363() {
        if (this.field2840 != null) {
            this.field2840.field2838 = this.field2838;
            this.field2838.field2840 = this.field2840;
            this.field2838 = null;
            this.field2840 = null;
        }
    }

    @ObfuscatedName("fx.im()Z")
    public boolean method3364() {
        return this.field2840 != null;
    }
}

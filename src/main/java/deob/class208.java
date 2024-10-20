package deob;

@ObfuscatedName("gs")
public class class208 {

    @ObfuscatedName("gs.ex")
    public long field3095;

    @ObfuscatedName("gs.eo")
    public class208 field3094;

    @ObfuscatedName("gs.es")
    public class208 field3093;

    @ObfuscatedName("gs.ib()V")
    public void method3702() {
        if (this.field3093 != null) {
            this.field3093.field3094 = this.field3094;
            this.field3094.field3093 = this.field3093;
            this.field3094 = null;
            this.field3093 = null;
        }
    }

    @ObfuscatedName("gs.in()Z")
    public boolean method3706() {
        return this.field3093 != null;
    }
}

package deob;

@ObfuscatedName("gs")
public class class189 {

    @ObfuscatedName("gs.eb")
    public long field2882;

    @ObfuscatedName("gs.er")
    public class189 field2881;

    @ObfuscatedName("gs.ea")
    public class189 field2880;

    @ObfuscatedName("gs.in()V")
    public void method3352() {
        if (this.field2880 != null) {
            this.field2880.field2881 = this.field2881;
            this.field2881.field2880 = this.field2880;
            this.field2881 = null;
            this.field2880 = null;
        }
    }

    @ObfuscatedName("gs.ii()Z")
    public boolean method3355() {
        return this.field2880 != null;
    }
}

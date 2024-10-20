package deob;

@ObfuscatedName("fk")
public class class179 {

    @ObfuscatedName("fk.du")
    public long field2818;

    @ObfuscatedName("fk.df")
    public class179 field2817;

    @ObfuscatedName("fk.eb")
    public class179 field2819;

    @ObfuscatedName("fk.in()V")
    public void method3319() {
        if (this.field2819 != null) {
            this.field2819.field2817 = this.field2817;
            this.field2817.field2819 = this.field2819;
            this.field2817 = null;
            this.field2819 = null;
        }
    }

    @ObfuscatedName("fk.ip()Z")
    public boolean method3318() {
        return this.field2819 != null;
    }
}

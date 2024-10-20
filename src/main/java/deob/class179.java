package deob;

@ObfuscatedName("fk")
public class class179 {

    @ObfuscatedName("fk.dz")
    public long field2819;

    @ObfuscatedName("fk.di")
    public class179 field2818;

    @ObfuscatedName("fk.em")
    public class179 field2817;

    @ObfuscatedName("fk.in()V")
    public void method3395() {
        if (this.field2817 != null) {
            this.field2817.field2818 = this.field2818;
            this.field2818.field2817 = this.field2817;
            this.field2818 = null;
            this.field2817 = null;
        }
    }

    @ObfuscatedName("fk.il()Z")
    public boolean method3392() {
        return this.field2817 != null;
    }
}

package deob;

@ObfuscatedName("fk")
public class class177 {

    @ObfuscatedName("fk.dd")
    public long field2755;

    @ObfuscatedName("fk.df")
    public class177 field2754;

    @ObfuscatedName("fk.ee")
    public class177 field2756;

    @ObfuscatedName("fk.hq()V")
    public void method3346() {
        if (this.field2756 != null) {
            this.field2756.field2754 = this.field2754;
            this.field2754.field2756 = this.field2756;
            this.field2754 = null;
            this.field2756 = null;
        }
    }

    @ObfuscatedName("fk.hv()Z")
    public boolean method3347() {
        return this.field2756 != null;
    }
}

package deob;

@ObfuscatedName("fk")
public class class177 {

    @ObfuscatedName("fk.du")
    public long field2759;

    @ObfuscatedName("fk.dq")
    public class177 field2760;

    @ObfuscatedName("fk.ek")
    public class177 field2758;

    @ObfuscatedName("fk.hb()V")
    public void method3182() {
        if (this.field2758 != null) {
            this.field2758.field2760 = this.field2760;
            this.field2760.field2758 = this.field2758;
            this.field2760 = null;
            this.field2758 = null;
        }
    }

    @ObfuscatedName("fk.hl()Z")
    public boolean method3181() {
        return this.field2758 != null;
    }
}

package deob;

@ObfuscatedName("fu")
public class class179 {

    @ObfuscatedName("fu.da")
    public long field2814;

    @ObfuscatedName("fu.du")
    public class179 field2815;

    @ObfuscatedName("fu.ex")
    public class179 field2813;

    @ObfuscatedName("fu.iy()V")
    public void method3346() {
        if (this.field2813 != null) {
            this.field2813.field2815 = this.field2815;
            this.field2815.field2813 = this.field2813;
            this.field2815 = null;
            this.field2813 = null;
        }
    }

    @ObfuscatedName("fu.ik()Z")
    public boolean method3347() {
        return this.field2813 != null;
    }
}

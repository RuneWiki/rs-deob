package deob;

@ObfuscatedName("hf")
public class class209 {

    @ObfuscatedName("hf.ex")
    public long field3116;

    @ObfuscatedName("hf.en")
    public class209 field3117;

    @ObfuscatedName("hf.ec")
    public class209 field3118;

    @ObfuscatedName("hf.hj()V")
    public void method3679() {
        if (this.field3118 != null) {
            this.field3118.field3117 = this.field3117;
            this.field3117.field3118 = this.field3118;
            this.field3117 = null;
            this.field3118 = null;
        }
    }

    @ObfuscatedName("hf.ha()Z")
    public boolean method3675() {
        return this.field3118 != null;
    }
}

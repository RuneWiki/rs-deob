package deob;

@ObfuscatedName("gq")
public class class208 {

    @ObfuscatedName("gq.ee")
    public long field3115;

    @ObfuscatedName("gq.ex")
    public class208 field3116;

    @ObfuscatedName("gq.ep")
    public class208 field3114;

    @ObfuscatedName("gq.ik()V")
    public void method3645() {
        if (this.field3114 != null) {
            this.field3114.field3116 = this.field3116;
            this.field3116.field3114 = this.field3114;
            this.field3116 = null;
            this.field3114 = null;
        }
    }

    @ObfuscatedName("gq.iq()Z")
    public boolean method3650() {
        return this.field3114 != null;
    }
}

package deob;

@ObfuscatedName("ga")
public class class199 {

    @ObfuscatedName("ga.el")
    public long field3018;

    @ObfuscatedName("ga.eg")
    public class199 field3019;

    @ObfuscatedName("ga.er")
    public class199 field3020;

    @ObfuscatedName("ga.ik()V")
    public void method3540() {
        if (this.field3020 != null) {
            this.field3020.field3019 = this.field3019;
            this.field3019.field3020 = this.field3020;
            this.field3019 = null;
            this.field3020 = null;
        }
    }

    @ObfuscatedName("ga.iy()Z")
    public boolean method3541() {
        return this.field3020 != null;
    }
}

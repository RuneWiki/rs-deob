package deob;

@ObfuscatedName("gb")
public class class199 {

    @ObfuscatedName("gb.ee")
    public long field3024;

    @ObfuscatedName("gb.el")
    public class199 field3025;

    @ObfuscatedName("gb.er")
    public class199 field3026;

    @ObfuscatedName("gb.ic()V")
    public void method3482() {
        if (this.field3026 != null) {
            this.field3026.field3025 = this.field3025;
            this.field3025.field3026 = this.field3026;
            this.field3025 = null;
            this.field3026 = null;
        }
    }

    @ObfuscatedName("gb.ib()Z")
    public boolean method3486() {
        return this.field3026 != null;
    }
}

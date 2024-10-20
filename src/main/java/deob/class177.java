package deob;

@ObfuscatedName("fa")
public class class177 {

    @ObfuscatedName("fa.de")
    public long field2758;

    @ObfuscatedName("fa.dc")
    public class177 field2759;

    @ObfuscatedName("fa.ev")
    public class177 field2760;

    @ObfuscatedName("fa.if()V")
    public void method3289() {
        if (this.field2760 != null) {
            this.field2760.field2759 = this.field2759;
            this.field2759.field2760 = this.field2760;
            this.field2759 = null;
            this.field2760 = null;
        }
    }

    @ObfuscatedName("fa.ii()Z")
    public boolean method3288() {
        return this.field2760 != null;
    }
}

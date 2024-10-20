package deob;

@ObfuscatedName("fo")
public class class179 {

    @ObfuscatedName("fo.dz")
    public long field2826;

    @ObfuscatedName("fo.en")
    public class179 field2827;

    @ObfuscatedName("fo.ez")
    public class179 field2825;

    @ObfuscatedName("fo.im()V")
    public void method3282() {
        if (this.field2825 != null) {
            this.field2825.field2827 = this.field2827;
            this.field2827.field2825 = this.field2825;
            this.field2827 = null;
            this.field2825 = null;
        }
    }

    @ObfuscatedName("fo.ie()Z")
    public boolean method3291() {
        return this.field2825 != null;
    }
}

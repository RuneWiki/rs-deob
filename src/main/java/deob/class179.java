package deob;

@ObfuscatedName("fp")
public class class179 {

    @ObfuscatedName("fp.dp")
    public long field2816;

    @ObfuscatedName("fp.du")
    public class179 field2815;

    @ObfuscatedName("fp.ez")
    public class179 field2817;

    @ObfuscatedName("fp.ir()V")
    public void method3288() {
        if (this.field2817 != null) {
            this.field2817.field2815 = this.field2815;
            this.field2815.field2817 = this.field2817;
            this.field2815 = null;
            this.field2817 = null;
        }
    }

    @ObfuscatedName("fp.im()Z")
    public boolean method3289() {
        return this.field2817 != null;
    }
}

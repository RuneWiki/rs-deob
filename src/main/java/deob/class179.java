package deob;

@ObfuscatedName("fo")
public class class179 {

    @ObfuscatedName("fo.di")
    public long field2818;

    @ObfuscatedName("fo.dp")
    public class179 field2817;

    @ObfuscatedName("fo.ee")
    public class179 field2819;

    @ObfuscatedName("fo.ix()V")
    public void method3409() {
        if (this.field2819 != null) {
            this.field2819.field2817 = this.field2817;
            this.field2817.field2819 = this.field2819;
            this.field2817 = null;
            this.field2819 = null;
        }
    }

    @ObfuscatedName("fo.iz()Z")
    public boolean method3407() {
        return this.field2819 != null;
    }
}

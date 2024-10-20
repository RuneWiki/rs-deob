package deob;

@ObfuscatedName("fu")
public class class179 {

    @ObfuscatedName("fu.de")
    public long field2821;

    @ObfuscatedName("fu.dh")
    public class179 field2819;

    @ObfuscatedName("fu.eb")
    public class179 field2820;

    @ObfuscatedName("fu.ih()V")
    public void method3361() {
        if (this.field2820 != null) {
            this.field2820.field2819 = this.field2819;
            this.field2819.field2820 = this.field2820;
            this.field2819 = null;
            this.field2820 = null;
        }
    }

    @ObfuscatedName("fu.if()Z")
    public boolean method3365() {
        return this.field2820 != null;
    }
}

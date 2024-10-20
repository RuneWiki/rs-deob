package deob;

@ObfuscatedName("fn")
public class class179 {

    @ObfuscatedName("fn.do")
    public long field2821;

    @ObfuscatedName("fn.dc")
    public class179 field2820;

    @ObfuscatedName("fn.ea")
    public class179 field2819;

    @ObfuscatedName("fn.iy()V")
    public void method3455() {
        if (this.field2819 != null) {
            this.field2819.field2820 = this.field2820;
            this.field2820.field2819 = this.field2819;
            this.field2820 = null;
            this.field2819 = null;
        }
    }

    @ObfuscatedName("fn.ib()Z")
    public boolean method3457() {
        return this.field2819 != null;
    }
}

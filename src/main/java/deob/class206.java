package deob;

@ObfuscatedName("gd")
public class class206 extends class204 {

    @ObfuscatedName("gd.cy")
    public class206 field2601;

    @ObfuscatedName("gd.ct")
    public class206 field2602;

    @ObfuscatedName("gd.cv()V")
    public void method3515() {
        if (this.field2602 != null) {
            this.field2602.field2601 = this.field2601;
            this.field2601.field2602 = this.field2602;
            this.field2601 = null;
            this.field2602 = null;
        }
    }
}

package deob;

@ObfuscatedName("gu")
public class class191 {

    @ObfuscatedName("gu.ej")
    public long field2903;

    @ObfuscatedName("gu.ev")
    public class191 field2902;

    @ObfuscatedName("gu.ee")
    public class191 field2901;

    @ObfuscatedName("gu.iq()V")
    public void method3358() {
        if (this.field2901 != null) {
            this.field2901.field2902 = this.field2902;
            this.field2902.field2901 = this.field2901;
            this.field2902 = null;
            this.field2901 = null;
        }
    }

    @ObfuscatedName("gu.in()Z")
    public boolean method3353() {
        return this.field2901 != null;
    }
}

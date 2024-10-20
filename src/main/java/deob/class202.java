package deob;

@ObfuscatedName("gz")
public class class202 {

    @ObfuscatedName("gz.eh")
    public long field3043;

    @ObfuscatedName("gz.ec")
    public class202 field3044;

    @ObfuscatedName("gz.ex")
    public class202 field3045;

    @ObfuscatedName("gz.iy()V")
    public void method3563() {
        if (this.field3045 != null) {
            this.field3045.field3044 = this.field3044;
            this.field3044.field3045 = this.field3045;
            this.field3044 = null;
            this.field3045 = null;
        }
    }

    @ObfuscatedName("gz.il()Z")
    public boolean method3564() {
        return this.field3045 != null;
    }
}

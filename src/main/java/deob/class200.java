package deob;

@ObfuscatedName("gf")
public class class200 {

    @ObfuscatedName("gf.cc")
    public long field2564;

    @ObfuscatedName("gf.ck")
    public class200 field2565;

    @ObfuscatedName("gf.cq")
    public class200 field2566;

    @ObfuscatedName("gf.ju()V")
    public void method3475() {
        if (this.field2566 != null) {
            this.field2566.field2565 = this.field2565;
            this.field2565.field2566 = this.field2566;
            this.field2565 = null;
            this.field2566 = null;
        }
    }

    @ObfuscatedName("gf.jp()Z")
    public boolean method3476() {
        return this.field2566 != null;
    }
}

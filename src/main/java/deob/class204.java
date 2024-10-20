package deob;

@ObfuscatedName("gf")
public class class204 {

    @ObfuscatedName("gf.ck")
    public long field2585;

    @ObfuscatedName("gf.cb")
    public class204 field2584;

    @ObfuscatedName("gf.cm")
    public class204 field2586;

    @ObfuscatedName("gf.ka()V")
    public void method3740() {
        if (this.field2586 != null) {
            this.field2586.field2584 = this.field2584;
            this.field2584.field2586 = this.field2586;
            this.field2584 = null;
            this.field2586 = null;
        }
    }

    @ObfuscatedName("gf.kh()Z")
    public boolean method3743() {
        return this.field2586 != null;
    }
}

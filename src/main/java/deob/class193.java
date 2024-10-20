package deob;

@ObfuscatedName("gw")
public class class193 {

    @ObfuscatedName("gw.cb")
    public long field2483;

    @ObfuscatedName("gw.cl")
    public class193 field2484;

    @ObfuscatedName("gw.ck")
    public class193 field2482;

    @ObfuscatedName("gw.ie()V")
    public void method3234() {
        if (this.field2482 != null) {
            this.field2482.field2484 = this.field2484;
            this.field2484.field2482 = this.field2482;
            this.field2484 = null;
            this.field2482 = null;
        }
    }

    @ObfuscatedName("gw.ik()Z")
    public boolean method3235() {
        return this.field2482 != null;
    }
}

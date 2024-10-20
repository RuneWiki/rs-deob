package deob;

@ObfuscatedName("gw")
public class class204 {

    @ObfuscatedName("gw.cm")
    public long field2563;

    @ObfuscatedName("gw.cn")
    public class204 field2562;

    @ObfuscatedName("gw.cb")
    public class204 field2561;

    @ObfuscatedName("gw.ij()V")
    public void method3561() {
        if (this.field2561 != null) {
            this.field2561.field2562 = this.field2562;
            this.field2562.field2561 = this.field2561;
            this.field2562 = null;
            this.field2561 = null;
        }
    }

    @ObfuscatedName("gw.jw()Z")
    public boolean method3563() {
        return this.field2561 != null;
    }
}

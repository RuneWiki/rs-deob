package deob;

@ObfuscatedName("gh")
public class class200 {

    @ObfuscatedName("gh.ci")
    public long field2563;

    @ObfuscatedName("gh.co")
    public class200 field2562;

    @ObfuscatedName("gh.cb")
    public class200 field2564;

    @ObfuscatedName("gh.jk()V")
    public void method3476() {
        if (this.field2564 != null) {
            this.field2564.field2562 = this.field2562;
            this.field2562.field2564 = this.field2564;
            this.field2562 = null;
            this.field2564 = null;
        }
    }

    @ObfuscatedName("gh.jn()Z")
    public boolean method3475() {
        return this.field2564 != null;
    }
}

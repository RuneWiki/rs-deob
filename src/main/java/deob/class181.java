package deob;

@ObfuscatedName("fn")
public class class181 {

    @ObfuscatedName("fn.cx")
    public long field2096;

    @ObfuscatedName("fn.ci")
    public class181 field2095;

    @ObfuscatedName("fn.cf")
    public class181 field2094;

    @ObfuscatedName("fn.ft()V")
    public void method3326() {
        if (this.field2094 != null) {
            this.field2094.field2095 = this.field2095;
            this.field2095.field2094 = this.field2094;
            this.field2095 = null;
            this.field2094 = null;
        }
    }

    @ObfuscatedName("fn.ff()Z")
    public boolean method3329() {
        return this.field2094 != null;
    }
}

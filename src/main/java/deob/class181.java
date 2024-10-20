package deob;

@ObfuscatedName("fx")
public class class181 {

    @ObfuscatedName("fx.cl")
    public long field2094;

    @ObfuscatedName("fx.cw")
    public class181 field2093;

    @ObfuscatedName("fx.cq")
    public class181 field2095;

    @ObfuscatedName("fx.fu()V")
    public void method3249() {
        if (this.field2095 != null) {
            this.field2095.field2093 = this.field2093;
            this.field2093.field2095 = this.field2095;
            this.field2093 = null;
            this.field2095 = null;
        }
    }

    @ObfuscatedName("fx.fa()Z")
    public boolean method3246() {
        return this.field2095 != null;
    }
}

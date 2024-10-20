package deob;

@ObfuscatedName("ha")
public class class209 {

    @ObfuscatedName("ha.em")
    public long field3126;

    @ObfuscatedName("ha.ef")
    public class209 field3125;

    @ObfuscatedName("ha.es")
    public class209 field3124;

    @ObfuscatedName("ha.iz()V")
    public void method3737() {
        if (this.field3124 != null) {
            this.field3124.field3125 = this.field3125;
            this.field3125.field3124 = this.field3124;
            this.field3125 = null;
            this.field3124 = null;
        }
    }

    @ObfuscatedName("ha.jh()Z")
    public boolean method3742() {
        return this.field3124 != null;
    }
}

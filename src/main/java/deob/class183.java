package deob;

@ObfuscatedName("gl")
public class class183 {

    @ObfuscatedName("gl.dh")
    public long field2843;

    @ObfuscatedName("gl.ew")
    public class183 field2844;

    @ObfuscatedName("gl.em")
    public class183 field2845;

    @ObfuscatedName("gl.hp()V")
    public void method3307() {
        if (this.field2845 != null) {
            this.field2845.field2844 = this.field2844;
            this.field2844.field2845 = this.field2845;
            this.field2844 = null;
            this.field2845 = null;
        }
    }

    @ObfuscatedName("gl.hb()Z")
    public boolean method3304() {
        return this.field2845 != null;
    }
}

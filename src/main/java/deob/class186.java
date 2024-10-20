package deob;

@ObfuscatedName("go")
public class class186 {

    @ObfuscatedName("go.dy")
    public long field2877;

    @ObfuscatedName("go.er")
    public class186 field2875;

    @ObfuscatedName("go.ef")
    public class186 field2876;

    @ObfuscatedName("go.hs()V")
    public void method3275() {
        if (this.field2876 != null) {
            this.field2876.field2875 = this.field2875;
            this.field2875.field2876 = this.field2876;
            this.field2875 = null;
            this.field2876 = null;
        }
    }

    @ObfuscatedName("go.hu()Z")
    public boolean method3278() {
        return this.field2876 != null;
    }
}

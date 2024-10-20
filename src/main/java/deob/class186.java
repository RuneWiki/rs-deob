package deob;

@ObfuscatedName("gc")
public class class186 {

    @ObfuscatedName("gc.dk")
    public long field2875;

    @ObfuscatedName("gc.er")
    public class186 field2876;

    @ObfuscatedName("gc.ef")
    public class186 field2877;

    @ObfuscatedName("gc.hl()V")
    public void method3322() {
        if (this.field2877 != null) {
            this.field2877.field2876 = this.field2876;
            this.field2876.field2877 = this.field2877;
            this.field2876 = null;
            this.field2877 = null;
        }
    }

    @ObfuscatedName("gc.he()Z")
    public boolean method3320() {
        return this.field2877 != null;
    }
}

package deob;

@ObfuscatedName("gk")
public class class187 {

    @ObfuscatedName("gk.dk")
    public long field2879;

    @ObfuscatedName("gk.es")
    public class187 field2878;

    @ObfuscatedName("gk.eh")
    public class187 field2877;

    @ObfuscatedName("gk.hz()V")
    public void method3365() {
        if (this.field2877 != null) {
            this.field2877.field2878 = this.field2878;
            this.field2878.field2877 = this.field2877;
            this.field2878 = null;
            this.field2877 = null;
        }
    }

    @ObfuscatedName("gk.hv()Z")
    public boolean method3366() {
        return this.field2877 != null;
    }
}

package deob;

@ObfuscatedName("hv")
public class class212 {

    @ObfuscatedName("hv.ci")
    public long field2502;

    @ObfuscatedName("hv.cl")
    public class212 field2500;

    @ObfuscatedName("hv.cs")
    public class212 field2501;

    @ObfuscatedName("hv.ji()V")
    public void method3973() {
        if (this.field2501 != null) {
            this.field2501.field2500 = this.field2500;
            this.field2500.field2501 = this.field2501;
            this.field2500 = null;
            this.field2501 = null;
        }
    }

    @ObfuscatedName("hv.jw()Z")
    public boolean method3974() {
        return this.field2501 != null;
    }
}

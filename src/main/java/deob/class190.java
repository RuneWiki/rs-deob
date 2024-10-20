package deob;

@ObfuscatedName("ga")
public class class190 {

    @ObfuscatedName("ga.ct")
    public long field2117;

    @ObfuscatedName("ga.cf")
    public class190 field2118;

    @ObfuscatedName("ga.ca")
    public class190 field2116;

    @ObfuscatedName("ga.fd()V")
    public void method3355() {
        if (this.field2116 != null) {
            this.field2116.field2118 = this.field2118;
            this.field2118.field2116 = this.field2116;
            this.field2118 = null;
            this.field2116 = null;
        }
    }

    @ObfuscatedName("ga.fo()Z")
    public boolean method3356() {
        return this.field2116 != null;
    }
}

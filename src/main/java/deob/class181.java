package deob;

@ObfuscatedName("fb")
public class class181 {

    @ObfuscatedName("fb.cy")
    public long field2096;

    @ObfuscatedName("fb.cz")
    public class181 field2097;

    @ObfuscatedName("fb.cv")
    public class181 field2095;

    @ObfuscatedName("fb.fm()V")
    public void method3304() {
        if (this.field2095 != null) {
            this.field2095.field2097 = this.field2097;
            this.field2097.field2095 = this.field2095;
            this.field2097 = null;
            this.field2095 = null;
        }
    }

    @ObfuscatedName("fb.fx()Z")
    public boolean method3305() {
        return this.field2095 != null;
    }
}

package deob;

@ObfuscatedName("gj")
public class class208 {

    @ObfuscatedName("gj.ej")
    public long field3107;

    @ObfuscatedName("gj.em")
    public class208 field3106;

    @ObfuscatedName("gj.eq")
    public class208 field3105;

    @ObfuscatedName("gj.it()V")
    public void method3620() {
        if (this.field3105 != null) {
            this.field3105.field3106 = this.field3106;
            this.field3106.field3105 = this.field3105;
            this.field3106 = null;
            this.field3105 = null;
        }
    }

    @ObfuscatedName("gj.is()Z")
    public boolean method3621() {
        return this.field3105 != null;
    }
}

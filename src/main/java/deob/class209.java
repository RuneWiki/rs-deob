package deob;

@ObfuscatedName("hd")
public class class209 {

    @ObfuscatedName("hd.ej")
    public long field3116;

    @ObfuscatedName("hd.ed")
    public class209 field3115;

    @ObfuscatedName("hd.em")
    public class209 field3117;

    @ObfuscatedName("hd.ht()V")
    public void method3632() {
        if (this.field3117 != null) {
            this.field3117.field3115 = this.field3115;
            this.field3115.field3117 = this.field3117;
            this.field3115 = null;
            this.field3117 = null;
        }
    }

    @ObfuscatedName("hd.hp()Z")
    public boolean method3634() {
        return this.field3117 != null;
    }
}

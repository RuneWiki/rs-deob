package deob;

@ObfuscatedName("gm")
public class class186 {

    @ObfuscatedName("gm.df")
    public long field2864;

    @ObfuscatedName("gm.eh")
    public class186 field2863;

    @ObfuscatedName("gm.em")
    public class186 field2865;

    @ObfuscatedName("gm.ih()V")
    public void method3316() {
        if (this.field2865 != null) {
            this.field2865.field2863 = this.field2863;
            this.field2863.field2865 = this.field2865;
            this.field2863 = null;
            this.field2865 = null;
        }
    }

    @ObfuscatedName("gm.ig()Z")
    public boolean method3317() {
        return this.field2865 != null;
    }
}

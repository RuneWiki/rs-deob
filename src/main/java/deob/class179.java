package deob;

@ObfuscatedName("fi")
public class class179 {

    @ObfuscatedName("fi.dx")
    public long field2809;

    @ObfuscatedName("fi.dp")
    public class179 field2808;

    @ObfuscatedName("fi.eq")
    public class179 field2810;

    @ObfuscatedName("fi.hv()V")
    public void method3359() {
        if (this.field2810 != null) {
            this.field2810.field2808 = this.field2808;
            this.field2808.field2810 = this.field2810;
            this.field2808 = null;
            this.field2810 = null;
        }
    }

    @ObfuscatedName("fi.hs()Z")
    public boolean method3358() {
        return this.field2810 != null;
    }
}

package deob;

@ObfuscatedName("gv")
public class class189 {

    @ObfuscatedName("gv.ee")
    public long field2886;

    @ObfuscatedName("gv.ey")
    public class189 field2885;

    @ObfuscatedName("gv.ej")
    public class189 field2887;

    @ObfuscatedName("gv.hp()V")
    public void method3375() {
        if (this.field2887 != null) {
            this.field2887.field2885 = this.field2885;
            this.field2885.field2887 = this.field2887;
            this.field2885 = null;
            this.field2887 = null;
        }
    }

    @ObfuscatedName("gv.hs()Z")
    public boolean method3374() {
        return this.field2887 != null;
    }
}

package deob;

@ObfuscatedName("gg")
public class class199 {

    @ObfuscatedName("gg.en")
    public long field3018;

    @ObfuscatedName("gg.ek")
    public class199 field3017;

    @ObfuscatedName("gg.et")
    public class199 field3019;

    @ObfuscatedName("gg.hx()V")
    public void method3554() {
        if (this.field3019 != null) {
            this.field3019.field3017 = this.field3017;
            this.field3017.field3019 = this.field3019;
            this.field3017 = null;
            this.field3019 = null;
        }
    }

    @ObfuscatedName("gg.ht()Z")
    public boolean method3555() {
        return this.field3019 != null;
    }
}

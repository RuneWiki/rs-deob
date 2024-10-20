package deob;

@ObfuscatedName("tv")
public class class501 extends class505 {

    @ObfuscatedName("tv.eh")
    public long field5076;

    @ObfuscatedName("tv.ew")
    public class501 field5077;

    @ObfuscatedName("tv.eb")
    public class501 field5075;

    @ObfuscatedName("tv.km()V")
    public void method8125() {
        if (this.field5075 != null) {
            this.field5075.field5077 = this.field5077;
            this.field5077.field5075 = this.field5075;
            this.field5077 = null;
            this.field5075 = null;
        }
    }
}

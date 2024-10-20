package deob;

@ObfuscatedName("tw")
public class class515 {

    @ObfuscatedName("tw.ht")
    public long field5170;

    @ObfuscatedName("tw.hf")
    public class515 field5171;

    @ObfuscatedName("tw.hn")
    public class515 field5169;

    @ObfuscatedName("tw.kf()V")
    public void method8667() {
        if (this.field5169 != null) {
            this.field5169.field5171 = this.field5171;
            this.field5171.field5169 = this.field5169;
            this.field5171 = null;
            this.field5169 = null;
        }
    }

    @ObfuscatedName("tw.km()Z")
    public boolean method8666() {
        return this.field5169 != null;
    }
}

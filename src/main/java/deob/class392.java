package deob;

@ObfuscatedName("oe")
public class class392 {

    @ObfuscatedName("oe.fh")
    public long field4301;

    @ObfuscatedName("oe.fj")
    public class392 field4300;

    @ObfuscatedName("oe.fo")
    public class392 field4302;

    @ObfuscatedName("oe.ek()V")
    public void method6167() {
        if (this.field4302 != null) {
            this.field4302.field4300 = this.field4300;
            this.field4300.field4302 = this.field4302;
            this.field4300 = null;
            this.field4302 = null;
        }
    }

    @ObfuscatedName("oe.fc()Z")
    public boolean method6168() {
        return this.field4302 != null;
    }
}

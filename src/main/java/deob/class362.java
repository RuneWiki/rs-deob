package deob;

@ObfuscatedName("ni")
public final class class362 {

    @ObfuscatedName("ni.af")
    public class444 field4354 = new class444();

    public class362() {
        this.field4354.field4739 = this.field4354;
        this.field4354.field4740 = this.field4354;
    }

    @ObfuscatedName("ni.af(Lrk;)V")
    public void method6313(class444 arg0) {
        if (arg0.field4740 != null) {
            arg0.method7640();
        }
        arg0.field4740 = this.field4354.field4740;
        arg0.field4739 = this.field4354;
        arg0.field4740.field4739 = arg0;
        arg0.field4739.field4740 = arg0;
    }

    @ObfuscatedName("ni.an(Lrk;)V")
    public void method6320(class444 arg0) {
        if (arg0.field4740 != null) {
            arg0.method7640();
        }
        arg0.field4740 = this.field4354;
        arg0.field4739 = this.field4354.field4739;
        arg0.field4740.field4739 = arg0;
        arg0.field4739.field4740 = arg0;
    }

    @ObfuscatedName("ni.aw()Lrk;")
    public class444 method6315() {
        class444 var1 = this.field4354.field4739;
        return this.field4354 == var1 ? null : var1;
    }
}

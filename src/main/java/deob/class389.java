package deob;

@ObfuscatedName("od")
public final class class389 {

    @ObfuscatedName("od.at")
    public class481 field4435 = new class481();

    public class389() {
        this.field4435.field4842 = this.field4435;
        this.field4435.field4844 = this.field4435;
    }

    @ObfuscatedName("od.at(Lsn;)V")
    public void method6531(class481 arg0) {
        if (arg0.field4844 != null) {
            arg0.method7825();
        }
        arg0.field4844 = this.field4435.field4844;
        arg0.field4842 = this.field4435;
        arg0.field4844.field4842 = arg0;
        arg0.field4842.field4844 = arg0;
    }

    @ObfuscatedName("od.ah(Lsn;)V")
    public void method6529(class481 arg0) {
        if (arg0.field4844 != null) {
            arg0.method7825();
        }
        arg0.field4844 = this.field4435;
        arg0.field4842 = this.field4435.field4842;
        arg0.field4844.field4842 = arg0;
        arg0.field4842.field4844 = arg0;
    }

    @ObfuscatedName("od.ar()Lsn;")
    public class481 method6530() {
        class481 var1 = this.field4435.field4842;
        return this.field4435 == var1 ? null : var1;
    }
}

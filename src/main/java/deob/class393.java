package deob;

@ObfuscatedName("pu")
public class class393 {

    @ObfuscatedName("pu.at")
    public class480 field4443 = new class480();

    @ObfuscatedName("pu.ah")
    public class480 field4444;

    public class393() {
        this.field4443.field4841 = this.field4443;
        this.field4443.field4840 = this.field4443;
    }

    @ObfuscatedName("pu.at(Lse;)V")
    public void method6679(class480 arg0) {
        if (arg0.field4840 != null) {
            arg0.method7820();
        }
        arg0.field4840 = this.field4443.field4840;
        arg0.field4841 = this.field4443;
        arg0.field4840.field4841 = arg0;
        arg0.field4841.field4840 = arg0;
    }

    @ObfuscatedName("pu.ah()Lse;")
    public class480 method6678() {
        class480 var1 = this.field4443.field4841;
        if (this.field4443 == var1) {
            this.field4444 = null;
            return null;
        } else {
            this.field4444 = var1.field4841;
            return var1;
        }
    }

    @ObfuscatedName("pu.ar()Lse;")
    public class480 method6676() {
        class480 var1 = this.field4444;
        if (this.field4443 == var1) {
            this.field4444 = null;
            return null;
        } else {
            this.field4444 = var1.field4841;
            return var1;
        }
    }
}

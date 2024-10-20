package deob;

@ObfuscatedName("pp")
public class class401 {

    @ObfuscatedName("pp.az")
    public class488 field4547 = new class488();

    @ObfuscatedName("pp.ah")
    public class488 field4548;

    public class401() {
        this.field4547.field4942 = this.field4547;
        this.field4547.field4943 = this.field4547;
    }

    @ObfuscatedName("pp.az(Lsn;)V")
    public void method6722(class488 arg0) {
        if (arg0.field4943 != null) {
            arg0.method7849();
        }
        arg0.field4943 = this.field4547.field4943;
        arg0.field4942 = this.field4547;
        arg0.field4943.field4942 = arg0;
        arg0.field4942.field4943 = arg0;
    }

    @ObfuscatedName("pp.ah()Lsn;")
    public class488 method6723() {
        class488 var1 = this.field4547.field4942;
        if (this.field4547 == var1) {
            this.field4548 = null;
            return null;
        } else {
            this.field4548 = var1.field4942;
            return var1;
        }
    }

    @ObfuscatedName("pp.af()Lsn;")
    public class488 method6724() {
        class488 var1 = this.field4548;
        if (this.field4547 == var1) {
            this.field4548 = null;
            return null;
        } else {
            this.field4548 = var1.field4942;
            return var1;
        }
    }
}

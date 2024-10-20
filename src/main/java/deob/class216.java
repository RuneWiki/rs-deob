package deob;

@ObfuscatedName("hp")
public class class216 {

    @ObfuscatedName("hp.a")
    public class217 field2519 = new class217();

    @ObfuscatedName("hp.s")
    public class217 field2520;

    public class216() {
        this.field2519.field2521 = this.field2519;
        this.field2519.field2522 = this.field2519;
    }

    @ObfuscatedName("hp.a(Lhh;)V")
    public void method4005(class217 arg0) {
        if (arg0.field2522 != null) {
            arg0.method4010();
        }
        arg0.field2522 = this.field2519.field2522;
        arg0.field2521 = this.field2519;
        arg0.field2522.field2521 = arg0;
        arg0.field2521.field2522 = arg0;
    }

    @ObfuscatedName("hp.s()Lhh;")
    public class217 method4004() {
        class217 var1 = this.field2519.field2521;
        if (this.field2519 == var1) {
            this.field2520 = null;
            return null;
        } else {
            this.field2520 = var1.field2521;
            return var1;
        }
    }

    @ObfuscatedName("hp.g()Lhh;")
    public class217 method4000() {
        class217 var1 = this.field2520;
        if (this.field2519 == var1) {
            this.field2520 = null;
            return null;
        } else {
            this.field2520 = var1.field2521;
            return var1;
        }
    }
}

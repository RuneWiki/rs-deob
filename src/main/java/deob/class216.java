package deob;

@ObfuscatedName("hk")
public class class216 {

    @ObfuscatedName("hk.n")
    public class217 field2509 = new class217();

    @ObfuscatedName("hk.h")
    public class217 field2510;

    public class216() {
        this.field2509.field2511 = this.field2509;
        this.field2509.field2512 = this.field2509;
    }

    @ObfuscatedName("hk.n(Lhf;)V")
    public void method4035(class217 arg0) {
        if (arg0.field2512 != null) {
            arg0.method4036();
        }
        arg0.field2512 = this.field2509.field2512;
        arg0.field2511 = this.field2509;
        arg0.field2512.field2511 = arg0;
        arg0.field2511.field2512 = arg0;
    }

    @ObfuscatedName("hk.h()Lhf;")
    public class217 method4034() {
        class217 var1 = this.field2509.field2511;
        if (this.field2509 == var1) {
            this.field2510 = null;
            return null;
        } else {
            this.field2510 = var1.field2511;
            return var1;
        }
    }

    @ObfuscatedName("hk.l()Lhf;")
    public class217 method4028() {
        class217 var1 = this.field2510;
        if (this.field2509 == var1) {
            this.field2510 = null;
            return null;
        } else {
            this.field2510 = var1.field2511;
            return var1;
        }
    }
}

package deob;

@ObfuscatedName("ma")
public class class355 {

    @ObfuscatedName("ma.h")
    public class427 field4337 = new class427();

    @ObfuscatedName("ma.e")
    public class427 field4338;

    public class355() {
        this.field4337.field4676 = this.field4337;
        this.field4337.field4675 = this.field4337;
    }

    @ObfuscatedName("ma.h(Lpr;)V")
    public void method6209(class427 arg0) {
        if (arg0.field4675 != null) {
            arg0.method7223();
        }
        arg0.field4675 = this.field4337.field4675;
        arg0.field4676 = this.field4337;
        arg0.field4675.field4676 = arg0;
        arg0.field4676.field4675 = arg0;
    }

    @ObfuscatedName("ma.e()Lpr;")
    public class427 method6208() {
        class427 var1 = this.field4337.field4676;
        if (this.field4337 == var1) {
            this.field4338 = null;
            return null;
        } else {
            this.field4338 = var1.field4676;
            return var1;
        }
    }

    @ObfuscatedName("ma.v()Lpr;")
    public class427 method6210() {
        class427 var1 = this.field4338;
        if (this.field4337 == var1) {
            this.field4338 = null;
            return null;
        } else {
            this.field4338 = var1.field4676;
            return var1;
        }
    }
}

package deob;

@ObfuscatedName("kd")
public class class298 {

    @ObfuscatedName("kd.f")
    public class347 field3716 = new class347();

    @ObfuscatedName("kd.e")
    public class347 field3715;

    public class298() {
        this.field3716.field3926 = this.field3716;
        this.field3716.field3927 = this.field3716;
    }

    @ObfuscatedName("kd.f(Lmr;)V")
    public void method4830(class347 arg0) {
        if (arg0.field3927 != null) {
            arg0.method5400();
        }
        arg0.field3927 = this.field3716.field3927;
        arg0.field3926 = this.field3716;
        arg0.field3927.field3926 = arg0;
        arg0.field3926.field3927 = arg0;
    }

    @ObfuscatedName("kd.e()Lmr;")
    public class347 method4829() {
        class347 var1 = this.field3716.field3926;
        if (this.field3716 == var1) {
            this.field3715 = null;
            return null;
        } else {
            this.field3715 = var1.field3926;
            return var1;
        }
    }

    @ObfuscatedName("kd.v()Lmr;")
    public class347 method4831() {
        class347 var1 = this.field3715;
        if (this.field3716 == var1) {
            this.field3715 = null;
            return null;
        } else {
            this.field3715 = var1.field3926;
            return var1;
        }
    }
}

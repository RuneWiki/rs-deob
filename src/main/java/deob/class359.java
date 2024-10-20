package deob;

@ObfuscatedName("me")
public class class359 {

    @ObfuscatedName("me.f")
    public class434 field4351 = new class434();

    @ObfuscatedName("me.w")
    public class434 field4352;

    public class359() {
        this.field4351.field4701 = this.field4351;
        this.field4351.field4700 = this.field4351;
    }

    @ObfuscatedName("me.f(Lpz;)V")
    public void method6352(class434 arg0) {
        if (arg0.field4700 != null) {
            arg0.method7428();
        }
        arg0.field4700 = this.field4351.field4700;
        arg0.field4701 = this.field4351;
        arg0.field4700.field4701 = arg0;
        arg0.field4701.field4700 = arg0;
    }

    @ObfuscatedName("me.w()Lpz;")
    public class434 method6358() {
        class434 var1 = this.field4351.field4701;
        if (this.field4351 == var1) {
            this.field4352 = null;
            return null;
        } else {
            this.field4352 = var1.field4701;
            return var1;
        }
    }

    @ObfuscatedName("me.v()Lpz;")
    public class434 method6354() {
        class434 var1 = this.field4352;
        if (this.field4351 == var1) {
            this.field4352 = null;
            return null;
        } else {
            this.field4352 = var1.field4701;
            return var1;
        }
    }
}

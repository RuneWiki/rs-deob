package deob;

@ObfuscatedName("jp")
public class class275 {

    @ObfuscatedName("jp.f")
    public class345 field3389 = new class345();

    @ObfuscatedName("jp.o")
    public class345 field3388;

    public class275() {
        this.field3389.field3933 = this.field3389;
        this.field3389.field3932 = this.field3389;
    }

    @ObfuscatedName("jp.f(Lmc;)V")
    public void method4277(class345 arg0) {
        if (arg0.field3932 != null) {
            arg0.method5345();
        }
        arg0.field3932 = this.field3389.field3932;
        arg0.field3933 = this.field3389;
        arg0.field3932.field3933 = arg0;
        arg0.field3933.field3932 = arg0;
    }

    @ObfuscatedName("jp.o()Lmc;")
    public class345 method4274() {
        class345 var1 = this.field3389.field3933;
        if (this.field3389 == var1) {
            this.field3388 = null;
            return null;
        } else {
            this.field3388 = var1.field3933;
            return var1;
        }
    }

    @ObfuscatedName("jp.u()Lmc;")
    public class345 method4275() {
        class345 var1 = this.field3388;
        if (this.field3389 == var1) {
            this.field3388 = null;
            return null;
        } else {
            this.field3388 = var1.field3933;
            return var1;
        }
    }
}

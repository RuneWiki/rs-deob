package deob;

@ObfuscatedName("gm")
public class class195 {

    @ObfuscatedName("gm.d")
    public class207 field3079 = new class207();

    @ObfuscatedName("gm.p")
    public class207 field3078;

    public class195() {
        this.field3079.field3104 = this.field3079;
        this.field3079.field3103 = this.field3079;
    }

    @ObfuscatedName("gm.d(Lgb;)V")
    public void method3579(class207 arg0) {
        if (arg0.field3103 != null) {
            arg0.method3705();
        }
        arg0.field3103 = this.field3079.field3103;
        arg0.field3104 = this.field3079;
        arg0.field3103.field3104 = arg0;
        arg0.field3104.field3103 = arg0;
    }

    @ObfuscatedName("gm.p()Lgb;")
    public class207 method3578() {
        class207 var1 = this.field3079.field3104;
        if (this.field3079 == var1) {
            this.field3078 = null;
            return null;
        } else {
            this.field3078 = var1.field3104;
            return var1;
        }
    }

    @ObfuscatedName("gm.v()Lgb;")
    public class207 method3580() {
        class207 var1 = this.field3078;
        if (this.field3079 == var1) {
            this.field3078 = null;
            return null;
        } else {
            this.field3078 = var1.field3104;
            return var1;
        }
    }
}

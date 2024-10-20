package deob;

@ObfuscatedName("gq")
public class class195 {

    @ObfuscatedName("gq.l")
    public class207 field3079 = new class207();

    @ObfuscatedName("gq.e")
    public class207 field3078;

    public class195() {
        this.field3079.field3104 = this.field3079;
        this.field3079.field3103 = this.field3079;
    }

    @ObfuscatedName("gq.l(Lgv;)V")
    public void method3498(class207 arg0) {
        if (arg0.field3103 != null) {
            arg0.method3617();
        }
        arg0.field3103 = this.field3079.field3103;
        arg0.field3104 = this.field3079;
        arg0.field3103.field3104 = arg0;
        arg0.field3104.field3103 = arg0;
    }

    @ObfuscatedName("gq.e()Lgv;")
    public class207 method3499() {
        class207 var1 = this.field3079.field3104;
        if (this.field3079 == var1) {
            this.field3078 = null;
            return null;
        } else {
            this.field3078 = var1.field3104;
            return var1;
        }
    }

    @ObfuscatedName("gq.q()Lgv;")
    public class207 method3500() {
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

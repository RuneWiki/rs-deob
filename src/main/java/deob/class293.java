package deob;

@ObfuscatedName("ka")
public final class class293 {

    @ObfuscatedName("ka.v")
    public class347 field3704 = new class347();

    public class293() {
        this.field3704.field3931 = this.field3704;
        this.field3704.field3933 = this.field3704;
    }

    @ObfuscatedName("ka.v(Lmf;)V")
    public void method4700(class347 arg0) {
        if (arg0.field3933 != null) {
            arg0.method5487();
        }
        arg0.field3933 = this.field3704.field3933;
        arg0.field3931 = this.field3704;
        arg0.field3933.field3931 = arg0;
        arg0.field3931.field3933 = arg0;
    }

    @ObfuscatedName("ka.n(Lmf;)V")
    public void method4699(class347 arg0) {
        if (arg0.field3933 != null) {
            arg0.method5487();
        }
        arg0.field3933 = this.field3704;
        arg0.field3931 = this.field3704.field3931;
        arg0.field3933.field3931 = arg0;
        arg0.field3931.field3933 = arg0;
    }

    @ObfuscatedName("ka.f()Lmf;")
    public class347 method4702() {
        class347 var1 = this.field3704.field3931;
        return this.field3704 == var1 ? null : var1;
    }
}

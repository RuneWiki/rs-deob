package deob;

@ObfuscatedName("ke")
public final class class294 {

    @ObfuscatedName("ke.f")
    public class348 field3707 = new class348();

    public class294() {
        this.field3707.field3929 = this.field3707;
        this.field3707.field3928 = this.field3707;
    }

    @ObfuscatedName("ke.f(Lmm;)V")
    public void method4704(class348 arg0) {
        if (arg0.field3928 != null) {
            arg0.method5404();
        }
        arg0.field3928 = this.field3707.field3928;
        arg0.field3929 = this.field3707;
        arg0.field3928.field3929 = arg0;
        arg0.field3929.field3928 = arg0;
    }

    @ObfuscatedName("ke.e(Lmm;)V")
    public void method4705(class348 arg0) {
        if (arg0.field3928 != null) {
            arg0.method5404();
        }
        arg0.field3928 = this.field3707;
        arg0.field3929 = this.field3707.field3929;
        arg0.field3928.field3929 = arg0;
        arg0.field3929.field3928 = arg0;
    }

    @ObfuscatedName("ke.v()Lmm;")
    public class348 method4706() {
        class348 var1 = this.field3707.field3929;
        return this.field3707 == var1 ? null : var1;
    }
}

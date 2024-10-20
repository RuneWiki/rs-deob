package deob;

@ObfuscatedName("gt")
public final class class197 {

    @ObfuscatedName("gt.f")
    public class209 field2467 = new class209();

    public class197() {
        this.field2467.field2501 = this.field2467;
        this.field2467.field2502 = this.field2467;
    }

    @ObfuscatedName("gt.f(Lhe;)V")
    public void method3685(class209 arg0) {
        if (arg0.field2502 != null) {
            arg0.method3851();
        }
        arg0.field2502 = this.field2467.field2502;
        arg0.field2501 = this.field2467;
        arg0.field2502.field2501 = arg0;
        arg0.field2501.field2502 = arg0;
    }

    @ObfuscatedName("gt.l(Lhe;)V")
    public void method3684(class209 arg0) {
        if (arg0.field2502 != null) {
            arg0.method3851();
        }
        arg0.field2502 = this.field2467;
        arg0.field2501 = this.field2467.field2501;
        arg0.field2502.field2501 = arg0;
        arg0.field2501.field2502 = arg0;
    }

    @ObfuscatedName("gt.w(Lhe;Lhe;)V")
    public static void method3687(class209 arg0, class209 arg1) {
        if (arg0.field2502 != null) {
            arg0.method3851();
        }
        arg0.field2502 = arg1;
        arg0.field2501 = arg1.field2501;
        arg0.field2502.field2501 = arg0;
        arg0.field2501.field2502 = arg0;
    }

    @ObfuscatedName("gt.s()Lhe;")
    public class209 method3688() {
        class209 var1 = this.field2467.field2501;
        if (this.field2467 == var1) {
            return null;
        } else {
            var1.method3851();
            return var1;
        }
    }

    @ObfuscatedName("gt.e()Lhe;")
    public class209 method3689() {
        class209 var1 = this.field2467.field2501;
        return this.field2467 == var1 ? null : var1;
    }

    @ObfuscatedName("gt.c()V")
    public void method3699() {
        while (true) {
            class209 var1 = this.field2467.field2501;
            if (this.field2467 == var1) {
                return;
            }
            var1.method3851();
        }
    }
}

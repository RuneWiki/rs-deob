package deob;

@ObfuscatedName("gd")
public final class class202 {

    @ObfuscatedName("gd.a")
    public class214 field2482 = new class214();

    public class202() {
        this.field2482.field2516 = this.field2482;
        this.field2482.field2515 = this.field2482;
    }

    @ObfuscatedName("gd.a(Lho;)V")
    public void method3818(class214 arg0) {
        if (arg0.field2515 != null) {
            arg0.method3997();
        }
        arg0.field2515 = this.field2482.field2515;
        arg0.field2516 = this.field2482;
        arg0.field2515.field2516 = arg0;
        arg0.field2516.field2515 = arg0;
    }

    @ObfuscatedName("gd.s(Lho;)V")
    public void method3820(class214 arg0) {
        if (arg0.field2515 != null) {
            arg0.method3997();
        }
        arg0.field2515 = this.field2482;
        arg0.field2516 = this.field2482.field2516;
        arg0.field2515.field2516 = arg0;
        arg0.field2516.field2515 = arg0;
    }

    @ObfuscatedName("gd.g(Lho;Lho;)V")
    public static void method3821(class214 arg0, class214 arg1) {
        if (arg0.field2515 != null) {
            arg0.method3997();
        }
        arg0.field2515 = arg1;
        arg0.field2516 = arg1.field2516;
        arg0.field2515.field2516 = arg0;
        arg0.field2516.field2515 = arg0;
    }

    @ObfuscatedName("gd.x()Lho;")
    public class214 method3836() {
        class214 var1 = this.field2482.field2516;
        if (this.field2482 == var1) {
            return null;
        } else {
            var1.method3997();
            return var1;
        }
    }

    @ObfuscatedName("gd.h()Lho;")
    public class214 method3823() {
        class214 var1 = this.field2482.field2516;
        return this.field2482 == var1 ? null : var1;
    }

    @ObfuscatedName("gd.f()V")
    public void method3822() {
        while (true) {
            class214 var1 = this.field2482.field2516;
            if (this.field2482 == var1) {
                return;
            }
            var1.method3997();
        }
    }
}

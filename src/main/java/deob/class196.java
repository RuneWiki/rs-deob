package deob;

@ObfuscatedName("gp")
public final class class196 {

    @ObfuscatedName("gp.s")
    public class206 field2561 = new class206();

    public class196() {
        this.field2561.field2590 = this.field2561;
        this.field2561.field2589 = this.field2561;
    }

    @ObfuscatedName("gp.s(Lgv;)V")
    public void method3627(class206 arg0) {
        if (arg0.field2589 != null) {
            arg0.method3781();
        }
        arg0.field2589 = this.field2561.field2589;
        arg0.field2590 = this.field2561;
        arg0.field2589.field2590 = arg0;
        arg0.field2590.field2589 = arg0;
    }

    @ObfuscatedName("gp.g(Lgv;)V")
    public void method3639(class206 arg0) {
        if (arg0.field2589 != null) {
            arg0.method3781();
        }
        arg0.field2589 = this.field2561;
        arg0.field2590 = this.field2561.field2590;
        arg0.field2589.field2590 = arg0;
        arg0.field2590.field2589 = arg0;
    }

    @ObfuscatedName("gp.m()Lgv;")
    public class206 method3629() {
        class206 var1 = this.field2561.field2590;
        if (this.field2561 == var1) {
            return null;
        } else {
            var1.method3781();
            return var1;
        }
    }

    @ObfuscatedName("gp.h()Lgv;")
    public class206 method3638() {
        class206 var1 = this.field2561.field2590;
        return this.field2561 == var1 ? null : var1;
    }

    @ObfuscatedName("gp.i()V")
    public void method3631() {
        while (true) {
            class206 var1 = this.field2561.field2590;
            if (this.field2561 == var1) {
                return;
            }
            var1.method3781();
        }
    }
}

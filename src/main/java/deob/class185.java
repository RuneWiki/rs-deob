package deob;

@ObfuscatedName("gf")
public final class class185 {

    @ObfuscatedName("gf.i")
    public class195 field2457 = new class195();

    public class185() {
        this.field2457.field2485 = this.field2457;
        this.field2457.field2486 = this.field2457;
    }

    @ObfuscatedName("gf.i(Lgc;)V")
    public void method3190(class195 arg0) {
        if (arg0.field2486 != null) {
            arg0.method3318();
        }
        arg0.field2486 = this.field2457.field2486;
        arg0.field2485 = this.field2457;
        arg0.field2486.field2485 = arg0;
        arg0.field2485.field2486 = arg0;
    }

    @ObfuscatedName("gf.c(Lgc;)V")
    public void method3179(class195 arg0) {
        if (arg0.field2486 != null) {
            arg0.method3318();
        }
        arg0.field2486 = this.field2457;
        arg0.field2485 = this.field2457.field2485;
        arg0.field2486.field2485 = arg0;
        arg0.field2485.field2486 = arg0;
    }

    @ObfuscatedName("gf.e()Lgc;")
    public class195 method3181() {
        class195 var1 = this.field2457.field2485;
        if (this.field2457 == var1) {
            return null;
        } else {
            var1.method3318();
            return var1;
        }
    }

    @ObfuscatedName("gf.v()Lgc;")
    public class195 method3187() {
        class195 var1 = this.field2457.field2485;
        return this.field2457 == var1 ? null : var1;
    }

    @ObfuscatedName("gf.b()V")
    public void method3183() {
        while (true) {
            class195 var1 = this.field2457.field2485;
            if (this.field2457 == var1) {
                return;
            }
            var1.method3318();
        }
    }
}

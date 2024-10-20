package deob;

@ObfuscatedName("gm")
public final class class207 {

    @ObfuscatedName("gm.t")
    public class219 field2608 = new class219();

    public class207() {
        this.field2608.field2643 = this.field2608;
        this.field2608.field2641 = this.field2608;
    }

    @ObfuscatedName("gm.t(Lhh;)V")
    public void method3573(class219 arg0) {
        if (arg0.field2641 != null) {
            arg0.method3761();
        }
        arg0.field2641 = this.field2608.field2641;
        arg0.field2643 = this.field2608;
        arg0.field2641.field2643 = arg0;
        arg0.field2643.field2641 = arg0;
    }

    @ObfuscatedName("gm.q(Lhh;)V")
    public void method3574(class219 arg0) {
        if (arg0.field2641 != null) {
            arg0.method3761();
        }
        arg0.field2641 = this.field2608;
        arg0.field2643 = this.field2608.field2643;
        arg0.field2641.field2643 = arg0;
        arg0.field2643.field2641 = arg0;
    }

    @ObfuscatedName("gm.i(Lhh;Lhh;)V")
    public static void method3577(class219 arg0, class219 arg1) {
        if (arg0.field2641 != null) {
            arg0.method3761();
        }
        arg0.field2641 = arg1;
        arg0.field2643 = arg1.field2643;
        arg0.field2641.field2643 = arg0;
        arg0.field2643.field2641 = arg0;
    }

    @ObfuscatedName("gm.a()Lhh;")
    public class219 method3576() {
        class219 var1 = this.field2608.field2643;
        if (this.field2608 == var1) {
            return null;
        } else {
            var1.method3761();
            return var1;
        }
    }

    @ObfuscatedName("gm.l()Lhh;")
    public class219 method3583() {
        class219 var1 = this.field2608.field2643;
        return this.field2608 == var1 ? null : var1;
    }

    @ObfuscatedName("gm.b()V")
    public void method3578() {
        while (true) {
            class219 var1 = this.field2608.field2643;
            if (this.field2608 == var1) {
                return;
            }
            var1.method3761();
        }
    }
}

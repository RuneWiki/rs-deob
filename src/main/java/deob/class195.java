package deob;

@ObfuscatedName("gm")
public final class class195 {

    @ObfuscatedName("gm.w")
    public class207 field2420 = new class207();

    public class195() {
        this.field2420.field2454 = this.field2420;
        this.field2420.field2453 = this.field2420;
    }

    @ObfuscatedName("gm.w(Lgc;)V")
    public void method3665(class207 arg0) {
        if (arg0.field2453 != null) {
            arg0.method3819();
        }
        arg0.field2453 = this.field2420.field2453;
        arg0.field2454 = this.field2420;
        arg0.field2453.field2454 = arg0;
        arg0.field2454.field2453 = arg0;
    }

    @ObfuscatedName("gm.m(Lgc;)V")
    public void method3649(class207 arg0) {
        if (arg0.field2453 != null) {
            arg0.method3819();
        }
        arg0.field2453 = this.field2420;
        arg0.field2454 = this.field2420.field2454;
        arg0.field2453.field2454 = arg0;
        arg0.field2454.field2453 = arg0;
    }

    @ObfuscatedName("gm.q(Lgc;Lgc;)V")
    public static void method3650(class207 arg0, class207 arg1) {
        if (arg0.field2453 != null) {
            arg0.method3819();
        }
        arg0.field2453 = arg1;
        arg0.field2454 = arg1.field2454;
        arg0.field2453.field2454 = arg0;
        arg0.field2454.field2453 = arg0;
    }

    @ObfuscatedName("gm.x()Lgc;")
    public class207 method3652() {
        class207 var1 = this.field2420.field2454;
        if (this.field2420 == var1) {
            return null;
        } else {
            var1.method3819();
            return var1;
        }
    }

    @ObfuscatedName("gm.j()Lgc;")
    public class207 method3653() {
        class207 var1 = this.field2420.field2454;
        return this.field2420 == var1 ? null : var1;
    }

    @ObfuscatedName("gm.a()V")
    public void method3657() {
        while (true) {
            class207 var1 = this.field2420.field2454;
            if (this.field2420 == var1) {
                return;
            }
            var1.method3819();
        }
    }
}

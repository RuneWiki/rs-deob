package deob;

@ObfuscatedName("gy")
public final class class197 {

    @ObfuscatedName("gy.c")
    public class209 field2437 = new class209();

    public class197() {
        this.field2437.field2471 = this.field2437;
        this.field2437.field2472 = this.field2437;
    }

    @ObfuscatedName("gy.c(Lhc;)V")
    public void method3598(class209 arg0) {
        if (arg0.field2472 != null) {
            arg0.method3765();
        }
        arg0.field2472 = this.field2437.field2472;
        arg0.field2471 = this.field2437;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
    }

    @ObfuscatedName("gy.q(Lhc;)V")
    public void method3607(class209 arg0) {
        if (arg0.field2472 != null) {
            arg0.method3765();
        }
        arg0.field2472 = this.field2437;
        arg0.field2471 = this.field2437.field2471;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
    }

    @ObfuscatedName("gy.m(Lhc;Lhc;)V")
    public static void method3597(class209 arg0, class209 arg1) {
        if (arg0.field2472 != null) {
            arg0.method3765();
        }
        arg0.field2472 = arg1;
        arg0.field2471 = arg1.field2471;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
    }

    @ObfuscatedName("gy.j()Lhc;")
    public class209 method3600() {
        class209 var1 = this.field2437.field2471;
        if (this.field2437 == var1) {
            return null;
        } else {
            var1.method3765();
            return var1;
        }
    }

    @ObfuscatedName("gy.g()Lhc;")
    public class209 method3605() {
        class209 var1 = this.field2437.field2471;
        return this.field2437 == var1 ? null : var1;
    }

    @ObfuscatedName("gy.i()V")
    public void method3611() {
        while (true) {
            class209 var1 = this.field2437.field2471;
            if (this.field2437 == var1) {
                return;
            }
            var1.method3765();
        }
    }
}

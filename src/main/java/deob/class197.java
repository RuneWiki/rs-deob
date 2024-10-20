package deob;

@ObfuscatedName("gm")
public final class class197 {

    @ObfuscatedName("gm.v")
    public class209 field2435 = new class209();

    public class197() {
        this.field2435.field2469 = this.field2435;
        this.field2435.field2470 = this.field2435;
    }

    @ObfuscatedName("gm.v(Lhl;)V")
    public void method3631(class209 arg0) {
        if (arg0.field2470 != null) {
            arg0.method3826();
        }
        arg0.field2470 = this.field2435.field2470;
        arg0.field2469 = this.field2435;
        arg0.field2470.field2469 = arg0;
        arg0.field2469.field2470 = arg0;
    }

    @ObfuscatedName("gm.s(Lhl;)V")
    public void method3632(class209 arg0) {
        if (arg0.field2470 != null) {
            arg0.method3826();
        }
        arg0.field2470 = this.field2435;
        arg0.field2469 = this.field2435.field2469;
        arg0.field2470.field2469 = arg0;
        arg0.field2469.field2470 = arg0;
    }

    @ObfuscatedName("gm.o(Lhl;Lhl;)V")
    public static void method3648(class209 arg0, class209 arg1) {
        if (arg0.field2470 != null) {
            arg0.method3826();
        }
        arg0.field2470 = arg1;
        arg0.field2469 = arg1.field2469;
        arg0.field2470.field2469 = arg0;
        arg0.field2469.field2470 = arg0;
    }

    @ObfuscatedName("gm.k()Lhl;")
    public class209 method3634() {
        class209 var1 = this.field2435.field2469;
        if (this.field2435 == var1) {
            return null;
        } else {
            var1.method3826();
            return var1;
        }
    }

    @ObfuscatedName("gm.u()Lhl;")
    public class209 method3635() {
        class209 var1 = this.field2435.field2469;
        return this.field2435 == var1 ? null : var1;
    }

    @ObfuscatedName("gm.i()V")
    public void method3638() {
        while (true) {
            class209 var1 = this.field2435.field2469;
            if (this.field2435 == var1) {
                return;
            }
            var1.method3826();
        }
    }
}

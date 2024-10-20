package deob;

@ObfuscatedName("gj")
public final class class185 {

    @ObfuscatedName("gj.w")
    public class195 field2441 = new class195();

    public class185() {
        this.field2441.field2469 = this.field2441;
        this.field2441.field2470 = this.field2441;
    }

    @ObfuscatedName("gj.w(Lgp;)V")
    public void method3307(class195 arg0) {
        if (arg0.field2470 != null) {
            arg0.method3457();
        }
        arg0.field2470 = this.field2441.field2470;
        arg0.field2469 = this.field2441;
        arg0.field2470.field2469 = arg0;
        arg0.field2469.field2470 = arg0;
    }

    @ObfuscatedName("gj.s(Lgp;)V")
    public void method3308(class195 arg0) {
        if (arg0.field2470 != null) {
            arg0.method3457();
        }
        arg0.field2470 = this.field2441;
        arg0.field2469 = this.field2441.field2469;
        arg0.field2470.field2469 = arg0;
        arg0.field2469.field2470 = arg0;
    }

    @ObfuscatedName("gj.q()Lgp;")
    public class195 method3309() {
        class195 var1 = this.field2441.field2469;
        if (this.field2441 == var1) {
            return null;
        } else {
            var1.method3457();
            return var1;
        }
    }

    @ObfuscatedName("gj.o()Lgp;")
    public class195 method3311() {
        class195 var1 = this.field2441.field2469;
        return this.field2441 == var1 ? null : var1;
    }

    @ObfuscatedName("gj.g()V")
    public void method3306() {
        while (true) {
            class195 var1 = this.field2441.field2469;
            if (this.field2441 == var1) {
                return;
            }
            var1.method3457();
        }
    }
}

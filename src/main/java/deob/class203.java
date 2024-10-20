package deob;

@ObfuscatedName("gy")
public final class class203 {

    @ObfuscatedName("gy.i")
    public class204 field3088 = new class204();

    public class203() {
        this.field3088.field3090 = this.field3088;
        this.field3088.field3089 = this.field3088;
    }

    @ObfuscatedName("gy.i(Lgn;)V")
    public void method3595(class204 arg0) {
        if (arg0.field3089 != null) {
            arg0.method3602();
        }
        arg0.field3089 = this.field3088.field3089;
        arg0.field3090 = this.field3088;
        arg0.field3089.field3090 = arg0;
        arg0.field3090.field3089 = arg0;
    }

    @ObfuscatedName("gy.v(Lgn;)V")
    public void method3587(class204 arg0) {
        if (arg0.field3089 != null) {
            arg0.method3602();
        }
        arg0.field3089 = this.field3088;
        arg0.field3090 = this.field3088.field3090;
        arg0.field3089.field3090 = arg0;
        arg0.field3090.field3089 = arg0;
    }

    @ObfuscatedName("gy.r()Lgn;")
    public class204 method3588() {
        class204 var1 = this.field3088.field3090;
        if (this.field3088 == var1) {
            return null;
        } else {
            var1.method3602();
            return var1;
        }
    }

    @ObfuscatedName("gy.n()Lgn;")
    public class204 method3591() {
        class204 var1 = this.field3088.field3090;
        return this.field3088 == var1 ? null : var1;
    }

    @ObfuscatedName("gy.x()V")
    public void method3590() {
        while (true) {
            class204 var1 = this.field3088.field3090;
            if (this.field3088 == var1) {
                return;
            }
            var1.method3602();
        }
    }
}

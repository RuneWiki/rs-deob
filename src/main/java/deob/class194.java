package deob;

@ObfuscatedName("gc")
public final class class194 {

    @ObfuscatedName("gc.y")
    public class195 field3013 = new class195();

    public class194() {
        this.field3013.field3014 = this.field3013;
        this.field3013.field3015 = this.field3013;
    }

    @ObfuscatedName("gc.y(Lgp;)V")
    public void method3452(class195 arg0) {
        if (arg0.field3015 != null) {
            arg0.method3461();
        }
        arg0.field3015 = this.field3013.field3015;
        arg0.field3014 = this.field3013;
        arg0.field3015.field3014 = arg0;
        arg0.field3014.field3015 = arg0;
    }

    @ObfuscatedName("gc.k(Lgp;)V")
    public void method3448(class195 arg0) {
        if (arg0.field3015 != null) {
            arg0.method3461();
        }
        arg0.field3015 = this.field3013;
        arg0.field3014 = this.field3013.field3014;
        arg0.field3015.field3014 = arg0;
        arg0.field3014.field3015 = arg0;
    }

    @ObfuscatedName("gc.g()Lgp;")
    public class195 method3449() {
        class195 var1 = this.field3013.field3014;
        if (this.field3013 == var1) {
            return null;
        } else {
            var1.method3461();
            return var1;
        }
    }

    @ObfuscatedName("gc.n()Lgp;")
    public class195 method3450() {
        class195 var1 = this.field3013.field3014;
        return this.field3013 == var1 ? null : var1;
    }

    @ObfuscatedName("gc.t()V")
    public void method3451() {
        while (true) {
            class195 var1 = this.field3013.field3014;
            if (this.field3013 == var1) {
                return;
            }
            var1.method3461();
        }
    }
}

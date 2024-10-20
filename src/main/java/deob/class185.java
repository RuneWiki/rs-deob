package deob;

@ObfuscatedName("gw")
public final class class185 {

    @ObfuscatedName("gw.d")
    public class195 field2416 = new class195();

    public class185() {
        this.field2416.field2445 = this.field2416;
        this.field2416.field2444 = this.field2416;
    }

    @ObfuscatedName("gw.d(Lgq;)V")
    public void method3211(class195 arg0) {
        if (arg0.field2444 != null) {
            arg0.method3350();
        }
        arg0.field2444 = this.field2416.field2444;
        arg0.field2445 = this.field2416;
        arg0.field2444.field2445 = arg0;
        arg0.field2445.field2444 = arg0;
    }

    @ObfuscatedName("gw.q(Lgq;)V")
    public void method3217(class195 arg0) {
        if (arg0.field2444 != null) {
            arg0.method3350();
        }
        arg0.field2444 = this.field2416;
        arg0.field2445 = this.field2416.field2445;
        arg0.field2444.field2445 = arg0;
        arg0.field2445.field2444 = arg0;
    }

    @ObfuscatedName("gw.x()Lgq;")
    public class195 method3213() {
        class195 var1 = this.field2416.field2445;
        if (this.field2416 == var1) {
            return null;
        } else {
            var1.method3350();
            return var1;
        }
    }

    @ObfuscatedName("gw.y()Lgq;")
    public class195 method3214() {
        class195 var1 = this.field2416.field2445;
        return this.field2416 == var1 ? null : var1;
    }

    @ObfuscatedName("gw.e()V")
    public void method3215() {
        while (true) {
            class195 var1 = this.field2416.field2445;
            if (this.field2416 == var1) {
                return;
            }
            var1.method3350();
        }
    }
}

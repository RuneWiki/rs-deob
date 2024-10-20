package deob;

@ObfuscatedName("gj")
public final class class194 {

    @ObfuscatedName("gj.b")
    public class195 field2994 = new class195();

    public class194() {
        this.field2994.field2996 = this.field2994;
        this.field2994.field2995 = this.field2994;
    }

    @ObfuscatedName("gj.b(Lgr;)V")
    public void method3377(class195 arg0) {
        if (arg0.field2995 != null) {
            arg0.method3396();
        }
        arg0.field2995 = this.field2994.field2995;
        arg0.field2996 = this.field2994;
        arg0.field2995.field2996 = arg0;
        arg0.field2996.field2995 = arg0;
    }

    @ObfuscatedName("gj.e(Lgr;)V")
    public void method3378(class195 arg0) {
        if (arg0.field2995 != null) {
            arg0.method3396();
        }
        arg0.field2995 = this.field2994;
        arg0.field2996 = this.field2994.field2996;
        arg0.field2995.field2996 = arg0;
        arg0.field2996.field2995 = arg0;
    }

    @ObfuscatedName("gj.a()Lgr;")
    public class195 method3388() {
        class195 var1 = this.field2994.field2996;
        if (this.field2994 == var1) {
            return null;
        } else {
            var1.method3396();
            return var1;
        }
    }

    @ObfuscatedName("gj.k()Lgr;")
    public class195 method3394() {
        class195 var1 = this.field2994.field2996;
        return this.field2994 == var1 ? null : var1;
    }

    @ObfuscatedName("gj.p()V")
    public void method3379() {
        while (true) {
            class195 var1 = this.field2994.field2996;
            if (this.field2994 == var1) {
                return;
            }
            var1.method3396();
        }
    }
}

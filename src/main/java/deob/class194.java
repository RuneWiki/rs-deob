package deob;

@ObfuscatedName("gj")
public final class class194 {

    @ObfuscatedName("gj.n")
    public class195 field3006 = new class195();

    public class194() {
        this.field3006.field3008 = this.field3006;
        this.field3006.field3007 = this.field3006;
    }

    @ObfuscatedName("gj.n(Lge;)V")
    public void method3517(class195 arg0) {
        if (arg0.field3007 != null) {
            arg0.method3527();
        }
        arg0.field3007 = this.field3006.field3007;
        arg0.field3008 = this.field3006;
        arg0.field3007.field3008 = arg0;
        arg0.field3008.field3007 = arg0;
    }

    @ObfuscatedName("gj.g(Lge;)V")
    public void method3515(class195 arg0) {
        if (arg0.field3007 != null) {
            arg0.method3527();
        }
        arg0.field3007 = this.field3006;
        arg0.field3008 = this.field3006.field3008;
        arg0.field3007.field3008 = arg0;
        arg0.field3008.field3007 = arg0;
    }

    @ObfuscatedName("gj.a()Lge;")
    public class195 method3516() {
        class195 var1 = this.field3006.field3008;
        if (this.field3006 == var1) {
            return null;
        } else {
            var1.method3527();
            return var1;
        }
    }

    @ObfuscatedName("gj.m()Lge;")
    public class195 method3522() {
        class195 var1 = this.field3006.field3008;
        return this.field3006 == var1 ? null : var1;
    }

    @ObfuscatedName("gj.s()V")
    public void method3518() {
        while (true) {
            class195 var1 = this.field3006.field3008;
            if (this.field3006 == var1) {
                return;
            }
            var1.method3527();
        }
    }
}

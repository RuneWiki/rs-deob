package deob;

@ObfuscatedName("gp")
public final class class184 {

    @ObfuscatedName("gp.x")
    public class185 field2869 = new class185();

    public class184() {
        this.field2869.field2870 = this.field2869;
        this.field2869.field2871 = this.field2869;
    }

    @ObfuscatedName("gp.x(Lga;)V")
    public void method3301(class185 arg0) {
        if (arg0.field2871 != null) {
            arg0.method3321();
        }
        arg0.field2871 = this.field2869.field2871;
        arg0.field2870 = this.field2869;
        arg0.field2871.field2870 = arg0;
        arg0.field2870.field2871 = arg0;
    }

    @ObfuscatedName("gp.v(Lga;)V")
    public void method3313(class185 arg0) {
        if (arg0.field2871 != null) {
            arg0.method3321();
        }
        arg0.field2871 = this.field2869;
        arg0.field2870 = this.field2869.field2870;
        arg0.field2871.field2870 = arg0;
        arg0.field2870.field2871 = arg0;
    }

    @ObfuscatedName("gp.m()Lga;")
    public class185 method3304() {
        class185 var1 = this.field2869.field2870;
        if (this.field2869 == var1) {
            return null;
        } else {
            var1.method3321();
            return var1;
        }
    }

    @ObfuscatedName("gp.e()Lga;")
    public class185 method3309() {
        class185 var1 = this.field2869.field2870;
        return this.field2869 == var1 ? null : var1;
    }

    @ObfuscatedName("gp.h()V")
    public void method3306() {
        while (true) {
            class185 var1 = this.field2869.field2870;
            if (this.field2869 == var1) {
                return;
            }
            var1.method3321();
        }
    }
}

package deob;

@ObfuscatedName("gr")
public final class class203 {

    @ObfuscatedName("gr.o")
    public class204 field3100 = new class204();

    public class203() {
        this.field3100.field3102 = this.field3100;
        this.field3100.field3101 = this.field3100;
    }

    @ObfuscatedName("gr.o(Lge;)V")
    public void method3639(class204 arg0) {
        if (arg0.field3101 != null) {
            arg0.method3645();
        }
        arg0.field3101 = this.field3100.field3101;
        arg0.field3102 = this.field3100;
        arg0.field3101.field3102 = arg0;
        arg0.field3102.field3101 = arg0;
    }

    @ObfuscatedName("gr.e(Lge;)V")
    public void method3630(class204 arg0) {
        if (arg0.field3101 != null) {
            arg0.method3645();
        }
        arg0.field3101 = this.field3100;
        arg0.field3102 = this.field3100.field3102;
        arg0.field3101.field3102 = arg0;
        arg0.field3102.field3101 = arg0;
    }

    @ObfuscatedName("gr.u()Lge;")
    public class204 method3631() {
        class204 var1 = this.field3100.field3102;
        if (this.field3100 == var1) {
            return null;
        } else {
            var1.method3645();
            return var1;
        }
    }

    @ObfuscatedName("gr.b()Lge;")
    public class204 method3628() {
        class204 var1 = this.field3100.field3102;
        return this.field3100 == var1 ? null : var1;
    }

    @ObfuscatedName("gr.p()V")
    public void method3632() {
        while (true) {
            class204 var1 = this.field3100.field3102;
            if (this.field3100 == var1) {
                return;
            }
            var1.method3645();
        }
    }
}

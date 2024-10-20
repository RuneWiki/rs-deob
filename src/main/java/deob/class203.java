package deob;

@ObfuscatedName("gc")
public final class class203 {

    @ObfuscatedName("gc.j")
    public class204 field3100 = new class204();

    public class203() {
        this.field3100.field3101 = this.field3100;
        this.field3100.field3102 = this.field3100;
    }

    @ObfuscatedName("gc.j(Lgj;)V")
    public void method3569(class204 arg0) {
        if (arg0.field3102 != null) {
            arg0.method3590();
        }
        arg0.field3102 = this.field3100.field3102;
        arg0.field3101 = this.field3100;
        arg0.field3102.field3101 = arg0;
        arg0.field3101.field3102 = arg0;
    }

    @ObfuscatedName("gc.l(Lgj;)V")
    public void method3573(class204 arg0) {
        if (arg0.field3102 != null) {
            arg0.method3590();
        }
        arg0.field3102 = this.field3100;
        arg0.field3101 = this.field3100.field3101;
        arg0.field3102.field3101 = arg0;
        arg0.field3101.field3102 = arg0;
    }

    @ObfuscatedName("gc.a()Lgj;")
    public class204 method3571() {
        class204 var1 = this.field3100.field3101;
        if (this.field3100 == var1) {
            return null;
        } else {
            var1.method3590();
            return var1;
        }
    }

    @ObfuscatedName("gc.i()Lgj;")
    public class204 method3572() {
        class204 var1 = this.field3100.field3101;
        return this.field3100 == var1 ? null : var1;
    }

    @ObfuscatedName("gc.f()V")
    public void method3579() {
        while (true) {
            class204 var1 = this.field3100.field3101;
            if (this.field3100 == var1) {
                return;
            }
            var1.method3590();
        }
    }
}

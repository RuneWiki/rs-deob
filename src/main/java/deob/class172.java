package deob;

@ObfuscatedName("fl")
public final class class172 {

    @ObfuscatedName("fl.b")
    public class174 field2795 = new class174();

    public class172() {
        this.field2795.field2799 = this.field2795;
        this.field2795.field2798 = this.field2795;
    }

    @ObfuscatedName("fl.b(Lfs;)V")
    public void method3274(class174 arg0) {
        if (arg0.field2798 != null) {
            arg0.method3287();
        }
        arg0.field2798 = this.field2795.field2798;
        arg0.field2799 = this.field2795;
        arg0.field2798.field2799 = arg0;
        arg0.field2799.field2798 = arg0;
    }

    @ObfuscatedName("fl.e(Lfs;)V")
    public void method3270(class174 arg0) {
        if (arg0.field2798 != null) {
            arg0.method3287();
        }
        arg0.field2798 = this.field2795;
        arg0.field2799 = this.field2795.field2799;
        arg0.field2798.field2799 = arg0;
        arg0.field2799.field2798 = arg0;
    }

    @ObfuscatedName("fl.g()Lfs;")
    public class174 method3263() {
        class174 var1 = this.field2795.field2799;
        if (this.field2795 == var1) {
            return null;
        } else {
            var1.method3287();
            return var1;
        }
    }

    @ObfuscatedName("fl.o()Lfs;")
    public class174 method3264() {
        class174 var1 = this.field2795.field2799;
        return this.field2795 == var1 ? null : var1;
    }

    @ObfuscatedName("fl.a()V")
    public void method3265() {
        while (true) {
            class174 var1 = this.field2795.field2799;
            if (this.field2795 == var1) {
                return;
            }
            var1.method3287();
        }
    }
}

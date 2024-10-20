package deob;

@ObfuscatedName("fn")
public final class class172 {

    @ObfuscatedName("fn.x")
    public class174 field2799 = new class174();

    public class172() {
        this.field2799.field2802 = this.field2799;
        this.field2799.field2803 = this.field2799;
    }

    @ObfuscatedName("fn.x(Lfs;)V")
    public void method3212(class174 arg0) {
        if (arg0.field2803 != null) {
            arg0.method3239();
        }
        arg0.field2803 = this.field2799.field2803;
        arg0.field2802 = this.field2799;
        arg0.field2803.field2802 = arg0;
        arg0.field2802.field2803 = arg0;
    }

    @ObfuscatedName("fn.p(Lfs;)V")
    public void method3211(class174 arg0) {
        if (arg0.field2803 != null) {
            arg0.method3239();
        }
        arg0.field2803 = this.field2799;
        arg0.field2802 = this.field2799.field2802;
        arg0.field2803.field2802 = arg0;
        arg0.field2802.field2803 = arg0;
    }

    @ObfuscatedName("fn.k()Lfs;")
    public class174 method3221() {
        class174 var1 = this.field2799.field2802;
        if (this.field2799 == var1) {
            return null;
        } else {
            var1.method3239();
            return var1;
        }
    }

    @ObfuscatedName("fn.a()Lfs;")
    public class174 method3209() {
        class174 var1 = this.field2799.field2802;
        return this.field2799 == var1 ? null : var1;
    }

    @ObfuscatedName("fn.q()V")
    public void method3217() {
        while (true) {
            class174 var1 = this.field2799.field2802;
            if (this.field2799 == var1) {
                return;
            }
            var1.method3239();
        }
    }
}

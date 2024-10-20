package deob;

@ObfuscatedName("gk")
public final class class204 {

    @ObfuscatedName("gk.t")
    public class205 field3114 = new class205();

    public class204() {
        this.field3114.field3115 = this.field3114;
        this.field3114.field3116 = this.field3114;
    }

    @ObfuscatedName("gk.t(Lgn;)V")
    public void method3574(class205 arg0) {
        if (arg0.field3116 != null) {
            arg0.method3581();
        }
        arg0.field3116 = this.field3114.field3116;
        arg0.field3115 = this.field3114;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
    }

    @ObfuscatedName("gk.i(Lgn;)V")
    public void method3568(class205 arg0) {
        if (arg0.field3116 != null) {
            arg0.method3581();
        }
        arg0.field3116 = this.field3114;
        arg0.field3115 = this.field3114.field3115;
        arg0.field3116.field3115 = arg0;
        arg0.field3115.field3116 = arg0;
    }

    @ObfuscatedName("gk.g()Lgn;")
    public class205 method3567() {
        class205 var1 = this.field3114.field3115;
        if (this.field3114 == var1) {
            return null;
        } else {
            var1.method3581();
            return var1;
        }
    }

    @ObfuscatedName("gk.h()Lgn;")
    public class205 method3571() {
        class205 var1 = this.field3114.field3115;
        return this.field3114 == var1 ? null : var1;
    }

    @ObfuscatedName("gk.z()V")
    public void method3572() {
        while (true) {
            class205 var1 = this.field3114.field3115;
            if (this.field3114 == var1) {
                return;
            }
            var1.method3581();
        }
    }
}

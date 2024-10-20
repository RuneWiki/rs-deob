package deob;

@ObfuscatedName("gk")
public final class class204 {

    @ObfuscatedName("gk.w")
    public class205 field3113 = new class205();

    public class204() {
        this.field3113.field3115 = this.field3113;
        this.field3113.field3114 = this.field3113;
    }

    @ObfuscatedName("gk.w(Lgs;)V")
    public void method3654(class205 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3658();
        }
        arg0.field3114 = this.field3113.field3114;
        arg0.field3115 = this.field3113;
        arg0.field3114.field3115 = arg0;
        arg0.field3115.field3114 = arg0;
    }

    @ObfuscatedName("gk.x(Lgs;)V")
    public void method3656(class205 arg0) {
        if (arg0.field3114 != null) {
            arg0.method3658();
        }
        arg0.field3114 = this.field3113;
        arg0.field3115 = this.field3113.field3115;
        arg0.field3114.field3115 = arg0;
        arg0.field3115.field3114 = arg0;
    }

    @ObfuscatedName("gk.t()Lgs;")
    public class205 method3643() {
        class205 var1 = this.field3113.field3115;
        if (this.field3113 == var1) {
            return null;
        } else {
            var1.method3658();
            return var1;
        }
    }

    @ObfuscatedName("gk.p()Lgs;")
    public class205 method3645() {
        class205 var1 = this.field3113.field3115;
        return this.field3113 == var1 ? null : var1;
    }

    @ObfuscatedName("gk.e()V")
    public void method3646() {
        while (true) {
            class205 var1 = this.field3113.field3115;
            if (this.field3113 == var1) {
                return;
            }
            var1.method3658();
        }
    }
}

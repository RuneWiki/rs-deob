package deob;

@ObfuscatedName("gd")
public final class class203 {

    @ObfuscatedName("gd.j")
    public class204 field3092 = new class204();

    public class203() {
        this.field3092.field3094 = this.field3092;
        this.field3092.field3093 = this.field3092;
    }

    @ObfuscatedName("gd.j(Lgx;)V")
    public void method3669(class204 arg0) {
        if (arg0.field3093 != null) {
            arg0.method3680();
        }
        arg0.field3093 = this.field3092.field3093;
        arg0.field3094 = this.field3092;
        arg0.field3093.field3094 = arg0;
        arg0.field3094.field3093 = arg0;
    }

    @ObfuscatedName("gd.m(Lgx;)V")
    public void method3668(class204 arg0) {
        if (arg0.field3093 != null) {
            arg0.method3680();
        }
        arg0.field3093 = this.field3092;
        arg0.field3094 = this.field3092.field3094;
        arg0.field3093.field3094 = arg0;
        arg0.field3094.field3093 = arg0;
    }

    @ObfuscatedName("gd.f()Lgx;")
    public class204 method3662() {
        class204 var1 = this.field3092.field3094;
        if (this.field3092 == var1) {
            return null;
        } else {
            var1.method3680();
            return var1;
        }
    }

    @ObfuscatedName("gd.l()Lgx;")
    public class204 method3663() {
        class204 var1 = this.field3092.field3094;
        return this.field3092 == var1 ? null : var1;
    }

    @ObfuscatedName("gd.u()V")
    public void method3660() {
        while (true) {
            class204 var1 = this.field3092.field3094;
            if (this.field3092 == var1) {
                return;
            }
            var1.method3680();
        }
    }
}

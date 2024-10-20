package deob;

@ObfuscatedName("gp")
public final class class203 {

    @ObfuscatedName("gp.z")
    public class204 field3090 = new class204();

    public class203() {
        this.field3090.field3092 = this.field3090;
        this.field3090.field3091 = this.field3090;
    }

    @ObfuscatedName("gp.z(Lgx;)V")
    public void method3556(class204 arg0) {
        if (arg0.field3091 != null) {
            arg0.method3565();
        }
        arg0.field3091 = this.field3090.field3091;
        arg0.field3092 = this.field3090;
        arg0.field3091.field3092 = arg0;
        arg0.field3092.field3091 = arg0;
    }

    @ObfuscatedName("gp.q(Lgx;)V")
    public void method3547(class204 arg0) {
        if (arg0.field3091 != null) {
            arg0.method3565();
        }
        arg0.field3091 = this.field3090;
        arg0.field3092 = this.field3090.field3092;
        arg0.field3091.field3092 = arg0;
        arg0.field3092.field3091 = arg0;
    }

    @ObfuscatedName("gp.k()Lgx;")
    public class204 method3561() {
        class204 var1 = this.field3090.field3092;
        if (this.field3090 == var1) {
            return null;
        } else {
            var1.method3565();
            return var1;
        }
    }

    @ObfuscatedName("gp.f()Lgx;")
    public class204 method3549() {
        class204 var1 = this.field3090.field3092;
        return this.field3090 == var1 ? null : var1;
    }

    @ObfuscatedName("gp.d()V")
    public void method3546() {
        while (true) {
            class204 var1 = this.field3090.field3092;
            if (this.field3090 == var1) {
                return;
            }
            var1.method3565();
        }
    }
}

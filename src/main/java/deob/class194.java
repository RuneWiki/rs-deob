package deob;

@ObfuscatedName("gp")
public final class class194 {

    @ObfuscatedName("gp.p")
    public class195 field3003 = new class195();

    public class194() {
        this.field3003.field3005 = this.field3003;
        this.field3003.field3004 = this.field3003;
    }

    @ObfuscatedName("gp.p(Lgk;)V")
    public void method3498(class195 arg0) {
        if (arg0.field3004 != null) {
            arg0.method3519();
        }
        arg0.field3004 = this.field3003.field3004;
        arg0.field3005 = this.field3003;
        arg0.field3004.field3005 = arg0;
        arg0.field3005.field3004 = arg0;
    }

    @ObfuscatedName("gp.k(Lgk;)V")
    public void method3501(class195 arg0) {
        if (arg0.field3004 != null) {
            arg0.method3519();
        }
        arg0.field3004 = this.field3003;
        arg0.field3005 = this.field3003.field3005;
        arg0.field3004.field3005 = arg0;
        arg0.field3005.field3004 = arg0;
    }

    @ObfuscatedName("gp.e()Lgk;")
    public class195 method3514() {
        class195 var1 = this.field3003.field3005;
        if (this.field3003 == var1) {
            return null;
        } else {
            var1.method3519();
            return var1;
        }
    }

    @ObfuscatedName("gp.f()Lgk;")
    public class195 method3502() {
        class195 var1 = this.field3003.field3005;
        return this.field3003 == var1 ? null : var1;
    }

    @ObfuscatedName("gp.w()V")
    public void method3512() {
        while (true) {
            class195 var1 = this.field3003.field3005;
            if (this.field3003 == var1) {
                return;
            }
            var1.method3519();
        }
    }
}

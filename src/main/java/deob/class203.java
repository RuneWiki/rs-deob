package deob;

@ObfuscatedName("gs")
public final class class203 {

    @ObfuscatedName("gs.y")
    public class204 field3080 = new class204();

    public class203() {
        this.field3080.field3081 = this.field3080;
        this.field3080.field3082 = this.field3080;
    }

    @ObfuscatedName("gs.y(Lgt;)V")
    public void method3544(class204 arg0) {
        if (arg0.field3082 != null) {
            arg0.method3561();
        }
        arg0.field3082 = this.field3080.field3082;
        arg0.field3081 = this.field3080;
        arg0.field3082.field3081 = arg0;
        arg0.field3081.field3082 = arg0;
    }

    @ObfuscatedName("gs.d(Lgt;)V")
    public void method3545(class204 arg0) {
        if (arg0.field3082 != null) {
            arg0.method3561();
        }
        arg0.field3082 = this.field3080;
        arg0.field3081 = this.field3080.field3081;
        arg0.field3082.field3081 = arg0;
        arg0.field3081.field3082 = arg0;
    }

    @ObfuscatedName("gs.g()Lgt;")
    public class204 method3543() {
        class204 var1 = this.field3080.field3081;
        if (this.field3080 == var1) {
            return null;
        } else {
            var1.method3561();
            return var1;
        }
    }

    @ObfuscatedName("gs.w()Lgt;")
    public class204 method3546() {
        class204 var1 = this.field3080.field3081;
        return this.field3080 == var1 ? null : var1;
    }

    @ObfuscatedName("gs.e()V")
    public void method3548() {
        while (true) {
            class204 var1 = this.field3080.field3081;
            if (this.field3080 == var1) {
                return;
            }
            var1.method3561();
        }
    }
}

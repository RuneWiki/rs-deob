package deob;

@ObfuscatedName("gc")
public final class class197 {

    @ObfuscatedName("gc.j")
    public class198 field3032 = new class198();

    public class197() {
        this.field3032.field3033 = this.field3032;
        this.field3032.field3034 = this.field3032;
    }

    @ObfuscatedName("gc.j(Lgt;)V")
    public void method3535(class198 arg0) {
        if (arg0.field3034 != null) {
            arg0.method3552();
        }
        arg0.field3034 = this.field3032.field3034;
        arg0.field3033 = this.field3032;
        arg0.field3034.field3033 = arg0;
        arg0.field3033.field3034 = arg0;
    }

    @ObfuscatedName("gc.y(Lgt;)V")
    public void method3534(class198 arg0) {
        if (arg0.field3034 != null) {
            arg0.method3552();
        }
        arg0.field3034 = this.field3032;
        arg0.field3033 = this.field3032.field3033;
        arg0.field3034.field3033 = arg0;
        arg0.field3033.field3034 = arg0;
    }

    @ObfuscatedName("gc.z()Lgt;")
    public class198 method3533() {
        class198 var1 = this.field3032.field3033;
        if (this.field3032 == var1) {
            return null;
        } else {
            var1.method3552();
            return var1;
        }
    }

    @ObfuscatedName("gc.l()Lgt;")
    public class198 method3536() {
        class198 var1 = this.field3032.field3033;
        return this.field3032 == var1 ? null : var1;
    }

    @ObfuscatedName("gc.w()V")
    public void method3541() {
        while (true) {
            class198 var1 = this.field3032.field3033;
            if (this.field3032 == var1) {
                return;
            }
            var1.method3552();
        }
    }
}

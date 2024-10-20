package deob;

@ObfuscatedName("gl")
public final class class197 {

    @ObfuscatedName("gl.f")
    public class209 field2457 = new class209();

    public class197() {
        this.field2457.field2491 = this.field2457;
        this.field2457.field2492 = this.field2457;
    }

    @ObfuscatedName("gl.f(Lhp;)V")
    public void method3673(class209 arg0) {
        if (arg0.field2492 != null) {
            arg0.method3845();
        }
        arg0.field2492 = this.field2457.field2492;
        arg0.field2491 = this.field2457;
        arg0.field2492.field2491 = arg0;
        arg0.field2491.field2492 = arg0;
    }

    @ObfuscatedName("gl.h(Lhp;)V")
    public void method3682(class209 arg0) {
        if (arg0.field2492 != null) {
            arg0.method3845();
        }
        arg0.field2492 = this.field2457;
        arg0.field2491 = this.field2457.field2491;
        arg0.field2492.field2491 = arg0;
        arg0.field2491.field2492 = arg0;
    }

    @ObfuscatedName("gl.e(Lhp;Lhp;)V")
    public static void method3675(class209 arg0, class209 arg1) {
        if (arg0.field2492 != null) {
            arg0.method3845();
        }
        arg0.field2492 = arg1;
        arg0.field2491 = arg1.field2491;
        arg0.field2492.field2491 = arg0;
        arg0.field2491.field2492 = arg0;
    }

    @ObfuscatedName("gl.b()Lhp;")
    public class209 method3670() {
        class209 var1 = this.field2457.field2491;
        if (this.field2457 == var1) {
            return null;
        } else {
            var1.method3845();
            return var1;
        }
    }

    @ObfuscatedName("gl.l()Lhp;")
    public class209 method3674() {
        class209 var1 = this.field2457.field2491;
        return this.field2457 == var1 ? null : var1;
    }

    @ObfuscatedName("gl.w()V")
    public void method3688() {
        while (true) {
            class209 var1 = this.field2457.field2491;
            if (this.field2457 == var1) {
                return;
            }
            var1.method3845();
        }
    }
}

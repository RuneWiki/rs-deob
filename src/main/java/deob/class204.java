package deob;

@ObfuscatedName("gm")
public final class class204 {

    @ObfuscatedName("gm.e")
    public class205 field3104 = new class205();

    public class204() {
        this.field3104.field3106 = this.field3104;
        this.field3104.field3105 = this.field3104;
    }

    @ObfuscatedName("gm.e(Lgh;)V")
    public void method3594(class205 arg0) {
        if (arg0.field3105 != null) {
            arg0.method3610();
        }
        arg0.field3105 = this.field3104.field3105;
        arg0.field3106 = this.field3104;
        arg0.field3105.field3106 = arg0;
        arg0.field3106.field3105 = arg0;
    }

    @ObfuscatedName("gm.w(Lgh;)V")
    public void method3595(class205 arg0) {
        if (arg0.field3105 != null) {
            arg0.method3610();
        }
        arg0.field3105 = this.field3104;
        arg0.field3106 = this.field3104.field3106;
        arg0.field3105.field3106 = arg0;
        arg0.field3106.field3105 = arg0;
    }

    @ObfuscatedName("gm.f()Lgh;")
    public class205 method3596() {
        class205 var1 = this.field3104.field3106;
        if (this.field3104 == var1) {
            return null;
        } else {
            var1.method3610();
            return var1;
        }
    }

    @ObfuscatedName("gm.s()Lgh;")
    public class205 method3597() {
        class205 var1 = this.field3104.field3106;
        return this.field3104 == var1 ? null : var1;
    }

    @ObfuscatedName("gm.p()V")
    public void method3609() {
        while (true) {
            class205 var1 = this.field3104.field3106;
            if (this.field3104 == var1) {
                return;
            }
            var1.method3610();
        }
    }
}

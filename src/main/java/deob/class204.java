package deob;

@ObfuscatedName("gk")
public final class class204 {

    @ObfuscatedName("gk.b")
    public class205 field3103 = new class205();

    public class204() {
        this.field3103.field3104 = this.field3103;
        this.field3103.field3105 = this.field3103;
    }

    @ObfuscatedName("gk.b(Lgl;)V")
    public void method3604(class205 arg0) {
        if (arg0.field3105 != null) {
            arg0.method3620();
        }
        arg0.field3105 = this.field3103.field3105;
        arg0.field3104 = this.field3103;
        arg0.field3105.field3104 = arg0;
        arg0.field3104.field3105 = arg0;
    }

    @ObfuscatedName("gk.g(Lgl;)V")
    public void method3611(class205 arg0) {
        if (arg0.field3105 != null) {
            arg0.method3620();
        }
        arg0.field3105 = this.field3103;
        arg0.field3104 = this.field3103.field3104;
        arg0.field3105.field3104 = arg0;
        arg0.field3104.field3105 = arg0;
    }

    @ObfuscatedName("gk.j()Lgl;")
    public class205 method3617() {
        class205 var1 = this.field3103.field3104;
        if (this.field3103 == var1) {
            return null;
        } else {
            var1.method3620();
            return var1;
        }
    }

    @ObfuscatedName("gk.d()Lgl;")
    public class205 method3616() {
        class205 var1 = this.field3103.field3104;
        return this.field3103 == var1 ? null : var1;
    }

    @ObfuscatedName("gk.x()V")
    public void method3608() {
        while (true) {
            class205 var1 = this.field3103.field3104;
            if (this.field3103 == var1) {
                return;
            }
            var1.method3620();
        }
    }
}

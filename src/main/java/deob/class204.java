package deob;

@ObfuscatedName("gj")
public final class class204 {

    @ObfuscatedName("gj.f")
    public class205 field3105 = new class205();

    public class204() {
        this.field3105.field3106 = this.field3105;
        this.field3105.field3107 = this.field3105;
    }

    @ObfuscatedName("gj.f(Lgi;)V")
    public void method3641(class205 arg0) {
        if (arg0.field3107 != null) {
            arg0.method3655();
        }
        arg0.field3107 = this.field3105.field3107;
        arg0.field3106 = this.field3105;
        arg0.field3107.field3106 = arg0;
        arg0.field3106.field3107 = arg0;
    }

    @ObfuscatedName("gj.u(Lgi;)V")
    public void method3645(class205 arg0) {
        if (arg0.field3107 != null) {
            arg0.method3655();
        }
        arg0.field3107 = this.field3105;
        arg0.field3106 = this.field3105.field3106;
        arg0.field3107.field3106 = arg0;
        arg0.field3106.field3107 = arg0;
    }

    @ObfuscatedName("gj.x()Lgi;")
    public class205 method3635() {
        class205 var1 = this.field3105.field3106;
        if (this.field3105 == var1) {
            return null;
        } else {
            var1.method3655();
            return var1;
        }
    }

    @ObfuscatedName("gj.b()Lgi;")
    public class205 method3648() {
        class205 var1 = this.field3105.field3106;
        return this.field3105 == var1 ? null : var1;
    }

    @ObfuscatedName("gj.l()V")
    public void method3637() {
        while (true) {
            class205 var1 = this.field3105.field3106;
            if (this.field3105 == var1) {
                return;
            }
            var1.method3655();
        }
    }
}

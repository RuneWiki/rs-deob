package deob;

@ObfuscatedName("gx")
public final class class203 {

    @ObfuscatedName("gx.v")
    public class204 field3103 = new class204();

    public class203() {
        this.field3103.field3105 = this.field3103;
        this.field3103.field3104 = this.field3103;
    }

    @ObfuscatedName("gx.v(Lgk;)V")
    public void method3614(class204 arg0) {
        if (arg0.field3104 != null) {
            arg0.method3623();
        }
        arg0.field3104 = this.field3103.field3104;
        arg0.field3105 = this.field3103;
        arg0.field3104.field3105 = arg0;
        arg0.field3105.field3104 = arg0;
    }

    @ObfuscatedName("gx.f(Lgk;)V")
    public void method3611(class204 arg0) {
        if (arg0.field3104 != null) {
            arg0.method3623();
        }
        arg0.field3104 = this.field3103;
        arg0.field3105 = this.field3103.field3105;
        arg0.field3104.field3105 = arg0;
        arg0.field3105.field3104 = arg0;
    }

    @ObfuscatedName("gx.i()Lgk;")
    public class204 method3612() {
        class204 var1 = this.field3103.field3105;
        if (this.field3103 == var1) {
            return null;
        } else {
            var1.method3623();
            return var1;
        }
    }

    @ObfuscatedName("gx.d()Lgk;")
    public class204 method3613() {
        class204 var1 = this.field3103.field3105;
        return this.field3103 == var1 ? null : var1;
    }

    @ObfuscatedName("gx.o()V")
    public void method3620() {
        while (true) {
            class204 var1 = this.field3103.field3105;
            if (this.field3103 == var1) {
                return;
            }
            var1.method3623();
        }
    }
}

package deob;

@ObfuscatedName("fx")
public final class class170 {

    @ObfuscatedName("fx.g")
    public class172 field2745 = new class172();

    public class170() {
        this.field2745.field2748 = this.field2745;
        this.field2745.field2749 = this.field2745;
    }

    @ObfuscatedName("fx.g(Lfl;)V")
    public void method3331(class172 arg0) {
        if (arg0.field2749 != null) {
            arg0.method3351();
        }
        arg0.field2749 = this.field2745.field2749;
        arg0.field2748 = this.field2745;
        arg0.field2749.field2748 = arg0;
        arg0.field2748.field2749 = arg0;
    }

    @ObfuscatedName("fx.e(Lfl;)V")
    public void method3326(class172 arg0) {
        if (arg0.field2749 != null) {
            arg0.method3351();
        }
        arg0.field2749 = this.field2745;
        arg0.field2748 = this.field2745.field2748;
        arg0.field2749.field2748 = arg0;
        arg0.field2748.field2749 = arg0;
    }

    @ObfuscatedName("fx.n()Lfl;")
    public class172 method3327() {
        class172 var1 = this.field2745.field2748;
        if (this.field2745 == var1) {
            return null;
        } else {
            var1.method3351();
            return var1;
        }
    }

    @ObfuscatedName("fx.j()Lfl;")
    public class172 method3328() {
        class172 var1 = this.field2745.field2748;
        return this.field2745 == var1 ? null : var1;
    }

    @ObfuscatedName("fx.i()V")
    public void method3329() {
        while (true) {
            class172 var1 = this.field2745.field2748;
            if (this.field2745 == var1) {
                return;
            }
            var1.method3351();
        }
    }
}

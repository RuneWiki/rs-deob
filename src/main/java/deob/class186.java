package deob;

@ObfuscatedName("gz")
public final class class186 {

    @ObfuscatedName("gz.v")
    public class187 field2900 = new class187();

    public class186() {
        this.field2900.field2901 = this.field2900;
        this.field2900.field2902 = this.field2900;
    }

    @ObfuscatedName("gz.v(Lga;)V")
    public void method3352(class187 arg0) {
        if (arg0.field2902 != null) {
            arg0.method3371();
        }
        arg0.field2902 = this.field2900.field2902;
        arg0.field2901 = this.field2900;
        arg0.field2902.field2901 = arg0;
        arg0.field2901.field2902 = arg0;
    }

    @ObfuscatedName("gz.t(Lga;)V")
    public void method3362(class187 arg0) {
        if (arg0.field2902 != null) {
            arg0.method3371();
        }
        arg0.field2902 = this.field2900;
        arg0.field2901 = this.field2900.field2901;
        arg0.field2902.field2901 = arg0;
        arg0.field2901.field2902 = arg0;
    }

    @ObfuscatedName("gz.f()Lga;")
    public class187 method3355() {
        class187 var1 = this.field2900.field2901;
        if (this.field2900 == var1) {
            return null;
        } else {
            var1.method3371();
            return var1;
        }
    }

    @ObfuscatedName("gz.j()Lga;")
    public class187 method3351() {
        class187 var1 = this.field2900.field2901;
        return this.field2900 == var1 ? null : var1;
    }

    @ObfuscatedName("gz.l()V")
    public void method3354() {
        while (true) {
            class187 var1 = this.field2900.field2901;
            if (this.field2900 == var1) {
                return;
            }
            var1.method3371();
        }
    }
}

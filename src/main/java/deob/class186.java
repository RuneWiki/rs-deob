package deob;

@ObfuscatedName("gs")
public final class class186 {

    @ObfuscatedName("gs.b")
    public class187 field2893 = new class187();

    public class186() {
        this.field2893.field2894 = this.field2893;
        this.field2893.field2895 = this.field2893;
    }

    @ObfuscatedName("gs.b(Lgw;)V")
    public void method3359(class187 arg0) {
        if (arg0.field2895 != null) {
            arg0.method3367();
        }
        arg0.field2895 = this.field2893.field2895;
        arg0.field2894 = this.field2893;
        arg0.field2895.field2894 = arg0;
        arg0.field2894.field2895 = arg0;
    }

    @ObfuscatedName("gs.e(Lgw;)V")
    public void method3355(class187 arg0) {
        if (arg0.field2895 != null) {
            arg0.method3367();
        }
        arg0.field2895 = this.field2893;
        arg0.field2894 = this.field2893.field2894;
        arg0.field2895.field2894 = arg0;
        arg0.field2894.field2895 = arg0;
    }

    @ObfuscatedName("gs.i()Lgw;")
    public class187 method3349() {
        class187 var1 = this.field2893.field2894;
        if (this.field2893 == var1) {
            return null;
        } else {
            var1.method3367();
            return var1;
        }
    }

    @ObfuscatedName("gs.k()Lgw;")
    public class187 method3350() {
        class187 var1 = this.field2893.field2894;
        return this.field2893 == var1 ? null : var1;
    }

    @ObfuscatedName("gs.h()V")
    public void method3348() {
        while (true) {
            class187 var1 = this.field2893.field2894;
            if (this.field2893 == var1) {
                return;
            }
            var1.method3367();
        }
    }
}

package deob;

@ObfuscatedName("fg")
public final class class181 {

    @ObfuscatedName("fg.t")
    public class182 field2853 = new class182();

    public class181() {
        this.field2853.field2854 = this.field2853;
        this.field2853.field2855 = this.field2853;
    }

    @ObfuscatedName("fg.t(Lfi;)V")
    public void method3224(class182 arg0) {
        if (arg0.field2855 != null) {
            arg0.method3242();
        }
        arg0.field2855 = this.field2853.field2855;
        arg0.field2854 = this.field2853;
        arg0.field2855.field2854 = arg0;
        arg0.field2854.field2855 = arg0;
    }

    @ObfuscatedName("fg.o(Lfi;)V")
    public void method3225(class182 arg0) {
        if (arg0.field2855 != null) {
            arg0.method3242();
        }
        arg0.field2855 = this.field2853;
        arg0.field2854 = this.field2853.field2854;
        arg0.field2855.field2854 = arg0;
        arg0.field2854.field2855 = arg0;
    }

    @ObfuscatedName("fg.i()Lfi;")
    public class182 method3226() {
        class182 var1 = this.field2853.field2854;
        if (this.field2853 == var1) {
            return null;
        } else {
            var1.method3242();
            return var1;
        }
    }

    @ObfuscatedName("fg.p()Lfi;")
    public class182 method3227() {
        class182 var1 = this.field2853.field2854;
        return this.field2853 == var1 ? null : var1;
    }

    @ObfuscatedName("fg.c()V")
    public void method3228() {
        while (true) {
            class182 var1 = this.field2853.field2854;
            if (this.field2853 == var1) {
                return;
            }
            var1.method3242();
        }
    }
}

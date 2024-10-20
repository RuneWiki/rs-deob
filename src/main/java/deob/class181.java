package deob;

@ObfuscatedName("fw")
public final class class181 {

    @ObfuscatedName("fw.i")
    public class182 field2858 = new class182();

    public class181() {
        this.field2858.field2859 = this.field2858;
        this.field2858.field2860 = this.field2858;
    }

    @ObfuscatedName("fw.i(Lfq;)V")
    public void method3297(class182 arg0) {
        if (arg0.field2860 != null) {
            arg0.method3305();
        }
        arg0.field2860 = this.field2858.field2860;
        arg0.field2859 = this.field2858;
        arg0.field2860.field2859 = arg0;
        arg0.field2859.field2860 = arg0;
    }

    @ObfuscatedName("fw.c(Lfq;)V")
    public void method3294(class182 arg0) {
        if (arg0.field2860 != null) {
            arg0.method3305();
        }
        arg0.field2860 = this.field2858;
        arg0.field2859 = this.field2858.field2859;
        arg0.field2860.field2859 = arg0;
        arg0.field2859.field2860 = arg0;
    }

    @ObfuscatedName("fw.h()Lfq;")
    public class182 method3295() {
        class182 var1 = this.field2858.field2859;
        if (this.field2858 == var1) {
            return null;
        } else {
            var1.method3305();
            return var1;
        }
    }

    @ObfuscatedName("fw.v()Lfq;")
    public class182 method3302() {
        class182 var1 = this.field2858.field2859;
        return this.field2858 == var1 ? null : var1;
    }

    @ObfuscatedName("fw.q()V")
    public void method3296() {
        while (true) {
            class182 var1 = this.field2858.field2859;
            if (this.field2858 == var1) {
                return;
            }
            var1.method3305();
        }
    }
}

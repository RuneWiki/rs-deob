package deob;

@ObfuscatedName("fc")
public final class class181 {

    @ObfuscatedName("fc.e")
    public class182 field2861 = new class182();

    public class181() {
        this.field2861.field2862 = this.field2861;
        this.field2861.field2863 = this.field2861;
    }

    @ObfuscatedName("fc.e(Lfm;)V")
    public void method3171(class182 arg0) {
        if (arg0.field2863 != null) {
            arg0.method3187();
        }
        arg0.field2863 = this.field2861.field2863;
        arg0.field2862 = this.field2861;
        arg0.field2863.field2862 = arg0;
        arg0.field2862.field2863 = arg0;
    }

    @ObfuscatedName("fc.o(Lfm;)V")
    public void method3181(class182 arg0) {
        if (arg0.field2863 != null) {
            arg0.method3187();
        }
        arg0.field2863 = this.field2861;
        arg0.field2862 = this.field2861.field2862;
        arg0.field2863.field2862 = arg0;
        arg0.field2862.field2863 = arg0;
    }

    @ObfuscatedName("fc.y()Lfm;")
    public class182 method3170() {
        class182 var1 = this.field2861.field2862;
        if (this.field2861 == var1) {
            return null;
        } else {
            var1.method3187();
            return var1;
        }
    }

    @ObfuscatedName("fc.b()Lfm;")
    public class182 method3174() {
        class182 var1 = this.field2861.field2862;
        return this.field2861 == var1 ? null : var1;
    }

    @ObfuscatedName("fc.w()V")
    public void method3175() {
        while (true) {
            class182 var1 = this.field2861.field2862;
            if (this.field2861 == var1) {
                return;
            }
            var1.method3187();
        }
    }
}

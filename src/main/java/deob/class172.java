package deob;

@ObfuscatedName("fu")
public final class class172 {

    @ObfuscatedName("fu.k")
    public class183 field2844 = new class183();

    @ObfuscatedName("fu.y")
    public int field2842;

    @ObfuscatedName("fu.s")
    public int field2843;

    @ObfuscatedName("fu.g")
    public class175 field2841;

    @ObfuscatedName("fu.h")
    public class182 field2845 = new class182();

    public class172(int arg0) {
        this.field2842 = arg0;
        this.field2843 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2841 = new class175(var2);
    }

    @ObfuscatedName("fu.k(J)Lgj;")
    public class183 method3202(long arg0) {
        class183 var3 = (class183) this.field2841.method3244(arg0);
        if (var3 != null) {
            this.field2845.method3331(var3);
        }
        return var3;
    }

    @ObfuscatedName("fu.y(J)V")
    public void method3203(long arg0) {
        class183 var3 = (class183) this.field2841.method3244(arg0);
        if (var3 != null) {
            var3.method3365();
            var3.method3346();
            this.field2843++;
        }
    }

    @ObfuscatedName("fu.s(Lgj;J)V")
    public void method3204(class183 arg0, long arg1) {
        if (this.field2843 == 0) {
            class183 var4 = this.field2845.method3332();
            var4.method3365();
            var4.method3346();
            if (this.field2844 == var4) {
                class183 var5 = this.field2845.method3332();
                var5.method3365();
                var5.method3346();
            }
        } else {
            this.field2843--;
        }
        this.field2841.method3253(arg0, arg1);
        this.field2845.method3331(arg0);
    }

    @ObfuscatedName("fu.g()V")
    public void method3210() {
        this.field2845.method3330();
        this.field2841.method3245();
        this.field2844 = new class183();
        this.field2843 = this.field2842;
    }
}

package deob;

@ObfuscatedName("fu")
public final class class173 {

    @ObfuscatedName("fu.e")
    public int field2822;

    @ObfuscatedName("fu.p")
    public class183[] field2823;

    @ObfuscatedName("fu.a")
    public class183 field2824;

    @ObfuscatedName("fu.g")
    public class183 field2825;

    @ObfuscatedName("fu.u")
    public int field2826 = 0;

    public class173(int arg0) {
        this.field2822 = arg0;
        this.field2823 = new class183[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class183 var3 = this.field2823[var2] = new class183();
            var3.field2844 = var3;
            var3.field2845 = var3;
        }
    }

    @ObfuscatedName("fu.e(J)Lgl;")
    public class183 method3192(long arg0) {
        class183 var3 = this.field2823[(int) (arg0 & (long) (this.field2822 - 1))];
        for (this.field2824 = var3.field2844; this.field2824 != var3; this.field2824 = this.field2824.field2844) {
            if (this.field2824.field2843 == arg0) {
                class183 var4 = this.field2824;
                this.field2824 = this.field2824.field2844;
                return var4;
            }
        }
        this.field2824 = null;
        return null;
    }

    @ObfuscatedName("fu.p(Lgl;J)V")
    public void method3191(class183 arg0, long arg1) {
        if (arg0.field2845 != null) {
            arg0.method3307();
        }
        class183 var4 = this.field2823[(int) (arg1 & (long) (this.field2822 - 1))];
        arg0.field2845 = var4.field2845;
        arg0.field2844 = var4;
        arg0.field2845.field2844 = arg0;
        arg0.field2844.field2845 = arg0;
        arg0.field2843 = arg1;
    }

    @ObfuscatedName("fu.a()V")
    public void method3194() {
        for (int var1 = 0; var1 < this.field2822; var1++) {
            class183 var2 = this.field2823[var1];
            while (true) {
                class183 var3 = var2.field2844;
                if (var2 == var3) {
                    break;
                }
                var3.method3307();
            }
        }
        this.field2824 = null;
        this.field2825 = null;
    }

    @ObfuscatedName("fu.g()Lgl;")
    public class183 method3196() {
        this.field2826 = 0;
        return this.method3201();
    }

    @ObfuscatedName("fu.u()Lgl;")
    public class183 method3201() {
        if (this.field2826 > 0 && this.field2823[this.field2826 - 1] != this.field2825) {
            class183 var1 = this.field2825;
            this.field2825 = var1.field2844;
            return var1;
        }
        class183 var2;
        do {
            if (this.field2826 >= this.field2822) {
                return null;
            }
            var2 = this.field2823[this.field2826++].field2844;
        } while (this.field2823[this.field2826 - 1] == var2);
        this.field2825 = var2.field2844;
        return var2;
    }
}

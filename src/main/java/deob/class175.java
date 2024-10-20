package deob;

@ObfuscatedName("fu")
public final class class175 {

    @ObfuscatedName("fu.g")
    public int field2815;

    @ObfuscatedName("fu.h")
    public class179[] field2813;

    @ObfuscatedName("fu.s")
    public class179 field2814;

    @ObfuscatedName("fu.o")
    public class179 field2812;

    @ObfuscatedName("fu.p")
    public int field2816 = 0;

    public class175(int arg0) {
        this.field2815 = arg0;
        this.field2813 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2813[var2] = new class179();
            var3.field2822 = var3;
            var3.field2824 = var3;
        }
    }

    @ObfuscatedName("fu.g(J)Lfz;")
    public class179 method3354(long arg0) {
        class179 var3 = this.field2813[(int) (arg0 & (long) (this.field2815 - 1))];
        for (this.field2814 = var3.field2822; this.field2814 != var3; this.field2814 = this.field2814.field2822) {
            if (this.field2814.field2823 == arg0) {
                class179 var4 = this.field2814;
                this.field2814 = this.field2814.field2822;
                return var4;
            }
        }
        this.field2814 = null;
        return null;
    }

    @ObfuscatedName("fu.h(Lfz;J)V")
    public void method3364(class179 arg0, long arg1) {
        if (arg0.field2824 != null) {
            arg0.method3404();
        }
        class179 var4 = this.field2813[(int) (arg1 & (long) (this.field2815 - 1))];
        arg0.field2824 = var4.field2824;
        arg0.field2822 = var4;
        arg0.field2824.field2822 = arg0;
        arg0.field2822.field2824 = arg0;
        arg0.field2823 = arg1;
    }

    @ObfuscatedName("fu.s()V")
    public void method3349() {
        for (int var1 = 0; var1 < this.field2815; var1++) {
            class179 var2 = this.field2813[var1];
            while (true) {
                class179 var3 = var2.field2822;
                if (var2 == var3) {
                    break;
                }
                var3.method3404();
            }
        }
        this.field2814 = null;
        this.field2812 = null;
    }

    @ObfuscatedName("fu.o()Lfz;")
    public class179 method3352() {
        this.field2816 = 0;
        return this.method3353();
    }

    @ObfuscatedName("fu.p()Lfz;")
    public class179 method3353() {
        if (this.field2816 > 0 && this.field2813[this.field2816 - 1] != this.field2812) {
            class179 var1 = this.field2812;
            this.field2812 = var1.field2822;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2816 >= this.field2815) {
                return null;
            }
            var2 = this.field2813[this.field2816++].field2822;
        } while (this.field2813[this.field2816 - 1] == var2);
        this.field2812 = var2.field2822;
        return var2;
    }
}

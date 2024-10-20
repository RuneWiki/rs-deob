package deob;

@ObfuscatedName("fn")
public final class class175 {

    @ObfuscatedName("fn.b")
    public int field2815;

    @ObfuscatedName("fn.c")
    public class179[] field2816;

    @ObfuscatedName("fn.j")
    public class179 field2817;

    @ObfuscatedName("fn.i")
    public class179 field2818;

    @ObfuscatedName("fn.k")
    public int field2819 = 0;

    public class175(int arg0) {
        this.field2815 = arg0;
        this.field2816 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2816[var2] = new class179();
            var3.field2827 = var3;
            var3.field2825 = var3;
        }
    }

    @ObfuscatedName("fn.b(J)Lfo;")
    public class179 method3232(long arg0) {
        class179 var3 = this.field2816[(int) (arg0 & (long) (this.field2815 - 1))];
        for (this.field2817 = var3.field2827; this.field2817 != var3; this.field2817 = this.field2817.field2827) {
            if (this.field2817.field2826 == arg0) {
                class179 var4 = this.field2817;
                this.field2817 = this.field2817.field2827;
                return var4;
            }
        }
        this.field2817 = null;
        return null;
    }

    @ObfuscatedName("fn.c(Lfo;J)V")
    public void method3228(class179 arg0, long arg1) {
        if (arg0.field2825 != null) {
            arg0.method3282();
        }
        class179 var4 = this.field2816[(int) (arg1 & (long) (this.field2815 - 1))];
        arg0.field2825 = var4.field2825;
        arg0.field2827 = var4;
        arg0.field2825.field2827 = arg0;
        arg0.field2827.field2825 = arg0;
        arg0.field2826 = arg1;
    }

    @ObfuscatedName("fn.j()V")
    public void method3229() {
        for (int var1 = 0; var1 < this.field2815; var1++) {
            class179 var2 = this.field2816[var1];
            while (true) {
                class179 var3 = var2.field2827;
                if (var2 == var3) {
                    break;
                }
                var3.method3282();
            }
        }
        this.field2817 = null;
        this.field2818 = null;
    }

    @ObfuscatedName("fn.i()Lfo;")
    public class179 method3226() {
        this.field2819 = 0;
        return this.method3231();
    }

    @ObfuscatedName("fn.k()Lfo;")
    public class179 method3231() {
        if (this.field2819 > 0 && this.field2816[this.field2819 - 1] != this.field2818) {
            class179 var1 = this.field2818;
            this.field2818 = var1.field2827;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2819 >= this.field2815) {
                return null;
            }
            var2 = this.field2816[this.field2819++].field2827;
        } while (this.field2816[this.field2819 - 1] == var2);
        this.field2818 = var2.field2827;
        return var2;
    }
}

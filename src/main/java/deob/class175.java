package deob;

@ObfuscatedName("fc")
public final class class175 {

    @ObfuscatedName("fc.c")
    public int field2814;

    @ObfuscatedName("fc.q")
    public class179[] field2815;

    @ObfuscatedName("fc.y")
    public class179 field2816;

    @ObfuscatedName("fc.v")
    public class179 field2817;

    @ObfuscatedName("fc.g")
    public int field2818 = 0;

    public class175(int arg0) {
        this.field2814 = arg0;
        this.field2815 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2815[var2] = new class179();
            var3.field2825 = var3;
            var3.field2826 = var3;
        }
    }

    @ObfuscatedName("fc.c(J)Lfr;")
    public class179 method3138(long arg0) {
        class179 var3 = this.field2815[(int) (arg0 & (long) (this.field2814 - 1))];
        for (this.field2816 = var3.field2825; this.field2816 != var3; this.field2816 = this.field2816.field2825) {
            if (this.field2816.field2824 == arg0) {
                class179 var4 = this.field2816;
                this.field2816 = this.field2816.field2825;
                return var4;
            }
        }
        this.field2816 = null;
        return null;
    }

    @ObfuscatedName("fc.q(Lfr;J)V")
    public void method3136(class179 arg0, long arg1) {
        if (arg0.field2826 != null) {
            arg0.method3196();
        }
        class179 var4 = this.field2815[(int) (arg1 & (long) (this.field2814 - 1))];
        arg0.field2826 = var4.field2826;
        arg0.field2825 = var4;
        arg0.field2826.field2825 = arg0;
        arg0.field2825.field2826 = arg0;
        arg0.field2824 = arg1;
    }

    @ObfuscatedName("fc.y()V")
    public void method3137() {
        for (int var1 = 0; var1 < this.field2814; var1++) {
            class179 var2 = this.field2815[var1];
            while (true) {
                class179 var3 = var2.field2825;
                if (var2 == var3) {
                    break;
                }
                var3.method3196();
            }
        }
        this.field2816 = null;
        this.field2817 = null;
    }

    @ObfuscatedName("fc.v()Lfr;")
    public class179 method3155() {
        this.field2818 = 0;
        return this.method3139();
    }

    @ObfuscatedName("fc.g()Lfr;")
    public class179 method3139() {
        if (this.field2818 > 0 && this.field2815[this.field2818 - 1] != this.field2817) {
            class179 var1 = this.field2817;
            this.field2817 = var1.field2825;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2818 >= this.field2814) {
                return null;
            }
            var2 = this.field2815[this.field2818++].field2825;
        } while (this.field2815[this.field2818 - 1] == var2);
        this.field2817 = var2.field2825;
        return var2;
    }
}

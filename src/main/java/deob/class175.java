package deob;

@ObfuscatedName("fq")
public final class class175 {

    @ObfuscatedName("fq.p")
    public int field2812;

    @ObfuscatedName("fq.i")
    public class179[] field2813;

    @ObfuscatedName("fq.o")
    public class179 field2811;

    @ObfuscatedName("fq.n")
    public class179 field2810;

    @ObfuscatedName("fq.l")
    public int field2809 = 0;

    public class175(int arg0) {
        this.field2812 = arg0;
        this.field2813 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field2813[var2] = new class179();
            var3.field2821 = var3;
            var3.field2819 = var3;
        }
    }

    @ObfuscatedName("fq.p(J)Lfi;")
    public class179 method3312(long arg0) {
        class179 var3 = this.field2813[(int) (arg0 & (long) (this.field2812 - 1))];
        for (this.field2811 = var3.field2821; this.field2811 != var3; this.field2811 = this.field2811.field2821) {
            if (this.field2811.field2820 == arg0) {
                class179 var4 = this.field2811;
                this.field2811 = this.field2811.field2821;
                return var4;
            }
        }
        this.field2811 = null;
        return null;
    }

    @ObfuscatedName("fq.i(Lfi;J)V")
    public void method3313(class179 arg0, long arg1) {
        if (arg0.field2819 != null) {
            arg0.method3360();
        }
        class179 var4 = this.field2813[(int) (arg1 & (long) (this.field2812 - 1))];
        arg0.field2819 = var4.field2819;
        arg0.field2821 = var4;
        arg0.field2819.field2821 = arg0;
        arg0.field2821.field2819 = arg0;
        arg0.field2820 = arg1;
    }

    @ObfuscatedName("fq.o()V")
    public void method3314() {
        for (int var1 = 0; var1 < this.field2812; var1++) {
            class179 var2 = this.field2813[var1];
            while (true) {
                class179 var3 = var2.field2821;
                if (var2 == var3) {
                    break;
                }
                var3.method3360();
            }
        }
        this.field2811 = null;
        this.field2810 = null;
    }

    @ObfuscatedName("fq.n()Lfi;")
    public class179 method3326() {
        this.field2809 = 0;
        return this.method3316();
    }

    @ObfuscatedName("fq.l()Lfi;")
    public class179 method3316() {
        if (this.field2809 > 0 && this.field2813[this.field2809 - 1] != this.field2810) {
            class179 var1 = this.field2810;
            this.field2810 = var1.field2821;
            return var1;
        }
        class179 var2;
        do {
            if (this.field2809 >= this.field2812) {
                return null;
            }
            var2 = this.field2813[this.field2809++].field2821;
        } while (this.field2813[this.field2809 - 1] == var2);
        this.field2810 = var2.field2821;
        return var2;
    }
}

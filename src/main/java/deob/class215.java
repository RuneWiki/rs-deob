package deob;

@ObfuscatedName("hy")
public final class class215 {

    @ObfuscatedName("hy.c")
    public int field2638;

    @ObfuscatedName("hy.i")
    public class217[] field2637;

    @ObfuscatedName("hy.o")
    public class217 field2640;

    @ObfuscatedName("hy.j")
    public class217 field2639;

    @ObfuscatedName("hy.k")
    public int field2636 = 0;

    public class215(int arg0) {
        this.field2638 = arg0;
        this.field2637 = new class217[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2637[var2] = new class217();
            var3.field2643 = var3;
            var3.field2644 = var3;
        }
    }

    @ObfuscatedName("hy.c(J)Lhg;")
    public class217 method3677(long arg0) {
        class217 var3 = this.field2637[(int) (arg0 & (long) (this.field2638 - 1))];
        for (this.field2640 = var3.field2643; this.field2640 != var3; this.field2640 = this.field2640.field2643) {
            if (this.field2640.field2645 == arg0) {
                class217 var4 = this.field2640;
                this.field2640 = this.field2640.field2643;
                return var4;
            }
        }
        this.field2640 = null;
        return null;
    }

    @ObfuscatedName("hy.i(Lhg;J)V")
    public void method3668(class217 arg0, long arg1) {
        if (arg0.field2644 != null) {
            arg0.method3710();
        }
        class217 var4 = this.field2637[(int) (arg1 & (long) (this.field2638 - 1))];
        arg0.field2644 = var4.field2644;
        arg0.field2643 = var4;
        arg0.field2644.field2643 = arg0;
        arg0.field2643.field2644 = arg0;
        arg0.field2645 = arg1;
    }

    @ObfuscatedName("hy.o()V")
    public void method3659() {
        for (int var1 = 0; var1 < this.field2638; var1++) {
            class217 var2 = this.field2637[var1];
            while (true) {
                class217 var3 = var2.field2643;
                if (var2 == var3) {
                    break;
                }
                var3.method3710();
            }
        }
        this.field2640 = null;
        this.field2639 = null;
    }

    @ObfuscatedName("hy.j()Lhg;")
    public class217 method3658() {
        this.field2636 = 0;
        return this.method3661();
    }

    @ObfuscatedName("hy.k()Lhg;")
    public class217 method3661() {
        if (this.field2636 > 0 && this.field2637[this.field2636 - 1] != this.field2639) {
            class217 var1 = this.field2639;
            this.field2639 = var1.field2643;
            return var1;
        }
        class217 var2;
        do {
            if (this.field2636 >= this.field2638) {
                return null;
            }
            var2 = this.field2637[this.field2636++].field2643;
        } while (this.field2637[this.field2636 - 1] == var2);
        this.field2639 = var2.field2643;
        return var2;
    }
}

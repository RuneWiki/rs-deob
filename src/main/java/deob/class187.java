package deob;

@ObfuscatedName("gr")
public final class class187 {

    @ObfuscatedName("gr.o")
    public int field2990;

    @ObfuscatedName("gr.l")
    public class199[] field2989;

    @ObfuscatedName("gr.g")
    public class199 field2988;

    @ObfuscatedName("gr.u")
    public class199 field2991;

    @ObfuscatedName("gr.q")
    public int field2992 = 0;

    public class187(int arg0) {
        this.field2990 = arg0;
        this.field2989 = new class199[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class199 var3 = this.field2989[var2] = new class199();
            var3.field3013 = var3;
            var3.field3014 = var3;
        }
    }

    @ObfuscatedName("gr.o(J)Lgj;")
    public class199 method3435(long arg0) {
        class199 var3 = this.field2989[(int) (arg0 & (long) (this.field2990 - 1))];
        for (this.field2988 = var3.field3013; this.field2988 != var3; this.field2988 = this.field2988.field3013) {
            if (this.field2988.field3015 == arg0) {
                class199 var4 = this.field2988;
                this.field2988 = this.field2988.field3013;
                return var4;
            }
        }
        this.field2988 = null;
        return null;
    }

    @ObfuscatedName("gr.l(Lgj;J)V")
    public void method3436(class199 arg0, long arg1) {
        if (arg0.field3014 != null) {
            arg0.method3564();
        }
        class199 var4 = this.field2989[(int) (arg1 & (long) (this.field2990 - 1))];
        arg0.field3014 = var4.field3014;
        arg0.field3013 = var4;
        arg0.field3014.field3013 = arg0;
        arg0.field3013.field3014 = arg0;
        arg0.field3015 = arg1;
    }

    @ObfuscatedName("gr.g()V")
    public void method3437() {
        for (int var1 = 0; var1 < this.field2990; var1++) {
            class199 var2 = this.field2989[var1];
            while (true) {
                class199 var3 = var2.field3013;
                if (var2 == var3) {
                    break;
                }
                var3.method3564();
            }
        }
        this.field2988 = null;
        this.field2991 = null;
    }

    @ObfuscatedName("gr.u()Lgj;")
    public class199 method3438() {
        this.field2992 = 0;
        return this.method3439();
    }

    @ObfuscatedName("gr.q()Lgj;")
    public class199 method3439() {
        if (this.field2992 > 0 && this.field2989[this.field2992 - 1] != this.field2991) {
            class199 var1 = this.field2991;
            this.field2991 = var1.field3013;
            return var1;
        }
        class199 var2;
        do {
            if (this.field2992 >= this.field2990) {
                return null;
            }
            var2 = this.field2989[this.field2992++].field3013;
        } while (this.field2989[this.field2992 - 1] == var2);
        this.field2991 = var2.field3013;
        return var2;
    }
}

package deob;

@ObfuscatedName("fz")
public final class class175 {

    @ObfuscatedName("fz.g")
    public int field2863;

    @ObfuscatedName("fz.i")
    public class187[] field2861;

    @ObfuscatedName("fz.k")
    public class187 field2860;

    @ObfuscatedName("fz.e")
    public class187 field2864;

    @ObfuscatedName("fz.w")
    public int field2862 = 0;

    public class175(int arg0) {
        this.field2863 = arg0;
        this.field2861 = new class187[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class187 var3 = this.field2861[var2] = new class187();
            var3.field2886 = var3;
            var3.field2887 = var3;
        }
    }

    @ObfuscatedName("fz.g(J)Lgf;")
    public class187 method3174(long arg0) {
        class187 var3 = this.field2861[(int) (arg0 & (long) (this.field2863 - 1))];
        for (this.field2860 = var3.field2886; this.field2860 != var3; this.field2860 = this.field2860.field2886) {
            if (this.field2860.field2885 == arg0) {
                class187 var4 = this.field2860;
                this.field2860 = this.field2860.field2886;
                return var4;
            }
        }
        this.field2860 = null;
        return null;
    }

    @ObfuscatedName("fz.i(Lgf;J)V")
    public void method3177(class187 arg0, long arg1) {
        if (arg0.field2887 != null) {
            arg0.method3304();
        }
        class187 var4 = this.field2861[(int) (arg1 & (long) (this.field2863 - 1))];
        arg0.field2887 = var4.field2887;
        arg0.field2886 = var4;
        arg0.field2887.field2886 = arg0;
        arg0.field2886.field2887 = arg0;
        arg0.field2885 = arg1;
    }

    @ObfuscatedName("fz.k()V")
    public void method3176() {
        for (int var1 = 0; var1 < this.field2863; var1++) {
            class187 var2 = this.field2861[var1];
            while (true) {
                class187 var3 = var2.field2886;
                if (var2 == var3) {
                    break;
                }
                var3.method3304();
            }
        }
        this.field2860 = null;
        this.field2864 = null;
    }

    @ObfuscatedName("fz.e()Lgf;")
    public class187 method3182() {
        this.field2862 = 0;
        return this.method3178();
    }

    @ObfuscatedName("fz.w()Lgf;")
    public class187 method3178() {
        if (this.field2862 > 0 && this.field2861[this.field2862 - 1] != this.field2864) {
            class187 var1 = this.field2864;
            this.field2864 = var1.field2886;
            return var1;
        }
        class187 var2;
        do {
            if (this.field2862 >= this.field2863) {
                return null;
            }
            var2 = this.field2861[this.field2862++].field2886;
        } while (this.field2861[this.field2862 - 1] == var2);
        this.field2864 = var2.field2886;
        return var2;
    }
}

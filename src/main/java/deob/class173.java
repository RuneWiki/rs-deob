package deob;

@ObfuscatedName("fa")
public final class class173 {

    @ObfuscatedName("fa.g")
    public int field2753;

    @ObfuscatedName("fa.e")
    public class177[] field2751;

    @ObfuscatedName("fa.n")
    public class177 field2752;

    @ObfuscatedName("fa.j")
    public class177 field2754;

    @ObfuscatedName("fa.i")
    public int field2750 = 0;

    public class173(int arg0) {
        this.field2753 = arg0;
        this.field2751 = new class177[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class177 var3 = this.field2751[var2] = new class177();
            var3.field2761 = var3;
            var3.field2762 = var3;
        }
    }

    @ObfuscatedName("fa.g(J)Lff;")
    public class177 method3354(long arg0) {
        class177 var3 = this.field2751[(int) (arg0 & (long) (this.field2753 - 1))];
        for (this.field2752 = var3.field2761; this.field2752 != var3; this.field2752 = this.field2752.field2761) {
            if (this.field2752.field2760 == arg0) {
                class177 var4 = this.field2752;
                this.field2752 = this.field2752.field2761;
                return var4;
            }
        }
        this.field2752 = null;
        return null;
    }

    @ObfuscatedName("fa.e(Lff;J)V")
    public void method3353(class177 arg0, long arg1) {
        if (arg0.field2762 != null) {
            arg0.method3415();
        }
        class177 var4 = this.field2751[(int) (arg1 & (long) (this.field2753 - 1))];
        arg0.field2762 = var4.field2762;
        arg0.field2761 = var4;
        arg0.field2762.field2761 = arg0;
        arg0.field2761.field2762 = arg0;
        arg0.field2760 = arg1;
    }

    @ObfuscatedName("fa.n()V")
    public void method3356() {
        for (int var1 = 0; var1 < this.field2753; var1++) {
            class177 var2 = this.field2751[var1];
            while (true) {
                class177 var3 = var2.field2761;
                if (var2 == var3) {
                    break;
                }
                var3.method3415();
            }
        }
        this.field2752 = null;
        this.field2754 = null;
    }

    @ObfuscatedName("fa.j()Lff;")
    public class177 method3357() {
        this.field2750 = 0;
        return this.method3372();
    }

    @ObfuscatedName("fa.i()Lff;")
    public class177 method3372() {
        if (this.field2750 > 0 && this.field2751[this.field2750 - 1] != this.field2754) {
            class177 var1 = this.field2754;
            this.field2754 = var1.field2761;
            return var1;
        }
        class177 var2;
        do {
            if (this.field2750 >= this.field2753) {
                return null;
            }
            var2 = this.field2751[this.field2750++].field2761;
        } while (this.field2751[this.field2750 - 1] == var2);
        this.field2754 = var2.field2761;
        return var2;
    }
}

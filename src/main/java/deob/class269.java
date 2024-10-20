package deob;

@ObfuscatedName("jj")
public class class269 extends class209 {

    @ObfuscatedName("jj.h")
    public static class203 field3395 = new class203(64);

    @ObfuscatedName("jj.e")
    public char field3396;

    @ObfuscatedName("jj.b")
    public char field3394;

    @ObfuscatedName("jj.l")
    public String field3398 = class240.field2850;

    @ObfuscatedName("jj.w")
    public int field3397;

    @ObfuscatedName("jj.d")
    public int field3400 = 0;

    @ObfuscatedName("jj.n")
    public int[] field3401;

    @ObfuscatedName("jj.s")
    public int[] field3402;

    @ObfuscatedName("jj.g")
    public String[] field3399;

    @ObfuscatedName("br.f(Lie;I)V")
    public static void method1723(class250 arg0) {
        Statics.field3404 = arg0;
    }

    @ObfuscatedName("jj.e(Lgx;I)V")
    public void method4624(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4625(arg0, var2);
        }
    }

    @ObfuscatedName("jj.b(Lgx;II)V")
    public void method4625(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3396 = (char) arg0.method3323();
        } else if (arg1 == 2) {
            this.field3394 = (char) arg0.method3323();
        } else if (arg1 == 3) {
            this.field3398 = arg0.method3435();
        } else if (arg1 == 4) {
            this.field3397 = arg0.method3328();
        } else if (arg1 == 5) {
            this.field3400 = arg0.method3325();
            this.field3401 = new int[this.field3400];
            this.field3399 = new String[this.field3400];
            for (int var3 = 0; var3 < this.field3400; var3++) {
                this.field3401[var3] = arg0.method3328();
                this.field3399[var3] = arg0.method3435();
            }
        } else if (arg1 == 6) {
            this.field3400 = arg0.method3325();
            this.field3401 = new int[this.field3400];
            this.field3402 = new int[this.field3400];
            for (int var4 = 0; var4 < this.field3400; var4++) {
                this.field3401[var4] = arg0.method3328();
                this.field3402[var4] = arg0.method3328();
            }
        }
    }

    @ObfuscatedName("jj.l(I)I")
    public int method4623() {
        return this.field3400;
    }
}

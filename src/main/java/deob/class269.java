package deob;

@ObfuscatedName("jd")
public class class269 extends class209 {

    @ObfuscatedName("jd.s")
    public static class203 field3365 = new class203(64);

    @ObfuscatedName("jd.o")
    public char field3367;

    @ObfuscatedName("jd.k")
    public char field3368;

    @ObfuscatedName("jd.u")
    public String field3369 = class240.field2830;

    @ObfuscatedName("jd.i")
    public int field3370;

    @ObfuscatedName("jd.t")
    public int field3366 = 0;

    @ObfuscatedName("jd.p")
    public int[] field3372;

    @ObfuscatedName("jd.l")
    public int[] field3373;

    @ObfuscatedName("jd.b")
    public String[] field3374;

    @ObfuscatedName("jd.s(Lgx;I)V")
    public void method4655(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4656(arg0, var2);
        }
    }

    @ObfuscatedName("jd.o(Lgx;II)V")
    public void method4656(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3367 = (char) arg0.method3274();
        } else if (arg1 == 2) {
            this.field3368 = (char) arg0.method3274();
        } else if (arg1 == 3) {
            this.field3369 = arg0.method3490();
        } else if (arg1 == 4) {
            this.field3370 = arg0.method3279();
        } else if (arg1 == 5) {
            this.field3366 = arg0.method3276();
            this.field3372 = new int[this.field3366];
            this.field3374 = new String[this.field3366];
            for (int var3 = 0; var3 < this.field3366; var3++) {
                this.field3372[var3] = arg0.method3279();
                this.field3374[var3] = arg0.method3490();
            }
        } else if (arg1 == 6) {
            this.field3366 = arg0.method3276();
            this.field3372 = new int[this.field3366];
            this.field3373 = new int[this.field3366];
            for (int var4 = 0; var4 < this.field3366; var4++) {
                this.field3372[var4] = arg0.method3279();
                this.field3373[var4] = arg0.method3279();
            }
        }
    }

    @ObfuscatedName("jd.k(I)I")
    public int method4657() {
        return this.field3366;
    }
}

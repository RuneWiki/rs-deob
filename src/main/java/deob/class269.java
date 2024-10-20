package deob;

@ObfuscatedName("jj")
public class class269 extends class209 {

    @ObfuscatedName("jj.r")
    public static class203 field3415 = new class203(64);

    @ObfuscatedName("jj.e")
    public char field3426;

    @ObfuscatedName("jj.q")
    public char field3418;

    @ObfuscatedName("jj.c")
    public String field3422 = class240.field2863;

    @ObfuscatedName("jj.l")
    public int field3416;

    @ObfuscatedName("jj.b")
    public int field3421 = 0;

    @ObfuscatedName("jj.w")
    public int[] field3417;

    @ObfuscatedName("jj.n")
    public int[] field3423;

    @ObfuscatedName("jj.i")
    public String[] field3424;

    @ObfuscatedName("jj.e(Lgl;I)V")
    public void method4815(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4816(arg0, var2);
        }
    }

    @ObfuscatedName("jj.q(Lgl;II)V")
    public void method4816(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3426 = (char) arg0.method3679();
        } else if (arg1 == 2) {
            this.field3418 = (char) arg0.method3679();
        } else if (arg1 == 3) {
            this.field3422 = arg0.method3474();
        } else if (arg1 == 4) {
            this.field3416 = arg0.method3588();
        } else if (arg1 == 5) {
            this.field3421 = arg0.method3467();
            this.field3417 = new int[this.field3421];
            this.field3424 = new String[this.field3421];
            for (int var3 = 0; var3 < this.field3421; var3++) {
                this.field3417[var3] = arg0.method3588();
                this.field3424[var3] = arg0.method3474();
            }
        } else if (arg1 == 6) {
            this.field3421 = arg0.method3467();
            this.field3417 = new int[this.field3421];
            this.field3423 = new int[this.field3421];
            for (int var4 = 0; var4 < this.field3421; var4++) {
                this.field3417[var4] = arg0.method3588();
                this.field3423[var4] = arg0.method3588();
            }
        }
    }

    @ObfuscatedName("jj.c(B)I")
    public int method4817() {
        return this.field3421;
    }
}

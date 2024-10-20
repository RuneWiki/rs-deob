package deob;

@ObfuscatedName("is")
public class class254 extends class195 {

    @ObfuscatedName("is.j")
    public static class190 field3396 = new class190(64);

    @ObfuscatedName("is.n")
    public char field3397;

    @ObfuscatedName("is.r")
    public char field3398;

    @ObfuscatedName("is.v")
    public String field3399 = "null";

    @ObfuscatedName("is.e")
    public int field3402;

    @ObfuscatedName("is.l")
    public int field3401 = 0;

    @ObfuscatedName("is.s")
    public int[] field3406;

    @ObfuscatedName("is.w")
    public int[] field3403;

    @ObfuscatedName("is.p")
    public String[] field3404;

    @ObfuscatedName("is.j(Lfe;I)V")
    public void method4095(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method4094(arg0, var2);
        }
    }

    @ObfuscatedName("is.n(Lfe;II)V")
    public void method4094(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3397 = (char) arg0.method2871();
        } else if (arg1 == 2) {
            this.field3398 = (char) arg0.method2871();
        } else if (arg1 == 3) {
            this.field3399 = arg0.method2879();
        } else if (arg1 == 4) {
            this.field3402 = arg0.method2876();
        } else if (arg1 == 5) {
            this.field3401 = arg0.method2873();
            this.field3406 = new int[this.field3401];
            this.field3404 = new String[this.field3401];
            for (int var3 = 0; var3 < this.field3401; var3++) {
                this.field3406[var3] = arg0.method2876();
                this.field3404[var3] = arg0.method2879();
            }
        } else if (arg1 == 6) {
            this.field3401 = arg0.method2873();
            this.field3406 = new int[this.field3401];
            this.field3403 = new int[this.field3401];
            for (int var4 = 0; var4 < this.field3401; var4++) {
                this.field3406[var4] = arg0.method2876();
                this.field3403[var4] = arg0.method2876();
            }
        }
    }
}

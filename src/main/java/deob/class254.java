package deob;

@ObfuscatedName("ih")
public class class254 extends class195 {

    @ObfuscatedName("ih.o")
    public static class190 field3382 = new class190(64);

    @ObfuscatedName("ih.i")
    public char field3376;

    @ObfuscatedName("ih.u")
    public char field3377;

    @ObfuscatedName("ih.g")
    public String field3383 = "null";

    @ObfuscatedName("ih.m")
    public int field3374;

    @ObfuscatedName("ih.s")
    public int field3380 = 0;

    @ObfuscatedName("ih.x")
    public int[] field3381;

    @ObfuscatedName("ih.p")
    public int[] field3378;

    @ObfuscatedName("ih.k")
    public String[] field3379;

    @ObfuscatedName("gz.c(Lip;I)V")
    public static void method3495(class236 arg0) {
        Statics.field3375 = arg0;
    }

    @ObfuscatedName("ih.o(Lfp;S)V")
    public void method4045(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method4047(arg0, var2);
        }
    }

    @ObfuscatedName("ih.i(Lfp;II)V")
    public void method4047(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3376 = (char) arg0.method2843();
        } else if (arg1 == 2) {
            this.field3377 = (char) arg0.method2843();
        } else if (arg1 == 3) {
            this.field3383 = arg0.method2867();
        } else if (arg1 == 4) {
            this.field3374 = arg0.method2987();
        } else if (arg1 == 5) {
            this.field3380 = arg0.method2861();
            this.field3381 = new int[this.field3380];
            this.field3379 = new String[this.field3380];
            for (int var3 = 0; var3 < this.field3380; var3++) {
                this.field3381[var3] = arg0.method2987();
                this.field3379[var3] = arg0.method2867();
            }
        } else if (arg1 == 6) {
            this.field3380 = arg0.method2861();
            this.field3381 = new int[this.field3380];
            this.field3378 = new int[this.field3380];
            for (int var4 = 0; var4 < this.field3380; var4++) {
                this.field3381[var4] = arg0.method2987();
                this.field3378[var4] = arg0.method2987();
            }
        }
    }
}

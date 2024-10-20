package deob;

@ObfuscatedName("ab")
public class class38 extends class173 {

    @ObfuscatedName("ab.j")
    public static class169 field960 = new class169(64);

    @ObfuscatedName("ab.w")
    public int field961;

    @ObfuscatedName("ab.h")
    public char field959;

    @ObfuscatedName("ab.v")
    public String field963 = "null";

    @ObfuscatedName("ab.k")
    public int field972;

    @ObfuscatedName("ab.g")
    public int field964 = 0;

    @ObfuscatedName("ab.n")
    public int[] field966;

    @ObfuscatedName("ab.c")
    public int[] field962;

    @ObfuscatedName("ab.o")
    public String[] field968;

    @ObfuscatedName("at.p(Ler;I)V")
    public static void method507(class151 arg0) {
        Statics.field967 = arg0;
    }

    @ObfuscatedName("ab.j(Ldv;B)V")
    public void method790(class126 arg0) {
        while (true) {
            int var2 = arg0.method2544();
            if (var2 == 0) {
                return;
            }
            this.method791(arg0, var2);
        }
    }

    @ObfuscatedName("ab.w(Ldv;II)V")
    public void method791(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field961 = arg0.method2544();
        } else if (arg1 == 2) {
            this.field959 = (char) arg0.method2544();
        } else if (arg1 == 3) {
            this.field963 = arg0.method2383();
        } else if (arg1 == 4) {
            this.field972 = arg0.method2380();
        } else if (arg1 == 5) {
            this.field964 = arg0.method2489();
            this.field966 = new int[this.field964];
            this.field968 = new String[this.field964];
            for (int var3 = 0; var3 < this.field964; var3++) {
                this.field966[var3] = arg0.method2380();
                this.field968[var3] = arg0.method2383();
            }
        } else if (arg1 == 6) {
            this.field964 = arg0.method2489();
            this.field966 = new int[this.field964];
            this.field962 = new int[this.field964];
            for (int var4 = 0; var4 < this.field964; var4++) {
                this.field966[var4] = arg0.method2380();
                this.field962[var4] = arg0.method2380();
            }
        }
    }
}

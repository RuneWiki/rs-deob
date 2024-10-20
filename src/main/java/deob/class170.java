package deob;

@ObfuscatedName("au")
public class class170 extends class6 {

    @ObfuscatedName("au.f")
    public int[] field2522;

    @ObfuscatedName("au.d")
    public int field2520;

    @ObfuscatedName("au.l")
    public int field2521 = 0;

    @ObfuscatedName("au.j")
    public String[] field2527;

    @ObfuscatedName("au.k")
    public int field2515;

    @ObfuscatedName("au.h")
    public static class2 field2518 = new class2(64);

    @ObfuscatedName("au.w")
    public char field2517;

    @ObfuscatedName("au.t")
    public String field2519 = "null";

    @ObfuscatedName("au.s")
    public int[] field2523;

    @ObfuscatedName("au.b(Ldp;B)V")
    public void method2941(class50 arg0) {
        while (true) {
            int var2 = arg0.method726();
            if (var2 == 0) {
                return;
            }
            this.method2943(arg0, var2);
        }
    }

    @ObfuscatedName("au.h(Ldp;II)V")
    public void method2943(class50 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2515 = arg0.method726();
        } else if (arg1 == 2) {
            this.field2517 = (char) arg0.method726();
        } else if (arg1 == 3) {
            this.field2519 = arg0.method688();
        } else if (arg1 == 4) {
            this.field2520 = arg0.method685();
        } else if (arg1 == 5) {
            this.field2521 = arg0.method720();
            this.field2522 = new int[this.field2521];
            this.field2527 = new String[this.field2521];
            for (int var3 = 0; var3 < this.field2521; var3++) {
                this.field2522[var3] = arg0.method685();
                this.field2527[var3] = arg0.method688();
            }
        } else if (arg1 == 6) {
            this.field2521 = arg0.method720();
            this.field2522 = new int[this.field2521];
            this.field2523 = new int[this.field2521];
            for (int var4 = 0; var4 < this.field2521; var4++) {
                this.field2522[var4] = arg0.method685();
                this.field2523[var4] = arg0.method685();
            }
        }
    }
}

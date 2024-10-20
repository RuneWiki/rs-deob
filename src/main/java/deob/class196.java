package deob;

@ObfuscatedName("gs")
public class class196 extends class130 {

    @ObfuscatedName("gs.j")
    public static class125 field2850 = new class125(64);

    @ObfuscatedName("gs.c")
    public char field2852;

    @ObfuscatedName("gs.d")
    public char field2853;

    @ObfuscatedName("gs.w")
    public String field2854 = "null";

    @ObfuscatedName("gs.h")
    public int field2855;

    @ObfuscatedName("gs.u")
    public int field2862 = 0;

    @ObfuscatedName("gs.k")
    public int[] field2857;

    @ObfuscatedName("gs.g")
    public int[] field2858;

    @ObfuscatedName("gs.y")
    public String[] field2859;

    @ObfuscatedName("gs.x(Lek;I)V")
    public void method3367(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3360(arg0, var2);
        }
    }

    @ObfuscatedName("gs.j(Lek;IB)V")
    public void method3360(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2852 = (char) arg0.method2701();
        } else if (arg1 == 2) {
            this.field2853 = (char) arg0.method2701();
        } else if (arg1 == 3) {
            this.field2854 = arg0.method2699();
        } else if (arg1 == 4) {
            this.field2855 = arg0.method2644();
        } else if (arg1 == 5) {
            this.field2862 = arg0.method2745();
            this.field2857 = new int[this.field2862];
            this.field2859 = new String[this.field2862];
            for (int var3 = 0; var3 < this.field2862; var3++) {
                this.field2857[var3] = arg0.method2644();
                this.field2859[var3] = arg0.method2699();
            }
        } else if (arg1 == 6) {
            this.field2862 = arg0.method2745();
            this.field2857 = new int[this.field2862];
            this.field2858 = new int[this.field2862];
            for (int var4 = 0; var4 < this.field2862; var4++) {
                this.field2857[var4] = arg0.method2644();
                this.field2858[var4] = arg0.method2644();
            }
        }
    }
}

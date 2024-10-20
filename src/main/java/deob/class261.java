package deob;

@ObfuscatedName("jk")
public class class261 extends class202 {

    @ObfuscatedName("jk.s")
    public static class197 field3457 = new class197(64);

    @ObfuscatedName("jk.r")
    public char field3451;

    @ObfuscatedName("jk.g")
    public char field3460;

    @ObfuscatedName("jk.x")
    public String field3453 = "null";

    @ObfuscatedName("jk.f")
    public int field3450;

    @ObfuscatedName("jk.u")
    public int field3455 = 0;

    @ObfuscatedName("jk.t")
    public int[] field3456;

    @ObfuscatedName("jk.k")
    public int[] field3452;

    @ObfuscatedName("jk.n")
    public String[] field3458;

    @ObfuscatedName("ie.b(Lij;B)V")
    public static void method4050(class243 arg0) {
        Statics.field3454 = arg0;
    }

    @ObfuscatedName("jk.s(Lfs;I)V")
    public void method4167(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4161(arg0, var2);
        }
    }

    @ObfuscatedName("jk.r(Lfs;II)V")
    public void method4161(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3451 = (char) arg0.method2945();
        } else if (arg1 == 2) {
            this.field3460 = (char) arg0.method2945();
        } else if (arg1 == 3) {
            this.field3453 = arg0.method2953();
        } else if (arg1 == 4) {
            this.field3450 = arg0.method2996();
        } else if (arg1 == 5) {
            this.field3455 = arg0.method3081();
            this.field3456 = new int[this.field3455];
            this.field3458 = new String[this.field3455];
            for (int var3 = 0; var3 < this.field3455; var3++) {
                this.field3456[var3] = arg0.method2996();
                this.field3458[var3] = arg0.method2953();
            }
        } else if (arg1 == 6) {
            this.field3455 = arg0.method3081();
            this.field3456 = new int[this.field3455];
            this.field3452 = new int[this.field3455];
            for (int var4 = 0; var4 < this.field3455; var4++) {
                this.field3456[var4] = arg0.method2996();
                this.field3452[var4] = arg0.method2996();
            }
        }
    }
}

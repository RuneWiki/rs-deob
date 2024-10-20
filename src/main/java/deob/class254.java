package deob;

@ObfuscatedName("im")
public class class254 extends class195 {

    @ObfuscatedName("im.k")
    public static class190 field3401 = new class190(64);

    @ObfuscatedName("im.e")
    public char field3410;

    @ObfuscatedName("im.p")
    public char field3403;

    @ObfuscatedName("im.q")
    public String field3402 = "null";

    @ObfuscatedName("im.s")
    public int field3405;

    @ObfuscatedName("im.r")
    public int field3400 = 0;

    @ObfuscatedName("im.g")
    public int[] field3407;

    @ObfuscatedName("im.v")
    public int[] field3404;

    @ObfuscatedName("im.t")
    public String[] field3409;

    @ObfuscatedName("im.d(Lfg;S)V")
    public void method4217(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4214(arg0, var2);
        }
    }

    @ObfuscatedName("im.k(Lfg;II)V")
    public void method4214(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3410 = (char) arg0.method2955();
        } else if (arg1 == 2) {
            this.field3403 = (char) arg0.method2955();
        } else if (arg1 == 3) {
            this.field3402 = arg0.method2964();
        } else if (arg1 == 4) {
            this.field3405 = arg0.method2960();
        } else if (arg1 == 5) {
            this.field3400 = arg0.method3035();
            this.field3407 = new int[this.field3400];
            this.field3409 = new String[this.field3400];
            for (int var3 = 0; var3 < this.field3400; var3++) {
                this.field3407[var3] = arg0.method2960();
                this.field3409[var3] = arg0.method2964();
            }
        } else if (arg1 == 6) {
            this.field3400 = arg0.method3035();
            this.field3407 = new int[this.field3400];
            this.field3404 = new int[this.field3400];
            for (int var4 = 0; var4 < this.field3400; var4++) {
                this.field3407[var4] = arg0.method2960();
                this.field3404[var4] = arg0.method2960();
            }
        }
    }
}

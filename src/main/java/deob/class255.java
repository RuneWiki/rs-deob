package deob;

@ObfuscatedName("ip")
public class class255 extends class196 {

    @ObfuscatedName("ip.n")
    public static class191 field3393 = new class191(64);

    @ObfuscatedName("ip.g")
    public char field3392;

    @ObfuscatedName("ip.y")
    public char field3395;

    @ObfuscatedName("ip.w")
    public String field3398 = "null";

    @ObfuscatedName("ip.k")
    public int field3399;

    @ObfuscatedName("ip.v")
    public int field3397 = 0;

    @ObfuscatedName("ip.z")
    public int[] field3396;

    @ObfuscatedName("ip.r")
    public int[] field3400;

    @ObfuscatedName("ip.u")
    public String[] field3401;

    @ObfuscatedName("ip.e(Lfh;B)V")
    public void method4173(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4174(arg0, var2);
        }
    }

    @ObfuscatedName("ip.n(Lfh;II)V")
    public void method4174(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3392 = (char) arg0.method2928();
        } else if (arg1 == 2) {
            this.field3395 = (char) arg0.method2928();
        } else if (arg1 == 3) {
            this.field3398 = arg0.method3113();
        } else if (arg1 == 4) {
            this.field3399 = arg0.method2933();
        } else if (arg1 == 5) {
            this.field3397 = arg0.method3091();
            this.field3396 = new int[this.field3397];
            this.field3401 = new String[this.field3397];
            for (int var3 = 0; var3 < this.field3397; var3++) {
                this.field3396[var3] = arg0.method2933();
                this.field3401[var3] = arg0.method3113();
            }
        } else if (arg1 == 6) {
            this.field3397 = arg0.method3091();
            this.field3396 = new int[this.field3397];
            this.field3400 = new int[this.field3397];
            for (int var4 = 0; var4 < this.field3397; var4++) {
                this.field3396[var4] = arg0.method2933();
                this.field3400[var4] = arg0.method2933();
            }
        }
    }
}

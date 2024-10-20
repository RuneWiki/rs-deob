package deob;

@ObfuscatedName("ie")
public class class254 extends class195 {

    @ObfuscatedName("ie.h")
    public static class190 field3394 = new class190(64);

    @ObfuscatedName("ie.u")
    public char field3396;

    @ObfuscatedName("ie.q")
    public char field3397;

    @ObfuscatedName("ie.g")
    public String field3400 = "null";

    @ObfuscatedName("ie.v")
    public int field3399;

    @ObfuscatedName("ie.t")
    public int field3395 = 0;

    @ObfuscatedName("ie.p")
    public int[] field3398;

    @ObfuscatedName("ie.l")
    public int[] field3402;

    @ObfuscatedName("ie.a")
    public String[] field3403;

    @ObfuscatedName("f.i(Liy;I)V")
    public static void method158(class236 arg0) {
        Statics.field3401 = arg0;
    }

    @ObfuscatedName("ie.h(Lfv;I)V")
    public void method4174(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4186(arg0, var2);
        }
    }

    @ObfuscatedName("ie.u(Lfv;II)V")
    public void method4186(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3396 = (char) arg0.method2930();
        } else if (arg1 == 2) {
            this.field3397 = (char) arg0.method2930();
        } else if (arg1 == 3) {
            this.field3400 = arg0.method2938();
        } else if (arg1 == 4) {
            this.field3399 = arg0.method2927();
        } else if (arg1 == 5) {
            this.field3395 = arg0.method2932();
            this.field3398 = new int[this.field3395];
            this.field3403 = new String[this.field3395];
            for (int var3 = 0; var3 < this.field3395; var3++) {
                this.field3398[var3] = arg0.method2927();
                this.field3403[var3] = arg0.method2938();
            }
        } else if (arg1 == 6) {
            this.field3395 = arg0.method2932();
            this.field3398 = new int[this.field3395];
            this.field3402 = new int[this.field3395];
            for (int var4 = 0; var4 < this.field3395; var4++) {
                this.field3398[var4] = arg0.method2927();
                this.field3402[var4] = arg0.method2927();
            }
        }
    }
}

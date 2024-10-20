package deob;

@ObfuscatedName("il")
public class class254 extends class195 {

    @ObfuscatedName("il.w")
    public static class190 field3416 = new class190(64);

    @ObfuscatedName("il.a")
    public char field3412;

    @ObfuscatedName("il.t")
    public char field3413;

    @ObfuscatedName("il.s")
    public String field3414 = "null";

    @ObfuscatedName("il.r")
    public int field3415;

    @ObfuscatedName("il.v")
    public int field3411 = 0;

    @ObfuscatedName("il.y")
    public int[] field3417;

    @ObfuscatedName("il.j")
    public int[] field3419;

    @ObfuscatedName("il.k")
    public String[] field3418;

    @ObfuscatedName("fl.i(Liq;B)V")
    public static void method3081(class236 arg0) {
        Statics.field3410 = arg0;
    }

    @ObfuscatedName("il.w(Lfp;B)V")
    public void method4114(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4115(arg0, var2);
        }
    }

    @ObfuscatedName("il.a(Lfp;II)V")
    public void method4115(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3412 = (char) arg0.method3061();
        } else if (arg1 == 2) {
            this.field3413 = (char) arg0.method3061();
        } else if (arg1 == 3) {
            this.field3414 = arg0.method2884();
        } else if (arg1 == 4) {
            this.field3415 = arg0.method2885();
        } else if (arg1 == 5) {
            this.field3411 = arg0.method2882();
            this.field3417 = new int[this.field3411];
            this.field3418 = new String[this.field3411];
            for (int var3 = 0; var3 < this.field3411; var3++) {
                this.field3417[var3] = arg0.method2885();
                this.field3418[var3] = arg0.method2884();
            }
        } else if (arg1 == 6) {
            this.field3411 = arg0.method2882();
            this.field3417 = new int[this.field3411];
            this.field3419 = new int[this.field3411];
            for (int var4 = 0; var4 < this.field3411; var4++) {
                this.field3417[var4] = arg0.method2885();
                this.field3419[var4] = arg0.method2885();
            }
        }
    }
}

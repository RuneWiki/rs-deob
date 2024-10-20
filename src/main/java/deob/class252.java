package deob;

@ObfuscatedName("ik")
public class class252 extends class183 {

    @ObfuscatedName("ik.i")
    public static class155 field3283 = new class155(64);

    @ObfuscatedName("ik.y")
    public char field3285;

    @ObfuscatedName("ik.w")
    public char field3284;

    @ObfuscatedName("ik.p")
    public String field3282 = class225.field2800;

    @ObfuscatedName("ik.b")
    public int field3286;

    @ObfuscatedName("ik.e")
    public int field3288 = 0;

    @ObfuscatedName("ik.x")
    public int[] field3287;

    @ObfuscatedName("ik.a")
    public int[] field3289;

    @ObfuscatedName("ik.d")
    public String[] field3290;

    @ObfuscatedName("he.f(Lhz;B)V")
    public static void method3585(class234 arg0) {
        Statics.field3628 = arg0;
    }

    @ObfuscatedName("be.i(IB)Lik;")
    public static class252 method1620(int arg0) {
        class252 var1 = (class252) field3283.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3628.method3752(8, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4167(new class300(var2));
        }
        field3283.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.y(Lkq;I)V")
    public void method4167(class300 arg0) {
        while (true) {
            int var2 = arg0.method5110();
            if (var2 == 0) {
                return;
            }
            this.method4173(arg0, var2);
        }
    }

    @ObfuscatedName("ik.w(Lkq;II)V")
    public void method4173(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3285 = (char) arg0.method5110();
        } else if (arg1 == 2) {
            this.field3284 = (char) arg0.method5110();
        } else if (arg1 == 3) {
            this.field3282 = arg0.method5119();
        } else if (arg1 == 4) {
            this.field3286 = arg0.method5192();
        } else if (arg1 == 5) {
            this.field3288 = arg0.method5112();
            this.field3287 = new int[this.field3288];
            this.field3290 = new String[this.field3288];
            for (int var3 = 0; var3 < this.field3288; var3++) {
                this.field3287[var3] = arg0.method5192();
                this.field3290[var3] = arg0.method5119();
            }
        } else if (arg1 == 6) {
            this.field3288 = arg0.method5112();
            this.field3287 = new int[this.field3288];
            this.field3289 = new int[this.field3288];
            for (int var4 = 0; var4 < this.field3288; var4++) {
                this.field3287[var4] = arg0.method5192();
                this.field3289[var4] = arg0.method5192();
            }
        }
    }

    @ObfuscatedName("ik.p(I)I")
    public int method4169() {
        return this.field3288;
    }
}

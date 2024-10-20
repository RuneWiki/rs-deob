package deob;

@ObfuscatedName("ji")
public class class262 extends class185 {

    @ObfuscatedName("ji.m")
    public static class155 field3313 = new class155(64);

    @ObfuscatedName("ji.k")
    public char field3319;

    @ObfuscatedName("ji.d")
    public char field3315;

    @ObfuscatedName("ji.w")
    public String field3316 = class234.field2765;

    @ObfuscatedName("ji.v")
    public int field3317;

    @ObfuscatedName("ji.q")
    public int field3318 = 0;

    @ObfuscatedName("ji.z")
    public int[] field3321;

    @ObfuscatedName("ji.t")
    public int[] field3312;

    @ObfuscatedName("ji.e")
    public String[] field3314;

    @ObfuscatedName("bq.x(Liy;I)V")
    public static void method1050(class244 arg0) {
        Statics.field3320 = arg0;
    }

    @ObfuscatedName("be.m(IB)Lji;")
    public static class262 method811(int arg0) {
        class262 var1 = (class262) field3313.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3320.method3869(8, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4219(new class310(var2));
        }
        field3313.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ji.k(Lkb;I)V")
    public void method4219(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4231(arg0, var2);
        }
    }

    @ObfuscatedName("ji.d(Lkb;II)V")
    public void method4231(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3319 = (char) arg0.method5137();
        } else if (arg1 == 2) {
            this.field3315 = (char) arg0.method5137();
        } else if (arg1 == 3) {
            this.field3316 = arg0.method5257();
        } else if (arg1 == 4) {
            this.field3317 = arg0.method5142();
        } else if (arg1 == 5) {
            this.field3318 = arg0.method5139();
            this.field3321 = new int[this.field3318];
            this.field3314 = new String[this.field3318];
            for (int var3 = 0; var3 < this.field3318; var3++) {
                this.field3321[var3] = arg0.method5142();
                this.field3314[var3] = arg0.method5257();
            }
        } else if (arg1 == 6) {
            this.field3318 = arg0.method5139();
            this.field3321 = new int[this.field3318];
            this.field3312 = new int[this.field3318];
            for (int var4 = 0; var4 < this.field3318; var4++) {
                this.field3321[var4] = arg0.method5142();
                this.field3312[var4] = arg0.method5142();
            }
        }
    }

    @ObfuscatedName("ji.w(I)I")
    public int method4221() {
        return this.field3318;
    }
}

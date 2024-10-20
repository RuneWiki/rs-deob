package deob;

@ObfuscatedName("jz")
public class class265 extends class206 {

    @ObfuscatedName("jz.i")
    public static class201 field3460 = new class201(64);

    @ObfuscatedName("jz.w")
    public char field3461;

    @ObfuscatedName("jz.s")
    public char field3462;

    @ObfuscatedName("jz.j")
    public String field3465 = "null";

    @ObfuscatedName("jz.a")
    public int field3459;

    @ObfuscatedName("jz.t")
    public int field3466 = 0;

    @ObfuscatedName("jz.r")
    public int[] field3464;

    @ObfuscatedName("jz.m")
    public int[] field3463;

    @ObfuscatedName("jz.h")
    public String[] field3468;

    @ObfuscatedName("cd.p(IB)Ljz;")
    public static class265 method1861(int arg0) {
        class265 var1 = (class265) field3460.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3467.method4032(8, arg0);
        class265 var3 = new class265();
        if (var2 != null) {
            var3.method4380(new class185(var2));
        }
        field3460.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.i(Lgj;I)V")
    public void method4380(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4377(arg0, var2);
        }
    }

    @ObfuscatedName("jz.w(Lgj;II)V")
    public void method4377(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3461 = (char) arg0.method3197();
        } else if (arg1 == 2) {
            this.field3462 = (char) arg0.method3197();
        } else if (arg1 == 3) {
            this.field3465 = arg0.method3131();
        } else if (arg1 == 4) {
            this.field3459 = arg0.method3127();
        } else if (arg1 == 5) {
            this.field3466 = arg0.method3124();
            this.field3464 = new int[this.field3466];
            this.field3468 = new String[this.field3466];
            for (int var3 = 0; var3 < this.field3466; var3++) {
                this.field3464[var3] = arg0.method3127();
                this.field3468[var3] = arg0.method3131();
            }
        } else if (arg1 == 6) {
            this.field3466 = arg0.method3124();
            this.field3464 = new int[this.field3466];
            this.field3463 = new int[this.field3466];
            for (int var4 = 0; var4 < this.field3466; var4++) {
                this.field3464[var4] = arg0.method3127();
                this.field3463[var4] = arg0.method3127();
            }
        }
    }

    @ObfuscatedName("jz.s(I)I")
    public int method4378() {
        return this.field3466;
    }
}

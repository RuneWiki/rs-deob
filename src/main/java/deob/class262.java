package deob;

@ObfuscatedName("jj")
public class class262 extends class209 {

    @ObfuscatedName("jj.q")
    public static class203 field3324 = new class203(64);

    @ObfuscatedName("jj.m")
    public int field3321 = 0;

    @ObfuscatedName("jj.j")
    public int field3323;

    @ObfuscatedName("jj.g")
    public int field3322;

    @ObfuscatedName("jj.i")
    public int field3325;

    @ObfuscatedName("jj.h")
    public int field3326;

    @ObfuscatedName("w.c(Lih;B)V")
    public static void method202(class250 arg0) {
        Statics.field3320 = arg0;
    }

    @ObfuscatedName("z.q(IB)Ljj;")
    public static class262 method296(int arg0) {
        class262 var1 = (class262) field3324.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3320.method4210(1, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4490(new class185(var2), arg0);
        }
        var3.method4499();
        field3324.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.m(B)V")
    public void method4499() {
        this.method4488(this.field3321);
    }

    @ObfuscatedName("jj.j(Lgg;IB)V")
    public void method4490(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3243();
            if (var3 == 0) {
                return;
            }
            this.method4491(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jj.g(Lgg;III)V")
    public void method4491(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3321 = arg0.method3247();
        }
    }

    @ObfuscatedName("jj.i(II)V")
    public void method4488(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field3322 = (int) (var14 * 256.0D);
        this.field3325 = (int) (var16 * 256.0D);
        if (this.field3322 < 0) {
            this.field3322 = 0;
        } else if (this.field3322 > 255) {
            this.field3322 = 255;
        }
        if (this.field3325 < 0) {
            this.field3325 = 0;
        } else if (this.field3325 > 255) {
            this.field3325 = 255;
        }
        if (var16 > 0.5D) {
            this.field3326 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3326 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3326 < 1) {
            this.field3326 = 1;
        }
        this.field3323 = (int) ((double) this.field3326 * var18);
    }

    @ObfuscatedName("ii.h(B)V")
    public static void method4172() {
        field3324.method3647();
    }
}

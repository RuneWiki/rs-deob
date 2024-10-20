package deob;

@ObfuscatedName("ix")
public class class253 extends class202 {

    @ObfuscatedName("ix.r")
    public static class197 field3374 = new class197(64);

    @ObfuscatedName("ix.g")
    public static class197 field3377 = new class197(30);

    @ObfuscatedName("ix.x")
    public int field3378;

    @ObfuscatedName("ix.f")
    public int field3375;

    @ObfuscatedName("ix.u")
    public int field3388 = -1;

    @ObfuscatedName("ix.t")
    public short[] field3381;

    @ObfuscatedName("ix.k")
    public short[] field3387;

    @ObfuscatedName("ix.n")
    public short[] field3383;

    @ObfuscatedName("ix.d")
    public short[] field3384;

    @ObfuscatedName("ix.o")
    public int field3385 = 128;

    @ObfuscatedName("ix.a")
    public int field3376 = 128;

    @ObfuscatedName("ix.q")
    public int field3380 = 0;

    @ObfuscatedName("ix.j")
    public int field3382 = 0;

    @ObfuscatedName("ix.m")
    public int field3389 = 0;

    @ObfuscatedName("is.b(II)Lix;")
    public static class253 method3933(int arg0) {
        class253 var1 = (class253) field3374.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3379.method3887(13, arg0);
        class253 var3 = new class253();
        var3.field3378 = arg0;
        if (var2 != null) {
            var3.method4022(new class181(var2));
        }
        field3374.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.s(Lfs;B)V")
    public void method4022(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4017(arg0, var2);
        }
    }

    @ObfuscatedName("ix.r(Lfs;II)V")
    public void method4017(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3375 = arg0.method3081();
        } else if (arg1 == 2) {
            this.field3388 = arg0.method3081();
        } else if (arg1 == 4) {
            this.field3385 = arg0.method3081();
        } else if (arg1 == 5) {
            this.field3376 = arg0.method3081();
        } else if (arg1 == 6) {
            this.field3380 = arg0.method3081();
        } else if (arg1 == 7) {
            this.field3382 = arg0.method2945();
        } else if (arg1 == 8) {
            this.field3389 = arg0.method2945();
        } else if (arg1 == 40) {
            int var3 = arg0.method2945();
            this.field3381 = new short[var3];
            this.field3387 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3381[var4] = (short) arg0.method3081();
                this.field3387[var4] = (short) arg0.method3081();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2945();
            this.field3383 = new short[var5];
            this.field3384 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3383[var6] = (short) arg0.method3081();
                this.field3384[var6] = (short) arg0.method3081();
            }
        }
    }

    @ObfuscatedName("ix.g(IB)Lev;")
    public final class133 method4018(int arg0) {
        class133 var2 = (class133) field3377.method3330((long) this.field3378);
        if (var2 == null) {
            class127 var3 = class127.method2220(Statics.field3386, this.field3375, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3381 != null) {
                for (int var4 = 0; var4 < this.field3381.length; var4++) {
                    var3.method2232(this.field3381[var4], this.field3387[var4]);
                }
            }
            if (this.field3383 != null) {
                for (int var5 = 0; var5 < this.field3383.length; var5++) {
                    var3.method2233(this.field3383[var5], this.field3384[var5]);
                }
            }
            var2 = var3.method2240(this.field3382 + 64, this.field3389 + 850, -30, -50, -30);
            field3377.method3332(var2, (long) this.field3378);
        }
        class133 var6;
        if (this.field3388 == -1 || arg0 == -1) {
            var6 = var2.method2313(true);
        } else {
            var6 = class268.method1560(this.field3388).method4398(var2, arg0);
        }
        if (this.field3385 != 128 || this.field3376 != 128) {
            var6.method2306(this.field3385, this.field3376, this.field3385);
        }
        if (this.field3380 != 0) {
            if (this.field3380 == 90) {
                var6.method2319();
            }
            if (this.field3380 == 180) {
                var6.method2319();
                var6.method2319();
            }
            if (this.field3380 == 270) {
                var6.method2319();
                var6.method2319();
                var6.method2319();
            }
        }
        return var6;
    }
}

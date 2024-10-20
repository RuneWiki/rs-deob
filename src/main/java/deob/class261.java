package deob;

@ObfuscatedName("ji")
public class class261 extends class209 {

    @ObfuscatedName("ji.m")
    public static class203 field3304 = new class203(64);

    @ObfuscatedName("ji.j")
    public static class203 field3305 = new class203(30);

    @ObfuscatedName("ji.g")
    public int field3306;

    @ObfuscatedName("ji.i")
    public int field3307;

    @ObfuscatedName("ji.h")
    public int field3308 = -1;

    @ObfuscatedName("ji.l")
    public short[] field3302;

    @ObfuscatedName("ji.d")
    public short[] field3310;

    @ObfuscatedName("ji.o")
    public short[] field3311;

    @ObfuscatedName("ji.s")
    public short[] field3316;

    @ObfuscatedName("ji.k")
    public int field3319 = 128;

    @ObfuscatedName("ji.v")
    public int field3314 = 128;

    @ObfuscatedName("ji.p")
    public int field3313 = 0;

    @ObfuscatedName("ji.n")
    public int field3315 = 0;

    @ObfuscatedName("ji.t")
    public int field3317 = 0;

    @ObfuscatedName("ke.c(Lih;Lih;I)V")
    public static void method5064(class250 arg0, class250 arg1) {
        Statics.field3318 = arg0;
        Statics.field3303 = arg1;
    }

    @ObfuscatedName("j.q(II)Lji;")
    public static class261 method34(int arg0) {
        class261 var1 = (class261) field3304.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3318.method4210(13, arg0);
        class261 var3 = new class261();
        var3.field3306 = arg0;
        if (var2 != null) {
            var3.method4475(new class185(var2));
        }
        field3304.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ji.m(Lgg;I)V")
    public void method4475(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4476(arg0, var2);
        }
    }

    @ObfuscatedName("ji.j(Lgg;II)V")
    public void method4476(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3307 = arg0.method3245();
        } else if (arg1 == 2) {
            this.field3308 = arg0.method3245();
        } else if (arg1 == 4) {
            this.field3319 = arg0.method3245();
        } else if (arg1 == 5) {
            this.field3314 = arg0.method3245();
        } else if (arg1 == 6) {
            this.field3313 = arg0.method3245();
        } else if (arg1 == 7) {
            this.field3315 = arg0.method3243();
        } else if (arg1 == 8) {
            this.field3317 = arg0.method3243();
        } else if (arg1 == 40) {
            int var3 = arg0.method3243();
            this.field3302 = new short[var3];
            this.field3310 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3302[var4] = (short) arg0.method3245();
                this.field3310[var4] = (short) arg0.method3245();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3243();
            this.field3311 = new short[var5];
            this.field3316 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3311[var6] = (short) arg0.method3245();
                this.field3316[var6] = (short) arg0.method3245();
            }
        }
    }

    @ObfuscatedName("ji.g(IB)Ldx;")
    public final class122 method4477(int arg0) {
        class122 var2 = (class122) field3305.method3654((long) this.field3306);
        if (var2 == null) {
            class116 var3 = class116.method2376(Statics.field3303, this.field3307, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3302 != null) {
                for (int var4 = 0; var4 < this.field3302.length; var4++) {
                    var3.method2330(this.field3302[var4], this.field3310[var4]);
                }
            }
            if (this.field3311 != null) {
                for (int var5 = 0; var5 < this.field3311.length; var5++) {
                    var3.method2331(this.field3311[var5], this.field3316[var5]);
                }
            }
            var2 = var3.method2338(this.field3315 + 64, this.field3317 + 850, -30, -50, -30);
            field3305.method3646(var2, (long) this.field3306);
        }
        class122 var6;
        if (this.field3308 == -1 || arg0 == -1) {
            var6 = var2.method2417(true);
        } else {
            var6 = class276.method2826(this.field3308).method4854(var2, arg0);
        }
        if (this.field3319 != 128 || this.field3314 != 128) {
            var6.method2483(this.field3319, this.field3314, this.field3319);
        }
        if (this.field3313 != 0) {
            if (this.field3313 == 90) {
                var6.method2427();
            }
            if (this.field3313 == 180) {
                var6.method2427();
                var6.method2427();
            }
            if (this.field3313 == 270) {
                var6.method2427();
                var6.method2427();
                var6.method2427();
            }
        }
        return var6;
    }
}

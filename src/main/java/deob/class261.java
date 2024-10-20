package deob;

@ObfuscatedName("jm")
public class class261 extends class209 {

    @ObfuscatedName("jm.n")
    public static class203 field3319 = new class203(64);

    @ObfuscatedName("jm.u")
    public static class203 field3324 = new class203(30);

    @ObfuscatedName("jm.i")
    public int field3318;

    @ObfuscatedName("jm.r")
    public int field3322;

    @ObfuscatedName("jm.j")
    public int field3323 = -1;

    @ObfuscatedName("jm.p")
    public short[] field3321;

    @ObfuscatedName("jm.e")
    public short[] field3325;

    @ObfuscatedName("jm.s")
    public short[] field3317;

    @ObfuscatedName("jm.v")
    public short[] field3327;

    @ObfuscatedName("jm.k")
    public int field3332 = 128;

    @ObfuscatedName("jm.o")
    public int field3329 = 128;

    @ObfuscatedName("jm.q")
    public int field3330 = 0;

    @ObfuscatedName("jm.l")
    public int field3331 = 0;

    @ObfuscatedName("jm.f")
    public int field3320 = 0;

    @ObfuscatedName("co.y(II)Ljm;")
    public static class261 method1754(int arg0) {
        class261 var1 = (class261) field3319.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3328.method4263(13, arg0);
        class261 var3 = new class261();
        var3.field3318 = arg0;
        if (var2 != null) {
            var3.method4492(new class185(var2));
        }
        field3319.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.c(Lge;I)V")
    public void method4492(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4493(arg0, var2);
        }
    }

    @ObfuscatedName("jm.n(Lge;IS)V")
    public void method4493(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3322 = arg0.method3280();
        } else if (arg1 == 2) {
            this.field3323 = arg0.method3280();
        } else if (arg1 == 4) {
            this.field3332 = arg0.method3280();
        } else if (arg1 == 5) {
            this.field3329 = arg0.method3280();
        } else if (arg1 == 6) {
            this.field3330 = arg0.method3280();
        } else if (arg1 == 7) {
            this.field3331 = arg0.method3299();
        } else if (arg1 == 8) {
            this.field3320 = arg0.method3299();
        } else if (arg1 == 40) {
            int var3 = arg0.method3299();
            this.field3321 = new short[var3];
            this.field3325 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3321[var4] = (short) arg0.method3280();
                this.field3325[var4] = (short) arg0.method3280();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3299();
            this.field3317 = new short[var5];
            this.field3327 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3317[var6] = (short) arg0.method3280();
                this.field3327[var6] = (short) arg0.method3280();
            }
        }
    }

    @ObfuscatedName("jm.u(IB)Lde;")
    public final class122 method4499(int arg0) {
        class122 var2 = (class122) field3324.method3685((long) this.field3318);
        if (var2 == null) {
            class116 var3 = class116.method2378(Statics.field3326, this.field3322, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3321 != null) {
                for (int var4 = 0; var4 < this.field3321.length; var4++) {
                    var3.method2386(this.field3321[var4], this.field3325[var4]);
                }
            }
            if (this.field3317 != null) {
                for (int var5 = 0; var5 < this.field3317.length; var5++) {
                    var3.method2392(this.field3317[var5], this.field3327[var5]);
                }
            }
            var2 = var3.method2399(this.field3331 + 64, this.field3320 + 850, -30, -50, -30);
            field3324.method3687(var2, (long) this.field3318);
        }
        class122 var6;
        if (this.field3323 == -1 || arg0 == -1) {
            var6 = var2.method2477(true);
        } else {
            var6 = class276.method3241(this.field3323).method4865(var2, arg0);
        }
        if (this.field3332 != 128 || this.field3329 != 128) {
            var6.method2485(this.field3332, this.field3329, this.field3332);
        }
        if (this.field3330 != 0) {
            if (this.field3330 == 90) {
                var6.method2537();
            }
            if (this.field3330 == 180) {
                var6.method2537();
                var6.method2537();
            }
            if (this.field3330 == 270) {
                var6.method2537();
                var6.method2537();
                var6.method2537();
            }
        }
        return var6;
    }
}

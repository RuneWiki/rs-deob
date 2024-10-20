package deob;

@ObfuscatedName("jg")
public class class273 extends class219 {

    @ObfuscatedName("jg.t")
    public static class213 field3494 = new class213(64);

    @ObfuscatedName("jg.d")
    public static class213 field3486 = new class213(30);

    @ObfuscatedName("jg.h")
    public int field3487;

    @ObfuscatedName("jg.m")
    public int field3488;

    @ObfuscatedName("jg.z")
    public int field3498 = -1;

    @ObfuscatedName("jg.i")
    public short[] field3489;

    @ObfuscatedName("jg.u")
    public short[] field3491;

    @ObfuscatedName("jg.x")
    public short[] field3492;

    @ObfuscatedName("jg.y")
    public short[] field3493;

    @ObfuscatedName("jg.a")
    public int field3484 = 128;

    @ObfuscatedName("jg.w")
    public int field3495 = 128;

    @ObfuscatedName("jg.n")
    public int field3496 = 0;

    @ObfuscatedName("jg.l")
    public int field3497 = 0;

    @ObfuscatedName("jg.s")
    public int field3490 = 0;

    @ObfuscatedName("ab.o(Ljf;Ljf;I)V")
    public static void method199(class262 arg0, class262 arg1) {
        Statics.field3485 = arg0;
        Statics.field3499 = arg1;
    }

    @ObfuscatedName("cu.k(II)Ljg;")
    public static class273 method1734(int arg0) {
        class273 var1 = (class273) field3494.method3601((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3485.method4241(13, arg0);
        class273 var3 = new class273();
        var3.field3487 = arg0;
        if (var2 != null) {
            var3.method4418(new class195(var2));
        }
        field3494.method3603(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.t(Lgc;I)V")
    public void method4418(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4414(arg0, var2);
        }
    }

    @ObfuscatedName("jg.d(Lgc;IS)V")
    public void method4414(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3488 = arg0.method3207();
        } else if (arg1 == 2) {
            this.field3498 = arg0.method3207();
        } else if (arg1 == 4) {
            this.field3484 = arg0.method3207();
        } else if (arg1 == 5) {
            this.field3495 = arg0.method3207();
        } else if (arg1 == 6) {
            this.field3496 = arg0.method3207();
        } else if (arg1 == 7) {
            this.field3497 = arg0.method3205();
        } else if (arg1 == 8) {
            this.field3490 = arg0.method3205();
        } else if (arg1 == 40) {
            int var3 = arg0.method3205();
            this.field3489 = new short[var3];
            this.field3491 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3489[var4] = (short) arg0.method3207();
                this.field3491[var4] = (short) arg0.method3207();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3205();
            this.field3492 = new short[var5];
            this.field3493 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3492[var6] = (short) arg0.method3207();
                this.field3493[var6] = (short) arg0.method3207();
            }
        }
    }

    @ObfuscatedName("jg.h(II)Lei;")
    public final class132 method4416(int arg0) {
        class132 var2 = (class132) field3486.method3601((long) this.field3487);
        if (var2 == null) {
            class126 var3 = class126.method2418(Statics.field3499, this.field3488, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3489 != null) {
                for (int var4 = 0; var4 < this.field3489.length; var4++) {
                    var3.method2385(this.field3489[var4], this.field3491[var4]);
                }
            }
            if (this.field3492 != null) {
                for (int var5 = 0; var5 < this.field3492.length; var5++) {
                    var3.method2386(this.field3492[var5], this.field3493[var5]);
                }
            }
            var2 = var3.method2393(this.field3497 + 64, this.field3490 + 850, -30, -50, -30);
            field3486.method3603(var2, (long) this.field3487);
        }
        class132 var6;
        if (this.field3498 == -1 || arg0 == -1) {
            var6 = var2.method2478(true);
        } else {
            var6 = class288.method1535(this.field3498).method4790(var2, arg0);
        }
        if (this.field3484 != 128 || this.field3495 != 128) {
            var6.method2476(this.field3484, this.field3495, this.field3484);
        }
        if (this.field3496 != 0) {
            if (this.field3496 == 90) {
                var6.method2471();
            }
            if (this.field3496 == 180) {
                var6.method2471();
                var6.method2471();
            }
            if (this.field3496 == 270) {
                var6.method2471();
                var6.method2471();
                var6.method2471();
            }
        }
        return var6;
    }

    @ObfuscatedName("ck.m(I)V")
    public static void method1731() {
        field3494.method3604();
        field3486.method3604();
    }
}

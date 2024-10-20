package deob;

@ObfuscatedName("jg")
public class class273 extends class219 {

    @ObfuscatedName("jg.o")
    public static class213 field3486 = new class213(64);

    @ObfuscatedName("jg.j")
    public static class213 field3487 = new class213(30);

    @ObfuscatedName("jg.k")
    public int field3494;

    @ObfuscatedName("jg.x")
    public int field3489;

    @ObfuscatedName("jg.z")
    public int field3495 = -1;

    @ObfuscatedName("jg.p")
    public short[] field3491;

    @ObfuscatedName("jg.w")
    public short[] field3492;

    @ObfuscatedName("jg.r")
    public short[] field3493;

    @ObfuscatedName("jg.d")
    public short[] field3488;

    @ObfuscatedName("jg.a")
    public int field3498 = 128;

    @ObfuscatedName("jg.e")
    public int field3496 = 128;

    @ObfuscatedName("jg.f")
    public int field3497 = 0;

    @ObfuscatedName("jg.l")
    public int field3485 = 0;

    @ObfuscatedName("jg.m")
    public int field3499 = 0;

    @ObfuscatedName("bs.c(Ljm;Ljm;S)V")
    public static void method993(class262 arg0, class262 arg1) {
        Statics.field3490 = arg0;
        Statics.field2062 = arg1;
    }

    @ObfuscatedName("id.i(II)Ljg;")
    public static class273 method4166(int arg0) {
        class273 var1 = (class273) field3486.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3490.method4190(13, arg0);
        class273 var3 = new class273();
        var3.field3494 = arg0;
        if (var2 != null) {
            var3.method4432(new class195(var2));
        }
        field3486.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.o(Lgp;B)V")
    public void method4432(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4421(arg0, var2);
        }
    }

    @ObfuscatedName("jg.j(Lgp;II)V")
    public void method4421(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3489 = arg0.method3218();
        } else if (arg1 == 2) {
            this.field3495 = arg0.method3218();
        } else if (arg1 == 4) {
            this.field3498 = arg0.method3218();
        } else if (arg1 == 5) {
            this.field3496 = arg0.method3218();
        } else if (arg1 == 6) {
            this.field3497 = arg0.method3218();
        } else if (arg1 == 7) {
            this.field3485 = arg0.method3429();
        } else if (arg1 == 8) {
            this.field3499 = arg0.method3429();
        } else if (arg1 == 40) {
            int var3 = arg0.method3429();
            this.field3491 = new short[var3];
            this.field3492 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3491[var4] = (short) arg0.method3218();
                this.field3492[var4] = (short) arg0.method3218();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3429();
            this.field3493 = new short[var5];
            this.field3488 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3493[var6] = (short) arg0.method3218();
                this.field3488[var6] = (short) arg0.method3218();
            }
        }
    }

    @ObfuscatedName("jg.k(II)Led;")
    public final class132 method4422(int arg0) {
        class132 var2 = (class132) field3487.method3625((long) this.field3494);
        if (var2 == null) {
            class126 var3 = class126.method2371(Statics.field2062, this.field3489, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3491 != null) {
                for (int var4 = 0; var4 < this.field3491.length; var4++) {
                    var3.method2383(this.field3491[var4], this.field3492[var4]);
                }
            }
            if (this.field3493 != null) {
                for (int var5 = 0; var5 < this.field3493.length; var5++) {
                    var3.method2448(this.field3493[var5], this.field3488[var5]);
                }
            }
            var2 = var3.method2384(this.field3485 + 64, this.field3499 + 850, -30, -50, -30);
            field3487.method3628(var2, (long) this.field3494);
        }
        class132 var6;
        if (this.field3495 == -1 || arg0 == -1) {
            var6 = var2.method2503(true);
        } else {
            var6 = class288.method3535(this.field3495).method4808(var2, arg0);
        }
        if (this.field3498 != 128 || this.field3496 != 128) {
            var6.method2468(this.field3498, this.field3496, this.field3498);
        }
        if (this.field3497 != 0) {
            if (this.field3497 == 90) {
                var6.method2482();
            }
            if (this.field3497 == 180) {
                var6.method2482();
                var6.method2482();
            }
            if (this.field3497 == 270) {
                var6.method2482();
                var6.method2482();
                var6.method2482();
            }
        }
        return var6;
    }
}

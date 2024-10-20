package deob;

@ObfuscatedName("ix")
public class class253 extends class202 {

    @ObfuscatedName("ix.k")
    public static class197 field3396 = new class197(64);

    @ObfuscatedName("ix.z")
    public static class197 field3397 = new class197(30);

    @ObfuscatedName("ix.v")
    public int field3398;

    @ObfuscatedName("ix.m")
    public int field3399;

    @ObfuscatedName("ix.b")
    public int field3394 = -1;

    @ObfuscatedName("ix.t")
    public short[] field3400;

    @ObfuscatedName("ix.p")
    public short[] field3402;

    @ObfuscatedName("ix.r")
    public short[] field3401;

    @ObfuscatedName("ix.l")
    public short[] field3404;

    @ObfuscatedName("ix.u")
    public int field3403 = 128;

    @ObfuscatedName("ix.n")
    public int field3406 = 128;

    @ObfuscatedName("ix.c")
    public int field3407 = 0;

    @ObfuscatedName("ix.y")
    public int field3408 = 0;

    @ObfuscatedName("ix.j")
    public int field3409 = 0;

    @ObfuscatedName("hv.d(II)Lix;")
    public static class253 method3903(int arg0) {
        class253 var1 = (class253) field3396.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3405.method3935(13, arg0);
        class253 var3 = new class253();
        var3.field3398 = arg0;
        if (var2 != null) {
            var3.method4149(new class181(var2));
        }
        field3396.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.x(Lfr;I)V")
    public void method4149(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4150(arg0, var2);
        }
    }

    @ObfuscatedName("ix.k(Lfr;II)V")
    public void method4150(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3399 = arg0.method3179();
        } else if (arg1 == 2) {
            this.field3394 = arg0.method3179();
        } else if (arg1 == 4) {
            this.field3403 = arg0.method3179();
        } else if (arg1 == 5) {
            this.field3406 = arg0.method3179();
        } else if (arg1 == 6) {
            this.field3407 = arg0.method3179();
        } else if (arg1 == 7) {
            this.field3408 = arg0.method3204();
        } else if (arg1 == 8) {
            this.field3409 = arg0.method3204();
        } else if (arg1 == 40) {
            int var3 = arg0.method3204();
            this.field3400 = new short[var3];
            this.field3402 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3400[var4] = (short) arg0.method3179();
                this.field3402[var4] = (short) arg0.method3179();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3204();
            this.field3401 = new short[var5];
            this.field3404 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3401[var6] = (short) arg0.method3179();
                this.field3404[var6] = (short) arg0.method3179();
            }
        }
    }

    @ObfuscatedName("ix.z(II)Leh;")
    public final class133 method4151(int arg0) {
        class133 var2 = (class133) field3397.method3418((long) this.field3398);
        if (var2 == null) {
            class127 var3 = class127.method2294(Statics.field3395, this.field3399, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3400 != null) {
                for (int var4 = 0; var4 < this.field3400.length; var4++) {
                    var3.method2306(this.field3400[var4], this.field3402[var4]);
                }
            }
            if (this.field3401 != null) {
                for (int var5 = 0; var5 < this.field3401.length; var5++) {
                    var3.method2307(this.field3401[var5], this.field3404[var5]);
                }
            }
            var2 = var3.method2314(this.field3408 + 64, this.field3409 + 850, -30, -50, -30);
            field3397.method3417(var2, (long) this.field3398);
        }
        class133 var6;
        if (this.field3394 == -1 || arg0 == -1) {
            var6 = var2.method2404(true);
        } else {
            var6 = class268.method76(this.field3394).method4537(var2, arg0);
        }
        if (this.field3403 != 128 || this.field3406 != 128) {
            var6.method2410(this.field3403, this.field3406, this.field3403);
        }
        if (this.field3407 != 0) {
            if (this.field3407 == 90) {
                var6.method2414();
            }
            if (this.field3407 == 180) {
                var6.method2414();
                var6.method2414();
            }
            if (this.field3407 == 270) {
                var6.method2414();
                var6.method2414();
                var6.method2414();
            }
        }
        return var6;
    }
}

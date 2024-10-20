package deob;

@ObfuscatedName("ib")
public class class244 extends class176 {

    @ObfuscatedName("ib.e")
    public static class146 field3240 = new class146(64);

    @ObfuscatedName("ib.p")
    public static class146 field3241 = new class146(30);

    @ObfuscatedName("ib.k")
    public int field3242;

    @ObfuscatedName("ib.l")
    public int field3243;

    @ObfuscatedName("ib.b")
    public int field3239 = -1;

    @ObfuscatedName("ib.i")
    public short[] field3245;

    @ObfuscatedName("ib.c")
    public short[] field3244;

    @ObfuscatedName("ib.f")
    public short[] field3247;

    @ObfuscatedName("ib.m")
    public short[] field3246;

    @ObfuscatedName("ib.u")
    public int field3253 = 128;

    @ObfuscatedName("ib.x")
    public int field3250 = 128;

    @ObfuscatedName("ib.r")
    public int field3251 = 0;

    @ObfuscatedName("ib.v")
    public int field3252 = 0;

    @ObfuscatedName("ib.y")
    public int field3254 = 0;

    @ObfuscatedName("gg.q(IB)Lib;")
    public static class244 method3544(int arg0) {
        class244 var1 = (class244) field3240.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3248.method3775(13, arg0);
        class244 var3 = new class244();
        var3.field3242 = arg0;
        if (var2 != null) {
            var3.method4024(new class301(var2));
        }
        field3240.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.w(Lkf;I)V")
    public void method4024(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4027(arg0, var2);
        }
    }

    @ObfuscatedName("ib.e(Lkf;II)V")
    public void method4027(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3243 = arg0.method5069();
        } else if (arg1 == 2) {
            this.field3239 = arg0.method5069();
        } else if (arg1 == 4) {
            this.field3253 = arg0.method5069();
        } else if (arg1 == 5) {
            this.field3250 = arg0.method5069();
        } else if (arg1 == 6) {
            this.field3251 = arg0.method5069();
        } else if (arg1 == 7) {
            this.field3252 = arg0.method5077();
        } else if (arg1 == 8) {
            this.field3254 = arg0.method5077();
        } else if (arg1 == 40) {
            int var3 = arg0.method5077();
            this.field3245 = new short[var3];
            this.field3244 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3245[var4] = (short) arg0.method5069();
                this.field3244[var4] = (short) arg0.method5069();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5077();
            this.field3247 = new short[var5];
            this.field3246 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3247[var6] = (short) arg0.method5069();
                this.field3246[var6] = (short) arg0.method5069();
            }
        }
    }

    @ObfuscatedName("ib.p(II)Ldm;")
    public final class128 method4023(int arg0) {
        class128 var2 = (class128) field3241.method3039((long) this.field3242);
        if (var2 == null) {
            class122 var3 = class122.method2512(Statics.field380, this.field3243, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3245 != null) {
                for (int var4 = 0; var4 < this.field3245.length; var4++) {
                    var3.method2526(this.field3245[var4], this.field3244[var4]);
                }
            }
            if (this.field3247 != null) {
                for (int var5 = 0; var5 < this.field3247.length; var5++) {
                    var3.method2527(this.field3247[var5], this.field3246[var5]);
                }
            }
            var2 = var3.method2545(this.field3252 + 64, this.field3254 + 850, -30, -50, -30);
            field3241.method3041(var2, (long) this.field3242);
        }
        class128 var6;
        if (this.field3239 == -1 || arg0 == -1) {
            var6 = var2.method2603(true);
        } else {
            var6 = class259.method67(this.field3239).method4402(var2, arg0);
        }
        if (this.field3253 != 128 || this.field3250 != 128) {
            var6.method2687(this.field3253, this.field3250, this.field3253);
        }
        if (this.field3251 != 0) {
            if (this.field3251 == 90) {
                var6.method2612();
            }
            if (this.field3251 == 180) {
                var6.method2612();
                var6.method2612();
            }
            if (this.field3251 == 270) {
                var6.method2612();
                var6.method2612();
                var6.method2612();
            }
        }
        return var6;
    }
}

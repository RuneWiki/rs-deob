package deob;

@ObfuscatedName("ib")
public class class259 extends class207 {

    @ObfuscatedName("ib.s")
    public static class201 field3268 = new class201(64);

    @ObfuscatedName("ib.l")
    public static class201 field3266 = new class201(30);

    @ObfuscatedName("ib.u")
    public int field3281;

    @ObfuscatedName("ib.q")
    public int field3269;

    @ObfuscatedName("ib.k")
    public int field3272 = -1;

    @ObfuscatedName("ib.i")
    public short[] field3267;

    @ObfuscatedName("ib.x")
    public short[] field3271;

    @ObfuscatedName("ib.e")
    public short[] field3275;

    @ObfuscatedName("ib.p")
    public short[] field3276;

    @ObfuscatedName("ib.b")
    public int field3277 = 128;

    @ObfuscatedName("ib.n")
    public int field3278 = 128;

    @ObfuscatedName("ib.f")
    public int field3279 = 0;

    @ObfuscatedName("ib.g")
    public int field3274 = 0;

    @ObfuscatedName("ib.m")
    public int field3270 = 0;

    @ObfuscatedName("bq.z(II)Lib;")
    public static class259 method956(int arg0) {
        class259 var1 = (class259) field3268.method3681((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3273.method4247(13, arg0);
        class259 var3 = new class259();
        var3.field3281 = arg0;
        if (var2 != null) {
            var3.method4473(new class183(var2));
        }
        field3268.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.w(Lgk;I)V")
    public void method4473(class183 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4474(arg0, var2);
        }
    }

    @ObfuscatedName("ib.s(Lgk;II)V")
    public void method4474(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3269 = arg0.method3253();
        } else if (arg1 == 2) {
            this.field3272 = arg0.method3253();
        } else if (arg1 == 4) {
            this.field3277 = arg0.method3253();
        } else if (arg1 == 5) {
            this.field3278 = arg0.method3253();
        } else if (arg1 == 6) {
            this.field3279 = arg0.method3253();
        } else if (arg1 == 7) {
            this.field3274 = arg0.method3247();
        } else if (arg1 == 8) {
            this.field3270 = arg0.method3247();
        } else if (arg1 == 40) {
            int var3 = arg0.method3247();
            this.field3267 = new short[var3];
            this.field3271 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3267[var4] = (short) arg0.method3253();
                this.field3271[var4] = (short) arg0.method3253();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3247();
            this.field3275 = new short[var5];
            this.field3276 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3275[var6] = (short) arg0.method3253();
                this.field3276[var6] = (short) arg0.method3253();
            }
        }
    }

    @ObfuscatedName("ib.l(II)Ldc;")
    public final class120 method4475(int arg0) {
        class120 var2 = (class120) field3266.method3681((long) this.field3281);
        if (var2 == null) {
            class114 var3 = class114.method2364(Statics.field3280, this.field3269, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3267 != null) {
                for (int var4 = 0; var4 < this.field3267.length; var4++) {
                    var3.method2377(this.field3267[var4], this.field3271[var4]);
                }
            }
            if (this.field3275 != null) {
                for (int var5 = 0; var5 < this.field3275.length; var5++) {
                    var3.method2378(this.field3275[var5], this.field3276[var5]);
                }
            }
            var2 = var3.method2385(this.field3274 + 64, this.field3270 + 850, -30, -50, -30);
            field3266.method3675(var2, (long) this.field3281);
        }
        class120 var6;
        if (this.field3272 == -1 || arg0 == -1) {
            var6 = var2.method2463(true);
        } else {
            var6 = class274.method26(this.field3272).method4823(var2, arg0);
        }
        if (this.field3277 != 128 || this.field3278 != 128) {
            var6.method2477(this.field3277, this.field3278, this.field3277);
        }
        if (this.field3279 != 0) {
            if (this.field3279 == 90) {
                var6.method2473();
            }
            if (this.field3279 == 180) {
                var6.method2473();
                var6.method2473();
            }
            if (this.field3279 == 270) {
                var6.method2473();
                var6.method2473();
                var6.method2473();
            }
        }
        return var6;
    }
}

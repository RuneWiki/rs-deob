package deob;

@ObfuscatedName("iv")
public class class257 extends class206 {

    @ObfuscatedName("iv.m")
    public static class201 field3407 = new class201(64);

    @ObfuscatedName("iv.h")
    public static class201 field3408 = new class201(30);

    @ObfuscatedName("iv.i")
    public int field3409;

    @ObfuscatedName("iv.w")
    public int field3410;

    @ObfuscatedName("iv.t")
    public int field3405 = -1;

    @ObfuscatedName("iv.d")
    public short[] field3412;

    @ObfuscatedName("iv.z")
    public short[] field3413;

    @ObfuscatedName("iv.k")
    public short[] field3414;

    @ObfuscatedName("iv.c")
    public short[] field3421;

    @ObfuscatedName("iv.o")
    public int field3416 = 128;

    @ObfuscatedName("iv.l")
    public int field3415 = 128;

    @ObfuscatedName("iv.f")
    public int field3418 = 0;

    @ObfuscatedName("iv.q")
    public int field3419 = 0;

    @ObfuscatedName("iv.r")
    public int field3420 = 0;

    @ObfuscatedName("o.s(Lir;Lir;I)V")
    public static void method52(class247 arg0, class247 arg1) {
        Statics.field3417 = arg0;
        Statics.field3406 = arg1;
    }

    @ObfuscatedName("fb.g(II)Liv;")
    public static class257 method3116(int arg0) {
        class257 var1 = (class257) field3407.method3673((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3417.method4231(13, arg0);
        class257 var3 = new class257();
        var3.field3409 = arg0;
        if (var2 != null) {
            var3.method4404(new class185(var2));
        }
        field3407.method3675(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.m(Lgy;B)V")
    public void method4404(class185 arg0) {
        while (true) {
            int var2 = arg0.method3239();
            if (var2 == 0) {
                return;
            }
            this.method4405(arg0, var2);
        }
    }

    @ObfuscatedName("iv.h(Lgy;II)V")
    public void method4405(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3410 = arg0.method3241();
        } else if (arg1 == 2) {
            this.field3405 = arg0.method3241();
        } else if (arg1 == 4) {
            this.field3416 = arg0.method3241();
        } else if (arg1 == 5) {
            this.field3415 = arg0.method3241();
        } else if (arg1 == 6) {
            this.field3418 = arg0.method3241();
        } else if (arg1 == 7) {
            this.field3419 = arg0.method3239();
        } else if (arg1 == 8) {
            this.field3420 = arg0.method3239();
        } else if (arg1 == 40) {
            int var3 = arg0.method3239();
            this.field3412 = new short[var3];
            this.field3413 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3412[var4] = (short) arg0.method3241();
                this.field3413[var4] = (short) arg0.method3241();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3239();
            this.field3414 = new short[var5];
            this.field3421 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3414[var6] = (short) arg0.method3241();
                this.field3421[var6] = (short) arg0.method3241();
            }
        }
    }

    @ObfuscatedName("iv.i(II)Les;")
    public final class131 method4406(int arg0) {
        class131 var2 = (class131) field3408.method3673((long) this.field3409);
        if (var2 == null) {
            class125 var3 = class125.method2428(Statics.field3406, this.field3410, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3412 != null) {
                for (int var4 = 0; var4 < this.field3412.length; var4++) {
                    var3.method2442(this.field3412[var4], this.field3413[var4]);
                }
            }
            if (this.field3414 != null) {
                for (int var5 = 0; var5 < this.field3414.length; var5++) {
                    var3.method2443(this.field3414[var5], this.field3421[var5]);
                }
            }
            var2 = var3.method2450(this.field3419 + 64, this.field3420 + 850, -30, -50, -30);
            field3408.method3675(var2, (long) this.field3409);
        }
        class131 var6;
        if (this.field3405 == -1 || arg0 == -1) {
            var6 = var2.method2544(true);
        } else {
            var6 = class272.method4180(this.field3405).method4750(var2, arg0);
        }
        if (this.field3416 != 128 || this.field3415 != 128) {
            var6.method2584(this.field3416, this.field3415, this.field3416);
        }
        if (this.field3418 != 0) {
            if (this.field3418 == 90) {
                var6.method2534();
            }
            if (this.field3418 == 180) {
                var6.method2534();
                var6.method2534();
            }
            if (this.field3418 == 270) {
                var6.method2534();
                var6.method2534();
                var6.method2534();
            }
        }
        return var6;
    }
}

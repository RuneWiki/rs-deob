package deob;

@ObfuscatedName("jd")
public class class261 extends class209 {

    @ObfuscatedName("jd.w")
    public static class203 field3332 = new class203(64);

    @ObfuscatedName("jd.s")
    public static class203 field3333 = new class203(30);

    @ObfuscatedName("jd.e")
    public int field3341;

    @ObfuscatedName("jd.a")
    public int field3335;

    @ObfuscatedName("jd.c")
    public int field3334 = -1;

    @ObfuscatedName("jd.p")
    public short[] field3331;

    @ObfuscatedName("jd.r")
    public short[] field3338;

    @ObfuscatedName("jd.m")
    public short[] field3339;

    @ObfuscatedName("jd.d")
    public short[] field3340;

    @ObfuscatedName("jd.z")
    public int field3337 = 128;

    @ObfuscatedName("jd.x")
    public int field3342 = 128;

    @ObfuscatedName("jd.v")
    public int field3343 = 0;

    @ObfuscatedName("jd.g")
    public int field3344 = 0;

    @ObfuscatedName("jd.j")
    public int field3336 = 0;

    @ObfuscatedName("da.f(II)Ljd;")
    public static class261 method2403(int arg0) {
        class261 var1 = (class261) field3332.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3346.method4289(13, arg0);
        class261 var3 = new class261();
        var3.field3341 = arg0;
        if (var2 != null) {
            var3.method4531(new class185(var2));
        }
        field3332.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.l(Lgm;I)V")
    public void method4531(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4538(arg0, var2);
        }
    }

    @ObfuscatedName("jd.w(Lgm;II)V")
    public void method4538(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3335 = arg0.method3346();
        } else if (arg1 == 2) {
            this.field3334 = arg0.method3346();
        } else if (arg1 == 4) {
            this.field3337 = arg0.method3346();
        } else if (arg1 == 5) {
            this.field3342 = arg0.method3346();
        } else if (arg1 == 6) {
            this.field3343 = arg0.method3346();
        } else if (arg1 == 7) {
            this.field3344 = arg0.method3344();
        } else if (arg1 == 8) {
            this.field3336 = arg0.method3344();
        } else if (arg1 == 40) {
            int var3 = arg0.method3344();
            this.field3331 = new short[var3];
            this.field3338 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3331[var4] = (short) arg0.method3346();
                this.field3338[var4] = (short) arg0.method3346();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3344();
            this.field3339 = new short[var5];
            this.field3340 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3339[var6] = (short) arg0.method3346();
                this.field3340[var6] = (short) arg0.method3346();
            }
        }
    }

    @ObfuscatedName("jd.s(IB)Lds;")
    public final class122 method4533(int arg0) {
        class122 var2 = (class122) field3333.method3737((long) this.field3341);
        if (var2 == null) {
            class116 var3 = class116.method2435(Statics.field58, this.field3335, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3331 != null) {
                for (int var4 = 0; var4 < this.field3331.length; var4++) {
                    var3.method2447(this.field3331[var4], this.field3338[var4]);
                }
            }
            if (this.field3339 != null) {
                for (int var5 = 0; var5 < this.field3339.length; var5++) {
                    var3.method2448(this.field3339[var5], this.field3340[var5]);
                }
            }
            var2 = var3.method2468(this.field3344 + 64, this.field3336 + 850, -30, -50, -30);
            field3333.method3744(var2, (long) this.field3341);
        }
        class122 var6;
        if (this.field3334 == -1 || arg0 == -1) {
            var6 = var2.method2532(true);
        } else {
            var6 = class276.method3224(this.field3334).method4911(var2, arg0);
        }
        if (this.field3337 != 128 || this.field3342 != 128) {
            var6.method2581(this.field3337, this.field3342, this.field3337);
        }
        if (this.field3343 != 0) {
            if (this.field3343 == 90) {
                var6.method2588();
            }
            if (this.field3343 == 180) {
                var6.method2588();
                var6.method2588();
            }
            if (this.field3343 == 270) {
                var6.method2588();
                var6.method2588();
                var6.method2588();
            }
        }
        return var6;
    }

    @ObfuscatedName("do.e(B)V")
    public static void method2378() {
        field3332.method3740();
        field3333.method3740();
    }
}

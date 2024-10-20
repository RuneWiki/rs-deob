package deob;

@ObfuscatedName("ie")
public class class249 extends class198 {

    @ObfuscatedName("ie.x")
    public static class193 field3343 = new class193(64);

    @ObfuscatedName("ie.k")
    public static class193 field3334 = new class193(30);

    @ObfuscatedName("ie.f")
    public int field3335;

    @ObfuscatedName("ie.i")
    public int field3336;

    @ObfuscatedName("ie.j")
    public int field3345 = -1;

    @ObfuscatedName("ie.m")
    public short[] field3333;

    @ObfuscatedName("ie.u")
    public short[] field3339;

    @ObfuscatedName("ie.r")
    public short[] field3340;

    @ObfuscatedName("ie.v")
    public short[] field3341;

    @ObfuscatedName("ie.h")
    public int field3342 = 128;

    @ObfuscatedName("ie.a")
    public int field3331 = 128;

    @ObfuscatedName("ie.p")
    public int field3338 = 0;

    @ObfuscatedName("ie.q")
    public int field3344 = 0;

    @ObfuscatedName("ie.l")
    public int field3346 = 0;

    @ObfuscatedName("be.w(Liq;Liq;B)V")
    public static void method996(class239 arg0, class239 arg1) {
        Statics.field3347 = arg0;
        Statics.field3332 = arg1;
    }

    @ObfuscatedName("ie.x(Lfi;I)V")
    public void method3938(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method3939(arg0, var2);
        }
    }

    @ObfuscatedName("ie.k(Lfi;II)V")
    public void method3939(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3336 = arg0.method2886();
        } else if (arg1 == 2) {
            this.field3345 = arg0.method2886();
        } else if (arg1 == 4) {
            this.field3342 = arg0.method2886();
        } else if (arg1 == 5) {
            this.field3331 = arg0.method2886();
        } else if (arg1 == 6) {
            this.field3338 = arg0.method2886();
        } else if (arg1 == 7) {
            this.field3344 = arg0.method2931();
        } else if (arg1 == 8) {
            this.field3346 = arg0.method2931();
        } else if (arg1 == 40) {
            int var3 = arg0.method2931();
            this.field3333 = new short[var3];
            this.field3339 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3333[var4] = (short) arg0.method2886();
                this.field3339[var4] = (short) arg0.method2886();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2931();
            this.field3340 = new short[var5];
            this.field3341 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3340[var6] = (short) arg0.method2886();
                this.field3341[var6] = (short) arg0.method2886();
            }
        }
    }

    @ObfuscatedName("ie.f(II)Lev;")
    public final class134 method3940(int arg0) {
        class134 var2 = (class134) field3334.method3239((long) this.field3335);
        if (var2 == null) {
            class128 var3 = class128.method2163(Statics.field3332, this.field3336, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3333 != null) {
                for (int var4 = 0; var4 < this.field3333.length; var4++) {
                    var3.method2177(this.field3333[var4], this.field3339[var4]);
                }
            }
            if (this.field3340 != null) {
                for (int var5 = 0; var5 < this.field3340.length; var5++) {
                    var3.method2178(this.field3340[var5], this.field3341[var5]);
                }
            }
            var2 = var3.method2185(this.field3344 + 64, this.field3346 + 850, -30, -50, -30);
            field3334.method3241(var2, (long) this.field3335);
        }
        class134 var6;
        if (this.field3345 == -1 || arg0 == -1) {
            var6 = var2.method2251(true);
        } else {
            var6 = class264.method3098(this.field3345).method4346(var2, arg0);
        }
        if (this.field3342 != 128 || this.field3331 != 128) {
            var6.method2266(this.field3342, this.field3331, this.field3342);
        }
        if (this.field3338 != 0) {
            if (this.field3338 == 90) {
                var6.method2261();
            }
            if (this.field3338 == 180) {
                var6.method2261();
                var6.method2261();
            }
            if (this.field3338 == 270) {
                var6.method2261();
                var6.method2261();
                var6.method2261();
            }
        }
        return var6;
    }
}

package deob;

@ObfuscatedName("ij")
public class class247 extends class196 {

    @ObfuscatedName("ij.a")
    public static class191 field3329 = new class191(64);

    @ObfuscatedName("ij.r")
    public static class191 field3330 = new class191(30);

    @ObfuscatedName("ij.o")
    public int field3331;

    @ObfuscatedName("ij.n")
    public int field3327;

    @ObfuscatedName("ij.q")
    public int field3333 = -1;

    @ObfuscatedName("ij.b")
    public short[] field3334;

    @ObfuscatedName("ij.k")
    public short[] field3335;

    @ObfuscatedName("ij.s")
    public short[] field3336;

    @ObfuscatedName("ij.d")
    public short[] field3328;

    @ObfuscatedName("ij.l")
    public int field3338 = 128;

    @ObfuscatedName("ij.t")
    public int field3339 = 128;

    @ObfuscatedName("ij.y")
    public int field3340 = 0;

    @ObfuscatedName("ij.v")
    public int field3341 = 0;

    @ObfuscatedName("ij.c")
    public int field3342 = 0;

    @ObfuscatedName("c.i(II)Lij;")
    public static class247 method80(int arg0) {
        class247 var1 = (class247) field3329.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3332.method3824(13, arg0);
        class247 var3 = new class247();
        var3.field3331 = arg0;
        if (var2 != null) {
            var3.method4011(new class175(var2));
        }
        field3329.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.j(Lfp;B)V")
    public void method4011(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4010(arg0, var2);
        }
    }

    @ObfuscatedName("ij.a(Lfp;II)V")
    public void method4010(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3327 = arg0.method2995();
        } else if (arg1 == 2) {
            this.field3333 = arg0.method2995();
        } else if (arg1 == 4) {
            this.field3338 = arg0.method2995();
        } else if (arg1 == 5) {
            this.field3339 = arg0.method2995();
        } else if (arg1 == 6) {
            this.field3340 = arg0.method2995();
        } else if (arg1 == 7) {
            this.field3341 = arg0.method2999();
        } else if (arg1 == 8) {
            this.field3342 = arg0.method2999();
        } else if (arg1 == 40) {
            int var3 = arg0.method2999();
            this.field3334 = new short[var3];
            this.field3335 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3334[var4] = (short) arg0.method2995();
                this.field3335[var4] = (short) arg0.method2995();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2999();
            this.field3336 = new short[var5];
            this.field3328 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3336[var6] = (short) arg0.method2995();
                this.field3328[var6] = (short) arg0.method2995();
            }
        }
    }

    @ObfuscatedName("ij.r(II)Lem;")
    public final class133 method4017(int arg0) {
        class133 var2 = (class133) field3330.method3347((long) this.field3331);
        if (var2 == null) {
            class127 var3 = class127.method2209(Statics.field3337, this.field3327, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3334 != null) {
                for (int var4 = 0; var4 < this.field3334.length; var4++) {
                    var3.method2258(this.field3334[var4], this.field3335[var4]);
                }
            }
            if (this.field3336 != null) {
                for (int var5 = 0; var5 < this.field3336.length; var5++) {
                    var3.method2260(this.field3336[var5], this.field3328[var5]);
                }
            }
            var2 = var3.method2264(this.field3341 + 64, this.field3342 + 850, -30, -50, -30);
            field3330.method3346(var2, (long) this.field3331);
        }
        class133 var6;
        if (this.field3333 == -1 || arg0 == -1) {
            var6 = var2.method2325(true);
        } else {
            var6 = class262.method3737(this.field3333).method4343(var2, arg0);
        }
        if (this.field3338 != 128 || this.field3339 != 128) {
            var6.method2345(this.field3338, this.field3339, this.field3338);
        }
        if (this.field3340 != 0) {
            if (this.field3340 == 90) {
                var6.method2304();
            }
            if (this.field3340 == 180) {
                var6.method2304();
                var6.method2304();
            }
            if (this.field3340 == 270) {
                var6.method2304();
                var6.method2304();
                var6.method2304();
            }
        }
        return var6;
    }
}

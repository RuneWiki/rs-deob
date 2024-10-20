package deob;

@ObfuscatedName("is")
public class class255 extends class185 {

    @ObfuscatedName("is.d")
    public static class155 field3275 = new class155(64);

    @ObfuscatedName("is.c")
    public static class155 field3282 = new class155(30);

    @ObfuscatedName("is.y")
    public int field3278;

    @ObfuscatedName("is.h")
    public int field3274;

    @ObfuscatedName("is.z")
    public int field3279 = -1;

    @ObfuscatedName("is.e")
    public short[] field3276;

    @ObfuscatedName("is.q")
    public short[] field3281;

    @ObfuscatedName("is.l")
    public short[] field3273;

    @ObfuscatedName("is.s")
    public short[] field3283;

    @ObfuscatedName("is.b")
    public int field3284 = 128;

    @ObfuscatedName("is.a")
    public int field3285 = 128;

    @ObfuscatedName("is.w")
    public int field3286 = 0;

    @ObfuscatedName("is.k")
    public int field3287 = 0;

    @ObfuscatedName("is.i")
    public int field3288 = 0;

    @ObfuscatedName("jh.n(II)Lis;")
    public static class255 method4871(int arg0) {
        class255 var1 = (class255) field3275.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3280.method4032(13, arg0);
        class255 var3 = new class255();
        var3.field3278 = arg0;
        if (var2 != null) {
            var3.method4217(new class311(var2));
        }
        field3275.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.v(Lkx;B)V")
    public void method4217(class311 arg0) {
        while (true) {
            int var2 = arg0.method5310();
            if (var2 == 0) {
                return;
            }
            this.method4211(arg0, var2);
        }
    }

    @ObfuscatedName("is.d(Lkx;II)V")
    public void method4211(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3274 = arg0.method5247();
        } else if (arg1 == 2) {
            this.field3279 = arg0.method5247();
        } else if (arg1 == 4) {
            this.field3284 = arg0.method5247();
        } else if (arg1 == 5) {
            this.field3285 = arg0.method5247();
        } else if (arg1 == 6) {
            this.field3286 = arg0.method5247();
        } else if (arg1 == 7) {
            this.field3287 = arg0.method5310();
        } else if (arg1 == 8) {
            this.field3288 = arg0.method5310();
        } else if (arg1 == 40) {
            int var3 = arg0.method5310();
            this.field3276 = new short[var3];
            this.field3281 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3276[var4] = (short) arg0.method5247();
                this.field3281[var4] = (short) arg0.method5247();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5310();
            this.field3273 = new short[var5];
            this.field3283 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3273[var6] = (short) arg0.method5247();
                this.field3283[var6] = (short) arg0.method5247();
            }
        }
    }

    @ObfuscatedName("is.c(IB)Lef;")
    public final class137 method4216(int arg0) {
        class137 var2 = (class137) field3282.method3220((long) this.field3278);
        if (var2 == null) {
            class131 var3 = class131.method2777(Statics.field3277, this.field3274, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3276 != null) {
                for (int var4 = 0; var4 < this.field3276.length; var4++) {
                    var3.method2715(this.field3276[var4], this.field3281[var4]);
                }
            }
            if (this.field3273 != null) {
                for (int var5 = 0; var5 < this.field3273.length; var5++) {
                    var3.method2714(this.field3273[var5], this.field3283[var5]);
                }
            }
            var2 = var3.method2721(this.field3287 + 64, this.field3288 + 850, -30, -50, -30);
            field3282.method3217(var2, (long) this.field3278);
        }
        class137 var6;
        if (this.field3279 == -1 || arg0 == -1) {
            var6 = var2.method2797(true);
        } else {
            var6 = Statics.method1124(this.field3279).method4589(var2, arg0);
        }
        if (this.field3284 != 128 || this.field3285 != 128) {
            var6.method2811(this.field3284, this.field3285, this.field3284);
        }
        if (this.field3286 != 0) {
            if (this.field3286 == 90) {
                var6.method2806();
            }
            if (this.field3286 == 180) {
                var6.method2806();
                var6.method2806();
            }
            if (this.field3286 == 270) {
                var6.method2806();
                var6.method2806();
                var6.method2806();
            }
        }
        return var6;
    }

    @ObfuscatedName("av.y(I)V")
    public static void method733() {
        field3275.method3218();
        field3282.method3218();
    }
}

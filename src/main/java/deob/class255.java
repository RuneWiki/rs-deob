package deob;

@ObfuscatedName("ie")
public class class255 extends class185 {

    @ObfuscatedName("ie.l")
    public static class155 field3268 = new class155(64);

    @ObfuscatedName("ie.m")
    public static class155 field3269 = new class155(30);

    @ObfuscatedName("ie.z")
    public int field3266;

    @ObfuscatedName("ie.q")
    public int field3271;

    @ObfuscatedName("ie.k")
    public int field3272 = -1;

    @ObfuscatedName("ie.c")
    public short[] field3273;

    @ObfuscatedName("ie.u")
    public short[] field3274;

    @ObfuscatedName("ie.t")
    public short[] field3275;

    @ObfuscatedName("ie.e")
    public short[] field3276;

    @ObfuscatedName("ie.o")
    public int field3277 = 128;

    @ObfuscatedName("ie.n")
    public int field3278 = 128;

    @ObfuscatedName("ie.x")
    public int field3279 = 0;

    @ObfuscatedName("ie.p")
    public int field3280 = 0;

    @ObfuscatedName("ie.r")
    public int field3281 = 0;

    @ObfuscatedName("gs.f(Liw;Liw;S)V")
    public static void method3397(class245 arg0, class245 arg1) {
        Statics.field3270 = arg0;
        Statics.field3267 = arg1;
    }

    @ObfuscatedName("ce.b(II)Lie;")
    public static class255 method1685(int arg0) {
        class255 var1 = (class255) field3268.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3270.method3905(13, arg0);
        class255 var3 = new class255();
        var3.field3266 = arg0;
        if (var2 != null) {
            var3.method4156(new class311(var2));
        }
        field3268.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.l(Lkb;B)V")
    public void method4156(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4173(arg0, var2);
        }
    }

    @ObfuscatedName("ie.m(Lkb;II)V")
    public void method4173(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3271 = arg0.method5163();
        } else if (arg1 == 2) {
            this.field3272 = arg0.method5163();
        } else if (arg1 == 4) {
            this.field3277 = arg0.method5163();
        } else if (arg1 == 5) {
            this.field3278 = arg0.method5163();
        } else if (arg1 == 6) {
            this.field3279 = arg0.method5163();
        } else if (arg1 == 7) {
            this.field3280 = arg0.method5276();
        } else if (arg1 == 8) {
            this.field3281 = arg0.method5276();
        } else if (arg1 == 40) {
            int var3 = arg0.method5276();
            this.field3273 = new short[var3];
            this.field3274 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3273[var4] = (short) arg0.method5163();
                this.field3274[var4] = (short) arg0.method5163();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5276();
            this.field3275 = new short[var5];
            this.field3276 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3275[var6] = (short) arg0.method5163();
                this.field3276[var6] = (short) arg0.method5163();
            }
        }
    }

    @ObfuscatedName("ie.z(IB)Leh;")
    public final class137 method4158(int arg0) {
        class137 var2 = (class137) field3269.method3155((long) this.field3266);
        if (var2 == null) {
            class131 var3 = class131.method2647(Statics.field3267, this.field3271, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3273 != null) {
                for (int var4 = 0; var4 < this.field3273.length; var4++) {
                    var3.method2660(this.field3273[var4], this.field3274[var4]);
                }
            }
            if (this.field3275 != null) {
                for (int var5 = 0; var5 < this.field3275.length; var5++) {
                    var3.method2661(this.field3275[var5], this.field3276[var5]);
                }
            }
            var2 = var3.method2668(this.field3280 + 64, this.field3281 + 850, -30, -50, -30);
            field3269.method3157(var2, (long) this.field3266);
        }
        class137 var6;
        if (this.field3272 == -1 || arg0 == -1) {
            var6 = var2.method2780(true);
        } else {
            var6 = class270.method2219(this.field3272).method4548(var2, arg0);
        }
        if (this.field3277 != 128 || this.field3278 != 128) {
            var6.method2758(this.field3277, this.field3278, this.field3277);
        }
        if (this.field3279 != 0) {
            if (this.field3279 == 90) {
                var6.method2753();
            }
            if (this.field3279 == 180) {
                var6.method2753();
                var6.method2753();
            }
            if (this.field3279 == 270) {
                var6.method2753();
                var6.method2753();
                var6.method2753();
            }
        }
        return var6;
    }

    @ObfuscatedName("cm.q(I)V")
    public static void method2028() {
        field3268.method3158();
        field3269.method3158();
    }
}

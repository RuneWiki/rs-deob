package deob;

@ObfuscatedName("ii")
public class class246 extends class195 {

    @ObfuscatedName("ii.e")
    public static class190 field3323 = new class190(64);

    @ObfuscatedName("ii.p")
    public static class190 field3324 = new class190(30);

    @ObfuscatedName("ii.q")
    public int field3325;

    @ObfuscatedName("ii.s")
    public int field3326;

    @ObfuscatedName("ii.r")
    public int field3327 = -1;

    @ObfuscatedName("ii.g")
    public short[] field3328;

    @ObfuscatedName("ii.v")
    public short[] field3329;

    @ObfuscatedName("ii.t")
    public short[] field3330;

    @ObfuscatedName("ii.y")
    public short[] field3331;

    @ObfuscatedName("ii.o")
    public int field3332 = 128;

    @ObfuscatedName("ii.i")
    public int field3333 = 128;

    @ObfuscatedName("ii.u")
    public int field3334 = 0;

    @ObfuscatedName("ii.b")
    public int field3335 = 0;

    @ObfuscatedName("ii.f")
    public int field3336 = 0;

    @ObfuscatedName("bn.d(Lit;Lit;I)V")
    public static void method928(class236 arg0, class236 arg1) {
        Statics.field3322 = arg0;
        Statics.field3321 = arg1;
    }

    @ObfuscatedName("ef.k(IB)Lii;")
    public static class246 method2787(int arg0) {
        class246 var1 = (class246) field3323.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3322.method3875(13, arg0);
        class246 var3 = new class246();
        var3.field3325 = arg0;
        if (var2 != null) {
            var3.method4076(new class174(var2));
        }
        field3323.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.e(Lfg;B)V")
    public void method4076(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4080(arg0, var2);
        }
    }

    @ObfuscatedName("ii.p(Lfg;II)V")
    public void method4080(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3326 = arg0.method3035();
        } else if (arg1 == 2) {
            this.field3327 = arg0.method3035();
        } else if (arg1 == 4) {
            this.field3332 = arg0.method3035();
        } else if (arg1 == 5) {
            this.field3333 = arg0.method3035();
        } else if (arg1 == 6) {
            this.field3334 = arg0.method3035();
        } else if (arg1 == 7) {
            this.field3335 = arg0.method2955();
        } else if (arg1 == 8) {
            this.field3336 = arg0.method2955();
        } else if (arg1 == 40) {
            int var3 = arg0.method2955();
            this.field3328 = new short[var3];
            this.field3329 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3328[var4] = (short) arg0.method3035();
                this.field3329[var4] = (short) arg0.method3035();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2955();
            this.field3330 = new short[var5];
            this.field3331 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3330[var6] = (short) arg0.method3035();
                this.field3331[var6] = (short) arg0.method3035();
            }
        }
    }

    @ObfuscatedName("ii.q(II)Leb;")
    public final class132 method4078(int arg0) {
        class132 var2 = (class132) field3324.method3341((long) this.field3325);
        if (var2 == null) {
            class126 var3 = class126.method2268(Statics.field3321, this.field3326, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3328 != null) {
                for (int var4 = 0; var4 < this.field3328.length; var4++) {
                    var3.method2284(this.field3328[var4], this.field3329[var4]);
                }
            }
            if (this.field3330 != null) {
                for (int var5 = 0; var5 < this.field3330.length; var5++) {
                    var3.method2283(this.field3330[var5], this.field3331[var5]);
                }
            }
            var2 = var3.method2290(this.field3335 + 64, this.field3336 + 850, -30, -50, -30);
            field3324.method3343(var2, (long) this.field3325);
        }
        class132 var6;
        if (this.field3327 == -1 || arg0 == -1) {
            var6 = var2.method2361(true);
        } else {
            var6 = class261.method3613(this.field3327).method4425(var2, arg0);
        }
        if (this.field3332 != 128 || this.field3333 != 128) {
            var6.method2376(this.field3332, this.field3333, this.field3332);
        }
        if (this.field3334 != 0) {
            if (this.field3334 == 90) {
                var6.method2426();
            }
            if (this.field3334 == 180) {
                var6.method2426();
                var6.method2426();
            }
            if (this.field3334 == 270) {
                var6.method2426();
                var6.method2426();
                var6.method2426();
            }
        }
        return var6;
    }
}

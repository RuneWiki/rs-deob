package deob;

@ObfuscatedName("ii")
public class class246 extends class195 {

    @ObfuscatedName("ii.n")
    public static class190 field3326 = new class190(64);

    @ObfuscatedName("ii.r")
    public static class190 field3328 = new class190(30);

    @ObfuscatedName("ii.v")
    public int field3329;

    @ObfuscatedName("ii.e")
    public int field3335;

    @ObfuscatedName("ii.l")
    public int field3330 = -1;

    @ObfuscatedName("ii.s")
    public short[] field3324;

    @ObfuscatedName("ii.w")
    public short[] field3331;

    @ObfuscatedName("ii.p")
    public short[] field3333;

    @ObfuscatedName("ii.m")
    public short[] field3334;

    @ObfuscatedName("ii.u")
    public int field3332 = 128;

    @ObfuscatedName("ii.g")
    public int field3336 = 128;

    @ObfuscatedName("ii.k")
    public int field3337 = 0;

    @ObfuscatedName("ii.t")
    public int field3327 = 0;

    @ObfuscatedName("ii.c")
    public int field3339 = 0;

    @ObfuscatedName("hw.a(Lif;Lif;B)V")
    public static void method3754(class236 arg0, class236 arg1) {
        Statics.field3338 = arg0;
        Statics.field3325 = arg1;
    }

    @ObfuscatedName("io.j(II)Lii;")
    public static class246 method3901(int arg0) {
        class246 var1 = (class246) field3326.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3338.method3787(13, arg0);
        class246 var3 = new class246();
        var3.field3329 = arg0;
        if (var2 != null) {
            var3.method3963(new class174(var2));
        }
        field3326.method3247(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ii.n(Lfe;I)V")
    public void method3963(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method3962(arg0, var2);
        }
    }

    @ObfuscatedName("ii.r(Lfe;II)V")
    public void method3962(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3335 = arg0.method2873();
        } else if (arg1 == 2) {
            this.field3330 = arg0.method2873();
        } else if (arg1 == 4) {
            this.field3332 = arg0.method2873();
        } else if (arg1 == 5) {
            this.field3336 = arg0.method2873();
        } else if (arg1 == 6) {
            this.field3337 = arg0.method2873();
        } else if (arg1 == 7) {
            this.field3327 = arg0.method2871();
        } else if (arg1 == 8) {
            this.field3339 = arg0.method2871();
        } else if (arg1 == 40) {
            int var3 = arg0.method2871();
            this.field3324 = new short[var3];
            this.field3331 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3324[var4] = (short) arg0.method2873();
                this.field3331[var4] = (short) arg0.method2873();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2871();
            this.field3333 = new short[var5];
            this.field3334 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3333[var6] = (short) arg0.method2873();
                this.field3334[var6] = (short) arg0.method2873();
            }
        }
    }

    @ObfuscatedName("ii.v(IB)Lej;")
    public final class134 method3954(int arg0) {
        class134 var2 = (class134) field3328.method3245((long) this.field3329);
        if (var2 == null) {
            class128 var3 = class128.method2173(Statics.field3325, this.field3335, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3324 != null) {
                for (int var4 = 0; var4 < this.field3324.length; var4++) {
                    var3.method2186(this.field3324[var4], this.field3331[var4]);
                }
            }
            if (this.field3333 != null) {
                for (int var5 = 0; var5 < this.field3333.length; var5++) {
                    var3.method2187(this.field3333[var5], this.field3334[var5]);
                }
            }
            var2 = var3.method2194(this.field3327 + 64, this.field3339 + 850, -30, -50, -30);
            field3328.method3247(var2, (long) this.field3329);
        }
        class134 var6;
        if (this.field3330 == -1 || arg0 == -1) {
            var6 = var2.method2273(true);
        } else {
            var6 = class261.method1884(this.field3330).method4304(var2, arg0);
        }
        if (this.field3332 != 128 || this.field3336 != 128) {
            var6.method2301(this.field3332, this.field3336, this.field3332);
        }
        if (this.field3337 != 0) {
            if (this.field3337 == 90) {
                var6.method2283();
            }
            if (this.field3337 == 180) {
                var6.method2283();
                var6.method2283();
            }
            if (this.field3337 == 270) {
                var6.method2283();
                var6.method2283();
                var6.method2283();
            }
        }
        return var6;
    }
}

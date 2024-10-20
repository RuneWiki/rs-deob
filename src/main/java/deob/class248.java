package deob;

@ObfuscatedName("it")
public class class248 extends class195 {

    @ObfuscatedName("it.r")
    public static class190 field3354 = new class190(64);

    @ObfuscatedName("it.v")
    public int field3355 = -1;

    @ObfuscatedName("it.e")
    public int[] field3356;

    @ObfuscatedName("it.l")
    public short[] field3357;

    @ObfuscatedName("it.s")
    public short[] field3358;

    @ObfuscatedName("it.w")
    public short[] field3359;

    @ObfuscatedName("it.p")
    public short[] field3361;

    @ObfuscatedName("it.m")
    public int[] field3363 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("it.u")
    public boolean field3360 = false;

    @ObfuscatedName("cs.a(Lif;Lif;B)V")
    public static void method1365(class236 arg0, class236 arg1) {
        Statics.field3352 = arg0;
        Statics.field3362 = arg1;
        Statics.field3353 = Statics.field3352.method3793(3);
    }

    @ObfuscatedName("ij.j(IB)Lit;")
    public static class248 method3986(int arg0) {
        class248 var1 = (class248) field3354.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3352.method3787(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method3999(new class174(var2));
        }
        field3354.method3247(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("it.n(Lfe;I)V")
    public void method3999(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method3998(arg0, var2);
        }
    }

    @ObfuscatedName("it.r(Lfe;II)V")
    public void method3998(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3355 = arg0.method2871();
        } else if (arg1 == 2) {
            int var3 = arg0.method2871();
            this.field3356 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3356[var4] = arg0.method2873();
            }
        } else if (arg1 == 3) {
            this.field3360 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2871();
            this.field3357 = new short[var5];
            this.field3358 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3357[var6] = (short) arg0.method2873();
                this.field3358[var6] = (short) arg0.method2873();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2871();
            this.field3359 = new short[var7];
            this.field3361 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3359[var8] = (short) arg0.method2873();
                this.field3361[var8] = (short) arg0.method2873();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3363[arg1 - 60] = arg0.method2873();
        }
    }

    @ObfuscatedName("it.v(I)Z")
    public boolean method3990() {
        if (this.field3356 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3356.length; var2++) {
            if (!Statics.field3362.method3765(this.field3356[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("it.e(B)Ldv;")
    public class128 method3991() {
        if (this.field3356 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3356.length];
        for (int var2 = 0; var2 < this.field3356.length; var2++) {
            var1[var2] = class128.method2173(Statics.field3362, this.field3356[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3357 != null) {
            for (int var4 = 0; var4 < this.field3357.length; var4++) {
                var3.method2186(this.field3357[var4], this.field3358[var4]);
            }
        }
        if (this.field3359 != null) {
            for (int var5 = 0; var5 < this.field3359.length; var5++) {
                var3.method2187(this.field3359[var5], this.field3361[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("it.l(I)Z")
    public boolean method4006() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3363[var2] != -1 && !Statics.field3362.method3765(this.field3363[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("it.s(S)Ldv;")
    public class128 method3988() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3363[var3] != -1) {
                var1[var2++] = class128.method2173(Statics.field3362, this.field3363[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3357 != null) {
            for (int var5 = 0; var5 < this.field3357.length; var5++) {
                var4.method2186(this.field3357[var5], this.field3358[var5]);
            }
        }
        if (this.field3359 != null) {
            for (int var6 = 0; var6 < this.field3359.length; var6++) {
                var4.method2187(this.field3359[var6], this.field3361[var6]);
            }
        }
        return var4;
    }
}

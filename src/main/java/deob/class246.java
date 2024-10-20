package deob;

@ObfuscatedName("im")
public class class246 extends class176 {

    @ObfuscatedName("im.p")
    public static class146 field3274 = new class146(64);

    @ObfuscatedName("im.k")
    public int field3266 = -1;

    @ObfuscatedName("im.l")
    public int[] field3267;

    @ObfuscatedName("im.b")
    public short[] field3268;

    @ObfuscatedName("im.i")
    public short[] field3265;

    @ObfuscatedName("im.c")
    public short[] field3270;

    @ObfuscatedName("im.f")
    public short[] field3271;

    @ObfuscatedName("im.m")
    public int[] field3263 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("im.u")
    public boolean field3273 = false;

    @ObfuscatedName("b.q(Lhp;Lhp;B)V")
    public static void method52(class234 arg0, class234 arg1) {
        Statics.field3275 = arg0;
        Statics.field3666 = arg1;
        Statics.field3264 = Statics.field3275.method3785(3);
    }

    @ObfuscatedName("hc.w(II)Lim;")
    public static class246 method3769(int arg0) {
        class246 var1 = (class246) field3274.method3039((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3275.method3775(3, arg0);
        class246 var3 = new class246();
        if (var2 != null) {
            var3.method4066(new class301(var2));
        }
        field3274.method3041(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.e(Lkf;I)V")
    public void method4066(class301 arg0) {
        while (true) {
            int var2 = arg0.method5077();
            if (var2 == 0) {
                return;
            }
            this.method4053(arg0, var2);
        }
    }

    @ObfuscatedName("im.p(Lkf;II)V")
    public void method4053(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3266 = arg0.method5077();
        } else if (arg1 == 2) {
            int var3 = arg0.method5077();
            this.field3267 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3267[var4] = arg0.method5069();
            }
        } else if (arg1 == 3) {
            this.field3273 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5077();
            this.field3268 = new short[var5];
            this.field3265 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3268[var6] = (short) arg0.method5069();
                this.field3265[var6] = (short) arg0.method5069();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5077();
            this.field3270 = new short[var7];
            this.field3271 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3270[var8] = (short) arg0.method5069();
                this.field3271[var8] = (short) arg0.method5069();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3263[arg1 - 60] = arg0.method5069();
        }
    }

    @ObfuscatedName("im.k(I)Z")
    public boolean method4057() {
        if (this.field3267 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3267.length; var2++) {
            if (!Statics.field3666.method3777(this.field3267[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("im.l(I)Lds;")
    public class122 method4056() {
        if (this.field3267 == null) {
            return null;
        }
        class122[] var1 = new class122[this.field3267.length];
        for (int var2 = 0; var2 < this.field3267.length; var2++) {
            var1[var2] = class122.method2512(Statics.field3666, this.field3267[var2], 0);
        }
        class122 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class122(var1, var1.length);
        }
        if (this.field3268 != null) {
            for (int var4 = 0; var4 < this.field3268.length; var4++) {
                var3.method2526(this.field3268[var4], this.field3265[var4]);
            }
        }
        if (this.field3270 != null) {
            for (int var5 = 0; var5 < this.field3270.length; var5++) {
                var3.method2527(this.field3270[var5], this.field3271[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("im.b(I)Z")
    public boolean method4062() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3263[var2] != -1 && !Statics.field3666.method3777(this.field3263[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("im.i(B)Lds;")
    public class122 method4058() {
        class122[] var1 = new class122[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3263[var3] != -1) {
                var1[var2++] = class122.method2512(Statics.field3666, this.field3263[var3], 0);
            }
        }
        class122 var4 = new class122(var1, var2);
        if (this.field3268 != null) {
            for (int var5 = 0; var5 < this.field3268.length; var5++) {
                var4.method2526(this.field3268[var5], this.field3265[var5]);
            }
        }
        if (this.field3270 != null) {
            for (int var6 = 0; var6 < this.field3270.length; var6++) {
                var4.method2527(this.field3270[var6], this.field3271[var6]);
            }
        }
        return var4;
    }
}

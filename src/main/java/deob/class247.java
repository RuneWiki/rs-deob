package deob;

@ObfuscatedName("io")
public class class247 extends class176 {

    @ObfuscatedName("io.e")
    public static class146 field3263 = new class146(64);

    @ObfuscatedName("io.i")
    public int field3264 = -1;

    @ObfuscatedName("io.g")
    public int[] field3269;

    @ObfuscatedName("io.d")
    public short[] field3270;

    @ObfuscatedName("io.l")
    public short[] field3267;

    @ObfuscatedName("io.j")
    public short[] field3268;

    @ObfuscatedName("io.m")
    public short[] field3261;

    @ObfuscatedName("io.p")
    public int[] field3265 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("io.h")
    public boolean field3271 = false;

    @ObfuscatedName("a.c(II)Lio;")
    public static class247 method280(int arg0) {
        class247 var1 = (class247) field3263.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3266.method3845(3, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4130(new class301(var2));
        }
        field3263.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.t(Lkp;B)V")
    public void method4130(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4144(arg0, var2);
        }
    }

    @ObfuscatedName("io.o(Lkp;II)V")
    public void method4144(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3264 = arg0.method5129();
        } else if (arg1 == 2) {
            int var3 = arg0.method5129();
            this.field3269 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3269[var4] = arg0.method5124();
            }
        } else if (arg1 == 3) {
            this.field3271 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5129();
            this.field3270 = new short[var5];
            this.field3267 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3270[var6] = (short) arg0.method5124();
                this.field3267[var6] = (short) arg0.method5124();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5129();
            this.field3268 = new short[var7];
            this.field3261 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3268[var8] = (short) arg0.method5124();
                this.field3261[var8] = (short) arg0.method5124();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3265[arg1 - 60] = arg0.method5124();
        }
    }

    @ObfuscatedName("io.e(I)Z")
    public boolean method4132() {
        if (this.field3269 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3269.length; var2++) {
            if (!Statics.field3262.method3838(this.field3269[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("io.i(I)Ldg;")
    public class122 method4138() {
        if (this.field3269 == null) {
            return null;
        }
        class122[] var1 = new class122[this.field3269.length];
        for (int var2 = 0; var2 < this.field3269.length; var2++) {
            var1[var2] = class122.method2633(Statics.field3262, this.field3269[var2], 0);
        }
        class122 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class122(var1, var1.length);
        }
        if (this.field3270 != null) {
            for (int var4 = 0; var4 < this.field3270.length; var4++) {
                var3.method2588(this.field3270[var4], this.field3267[var4]);
            }
        }
        if (this.field3268 != null) {
            for (int var5 = 0; var5 < this.field3268.length; var5++) {
                var3.method2589(this.field3268[var5], this.field3261[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("io.g(I)Z")
    public boolean method4134() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3265[var2] != -1 && !Statics.field3262.method3838(this.field3265[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("io.d(I)Ldg;")
    public class122 method4135() {
        class122[] var1 = new class122[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3265[var3] != -1) {
                var1[var2++] = class122.method2633(Statics.field3262, this.field3265[var3], 0);
            }
        }
        class122 var4 = new class122(var1, var2);
        if (this.field3270 != null) {
            for (int var5 = 0; var5 < this.field3270.length; var5++) {
                var4.method2588(this.field3270[var5], this.field3267[var5]);
            }
        }
        if (this.field3268 != null) {
            for (int var6 = 0; var6 < this.field3268.length; var6++) {
                var4.method2589(this.field3268[var6], this.field3261[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("kq.l(I)V")
    public static void method4961() {
        field3263.method3103();
    }
}

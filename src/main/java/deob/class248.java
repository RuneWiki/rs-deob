package deob;

@ObfuscatedName("ie")
public class class248 extends class195 {

    @ObfuscatedName("ie.j")
    public static class190 field3357 = new class190(64);

    @ObfuscatedName("ie.f")
    public int field3356 = -1;

    @ObfuscatedName("ie.m")
    public int[] field3352;

    @ObfuscatedName("ie.c")
    public short[] field3364;

    @ObfuscatedName("ie.z")
    public short[] field3359;

    @ObfuscatedName("ie.h")
    public short[] field3360;

    @ObfuscatedName("ie.g")
    public short[] field3361;

    @ObfuscatedName("ie.e")
    public int[] field3362 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ie.o")
    public boolean field3355 = false;

    @ObfuscatedName("bu.n(II)Lie;")
    public static class248 method1040(int arg0) {
        class248 var1 = (class248) field3357.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3358.method3880(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4082(new class174(var2));
        }
        field3357.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.p(Lfl;I)V")
    public void method4082(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4083(arg0, var2);
        }
    }

    @ObfuscatedName("ie.i(Lfl;II)V")
    public void method4083(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3356 = arg0.method2925();
        } else if (arg1 == 2) {
            int var3 = arg0.method2925();
            this.field3352 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3352[var4] = arg0.method3065();
            }
        } else if (arg1 == 3) {
            this.field3355 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2925();
            this.field3364 = new short[var5];
            this.field3359 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3364[var6] = (short) arg0.method3065();
                this.field3359[var6] = (short) arg0.method3065();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2925();
            this.field3360 = new short[var7];
            this.field3361 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3360[var8] = (short) arg0.method3065();
                this.field3361[var8] = (short) arg0.method3065();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3362[arg1 - 60] = arg0.method3065();
        }
    }

    @ObfuscatedName("ie.j(I)Z")
    public boolean method4084() {
        if (this.field3352 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3352.length; var2++) {
            if (!Statics.field3353.method3832(this.field3352[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ie.f(B)Ldu;")
    public class128 method4095() {
        if (this.field3352 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3352.length];
        for (int var2 = 0; var2 < this.field3352.length; var2++) {
            var1[var2] = class128.method2225(Statics.field3353, this.field3352[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3364 != null) {
            for (int var4 = 0; var4 < this.field3364.length; var4++) {
                var3.method2299(this.field3364[var4], this.field3359[var4]);
            }
        }
        if (this.field3360 != null) {
            for (int var5 = 0; var5 < this.field3360.length; var5++) {
                var3.method2239(this.field3360[var5], this.field3361[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ie.m(I)Z")
    public boolean method4088() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3362[var2] != -1 && !Statics.field3353.method3832(this.field3362[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ie.c(S)Ldu;")
    public class128 method4091() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3362[var3] != -1) {
                var1[var2++] = class128.method2225(Statics.field3353, this.field3362[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3364 != null) {
            for (int var5 = 0; var5 < this.field3364.length; var5++) {
                var4.method2299(this.field3364[var5], this.field3359[var5]);
            }
        }
        if (this.field3360 != null) {
            for (int var6 = 0; var6 < this.field3360.length; var6++) {
                var4.method2239(this.field3360[var6], this.field3361[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ck.z(B)V")
    public static void method1573() {
        field3357.method3286();
    }
}

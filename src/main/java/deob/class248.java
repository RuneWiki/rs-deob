package deob;

@ObfuscatedName("iv")
public class class248 extends class195 {

    @ObfuscatedName("iv.t")
    public static class190 field3361 = new class190(64);

    @ObfuscatedName("iv.s")
    public int field3362 = -1;

    @ObfuscatedName("iv.r")
    public int[] field3363;

    @ObfuscatedName("iv.v")
    public short[] field3359;

    @ObfuscatedName("iv.y")
    public short[] field3365;

    @ObfuscatedName("iv.j")
    public short[] field3366;

    @ObfuscatedName("iv.k")
    public short[] field3367;

    @ObfuscatedName("iv.e")
    public int[] field3364 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("iv.o")
    public boolean field3369 = false;

    @ObfuscatedName("ci.i(IB)Liv;")
    public static class248 method1627(int arg0) {
        class248 var1 = (class248) field3361.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3370.method3768(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4023(new class174(var2));
        }
        field3361.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.w(Lfp;B)V")
    public void method4023(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method4024(arg0, var2);
        }
    }

    @ObfuscatedName("iv.a(Lfp;II)V")
    public void method4024(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3362 = arg0.method3061();
        } else if (arg1 == 2) {
            int var3 = arg0.method3061();
            this.field3363 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3363[var4] = arg0.method2882();
            }
        } else if (arg1 == 3) {
            this.field3369 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3061();
            this.field3359 = new short[var5];
            this.field3365 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3359[var6] = (short) arg0.method2882();
                this.field3365[var6] = (short) arg0.method2882();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3061();
            this.field3366 = new short[var7];
            this.field3367 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3366[var8] = (short) arg0.method2882();
                this.field3367[var8] = (short) arg0.method2882();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3364[arg1 - 60] = arg0.method2882();
        }
    }

    @ObfuscatedName("iv.t(I)Z")
    public boolean method4025() {
        if (this.field3363 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3363.length; var2++) {
            if (!Statics.field3358.method3770(this.field3363[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iv.s(I)Ldo;")
    public class128 method4026() {
        if (this.field3363 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3363.length];
        for (int var2 = 0; var2 < this.field3363.length; var2++) {
            var1[var2] = class128.method2190(Statics.field3358, this.field3363[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3359 != null) {
            for (int var4 = 0; var4 < this.field3359.length; var4++) {
                var3.method2198(this.field3359[var4], this.field3365[var4]);
            }
        }
        if (this.field3366 != null) {
            for (int var5 = 0; var5 < this.field3366.length; var5++) {
                var3.method2226(this.field3366[var5], this.field3367[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("iv.r(I)Z")
    public boolean method4037() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3364[var2] != -1 && !Statics.field3358.method3770(this.field3364[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iv.v(I)Ldo;")
    public class128 method4028() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3364[var3] != -1) {
                var1[var2++] = class128.method2190(Statics.field3358, this.field3364[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3359 != null) {
            for (int var5 = 0; var5 < this.field3359.length; var5++) {
                var4.method2198(this.field3359[var5], this.field3365[var5]);
            }
        }
        if (this.field3366 != null) {
            for (int var6 = 0; var6 < this.field3366.length; var6++) {
                var4.method2226(this.field3366[var6], this.field3367[var6]);
            }
        }
        return var4;
    }
}

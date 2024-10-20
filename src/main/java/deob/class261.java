package deob;

@ObfuscatedName("jk")
public class class261 extends class207 {

    @ObfuscatedName("jk.b")
    public static class201 field3313 = new class201(64);

    @ObfuscatedName("jk.f")
    public int field3314 = -1;

    @ObfuscatedName("jk.n")
    public int[] field3315;

    @ObfuscatedName("jk.h")
    public short[] field3316;

    @ObfuscatedName("jk.x")
    public short[] field3317;

    @ObfuscatedName("jk.j")
    public short[] field3318;

    @ObfuscatedName("jk.a")
    public short[] field3319;

    @ObfuscatedName("jk.l")
    public int[] field3311 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jk.d")
    public boolean field3312 = false;

    @ObfuscatedName("cf.w(Liv;Liv;I)V")
    public static void method1845(class248 arg0, class248 arg1) {
        Statics.field3310 = arg0;
        Statics.field3321 = arg1;
        Statics.field3320 = Statics.field3310.method4262(3);
    }

    @ObfuscatedName("ay.m(IB)Ljk;")
    public static class261 method507(int arg0) {
        class261 var1 = (class261) field3313.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3310.method4250(3, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4509(new class183(var2));
        }
        field3313.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.q(Lgy;I)V")
    public void method4509(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4510(arg0, var2);
        }
    }

    @ObfuscatedName("jk.x(Lgy;II)V")
    public void method4510(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3314 = arg0.method3436();
        } else if (arg1 == 2) {
            int var3 = arg0.method3436();
            this.field3315 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3315[var4] = arg0.method3268();
            }
        } else if (arg1 == 3) {
            this.field3312 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3436();
            this.field3316 = new short[var5];
            this.field3317 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3316[var6] = (short) arg0.method3268();
                this.field3317[var6] = (short) arg0.method3268();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3436();
            this.field3318 = new short[var7];
            this.field3319 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3318[var8] = (short) arg0.method3268();
                this.field3319[var8] = (short) arg0.method3268();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3311[arg1 - 60] = arg0.method3268();
        }
    }

    @ObfuscatedName("jk.j(S)Z")
    public boolean method4511() {
        if (this.field3315 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3315.length; var2++) {
            if (!Statics.field3321.method4332(this.field3315[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jk.a(S)Ldo;")
    public class114 method4527() {
        if (this.field3315 == null) {
            return null;
        }
        class114[] var1 = new class114[this.field3315.length];
        for (int var2 = 0; var2 < this.field3315.length; var2++) {
            var1[var2] = class114.method2406(Statics.field3321, this.field3315[var2], 0);
        }
        class114 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class114(var1, var1.length);
        }
        if (this.field3316 != null) {
            for (int var4 = 0; var4 < this.field3316.length; var4++) {
                var3.method2476(this.field3316[var4], this.field3317[var4]);
            }
        }
        if (this.field3318 != null) {
            for (int var5 = 0; var5 < this.field3318.length; var5++) {
                var3.method2419(this.field3318[var5], this.field3319[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jk.l(I)Z")
    public boolean method4519() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3311[var2] != -1 && !Statics.field3321.method4332(this.field3311[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jk.d(I)Ldo;")
    public class114 method4514() {
        class114[] var1 = new class114[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3311[var3] != -1) {
                var1[var2++] = class114.method2406(Statics.field3321, this.field3311[var3], 0);
            }
        }
        class114 var4 = new class114(var1, var2);
        if (this.field3316 != null) {
            for (int var5 = 0; var5 < this.field3316.length; var5++) {
                var4.method2476(this.field3316[var5], this.field3317[var5]);
            }
        }
        if (this.field3318 != null) {
            for (int var6 = 0; var6 < this.field3318.length; var6++) {
                var4.method2419(this.field3318[var6], this.field3319[var6]);
            }
        }
        return var4;
    }
}

package deob;

@ObfuscatedName("il")
public class class248 extends class195 {

    @ObfuscatedName("il.y")
    public static class190 field3330 = new class190(64);

    @ObfuscatedName("il.e")
    public int field3334 = -1;

    @ObfuscatedName("il.f")
    public int[] field3339;

    @ObfuscatedName("il.v")
    public short[] field3338;

    @ObfuscatedName("il.t")
    public short[] field3337;

    @ObfuscatedName("il.i")
    public short[] field3335;

    @ObfuscatedName("il.r")
    public short[] field3341;

    @ObfuscatedName("il.g")
    public int[] field3340 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("il.s")
    public boolean field3333 = false;

    @ObfuscatedName("ad.d(Lim;Lim;B)V")
    public static void method461(class236 arg0, class236 arg1) {
        Statics.field3331 = arg0;
        Statics.field3336 = arg1;
        Statics.field3332 = Statics.field3331.method3761(3);
    }

    @ObfuscatedName("fq.q(II)Lil;")
    public static class248 method2823(int arg0) {
        class248 var1 = (class248) field3330.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3331.method3750(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method3965(new class174(var2));
        }
        field3330.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("il.x(Lfw;I)V")
    public void method3965(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method3966(arg0, var2);
        }
    }

    @ObfuscatedName("il.y(Lfw;II)V")
    public void method3966(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3334 = arg0.method2921();
        } else if (arg1 == 2) {
            int var3 = arg0.method2921();
            this.field3339 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3339[var4] = arg0.method2916();
            }
        } else if (arg1 == 3) {
            this.field3333 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2921();
            this.field3338 = new short[var5];
            this.field3337 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3338[var6] = (short) arg0.method2916();
                this.field3337[var6] = (short) arg0.method2916();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2921();
            this.field3335 = new short[var7];
            this.field3341 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3335[var8] = (short) arg0.method2916();
                this.field3341[var8] = (short) arg0.method2916();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3340[arg1 - 60] = arg0.method2916();
        }
    }

    @ObfuscatedName("il.e(I)Z")
    public boolean method3971() {
        if (this.field3339 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3339.length; var2++) {
            if (!Statics.field3336.method3752(this.field3339[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("il.f(I)Ldk;")
    public class128 method3986() {
        if (this.field3339 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3339.length];
        for (int var2 = 0; var2 < this.field3339.length; var2++) {
            var1[var2] = class128.method2238(Statics.field3336, this.field3339[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3338 != null) {
            for (int var4 = 0; var4 < this.field3338.length; var4++) {
                var3.method2226(this.field3338[var4], this.field3337[var4]);
            }
        }
        if (this.field3335 != null) {
            for (int var5 = 0; var5 < this.field3335.length; var5++) {
                var3.method2190(this.field3335[var5], this.field3341[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("il.v(I)Z")
    public boolean method3969() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3340[var2] != -1 && !Statics.field3336.method3752(this.field3340[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("il.t(I)Ldk;")
    public class128 method3970() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3340[var3] != -1) {
                var1[var2++] = class128.method2238(Statics.field3336, this.field3340[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3338 != null) {
            for (int var5 = 0; var5 < this.field3338.length; var5++) {
                var4.method2226(this.field3338[var5], this.field3337[var5]);
            }
        }
        if (this.field3335 != null) {
            for (int var6 = 0; var6 < this.field3335.length; var6++) {
                var4.method2190(this.field3335[var6], this.field3341[var6]);
            }
        }
        return var4;
    }
}

package deob;

@ObfuscatedName("ix")
public class class248 extends class195 {

    @ObfuscatedName("ix.g")
    public static class190 field3323 = new class190(64);

    @ObfuscatedName("ix.d")
    public int field3329 = -1;

    @ObfuscatedName("ix.b")
    public int[] field3327;

    @ObfuscatedName("ix.k")
    public short[] field3328;

    @ObfuscatedName("ix.f")
    public short[] field3324;

    @ObfuscatedName("ix.j")
    public short[] field3330;

    @ObfuscatedName("ix.q")
    public short[] field3331;

    @ObfuscatedName("ix.h")
    public int[] field3332 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ix.i")
    public boolean field3333 = false;

    @ObfuscatedName("c.e(IB)Lix;")
    public static class248 method61(int arg0) {
        class248 var1 = (class248) field3323.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3326.method3760(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4014(new class174(var2));
        }
        field3323.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ix.o(Lfw;I)V")
    public void method4014(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method4004(arg0, var2);
        }
    }

    @ObfuscatedName("ix.m(Lfw;II)V")
    public void method4004(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3329 = arg0.method2891();
        } else if (arg1 == 2) {
            int var3 = arg0.method2891();
            this.field3327 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3327[var4] = arg0.method2930();
            }
        } else if (arg1 == 3) {
            this.field3333 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2891();
            this.field3328 = new short[var5];
            this.field3324 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3328[var6] = (short) arg0.method2930();
                this.field3324[var6] = (short) arg0.method2930();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2891();
            this.field3330 = new short[var7];
            this.field3331 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3330[var8] = (short) arg0.method2930();
                this.field3331[var8] = (short) arg0.method2930();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3332[arg1 - 60] = arg0.method2930();
        }
    }

    @ObfuscatedName("ix.g(B)Z")
    public boolean method3996() {
        if (this.field3327 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3327.length; var2++) {
            if (!Statics.field3285.method3798(this.field3327[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ix.d(B)Ldz;")
    public class128 method3997() {
        if (this.field3327 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3327.length];
        for (int var2 = 0; var2 < this.field3327.length; var2++) {
            var1[var2] = class128.method2202(Statics.field3285, this.field3327[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3328 != null) {
            for (int var4 = 0; var4 < this.field3328.length; var4++) {
                var3.method2189(this.field3328[var4], this.field3324[var4]);
            }
        }
        if (this.field3330 != null) {
            for (int var5 = 0; var5 < this.field3330.length; var5++) {
                var3.method2190(this.field3330[var5], this.field3331[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ix.b(B)Z")
    public boolean method4000() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3332[var2] != -1 && !Statics.field3285.method3798(this.field3332[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ix.k(I)Ldz;")
    public class128 method3999() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3332[var3] != -1) {
                var1[var2++] = class128.method2202(Statics.field3285, this.field3332[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3328 != null) {
            for (int var5 = 0; var5 < this.field3328.length; var5++) {
                var4.method2189(this.field3328[var5], this.field3324[var5]);
            }
        }
        if (this.field3330 != null) {
            for (int var6 = 0; var6 < this.field3330.length; var6++) {
                var4.method2190(this.field3330[var6], this.field3331[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("h.q(I)V")
    public static void method36() {
        field3323.method3247();
    }
}

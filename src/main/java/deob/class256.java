package deob;

@ObfuscatedName("ie")
public class class256 extends class185 {

    @ObfuscatedName("ie.t")
    public static class155 field3288 = new class155(64);

    @ObfuscatedName("ie.i")
    public int field3293 = -1;

    @ObfuscatedName("ie.o")
    public int[] field3290;

    @ObfuscatedName("ie.x")
    public short[] field3294;

    @ObfuscatedName("ie.w")
    public short[] field3295;

    @ObfuscatedName("ie.g")
    public short[] field3296;

    @ObfuscatedName("ie.m")
    public short[] field3297;

    @ObfuscatedName("ie.n")
    public int[] field3298 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ie.d")
    public boolean field3299 = false;

    @ObfuscatedName("cr.k(II)Lie;")
    public static class256 method1799(int arg0) {
        class256 var1 = (class256) field3288.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3291.method3873(3, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4151(new class310(var2));
        }
        field3288.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.s(Lkf;I)V")
    public void method4151(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4152(arg0, var2);
        }
    }

    @ObfuscatedName("ie.t(Lkf;IB)V")
    public void method4152(class310 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3293 = arg0.method5193();
        } else if (arg1 == 2) {
            int var3 = arg0.method5193();
            this.field3290 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3290[var4] = arg0.method5195();
            }
        } else if (arg1 == 3) {
            this.field3299 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5193();
            this.field3294 = new short[var5];
            this.field3295 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3294[var6] = (short) arg0.method5195();
                this.field3295[var6] = (short) arg0.method5195();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5193();
            this.field3296 = new short[var7];
            this.field3297 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3296[var8] = (short) arg0.method5195();
                this.field3297[var8] = (short) arg0.method5195();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3298[arg1 - 60] = arg0.method5195();
        }
    }

    @ObfuscatedName("ie.i(B)Z")
    public boolean method4153() {
        if (this.field3290 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3290.length; var2++) {
            if (!Statics.field3289.method3883(this.field3290[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ie.o(I)Lee;")
    public class131 method4156() {
        if (this.field3290 == null) {
            return null;
        }
        class131[] var1 = new class131[this.field3290.length];
        for (int var2 = 0; var2 < this.field3290.length; var2++) {
            var1[var2] = class131.method2636(Statics.field3289, this.field3290[var2], 0);
        }
        class131 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class131(var1, var1.length);
        }
        if (this.field3294 != null) {
            for (int var4 = 0; var4 < this.field3294.length; var4++) {
                var3.method2691(this.field3294[var4], this.field3295[var4]);
            }
        }
        if (this.field3296 != null) {
            for (int var5 = 0; var5 < this.field3296.length; var5++) {
                var3.method2652(this.field3296[var5], this.field3297[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ie.x(B)Z")
    public boolean method4159() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3298[var2] != -1 && !Statics.field3289.method3883(this.field3298[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ie.w(B)Lee;")
    public class131 method4161() {
        class131[] var1 = new class131[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3298[var3] != -1) {
                var1[var2++] = class131.method2636(Statics.field3289, this.field3298[var3], 0);
            }
        }
        class131 var4 = new class131(var1, var2);
        if (this.field3294 != null) {
            for (int var5 = 0; var5 < this.field3294.length; var5++) {
                var4.method2691(this.field3294[var5], this.field3295[var5]);
            }
        }
        if (this.field3296 != null) {
            for (int var6 = 0; var6 < this.field3296.length; var6++) {
                var4.method2652(this.field3296[var6], this.field3297[var6]);
            }
        }
        return var4;
    }
}

package deob;

@ObfuscatedName("ja")
public class class263 extends class209 {

    @ObfuscatedName("ja.q")
    public static class203 field3370 = new class203(64);

    @ObfuscatedName("ja.c")
    public int field3367 = -1;

    @ObfuscatedName("ja.l")
    public int[] field3372;

    @ObfuscatedName("ja.b")
    public short[] field3371;

    @ObfuscatedName("ja.w")
    public short[] field3374;

    @ObfuscatedName("ja.n")
    public short[] field3375;

    @ObfuscatedName("ja.i")
    public short[] field3373;

    @ObfuscatedName("ja.p")
    public int[] field3377 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ja.m")
    public boolean field3378 = false;

    @ObfuscatedName("fq.g(II)Lja;")
    public static class263 method3352(int arg0) {
        class263 var1 = (class263) field3370.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3379.method4438(3, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4720(new class185(var2));
        }
        field3370.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ja.r(Lgl;I)V")
    public void method4720(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method4725(arg0, var2);
        }
    }

    @ObfuscatedName("ja.e(Lgl;II)V")
    public void method4725(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3367 = arg0.method3679();
        } else if (arg1 == 2) {
            int var3 = arg0.method3679();
            this.field3372 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3372[var4] = arg0.method3467();
            }
        } else if (arg1 == 3) {
            this.field3378 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3679();
            this.field3371 = new short[var5];
            this.field3374 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3371[var6] = (short) arg0.method3467();
                this.field3374[var6] = (short) arg0.method3467();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3679();
            this.field3375 = new short[var7];
            this.field3373 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3375[var8] = (short) arg0.method3467();
                this.field3373[var8] = (short) arg0.method3467();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3377[arg1 - 60] = arg0.method3467();
        }
    }

    @ObfuscatedName("ja.q(I)Z")
    public boolean method4722() {
        if (this.field3372 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3372.length; var2++) {
            if (!Statics.field3368.method4437(this.field3372[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ja.c(B)Ldu;")
    public class116 method4719() {
        if (this.field3372 == null) {
            return null;
        }
        class116[] var1 = new class116[this.field3372.length];
        for (int var2 = 0; var2 < this.field3372.length; var2++) {
            var1[var2] = class116.method2641(Statics.field3368, this.field3372[var2], 0);
        }
        class116 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class116(var1, var1.length);
        }
        if (this.field3371 != null) {
            for (int var4 = 0; var4 < this.field3371.length; var4++) {
                var3.method2573(this.field3371[var4], this.field3374[var4]);
            }
        }
        if (this.field3375 != null) {
            for (int var5 = 0; var5 < this.field3375.length; var5++) {
                var3.method2583(this.field3375[var5], this.field3373[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ja.i(I)Z")
    public boolean method4723() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3377[var2] != -1 && !Statics.field3368.method4437(this.field3377[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ja.p(I)Ldu;")
    public class116 method4724() {
        class116[] var1 = new class116[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3377[var3] != -1) {
                var1[var2++] = class116.method2641(Statics.field3368, this.field3377[var3], 0);
            }
        }
        class116 var4 = new class116(var1, var2);
        if (this.field3371 != null) {
            for (int var5 = 0; var5 < this.field3371.length; var5++) {
                var4.method2573(this.field3371[var5], this.field3374[var5]);
            }
        }
        if (this.field3375 != null) {
            for (int var6 = 0; var6 < this.field3375.length; var6++) {
                var4.method2583(this.field3375[var6], this.field3373[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("f.m(I)V")
    public static void method211() {
        field3370.method3880();
    }
}

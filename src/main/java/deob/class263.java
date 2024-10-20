package deob;

@ObfuscatedName("jj")
public class class263 extends class209 {

    @ObfuscatedName("jj.k")
    public static class203 field3329 = new class203(64);

    @ObfuscatedName("jj.u")
    public int field3323 = -1;

    @ObfuscatedName("jj.i")
    public int[] field3324;

    @ObfuscatedName("jj.t")
    public short[] field3325;

    @ObfuscatedName("jj.p")
    public short[] field3326;

    @ObfuscatedName("jj.l")
    public short[] field3327;

    @ObfuscatedName("jj.b")
    public short[] field3328;

    @ObfuscatedName("jj.c")
    public int[] field3321 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jj.d")
    public boolean field3330 = false;

    @ObfuscatedName("jj.s(Lgx;B)V")
    public void method4557(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4561(arg0, var2);
        }
    }

    @ObfuscatedName("jj.o(Lgx;II)V")
    public void method4561(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3323 = arg0.method3274();
        } else if (arg1 == 2) {
            int var3 = arg0.method3274();
            this.field3324 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3324[var4] = arg0.method3276();
            }
        } else if (arg1 == 3) {
            this.field3330 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3274();
            this.field3325 = new short[var5];
            this.field3326 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3325[var6] = (short) arg0.method3276();
                this.field3326[var6] = (short) arg0.method3276();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3274();
            this.field3327 = new short[var7];
            this.field3328 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3327[var8] = (short) arg0.method3276();
                this.field3328[var8] = (short) arg0.method3276();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3321[arg1 - 60] = arg0.method3276();
        }
    }

    @ObfuscatedName("jj.k(S)Z")
    public boolean method4567() {
        if (this.field3324 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3324.length; var2++) {
            if (!Statics.field3322.method4272(this.field3324[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jj.u(I)Ldc;")
    public class116 method4564() {
        if (this.field3324 == null) {
            return null;
        }
        class116[] var1 = new class116[this.field3324.length];
        for (int var2 = 0; var2 < this.field3324.length; var2++) {
            var1[var2] = class116.method2418(Statics.field3322, this.field3324[var2], 0);
        }
        class116 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class116(var1, var1.length);
        }
        if (this.field3325 != null) {
            for (int var4 = 0; var4 < this.field3325.length; var4++) {
                var3.method2391(this.field3325[var4], this.field3326[var4]);
            }
        }
        if (this.field3327 != null) {
            for (int var5 = 0; var5 < this.field3327.length; var5++) {
                var3.method2436(this.field3327[var5], this.field3328[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jj.i(B)Z")
    public boolean method4559() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3321[var2] != -1 && !Statics.field3322.method4272(this.field3321[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jj.t(B)Ldc;")
    public class116 method4560() {
        class116[] var1 = new class116[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3321[var3] != -1) {
                var1[var2++] = class116.method2418(Statics.field3322, this.field3321[var3], 0);
            }
        }
        class116 var4 = new class116(var1, var2);
        if (this.field3325 != null) {
            for (int var5 = 0; var5 < this.field3325.length; var5++) {
                var4.method2391(this.field3325[var5], this.field3326[var5]);
            }
        }
        if (this.field3327 != null) {
            for (int var6 = 0; var6 < this.field3327.length; var6++) {
                var4.method2436(this.field3327[var6], this.field3328[var6]);
            }
        }
        return var4;
    }
}

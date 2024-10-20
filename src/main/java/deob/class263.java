package deob;

@ObfuscatedName("jn")
public class class263 extends class209 {

    @ObfuscatedName("jn.j")
    public static class203 field3328 = new class203(64);

    @ObfuscatedName("jn.g")
    public int field3332 = -1;

    @ObfuscatedName("jn.i")
    public int[] field3336;

    @ObfuscatedName("jn.h")
    public short[] field3331;

    @ObfuscatedName("jn.l")
    public short[] field3335;

    @ObfuscatedName("jn.d")
    public short[] field3333;

    @ObfuscatedName("jn.o")
    public short[] field3337;

    @ObfuscatedName("jn.s")
    public int[] field3334 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jn.k")
    public boolean field3339 = false;

    @ObfuscatedName("ig.c(II)Ljn;")
    public static class263 method4450(int arg0) {
        class263 var1 = (class263) field3328.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3330.method4210(3, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4505(new class185(var2));
        }
        field3328.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.q(Lgg;B)V")
    public void method4505(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4506(arg0, var2);
        }
    }

    @ObfuscatedName("jn.m(Lgg;II)V")
    public void method4506(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3332 = arg0.method3243();
        } else if (arg1 == 2) {
            int var3 = arg0.method3243();
            this.field3336 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3336[var4] = arg0.method3245();
            }
        } else if (arg1 == 3) {
            this.field3339 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3243();
            this.field3331 = new short[var5];
            this.field3335 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3331[var6] = (short) arg0.method3245();
                this.field3335[var6] = (short) arg0.method3245();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3243();
            this.field3333 = new short[var7];
            this.field3337 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3333[var8] = (short) arg0.method3245();
                this.field3337[var8] = (short) arg0.method3245();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3334[arg1 - 60] = arg0.method3245();
        }
    }

    @ObfuscatedName("jn.j(I)Z")
    public boolean method4517() {
        if (this.field3336 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3336.length; var2++) {
            if (!Statics.field3329.method4300(this.field3336[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jn.g(I)Ldf;")
    public class116 method4507() {
        if (this.field3336 == null) {
            return null;
        }
        class116[] var1 = new class116[this.field3336.length];
        for (int var2 = 0; var2 < this.field3336.length; var2++) {
            var1[var2] = class116.method2376(Statics.field3329, this.field3336[var2], 0);
        }
        class116 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class116(var1, var1.length);
        }
        if (this.field3331 != null) {
            for (int var4 = 0; var4 < this.field3331.length; var4++) {
                var3.method2330(this.field3331[var4], this.field3335[var4]);
            }
        }
        if (this.field3333 != null) {
            for (int var5 = 0; var5 < this.field3333.length; var5++) {
                var3.method2331(this.field3333[var5], this.field3337[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jn.i(B)Z")
    public boolean method4508() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3334[var2] != -1 && !Statics.field3329.method4300(this.field3334[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jn.h(I)Ldf;")
    public class116 method4509() {
        class116[] var1 = new class116[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3334[var3] != -1) {
                var1[var2++] = class116.method2376(Statics.field3329, this.field3334[var3], 0);
            }
        }
        class116 var4 = new class116(var1, var2);
        if (this.field3331 != null) {
            for (int var5 = 0; var5 < this.field3331.length; var5++) {
                var4.method2330(this.field3331[var5], this.field3335[var5]);
            }
        }
        if (this.field3333 != null) {
            for (int var6 = 0; var6 < this.field3333.length; var6++) {
                var4.method2331(this.field3333[var6], this.field3337[var6]);
            }
        }
        return var4;
    }
}

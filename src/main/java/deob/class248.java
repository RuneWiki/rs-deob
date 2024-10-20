package deob;

@ObfuscatedName("ig")
public class class248 extends class195 {

    @ObfuscatedName("ig.p")
    public static class190 field3354 = new class190(64);

    @ObfuscatedName("ig.q")
    public int field3353 = -1;

    @ObfuscatedName("ig.s")
    public int[] field3349;

    @ObfuscatedName("ig.r")
    public short[] field3355;

    @ObfuscatedName("ig.g")
    public short[] field3356;

    @ObfuscatedName("ig.v")
    public short[] field3357;

    @ObfuscatedName("ig.t")
    public short[] field3360;

    @ObfuscatedName("ig.y")
    public int[] field3359 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ig.o")
    public boolean field3352 = false;

    @ObfuscatedName("hc.d(II)Lig;")
    public static class248 method3771(int arg0) {
        class248 var1 = (class248) field3354.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3358.method3875(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4100(new class174(var2));
        }
        field3354.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.k(Lfg;I)V")
    public void method4100(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4101(arg0, var2);
        }
    }

    @ObfuscatedName("ig.e(Lfg;II)V")
    public void method4101(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3353 = arg0.method2955();
        } else if (arg1 == 2) {
            int var3 = arg0.method2955();
            this.field3349 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3349[var4] = arg0.method3035();
            }
        } else if (arg1 == 3) {
            this.field3352 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2955();
            this.field3355 = new short[var5];
            this.field3356 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3355[var6] = (short) arg0.method3035();
                this.field3356[var6] = (short) arg0.method3035();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2955();
            this.field3357 = new short[var7];
            this.field3360 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3357[var8] = (short) arg0.method3035();
                this.field3360[var8] = (short) arg0.method3035();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3359[arg1 - 60] = arg0.method3035();
        }
    }

    @ObfuscatedName("ig.p(I)Z")
    public boolean method4102() {
        if (this.field3349 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3349.length; var2++) {
            if (!Statics.field3350.method3894(this.field3349[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ig.q(I)Ldl;")
    public class126 method4103() {
        if (this.field3349 == null) {
            return null;
        }
        class126[] var1 = new class126[this.field3349.length];
        for (int var2 = 0; var2 < this.field3349.length; var2++) {
            var1[var2] = class126.method2268(Statics.field3350, this.field3349[var2], 0);
        }
        class126 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class126(var1, var1.length);
        }
        if (this.field3355 != null) {
            for (int var4 = 0; var4 < this.field3355.length; var4++) {
                var3.method2284(this.field3355[var4], this.field3356[var4]);
            }
        }
        if (this.field3357 != null) {
            for (int var5 = 0; var5 < this.field3357.length; var5++) {
                var3.method2283(this.field3357[var5], this.field3360[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ig.s(B)Z")
    public boolean method4104() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3359[var2] != -1 && !Statics.field3350.method3894(this.field3359[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ig.r(I)Ldl;")
    public class126 method4118() {
        class126[] var1 = new class126[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3359[var3] != -1) {
                var1[var2++] = class126.method2268(Statics.field3350, this.field3359[var3], 0);
            }
        }
        class126 var4 = new class126(var1, var2);
        if (this.field3355 != null) {
            for (int var5 = 0; var5 < this.field3355.length; var5++) {
                var4.method2284(this.field3355[var5], this.field3356[var5]);
            }
        }
        if (this.field3357 != null) {
            for (int var6 = 0; var6 < this.field3357.length; var6++) {
                var4.method2283(this.field3357[var6], this.field3360[var6]);
            }
        }
        return var4;
    }
}

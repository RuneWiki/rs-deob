package deob;

@ObfuscatedName("jw")
public class class263 extends class209 {

    @ObfuscatedName("jw.u")
    public static class203 field3343 = new class203(64);

    @ObfuscatedName("jw.i")
    public int field3344 = -1;

    @ObfuscatedName("jw.r")
    public int[] field3345;

    @ObfuscatedName("jw.j")
    public short[] field3346;

    @ObfuscatedName("jw.p")
    public short[] field3347;

    @ObfuscatedName("jw.e")
    public short[] field3341;

    @ObfuscatedName("jw.s")
    public short[] field3349;

    @ObfuscatedName("jw.v")
    public int[] field3350 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jw.k")
    public boolean field3342 = false;

    @ObfuscatedName("ea.y(Liu;Liu;I)V")
    public static void method2862(class250 arg0, class250 arg1) {
        Statics.field3348 = arg0;
        Statics.field3866 = arg1;
        Statics.field3351 = Statics.field3348.method4287(3);
    }

    @ObfuscatedName("by.c(IB)Ljw;")
    public static class263 method1702(int arg0) {
        class263 var1 = (class263) field3343.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3348.method4263(3, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4527(new class185(var2));
        }
        field3343.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jw.n(Lge;S)V")
    public void method4527(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4552(arg0, var2);
        }
    }

    @ObfuscatedName("jw.u(Lge;II)V")
    public void method4552(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3344 = arg0.method3299();
        } else if (arg1 == 2) {
            int var3 = arg0.method3299();
            this.field3345 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3345[var4] = arg0.method3280();
            }
        } else if (arg1 == 3) {
            this.field3342 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3299();
            this.field3346 = new short[var5];
            this.field3347 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3346[var6] = (short) arg0.method3280();
                this.field3347[var6] = (short) arg0.method3280();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3299();
            this.field3341 = new short[var7];
            this.field3349 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3341[var8] = (short) arg0.method3280();
                this.field3349[var8] = (short) arg0.method3280();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3350[arg1 - 60] = arg0.method3280();
        }
    }

    @ObfuscatedName("jw.i(I)Z")
    public boolean method4530() {
        if (this.field3345 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3345.length; var2++) {
            if (!Statics.field3866.method4323(this.field3345[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jw.p(S)Ldz;")
    public class116 method4531() {
        if (this.field3345 == null) {
            return null;
        }
        class116[] var1 = new class116[this.field3345.length];
        for (int var2 = 0; var2 < this.field3345.length; var2++) {
            var1[var2] = class116.method2378(Statics.field3866, this.field3345[var2], 0);
        }
        class116 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class116(var1, var1.length);
        }
        if (this.field3346 != null) {
            for (int var4 = 0; var4 < this.field3346.length; var4++) {
                var3.method2386(this.field3346[var4], this.field3347[var4]);
            }
        }
        if (this.field3341 != null) {
            for (int var5 = 0; var5 < this.field3341.length; var5++) {
                var3.method2392(this.field3341[var5], this.field3349[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jw.e(I)Z")
    public boolean method4532() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3350[var2] != -1 && !Statics.field3866.method4323(this.field3350[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jw.s(I)Ldz;")
    public class116 method4533() {
        class116[] var1 = new class116[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3350[var3] != -1) {
                var1[var2++] = class116.method2378(Statics.field3866, this.field3350[var3], 0);
            }
        }
        class116 var4 = new class116(var1, var2);
        if (this.field3346 != null) {
            for (int var5 = 0; var5 < this.field3346.length; var5++) {
                var4.method2386(this.field3346[var5], this.field3347[var5]);
            }
        }
        if (this.field3341 != null) {
            for (int var6 = 0; var6 < this.field3341.length; var6++) {
                var4.method2392(this.field3341[var6], this.field3349[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ev.v(I)V")
    public static void method2960() {
        field3343.method3695();
    }
}

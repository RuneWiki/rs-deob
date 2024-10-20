package deob;

@ObfuscatedName("ib")
public class class248 extends class195 {

    @ObfuscatedName("ib.o")
    public static class190 field3355 = new class190(64);

    @ObfuscatedName("ib.g")
    public int field3350 = -1;

    @ObfuscatedName("ib.v")
    public int[] field3346;

    @ObfuscatedName("ib.p")
    public short[] field3351;

    @ObfuscatedName("ib.e")
    public short[] field3352;

    @ObfuscatedName("ib.d")
    public short[] field3354;

    @ObfuscatedName("ib.x")
    public short[] field3358;

    @ObfuscatedName("ib.z")
    public int[] field3356 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ib.n")
    public boolean field3357 = false;

    @ObfuscatedName("al.w(Lip;Lip;S)V")
    public static void method459(class236 arg0, class236 arg1) {
        Statics.field3349 = arg0;
        Statics.field3347 = arg1;
        Statics.field3348 = Statics.field3349.method3908(3);
    }

    @ObfuscatedName("fo.s(II)Lib;")
    public static class248 method2897(int arg0) {
        class248 var1 = (class248) field3355.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3349.method3876(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4133(new class174(var2));
        }
        field3355.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.q(Lfz;I)V")
    public void method4133(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4112(arg0, var2);
        }
    }

    @ObfuscatedName("ib.o(Lfz;IB)V")
    public void method4112(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3350 = arg0.method2971();
        } else if (arg1 == 2) {
            int var3 = arg0.method2971();
            this.field3346 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3346[var4] = arg0.method3178();
            }
        } else if (arg1 == 3) {
            this.field3357 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2971();
            this.field3351 = new short[var5];
            this.field3352 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3351[var6] = (short) arg0.method3178();
                this.field3352[var6] = (short) arg0.method3178();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2971();
            this.field3354 = new short[var7];
            this.field3358 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3354[var8] = (short) arg0.method3178();
                this.field3358[var8] = (short) arg0.method3178();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3356[arg1 - 60] = arg0.method3178();
        }
    }

    @ObfuscatedName("ib.g(B)Z")
    public boolean method4107() {
        if (this.field3346 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3346.length; var2++) {
            if (!Statics.field3347.method3878(this.field3346[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ib.v(I)Ldo;")
    public class126 method4108() {
        if (this.field3346 == null) {
            return null;
        }
        class126[] var1 = new class126[this.field3346.length];
        for (int var2 = 0; var2 < this.field3346.length; var2++) {
            var1[var2] = class126.method2334(Statics.field3347, this.field3346[var2], 0);
        }
        class126 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class126(var1, var1.length);
        }
        if (this.field3351 != null) {
            for (int var4 = 0; var4 < this.field3351.length; var4++) {
                var3.method2267(this.field3351[var4], this.field3352[var4]);
            }
        }
        if (this.field3354 != null) {
            for (int var5 = 0; var5 < this.field3354.length; var5++) {
                var3.method2295(this.field3354[var5], this.field3358[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ib.p(S)Z")
    public boolean method4109() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3356[var2] != -1 && !Statics.field3347.method3878(this.field3356[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ib.e(I)Ldo;")
    public class126 method4125() {
        class126[] var1 = new class126[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3356[var3] != -1) {
                var1[var2++] = class126.method2334(Statics.field3347, this.field3356[var3], 0);
            }
        }
        class126 var4 = new class126(var1, var2);
        if (this.field3351 != null) {
            for (int var5 = 0; var5 < this.field3351.length; var5++) {
                var4.method2267(this.field3351[var5], this.field3352[var5]);
            }
        }
        if (this.field3354 != null) {
            for (int var6 = 0; var6 < this.field3354.length; var6++) {
                var4.method2295(this.field3354[var6], this.field3358[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fa.d(I)V")
    public static void method3217() {
        field3355.method3361();
    }
}

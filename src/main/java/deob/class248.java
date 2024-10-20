package deob;

@ObfuscatedName("iq")
public class class248 extends class195 {

    @ObfuscatedName("iq.u")
    public static class190 field3327 = new class190(64);

    @ObfuscatedName("iq.g")
    public int field3328 = -1;

    @ObfuscatedName("iq.m")
    public int[] field3336;

    @ObfuscatedName("iq.s")
    public short[] field3330;

    @ObfuscatedName("iq.x")
    public short[] field3331;

    @ObfuscatedName("iq.p")
    public short[] field3332;

    @ObfuscatedName("iq.k")
    public short[] field3325;

    @ObfuscatedName("iq.r")
    public int[] field3334 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("iq.w")
    public boolean field3326 = false;

    @ObfuscatedName("ji.c(IB)Liq;")
    public static class248 method4432(int arg0) {
        class248 var1 = (class248) field3327.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3335.method3741(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method3956(new class174(var2));
        }
        field3327.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.o(Lfp;I)V")
    public void method3956(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method3953(arg0, var2);
        }
    }

    @ObfuscatedName("iq.i(Lfp;IB)V")
    public void method3953(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3328 = arg0.method2843();
        } else if (arg1 == 2) {
            int var3 = arg0.method2843();
            this.field3336 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3336[var4] = arg0.method2861();
            }
        } else if (arg1 == 3) {
            this.field3326 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2843();
            this.field3330 = new short[var5];
            this.field3331 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3330[var6] = (short) arg0.method2861();
                this.field3331[var6] = (short) arg0.method2861();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2843();
            this.field3332 = new short[var7];
            this.field3325 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3332[var8] = (short) arg0.method2861();
                this.field3325[var8] = (short) arg0.method2861();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3334[arg1 - 60] = arg0.method2861();
        }
    }

    @ObfuscatedName("iq.u(B)Z")
    public boolean method3961() {
        if (this.field3336 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3336.length; var2++) {
            if (!Statics.field3329.method3716(this.field3336[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iq.g(B)Ldj;")
    public class128 method3955() {
        if (this.field3336 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3336.length];
        for (int var2 = 0; var2 < this.field3336.length; var2++) {
            var1[var2] = class128.method2138(Statics.field3329, this.field3336[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3330 != null) {
            for (int var4 = 0; var4 < this.field3330.length; var4++) {
                var3.method2153(this.field3330[var4], this.field3331[var4]);
            }
        }
        if (this.field3332 != null) {
            for (int var5 = 0; var5 < this.field3332.length; var5++) {
                var3.method2154(this.field3332[var5], this.field3325[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("iq.m(B)Z")
    public boolean method3951() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3334[var2] != -1 && !Statics.field3329.method3716(this.field3334[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iq.s(S)Ldj;")
    public class128 method3954() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3334[var3] != -1) {
                var1[var2++] = class128.method2138(Statics.field3329, this.field3334[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3330 != null) {
            for (int var5 = 0; var5 < this.field3330.length; var5++) {
                var4.method2153(this.field3330[var5], this.field3331[var5]);
            }
        }
        if (this.field3332 != null) {
            for (int var6 = 0; var6 < this.field3332.length; var6++) {
                var4.method2154(this.field3332[var6], this.field3325[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cz.x(S)V")
    public static void method1533() {
        field3327.method3223();
    }
}

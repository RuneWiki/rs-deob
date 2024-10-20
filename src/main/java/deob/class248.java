package deob;

@ObfuscatedName("ir")
public class class248 extends class195 {

    @ObfuscatedName("ir.q")
    public static class190 field3341 = new class190(64);

    @ObfuscatedName("ir.g")
    public int field3338 = -1;

    @ObfuscatedName("ir.v")
    public int[] field3343;

    @ObfuscatedName("ir.t")
    public short[] field3344;

    @ObfuscatedName("ir.p")
    public short[] field3345;

    @ObfuscatedName("ir.l")
    public short[] field3346;

    @ObfuscatedName("ir.a")
    public short[] field3347;

    @ObfuscatedName("ir.k")
    public int[] field3348 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ir.r")
    public boolean field3349 = false;

    @ObfuscatedName("dh.i(II)Lir;")
    public static class248 method1963(int arg0) {
        class248 var1 = (class248) field3341.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3340.method3836(3, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4107(new class174(var2));
        }
        field3341.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.h(Lfv;I)V")
    public void method4107(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4088(arg0, var2);
        }
    }

    @ObfuscatedName("ir.u(Lfv;IB)V")
    public void method4088(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3338 = arg0.method2930();
        } else if (arg1 == 2) {
            int var3 = arg0.method2930();
            this.field3343 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3343[var4] = arg0.method2932();
            }
        } else if (arg1 == 3) {
            this.field3349 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2930();
            this.field3344 = new short[var5];
            this.field3345 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3344[var6] = (short) arg0.method2932();
                this.field3345[var6] = (short) arg0.method2932();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2930();
            this.field3346 = new short[var7];
            this.field3347 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3346[var8] = (short) arg0.method2932();
                this.field3347[var8] = (short) arg0.method2932();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3348[arg1 - 60] = arg0.method2932();
        }
    }

    @ObfuscatedName("ir.q(I)Z")
    public boolean method4089() {
        if (this.field3343 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3343.length; var2++) {
            if (!Statics.field3342.method3838(this.field3343[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.g(I)Ldf;")
    public class128 method4086() {
        if (this.field3343 == null) {
            return null;
        }
        class128[] var1 = new class128[this.field3343.length];
        for (int var2 = 0; var2 < this.field3343.length; var2++) {
            var1[var2] = class128.method2227(Statics.field3342, this.field3343[var2], 0);
        }
        class128 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class128(var1, var1.length);
        }
        if (this.field3344 != null) {
            for (int var4 = 0; var4 < this.field3344.length; var4++) {
                var3.method2289(this.field3344[var4], this.field3345[var4]);
            }
        }
        if (this.field3346 != null) {
            for (int var5 = 0; var5 < this.field3346.length; var5++) {
                var3.method2295(this.field3346[var5], this.field3347[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ir.v(I)Z")
    public boolean method4091() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3348[var2] != -1 && !Statics.field3342.method3838(this.field3348[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.t(B)Ldf;")
    public class128 method4096() {
        class128[] var1 = new class128[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3348[var3] != -1) {
                var1[var2++] = class128.method2227(Statics.field3342, this.field3348[var3], 0);
            }
        }
        class128 var4 = new class128(var1, var2);
        if (this.field3344 != null) {
            for (int var5 = 0; var5 < this.field3344.length; var5++) {
                var4.method2289(this.field3344[var5], this.field3345[var5]);
            }
        }
        if (this.field3346 != null) {
            for (int var6 = 0; var6 < this.field3346.length; var6++) {
                var4.method2295(this.field3346[var6], this.field3347[var6]);
            }
        }
        return var4;
    }
}

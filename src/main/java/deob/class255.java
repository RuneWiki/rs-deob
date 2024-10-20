package deob;

@ObfuscatedName("if")
public class class255 extends class202 {

    @ObfuscatedName("if.g")
    public static class197 field3409 = new class197(64);

    @ObfuscatedName("if.x")
    public int field3403 = -1;

    @ObfuscatedName("if.f")
    public int[] field3404;

    @ObfuscatedName("if.u")
    public short[] field3410;

    @ObfuscatedName("if.t")
    public short[] field3401;

    @ObfuscatedName("if.k")
    public short[] field3407;

    @ObfuscatedName("if.n")
    public short[] field3408;

    @ObfuscatedName("if.d")
    public int[] field3402 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("if.o")
    public boolean field3406 = false;

    @ObfuscatedName("if.s(Lfs;B)V")
    public void method4052(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4053(arg0, var2);
        }
    }

    @ObfuscatedName("if.r(Lfs;II)V")
    public void method4053(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3403 = arg0.method2945();
        } else if (arg1 == 2) {
            int var3 = arg0.method2945();
            this.field3404 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3404[var4] = arg0.method3081();
            }
        } else if (arg1 == 3) {
            this.field3406 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2945();
            this.field3410 = new short[var5];
            this.field3401 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3410[var6] = (short) arg0.method3081();
                this.field3401[var6] = (short) arg0.method3081();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2945();
            this.field3407 = new short[var7];
            this.field3408 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3407[var8] = (short) arg0.method3081();
                this.field3408[var8] = (short) arg0.method3081();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3402[arg1 - 60] = arg0.method3081();
        }
    }

    @ObfuscatedName("if.g(I)Z")
    public boolean method4054() {
        if (this.field3404 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3404.length; var2++) {
            if (!Statics.field3400.method3866(this.field3404[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("if.x(B)Lda;")
    public class127 method4055() {
        if (this.field3404 == null) {
            return null;
        }
        class127[] var1 = new class127[this.field3404.length];
        for (int var2 = 0; var2 < this.field3404.length; var2++) {
            var1[var2] = class127.method2220(Statics.field3400, this.field3404[var2], 0);
        }
        class127 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class127(var1, var1.length);
        }
        if (this.field3410 != null) {
            for (int var4 = 0; var4 < this.field3410.length; var4++) {
                var3.method2232(this.field3410[var4], this.field3401[var4]);
            }
        }
        if (this.field3407 != null) {
            for (int var5 = 0; var5 < this.field3407.length; var5++) {
                var3.method2233(this.field3407[var5], this.field3408[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("if.f(S)Z")
    public boolean method4056() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3402[var2] != -1 && !Statics.field3400.method3866(this.field3402[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("if.u(I)Lda;")
    public class127 method4057() {
        class127[] var1 = new class127[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3402[var3] != -1) {
                var1[var2++] = class127.method2220(Statics.field3400, this.field3402[var3], 0);
            }
        }
        class127 var4 = new class127(var1, var2);
        if (this.field3410 != null) {
            for (int var5 = 0; var5 < this.field3410.length; var5++) {
                var4.method2232(this.field3410[var5], this.field3401[var5]);
            }
        }
        if (this.field3407 != null) {
            for (int var6 = 0; var6 < this.field3407.length; var6++) {
                var4.method2233(this.field3407[var6], this.field3408[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hh.t(B)V")
    public static void method3790() {
        field3409.method3333();
    }
}

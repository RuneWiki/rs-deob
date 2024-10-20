package deob;

@ObfuscatedName("iy")
public class class249 extends class196 {

    @ObfuscatedName("iy.r")
    public static class191 field3356 = new class191(64);

    @ObfuscatedName("iy.o")
    public int field3354 = -1;

    @ObfuscatedName("iy.n")
    public int[] field3357;

    @ObfuscatedName("iy.q")
    public short[] field3352;

    @ObfuscatedName("iy.b")
    public short[] field3353;

    @ObfuscatedName("iy.k")
    public short[] field3358;

    @ObfuscatedName("iy.s")
    public short[] field3359;

    @ObfuscatedName("iy.d")
    public int[] field3360 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("iy.l")
    public boolean field3361 = false;

    @ObfuscatedName("hm.i(IB)Liy;")
    public static class249 method3794(int arg0) {
        class249 var1 = (class249) field3356.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field685.method3824(3, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method4046(new class175(var2));
        }
        field3356.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.j(Lfp;I)V")
    public void method4046(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4049(arg0, var2);
        }
    }

    @ObfuscatedName("iy.a(Lfp;II)V")
    public void method4049(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3354 = arg0.method2999();
        } else if (arg1 == 2) {
            int var3 = arg0.method2999();
            this.field3357 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3357[var4] = arg0.method2995();
            }
        } else if (arg1 == 3) {
            this.field3361 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2999();
            this.field3352 = new short[var5];
            this.field3353 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3352[var6] = (short) arg0.method2995();
                this.field3353[var6] = (short) arg0.method2995();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2999();
            this.field3358 = new short[var7];
            this.field3359 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3358[var8] = (short) arg0.method2995();
                this.field3359[var8] = (short) arg0.method2995();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3360[arg1 - 60] = arg0.method2995();
        }
    }

    @ObfuscatedName("iy.r(I)Z")
    public boolean method4061() {
        if (this.field3357 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3357.length; var2++) {
            if (!Statics.field3658.method3826(this.field3357[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iy.o(S)Lde;")
    public class127 method4066() {
        if (this.field3357 == null) {
            return null;
        }
        class127[] var1 = new class127[this.field3357.length];
        for (int var2 = 0; var2 < this.field3357.length; var2++) {
            var1[var2] = class127.method2209(Statics.field3658, this.field3357[var2], 0);
        }
        class127 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class127(var1, var1.length);
        }
        if (this.field3352 != null) {
            for (int var4 = 0; var4 < this.field3352.length; var4++) {
                var3.method2258(this.field3352[var4], this.field3353[var4]);
            }
        }
        if (this.field3358 != null) {
            for (int var5 = 0; var5 < this.field3358.length; var5++) {
                var3.method2260(this.field3358[var5], this.field3359[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("iy.n(I)Z")
    public boolean method4050() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3360[var2] != -1 && !Statics.field3658.method3826(this.field3360[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iy.q(I)Lde;")
    public class127 method4051() {
        class127[] var1 = new class127[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3360[var3] != -1) {
                var1[var2++] = class127.method2209(Statics.field3658, this.field3360[var3], 0);
            }
        }
        class127 var4 = new class127(var1, var2);
        if (this.field3352 != null) {
            for (int var5 = 0; var5 < this.field3352.length; var5++) {
                var4.method2258(this.field3352[var5], this.field3353[var5]);
            }
        }
        if (this.field3358 != null) {
            for (int var6 = 0; var6 < this.field3358.length; var6++) {
                var4.method2260(this.field3358[var6], this.field3359[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fx.b(I)V")
    public static void method2848() {
        field3356.method3355();
    }
}

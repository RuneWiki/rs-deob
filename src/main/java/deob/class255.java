package deob;

@ObfuscatedName("ik")
public class class255 extends class202 {

    @ObfuscatedName("ik.z")
    public static class197 field3421 = new class197(64);

    @ObfuscatedName("ik.v")
    public int field3425 = -1;

    @ObfuscatedName("ik.m")
    public int[] field3418;

    @ObfuscatedName("ik.b")
    public short[] field3424;

    @ObfuscatedName("ik.t")
    public short[] field3423;

    @ObfuscatedName("ik.p")
    public short[] field3426;

    @ObfuscatedName("ik.r")
    public short[] field3427;

    @ObfuscatedName("ik.l")
    public int[] field3429 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ik.u")
    public boolean field3431 = false;

    @ObfuscatedName("if.d(Lid;Lid;I)V")
    public static void method4134(class243 arg0, class243 arg1) {
        Statics.field3422 = arg0;
        Statics.field3419 = arg1;
        Statics.field3420 = Statics.field3422.method3946(3);
    }

    @ObfuscatedName("fv.x(IB)Lik;")
    public static class255 method3262(int arg0) {
        class255 var1 = (class255) field3421.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3422.method3935(3, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4180(new class181(var2));
        }
        field3421.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.k(Lfr;B)V")
    public void method4180(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4181(arg0, var2);
        }
    }

    @ObfuscatedName("ik.z(Lfr;II)V")
    public void method4181(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3425 = arg0.method3204();
        } else if (arg1 == 2) {
            int var3 = arg0.method3204();
            this.field3418 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3418[var4] = arg0.method3179();
            }
        } else if (arg1 == 3) {
            this.field3431 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3204();
            this.field3424 = new short[var5];
            this.field3423 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3424[var6] = (short) arg0.method3179();
                this.field3423[var6] = (short) arg0.method3179();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3204();
            this.field3426 = new short[var7];
            this.field3427 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3426[var8] = (short) arg0.method3179();
                this.field3427[var8] = (short) arg0.method3179();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3429[arg1 - 60] = arg0.method3179();
        }
    }

    @ObfuscatedName("ik.v(B)Z")
    public boolean method4182() {
        if (this.field3418 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3418.length; var2++) {
            if (!Statics.field3419.method3992(this.field3418[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ik.m(I)Ldr;")
    public class127 method4183() {
        if (this.field3418 == null) {
            return null;
        }
        class127[] var1 = new class127[this.field3418.length];
        for (int var2 = 0; var2 < this.field3418.length; var2++) {
            var1[var2] = class127.method2294(Statics.field3419, this.field3418[var2], 0);
        }
        class127 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class127(var1, var1.length);
        }
        if (this.field3424 != null) {
            for (int var4 = 0; var4 < this.field3424.length; var4++) {
                var3.method2306(this.field3424[var4], this.field3423[var4]);
            }
        }
        if (this.field3426 != null) {
            for (int var5 = 0; var5 < this.field3426.length; var5++) {
                var3.method2307(this.field3426[var5], this.field3427[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ik.b(I)Z")
    public boolean method4196() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3429[var2] != -1 && !Statics.field3419.method3992(this.field3429[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ik.t(I)Ldr;")
    public class127 method4185() {
        class127[] var1 = new class127[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3429[var3] != -1) {
                var1[var2++] = class127.method2294(Statics.field3419, this.field3429[var3], 0);
            }
        }
        class127 var4 = new class127(var1, var2);
        if (this.field3424 != null) {
            for (int var5 = 0; var5 < this.field3424.length; var5++) {
                var4.method2306(this.field3424[var5], this.field3423[var5]);
            }
        }
        if (this.field3426 != null) {
            for (int var6 = 0; var6 < this.field3426.length; var6++) {
                var4.method2307(this.field3426[var6], this.field3427[var6]);
            }
        }
        return var4;
    }
}

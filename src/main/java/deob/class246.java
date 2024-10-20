package deob;

@ObfuscatedName("iq")
public class class246 extends class176 {

    @ObfuscatedName("iq.g")
    public static class146 field3241 = new class146(64);

    @ObfuscatedName("iq.l")
    public int field3244 = -1;

    @ObfuscatedName("iq.u")
    public int[] field3243;

    @ObfuscatedName("iq.j")
    public short[] field3240;

    @ObfuscatedName("iq.v")
    public short[] field3245;

    @ObfuscatedName("iq.d")
    public short[] field3238;

    @ObfuscatedName("iq.z")
    public short[] field3247;

    @ObfuscatedName("iq.n")
    public int[] field3239 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("iq.h")
    public boolean field3249 = false;

    @ObfuscatedName("al.c(Lhz;Lhz;I)V")
    public static void method470(class234 arg0, class234 arg1) {
        Statics.field3242 = arg0;
        Statics.field3248 = arg1;
        Statics.field3246 = Statics.field3242.method3837(3);
    }

    @ObfuscatedName("go.x(II)Liq;")
    public static class246 method3388(int arg0) {
        class246 var1 = (class246) field3241.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3242.method3825(3, arg0);
        class246 var3 = new class246();
        if (var2 != null) {
            var3.method4111(new class300(var2));
        }
        field3241.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.t(Lkz;I)V")
    public void method4111(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4112(arg0, var2);
        }
    }

    @ObfuscatedName("iq.g(Lkz;II)V")
    public void method4112(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3244 = arg0.method5103();
        } else if (arg1 == 2) {
            int var3 = arg0.method5103();
            this.field3243 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3243[var4] = arg0.method5304();
            }
        } else if (arg1 == 3) {
            this.field3249 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5103();
            this.field3240 = new short[var5];
            this.field3245 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3240[var6] = (short) arg0.method5304();
                this.field3245[var6] = (short) arg0.method5304();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5103();
            this.field3238 = new short[var7];
            this.field3247 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3238[var8] = (short) arg0.method5304();
                this.field3247[var8] = (short) arg0.method5304();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3239[arg1 - 60] = arg0.method5304();
        }
    }

    @ObfuscatedName("iq.l(I)Z")
    public boolean method4116() {
        if (this.field3243 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3243.length; var2++) {
            if (!Statics.field3248.method3827(this.field3243[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iq.u(B)Lds;")
    public class122 method4131() {
        if (this.field3243 == null) {
            return null;
        }
        class122[] var1 = new class122[this.field3243.length];
        for (int var2 = 0; var2 < this.field3243.length; var2++) {
            var1[var2] = class122.method2525(Statics.field3248, this.field3243[var2], 0);
        }
        class122 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class122(var1, var1.length);
        }
        if (this.field3240 != null) {
            for (int var4 = 0; var4 < this.field3240.length; var4++) {
                var3.method2537(this.field3240[var4], this.field3245[var4]);
            }
        }
        if (this.field3238 != null) {
            for (int var5 = 0; var5 < this.field3238.length; var5++) {
                var3.method2538(this.field3238[var5], this.field3247[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("iq.j(I)Z")
    public boolean method4128() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3239[var2] != -1 && !Statics.field3248.method3827(this.field3239[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("iq.v(B)Lds;")
    public class122 method4115() {
        class122[] var1 = new class122[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3239[var3] != -1) {
                var1[var2++] = class122.method2525(Statics.field3248, this.field3239[var3], 0);
            }
        }
        class122 var4 = new class122(var1, var2);
        if (this.field3240 != null) {
            for (int var5 = 0; var5 < this.field3240.length; var5++) {
                var4.method2537(this.field3240[var5], this.field3245[var5]);
            }
        }
        if (this.field3238 != null) {
            for (int var6 = 0; var6 < this.field3238.length; var6++) {
                var4.method2538(this.field3238[var6], this.field3247[var6]);
            }
        }
        return var4;
    }
}

package deob;

@ObfuscatedName("if")
public class class246 extends class176 {

    @ObfuscatedName("if.k")
    public static class146 field3246 = new class146(64);

    @ObfuscatedName("if.u")
    public int field3247 = -1;

    @ObfuscatedName("if.n")
    public int[] field3251;

    @ObfuscatedName("if.t")
    public short[] field3249;

    @ObfuscatedName("if.q")
    public short[] field3244;

    @ObfuscatedName("if.x")
    public short[] field3245;

    @ObfuscatedName("if.d")
    public short[] field3252;

    @ObfuscatedName("if.f")
    public int[] field3253 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("if.c")
    public boolean field3250 = false;

    @ObfuscatedName("bw.s(II)Lif;")
    public static class246 method855(int arg0) {
        class246 var1 = (class246) field3246.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3696.method3790(3, arg0);
        class246 var3 = new class246();
        if (var2 != null) {
            var3.method4043(new class300(var2));
        }
        field3246.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.j(Lky;I)V")
    public void method4043(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4044(arg0, var2);
        }
    }

    @ObfuscatedName("if.i(Lky;IB)V")
    public void method4044(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3247 = arg0.method5179();
        } else if (arg1 == 2) {
            int var3 = arg0.method5179();
            this.field3251 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3251[var4] = arg0.method5054();
            }
        } else if (arg1 == 3) {
            this.field3250 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method5179();
            this.field3249 = new short[var5];
            this.field3244 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3249[var6] = (short) arg0.method5054();
                this.field3244[var6] = (short) arg0.method5054();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5179();
            this.field3245 = new short[var7];
            this.field3252 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3245[var8] = (short) arg0.method5054();
                this.field3252[var8] = (short) arg0.method5054();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3253[arg1 - 60] = arg0.method5054();
        }
    }

    @ObfuscatedName("if.k(I)Z")
    public boolean method4045() {
        if (this.field3251 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3251.length; var2++) {
            if (!Statics.field3254.method3845(this.field3251[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("if.u(I)Ldq;")
    public class122 method4046() {
        if (this.field3251 == null) {
            return null;
        }
        class122[] var1 = new class122[this.field3251.length];
        for (int var2 = 0; var2 < this.field3251.length; var2++) {
            var1[var2] = class122.method2521(Statics.field3254, this.field3251[var2], 0);
        }
        class122 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class122(var1, var1.length);
        }
        if (this.field3249 != null) {
            for (int var4 = 0; var4 < this.field3249.length; var4++) {
                var3.method2534(this.field3249[var4], this.field3244[var4]);
            }
        }
        if (this.field3245 != null) {
            for (int var5 = 0; var5 < this.field3245.length; var5++) {
                var3.method2535(this.field3245[var5], this.field3252[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("if.n(I)Z")
    public boolean method4047() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3253[var2] != -1 && !Statics.field3254.method3845(this.field3253[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("if.t(I)Ldq;")
    public class122 method4048() {
        class122[] var1 = new class122[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3253[var3] != -1) {
                var1[var2++] = class122.method2521(Statics.field3254, this.field3253[var3], 0);
            }
        }
        class122 var4 = new class122(var1, var2);
        if (this.field3249 != null) {
            for (int var5 = 0; var5 < this.field3249.length; var5++) {
                var4.method2534(this.field3249[var5], this.field3244[var5]);
            }
        }
        if (this.field3245 != null) {
            for (int var6 = 0; var6 < this.field3245.length; var6++) {
                var4.method2535(this.field3245[var6], this.field3252[var6]);
            }
        }
        return var4;
    }
}

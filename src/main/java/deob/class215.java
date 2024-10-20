package deob;

@ObfuscatedName("hd")
public class class215 {

    @ObfuscatedName("hd.u")
    public int[] field2544;

    @ObfuscatedName("hd.f")
    public int[] field2546;

    @ObfuscatedName("hd.b")
    public boolean field2542;

    @ObfuscatedName("hd.g")
    public int field2545;

    @ObfuscatedName("hd.z")
    public long field2548;

    @ObfuscatedName("hd.p")
    public long field2547;

    @ObfuscatedName("hd.k")
    public static final int[] field2550 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hd.x")
    public static class146 field2551 = new class146(260);

    @ObfuscatedName("hd.u([I[IZII)V")
    public void method3707(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3271; var6++) {
                    class246 var7 = class246.method1971(var6);
                    if (var7 != null && !var7.field3270 && var7.field3273 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2550[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2544 = arg0;
        this.field2546 = arg1;
        this.field2542 = arg2;
        this.field2545 = arg3;
        this.method3694();
    }

    @ObfuscatedName("hd.f(IZB)V")
    public void method3693(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2542) {
            return;
        }
        int var3 = this.field2544[field2550[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class246 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3271) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3271 - 1;
                }
            }
            var4 = class246.method1971(var3);
        } while (var4 == null || var4.field3270 || var4.field3273 != arg0 + (this.field2542 ? 7 : 0));
        this.field2544[field2550[arg0]] = var3 + 256;
        this.method3694();
    }

    @ObfuscatedName("hd.b(IZI)V")
    public void method3692(int arg0, boolean arg1) {
        int var3 = this.field2546[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field534[arg0].length) {
                    var3 = 0;
                }
            } while (!class216.method3314(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field534[arg0].length - 1;
                }
            } while (!class216.method3314(arg0, var3));
        }
        this.field2546[arg0] = var3;
        this.method3694();
    }

    @ObfuscatedName("hd.g(ZB)V")
    public void method3705(boolean arg0) {
        if (this.field2542 != arg0) {
            this.method3707((int[]) null, this.field2546, arg0, -1);
        }
    }

    @ObfuscatedName("hd.z(Lkg;B)V")
    public void method3720(class300 arg0) {
        arg0.method5290(this.field2542 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2544[field2550[var2]];
            if (var3 == 0) {
                arg0.method5290(-1);
            } else {
                arg0.method5290(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5290(this.field2546[var4]);
        }
    }

    @ObfuscatedName("hd.p(I)V")
    public void method3694() {
        long var1 = this.field2548;
        int var3 = this.field2544[5];
        int var4 = this.field2544[9];
        this.field2544[5] = var4;
        this.field2544[9] = var3;
        this.field2548 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2548 <<= 0x4;
            if (this.field2544[var5] >= 256) {
                this.field2548 += (long) (this.field2544[var5] - 256);
            }
        }
        if (this.field2544[0] >= 256) {
            this.field2548 += (long) (this.field2544[0] - 256 >> 4);
        }
        if (this.field2544[1] >= 256) {
            this.field2548 += (long) (this.field2544[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2548 <<= 0x3;
            this.field2548 += (long) this.field2546[var6];
        }
        this.field2548 <<= 0x1;
        this.field2548 += (long) (this.field2542 ? 1 : 0);
        this.field2544[5] = var3;
        this.field2544[9] = var4;
        if (var1 != 0L && this.field2548 != var1) {
            field2551.method3085(var1);
        }
    }

    @ObfuscatedName("hd.h(Liy;ILiy;IB)Ldf;")
    public class128 method3698(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field2545 != -1) {
            return class257.method4083(this.field2545).method4398(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2548;
        int[] var7 = this.field2544;
        if (arg0 != null && (arg0.field3529 >= 0 || arg0.field3527 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2544[var8];
            }
            if (arg0.field3529 >= 0) {
                var5 += (long) (arg0.field3529 - this.field2544[5] << 40);
                var7[5] = arg0.field3529;
            }
            if (arg0.field3527 >= 0) {
                var5 += (long) (arg0.field3527 - this.field2544[3] << 48);
                var7[3] = arg0.field3527;
            }
        }
        class128 var9 = (class128) field2551.method3076(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class246.method1971(var12 - 256).method4128()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class255.method1847(var12 - 512).method4337(this.field2542)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2547 != -1L) {
                    var9 = (class128) field2551.method3076(this.field2547);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class122[] var13 = new class122[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class122 var17 = class246.method1971(var16 - 256).method4148();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class122 var18 = class255.method1847(var16 - 512).method4341(this.field2542);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class122 var19 = new class122(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2546[var20] < Statics.field534[var20].length) {
                        var19.method2561(Statics.field2549[var20], Statics.field534[var20][this.field2546[var20]]);
                    }
                    if (this.field2546[var20] < Statics.field1538[var20].length) {
                        var19.method2561(Statics.field2543[var20], Statics.field1538[var20][this.field2546[var20]]);
                    }
                }
                var9 = var19.method2568(64, 850, -30, -50, -30);
                field2551.method3078(var9, var5);
                this.field2547 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class128 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4449(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4448(var9, arg3);
        } else {
            var21 = arg0.method4448(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hd.y(I)Ldq;")
    public class122 method3699() {
        if (this.field2545 != -1) {
            return class257.method4083(this.field2545).method4399();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2544[var2];
            if (var3 >= 256 && var3 < 512 && !class246.method1971(var3 - 256).method4130()) {
                var1 = true;
            }
            if (var3 >= 512 && !class255.method1847(var3 - 512).method4349(this.field2542)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class122[] var4 = new class122[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2544[var6];
            if (var7 >= 256 && var7 < 512) {
                class122 var8 = class246.method1971(var7 - 256).method4131();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class122 var9 = class255.method1847(var7 - 512).method4350(this.field2542);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class122 var10 = new class122(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2546[var11] < Statics.field534[var11].length) {
                var10.method2561(Statics.field2549[var11], Statics.field534[var11][this.field2546[var11]]);
            }
            if (this.field2546[var11] < Statics.field1538[var11].length) {
                var10.method2561(Statics.field2543[var11], Statics.field1538[var11][this.field2546[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hd.w(B)I")
    public int method3700() {
        return this.field2545 == -1 ? (this.field2544[11] << 5) + (this.field2544[8] << 10) + (this.field2544[0] << 15) + (this.field2546[0] << 25) + (this.field2546[4] << 20) + this.field2544[1] : 305419896 + class257.method4083(this.field2545).field3470;
    }

    @ObfuscatedName("gr.i(I)V")
    public static void method3605() {
        field2551.method3075();
    }
}

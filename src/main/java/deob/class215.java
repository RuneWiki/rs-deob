package deob;

@ObfuscatedName("hp")
public class class215 {

    @ObfuscatedName("hp.c")
    public int[] field2543;

    @ObfuscatedName("hp.t")
    public int[] field2541;

    @ObfuscatedName("hp.o")
    public boolean field2542;

    @ObfuscatedName("hp.e")
    public int field2544;

    @ObfuscatedName("hp.i")
    public long field2547;

    @ObfuscatedName("hp.g")
    public long field2545;

    @ObfuscatedName("hp.p")
    public static final int[] field2540 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hp.h")
    public static class146 field2549 = new class146(260);

    @ObfuscatedName("hp.c([I[IZII)V")
    public void method3688(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2089; var6++) {
                    class247 var7 = class247.method280(var6);
                    if (var7 != null && !var7.field3271 && var7.field3264 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2540[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2543 = arg0;
        this.field2541 = arg1;
        this.field2542 = arg2;
        this.field2544 = arg3;
        this.method3693();
    }

    @ObfuscatedName("hp.t(IZI)V")
    public void method3689(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2542) {
            return;
        }
        int var3 = this.field2543[field2540[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class247 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2089) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2089 - 1;
                }
            }
            var4 = class247.method280(var3);
        } while (var4 == null || var4.field3271 || var4.field3264 != (this.field2542 ? 7 : 0) + arg0);
        this.field2543[field2540[arg0]] = var3 + 256;
        this.method3693();
    }

    @ObfuscatedName("hp.o(IZI)V")
    public void method3690(int arg0, boolean arg1) {
        int var3 = this.field2541[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2546[arg0].length) {
                    var3 = 0;
                }
            } while (!class216.method3262(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2546[arg0].length - 1;
                }
            } while (!class216.method3262(arg0, var3));
        }
        this.field2541[arg0] = var3;
        this.method3693();
    }

    @ObfuscatedName("hp.e(ZI)V")
    public void method3687(boolean arg0) {
        if (this.field2542 != arg0) {
            this.method3688((int[]) null, this.field2541, arg0, -1);
        }
    }

    @ObfuscatedName("hp.i(Lkp;I)V")
    public void method3692(class301 arg0) {
        arg0.method5272(this.field2542 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2543[field2540[var2]];
            if (var3 == 0) {
                arg0.method5272(-1);
            } else {
                arg0.method5272(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5272(this.field2541[var4]);
        }
    }

    @ObfuscatedName("hp.g(B)V")
    public void method3693() {
        long var1 = this.field2547;
        int var3 = this.field2543[5];
        int var4 = this.field2543[9];
        this.field2543[5] = var4;
        this.field2543[9] = var3;
        this.field2547 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2547 <<= 0x4;
            if (this.field2543[var5] >= 256) {
                this.field2547 += (long) (this.field2543[var5] - 256);
            }
        }
        if (this.field2543[0] >= 256) {
            this.field2547 += (long) (this.field2543[0] - 256 >> 4);
        }
        if (this.field2543[1] >= 256) {
            this.field2547 += (long) (this.field2543[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2547 <<= 0x3;
            this.field2547 += (long) this.field2541[var6];
        }
        this.field2547 <<= 0x1;
        this.field2547 += (long) (this.field2542 ? 1 : 0);
        this.field2543[5] = var3;
        this.field2543[9] = var4;
        if (var1 != 0L && this.field2547 != var1) {
            field2549.method3101(var1);
        }
    }

    @ObfuscatedName("hp.d(Lip;ILip;IB)Ldx;")
    public class128 method3694(class260 arg0, int arg1, class260 arg2, int arg3) {
        if (this.field2544 != -1) {
            return class258.method3989(this.field2544).method4386(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2547;
        int[] var7 = this.field2543;
        if (arg0 != null && (arg0.field3521 >= 0 || arg0.field3513 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2543[var8];
            }
            if (arg0.field3521 >= 0) {
                var5 += (long) (arg0.field3521 - this.field2543[5] << 40);
                var7[5] = arg0.field3521;
            }
            if (arg0.field3513 >= 0) {
                var5 += (long) (arg0.field3513 - this.field2543[3] << 48);
                var7[3] = arg0.field3513;
            }
        }
        class128 var9 = (class128) field2549.method3100(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class247.method280(var12 - 256).method4132()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class256.method4164(var12 - 512).method4331(this.field2542)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2545 != -1L) {
                    var9 = (class128) field2549.method3100(this.field2545);
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
                        class122 var17 = class247.method280(var16 - 256).method4138();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class122 var18 = class256.method4164(var16 - 512).method4333(this.field2542);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class122 var19 = new class122(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2541[var20] < Statics.field2546[var20].length) {
                        var19.method2588(Statics.field129[var20], Statics.field2546[var20][this.field2541[var20]]);
                    }
                    if (this.field2541[var20] < Statics.field2515[var20].length) {
                        var19.method2588(Statics.field2548[var20], Statics.field2515[var20][this.field2541[var20]]);
                    }
                }
                var9 = var19.method2595(64, 850, -30, -50, -30);
                field2549.method3102(var9, var5);
                this.field2545 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class128 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4434(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4443(var9, arg3);
        } else {
            var21 = arg0.method4443(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hp.l(I)Ldg;")
    public class122 method3695() {
        if (this.field2544 != -1) {
            return class258.method3989(this.field2544).method4387();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2543[var2];
            if (var3 >= 256 && var3 < 512 && !class247.method280(var3 - 256).method4134()) {
                var1 = true;
            }
            if (var3 >= 512 && !class256.method4164(var3 - 512).method4332(this.field2542)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class122[] var4 = new class122[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2543[var6];
            if (var7 >= 256 && var7 < 512) {
                class122 var8 = class247.method280(var7 - 256).method4135();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class122 var9 = class256.method4164(var7 - 512).method4342(this.field2542);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class122 var10 = new class122(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2541[var11] < Statics.field2546[var11].length) {
                var10.method2588(Statics.field129[var11], Statics.field2546[var11][this.field2541[var11]]);
            }
            if (this.field2541[var11] < Statics.field2515[var11].length) {
                var10.method2588(Statics.field2548[var11], Statics.field2515[var11][this.field2541[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hp.j(I)I")
    public int method3696() {
        return this.field2544 == -1 ? (this.field2543[11] << 5) + (this.field2543[8] << 10) + (this.field2543[0] << 15) + (this.field2541[0] << 25) + (this.field2541[4] << 20) + this.field2543[1] : 305419896 + class258.method3989(this.field2544).field3475;
    }
}

package deob;

@ObfuscatedName("hh")
public class class215 {

    @ObfuscatedName("hh.q")
    public int[] field2535;

    @ObfuscatedName("hh.w")
    public int[] field2534;

    @ObfuscatedName("hh.e")
    public boolean field2536;

    @ObfuscatedName("hh.p")
    public int field2533;

    @ObfuscatedName("hh.k")
    public long field2540;

    @ObfuscatedName("hh.l")
    public long field2538;

    @ObfuscatedName("hh.m")
    public static final int[] field2539 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hh.u")
    public static class146 field2537 = new class146(260);

    @ObfuscatedName("hh.q([I[IZII)V")
    public void method3646(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3264; var6++) {
                    class246 var7 = class246.method3769(var6);
                    if (var7 != null && !var7.field3273 && var7.field3266 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2539[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2535 = arg0;
        this.field2534 = arg1;
        this.field2536 = arg2;
        this.field2533 = arg3;
        this.method3655();
    }

    @ObfuscatedName("hh.w(IZS)V")
    public void method3629(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2536) {
            return;
        }
        int var3 = this.field2535[field2539[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class246 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3264) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3264 - 1;
                }
            }
            var4 = class246.method3769(var3);
        } while (var4 == null || var4.field3273 || var4.field3266 != (this.field2536 ? 7 : 0) + arg0);
        this.field2535[field2539[arg0]] = var3 + 256;
        this.method3655();
    }

    @ObfuscatedName("hh.e(IZB)V")
    public void method3630(int arg0, boolean arg1) {
        int var3 = this.field2534[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field3292[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3292[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2534[arg0] = var3;
        this.method3655();
    }

    @ObfuscatedName("hh.p(ZI)V")
    public void method3643(boolean arg0) {
        if (this.field2536 != arg0) {
            this.method3646((int[]) null, this.field2534, arg0, -1);
        }
    }

    @ObfuscatedName("hh.k(Lkf;I)V")
    public void method3632(class301 arg0) {
        arg0.method5228(this.field2536 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2535[field2539[var2]];
            if (var3 == 0) {
                arg0.method5228(-1);
            } else {
                arg0.method5228(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5228(this.field2534[var4]);
        }
    }

    @ObfuscatedName("hh.l(I)V")
    public void method3655() {
        long var1 = this.field2540;
        int var3 = this.field2535[5];
        int var4 = this.field2535[9];
        this.field2535[5] = var4;
        this.field2535[9] = var3;
        this.field2540 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2540 <<= 0x4;
            if (this.field2535[var5] >= 256) {
                this.field2540 += (long) (this.field2535[var5] - 256);
            }
        }
        if (this.field2535[0] >= 256) {
            this.field2540 += (long) (this.field2535[0] - 256 >> 4);
        }
        if (this.field2535[1] >= 256) {
            this.field2540 += (long) (this.field2535[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2540 <<= 0x3;
            this.field2540 += (long) this.field2534[var6];
        }
        this.field2540 <<= 0x1;
        this.field2540 += (long) (this.field2536 ? 1 : 0);
        this.field2535[5] = var3;
        this.field2535[9] = var4;
        if (var1 != 0L && this.field2540 != var1) {
            field2537.method3047(var1);
        }
    }

    @ObfuscatedName("hh.b(Lis;ILis;IB)Ldm;")
    public class128 method3634(class259 arg0, int arg1, class259 arg2, int arg3) {
        if (this.field2533 != -1) {
            return class257.method867(this.field2533).method4322(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2540;
        int[] var7 = this.field2535;
        if (arg0 != null && (arg0.field3529 >= 0 || arg0.field3522 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2535[var8];
            }
            if (arg0.field3529 >= 0) {
                var5 += (long) (arg0.field3529 - this.field2535[5] << 40);
                var7[5] = arg0.field3529;
            }
            if (arg0.field3522 >= 0) {
                var5 += (long) (arg0.field3522 - this.field2535[3] << 48);
                var7[3] = arg0.field3522;
            }
        }
        class128 var9 = (class128) field2537.method3039(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class246.method3769(var12 - 256).method4057()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class255.method348(var12 - 512).method4263(this.field2536)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2538 != -1L) {
                    var9 = (class128) field2537.method3039(this.field2538);
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
                        class122 var17 = class246.method3769(var16 - 256).method4056();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class122 var18 = class255.method348(var16 - 512).method4311(this.field2536);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class122 var19 = new class122(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2534[var20] < Statics.field3292[var20].length) {
                        var19.method2526(Statics.field1871[var20], Statics.field3292[var20][this.field2534[var20]]);
                    }
                    if (this.field2534[var20] < Statics.field605[var20].length) {
                        var19.method2526(Statics.field310[var20], Statics.field605[var20][this.field2534[var20]]);
                    }
                }
                var9 = var19.method2545(64, 850, -30, -50, -30);
                field2537.method3041(var9, var5);
                this.field2538 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class128 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4380(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4399(var9, arg3);
        } else {
            var21 = arg0.method4399(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hh.i(I)Lds;")
    public class122 method3635() {
        if (this.field2533 != -1) {
            return class257.method867(this.field2533).method4323();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2535[var2];
            if (var3 >= 256 && var3 < 512 && !class246.method3769(var3 - 256).method4062()) {
                var1 = true;
            }
            if (var3 >= 512 && !class255.method348(var3 - 512).method4300(this.field2536)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class122[] var4 = new class122[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2535[var6];
            if (var7 >= 256 && var7 < 512) {
                class122 var8 = class246.method3769(var7 - 256).method4058();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class122 var9 = class255.method348(var7 - 512).method4266(this.field2536);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class122 var10 = new class122(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2534[var11] < Statics.field3292[var11].length) {
                var10.method2526(Statics.field1871[var11], Statics.field3292[var11][this.field2534[var11]]);
            }
            if (this.field2534[var11] < Statics.field605[var11].length) {
                var10.method2526(Statics.field310[var11], Statics.field605[var11][this.field2534[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hh.c(I)I")
    public int method3631() {
        return this.field2533 == -1 ? (this.field2535[11] << 5) + (this.field2535[8] << 10) + (this.field2535[0] << 15) + (this.field2534[0] << 25) + (this.field2534[4] << 20) + this.field2535[1] : 305419896 + class257.method867(this.field2533).field3468;
    }
}

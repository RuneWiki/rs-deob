package deob;

@ObfuscatedName("ho")
public class class225 {

    @ObfuscatedName("ho.s")
    public int[] field2728;

    @ObfuscatedName("ho.g")
    public int[] field2722;

    @ObfuscatedName("ho.m")
    public boolean field2730;

    @ObfuscatedName("ho.h")
    public int field2725;

    @ObfuscatedName("ho.i")
    public long field2726;

    @ObfuscatedName("ho.w")
    public long field2727;

    @ObfuscatedName("ho.c")
    public static final int[] field2731 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ho.o")
    public static class201 field2724 = new class201(260);

    @ObfuscatedName("ho.s([I[IZII)V")
    public void method4069(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3432; var6++) {
                    class259 var7 = class259.method4328(var6);
                    if (var7 != null && !var7.field3441 && (arg2 ? 7 : 0) + var5 == var7.field3430) {
                        arg0[field2731[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2728 = arg0;
        this.field2722 = arg1;
        this.field2730 = arg2;
        this.field2725 = arg3;
        this.method4074();
    }

    @ObfuscatedName("ho.g(IZI)V")
    public void method4091(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2730) {
            return;
        }
        int var3 = this.field2728[field2731[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class259 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3432) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3432 - 1;
                }
            }
            var4 = class259.method4328(var3);
        } while (var4 == null || var4.field3441 || var4.field3430 != (this.field2730 ? 7 : 0) + arg0);
        this.field2728[field2731[arg0]] = var3 + 256;
        this.method4074();
    }

    @ObfuscatedName("ho.m(IZB)V")
    public void method4071(int arg0, boolean arg1) {
        int var3 = this.field2722[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field238[arg0].length) {
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
                    var3 = Statics.field238[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2722[arg0] = var3;
        this.method4074();
    }

    @ObfuscatedName("ho.h(ZI)V")
    public void method4072(boolean arg0) {
        if (this.field2730 != arg0) {
            this.method4069((int[]) null, this.field2722, arg0, -1);
        }
    }

    @ObfuscatedName("ho.i(Lgy;I)V")
    public void method4070(class185 arg0) {
        arg0.method3223(this.field2730 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2728[field2731[var2]];
            if (var3 == 0) {
                arg0.method3223(-1);
            } else {
                arg0.method3223(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3223(this.field2722[var4]);
        }
    }

    @ObfuscatedName("ho.w(I)V")
    public void method4074() {
        long var1 = this.field2726;
        int var3 = this.field2728[5];
        int var4 = this.field2728[9];
        this.field2728[5] = var4;
        this.field2728[9] = var3;
        this.field2726 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2726 <<= 0x4;
            if (this.field2728[var5] >= 256) {
                this.field2726 += (long) (this.field2728[var5] - 256);
            }
        }
        if (this.field2728[0] >= 256) {
            this.field2726 += (long) (this.field2728[0] - 256 >> 4);
        }
        if (this.field2728[1] >= 256) {
            this.field2726 += (long) (this.field2728[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2726 <<= 0x3;
            this.field2726 += (long) this.field2722[var6];
        }
        this.field2726 <<= 0x1;
        this.field2726 += (long) (this.field2730 ? 1 : 0);
        this.field2728[5] = var3;
        this.field2728[9] = var4;
        if (var1 != 0L && this.field2726 != var1) {
            field2724.method3687(var1);
        }
    }

    @ObfuscatedName("ho.t(Lje;ILje;II)Les;")
    public class131 method4075(class272 arg0, int arg1, class272 arg2, int arg3) {
        if (this.field2725 != -1) {
            return class270.method4416(this.field2725).method4693(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2726;
        int[] var7 = this.field2728;
        if (arg0 != null && (arg0.field3682 >= 0 || arg0.field3687 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2728[var8];
            }
            if (arg0.field3682 >= 0) {
                var5 += (long) (arg0.field3682 - this.field2728[5] << 40);
                var7[5] = arg0.field3682;
            }
            if (arg0.field3687 >= 0) {
                var5 += (long) (arg0.field3687 - this.field2728[3] << 48);
                var7[3] = arg0.field3687;
            }
        }
        class131 var9 = (class131) field2724.method3673(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class259.method4328(var12 - 256).method4435()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class268.method965(var12 - 512).method4646(this.field2730)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2727 != -1L) {
                    var9 = (class131) field2724.method3673(this.field2727);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class125[] var13 = new class125[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class125 var17 = class259.method4328(var16 - 256).method4436();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class125 var18 = class268.method965(var16 - 512).method4647(this.field2730);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class125 var19 = new class125(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2722[var20] < Statics.field238[var20].length) {
                        var19.method2442(Statics.field2723[var20], Statics.field238[var20][this.field2722[var20]]);
                    }
                    if (this.field2722[var20] < Statics.field2729[var20].length) {
                        var19.method2442(Statics.field450[var20], Statics.field2729[var20][this.field2722[var20]]);
                    }
                }
                var9 = var19.method2450(64, 850, -30, -50, -30);
                field2724.method3675(var9, var5);
                this.field2727 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class131 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4751(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4748(var9, arg3);
        } else {
            var21 = arg0.method4748(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ho.d(I)Ldw;")
    public class125 method4096() {
        if (this.field2725 != -1) {
            return class270.method4416(this.field2725).method4724();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2728[var2];
            if (var3 >= 256 && var3 < 512 && !class259.method4328(var3 - 256).method4461()) {
                var1 = true;
            }
            if (var3 >= 512 && !class268.method965(var3 - 512).method4649(this.field2730)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class125[] var4 = new class125[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2728[var6];
            if (var7 >= 256 && var7 < 512) {
                class125 var8 = class259.method4328(var7 - 256).method4460();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class125 var9 = class268.method965(var7 - 512).method4686(this.field2730);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class125 var10 = new class125(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2722[var11] < Statics.field238[var11].length) {
                var10.method2442(Statics.field2723[var11], Statics.field238[var11][this.field2722[var11]]);
            }
            if (this.field2722[var11] < Statics.field2729[var11].length) {
                var10.method2442(Statics.field450[var11], Statics.field2729[var11][this.field2722[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ho.z(B)I")
    public int method4076() {
        return this.field2725 == -1 ? (this.field2728[11] << 5) + (this.field2728[8] << 10) + (this.field2728[0] << 15) + (this.field2722[0] << 25) + (this.field2722[4] << 20) + this.field2728[1] : 305419896 + class270.method4416(this.field2725).field3648;
    }
}

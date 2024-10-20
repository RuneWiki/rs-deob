package deob;

@ObfuscatedName("hw")
public class class214 {

    @ObfuscatedName("hw.p")
    public int[] field2627;

    @ObfuscatedName("hw.m")
    public int[] field2624;

    @ObfuscatedName("hw.e")
    public boolean field2626;

    @ObfuscatedName("hw.t")
    public int field2634;

    @ObfuscatedName("hw.w")
    public long field2628;

    @ObfuscatedName("hw.z")
    public long field2629;

    @ObfuscatedName("hw.o")
    public static final int[] field2632 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hw.q")
    public static class190 field2633 = new class190(260);

    @ObfuscatedName("hw.p([I[IZII)V")
    public void method3569(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3360; var6++) {
                    class248 var7 = class248.method965(var6);
                    if (var7 != null && !var7.field3369 && (arg2 ? 7 : 0) + var5 == var7.field3362) {
                        arg0[field2632[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2627 = arg0;
        this.field2624 = arg1;
        this.field2626 = arg2;
        this.field2634 = arg3;
        this.method3573();
    }

    @ObfuscatedName("hw.m(IZI)V")
    public void method3581(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2626) {
            return;
        }
        int var3 = this.field2627[field2632[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3360) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3360 - 1;
                }
            }
            var4 = class248.method965(var3);
        } while (var4 == null || var4.field3369 || arg0 + (this.field2626 ? 7 : 0) != var4.field3362);
        this.field2627[field2632[arg0]] = var3 + 256;
        this.method3573();
    }

    @ObfuscatedName("hw.e(IZB)V")
    public void method3570(int arg0, boolean arg1) {
        int var3 = this.field2624[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field250[arg0].length) {
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
                    var3 = Statics.field250[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2624[arg0] = var3;
        this.method3573();
    }

    @ObfuscatedName("hw.t(ZI)V")
    public void method3571(boolean arg0) {
        if (this.field2626 != arg0) {
            this.method3569((int[]) null, this.field2624, arg0, -1);
        }
    }

    @ObfuscatedName("hw.w(Lfr;I)V")
    public void method3572(class174 arg0) {
        arg0.method2961(this.field2626 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2627[field2632[var2]];
            if (var3 == 0) {
                arg0.method2961(-1);
            } else {
                arg0.method2961(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2961(this.field2624[var4]);
        }
    }

    @ObfuscatedName("hw.z(B)V")
    public void method3573() {
        long var1 = this.field2628;
        int var3 = this.field2627[5];
        int var4 = this.field2627[9];
        this.field2627[5] = var4;
        this.field2627[9] = var3;
        this.field2628 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2628 <<= 0x4;
            if (this.field2627[var5] >= 256) {
                this.field2628 += (long) (this.field2627[var5] - 256);
            }
        }
        if (this.field2627[0] >= 256) {
            this.field2628 += (long) (this.field2627[0] - 256 >> 4);
        }
        if (this.field2627[1] >= 256) {
            this.field2628 += (long) (this.field2627[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2628 <<= 0x3;
            this.field2628 += (long) this.field2624[var6];
        }
        this.field2628 <<= 0x1;
        this.field2628 += (long) (this.field2626 ? 1 : 0);
        this.field2627[5] = var3;
        this.field2627[9] = var4;
        if (var1 != 0L && this.field2628 != var1) {
            field2633.method3178(var1);
        }
    }

    @ObfuscatedName("hw.j(Ljo;ILjo;IB)Les;")
    public class134 method3574(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2634 != -1) {
            return class259.method2658(this.field2634).method4207(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2628;
        int[] var7 = this.field2627;
        if (arg0 != null && (arg0.field3616 >= 0 || arg0.field3617 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2627[var8];
            }
            if (arg0.field3616 >= 0) {
                var5 += (long) (arg0.field3616 - this.field2627[5] << 40);
                var7[5] = arg0.field3616;
            }
            if (arg0.field3617 >= 0) {
                var5 += (long) (arg0.field3617 - this.field2627[3] << 48);
                var7[3] = arg0.field3617;
            }
        }
        class134 var9 = (class134) field2633.method3182(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method965(var12 - 256).method3966()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class257.method3684(var12 - 512).method4143(this.field2626)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2629 != -1L) {
                    var9 = (class134) field2633.method3182(this.field2629);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class128[] var13 = new class128[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class128 var17 = class248.method965(var16 - 256).method3971();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = class257.method3684(var16 - 512).method4144(this.field2626);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2624[var20] < Statics.field250[var20].length) {
                        var19.method2149(Statics.field2630[var20], Statics.field250[var20][this.field2624[var20]]);
                    }
                    if (this.field2624[var20] < Statics.field241[var20].length) {
                        var19.method2149(Statics.field2631[var20], Statics.field241[var20][this.field2624[var20]]);
                    }
                }
                var9 = var19.method2148(64, 850, -30, -50, -30);
                field2633.method3179(var9, var5);
                this.field2629 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4278(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4271(var9, arg3);
        } else {
            var21 = arg0.method4271(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hw.c(I)Ldo;")
    public class128 method3575() {
        if (this.field2634 != -1) {
            return class259.method2658(this.field2634).method4213();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2627[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method965(var3 - 256).method3947()) {
                var1 = true;
            }
            if (var3 >= 512 && !class257.method3684(var3 - 512).method4145(this.field2626)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2627[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class248.method965(var7 - 256).method3948();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = class257.method3684(var7 - 512).method4146(this.field2626);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2624[var11] < Statics.field250[var11].length) {
                var10.method2149(Statics.field2630[var11], Statics.field250[var11][this.field2624[var11]]);
            }
            if (this.field2624[var11] < Statics.field241[var11].length) {
                var10.method2149(Statics.field2631[var11], Statics.field241[var11][this.field2624[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hw.o(I)I")
    public int method3597() {
        return this.field2634 == -1 ? (this.field2627[11] << 5) + (this.field2627[8] << 10) + (this.field2627[0] << 15) + (this.field2624[4] << 20) + (this.field2624[0] << 25) + this.field2627[1] : 305419896 + class259.method2658(this.field2634).field3558;
    }
}

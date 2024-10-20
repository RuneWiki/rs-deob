package deob;

@ObfuscatedName("hn")
public class class217 {

    @ObfuscatedName("hn.s")
    public int[] field2639;

    @ObfuscatedName("hn.c")
    public int[] field2636;

    @ObfuscatedName("hn.f")
    public boolean field2637;

    @ObfuscatedName("hn.m")
    public int field2638;

    @ObfuscatedName("hn.h")
    public long field2635;

    @ObfuscatedName("hn.t")
    public long field2644;

    @ObfuscatedName("hn.o")
    public static final int[] field2642 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hn.q")
    public static class193 field2643 = new class193(260);

    @ObfuscatedName("hn.s([I[IZIB)V")
    public void method3723(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3371; var6++) {
                    class251 var7 = class251.method58(var6);
                    if (var7 != null && !var7.field3373 && (arg2 ? 7 : 0) + var5 == var7.field3364) {
                        arg0[field2642[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2639 = arg0;
        this.field2636 = arg1;
        this.field2637 = arg2;
        this.field2638 = arg3;
        this.method3701();
    }

    @ObfuscatedName("hn.c(IZB)V")
    public void method3697(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2637) {
            return;
        }
        int var3 = this.field2639[field2642[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class251 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3371) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3371 - 1;
                }
            }
            var4 = class251.method58(var3);
        } while (var4 == null || var4.field3373 || (this.field2637 ? 7 : 0) + arg0 != var4.field3364);
        this.field2639[field2642[arg0]] = var3 + 256;
        this.method3701();
    }

    @ObfuscatedName("hn.f(IZI)V")
    public void method3698(int arg0, boolean arg1) {
        int var3 = this.field2636[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field817[arg0].length) {
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
                    var3 = Statics.field817[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2636[arg0] = var3;
        this.method3701();
    }

    @ObfuscatedName("hn.m(ZI)V")
    public void method3699(boolean arg0) {
        if (this.field2637 != arg0) {
            this.method3723((int[]) null, this.field2636, arg0, -1);
        }
    }

    @ObfuscatedName("hn.h(Lfs;I)V")
    public void method3700(class177 arg0) {
        arg0.method3129(this.field2637 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2639[field2642[var2]];
            if (var3 == 0) {
                arg0.method3129(-1);
            } else {
                arg0.method3129(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3129(this.field2636[var4]);
        }
    }

    @ObfuscatedName("hn.t(I)V")
    public void method3701() {
        long var1 = this.field2635;
        int var3 = this.field2639[5];
        int var4 = this.field2639[9];
        this.field2639[5] = var4;
        this.field2639[9] = var3;
        this.field2635 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2635 <<= 0x4;
            if (this.field2639[var5] >= 256) {
                this.field2635 += (long) (this.field2639[var5] - 256);
            }
        }
        if (this.field2639[0] >= 256) {
            this.field2635 += (long) (this.field2639[0] - 256 >> 4);
        }
        if (this.field2639[1] >= 256) {
            this.field2635 += (long) (this.field2639[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2635 <<= 0x3;
            this.field2635 += (long) this.field2636[var6];
        }
        this.field2635 <<= 0x1;
        this.field2635 += (long) (this.field2637 ? 1 : 0);
        this.field2639[5] = var3;
        this.field2639[9] = var4;
        if (var1 != 0L && this.field2635 != var1) {
            field2643.method3314(var1);
        }
    }

    @ObfuscatedName("hn.p(Ljw;ILjw;II)Leb;")
    public class134 method3702(class264 arg0, int arg1, class264 arg2, int arg3) {
        if (this.field2638 != -1) {
            return class262.method4152(this.field2638).method4373(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2635;
        int[] var7 = this.field2639;
        if (arg0 != null && (arg0.field3628 >= 0 || arg0.field3627 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2639[var8];
            }
            if (arg0.field3628 >= 0) {
                var5 += (long) (arg0.field3628 - this.field2639[5] << 40);
                var7[5] = arg0.field3628;
            }
            if (arg0.field3627 >= 0) {
                var5 += (long) (arg0.field3627 - this.field2639[3] << 48);
                var7[3] = arg0.field3627;
            }
        }
        class134 var9 = (class134) field2643.method3319(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class251.method58(var12 - 256).method4092()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class260.method3655(var12 - 512).method4295(this.field2637)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2644 != -1L) {
                    var9 = (class134) field2643.method3319(this.field2644);
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
                        class128 var17 = class251.method58(var16 - 256).method4099();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = class260.method3655(var16 - 512).method4325(this.field2637);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2636[var20] < Statics.field817[var20].length) {
                        var19.method2249(Statics.field1292[var20], Statics.field817[var20][this.field2636[var20]]);
                    }
                    if (this.field2636[var20] < Statics.field2414[var20].length) {
                        var19.method2249(Statics.field2641[var20], Statics.field2414[var20][this.field2636[var20]]);
                    }
                }
                var9 = var19.method2257(64, 850, -30, -50, -30);
                field2643.method3315(var9, var5);
                this.field2644 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4438(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4435(var9, arg3);
        } else {
            var21 = arg0.method4435(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hn.d(I)Ldn;")
    public class128 method3703() {
        if (this.field2638 != -1) {
            return class262.method4152(this.field2638).method4367();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2639[var2];
            if (var3 >= 256 && var3 < 512 && !class251.method58(var3 - 256).method4094()) {
                var1 = true;
            }
            if (var3 >= 512 && !class260.method3655(var3 - 512).method4304(this.field2637)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2639[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class251.method58(var7 - 256).method4095();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = class260.method3655(var7 - 512).method4303(this.field2637);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2636[var11] < Statics.field817[var11].length) {
                var10.method2249(Statics.field1292[var11], Statics.field817[var11][this.field2636[var11]]);
            }
            if (this.field2636[var11] < Statics.field2414[var11].length) {
                var10.method2249(Statics.field2641[var11], Statics.field2414[var11][this.field2636[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hn.n(I)I")
    public int method3704() {
        return this.field2638 == -1 ? (this.field2639[11] << 5) + (this.field2639[8] << 10) + (this.field2639[0] << 15) + (this.field2636[0] << 25) + (this.field2636[4] << 20) + this.field2639[1] : 305419896 + class262.method4152(this.field2638).field3568;
    }
}

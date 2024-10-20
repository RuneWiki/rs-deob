package deob;

@ObfuscatedName("fd")
public class class162 {

    @ObfuscatedName("fd.p")
    public int[] field2718;

    @ObfuscatedName("fd.j")
    public int[] field2714;

    @ObfuscatedName("fd.w")
    public boolean field2715;

    @ObfuscatedName("fd.h")
    public int field2724;

    @ObfuscatedName("fd.v")
    public long field2716;

    @ObfuscatedName("fd.k")
    public long field2717;

    @ObfuscatedName("fd.u")
    public static final int[] field2723 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fd.z")
    public static class169 field2719 = new class169(260);

    @ObfuscatedName("fd.p([I[IZIB)V")
    public void method3125(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field927; var6++) {
                    class35 var7 = class35.method2990(var6);
                    if (var7 != null && !var7.field930 && var7.field923 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2723[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2718 = arg0;
        this.field2714 = arg1;
        this.field2715 = arg2;
        this.field2724 = arg3;
        this.method3130();
    }

    @ObfuscatedName("fd.j(IZB)V")
    public void method3140(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2715) {
            return;
        }
        int var3 = this.field2718[field2723[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class35 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field927) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field927 - 1;
                }
            }
            var4 = class35.method2990(var3);
        } while (var4 == null || var4.field930 || arg0 + (this.field2715 ? 7 : 0) != var4.field923);
        this.field2718[field2723[arg0]] = var3 + 256;
        this.method3130();
    }

    @ObfuscatedName("fd.w(IZI)V")
    public void method3127(int arg0, boolean arg1) {
        int var3 = this.field2714[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2720[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2720[arg0].length - 1;
            }
        }
        this.field2714[arg0] = var3;
        this.method3130();
    }

    @ObfuscatedName("fd.h(ZS)V")
    public void method3128(boolean arg0) {
        if (this.field2715 != arg0) {
            this.method3125((int[]) null, this.field2714, arg0, -1);
        }
    }

    @ObfuscatedName("fd.v(Ldv;I)V")
    public void method3129(class126 arg0) {
        arg0.method2362(this.field2715 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2718[field2723[var2]];
            if (var3 == 0) {
                arg0.method2362(-1);
            } else {
                arg0.method2362(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2362(this.field2714[var4]);
        }
    }

    @ObfuscatedName("fd.k(I)V")
    public void method3130() {
        long var1 = this.field2716;
        int var3 = this.field2718[5];
        int var4 = this.field2718[9];
        this.field2718[5] = var4;
        this.field2718[9] = var3;
        this.field2716 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2716 <<= 0x4;
            if (this.field2718[var5] >= 256) {
                this.field2716 += (long) (this.field2718[var5] - 256);
            }
        }
        if (this.field2718[0] >= 256) {
            this.field2716 += (long) (this.field2718[0] - 256 >> 4);
        }
        if (this.field2718[1] >= 256) {
            this.field2716 += (long) (this.field2718[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2716 <<= 0x3;
            this.field2716 += (long) this.field2714[var6];
        }
        this.field2716 <<= 0x1;
        this.field2716 += (long) (this.field2715 ? 1 : 0);
        this.field2718[5] = var3;
        this.field2718[9] = var4;
        if (var1 != 0L && this.field2716 != var1) {
            field2719.method3219(var1);
        }
    }

    @ObfuscatedName("fd.g(Lao;ILao;II)Ldm;")
    public class111 method3132(class33 arg0, int arg1, class33 arg2, int arg3) {
        if (this.field2724 != -1) {
            return class30.method175(this.field2724).method559(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2716;
        int[] var7 = this.field2718;
        if (arg0 != null && (arg0.field889 >= 0 || arg0.field890 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2718[var8];
            }
            if (arg0.field889 >= 0) {
                var5 += (long) (arg0.field889 - this.field2718[5] << 40);
                var7[5] = arg0.field889;
            }
            if (arg0.field890 >= 0) {
                var5 += (long) (arg0.field890 - this.field2718[3] << 48);
                var7[3] = arg0.field890;
            }
        }
        class111 var9 = (class111) field2719.method3214(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class35.method2990(var12 - 256).method741()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class39.method1244(var12 - 512).method807(this.field2715)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2717 != -1L) {
                    var9 = (class111) field2719.method3214(this.field2717);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class100[] var13 = new class100[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class100 var17 = class35.method2990(var16 - 256).method752();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class39.method1244(var16 - 512).method808(this.field2715);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2714[var20] < Statics.field2720[var20].length) {
                        var19.method2010(Statics.field2721[var20], Statics.field2720[var20][this.field2714[var20]]);
                    }
                    if (this.field2714[var20] < Statics.field2722[var20].length) {
                        var19.method2010(Statics.field2713[var20], Statics.field2722[var20][this.field2714[var20]]);
                    }
                }
                var9 = var19.method2042(64, 850, -30, -50, -30);
                field2719.method3223(var9, var5);
                this.field2717 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class111 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method677(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method674(var9, arg3);
        } else {
            var21 = arg0.method674(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fd.n(I)Lcu;")
    public class100 method3153() {
        if (this.field2724 != -1) {
            return class30.method175(this.field2724).method586();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2718[var2];
            if (var3 >= 256 && var3 < 512 && !class35.method2990(var3 - 256).method733()) {
                var1 = true;
            }
            if (var3 >= 512 && !class39.method1244(var3 - 512).method809(this.field2715)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2718[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class35.method2990(var7 - 256).method753();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class39.method1244(var7 - 512).method818(this.field2715);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2714[var11] < Statics.field2720[var11].length) {
                var10.method2010(Statics.field2721[var11], Statics.field2720[var11][this.field2714[var11]]);
            }
            if (this.field2714[var11] < Statics.field2722[var11].length) {
                var10.method2010(Statics.field2713[var11], Statics.field2722[var11][this.field2714[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fd.c(I)I")
    public int method3139() {
        return this.field2724 == -1 ? (this.field2718[11] << 5) + (this.field2718[8] << 10) + (this.field2718[0] << 15) + (this.field2714[0] << 25) + (this.field2714[4] << 20) + this.field2718[1] : 305419896 + class30.method175(this.field2724).field779;
    }
}

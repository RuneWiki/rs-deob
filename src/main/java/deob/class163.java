package deob;

@ObfuscatedName("ft")
public class class163 {

    @ObfuscatedName("ft.j")
    public int[] field2714;

    @ObfuscatedName("ft.r")
    public int[] field2719;

    @ObfuscatedName("ft.v")
    public boolean field2716;

    @ObfuscatedName("ft.p")
    public int field2715;

    @ObfuscatedName("ft.e")
    public long field2718;

    @ObfuscatedName("ft.d")
    public long field2717;

    @ObfuscatedName("ft.z")
    public static final int[] field2721 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ft.o")
    public static class170 field2722 = new class170(260);

    @ObfuscatedName("ft.j([I[IZII)V")
    public void method3174(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field929; var6++) {
                    class36 var7 = class36.method239(var6);
                    if (var7 != null && !var7.field928 && (arg2 ? 7 : 0) + var5 == var7.field921) {
                        arg0[field2721[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2714 = arg0;
        this.field2719 = arg1;
        this.field2716 = arg2;
        this.field2715 = arg3;
        this.method3196();
    }

    @ObfuscatedName("ft.r(IZI)V")
    public void method3170(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2716) {
            return;
        }
        int var3 = this.field2714[field2721[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field929) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field929 - 1;
                }
            }
            var4 = class36.method239(var3);
        } while (var4 == null || var4.field928 || var4.field921 != (this.field2716 ? 7 : 0) + arg0);
        this.field2714[field2721[arg0]] = var3 + 256;
        this.method3196();
    }

    @ObfuscatedName("ft.v(IZS)V")
    public void method3171(int arg0, boolean arg1) {
        int var3 = this.field2719[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2018[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2018[arg0].length - 1;
            }
        }
        this.field2719[arg0] = var3;
        this.method3196();
    }

    @ObfuscatedName("ft.p(ZB)V")
    public void method3172(boolean arg0) {
        if (this.field2716 != arg0) {
            this.method3174((int[]) null, this.field2719, arg0, -1);
        }
    }

    @ObfuscatedName("ft.e(Ldn;I)V")
    public void method3189(class127 arg0) {
        arg0.method2482(this.field2716 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2714[field2721[var2]];
            if (var3 == 0) {
                arg0.method2482(-1);
            } else {
                arg0.method2482(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2482(this.field2719[var4]);
        }
    }

    @ObfuscatedName("ft.d(I)V")
    public void method3196() {
        long var1 = this.field2718;
        int var3 = this.field2714[5];
        int var4 = this.field2714[9];
        this.field2714[5] = var4;
        this.field2714[9] = var3;
        this.field2718 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2718 <<= 0x4;
            if (this.field2714[var5] >= 256) {
                this.field2718 += (long) (this.field2714[var5] - 256);
            }
        }
        if (this.field2714[0] >= 256) {
            this.field2718 += (long) (this.field2714[0] - 256 >> 4);
        }
        if (this.field2714[1] >= 256) {
            this.field2718 += (long) (this.field2714[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2718 <<= 0x3;
            this.field2718 += (long) this.field2719[var6];
        }
        this.field2718 <<= 0x1;
        this.field2718 += (long) (this.field2716 ? 1 : 0);
        this.field2714[5] = var3;
        this.field2714[9] = var4;
        if (var1 != 0L && this.field2718 != var1) {
            field2722.method3256(var1);
        }
    }

    @ObfuscatedName("ft.y(Lar;ILar;II)Ldt;")
    public class112 method3175(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2715 != -1) {
            return class31.method148(this.field2715).method614(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2718;
        int[] var7 = this.field2714;
        if (arg0 != null && (arg0.field884 >= 0 || arg0.field885 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2714[var8];
            }
            if (arg0.field884 >= 0) {
                var5 += (long) (arg0.field884 - this.field2714[5] << 40);
                var7[5] = arg0.field884;
            }
            if (arg0.field885 >= 0) {
                var5 += (long) (arg0.field885 - this.field2714[3] << 48);
                var7[3] = arg0.field885;
            }
        }
        class112 var9 = (class112) field2722.method3264(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method239(var12 - 256).method752()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method789(var12 - 512).method821(this.field2716)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2717 != -1L) {
                    var9 = (class112) field2722.method3264(this.field2717);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class101[] var13 = new class101[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class101 var17 = class36.method239(var16 - 256).method753();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method789(var16 - 512).method822(this.field2716);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2719[var20] < Statics.field2018[var20].length) {
                        var19.method2062(Statics.field1107[var20], Statics.field2018[var20][this.field2719[var20]]);
                    }
                    if (this.field2719[var20] < Statics.field80[var20].length) {
                        var19.method2062(Statics.field2720[var20], Statics.field80[var20][this.field2719[var20]]);
                    }
                }
                var9 = var19.method2073(64, 850, -30, -50, -30);
                field2722.method3257(var9, var5);
                this.field2717 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method703(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method698(var9, arg3);
        } else {
            var21 = arg0.method698(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ft.x(B)Lco;")
    public class101 method3176() {
        if (this.field2715 != -1) {
            return class31.method148(this.field2715).method610();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2714[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method239(var3 - 256).method764()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method789(var3 - 512).method854(this.field2716)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2714[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method239(var7 - 256).method755();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method789(var7 - 512).method824(this.field2716);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2719[var11] < Statics.field2018[var11].length) {
                var10.method2062(Statics.field1107[var11], Statics.field2018[var11][this.field2719[var11]]);
            }
            if (this.field2719[var11] < Statics.field80[var11].length) {
                var10.method2062(Statics.field2720[var11], Statics.field80[var11][this.field2719[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ft.t(B)I")
    public int method3173() {
        return this.field2715 == -1 ? (this.field2714[11] << 5) + (this.field2714[8] << 10) + (this.field2714[0] << 15) + (this.field2719[4] << 20) + (this.field2719[0] << 25) + this.field2714[1] : 305419896 + class31.method148(this.field2715).field771;
    }

    @ObfuscatedName("ao.i(I)V")
    public static void method803() {
        field2722.method3258();
    }
}

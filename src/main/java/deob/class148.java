package deob;

@ObfuscatedName("eu")
public class class148 {

    @ObfuscatedName("eu.k")
    public int[] field2028;

    @ObfuscatedName("eu.y")
    public int[] field2016;

    @ObfuscatedName("eu.o")
    public boolean field2017;

    @ObfuscatedName("eu.r")
    public int field2015;

    @ObfuscatedName("eu.w")
    public long field2022;

    @ObfuscatedName("eu.j")
    public long field2020;

    @ObfuscatedName("eu.s")
    public static final int[] field2018 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("eu.g")
    public static class125 field2023 = new class125(260);

    @ObfuscatedName("eu.k([I[IZII)V")
    public void method2539(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2811; var6++) {
                    class193 var7 = class193.method3011(var6);
                    if (var7 != null && !var7.field2812 && var7.field2805 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2018[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2028 = arg0;
        this.field2016 = arg1;
        this.field2017 = arg2;
        this.field2015 = arg3;
        this.method2565();
    }

    @ObfuscatedName("eu.y(IZB)V")
    public void method2566(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2017) {
            return;
        }
        int var3 = this.field2028[field2018[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class193 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2811) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2811 - 1;
                }
            }
            var4 = class193.method3011(var3);
        } while (var4 == null || var4.field2812 || (this.field2017 ? 7 : 0) + arg0 != var4.field2805);
        this.field2028[field2018[arg0]] = var3 + 256;
        this.method2565();
    }

    @ObfuscatedName("eu.o(IZI)V")
    public void method2541(int arg0, boolean arg1) {
        int var3 = this.field2016[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1662[arg0].length) {
                    var3 = 0;
                }
            } while (!class149.method3046(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1662[arg0].length - 1;
                }
            } while (!class149.method3046(arg0, var3));
        }
        this.field2016[arg0] = var3;
        this.method2565();
    }

    @ObfuscatedName("eu.r(ZI)V")
    public void method2542(boolean arg0) {
        if (this.field2017 != arg0) {
            this.method2539((int[]) null, this.field2016, arg0, -1);
        }
    }

    @ObfuscatedName("eu.w(Lfm;I)V")
    public void method2549(class161 arg0) {
        arg0.method2718(this.field2017 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2028[field2018[var2]];
            if (var3 == 0) {
                arg0.method2718(-1);
            } else {
                arg0.method2718(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2718(this.field2016[var4]);
        }
    }

    @ObfuscatedName("eu.j(B)V")
    public void method2565() {
        long var1 = this.field2022;
        int var3 = this.field2028[5];
        int var4 = this.field2028[9];
        this.field2028[5] = var4;
        this.field2028[9] = var3;
        this.field2022 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2022 <<= 0x4;
            if (this.field2028[var5] >= 256) {
                this.field2022 += (long) (this.field2028[var5] - 256);
            }
        }
        if (this.field2028[0] >= 256) {
            this.field2022 += (long) (this.field2028[0] - 256 >> 4);
        }
        if (this.field2028[1] >= 256) {
            this.field2022 += (long) (this.field2028[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2022 <<= 0x3;
            this.field2022 += (long) this.field2016[var6];
        }
        this.field2022 <<= 0x1;
        this.field2022 += (long) (this.field2017 ? 1 : 0);
        this.field2028[5] = var3;
        this.field2028[9] = var4;
        if (var1 != 0L && this.field2022 != var1) {
            field2023.method2160(var1);
        }
    }

    @ObfuscatedName("eu.c(Lgc;ILgc;IB)Lcu;")
    public class83 method2545(class202 arg0, int arg1, class202 arg2, int arg3) {
        if (this.field2015 != -1) {
            return class200.method818(this.field2015).method3487(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2022;
        int[] var7 = this.field2028;
        if (arg0 != null && (arg0.field3052 >= 0 || arg0.field3047 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2028[var8];
            }
            if (arg0.field3052 >= 0) {
                var5 += (long) (arg0.field3052 - this.field2028[5] << 40);
                var7[5] = arg0.field3052;
            }
            if (arg0.field3047 >= 0) {
                var5 += (long) (arg0.field3047 - this.field2028[3] << 48);
                var7[3] = arg0.field3047;
            }
        }
        class83 var9 = (class83) field2023.method2159(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class193.method3011(var12 - 256).method3274()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class199.method2569(var12 - 512).method3424(this.field2017)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2020 != -1L) {
                    var9 = (class83) field2023.method2159(this.field2020);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class77[] var13 = new class77[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class77 var17 = class193.method3011(var16 - 256).method3275();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class77 var18 = class199.method2569(var16 - 512).method3435(this.field2017);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class77 var19 = new class77(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2016[var20] < Statics.field1662[var20].length) {
                        var19.method1388(Statics.field2021[var20], Statics.field1662[var20][this.field2016[var20]]);
                    }
                    if (this.field2016[var20] < Statics.field2308[var20].length) {
                        var19.method1388(Statics.field3232[var20], Statics.field2308[var20][this.field2016[var20]]);
                    }
                }
                var9 = var19.method1405(64, 850, -30, -50, -30);
                field2023.method2164(var9, var5);
                this.field2020 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class83 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method3544(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method3541(var9, arg3);
        } else {
            var21 = arg0.method3541(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("eu.g(B)Lbg;")
    public class77 method2538() {
        if (this.field2015 != -1) {
            return class200.method818(this.field2015).method3488();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2028[var2];
            if (var3 >= 256 && var3 < 512 && !class193.method3011(var3 - 256).method3283()) {
                var1 = true;
            }
            if (var3 >= 512 && !class199.method2569(var3 - 512).method3478(this.field2017)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class77[] var4 = new class77[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2028[var6];
            if (var7 >= 256 && var7 < 512) {
                class77 var8 = class193.method3011(var7 - 256).method3280();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class77 var9 = class199.method2569(var7 - 512).method3427(this.field2017);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class77 var10 = new class77(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2016[var11] < Statics.field1662[var11].length) {
                var10.method1388(Statics.field2021[var11], Statics.field1662[var11][this.field2016[var11]]);
            }
            if (this.field2016[var11] < Statics.field2308[var11].length) {
                var10.method1388(Statics.field3232[var11], Statics.field2308[var11][this.field2016[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("eu.i(I)I")
    public int method2543() {
        return this.field2015 == -1 ? (this.field2028[11] << 5) + (this.field2028[8] << 10) + (this.field2028[0] << 15) + (this.field2016[4] << 20) + (this.field2016[0] << 25) + this.field2028[1] : 305419896 + class200.method818(this.field2015).field3011;
    }
}

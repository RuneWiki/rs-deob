package deob;

@ObfuscatedName("hd")
public class class228 {

    @ObfuscatedName("hd.z")
    public int[] field2571;

    @ObfuscatedName("hd.w")
    public int[] field2577;

    @ObfuscatedName("hd.s")
    public boolean field2572;

    @ObfuscatedName("hd.l")
    public int field2570;

    @ObfuscatedName("hd.u")
    public long field2574;

    @ObfuscatedName("hd.q")
    public long field2575;

    @ObfuscatedName("hd.p")
    public static final int[] field2580 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hd.b")
    public static class201 field2581 = new class201(260);

    @ObfuscatedName("hd.z([I[IZII)V")
    public void method4096(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3295; var6++) {
                    class261 var7 = class261.method24(var6);
                    if (var7 != null && !var7.field3296 && (arg2 ? 7 : 0) + var5 == var7.field3294) {
                        arg0[field2580[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2571 = arg0;
        this.field2577 = arg1;
        this.field2572 = arg2;
        this.field2570 = arg3;
        this.method4101();
    }

    @ObfuscatedName("hd.w(IZI)V")
    public void method4112(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2572) {
            return;
        }
        int var3 = this.field2571[field2580[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class261 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3295) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3295 - 1;
                }
            }
            var4 = class261.method24(var3);
        } while (var4 == null || var4.field3296 || arg0 + (this.field2572 ? 7 : 0) != var4.field3294);
        this.field2571[field2580[arg0]] = var3 + 256;
        this.method4101();
    }

    @ObfuscatedName("hd.s(IZB)V")
    public void method4127(int arg0, boolean arg1) {
        int var3 = this.field2577[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2573[arg0].length) {
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
                    var3 = Statics.field2573[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2577[arg0] = var3;
        this.method4101();
    }

    @ObfuscatedName("hd.l(ZI)V")
    public void method4099(boolean arg0) {
        if (this.field2572 != arg0) {
            this.method4096((int[]) null, this.field2577, arg0, -1);
        }
    }

    @ObfuscatedName("hd.u(Lgk;B)V")
    public void method4100(class183 arg0) {
        arg0.method3235(this.field2572 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2571[field2580[var2]];
            if (var3 == 0) {
                arg0.method3235(-1);
            } else {
                arg0.method3235(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3235(this.field2577[var4]);
        }
    }

    @ObfuscatedName("hd.q(I)V")
    public void method4101() {
        long var1 = this.field2574;
        int var3 = this.field2571[5];
        int var4 = this.field2571[9];
        this.field2571[5] = var4;
        this.field2571[9] = var3;
        this.field2574 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2574 <<= 0x4;
            if (this.field2571[var5] >= 256) {
                this.field2574 += (long) (this.field2571[var5] - 256);
            }
        }
        if (this.field2571[0] >= 256) {
            this.field2574 += (long) (this.field2571[0] - 256 >> 4);
        }
        if (this.field2571[1] >= 256) {
            this.field2574 += (long) (this.field2571[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2574 <<= 0x3;
            this.field2574 += (long) this.field2577[var6];
        }
        this.field2574 <<= 0x1;
        this.field2574 += (long) (this.field2572 ? 1 : 0);
        this.field2571[5] = var3;
        this.field2571[9] = var4;
        if (var1 != 0L && this.field2574 != var1) {
            field2581.method3674(var1);
        }
    }

    @ObfuscatedName("hd.i(Ljn;ILjn;II)Ldc;")
    public class120 method4102(class274 arg0, int arg1, class274 arg2, int arg3) {
        if (this.field2570 != -1) {
            return class272.method4763(this.field2570).method4768(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2574;
        int[] var7 = this.field2571;
        if (arg0 != null && (arg0.field3549 >= 0 || arg0.field3550 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2571[var8];
            }
            if (arg0.field3549 >= 0) {
                var5 += (long) (arg0.field3549 - this.field2571[5] << 40);
                var7[5] = arg0.field3549;
            }
            if (arg0.field3550 >= 0) {
                var5 += (long) (arg0.field3550 - this.field2571[3] << 48);
                var7[3] = arg0.field3550;
            }
        }
        class120 var9 = (class120) field2581.method3681(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class261.method24(var12 - 256).method4505()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class270.method2359(var12 - 512).method4704(this.field2572)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2575 != -1L) {
                    var9 = (class120) field2581.method3681(this.field2575);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class114[] var13 = new class114[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class114 var17 = class261.method24(var16 - 256).method4506();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class114 var18 = class270.method2359(var16 - 512).method4737(this.field2572);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class114 var19 = new class114(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2577[var20] < Statics.field2573[var20].length) {
                        var19.method2377(Statics.field2576[var20], Statics.field2573[var20][this.field2577[var20]]);
                    }
                    if (this.field2577[var20] < Statics.field2579[var20].length) {
                        var19.method2377(Statics.field2578[var20], Statics.field2579[var20][this.field2577[var20]]);
                    }
                }
                var9 = var19.method2385(64, 850, -30, -50, -30);
                field2581.method3675(var9, var5);
                this.field2575 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class120 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4827(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4821(var9, arg3);
        } else {
            var21 = arg0.method4821(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hd.x(I)Ldb;")
    public class114 method4103() {
        if (this.field2570 != -1) {
            return class272.method4763(this.field2570).method4764();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2571[var2];
            if (var3 >= 256 && var3 < 512 && !class261.method24(var3 - 256).method4514()) {
                var1 = true;
            }
            if (var3 >= 512 && !class270.method2359(var3 - 512).method4706(this.field2572)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class114[] var4 = new class114[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2571[var6];
            if (var7 >= 256 && var7 < 512) {
                class114 var8 = class261.method24(var7 - 256).method4508();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class114 var9 = class270.method2359(var7 - 512).method4707(this.field2572);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class114 var10 = new class114(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2577[var11] < Statics.field2573[var11].length) {
                var10.method2377(Statics.field2576[var11], Statics.field2573[var11][this.field2577[var11]]);
            }
            if (this.field2577[var11] < Statics.field2579[var11].length) {
                var10.method2377(Statics.field2578[var11], Statics.field2579[var11][this.field2577[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hd.e(I)I")
    public int method4117() {
        return this.field2570 == -1 ? (this.field2571[11] << 5) + (this.field2571[8] << 10) + (this.field2571[0] << 15) + (this.field2577[0] << 25) + (this.field2577[4] << 20) + this.field2571[1] : 305419896 + class272.method4763(this.field2570).field3511;
    }

    @ObfuscatedName("gr.p(I)V")
    public static void method3563() {
        field2581.method3676();
    }
}

package deob;

@ObfuscatedName("hu")
public class class228 {

    @ObfuscatedName("hu.w")
    public int[] field2589;

    @ObfuscatedName("hu.m")
    public int[] field2590;

    @ObfuscatedName("hu.q")
    public boolean field2596;

    @ObfuscatedName("hu.b")
    public int field2597;

    @ObfuscatedName("hu.f")
    public long field2593;

    @ObfuscatedName("hu.n")
    public long field2594;

    @ObfuscatedName("hu.l")
    public static final int[] field2595 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hu.d")
    public static class201 field2598 = new class201(260);

    @ObfuscatedName("hu.w([I[IZII)V")
    public void method4117(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3320; var6++) {
                    class261 var7 = class261.method507(var6);
                    if (var7 != null && !var7.field3312 && (arg2 ? 7 : 0) + var5 == var7.field3314) {
                        arg0[field2595[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2589 = arg0;
        this.field2590 = arg1;
        this.field2596 = arg2;
        this.field2597 = arg3;
        this.method4122();
    }

    @ObfuscatedName("hu.m(IZI)V")
    public void method4118(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2596) {
            return;
        }
        int var3 = this.field2589[field2595[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class261 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3320) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3320 - 1;
                }
            }
            var4 = class261.method507(var3);
        } while (var4 == null || var4.field3312 || var4.field3314 != (this.field2596 ? 7 : 0) + arg0);
        this.field2589[field2595[arg0]] = var3 + 256;
        this.method4122();
    }

    @ObfuscatedName("hu.q(IZI)V")
    public void method4119(int arg0, boolean arg1) {
        int var3 = this.field2590[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2391[arg0].length) {
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
                    var3 = Statics.field2391[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2590[arg0] = var3;
        this.method4122();
    }

    @ObfuscatedName("hu.x(ZI)V")
    public void method4120(boolean arg0) {
        if (this.field2596 != arg0) {
            this.method4117((int[]) null, this.field2590, arg0, -1);
        }
    }

    @ObfuscatedName("hu.j(Lgy;I)V")
    public void method4133(class183 arg0) {
        arg0.method3246(this.field2596 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2589[field2595[var2]];
            if (var3 == 0) {
                arg0.method3246(-1);
            } else {
                arg0.method3246(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3246(this.field2590[var4]);
        }
    }

    @ObfuscatedName("hu.a(B)V")
    public void method4122() {
        long var1 = this.field2593;
        int var3 = this.field2589[5];
        int var4 = this.field2589[9];
        this.field2589[5] = var4;
        this.field2589[9] = var3;
        this.field2593 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2593 <<= 0x4;
            if (this.field2589[var5] >= 256) {
                this.field2593 += (long) (this.field2589[var5] - 256);
            }
        }
        if (this.field2589[0] >= 256) {
            this.field2593 += (long) (this.field2589[0] - 256 >> 4);
        }
        if (this.field2589[1] >= 256) {
            this.field2593 += (long) (this.field2589[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2593 <<= 0x3;
            this.field2593 += (long) this.field2590[var6];
        }
        this.field2593 <<= 0x1;
        this.field2593 += (long) (this.field2596 ? 1 : 0);
        this.field2589[5] = var3;
        this.field2589[9] = var4;
        if (var1 != 0L && this.field2593 != var1) {
            field2598.method3706(var1);
        }
    }

    @ObfuscatedName("hu.l(Ljh;ILjh;II)Ldk;")
    public class120 method4138(class274 arg0, int arg1, class274 arg2, int arg3) {
        if (this.field2597 != -1) {
            return class272.method1034(this.field2597).method4782(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2593;
        int[] var7 = this.field2589;
        if (arg0 != null && (arg0.field3562 >= 0 || arg0.field3556 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2589[var8];
            }
            if (arg0.field3562 >= 0) {
                var5 += (long) (arg0.field3562 - this.field2589[5] << 40);
                var7[5] = arg0.field3562;
            }
            if (arg0.field3556 >= 0) {
                var5 += (long) (arg0.field3556 - this.field2589[3] << 48);
                var7[3] = arg0.field3556;
            }
        }
        class120 var9 = (class120) field2598.method3707(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class261.method507(var12 - 256).method4511()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class270.method2571(var12 - 512).method4723(this.field2596)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2594 != -1L) {
                    var9 = (class120) field2598.method3707(this.field2594);
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
                        class114 var17 = class261.method507(var16 - 256).method4527();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class114 var18 = class270.method2571(var16 - 512).method4720(this.field2596);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class114 var19 = new class114(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2590[var20] < Statics.field2391[var20].length) {
                        var19.method2476(Statics.field314[var20], Statics.field2391[var20][this.field2590[var20]]);
                    }
                    if (this.field2590[var20] < Statics.field1092[var20].length) {
                        var19.method2476(Statics.field1948[var20], Statics.field1092[var20][this.field2590[var20]]);
                    }
                }
                var9 = var19.method2418(64, 850, -30, -50, -30);
                field2598.method3712(var9, var5);
                this.field2594 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class120 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4833(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4830(var9, arg3);
        } else {
            var21 = arg0.method4830(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hu.d(I)Ldo;")
    public class114 method4124() {
        if (this.field2597 != -1) {
            return class272.method1034(this.field2597).method4785();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2589[var2];
            if (var3 >= 256 && var3 < 512 && !class261.method507(var3 - 256).method4519()) {
                var1 = true;
            }
            if (var3 >= 512 && !class270.method2571(var3 - 512).method4756(this.field2596)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class114[] var4 = new class114[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2589[var6];
            if (var7 >= 256 && var7 < 512) {
                class114 var8 = class261.method507(var7 - 256).method4514();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class114 var9 = class270.method2571(var7 - 512).method4763(this.field2596);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class114 var10 = new class114(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2590[var11] < Statics.field2391[var11].length) {
                var10.method2476(Statics.field314[var11], Statics.field2391[var11][this.field2590[var11]]);
            }
            if (this.field2590[var11] < Statics.field1092[var11].length) {
                var10.method2476(Statics.field1948[var11], Statics.field1092[var11][this.field2590[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hu.s(I)I")
    public int method4125() {
        return this.field2597 == -1 ? (this.field2589[11] << 5) + (this.field2589[8] << 10) + (this.field2589[0] << 15) + (this.field2590[0] << 25) + (this.field2590[4] << 20) + this.field2589[1] : 305419896 + class272.method1034(this.field2597).field3504;
    }
}

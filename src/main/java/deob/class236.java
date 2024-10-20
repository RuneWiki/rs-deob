package deob;

@ObfuscatedName("il")
public class class236 {

    @ObfuscatedName("il.a")
    public int[] field2657;

    @ObfuscatedName("il.s")
    public int[] field2654;

    @ObfuscatedName("il.g")
    public boolean field2655;

    @ObfuscatedName("il.x")
    public int field2658;

    @ObfuscatedName("il.h")
    public long field2656;

    @ObfuscatedName("il.f")
    public long field2659;

    @ObfuscatedName("il.n")
    public static final int[] field2662 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("il.e")
    public static class208 field2663 = new class208(260);

    @ObfuscatedName("il.a([I[IZII)V")
    public void method4303(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1231; var6++) {
                    class267 var7 = class267.method1879(var6);
                    if (var7 != null && !var7.field3383 && (arg2 ? 7 : 0) + var5 == var7.field3376) {
                        arg0[field2662[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2657 = arg0;
        this.field2654 = arg1;
        this.field2655 = arg2;
        this.field2658 = arg3;
        this.method4292();
    }

    @ObfuscatedName("il.s(IZI)V")
    public void method4288(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2655) {
            return;
        }
        int var3 = this.field2657[field2662[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class267 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1231) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1231 - 1;
                }
            }
            var4 = class267.method1879(var3);
        } while (var4 == null || var4.field3383 || (this.field2655 ? 7 : 0) + arg0 != var4.field3376);
        this.field2657[field2662[arg0]] = var3 + 256;
        this.method4292();
    }

    @ObfuscatedName("il.g(IZI)V")
    public void method4315(int arg0, boolean arg1) {
        int var3 = this.field2654[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2660[arg0].length) {
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
                    var3 = Statics.field2660[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2654[arg0] = var3;
        this.method4292();
    }

    @ObfuscatedName("il.x(ZI)V")
    public void method4290(boolean arg0) {
        if (this.field2655 != arg0) {
            this.method4303((int[]) null, this.field2654, arg0, -1);
        }
    }

    @ObfuscatedName("il.h(Lgx;B)V")
    public void method4291(class190 arg0) {
        arg0.method3439(this.field2655 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2657[field2662[var2]];
            if (var3 == 0) {
                arg0.method3439(-1);
            } else {
                arg0.method3439(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3439(this.field2654[var4]);
        }
    }

    @ObfuscatedName("il.f(I)V")
    public void method4292() {
        long var1 = this.field2656;
        int var3 = this.field2657[5];
        int var4 = this.field2657[9];
        this.field2657[5] = var4;
        this.field2657[9] = var3;
        this.field2656 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2656 <<= 0x4;
            if (this.field2657[var5] >= 256) {
                this.field2656 += (long) (this.field2657[var5] - 256);
            }
        }
        if (this.field2657[0] >= 256) {
            this.field2656 += (long) (this.field2657[0] - 256 >> 4);
        }
        if (this.field2657[1] >= 256) {
            this.field2656 += (long) (this.field2657[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2656 <<= 0x3;
            this.field2656 += (long) this.field2654[var6];
        }
        this.field2656 <<= 0x1;
        this.field2656 += (long) (this.field2655 ? 1 : 0);
        this.field2657[5] = var3;
        this.field2657[9] = var4;
        if (var1 != 0L && this.field2656 != var1) {
            field2663.method3875(var1);
        }
    }

    @ObfuscatedName("il.p(Lju;ILju;IB)Ldv;")
    public class127 method4312(class280 arg0, int arg1, class280 arg2, int arg3) {
        if (this.field2658 != -1) {
            return class278.method3363(this.field2658).method4988(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2656;
        int[] var7 = this.field2657;
        if (arg0 != null && (arg0.field3628 >= 0 || arg0.field3616 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2657[var8];
            }
            if (arg0.field3628 >= 0) {
                var5 += (long) (arg0.field3628 - this.field2657[5] << 40);
                var7[5] = arg0.field3628;
            }
            if (arg0.field3616 >= 0) {
                var5 += (long) (arg0.field3616 - this.field2657[3] << 48);
                var7[3] = arg0.field3616;
            }
        }
        class127 var9 = (class127) field2663.method3885(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class267.method1879(var12 - 256).method4683()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class276.method1049(var12 - 512).method4898(this.field2655)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2659 != -1L) {
                    var9 = (class127) field2663.method3885(this.field2659);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class121[] var13 = new class121[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class121 var17 = class267.method1879(var16 - 256).method4695();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class121 var18 = class276.method1049(var16 - 512).method4921(this.field2655);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class121 var19 = new class121(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2654[var20] < Statics.field2660[var20].length) {
                        var19.method2607(Statics.field2653[var20], Statics.field2660[var20][this.field2654[var20]]);
                    }
                    if (this.field2654[var20] < Statics.field11[var20].length) {
                        var19.method2607(Statics.field2661[var20], Statics.field11[var20][this.field2654[var20]]);
                    }
                }
                var9 = var19.method2658(64, 850, -30, -50, -30);
                field2663.method3878(var9, var5);
                this.field2659 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class127 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method5029(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method5013(var9, arg3);
        } else {
            var21 = arg0.method5013(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("il.m(I)Ldk;")
    public class121 method4294() {
        if (this.field2658 != -1) {
            return class278.method3363(this.field2658).method4968();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2657[var2];
            if (var3 >= 256 && var3 < 512 && !class267.method1879(var3 - 256).method4677()) {
                var1 = true;
            }
            if (var3 >= 512 && !class276.method1049(var3 - 512).method4908(this.field2655)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class121[] var4 = new class121[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2657[var6];
            if (var7 >= 256 && var7 < 512) {
                class121 var8 = class267.method1879(var7 - 256).method4678();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class121 var9 = class276.method1049(var7 - 512).method4901(this.field2655);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class121 var10 = new class121(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2654[var11] < Statics.field2660[var11].length) {
                var10.method2607(Statics.field2653[var11], Statics.field2660[var11][this.field2654[var11]]);
            }
            if (this.field2654[var11] < Statics.field11[var11].length) {
                var10.method2607(Statics.field2661[var11], Statics.field11[var11][this.field2654[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("il.q(I)I")
    public int method4295() {
        return this.field2658 == -1 ? (this.field2657[11] << 5) + (this.field2657[8] << 10) + (this.field2657[0] << 15) + (this.field2654[0] << 25) + (this.field2654[4] << 20) + this.field2657[1] : 305419896 + class278.method3363(this.field2658).field3569;
    }
}

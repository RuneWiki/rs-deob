package deob;

@ObfuscatedName("fs")
public class class179 {

    @ObfuscatedName("fs.m")
    public int[] field2896;

    @ObfuscatedName("fs.l")
    public int[] field2898;

    @ObfuscatedName("fs.y")
    public boolean field2895;

    @ObfuscatedName("fs.u")
    public int field2900;

    @ObfuscatedName("fs.k")
    public long field2897;

    @ObfuscatedName("fs.j")
    public long field2894;

    @ObfuscatedName("fs.p")
    public static final int[] field2893 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fs.a")
    public static class193 field2901 = new class193(260);

    @ObfuscatedName("fs.m([I[IZII)V")
    public void method3309(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3136; var6++) {
                    class45 var7 = class45.method1032(var6);
                    if (var7 != null && !var7.field1000 && var7.field993 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2893[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2896 = arg0;
        this.field2898 = arg1;
        this.field2895 = arg2;
        this.field2900 = arg3;
        this.method3327();
    }

    @ObfuscatedName("fs.l(IZB)V")
    public void method3299(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2895) {
            return;
        }
        int var3 = this.field2896[field2893[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3136) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3136 - 1;
                }
            }
            var4 = class45.method1032(var3);
        } while (var4 == null || var4.field1000 || (this.field2895 ? 7 : 0) + arg0 != var4.field993);
        this.field2896[field2893[arg0]] = var3 + 256;
        this.method3327();
    }

    @ObfuscatedName("fs.y(IZI)V")
    public void method3301(int arg0, boolean arg1) {
        int var3 = this.field2898[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2875[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 == 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2875[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2898[arg0] = var3;
        this.method3327();
    }

    @ObfuscatedName("fs.u(ZI)V")
    public void method3303(boolean arg0) {
        if (this.field2895 != arg0) {
            this.method3309((int[]) null, this.field2898, arg0, -1);
        }
    }

    @ObfuscatedName("fs.k(Ldx;I)V")
    public void method3304(class119 arg0) {
        arg0.method2366(this.field2895 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2896[field2893[var2]];
            if (var3 == 0) {
                arg0.method2366(-1);
            } else {
                arg0.method2366(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2366(this.field2898[var4]);
        }
    }

    @ObfuscatedName("fs.j(I)V")
    public void method3327() {
        long var1 = this.field2897;
        int var3 = this.field2896[5];
        int var4 = this.field2896[9];
        this.field2896[5] = var4;
        this.field2896[9] = var3;
        this.field2897 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2897 <<= 0x4;
            if (this.field2896[var5] >= 256) {
                this.field2897 += (long) (this.field2896[var5] - 256);
            }
        }
        if (this.field2896[0] >= 256) {
            this.field2897 += (long) (this.field2896[0] - 256 >> 4);
        }
        if (this.field2896[1] >= 256) {
            this.field2897 += (long) (this.field2896[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2897 <<= 0x3;
            this.field2897 += (long) this.field2898[var6];
        }
        this.field2897 <<= 0x1;
        this.field2897 += (long) (this.field2895 ? 1 : 0);
        this.field2896[5] = var3;
        this.field2896[9] = var4;
        if (var1 != 0L && this.field2897 != var1) {
            field2901.method3538(var1);
        }
    }

    @ObfuscatedName("fs.i(Laf;ILaf;II)Ldb;")
    public class105 method3305(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2900 != -1) {
            return class40.method50(this.field2900).method810(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2897;
        int[] var7 = this.field2896;
        if (arg0 != null && (arg0.field954 >= 0 || arg0.field959 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2896[var8];
            }
            if (arg0.field954 >= 0) {
                var5 += (long) (arg0.field954 - this.field2896[5] << 40);
                var7[5] = arg0.field954;
            }
            if (arg0.field959 >= 0) {
                var5 += (long) (arg0.field959 - this.field2896[3] << 48);
                var7[3] = arg0.field959;
            }
        }
        class105 var9 = (class105) field2901.method3537(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method1032(var12 - 256).method931()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method168(var12 - 512).method1046(this.field2895)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2894 != -1L) {
                    var9 = (class105) field2901.method3537(this.field2894);
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
                        class100 var17 = class45.method1032(var16 - 256).method932();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class100 var18 = class52.method168(var16 - 512).method1089(this.field2895);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class100 var19 = new class100(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2898[var20] < Statics.field2875[var20].length) {
                        var19.method2106(Statics.field2577[var20], Statics.field2875[var20][this.field2898[var20]]);
                    }
                    if (this.field2898[var20] < Statics.field2899[var20].length) {
                        var19.method2106(Statics.field1724[var20], Statics.field2899[var20][this.field2898[var20]]);
                    }
                }
                var9 = var19.method2114(64, 850, -30, -50, -30);
                field2901.method3539(var9, var5);
                this.field2894 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class105 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method885(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method906(var9, arg3);
        } else {
            var21 = arg0.method906(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fs.x(I)Lcy;")
    public class100 method3306() {
        if (this.field2900 != -1) {
            return class40.method50(this.field2900).method785();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2896[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method1032(var3 - 256).method933()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method168(var3 - 512).method1048(this.field2895)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class100[] var4 = new class100[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2896[var6];
            if (var7 >= 256 && var7 < 512) {
                class100 var8 = class45.method1032(var7 - 256).method934();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class100 var9 = class52.method168(var7 - 512).method1049(this.field2895);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class100 var10 = new class100(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2898[var11] < Statics.field2875[var11].length) {
                var10.method2106(Statics.field2577[var11], Statics.field2875[var11][this.field2898[var11]]);
            }
            if (this.field2898[var11] < Statics.field2899[var11].length) {
                var10.method2106(Statics.field1724[var11], Statics.field2899[var11][this.field2898[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fs.g(I)I")
    public int method3307() {
        return this.field2900 == -1 ? (this.field2896[11] << 5) + (this.field2896[8] << 10) + (this.field2896[0] << 15) + (this.field2898[0] << 25) + (this.field2898[4] << 20) + this.field2896[1] : 305419896 + class40.method50(this.field2900).field847;
    }
}

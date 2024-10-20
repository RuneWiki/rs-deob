package deob;

@ObfuscatedName("fq")
public class class180 {

    @ObfuscatedName("fq.e")
    public int[] field2925;

    @ObfuscatedName("fq.w")
    public int[] field2918;

    @ObfuscatedName("fq.f")
    public boolean field2922;

    @ObfuscatedName("fq.s")
    public int field2929;

    @ObfuscatedName("fq.p")
    public long field2919;

    @ObfuscatedName("fq.h")
    public long field2928;

    @ObfuscatedName("fq.m")
    public static final int[] field2920 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fq.n")
    public static class194 field2926 = new class194(260);

    @ObfuscatedName("fq.e([I[IZIB)V")
    public void method3252(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1003; var6++) {
                    class45 var7 = class45.method43(var6);
                    if (var7 != null && !var7.field1007 && var7.field1005 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2920[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2925 = arg0;
        this.field2918 = arg1;
        this.field2922 = arg2;
        this.field2929 = arg3;
        this.method3227();
    }

    @ObfuscatedName("fq.w(IZI)V")
    public void method3231(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2922) {
            return;
        }
        int var3 = this.field2925[field2920[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1003) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1003 - 1;
                }
            }
            var4 = class45.method43(var3);
        } while (var4 == null || var4.field1007 || var4.field1005 != (this.field2922 ? 7 : 0) + arg0);
        this.field2925[field2920[arg0]] = var3 + 256;
        this.method3227();
    }

    @ObfuscatedName("fq.f(IZS)V")
    public void method3224(int arg0, boolean arg1) {
        int var3 = this.field2918[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2924[arg0].length) {
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
                    var3 = Statics.field2924[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2918[arg0] = var3;
        this.method3227();
    }

    @ObfuscatedName("fq.s(ZB)V")
    public void method3247(boolean arg0) {
        if (this.field2922 != arg0) {
            this.method3252((int[]) null, this.field2918, arg0, -1);
        }
    }

    @ObfuscatedName("fq.p(Ldq;B)V")
    public void method3255(class120 arg0) {
        arg0.method2397(this.field2922 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2925[field2920[var2]];
            if (var3 == 0) {
                arg0.method2397(-1);
            } else {
                arg0.method2397(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2397(this.field2918[var4]);
        }
    }

    @ObfuscatedName("fq.h(I)V")
    public void method3227() {
        long var1 = this.field2919;
        int var3 = this.field2925[5];
        int var4 = this.field2925[9];
        this.field2925[5] = var4;
        this.field2925[9] = var3;
        this.field2919 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2919 <<= 0x4;
            if (this.field2925[var5] >= 256) {
                this.field2919 += (long) (this.field2925[var5] - 256);
            }
        }
        if (this.field2925[0] >= 256) {
            this.field2919 += (long) (this.field2925[0] - 256 >> 4);
        }
        if (this.field2925[1] >= 256) {
            this.field2919 += (long) (this.field2925[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2919 <<= 0x3;
            this.field2919 += (long) this.field2918[var6];
        }
        this.field2919 <<= 0x1;
        this.field2919 += (long) (this.field2922 ? 1 : 0);
        this.field2925[5] = var3;
        this.field2925[9] = var4;
        if (var1 != 0L && this.field2919 != var1) {
            field2926.method3474(var1);
        }
    }

    @ObfuscatedName("fq.g(Laa;ILaa;IB)Ldy;")
    public class106 method3228(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2929 != -1) {
            return class40.method3129(this.field2929).method735(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2919;
        int[] var7 = this.field2925;
        if (arg0 != null && (arg0.field975 >= 0 || arg0.field967 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2925[var8];
            }
            if (arg0.field975 >= 0) {
                var5 += (long) (arg0.field975 - this.field2925[5] << 40);
                var7[5] = arg0.field975;
            }
            if (arg0.field967 >= 0) {
                var5 += (long) (arg0.field967 - this.field2925[3] << 48);
                var7[3] = arg0.field967;
            }
        }
        class106 var9 = (class106) field2926.method3473(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method43(var12 - 256).method911()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method696(var12 - 512).method1021(this.field2922)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2928 != -1L) {
                    var9 = (class106) field2926.method3473(this.field2928);
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
                        class101 var17 = class45.method43(var16 - 256).method898();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class52.method696(var16 - 512).method999(this.field2922);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2918[var20] < Statics.field2924[var20].length) {
                        var19.method2076(Statics.field2923[var20], Statics.field2924[var20][this.field2918[var20]]);
                    }
                    if (this.field2918[var20] < Statics.field1434[var20].length) {
                        var19.method2076(Statics.field2895[var20], Statics.field1434[var20][this.field2918[var20]]);
                    }
                }
                var9 = var19.method2078(64, 850, -30, -50, -30);
                field2926.method3475(var9, var5);
                this.field2928 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class106 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method843(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method872(var9, arg3);
        } else {
            var21 = arg0.method872(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fq.a(I)Lcp;")
    public class101 method3225() {
        if (this.field2929 != -1) {
            return class40.method3129(this.field2929).method739();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2925[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method43(var3 - 256).method899()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method696(var3 - 512).method998(this.field2922)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2925[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class45.method43(var7 - 256).method900();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class52.method696(var7 - 512).method1001(this.field2922);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2918[var11] < Statics.field2924[var11].length) {
                var10.method2076(Statics.field2923[var11], Statics.field2924[var11][this.field2918[var11]]);
            }
            if (this.field2918[var11] < Statics.field1434[var11].length) {
                var10.method2076(Statics.field2895[var11], Statics.field1434[var11][this.field2918[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fq.r(B)I")
    public int method3230() {
        return this.field2929 == -1 ? (this.field2925[11] << 5) + (this.field2925[8] << 10) + (this.field2925[0] << 15) + (this.field2918[4] << 20) + (this.field2918[0] << 25) + this.field2925[1] : 305419896 + class40.method3129(this.field2929).field883;
    }
}

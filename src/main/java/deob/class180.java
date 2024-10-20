package deob;

@ObfuscatedName("ff")
public class class180 {

    @ObfuscatedName("ff.j")
    public int[] field2919;

    @ObfuscatedName("ff.h")
    public int[] field2920;

    @ObfuscatedName("ff.m")
    public boolean field2921;

    @ObfuscatedName("ff.z")
    public int field2922;

    @ObfuscatedName("ff.x")
    public long field2923;

    @ObfuscatedName("ff.e")
    public long field2927;

    @ObfuscatedName("ff.u")
    public static final int[] field2924 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ff.r")
    public static class194 field2928 = new class194(260);

    @ObfuscatedName("ff.j([I[IZII)V")
    public void method3224(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3233; var6++) {
                    class45 var7 = class45.method2685(var6);
                    if (var7 != null && !var7.field1020 && (arg2 ? 7 : 0) + var5 == var7.field1016) {
                        arg0[field2924[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2919 = arg0;
        this.field2920 = arg1;
        this.field2921 = arg2;
        this.field2922 = arg3;
        this.method3229();
    }

    @ObfuscatedName("ff.h(IZB)V")
    public void method3242(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2921) {
            return;
        }
        int var3 = this.field2919[field2924[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class45 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3233) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3233 - 1;
                }
            }
            var4 = class45.method2685(var3);
        } while (var4 == null || var4.field1020 || arg0 + (this.field2921 ? 7 : 0) != var4.field1016);
        this.field2919[field2924[arg0]] = var3 + 256;
        this.method3229();
    }

    @ObfuscatedName("ff.m(IZI)V")
    public void method3226(int arg0, boolean arg1) {
        int var3 = this.field2920[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1536[arg0].length) {
                    var3 = 0;
                }
            } while (!class175.method960(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1536[arg0].length - 1;
                }
            } while (!class175.method960(arg0, var3));
        }
        this.field2920[arg0] = var3;
        this.method3229();
    }

    @ObfuscatedName("ff.z(ZI)V")
    public void method3225(boolean arg0) {
        if (this.field2921 != arg0) {
            this.method3224((int[]) null, this.field2920, arg0, -1);
        }
    }

    @ObfuscatedName("ff.x(Ldx;I)V")
    public void method3228(class120 arg0) {
        arg0.method2364(this.field2921 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2919[field2924[var2]];
            if (var3 == 0) {
                arg0.method2364(-1);
            } else {
                arg0.method2364(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2364(this.field2920[var4]);
        }
    }

    @ObfuscatedName("ff.e(I)V")
    public void method3229() {
        long var1 = this.field2923;
        int var3 = this.field2919[5];
        int var4 = this.field2919[9];
        this.field2919[5] = var4;
        this.field2919[9] = var3;
        this.field2923 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2923 <<= 0x4;
            if (this.field2919[var5] >= 256) {
                this.field2923 += (long) (this.field2919[var5] - 256);
            }
        }
        if (this.field2919[0] >= 256) {
            this.field2923 += (long) (this.field2919[0] - 256 >> 4);
        }
        if (this.field2919[1] >= 256) {
            this.field2923 += (long) (this.field2919[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2923 <<= 0x3;
            this.field2923 += (long) this.field2920[var6];
        }
        this.field2923 <<= 0x1;
        this.field2923 += (long) (this.field2921 ? 1 : 0);
        this.field2919[5] = var3;
        this.field2919[9] = var4;
        if (var1 != 0L && this.field2923 != var1) {
            field2928.method3465(var1);
        }
    }

    @ObfuscatedName("ff.i(Lae;ILae;II)Ldf;")
    public class106 method3230(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field2922 != -1) {
            return class40.method2927(this.field2922).method742(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2923;
        int[] var7 = this.field2919;
        if (arg0 != null && (arg0.field982 >= 0 || arg0.field980 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2919[var8];
            }
            if (arg0.field982 >= 0) {
                var5 += (long) (arg0.field982 - this.field2919[5] << 40);
                var7[5] = arg0.field982;
            }
            if (arg0.field980 >= 0) {
                var5 += (long) (arg0.field980 - this.field2919[3] << 48);
                var7[3] = arg0.field980;
            }
        }
        class106 var9 = (class106) field2928.method3460(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class45.method2685(var12 - 256).method892()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class52.method1967(var12 - 512).method1014(this.field2921)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2927 != -1L) {
                    var9 = (class106) field2928.method3460(this.field2927);
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
                        class101 var17 = class45.method2685(var16 - 256).method893();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class52.method1967(var16 - 512).method1008(this.field2921);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2920[var20] < Statics.field1536[var20].length) {
                        var19.method2073(Statics.field2925[var20], Statics.field1536[var20][this.field2920[var20]]);
                    }
                    if (this.field2920[var20] < Statics.field768[var20].length) {
                        var19.method2073(Statics.field1546[var20], Statics.field768[var20][this.field2920[var20]]);
                    }
                }
                var9 = var19.method2089(64, 850, -30, -50, -30);
                field2928.method3462(var9, var5);
                this.field2927 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class106 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method843(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method845(var9, arg3);
        } else {
            var21 = arg0.method845(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ff.c(B)Lcd;")
    public class101 method3244() {
        if (this.field2922 != -1) {
            return class40.method2927(this.field2922).method745();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2919[var2];
            if (var3 >= 256 && var3 < 512 && !class45.method2685(var3 - 256).method894()) {
                var1 = true;
            }
            if (var3 >= 512 && !class52.method1967(var3 - 512).method1047(this.field2921)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2919[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class45.method2685(var7 - 256).method899();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class52.method1967(var7 - 512).method1017(this.field2921);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2920[var11] < Statics.field1536[var11].length) {
                var10.method2073(Statics.field2925[var11], Statics.field1536[var11][this.field2920[var11]]);
            }
            if (this.field2920[var11] < Statics.field768[var11].length) {
                var10.method2073(Statics.field1546[var11], Statics.field768[var11][this.field2920[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ff.n(I)I")
    public int method3232() {
        return this.field2922 == -1 ? (this.field2919[11] << 5) + (this.field2919[8] << 10) + (this.field2919[0] << 15) + (this.field2920[0] << 25) + (this.field2920[4] << 20) + this.field2919[1] : 305419896 + class40.method2927(this.field2922).field899;
    }

    @ObfuscatedName("ab.l(I)V")
    public static void method644() {
        field2928.method3463();
    }
}

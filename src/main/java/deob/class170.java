package deob;

@ObfuscatedName("fm")
public class class170 {

    @ObfuscatedName("fm.o")
    public int[] field2801;

    @ObfuscatedName("fm.l")
    public int[] field2807;

    @ObfuscatedName("fm.g")
    public boolean field2802;

    @ObfuscatedName("fm.u")
    public int field2804;

    @ObfuscatedName("fm.q")
    public long field2813;

    @ObfuscatedName("fm.r")
    public long field2806;

    @ObfuscatedName("fm.j")
    public static final int[] field2805 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fm.m")
    public static class184 field2810 = new class184(260);

    @ObfuscatedName("fm.o([I[IZII)V")
    public void method3146(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field973; var6++) {
                    class42 var7 = class42.method28(var6);
                    if (var7 != null && !var7.field977 && var7.field970 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2805[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2801 = arg0;
        this.field2807 = arg1;
        this.field2802 = arg2;
        this.field2804 = arg3;
        this.method3147();
    }

    @ObfuscatedName("fm.l(IZI)V")
    public void method3148(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2802) {
            return;
        }
        int var3 = this.field2801[field2805[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field973) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field973 - 1;
                }
            }
            var4 = class42.method28(var3);
        } while (var4 == null || var4.field977 || arg0 + (this.field2802 ? 7 : 0) != var4.field970);
        this.field2801[field2805[arg0]] = var3 + 256;
        this.method3147();
    }

    @ObfuscatedName("fm.g(IZI)V")
    public void method3150(int arg0, boolean arg1) {
        int var3 = this.field2807[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1541[arg0].length) {
                    var3 = 0;
                }
            } while (!class165.method886(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1541[arg0].length - 1;
                }
            } while (!class165.method886(arg0, var3));
        }
        this.field2807[arg0] = var3;
        this.method3147();
    }

    @ObfuscatedName("fm.u(ZB)V")
    public void method3167(boolean arg0) {
        if (this.field2802 != arg0) {
            this.method3146((int[]) null, this.field2807, arg0, -1);
        }
    }

    @ObfuscatedName("fm.q(Ldk;I)V")
    public void method3166(class111 arg0) {
        arg0.method2204(this.field2802 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2801[field2805[var2]];
            if (var3 == 0) {
                arg0.method2204(-1);
            } else {
                arg0.method2204(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2204(this.field2807[var4]);
        }
    }

    @ObfuscatedName("fm.r(B)V")
    public void method3147() {
        long var1 = this.field2813;
        int var3 = this.field2801[5];
        int var4 = this.field2801[9];
        this.field2801[5] = var4;
        this.field2801[9] = var3;
        this.field2813 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2813 <<= 0x4;
            if (this.field2801[var5] >= 256) {
                this.field2813 += (long) (this.field2801[var5] - 256);
            }
        }
        if (this.field2801[0] >= 256) {
            this.field2813 += (long) (this.field2801[0] - 256 >> 4);
        }
        if (this.field2801[1] >= 256) {
            this.field2813 += (long) (this.field2801[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2813 <<= 0x3;
            this.field2813 += (long) this.field2807[var6];
        }
        this.field2813 <<= 0x1;
        this.field2813 += (long) (this.field2802 ? 1 : 0);
        this.field2801[5] = var3;
        this.field2801[9] = var4;
        if (var1 != 0L && this.field2813 != var1) {
            field2810.method3400(var1);
        }
    }

    @ObfuscatedName("fm.v(Law;ILaw;II)Lcq;")
    public class100 method3152(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2804 != -1) {
            return class37.method2500(this.field2804).method666(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2813;
        int[] var7 = this.field2801;
        if (arg0 != null && (arg0.field935 >= 0 || arg0.field925 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2801[var8];
            }
            if (arg0.field935 >= 0) {
                var5 += (long) (arg0.field935 - this.field2801[5] << 40);
                var7[5] = arg0.field935;
            }
            if (arg0.field925 >= 0) {
                var5 += (long) (arg0.field925 - this.field2801[3] << 48);
                var7[3] = arg0.field925;
            }
        }
        class100 var9 = (class100) field2810.method3401(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method28(var12 - 256).method837()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method2700(var12 - 512).method928(this.field2802)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2806 != -1L) {
                    var9 = (class100) field2810.method3401(this.field2806);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class95[] var13 = new class95[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class95 var17 = class42.method28(var16 - 256).method834();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method2700(var16 - 512).method936(this.field2802);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2807[var20] < Statics.field1541[var20].length) {
                        var19.method1971(Statics.field1005[var20], Statics.field1541[var20][this.field2807[var20]]);
                    }
                    if (this.field2807[var20] < Statics.field2808[var20].length) {
                        var19.method1971(Statics.field2809[var20], Statics.field2808[var20][this.field2807[var20]]);
                    }
                }
                var9 = var19.method1983(64, 850, -30, -50, -30);
                field2810.method3403(var9, var5);
                this.field2806 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method783(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method816(var9, arg3);
        } else {
            var21 = arg0.method816(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fm.y(I)Lcl;")
    public class95 method3159() {
        if (this.field2804 != -1) {
            return class37.method2500(this.field2804).method668();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2801[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method28(var3 - 256).method839()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method2700(var3 - 512).method929(this.field2802)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2801[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method28(var7 - 256).method840();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method2700(var7 - 512).method965(this.field2802);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2807[var11] < Statics.field1541[var11].length) {
                var10.method1971(Statics.field1005[var11], Statics.field1541[var11][this.field2807[var11]]);
            }
            if (this.field2807[var11] < Statics.field2808[var11].length) {
                var10.method1971(Statics.field2809[var11], Statics.field2808[var11][this.field2807[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fm.k(B)I")
    public int method3154() {
        return this.field2804 == -1 ? (this.field2801[11] << 5) + (this.field2801[8] << 10) + (this.field2801[0] << 15) + (this.field2807[0] << 25) + (this.field2807[4] << 20) + this.field2801[1] : 305419896 + class37.method2500(this.field2804).field825;
    }
}

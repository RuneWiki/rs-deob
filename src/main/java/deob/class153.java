package deob;

@ObfuscatedName("em")
public class class153 {

    @ObfuscatedName("em.m")
    public int[] field2629;

    @ObfuscatedName("em.k")
    public int[] field2620;

    @ObfuscatedName("em.y")
    public boolean field2622;

    @ObfuscatedName("em.g")
    public int field2624;

    @ObfuscatedName("em.r")
    public long field2621;

    @ObfuscatedName("em.i")
    public long field2619;

    @ObfuscatedName("em.d")
    public static final int[] field2625 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("em.t")
    public static class167 field2626 = new class167(260);

    @ObfuscatedName("em.m([I[IZII)V")
    public void method2907(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field911; var6++) {
                    class37 var7 = class37.method559(var6);
                    if (var7 != null && !var7.field920 && var7.field913 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2625[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2629 = arg0;
        this.field2620 = arg1;
        this.field2622 = arg2;
        this.field2624 = arg3;
        this.method2913();
    }

    @ObfuscatedName("em.k(IZI)V")
    public void method2887(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2622) {
            return;
        }
        int var3 = this.field2629[field2625[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class37 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field911) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field911 - 1;
                }
            }
            var4 = class37.method559(var3);
        } while (var4 == null || var4.field920 || var4.field913 != arg0 + (this.field2622 ? 7 : 0));
        this.field2629[field2625[arg0]] = var3 + 256;
        this.method2913();
    }

    @ObfuscatedName("em.y(IZI)V")
    public void method2894(int arg0, boolean arg1) {
        int var3 = this.field2620[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field1239[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field1239[arg0].length - 1;
            }
        }
        this.field2620[arg0] = var3;
        this.method2913();
    }

    @ObfuscatedName("em.g(ZI)V")
    public void method2889(boolean arg0) {
        if (this.field2622 != arg0) {
            this.method2907((int[]) null, this.field2620, arg0, -1);
        }
    }

    @ObfuscatedName("em.r(Lcb;B)V")
    public void method2890(class104 arg0) {
        arg0.method2133(this.field2622 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2629[field2625[var2]];
            if (var3 == 0) {
                arg0.method2133(-1);
            } else {
                arg0.method2133(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2133(this.field2620[var4]);
        }
    }

    @ObfuscatedName("em.i(B)V")
    public void method2913() {
        long var1 = this.field2621;
        int var3 = this.field2629[5];
        int var4 = this.field2629[9];
        this.field2629[5] = var4;
        this.field2629[9] = var3;
        this.field2621 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2621 <<= 0x4;
            if (this.field2629[var5] >= 256) {
                this.field2621 += (long) (this.field2629[var5] - 256);
            }
        }
        if (this.field2629[0] >= 256) {
            this.field2621 += (long) (this.field2629[0] - 256 >> 4);
        }
        if (this.field2629[1] >= 256) {
            this.field2621 += (long) (this.field2629[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2621 <<= 0x3;
            this.field2621 += (long) this.field2620[var6];
        }
        this.field2621 <<= 0x1;
        this.field2621 += (long) (this.field2622 ? 1 : 0);
        this.field2629[5] = var3;
        this.field2629[9] = var4;
        if (var1 != 0L && this.field2621 != var1) {
            field2626.method3139(var1);
        }
    }

    @ObfuscatedName("em.f(Laf;ILaf;IB)Lcl;")
    public class95 method2892(class35 arg0, int arg1, class35 arg2, int arg3) {
        if (this.field2624 != -1) {
            return class32.method504(this.field2624).method583(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2621;
        int[] var7 = this.field2629;
        if (arg0 != null && (arg0.field873 >= 0 || arg0.field883 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2629[var8];
            }
            if (arg0.field873 >= 0) {
                var5 += (long) (arg0.field873 - this.field2629[5] << 40);
                var7[5] = arg0.field873;
            }
            if (arg0.field883 >= 0) {
                var5 += (long) (arg0.field883 - this.field2629[3] << 48);
                var7[3] = arg0.field883;
            }
        }
        class95 var9 = (class95) field2626.method3137(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class37.method559(var12 - 256).method724()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class42.method124(var12 - 512).method805(this.field2622)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2619 != -1L) {
                    var9 = (class95) field2626.method3137(this.field2619);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class90[] var13 = new class90[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class90 var17 = class37.method559(var16 - 256).method725();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class90 var18 = class42.method124(var16 - 512).method806(this.field2622);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class90 var19 = new class90(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2620[var20] < Statics.field1239[var20].length) {
                        var19.method1957(Statics.field1843[var20], Statics.field1239[var20][this.field2620[var20]]);
                    }
                    if (this.field2620[var20] < Statics.field2081[var20].length) {
                        var19.method1957(Statics.field1631[var20], Statics.field2081[var20][this.field2620[var20]]);
                    }
                }
                var9 = var19.method1872(64, 850, -30, -50, -30);
                field2626.method3130(var9, var5);
                this.field2619 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class95 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method676(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method673(var9, arg3);
        } else {
            var21 = arg0.method673(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("em.a(I)Lck;")
    public class90 method2893() {
        if (this.field2624 != -1) {
            return class32.method504(this.field2624).method584();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2629[var2];
            if (var3 >= 256 && var3 < 512 && !class37.method559(var3 - 256).method726()) {
                var1 = true;
            }
            if (var3 >= 512 && !class42.method124(var3 - 512).method807(this.field2622)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class90[] var4 = new class90[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2629[var6];
            if (var7 >= 256 && var7 < 512) {
                class90 var8 = class37.method559(var7 - 256).method727();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class90 var9 = class42.method124(var7 - 512).method835(this.field2622);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class90 var10 = new class90(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2620[var11] < Statics.field1239[var11].length) {
                var10.method1957(Statics.field1843[var11], Statics.field1239[var11][this.field2620[var11]]);
            }
            if (this.field2620[var11] < Statics.field2081[var11].length) {
                var10.method1957(Statics.field1631[var11], Statics.field2081[var11][this.field2620[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("em.w(I)I")
    public int method2920() {
        return this.field2624 == -1 ? (this.field2629[11] << 5) + (this.field2629[8] << 10) + (this.field2629[0] << 15) + (this.field2620[4] << 20) + (this.field2620[0] << 25) + this.field2629[1] : 305419896 + class32.method504(this.field2624).field792;
    }

    @ObfuscatedName("i.u(I)V")
    public static void method87() {
        field2626.method3134();
    }
}

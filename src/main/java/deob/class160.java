package deob;

@ObfuscatedName("fk")
public class class160 {

    @ObfuscatedName("fk.f")
    public int[] field2698;

    @ObfuscatedName("fk.k")
    public int[] field2694;

    @ObfuscatedName("fk.y")
    public boolean field2689;

    @ObfuscatedName("fk.e")
    public int field2690;

    @ObfuscatedName("fk.r")
    public long field2691;

    @ObfuscatedName("fk.a")
    public long field2692;

    @ObfuscatedName("fk.p")
    public static final int[] field2695 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fk.v")
    public static class174 field2696 = new class174(260);

    @ObfuscatedName("fk.f([I[IZIB)V")
    public void method2968(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field957; var6++) {
                    class41 var7 = class41.method2874(var6);
                    if (var7 != null && !var7.field966 && var7.field959 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2695[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2698 = arg0;
        this.field2694 = arg1;
        this.field2689 = arg2;
        this.field2690 = arg3;
        this.method2998();
    }

    @ObfuscatedName("fk.k(IZI)V")
    public void method2966(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2689) {
            return;
        }
        int var3 = this.field2698[field2695[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class41 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field957) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field957 - 1;
                }
            }
            var4 = class41.method2874(var3);
        } while (var4 == null || var4.field966 || (this.field2689 ? 7 : 0) + arg0 != var4.field959);
        this.field2698[field2695[arg0]] = var3 + 256;
        this.method2998();
    }

    @ObfuscatedName("fk.y(IZB)V")
    public void method2981(int arg0, boolean arg1) {
        int var3 = this.field2694[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2507[arg0].length) {
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
                    var3 = Statics.field2507[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2694[arg0] = var3;
        this.method2998();
    }

    @ObfuscatedName("fk.e(ZI)V")
    public void method2969(boolean arg0) {
        if (this.field2689 != arg0) {
            this.method2968((int[]) null, this.field2694, arg0, -1);
        }
    }

    @ObfuscatedName("fk.r(Ldu;I)V")
    public void method2995(class108 arg0) {
        arg0.method2144(this.field2689 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2698[field2695[var2]];
            if (var3 == 0) {
                arg0.method2144(-1);
            } else {
                arg0.method2144(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2144(this.field2694[var4]);
        }
    }

    @ObfuscatedName("fk.a(I)V")
    public void method2998() {
        long var1 = this.field2691;
        int var3 = this.field2698[5];
        int var4 = this.field2698[9];
        this.field2698[5] = var4;
        this.field2698[9] = var3;
        this.field2691 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2691 <<= 0x4;
            if (this.field2698[var5] >= 256) {
                this.field2691 += (long) (this.field2698[var5] - 256);
            }
        }
        if (this.field2698[0] >= 256) {
            this.field2691 += (long) (this.field2698[0] - 256 >> 4);
        }
        if (this.field2698[1] >= 256) {
            this.field2691 += (long) (this.field2698[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2691 <<= 0x3;
            this.field2691 += (long) this.field2694[var6];
        }
        this.field2691 <<= 0x1;
        this.field2691 += (long) (this.field2689 ? 1 : 0);
        this.field2698[5] = var3;
        this.field2698[9] = var4;
        if (var1 != 0L && this.field2691 != var1) {
            field2696.method3208(var1);
        }
    }

    @ObfuscatedName("fk.n(Lat;ILat;II)Lci;")
    public class99 method2965(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field2690 != -1) {
            return class36.method93(this.field2690).method668(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2691;
        int[] var7 = this.field2698;
        if (arg0 != null && (arg0.field935 >= 0 || arg0.field925 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2698[var8];
            }
            if (arg0.field935 >= 0) {
                var5 += (long) (arg0.field935 - this.field2698[5] << 40);
                var7[5] = arg0.field935;
            }
            if (arg0.field925 >= 0) {
                var5 += (long) (arg0.field925 - this.field2698[3] << 48);
                var7[3] = arg0.field925;
            }
        }
        class99 var9 = (class99) field2696.method3207(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class41.method2874(var12 - 256).method802()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class46.method515(var12 - 512).method892(this.field2689)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2692 != -1L) {
                    var9 = (class99) field2696.method3207(this.field2692);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class94[] var13 = new class94[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class94 var17 = class41.method2874(var16 - 256).method809();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class94 var18 = class46.method515(var16 - 512).method893(this.field2689);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class94 var19 = new class94(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2694[var20] < Statics.field2507[var20].length) {
                        var19.method1939(Statics.field2693[var20], Statics.field2507[var20][this.field2694[var20]]);
                    }
                    if (this.field2694[var20] < Statics.field1287[var20].length) {
                        var19.method1939(Statics.field2687[var20], Statics.field1287[var20][this.field2694[var20]]);
                    }
                }
                var9 = var19.method1946(64, 850, -30, -50, -30);
                field2696.method3209(var9, var5);
                this.field2692 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class99 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method747(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method744(var9, arg3);
        } else {
            var21 = arg0.method744(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fk.x(I)Lcy;")
    public class94 method2973() {
        if (this.field2690 != -1) {
            return class36.method93(this.field2690).method653();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2698[var2];
            if (var3 >= 256 && var3 < 512 && !class41.method2874(var3 - 256).method817()) {
                var1 = true;
            }
            if (var3 >= 512 && !class46.method515(var3 - 512).method894(this.field2689)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class94[] var4 = new class94[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2698[var6];
            if (var7 >= 256 && var7 < 512) {
                class94 var8 = class41.method2874(var7 - 256).method805();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class94 var9 = class46.method515(var7 - 512).method895(this.field2689);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class94 var10 = new class94(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2694[var11] < Statics.field2507[var11].length) {
                var10.method1939(Statics.field2693[var11], Statics.field2507[var11][this.field2694[var11]]);
            }
            if (this.field2694[var11] < Statics.field1287[var11].length) {
                var10.method1939(Statics.field2687[var11], Statics.field1287[var11][this.field2694[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fk.g(I)I")
    public int method2974() {
        return this.field2690 == -1 ? (this.field2698[11] << 5) + (this.field2698[8] << 10) + (this.field2698[0] << 15) + (this.field2694[0] << 25) + (this.field2694[4] << 20) + this.field2698[1] : 305419896 + class36.method93(this.field2690).field844;
    }

    @ObfuscatedName("ew.o(B)V")
    public static void method2747() {
        field2696.method3223();
    }
}

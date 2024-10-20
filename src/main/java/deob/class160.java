package deob;

@ObfuscatedName("fv")
public class class160 {

    @ObfuscatedName("fv.l")
    public int[] field2668;

    @ObfuscatedName("fv.y")
    public int[] field2665;

    @ObfuscatedName("fv.g")
    public boolean field2666;

    @ObfuscatedName("fv.j")
    public int field2664;

    @ObfuscatedName("fv.w")
    public long field2672;

    @ObfuscatedName("fv.c")
    public long field2669;

    @ObfuscatedName("fv.p")
    public static final int[] field2673 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fv.a")
    public static class174 field2667 = new class174(260);

    @ObfuscatedName("fv.l([I[IZIS)V")
    public void method2971(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field951; var6++) {
                    class41 var7 = class41.method1863(var6);
                    if (var7 != null && !var7.field940 && var5 + (arg2 ? 7 : 0) == var7.field944) {
                        arg0[field2673[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2668 = arg0;
        this.field2665 = arg1;
        this.field2666 = arg2;
        this.field2664 = arg3;
        this.method2976();
    }

    @ObfuscatedName("fv.y(IZI)V")
    public void method2972(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2666) {
            return;
        }
        int var3 = this.field2668[field2673[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class41 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field951) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field951 - 1;
                }
            }
            var4 = class41.method1863(var3);
        } while (var4 == null || var4.field940 || var4.field944 != arg0 + (this.field2666 ? 7 : 0));
        this.field2668[field2673[arg0]] = var3 + 256;
        this.method2976();
    }

    @ObfuscatedName("fv.g(IZI)V")
    public void method2980(int arg0, boolean arg1) {
        int var3 = this.field2665[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2950[arg0].length) {
                    var3 = 0;
                }
            } while (!class156.method2719(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2950[arg0].length - 1;
                }
            } while (!class156.method2719(arg0, var3));
        }
        this.field2665[arg0] = var3;
        this.method2976();
    }

    @ObfuscatedName("fv.j(ZB)V")
    public void method2974(boolean arg0) {
        if (this.field2666 != arg0) {
            this.method2971((int[]) null, this.field2665, arg0, -1);
        }
    }

    @ObfuscatedName("fv.w(Ldk;B)V")
    public void method2977(class108 arg0) {
        arg0.method2226(this.field2666 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2668[field2673[var2]];
            if (var3 == 0) {
                arg0.method2226(-1);
            } else {
                arg0.method2226(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2226(this.field2665[var4]);
        }
    }

    @ObfuscatedName("fv.c(B)V")
    public void method2976() {
        long var1 = this.field2672;
        int var3 = this.field2668[5];
        int var4 = this.field2668[9];
        this.field2668[5] = var4;
        this.field2668[9] = var3;
        this.field2672 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2672 <<= 0x4;
            if (this.field2668[var5] >= 256) {
                this.field2672 += (long) (this.field2668[var5] - 256);
            }
        }
        if (this.field2668[0] >= 256) {
            this.field2672 += (long) (this.field2668[0] - 256 >> 4);
        }
        if (this.field2668[1] >= 256) {
            this.field2672 += (long) (this.field2668[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2672 <<= 0x3;
            this.field2672 += (long) this.field2665[var6];
        }
        this.field2672 <<= 0x1;
        this.field2672 += (long) (this.field2666 ? 1 : 0);
        this.field2668[5] = var3;
        this.field2668[9] = var4;
        if (var1 != 0L && this.field2672 != var1) {
            field2667.method3213(var1);
        }
    }

    @ObfuscatedName("fv.x(Laf;ILaf;IS)Lck;")
    public class99 method2990(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field2664 != -1) {
            return class36.method597(this.field2664).method641(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2672;
        int[] var7 = this.field2668;
        if (arg0 != null && (arg0.field905 >= 0 || arg0.field911 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2668[var8];
            }
            if (arg0.field905 >= 0) {
                var5 += (long) (arg0.field905 - this.field2668[5] << 40);
                var7[5] = arg0.field905;
            }
            if (arg0.field911 >= 0) {
                var5 += (long) (arg0.field911 - this.field2668[3] << 48);
                var7[3] = arg0.field911;
            }
        }
        class99 var9 = (class99) field2667.method3225(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class41.method1863(var12 - 256).method769()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class46.method137(var12 - 512).method852(this.field2666)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2669 != -1L) {
                    var9 = (class99) field2667.method3225(this.field2669);
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
                        class94 var17 = class41.method1863(var16 - 256).method768();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class94 var18 = class46.method137(var16 - 512).method853(this.field2666);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class94 var19 = new class94(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2665[var20] < Statics.field2950[var20].length) {
                        var19.method1908(Statics.field2670[var20], Statics.field2950[var20][this.field2665[var20]]);
                    }
                    if (this.field2665[var20] < Statics.field2671[var20].length) {
                        var19.method1908(Statics.field2111[var20], Statics.field2671[var20][this.field2665[var20]]);
                    }
                }
                var9 = var19.method1915(64, 850, -30, -50, -30);
                field2667.method3211(var9, var5);
                this.field2669 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class99 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method711(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method713(var9, arg3);
        } else {
            var21 = arg0.method713(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fv.f(I)Lcm;")
    public class94 method2978() {
        if (this.field2664 != -1) {
            return class36.method597(this.field2664).method630();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2668[var2];
            if (var3 >= 256 && var3 < 512 && !class41.method1863(var3 - 256).method771()) {
                var1 = true;
            }
            if (var3 >= 512 && !class46.method137(var3 - 512).method854(this.field2666)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class94[] var4 = new class94[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2668[var6];
            if (var7 >= 256 && var7 < 512) {
                class94 var8 = class41.method1863(var7 - 256).method773();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class94 var9 = class46.method137(var7 - 512).method861(this.field2666);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class94 var10 = new class94(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2665[var11] < Statics.field2950[var11].length) {
                var10.method1908(Statics.field2670[var11], Statics.field2950[var11][this.field2665[var11]]);
            }
            if (this.field2665[var11] < Statics.field2671[var11].length) {
                var10.method1908(Statics.field2111[var11], Statics.field2671[var11][this.field2665[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fv.t(B)I")
    public int method2979() {
        return this.field2664 == -1 ? (this.field2668[11] << 5) + (this.field2668[8] << 10) + (this.field2668[0] << 15) + (this.field2665[0] << 25) + (this.field2665[4] << 20) + this.field2668[1] : 305419896 + class36.method597(this.field2664).field792;
    }

    @ObfuscatedName("bb.n(B)V")
    public static void method1428() {
        field2667.method3214();
    }
}

package deob;

@ObfuscatedName("fy")
public class class158 {

    @ObfuscatedName("fy.n")
    public int[] field2681;

    @ObfuscatedName("fy.x")
    public int[] field2680;

    @ObfuscatedName("fy.k")
    public boolean field2679;

    @ObfuscatedName("fy.i")
    public int field2682;

    @ObfuscatedName("fy.d")
    public long field2684;

    @ObfuscatedName("fy.q")
    public long field2688;

    @ObfuscatedName("fy.o")
    public static final int[] field2687 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fy.v")
    public static class172 field2686 = new class172(260);

    @ObfuscatedName("fy.n([I[IZII)V")
    public void method2867(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field942; var6++) {
                    class40 var7 = class40.method35(var6);
                    if (var7 != null && !var7.field951 && var5 + (arg2 ? 7 : 0) == var7.field944) {
                        arg0[field2687[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2681 = arg0;
        this.field2680 = arg1;
        this.field2679 = arg2;
        this.field2682 = arg3;
        this.method2872();
    }

    @ObfuscatedName("fy.x(IZI)V")
    public void method2868(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2679) {
            return;
        }
        int var3 = this.field2681[field2687[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field942) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field942 - 1;
                }
            }
            var4 = class40.method35(var3);
        } while (var4 == null || var4.field951 || arg0 + (this.field2679 ? 7 : 0) != var4.field944);
        this.field2681[field2687[arg0]] = var3 + 256;
        this.method2872();
    }

    @ObfuscatedName("fy.k(IZI)V")
    public void method2884(int arg0, boolean arg1) {
        int var3 = this.field2680[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2653[arg0].length) {
                    var3 = 0;
                }
            } while (!class154.method84(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2653[arg0].length - 1;
                }
            } while (!class154.method84(arg0, var3));
        }
        this.field2680[arg0] = var3;
        this.method2872();
    }

    @ObfuscatedName("fy.i(ZI)V")
    public void method2870(boolean arg0) {
        if (this.field2679 != arg0) {
            this.method2867((int[]) null, this.field2680, arg0, -1);
        }
    }

    @ObfuscatedName("fy.d(Ldw;B)V")
    public void method2866(class107 arg0) {
        arg0.method2124(this.field2679 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2681[field2687[var2]];
            if (var3 == 0) {
                arg0.method2124(-1);
            } else {
                arg0.method2124(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2124(this.field2680[var4]);
        }
    }

    @ObfuscatedName("fy.q(B)V")
    public void method2872() {
        long var1 = this.field2684;
        int var3 = this.field2681[5];
        int var4 = this.field2681[9];
        this.field2681[5] = var4;
        this.field2681[9] = var3;
        this.field2684 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2684 <<= 0x4;
            if (this.field2681[var5] >= 256) {
                this.field2684 += (long) (this.field2681[var5] - 256);
            }
        }
        if (this.field2681[0] >= 256) {
            this.field2684 += (long) (this.field2681[0] - 256 >> 4);
        }
        if (this.field2681[1] >= 256) {
            this.field2684 += (long) (this.field2681[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2684 <<= 0x3;
            this.field2684 += (long) this.field2680[var6];
        }
        this.field2684 <<= 0x1;
        this.field2684 += (long) (this.field2679 ? 1 : 0);
        this.field2681[5] = var3;
        this.field2681[9] = var4;
        if (var1 != 0L && this.field2684 != var1) {
            field2686.method3116(var1);
        }
    }

    @ObfuscatedName("fy.m(Las;ILas;IB)Lcy;")
    public class98 method2873(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2682 != -1) {
            return class35.method616(this.field2682).method648(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2684;
        int[] var7 = this.field2681;
        if (arg0 != null && (arg0.field922 >= 0 || arg0.field913 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2681[var8];
            }
            if (arg0.field922 >= 0) {
                var5 += (long) (arg0.field922 - this.field2681[5] << 40);
                var7[5] = arg0.field922;
            }
            if (arg0.field913 >= 0) {
                var5 += (long) (arg0.field913 - this.field2681[3] << 48);
                var7[3] = arg0.field913;
            }
        }
        class98 var9 = (class98) field2686.method3115(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method35(var12 - 256).method783()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method1982(var12 - 512).method852(this.field2679)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2688 != -1L) {
                    var9 = (class98) field2686.method3115(this.field2688);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class93[] var13 = new class93[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class93 var17 = class40.method35(var16 - 256).method777();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method1982(var16 - 512).method860(this.field2679);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2680[var20] < Statics.field2653[var20].length) {
                        var19.method1907(Statics.field2685[var20], Statics.field2653[var20][this.field2680[var20]]);
                    }
                    if (this.field2680[var20] < Statics.field1914[var20].length) {
                        var19.method1907(Statics.field2683[var20], Statics.field1914[var20][this.field2680[var20]]);
                    }
                }
                var9 = var19.method1908(64, 850, -30, -50, -30);
                field2686.method3117(var9, var5);
                this.field2688 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method717(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method714(var9, arg3);
        } else {
            var21 = arg0.method714(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fy.a(I)Lcx;")
    public class93 method2874() {
        if (this.field2682 != -1) {
            return class35.method616(this.field2682).method627();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2681[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method35(var3 - 256).method778()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method1982(var3 - 512).method872(this.field2679)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2681[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method35(var7 - 256).method788();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method1982(var7 - 512).method854(this.field2679);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2680[var11] < Statics.field2653[var11].length) {
                var10.method1907(Statics.field2685[var11], Statics.field2653[var11][this.field2680[var11]]);
            }
            if (this.field2680[var11] < Statics.field1914[var11].length) {
                var10.method1907(Statics.field2683[var11], Statics.field1914[var11][this.field2680[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fy.w(I)I")
    public int method2875() {
        return this.field2682 == -1 ? (this.field2681[11] << 5) + (this.field2681[8] << 10) + (this.field2681[0] << 15) + (this.field2680[4] << 20) + (this.field2680[0] << 25) + this.field2681[1] : 305419896 + class35.method616(this.field2682).field828;
    }
}

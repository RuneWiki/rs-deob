package deob;

@ObfuscatedName("fl")
public class class164 {

    @ObfuscatedName("fl.c")
    public int[] field2759;

    @ObfuscatedName("fl.q")
    public int[] field2751;

    @ObfuscatedName("fl.y")
    public boolean field2753;

    @ObfuscatedName("fl.v")
    public int field2758;

    @ObfuscatedName("fl.g")
    public long field2755;

    @ObfuscatedName("fl.x")
    public long field2756;

    @ObfuscatedName("fl.t")
    public static final int[] field2752 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fl.m")
    public static class170 field2754 = new class170(260);

    @ObfuscatedName("fl.c([I[IZII)V")
    public void method3061(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field939; var6++) {
                    class36 var7 = class36.method1478(var6);
                    if (var7 != null && !var7.field947 && (arg2 ? 7 : 0) + var5 == var7.field941) {
                        arg0[field2752[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2759 = arg0;
        this.field2751 = arg1;
        this.field2753 = arg2;
        this.field2758 = arg3;
        this.method3067();
    }

    @ObfuscatedName("fl.q(IZI)V")
    public void method3060(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2753) {
            return;
        }
        int var3 = this.field2759[field2752[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field939) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field939 - 1;
                }
            }
            var4 = class36.method1478(var3);
        } while (var4 == null || var4.field947 || var4.field941 != (this.field2753 ? 7 : 0) + arg0);
        this.field2759[field2752[arg0]] = var3 + 256;
        this.method3067();
    }

    @ObfuscatedName("fl.y(IZI)V")
    public void method3074(int arg0, boolean arg1) {
        int var3 = this.field2751[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2757[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2757[arg0].length - 1;
            }
        }
        this.field2751[arg0] = var3;
        this.method3067();
    }

    @ObfuscatedName("fl.v(ZB)V")
    public void method3064(boolean arg0) {
        if (this.field2753 != arg0) {
            this.method3061((int[]) null, this.field2751, arg0, -1);
        }
    }

    @ObfuscatedName("fl.g(Ldg;B)V")
    public void method3065(class127 arg0) {
        arg0.method2333(this.field2753 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2759[field2752[var2]];
            if (var3 == 0) {
                arg0.method2333(-1);
            } else {
                arg0.method2333(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2333(this.field2751[var4]);
        }
    }

    @ObfuscatedName("fl.x(I)V")
    public void method3067() {
        long var1 = this.field2755;
        int var3 = this.field2759[5];
        int var4 = this.field2759[9];
        this.field2759[5] = var4;
        this.field2759[9] = var3;
        this.field2755 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2755 <<= 0x4;
            if (this.field2759[var5] >= 256) {
                this.field2755 += (long) (this.field2759[var5] - 256);
            }
        }
        if (this.field2759[0] >= 256) {
            this.field2755 += (long) (this.field2759[0] - 256 >> 4);
        }
        if (this.field2759[1] >= 256) {
            this.field2755 += (long) (this.field2759[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2755 <<= 0x3;
            this.field2755 += (long) this.field2751[var6];
        }
        this.field2755 <<= 0x1;
        this.field2755 += (long) (this.field2753 ? 1 : 0);
        this.field2759[5] = var3;
        this.field2759[9] = var4;
        if (var1 != 0L && this.field2755 != var1) {
            field2754.method3091(var1);
        }
    }

    @ObfuscatedName("fl.u(Lan;ILan;II)Ldl;")
    public class112 method3081(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2758 != -1) {
            return class31.method131(this.field2758).method578(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2755;
        int[] var7 = this.field2759;
        if (arg0 != null && (arg0.field912 >= 0 || arg0.field913 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2759[var8];
            }
            if (arg0.field912 >= 0) {
                var5 += (long) (arg0.field912 - this.field2759[5] << 40);
                var7[5] = arg0.field912;
            }
            if (arg0.field913 >= 0) {
                var5 += (long) (arg0.field913 - this.field2759[3] << 48);
                var7[3] = arg0.field913;
            }
        }
        class112 var9 = (class112) field2754.method3097(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method1478(var12 - 256).method755()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method11(var12 - 512).method799(this.field2753)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2756 != -1L) {
                    var9 = (class112) field2754.method3097(this.field2756);
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
                        class101 var17 = class36.method1478(var16 - 256).method735();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method11(var16 - 512).method800(this.field2753);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2751[var20] < Statics.field2757[var20].length) {
                        var19.method1976(Statics.field1435[var20], Statics.field2757[var20][this.field2751[var20]]);
                    }
                    if (this.field2751[var20] < Statics.field1248[var20].length) {
                        var19.method1976(Statics.field182[var20], Statics.field1248[var20][this.field2751[var20]]);
                    }
                }
                var9 = var19.method1971(64, 850, -30, -50, -30);
                field2754.method3092(var9, var5);
                this.field2756 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method703(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method678(var9, arg3);
        } else {
            var21 = arg0.method678(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fl.l(I)Lcz;")
    public class101 method3068() {
        if (this.field2758 != -1) {
            return class31.method131(this.field2758).method582();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2759[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method1478(var3 - 256).method736()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method11(var3 - 512).method801(this.field2753)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2759[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method1478(var7 - 256).method737();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method11(var7 - 512).method802(this.field2753);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2751[var11] < Statics.field2757[var11].length) {
                var10.method1976(Statics.field1435[var11], Statics.field2757[var11][this.field2751[var11]]);
            }
            if (this.field2751[var11] < Statics.field1248[var11].length) {
                var10.method1976(Statics.field182[var11], Statics.field1248[var11][this.field2751[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fl.a(I)I")
    public int method3069() {
        return this.field2758 == -1 ? (this.field2759[11] << 5) + (this.field2759[8] << 10) + (this.field2759[0] << 15) + (this.field2751[0] << 25) + (this.field2751[4] << 20) + this.field2759[1] : 305419896 + class31.method131(this.field2758).field790;
    }

    @ObfuscatedName("p.h(I)V")
    public static void method212() {
        field2754.method3093();
    }
}

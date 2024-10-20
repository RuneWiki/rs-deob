package deob;

@ObfuscatedName("fe")
public class class164 {

    @ObfuscatedName("fe.q")
    public int[] field2756;

    @ObfuscatedName("fe.c")
    public int[] field2747;

    @ObfuscatedName("fe.p")
    public boolean field2750;

    @ObfuscatedName("fe.z")
    public int field2749;

    @ObfuscatedName("fe.m")
    public long field2751;

    @ObfuscatedName("fe.k")
    public long field2752;

    @ObfuscatedName("fe.h")
    public static final int[] field2754 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fe.b")
    public static class170 field2755 = new class170(260);

    @ObfuscatedName("fe.q([I[IZII)V")
    public void method3165(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field169; var6++) {
                    class36 var7 = class36.method1851(var6);
                    if (var7 != null && !var7.field929 && (arg2 ? 7 : 0) + var5 == var7.field931) {
                        arg0[field2754[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2756 = arg0;
        this.field2747 = arg1;
        this.field2750 = arg2;
        this.field2749 = arg3;
        this.method3170();
    }

    @ObfuscatedName("fe.c(IZI)V")
    public void method3166(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2750) {
            return;
        }
        int var3 = this.field2756[field2754[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field169) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field169 - 1;
                }
            }
            var4 = class36.method1851(var3);
        } while (var4 == null || var4.field929 || (this.field2750 ? 7 : 0) + arg0 != var4.field931);
        this.field2756[field2754[arg0]] = var3 + 256;
        this.method3170();
    }

    @ObfuscatedName("fe.p(IZI)V")
    public void method3167(int arg0, boolean arg1) {
        int var3 = this.field2747[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2035[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2035[arg0].length - 1;
            }
        }
        this.field2747[arg0] = var3;
        this.method3170();
    }

    @ObfuscatedName("fe.z(ZI)V")
    public void method3168(boolean arg0) {
        if (this.field2750 != arg0) {
            this.method3165((int[]) null, this.field2747, arg0, -1);
        }
    }

    @ObfuscatedName("fe.m(Ldo;I)V")
    public void method3179(class127 arg0) {
        arg0.method2411(this.field2750 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2756[field2754[var2]];
            if (var3 == 0) {
                arg0.method2411(-1);
            } else {
                arg0.method2411(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2411(this.field2747[var4]);
        }
    }

    @ObfuscatedName("fe.k(B)V")
    public void method3170() {
        long var1 = this.field2751;
        int var3 = this.field2756[5];
        int var4 = this.field2756[9];
        this.field2756[5] = var4;
        this.field2756[9] = var3;
        this.field2751 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2751 <<= 0x4;
            if (this.field2756[var5] >= 256) {
                this.field2751 += (long) (this.field2756[var5] - 256);
            }
        }
        if (this.field2756[0] >= 256) {
            this.field2751 += (long) (this.field2756[0] - 256 >> 4);
        }
        if (this.field2756[1] >= 256) {
            this.field2751 += (long) (this.field2756[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2751 <<= 0x3;
            this.field2751 += (long) this.field2747[var6];
        }
        this.field2751 <<= 0x1;
        this.field2751 += (long) (this.field2750 ? 1 : 0);
        this.field2756[5] = var3;
        this.field2756[9] = var4;
        if (var1 != 0L && this.field2751 != var1) {
            field2755.method3216(var1);
        }
    }

    @ObfuscatedName("fe.v(Lak;ILak;IB)Ldn;")
    public class112 method3185(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2749 != -1) {
            return class31.method561(this.field2749).method629(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2751;
        int[] var7 = this.field2756;
        if (arg0 != null && (arg0.field890 >= 0 || arg0.field879 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2756[var8];
            }
            if (arg0.field890 >= 0) {
                var5 += (long) (arg0.field890 - this.field2756[5] << 40);
                var7[5] = arg0.field890;
            }
            if (arg0.field879 >= 0) {
                var5 += (long) (arg0.field879 - this.field2756[3] << 48);
                var7[3] = arg0.field879;
            }
        }
        class112 var9 = (class112) field2755.method3215(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method1851(var12 - 256).method763()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method782(var12 - 512).method828(this.field2750)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2752 != -1L) {
                    var9 = (class112) field2755.method3215(this.field2752);
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
                        class101 var17 = class36.method1851(var16 - 256).method764();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method782(var16 - 512).method850(this.field2750);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2747[var20] < Statics.field2035[var20].length) {
                        var19.method2072(Statics.field2753[var20], Statics.field2035[var20][this.field2747[var20]]);
                    }
                    if (this.field2747[var20] < Statics.field257[var20].length) {
                        var19.method2072(Statics.field272[var20], Statics.field257[var20][this.field2747[var20]]);
                    }
                }
                var9 = var19.method2049(64, 850, -30, -50, -30);
                field2755.method3225(var9, var5);
                this.field2752 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method713(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method710(var9, arg3);
        } else {
            var21 = arg0.method710(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fe.y(I)Lcy;")
    public class101 method3188() {
        if (this.field2749 != -1) {
            return class31.method561(this.field2749).method610();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2756[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method1851(var3 - 256).method766()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method782(var3 - 512).method846(this.field2750)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2756[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method1851(var7 - 256).method777();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method782(var7 - 512).method860(this.field2750);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2747[var11] < Statics.field2035[var11].length) {
                var10.method2072(Statics.field2753[var11], Statics.field2035[var11][this.field2747[var11]]);
            }
            if (this.field2747[var11] < Statics.field257[var11].length) {
                var10.method2072(Statics.field272[var11], Statics.field257[var11][this.field2747[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fe.d(I)I")
    public int method3173() {
        return this.field2749 == -1 ? (this.field2756[11] << 5) + (this.field2756[8] << 10) + (this.field2756[0] << 15) + (this.field2747[0] << 25) + (this.field2747[4] << 20) + this.field2756[1] : 305419896 + class31.method561(this.field2749).field779;
    }

    @ObfuscatedName("ac.l(B)V")
    public static void method760() {
        field2755.method3218();
    }
}

package deob;

@ObfuscatedName("ha")
public class class217 {

    @ObfuscatedName("ha.w")
    public int[] field2625;

    @ObfuscatedName("ha.o")
    public int[] field2624;

    @ObfuscatedName("ha.x")
    public boolean field2626;

    @ObfuscatedName("ha.k")
    public int field2627;

    @ObfuscatedName("ha.f")
    public long field2628;

    @ObfuscatedName("ha.i")
    public long field2629;

    @ObfuscatedName("ha.v")
    public static final int[] field2631 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ha.h")
    public static class193 field2632 = new class193(260);

    @ObfuscatedName("ha.w([I[IZII)V")
    public void method3631(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field366; var6++) {
                    class251 var7 = class251.method622(var6);
                    if (var7 != null && !var7.field3356 && var5 + (arg2 ? 7 : 0) == var7.field3361) {
                        arg0[field2631[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2625 = arg0;
        this.field2624 = arg1;
        this.field2626 = arg2;
        this.field2627 = arg3;
        this.method3612();
    }

    @ObfuscatedName("ha.o(IZI)V")
    public void method3635(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2626) {
            return;
        }
        int var3 = this.field2625[field2631[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class251 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field366) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field366 - 1;
                }
            }
            var4 = class251.method622(var3);
        } while (var4 == null || var4.field3356 || var4.field3361 != (this.field2626 ? 7 : 0) + arg0);
        this.field2625[field2631[arg0]] = var3 + 256;
        this.method3612();
    }

    @ObfuscatedName("ha.x(IZB)V")
    public void method3619(int arg0, boolean arg1) {
        int var3 = this.field2624[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field3738[arg0].length) {
                    var3 = 0;
                }
            } while (!class218.method1443(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3738[arg0].length - 1;
                }
            } while (!class218.method1443(arg0, var3));
        }
        this.field2624[arg0] = var3;
        this.method3612();
    }

    @ObfuscatedName("ha.k(ZI)V")
    public void method3613(boolean arg0) {
        if (this.field2626 != arg0) {
            this.method3631((int[]) null, this.field2624, arg0, -1);
        }
    }

    @ObfuscatedName("ha.f(Lfi;S)V")
    public void method3624(class177 arg0) {
        arg0.method3075(this.field2626 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2625[field2631[var2]];
            if (var3 == 0) {
                arg0.method3075(-1);
            } else {
                arg0.method3075(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3075(this.field2624[var4]);
        }
    }

    @ObfuscatedName("ha.i(B)V")
    public void method3612() {
        long var1 = this.field2628;
        int var3 = this.field2625[5];
        int var4 = this.field2625[9];
        this.field2625[5] = var4;
        this.field2625[9] = var3;
        this.field2628 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2628 <<= 0x4;
            if (this.field2625[var5] >= 256) {
                this.field2628 += (long) (this.field2625[var5] - 256);
            }
        }
        if (this.field2625[0] >= 256) {
            this.field2628 += (long) (this.field2625[0] - 256 >> 4);
        }
        if (this.field2625[1] >= 256) {
            this.field2628 += (long) (this.field2625[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2628 <<= 0x3;
            this.field2628 += (long) this.field2624[var6];
        }
        this.field2628 <<= 0x1;
        this.field2628 += (long) (this.field2626 ? 1 : 0);
        this.field2625[5] = var3;
        this.field2625[9] = var4;
        if (var1 != 0L && this.field2628 != var1) {
            field2632.method3240(var1);
        }
    }

    @ObfuscatedName("ha.j(Ljz;ILjz;IS)Lev;")
    public class134 method3615(class264 arg0, int arg1, class264 arg2, int arg3) {
        if (this.field2627 != -1) {
            return class262.method1007(this.field2627).method4275(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2628;
        int[] var7 = this.field2625;
        if (arg0 != null && (arg0.field3629 >= 0 || arg0.field3631 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2625[var8];
            }
            if (arg0.field3629 >= 0) {
                var5 += (long) (arg0.field3629 - this.field2625[5] << 40);
                var7[5] = arg0.field3629;
            }
            if (arg0.field3631 >= 0) {
                var5 += (long) (arg0.field3631 - this.field2625[3] << 48);
                var7[3] = arg0.field3631;
            }
        }
        class134 var9 = (class134) field2632.method3239(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class251.method622(var12 - 256).method3974()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class260.method3915(var12 - 512).method4202(this.field2626)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2629 != -1L) {
                    var9 = (class134) field2632.method3239(this.field2629);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class128[] var13 = new class128[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class128 var17 = class251.method622(var16 - 256).method3975();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = class260.method3915(var16 - 512).method4203(this.field2626);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2624[var20] < Statics.field3738[var20].length) {
                        var19.method2177(Statics.field2429[var20], Statics.field3738[var20][this.field2624[var20]]);
                    }
                    if (this.field2624[var20] < Statics.field2630[var20].length) {
                        var19.method2177(Statics.field1437[var20], Statics.field2630[var20][this.field2624[var20]]);
                    }
                }
                var9 = var19.method2185(64, 850, -30, -50, -30);
                field2632.method3241(var9, var5);
                this.field2629 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4347(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4375(var9, arg3);
        } else {
            var21 = arg0.method4375(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ha.m(I)Ldb;")
    public class128 method3609() {
        if (this.field2627 != -1) {
            return class262.method1007(this.field2627).method4280();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2625[var2];
            if (var3 >= 256 && var3 < 512 && !class251.method622(var3 - 256).method3976()) {
                var1 = true;
            }
            if (var3 >= 512 && !class260.method3915(var3 - 512).method4204(this.field2626)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2625[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class251.method622(var7 - 256).method3999();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = class260.method3915(var7 - 512).method4205(this.field2626);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2624[var11] < Statics.field3738[var11].length) {
                var10.method2177(Statics.field2429[var11], Statics.field3738[var11][this.field2624[var11]]);
            }
            if (this.field2624[var11] < Statics.field2630[var11].length) {
                var10.method2177(Statics.field1437[var11], Statics.field2630[var11][this.field2624[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ha.u(B)I")
    public int method3618() {
        return this.field2627 == -1 ? (this.field2625[11] << 5) + (this.field2625[8] << 10) + (this.field2625[0] << 15) + (this.field2624[0] << 25) + (this.field2624[4] << 20) + this.field2625[1] : 305419896 + class262.method1007(this.field2627).field3568;
    }
}

package deob;

@ObfuscatedName("hi")
public class class214 {

    @ObfuscatedName("hi.i")
    public int[] field2619;

    @ObfuscatedName("hi.c")
    public int[] field2625;

    @ObfuscatedName("hi.e")
    public boolean field2620;

    @ObfuscatedName("hi.v")
    public int field2621;

    @ObfuscatedName("hi.b")
    public long field2622;

    @ObfuscatedName("hi.y")
    public long field2623;

    @ObfuscatedName("hi.a")
    public static final int[] field2626 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hi.o")
    public static class190 field2627 = new class190(260);

    @ObfuscatedName("hi.i([I[IZII)V")
    public void method3606(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3351; var6++) {
                    class248 var7 = class248.method2678(var6);
                    if (var7 != null && !var7.field3358 && var7.field3356 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2626[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2619 = arg0;
        this.field2625 = arg1;
        this.field2620 = arg2;
        this.field2621 = arg3;
        this.method3626();
    }

    @ObfuscatedName("hi.c(IZI)V")
    public void method3607(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2620) {
            return;
        }
        int var3 = this.field2619[field2626[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3351) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3351 - 1;
                }
            }
            var4 = class248.method2678(var3);
        } while (var4 == null || var4.field3358 || var4.field3356 != arg0 + (this.field2620 ? 7 : 0));
        this.field2619[field2626[arg0]] = var3 + 256;
        this.method3626();
    }

    @ObfuscatedName("hi.e(IZI)V")
    public void method3608(int arg0, boolean arg1) {
        int var3 = this.field2625[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2628[arg0].length) {
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
                    var3 = Statics.field2628[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2625[arg0] = var3;
        this.method3626();
    }

    @ObfuscatedName("hi.v(ZI)V")
    public void method3609(boolean arg0) {
        if (this.field2620 != arg0) {
            this.method3606((int[]) null, this.field2625, arg0, -1);
        }
    }

    @ObfuscatedName("hi.b(Lfx;B)V")
    public void method3631(class174 arg0) {
        arg0.method2865(this.field2620 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2619[field2626[var2]];
            if (var3 == 0) {
                arg0.method2865(-1);
            } else {
                arg0.method2865(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2865(this.field2625[var4]);
        }
    }

    @ObfuscatedName("hi.y(I)V")
    public void method3626() {
        long var1 = this.field2622;
        int var3 = this.field2619[5];
        int var4 = this.field2619[9];
        this.field2619[5] = var4;
        this.field2619[9] = var3;
        this.field2622 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2622 <<= 0x4;
            if (this.field2619[var5] >= 256) {
                this.field2622 += (long) (this.field2619[var5] - 256);
            }
        }
        if (this.field2619[0] >= 256) {
            this.field2622 += (long) (this.field2619[0] - 256 >> 4);
        }
        if (this.field2619[1] >= 256) {
            this.field2622 += (long) (this.field2619[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2622 <<= 0x3;
            this.field2622 += (long) this.field2625[var6];
        }
        this.field2622 <<= 0x1;
        this.field2622 += (long) (this.field2620 ? 1 : 0);
        this.field2619[5] = var3;
        this.field2619[9] = var4;
        if (var1 != 0L && this.field2622 != var1) {
            field2627.method3223(var1);
        }
    }

    @ObfuscatedName("hi.h(Lje;ILje;IB)Led;")
    public class134 method3612(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2621 != -1) {
            return class259.method3724(this.field2621).method4293(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2622;
        int[] var7 = this.field2619;
        if (arg0 != null && (arg0.field3612 >= 0 || arg0.field3598 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2619[var8];
            }
            if (arg0.field3612 >= 0) {
                var5 += (long) (arg0.field3612 - this.field2619[5] << 40);
                var7[5] = arg0.field3612;
            }
            if (arg0.field3598 >= 0) {
                var5 += (long) (arg0.field3598 - this.field2619[3] << 48);
                var7[3] = arg0.field3598;
            }
        }
        class134 var9 = (class134) field2627.method3220(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method2678(var12 - 256).method4021()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class257.method2996(var12 - 512).method4236(this.field2620)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2623 != -1L) {
                    var9 = (class134) field2627.method3220(this.field2623);
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
                        class128 var17 = class248.method2678(var16 - 256).method4022();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = class257.method2996(var16 - 512).method4228(this.field2620);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2625[var20] < Statics.field2628[var20].length) {
                        var19.method2190(Statics.field3677[var20], Statics.field2628[var20][this.field2625[var20]]);
                    }
                    if (this.field2625[var20] < Statics.field1704[var20].length) {
                        var19.method2190(Statics.field2624[var20], Statics.field1704[var20][this.field2625[var20]]);
                    }
                }
                var9 = var19.method2198(64, 850, -30, -50, -30);
                field2627.method3222(var9, var5);
                this.field2623 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4339(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4336(var9, arg3);
        } else {
            var21 = arg0.method4336(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hi.x(I)Ldw;")
    public class128 method3613() {
        if (this.field2621 != -1) {
            return class259.method3724(this.field2621).method4295();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2619[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method2678(var3 - 256).method4023()) {
                var1 = true;
            }
            if (var3 >= 512 && !class257.method2996(var3 - 512).method4229(this.field2620)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2619[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class248.method2678(var7 - 256).method4030();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = class257.method2996(var7 - 512).method4230(this.field2620);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2625[var11] < Statics.field2628[var11].length) {
                var10.method2190(Statics.field3677[var11], Statics.field2628[var11][this.field2625[var11]]);
            }
            if (this.field2625[var11] < Statics.field1704[var11].length) {
                var10.method2190(Statics.field2624[var11], Statics.field1704[var11][this.field2625[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hi.f(B)I")
    public int method3614() {
        return this.field2621 == -1 ? (this.field2619[11] << 5) + (this.field2619[8] << 10) + (this.field2619[0] << 15) + (this.field2625[0] << 25) + (this.field2625[4] << 20) + this.field2619[1] : 305419896 + class259.method3724(this.field2621).field3550;
    }

    @ObfuscatedName("p.n(B)V")
    public static void method137() {
        field2627.method3221();
    }
}

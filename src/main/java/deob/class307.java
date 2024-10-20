package deob;

@ObfuscatedName("ka")
public class class307 {

    @ObfuscatedName("ka.f")
    public int[] field3493;

    @ObfuscatedName("ka.w")
    public int[] field3494;

    @ObfuscatedName("ka.v")
    public int field3487 = -1;

    @ObfuscatedName("ka.s")
    public int field3492 = 0;

    @ObfuscatedName("ka.z")
    public int field3485;

    @ObfuscatedName("ka.j")
    public long field3490;

    @ObfuscatedName("ka.i")
    public long field3491;

    @ObfuscatedName("ka.n")
    public class180[] field3489;

    @ObfuscatedName("ka.l")
    public boolean field3486 = false;

    @ObfuscatedName("ka.m")
    public static final int[] field3488 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ka.t")
    public static class273 field3495 = new class273(260);

    @ObfuscatedName("ka.f([I[Lfy;Z[IIIIS)V")
    public void method5356(int[] arg0, class180[] arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6) {
        this.field3489 = arg1;
        this.field3486 = arg2;
        this.field3487 = arg6;
        this.method5380(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("ka.w([I[IIII)V")
    public void method5380(int[] arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1976; var6++) {
                    class185 var7 = class185.method2736(var6);
                    if (var7 != null && !var7.field1965 && var5 + (arg2 == 1 ? 7 : 0) == var7.field1969) {
                        arg0[field3488[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3493 = arg0;
        this.field3494 = arg1;
        this.field3492 = arg2;
        this.field3485 = arg3;
        this.method5371();
    }

    @ObfuscatedName("ka.v(IZI)V")
    public void method5354(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3492 == 1) {
            return;
        }
        int var3 = this.field3493[field3488[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class185 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1976) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1976 - 1;
                }
            }
            var4 = class185.method2736(var3);
        } while (var4 == null || var4.field1965 || var4.field1969 != arg0 + (this.field3492 == 1 ? 7 : 0));
        this.field3493[field3488[arg0]] = var3 + 256;
        this.method5371();
    }

    @ObfuscatedName("ka.s(IZB)V")
    public void method5355(int arg0, boolean arg1) {
        int var3 = this.field3494[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1436[arg0].length) {
                    var3 = 0;
                }
            } while (!class309.method1784(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1436[arg0].length - 1;
                }
            } while (!class309.method1784(arg0, var3));
        }
        this.field3494[arg0] = var3;
        this.method5371();
    }

    @ObfuscatedName("ka.z(II)V")
    public void method5368(int arg0) {
        if (this.field3492 != arg0) {
            this.method5380((int[]) null, this.field3494, arg0, -1);
        }
    }

    @ObfuscatedName("ka.j(Lrd;B)V")
    public void method5358(class474 arg0) {
        arg0.method7947(this.field3492);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3493[field3488[var2]];
            if (var3 == 0) {
                arg0.method7947(-1);
            } else {
                arg0.method7947(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method7947(this.field3494[var4]);
        }
    }

    @ObfuscatedName("ka.i(I)V")
    public void method5371() {
        long var1 = this.field3490;
        int var3 = this.field3493[5];
        int var4 = this.field3493[9];
        this.field3493[5] = var4;
        this.field3493[9] = var3;
        this.field3490 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3490 <<= 0x4;
            if (this.field3493[var5] >= 256) {
                this.field3490 += (long) (this.field3493[var5] - 256);
            }
        }
        if (this.field3493[0] >= 256) {
            this.field3490 += (long) (this.field3493[0] - 256 >> 4);
        }
        if (this.field3493[1] >= 256) {
            this.field3490 += (long) (this.field3493[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3490 <<= 0x3;
            this.field3490 += (long) this.field3494[var6];
        }
        this.field3490 <<= 0x1;
        this.field3490 += (long) (this.field3492 * 1135706119) * -1359876681L;
        this.field3493[5] = var3;
        this.field3493[9] = var4;
        if (var1 != 0L && this.field3490 != var1 || this.field3486) {
            field3495.method5029(var1);
        }
    }

    @ObfuscatedName("ka.n(Lge;ILge;IB)Lhs;")
    public class228 method5357(class203 arg0, int arg1, class203 arg2, int arg3) {
        if (this.field3485 != -1) {
            return class191.method2988(this.field3485).method3424(arg0, arg1, arg2, arg3, (class190) null);
        }
        long var5 = this.field3490;
        int[] var7 = this.field3493;
        if (arg0 != null && (arg0.field2303 >= 0 || arg0.field2304 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3493[var8];
            }
            if (arg0.field2303 >= 0) {
                var5 += (long) (arg0.field2303 - this.field3493[5] << 40);
                var7[5] = arg0.field2303;
            }
            if (arg0.field2304 >= 0) {
                var5 += (long) (arg0.field2304 - this.field3493[3] << 48);
                var7[3] = arg0.field2304;
            }
        }
        class228 var9 = (class228) field3495.method5028(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class185.method2736(var12 - 256).method3349()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class201.method2583(var12 - 512).method3668(this.field3492)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3491 != -1L) {
                    var9 = (class228) field3495.method5028(this.field3491);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class212[] var13 = new class212[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class212 var17 = class185.method2736(var16 - 256).method3350();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class201 var18 = class201.method2583(var16 - 512);
                        class212 var19 = var18.method3658(this.field3492);
                        if (var19 != null) {
                            if (this.field3489 != null) {
                                class180 var20 = this.field3489[var15];
                                if (var20 != null) {
                                    if (var20.field1914 != null && var18.field2246 != null && var18.field2219.length == var20.field1914.length) {
                                        for (int var21 = 0; var21 < var18.field2246.length; var21++) {
                                            var19.method3902(var18.field2219[var21], var20.field1914[var21]);
                                        }
                                    }
                                    if (var20.field1915 != null && var18.field2220 != null && var18.field2221.length == var20.field1915.length) {
                                        for (int var22 = 0; var22 < var18.field2220.length; var22++) {
                                            var19.method3943(var18.field2221[var22], var20.field1915[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class212 var23 = new class212(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3494[var24] < Statics.field1436[var24].length) {
                        var23.method3902(Statics.field4484[var24], Statics.field1436[var24][this.field3494[var24]]);
                    }
                    if (this.field3494[var24] < Statics.field1380[var24].length) {
                        var23.method3902(Statics.field2386[var24], Statics.field1380[var24][this.field3494[var24]]);
                    }
                }
                var9 = var23.method3888(64, 850, -30, -50, -30);
                field3495.method5027(var9, var5);
                this.field3491 = var5;
            }
        }
        class228 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var9.method4404(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method3767(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3747(var9, arg3);
        } else {
            var25 = arg0.method3747(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("ka.l(B)Lhe;")
    public class212 method5364() {
        if (this.field3485 != -1) {
            return class191.method2988(this.field3485).method3451((class190) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3493[var2];
            if (var3 >= 256 && var3 < 512 && !class185.method2736(var3 - 256).method3348()) {
                var1 = true;
            }
            if (var3 >= 512 && !class201.method2583(var3 - 512).method3659(this.field3492)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class212[] var4 = new class212[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3493[var6];
            if (var7 >= 256 && var7 < 512) {
                class212 var8 = class185.method2736(var7 - 256).method3351();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class212 var9 = class201.method2583(var7 - 512).method3660(this.field3492);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class212 var10 = new class212(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3494[var11] < Statics.field1436[var11].length) {
                var10.method3902(Statics.field4484[var11], Statics.field1436[var11][this.field3494[var11]]);
            }
            if (this.field3494[var11] < Statics.field1380[var11].length) {
                var10.method3902(Statics.field2386[var11], Statics.field1380[var11][this.field3494[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ka.k(I)I")
    public int method5369() {
        return this.field3485 == -1 ? (this.field3493[11] << 5) + (this.field3493[8] << 10) + (this.field3493[0] << 15) + (this.field3494[0] << 25) + (this.field3494[4] << 20) + this.field3493[1] : 305419896 + class191.method2988(this.field3485).field2028;
    }

    @ObfuscatedName("ht.c(B)V")
    public static void method4490() {
        field3495.method5033();
    }
}

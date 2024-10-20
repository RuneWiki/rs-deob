package deob;

@ObfuscatedName("lc")
public class class310 {

    @ObfuscatedName("lc.aj")
    public int[] field3463;

    @ObfuscatedName("lc.al")
    public int[] field3468;

    @ObfuscatedName("lc.ac")
    public int field3462 = -1;

    @ObfuscatedName("lc.ab")
    public int field3465 = 0;

    @ObfuscatedName("lc.an")
    public int field3466;

    @ObfuscatedName("lc.ao")
    public long field3469;

    @ObfuscatedName("lc.av")
    public long field3464;

    @ObfuscatedName("lc.aq")
    public class181[] field3467;

    @ObfuscatedName("lc.ap")
    public boolean field3470 = false;

    @ObfuscatedName("lc.ay")
    public static final int[] field3471 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("lc.am")
    public static class276 field3472 = new class276(260);

    @ObfuscatedName("lc.aj([I[Lgv;Z[IIIII)V")
    public void method5240(int[] arg0, class181[] arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6) {
        this.field3467 = arg1;
        this.field3470 = arg2;
        this.field3462 = arg6;
        this.method5232(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("lc.al([I[IIII)V")
    public void method5232(int[] arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1935; var6++) {
                    class187 var7 = class187.method6840(var6);
                    if (var7 != null && !var7.field1938 && var5 + (arg2 == 1 ? 7 : 0) == var7.field1934) {
                        arg0[field3471[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3463 = arg0;
        this.field3468 = arg1;
        this.field3465 = arg2;
        this.field3466 = arg3;
        this.method5237();
    }

    @ObfuscatedName("lc.ac(IZI)V")
    public void method5231(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3465 == 1) {
            return;
        }
        int var3 = this.field3463[field3471[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class187 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1935) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1935 - 1;
                }
            }
            var4 = class187.method6840(var3);
        } while (var4 == null || var4.field1938 || (this.field3465 == 1 ? 7 : 0) + arg0 != var4.field1934);
        this.field3463[field3471[arg0]] = var3 + 256;
        this.method5237();
    }

    @ObfuscatedName("lc.ab(IZB)V")
    public void method5234(int arg0, boolean arg1) {
        int var3 = this.field3468[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2316[arg0].length) {
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
                    var3 = Statics.field2316[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3468[arg0] = var3;
        this.method5237();
    }

    @ObfuscatedName("lc.an(II)V")
    public void method5235(int arg0) {
        if (this.field3465 != arg0) {
            this.method5232((int[]) null, this.field3468, arg0, -1);
        }
    }

    @ObfuscatedName("lc.ao(Lsy;B)V")
    public void method5254(class478 arg0) {
        arg0.method7886(this.field3465);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3463[field3471[var2]];
            if (var3 == 0) {
                arg0.method7886(-1);
            } else {
                arg0.method7886(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method7886(this.field3468[var4]);
        }
    }

    @ObfuscatedName("lc.av(B)V")
    public void method5237() {
        long var1 = this.field3469;
        int var3 = this.field3463[5];
        int var4 = this.field3463[9];
        this.field3463[5] = var4;
        this.field3463[9] = var3;
        this.field3469 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3469 <<= 0x4;
            if (this.field3463[var5] >= 256) {
                this.field3469 += (long) (this.field3463[var5] - 256);
            }
        }
        if (this.field3463[0] >= 256) {
            this.field3469 += (long) (this.field3463[0] - 256 >> 4);
        }
        if (this.field3463[1] >= 256) {
            this.field3469 += (long) (this.field3463[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3469 <<= 0x3;
            this.field3469 += (long) this.field3468[var6];
        }
        this.field3469 <<= 0x1;
        this.field3469 += (long) (this.field3465 * -410623505) * -1628771057L;
        this.field3463[5] = var3;
        this.field3463[9] = var4;
        if (var1 != 0L && this.field3469 != var1 || this.field3470) {
            field3472.method4924(var1);
        }
    }

    @ObfuscatedName("lc.aq(Lhx;ILhx;II)Lix;")
    public class231 method5233(class206 arg0, int arg1, class206 arg2, int arg3) {
        if (this.field3466 != -1) {
            return class193.method3331(this.field3466).method3352(arg0, arg1, arg2, arg3, (class192) null);
        }
        long var5 = this.field3469;
        int[] var7 = this.field3463;
        if (arg0 != null && (arg0.field2275 >= 0 || arg0.field2272 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3463[var8];
            }
            if (arg0.field2275 >= 0) {
                var5 += (long) (arg0.field2275 - this.field3463[5] << 40);
                var7[5] = arg0.field2275;
            }
            if (arg0.field2272 >= 0) {
                var5 += (long) (arg0.field2272 - this.field3463[3] << 48);
                var7[3] = arg0.field2272;
            }
        }
        class231 var9 = (class231) field3472.method4921(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class187.method6840(var12 - 256).method3282()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class204.method3453(var12 - 512).method3598(this.field3465)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3464 != -1L) {
                    var9 = (class231) field3472.method4921(this.field3464);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class215[] var13 = new class215[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class215 var17 = class187.method6840(var16 - 256).method3284();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class204 var18 = class204.method3453(var16 - 512);
                        class215 var19 = var18.method3599(this.field3465);
                        if (var19 != null) {
                            if (this.field3467 != null) {
                                class181 var20 = this.field3467[var15];
                                if (var20 != null) {
                                    if (var20.field1872 != null && var18.field2192 != null && var18.field2187.length == var20.field1872.length) {
                                        for (int var21 = 0; var21 < var18.field2192.length; var21++) {
                                            var19.method3817(var18.field2187[var21], var20.field1872[var21]);
                                        }
                                    }
                                    if (var20.field1873 != null && var18.field2188 != null && var18.field2184.length == var20.field1873.length) {
                                        for (int var22 = 0; var22 < var18.field2188.length; var22++) {
                                            var19.method3826(var18.field2184[var22], var20.field1873[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class215 var23 = new class215(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3468[var24] < Statics.field2316[var24].length) {
                        var23.method3817(Statics.field3458[var24], Statics.field2316[var24][this.field3468[var24]]);
                    }
                    if (this.field3468[var24] < Statics.field1496[var24].length) {
                        var23.method3817(Statics.field1530[var24], Statics.field1496[var24][this.field3468[var24]]);
                    }
                }
                var9 = var23.method3833(64, 850, -30, -50, -30);
                field3472.method4923(var9, var5);
                this.field3464 = var5;
            }
        }
        class231 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var9.method4239(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method3691(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3710(var9, arg3);
        } else {
            var25 = arg0.method3710(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("lc.ap(I)Liu;")
    public class215 method5262() {
        if (this.field3466 != -1) {
            return class193.method3331(this.field3466).method3353((class192) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3463[var2];
            if (var3 >= 256 && var3 < 512 && !class187.method6840(var3 - 256).method3294()) {
                var1 = true;
            }
            if (var3 >= 512 && !class204.method3453(var3 - 512).method3600(this.field3465)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class215[] var4 = new class215[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3463[var6];
            if (var7 >= 256 && var7 < 512) {
                class215 var8 = class187.method6840(var7 - 256).method3312();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class215 var9 = class204.method3453(var7 - 512).method3601(this.field3465);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class215 var10 = new class215(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3468[var11] < Statics.field2316[var11].length) {
                var10.method3817(Statics.field3458[var11], Statics.field2316[var11][this.field3468[var11]]);
            }
            if (this.field3468[var11] < Statics.field1496[var11].length) {
                var10.method3817(Statics.field1530[var11], Statics.field1496[var11][this.field3468[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("lc.ar(I)I")
    public int method5243() {
        return this.field3466 == -1 ? (this.field3463[11] << 5) + (this.field3463[8] << 10) + (this.field3463[0] << 15) + (this.field3468[0] << 25) + (this.field3468[4] << 20) + this.field3463[1] : 305419896 + class193.method3331(this.field3466).field2026;
    }
}
